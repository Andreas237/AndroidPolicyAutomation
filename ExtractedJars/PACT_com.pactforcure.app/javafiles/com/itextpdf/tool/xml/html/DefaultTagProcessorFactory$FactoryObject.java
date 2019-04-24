// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;


// Referenced classes of package com.itextpdf.tool.xml.html:
//			DefaultTagProcessorFactory, TagProcessor

protected final class DefaultTagProcessorFactory$FactoryObject
{

	public String getClassName()
	{
		return className;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String className>
	//    2    4:areturn         
	}

	public TagProcessor getProcessor()
	{
		if(proc == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field TagProcessor proc>
	//*   2    4:ifnonnull       22
			proc = load(className);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field DefaultTagProcessorFactory this$0>
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field String className>
	//    8   16:invokevirtual   #36  <Method TagProcessor DefaultTagProcessorFactory.load(String)>
	//    9   19:putfield        #28  <Field TagProcessor proc>
		return proc;
	//   10   22:aload_0         
	//   11   23:getfield        #28  <Field TagProcessor proc>
	//   12   26:areturn         
	}

	private final String className;
	private TagProcessor proc;
	final DefaultTagProcessorFactory this$0;

	public DefaultTagProcessorFactory$FactoryObject(String s)
	{
		this$0 = DefaultTagProcessorFactory.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DefaultTagProcessorFactory this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		className = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String className>
	//    8   14:return          
	}

	public DefaultTagProcessorFactory$FactoryObject(String s, TagProcessor tagprocessor)
	{
		this(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void DefaultTagProcessorFactory$FactoryObject(DefaultTagProcessorFactory, String)>
		proc = tagprocessor;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #28  <Field TagProcessor proc>
	//    7   11:return          
	}
}
