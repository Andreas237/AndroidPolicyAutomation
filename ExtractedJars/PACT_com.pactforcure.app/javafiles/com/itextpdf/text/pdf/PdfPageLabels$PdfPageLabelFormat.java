// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPageLabels

public static class PdfPageLabels$PdfPageLabelFormat
{

	public String toString()
	{
		return String.format("Physical page %s: style: %s; prefix '%s'; logical page: %s", new Object[] {
			Integer.valueOf(physicalPage), Integer.valueOf(numberStyle), prefix, Integer.valueOf(logicalPage)
		});
	//    0    0:ldc1            #31  <String "Physical page %s: style: %s; prefix '%s'; logical page: %s">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #20  <Field int physicalPage>
	//    7   12:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #22  <Field int numberStyle>
	//   13   22:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:aload_0         
	//   18   29:getfield        #24  <Field String prefix>
	//   19   32:aastore         
	//   20   33:dup             
	//   21   34:iconst_3        
	//   22   35:aload_0         
	//   23   36:getfield        #26  <Field int logicalPage>
	//   24   39:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   25   42:aastore         
	//   26   43:invokestatic    #43  <Method String String.format(String, Object[])>
	//   27   46:areturn         
	}

	public int logicalPage;
	public int numberStyle;
	public int physicalPage;
	public String prefix;

	public PdfPageLabels$PdfPageLabelFormat(int i, int j, String s, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		physicalPage = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int physicalPage>
		numberStyle = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int numberStyle>
		prefix = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field String prefix>
		logicalPage = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field int logicalPage>
	//   14   25:return          
	}
}
