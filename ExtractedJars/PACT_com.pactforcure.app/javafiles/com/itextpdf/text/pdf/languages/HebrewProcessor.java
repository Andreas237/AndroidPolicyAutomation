// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;

import com.itextpdf.text.pdf.BidiLine;

// Referenced classes of package com.itextpdf.text.pdf.languages:
//			LanguageProcessor

public class HebrewProcessor
	implements LanguageProcessor
{

	public HebrewProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		runDirection = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #14  <Field int runDirection>
	//    5    9:return          
	}

	public HebrewProcessor(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		runDirection = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #14  <Field int runDirection>
		runDirection = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #14  <Field int runDirection>
	//    8   14:return          
	}

	public boolean isRTL()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String process(String s)
	{
		return BidiLine.processLTR(s, runDirection, 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field int runDirection>
	//    3    5:iconst_0        
	//    4    6:invokestatic    #26  <Method String BidiLine.processLTR(String, int, int)>
	//    5    9:areturn         
	}

	protected int runDirection;
}
