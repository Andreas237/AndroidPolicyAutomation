// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.AccessibleElementId;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfObject

public class PdfPTableBody
	implements IAccessibleElement
{

	public PdfPTableBody()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		id = new AccessibleElementId();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class AccessibleElementId>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void AccessibleElementId()>
	//    6   12:putfield        #25  <Field AccessibleElementId id>
		rows = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #27  <Field ArrayList rows>
		role = PdfName.TBODY;
	//   10   20:aload_0         
	//   11   21:getstatic       #32  <Field PdfName PdfName.TBODY>
	//   12   24:putfield        #34  <Field PdfName role>
		accessibleAttributes = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #36  <Field HashMap accessibleAttributes>
	//   16   32:return          
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #45  <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #47  <Class PdfObject>
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
	//    1    1:getfield        #36  <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public AccessibleElementId getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AccessibleElementId id>
	//    2    4:areturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PdfName role>
	//    2    4:areturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #41  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #60  <Method void HashMap()>
	//    7   15:putfield        #36  <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #36  <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #64  <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field PdfName role>
	//    3    5:return          
	}

	protected HashMap accessibleAttributes;
	protected AccessibleElementId id;
	protected PdfName role;
	protected ArrayList rows;
}
