// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.model;


public class DocumentProperties
{

	public DocumentProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public String getHtmlContent()
	{
		return htmlContent;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String htmlContent>
	//    2    4:areturn         
	}

	public String getHtmlDocument()
	{
		return htmlDocument;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String htmlDocument>
	//    2    4:areturn         
	}

	public String getInvestigatorLongDescription()
	{
		return investigatorLongDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String investigatorLongDescription>
	//    2    4:areturn         
	}

	public String getInvestigatorShortDescription()
	{
		return investigatorShortDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String investigatorShortDescription>
	//    2    4:areturn         
	}

	public boolean requiresBirthdate()
	{
		return requiresBirthdate;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean requiresBirthdate>
	//    2    4:ireturn         
	}

	public boolean requiresName()
	{
		return requiresName;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean requiresName>
	//    2    4:ireturn         
	}

	public boolean requiresSignature()
	{
		return requiresSignature;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean requiresSignature>
	//    2    4:ireturn         
	}

	public void setHtmlContent(String s)
	{
		htmlContent = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String htmlContent>
	//    3    5:return          
	}

	public void setHtmlDocument(String s)
	{
		htmlDocument = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String htmlDocument>
	//    3    5:return          
	}

	public void setInvestigatorLongDescription(String s)
	{
		investigatorLongDescription = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String investigatorLongDescription>
	//    3    5:return          
	}

	public void setInvestigatorShortDescription(String s)
	{
		investigatorShortDescription = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String investigatorShortDescription>
	//    3    5:return          
	}

	public void setRequiresBirthdate(boolean flag)
	{
		requiresBirthdate = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean requiresBirthdate>
	//    3    5:return          
	}

	public void setRequiresName(boolean flag)
	{
		requiresName = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean requiresName>
	//    3    5:return          
	}

	public void setRequiresSignature(boolean flag)
	{
		requiresSignature = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean requiresSignature>
	//    3    5:return          
	}

	private String htmlContent;
	private String htmlDocument;
	private String investigatorLongDescription;
	private String investigatorShortDescription;
	private boolean requiresBirthdate;
	private boolean requiresName;
	private boolean requiresSignature;
}
