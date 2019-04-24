// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			AcroFields, IntHashtable

private static class AcroFields$InstHit
{

	public boolean isHit(int i)
	{
		if(hits == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field IntHashtable hits>
	//*   2    4:ifnonnull       9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return hits.containsKey(i);
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field IntHashtable hits>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #29  <Method boolean IntHashtable.containsKey(int)>
	//    9   17:ireturn         
	}

	IntHashtable hits;

	public AcroFields$InstHit(int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		if(ai != null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
	//*   4    8:return          
		{
			hits = new IntHashtable();
	//    5    9:aload_0         
	//    6   10:new             #16  <Class IntHashtable>
	//    7   13:dup             
	//    8   14:invokespecial   #17  <Method void IntHashtable()>
	//    9   17:putfield        #19  <Field IntHashtable hits>
			int i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
			while(i < ai.length) 
	//*  12   22:iload_2         
	//*  13   23:aload_1         
	//*  14   24:arraylength     
	//*  15   25:icmpge          8
			{
				hits.put(ai[i], 1);
	//   16   28:aload_0         
	//   17   29:getfield        #19  <Field IntHashtable hits>
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:iaload          
	//   21   35:iconst_1        
	//   22   36:invokevirtual   #23  <Method int IntHashtable.put(int, int)>
	//   23   39:pop             
				i++;
	//   24   40:iload_2         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore_2        
			}
		}
	//*  28   44:goto            22
	}
}
