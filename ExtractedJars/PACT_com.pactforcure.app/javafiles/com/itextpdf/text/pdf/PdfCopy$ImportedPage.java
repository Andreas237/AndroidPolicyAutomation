// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfCopy, PdfArray, PdfIndirectReference, PdfReader

protected static class PdfCopy$ImportedPage
{

	public boolean equals(Object obj)
	{
		if(obj instanceof PdfCopy$ImportedPage)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class PdfCopy$ImportedPage>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:checkcast       #2   <Class PdfCopy$ImportedPage>
	//*   7   13:astore_1        
			if(pageNumber == ((PdfCopy$ImportedPage) (obj = ((Object) ((PdfCopy$ImportedPage)obj)))).pageNumber && ((Object) (reader)).equals(((Object) (((PdfCopy$ImportedPage) (obj)).reader))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #22  <Field int pageNumber>
	//*  10   18:aload_1         
	//*  11   19:getfield        #22  <Field int pageNumber>
	//*  12   22:icmpne          7
	//*  13   25:aload_0         
	//*  14   26:getfield        #24  <Field PdfReader reader>
	//*  15   29:aload_1         
	//*  16   30:getfield        #24  <Field PdfReader reader>
	//*  17   33:invokevirtual   #34  <Method boolean Object.equals(Object)>
	//*  18   36:ifeq            7
				return true;
	//   19   39:iconst_1        
	//   20   40:ireturn         
		return false;
	}

	public String toString()
	{
		return Integer.toString(pageNumber);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int pageNumber>
	//    2    4:invokestatic    #41  <Method String Integer.toString(int)>
	//    3    7:areturn         
	}

	PdfIndirectReference annotsIndirectReference;
	PdfArray mergedFields;
	int pageNumber;
	PdfReader reader;

	PdfCopy$ImportedPage(PdfReader pdfreader, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		pageNumber = i;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #22  <Field int pageNumber>
		reader = pdfreader;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field PdfReader reader>
		if(flag)
	//*   8   14:iload_3         
	//*   9   15:ifeq            29
			mergedFields = new PdfArray();
	//   10   18:aload_0         
	//   11   19:new             #26  <Class PdfArray>
	//   12   22:dup             
	//   13   23:invokespecial   #27  <Method void PdfArray()>
	//   14   26:putfield        #29  <Field PdfArray mergedFields>
	//   15   29:return          
	}
}
