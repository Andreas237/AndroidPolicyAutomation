// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package org.researchstack.backbone.model:
//			ConsentSignature

public class ConsentDocument
	implements Serializable
{

	public ConsentDocument()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		signatures = ((List) (new ArrayList(1)));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #27  <Method void ArrayList(int)>
	//    7   13:putfield        #29  <Field List signatures>
	//    8   16:return          
	}

	public void addSignature(ConsentSignature consentsignature)
	{
		signatures.add(((Object) (consentsignature)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List signatures>
	//    2    4:aload_1         
	//    3    5:invokeinterface #38  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public String getHtmlReviewContent()
	{
		return htmlReviewContent;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String htmlReviewContent>
	//    2    4:areturn         
	}

	public List getSections()
	{
		return sections;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List sections>
	//    2    4:areturn         
	}

	public ConsentSignature getSignature(int i)
	{
		return (ConsentSignature)signatures.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List signatures>
	//    2    4:iload_1         
	//    3    5:invokeinterface #54  <Method Object List.get(int)>
	//    4   10:checkcast       #56  <Class ConsentSignature>
	//    5   13:areturn         
	}

	public int getSignaturePageTitle()
	{
		return signaturePageTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int signaturePageTitle>
	//    2    4:ireturn         
	}

	public void setHtmlReviewContent(String s)
	{
		htmlReviewContent = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String htmlReviewContent>
	//    3    5:return          
	}

	public void setSections(List list)
	{
		sections = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field List sections>
	//    3    5:return          
	}

	public void setSignaturePageContent(String s)
	{
		signaturePageContent = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String signaturePageContent>
	//    3    5:return          
	}

	public void setSignaturePageTitle(int i)
	{
		signaturePageTitle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field int signaturePageTitle>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field String title>
	//    3    5:return          
	}

	private String htmlReviewContent;
	private List sections;
	private String signaturePageContent;
	private int signaturePageTitle;
	private List signatures;
	private String title;
}
