// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text:
//			AccessibleElementId, ListItem

public class ListBody
	implements IAccessibleElement
{

	protected ListBody(ListItem listitem)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		role = PdfName.LBODY;
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field PdfName PdfName.LBODY>
	//    4    8:putfield        #27  <Field PdfName role>
		id = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #29  <Field AccessibleElementId id>
		accessibleAttributes = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #31  <Field HashMap accessibleAttributes>
		parentItem = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #33  <Field ListItem parentItem>
		parentItem = listitem;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #33  <Field ListItem parentItem>
	//   17   31:return          
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #44  <Class PdfObject>
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
	//    1    1:getfield        #31  <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public AccessibleElementId getId()
	{
		if(id == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field AccessibleElementId id>
	//*   2    4:ifnonnull       18
			id = new AccessibleElementId();
	//    3    7:aload_0         
	//    4    8:new             #52  <Class AccessibleElementId>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void AccessibleElementId()>
	//    7   15:putfield        #29  <Field AccessibleElementId id>
		return id;
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field AccessibleElementId id>
	//   10   22:areturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field PdfName role>
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
	//*   1    1:getfield        #31  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #38  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #60  <Method void HashMap()>
	//    7   15:putfield        #31  <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #31  <Field HashMap accessibleAttributes>
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
	//    2    2:putfield        #29  <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field PdfName role>
	//    3    5:return          
	}

	protected HashMap accessibleAttributes;
	private AccessibleElementId id;
	protected ListItem parentItem;
	protected PdfName role;
}
