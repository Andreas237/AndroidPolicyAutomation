// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.Comparator;

// Referenced classes of package com.itextpdf.text.pdf:
//			AcroFields

private static class AcroFields$SorterComparator
	implements Comparator
{

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Object[])obj, (Object[])obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Object[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #21  <Class Object[]>
	//    5    9:invokevirtual   #24  <Method int compare(Object[], Object[])>
	//    6   12:ireturn         
	}

	public int compare(Object aobj[], Object aobj1[])
	{
		return ((int[])(int[])aobj[1])[0] - ((int[])(int[])aobj1[1])[0];
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aaload          
	//    3    3:checkcast       #26  <Class int[]>
	//    4    6:checkcast       #26  <Class int[]>
	//    5    9:iconst_0        
	//    6   10:iaload          
	//    7   11:aload_2         
	//    8   12:iconst_1        
	//    9   13:aaload          
	//   10   14:checkcast       #26  <Class int[]>
	//   11   17:checkcast       #26  <Class int[]>
	//   12   20:iconst_0        
	//   13   21:iaload          
	//   14   22:isub            
	//   15   23:ireturn         
	}

	private AcroFields$SorterComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	AcroFields$SorterComparator(AcroFields._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AcroFields$SorterComparator()>
	//    2    4:return          
	}
}
