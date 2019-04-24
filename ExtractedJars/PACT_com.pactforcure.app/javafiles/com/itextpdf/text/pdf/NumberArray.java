// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfArray, PdfNumber

public class NumberArray extends PdfArray
{

	public NumberArray(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void PdfArray()>
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); add(((PdfObject) ((PdfNumber)((Iterator) (list)).next()))));
	//    2    4:aload_1         
	//    3    5:invokeinterface #15  <Method Iterator List.iterator()>
	//    4   10:astore_1        
	//    5   11:aload_1         
	//    6   12:invokeinterface #21  <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            37
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokeinterface #25  <Method Object Iterator.next()>
	//   11   27:checkcast       #27  <Class PdfNumber>
	//   12   30:invokevirtual   #31  <Method boolean add(PdfObject)>
	//   13   33:pop             
	//*  14   34:goto            11
	//   15   37:return          
	}

	public transient NumberArray(float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void PdfArray()>
		int j = af.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_3        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpge          36
			add(((PdfObject) (new PdfNumber(af[i]))));
	//   10   14:aload_0         
	//   11   15:new             #27  <Class PdfNumber>
	//   12   18:dup             
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:faload          
	//   16   22:invokespecial   #38  <Method void PdfNumber(float)>
	//   17   25:invokevirtual   #31  <Method boolean add(PdfObject)>
	//   18   28:pop             

	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_2        
	//*  23   33:goto            9
	//   24   36:return          
	}
}
