// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PRIndirectReference, PdfIndirectReference

public class RefKey
{

	RefKey(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		num = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #14  <Field int num>
		gen = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #16  <Field int gen>
	//    8   14:return          
	}

	RefKey(PRIndirectReference prindirectreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		num = prindirectreference.getNumber();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method int PRIndirectReference.getNumber()>
	//    5    9:putfield        #14  <Field int num>
		gen = prindirectreference.getGeneration();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #27  <Method int PRIndirectReference.getGeneration()>
	//    9   17:putfield        #16  <Field int gen>
	//   10   20:return          
	}

	public RefKey(PdfIndirectReference pdfindirectreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		num = pdfindirectreference.getNumber();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method int PdfIndirectReference.getNumber()>
	//    5    9:putfield        #14  <Field int num>
		gen = pdfindirectreference.getGeneration();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #32  <Method int PdfIndirectReference.getGeneration()>
	//    9   17:putfield        #16  <Field int gen>
	//   10   20:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof RefKey)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class RefKey>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:checkcast       #2   <Class RefKey>
	//*   7   13:astore_1        
			if(gen == ((RefKey) (obj = ((Object) ((RefKey)obj)))).gen && num == ((RefKey) (obj)).num)
	//*   8   14:aload_0         
	//*   9   15:getfield        #16  <Field int gen>
	//*  10   18:aload_1         
	//*  11   19:getfield        #16  <Field int gen>
	//*  12   22:icmpne          7
	//*  13   25:aload_0         
	//*  14   26:getfield        #14  <Field int num>
	//*  15   29:aload_1         
	//*  16   30:getfield        #14  <Field int num>
	//*  17   33:icmpne          7
				return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		return false;
	}

	public int hashCode()
	{
		return (gen << 16) + num;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int gen>
	//    2    4:bipush          16
	//    3    6:ishl            
	//    4    7:aload_0         
	//    5    8:getfield        #14  <Field int num>
	//    6   11:iadd            
	//    7   12:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(Integer.toString(num)).append(' ').append(gen).toString();
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field int num>
	//    5   11:invokestatic    #45  <Method String Integer.toString(int)>
	//    6   14:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:bipush          32
	//    8   19:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//    9   22:aload_0         
	//   10   23:getfield        #16  <Field int gen>
	//   11   26:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
	//   12   29:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   13   32:areturn         
	}

	int gen;
	int num;
}
