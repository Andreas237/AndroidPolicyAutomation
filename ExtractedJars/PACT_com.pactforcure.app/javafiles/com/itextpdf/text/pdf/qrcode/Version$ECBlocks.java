// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			Version

public static final class Version$ECBlocks
{

	public Version.ECB[] getECBlocks()
	{
		return ecBlocks;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Version$ECB[] ecBlocks>
	//    2    4:areturn         
	}

	public int getECCodewordsPerBlock()
	{
		return ecCodewordsPerBlock;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int ecCodewordsPerBlock>
	//    2    4:ireturn         
	}

	public int getNumBlocks()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int i = 0; i < ecBlocks.length; i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #22  <Field Version$ECB[] ecBlocks>
	//*   7    9:arraylength     
	//*   8   10:icmpge          32
			j += ecBlocks[i].getCount();
	//    9   13:iload_2         
	//   10   14:aload_0         
	//   11   15:getfield        #22  <Field Version$ECB[] ecBlocks>
	//   12   18:iload_1         
	//   13   19:aaload          
	//   14   20:invokevirtual   #32  <Method int Version$ECB.getCount()>
	//   15   23:iadd            
	//   16   24:istore_2        

	//   17   25:iload_1         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_1        
	//*  21   29:goto            4
		return j;
	//   22   32:iload_2         
	//   23   33:ireturn         
	}

	public int getTotalECCodewords()
	{
		return ecCodewordsPerBlock * getNumBlocks();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int ecCodewordsPerBlock>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #35  <Method int getNumBlocks()>
	//    4    8:imul            
	//    5    9:ireturn         
	}

	private final Version.ECB ecBlocks[];
	private final int ecCodewordsPerBlock;

	Version$ECBlocks(int i, Version.ECB ecb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		ecCodewordsPerBlock = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int ecCodewordsPerBlock>
		ecBlocks = (new Version.ECB[] {
			ecb
		});
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:anewarray       Version.ECB[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_2         
	//   11   17:aastore         
	//   12   18:putfield        #22  <Field Version$ECB[] ecBlocks>
	//   13   21:return          
	}

	Version$ECBlocks(int i, Version.ECB ecb, Version.ECB ecb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		ecCodewordsPerBlock = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int ecCodewordsPerBlock>
		ecBlocks = (new Version.ECB[] {
			ecb, ecb1
		});
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:anewarray       Version.ECB[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_2         
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_1        
	//   14   20:aload_3         
	//   15   21:aastore         
	//   16   22:putfield        #22  <Field Version$ECB[] ecBlocks>
	//   17   25:return          
	}
}
