// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAwareBase;

// Referenced classes of package ch.qos.logback.core:
//			Layout, Context

public abstract class LayoutBase extends ContextAwareBase
	implements Layout
{

	public LayoutBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	public String getContentType()
	{
		return "text/plain";
	//    0    0:ldc1            #23  <String "text/plain">
	//    1    2:areturn         
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Context context>
	//    2    4:areturn         
	}

	public String getFileFooter()
	{
		return fileFooter;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String fileFooter>
	//    2    4:areturn         
	}

	public String getFileHeader()
	{
		return fileHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String fileHeader>
	//    2    4:areturn         
	}

	public String getPresentationFooter()
	{
		return presentationFooter;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String presentationFooter>
	//    2    4:areturn         
	}

	public String getPresentationHeader()
	{
		return presentationHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String presentationHeader>
	//    2    4:areturn         
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean started>
	//    2    4:ireturn         
	}

	public void setContext(Context context)
	{
		this.context = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field Context context>
	//    3    5:return          
	}

	public void setFileFooter(String s)
	{
		fileFooter = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String fileFooter>
	//    3    5:return          
	}

	public void setFileHeader(String s)
	{
		fileHeader = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String fileHeader>
	//    3    5:return          
	}

	public void setPresentationFooter(String s)
	{
		presentationFooter = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String presentationFooter>
	//    3    5:return          
	}

	public void setPresentationHeader(String s)
	{
		presentationHeader = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String presentationHeader>
	//    3    5:return          
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #45  <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #45  <Field boolean started>
	//    3    5:return          
	}

	String fileFooter;
	String fileHeader;
	String presentationFooter;
	String presentationHeader;
	protected boolean started;
}
