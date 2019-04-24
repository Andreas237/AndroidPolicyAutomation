// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static final class CFFFont$StringItem extends CFFFont.Item
{

	public void emit(byte abyte0[])
	{
		for(int i = 0; i < s.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #16  <Field String s>
	//*   5    7:invokevirtual   #25  <Method int String.length()>
	//*   6   10:icmpge          41
			abyte0[myOffset + i] = (byte)(s.charAt(i) & 0xff);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int myOffset>
	//   10   18:iload_2         
	//   11   19:iadd            
	//   12   20:aload_0         
	//   13   21:getfield        #16  <Field String s>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #33  <Method char String.charAt(int)>
	//   16   28:sipush          255
	//   17   31:iand            
	//   18   32:int2byte        
	//   19   33:bastore         

	//   20   34:iload_2         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_2        
	//*  24   38:goto            2
	//   25   41:return          
	}

	public void increment(int ai[])
	{
		super.increment(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void CFFFont$Item.increment(int[])>
		ai[0] = ai[0] + s.length();
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iaload          
	//    8   10:aload_0         
	//    9   11:getfield        #16  <Field String s>
	//   10   14:invokevirtual   #25  <Method int String.length()>
	//   11   17:iadd            
	//   12   18:iastore         
	//   13   19:return          
	}

	public String s;

	public CFFFont$StringItem(String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
		s = s1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String s>
	//    5    9:return          
	}
}
