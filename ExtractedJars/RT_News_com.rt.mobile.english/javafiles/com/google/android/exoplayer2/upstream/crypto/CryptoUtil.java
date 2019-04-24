// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.crypto;


final class CryptoUtil
{

	private CryptoUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static long getFNV64Hash(String s)
	{
		long l = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_2        
		if(s == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return 0L;
	//    4    6:lconst_0        
	//    5    7:lreturn         
		for(int i = 0; i < s.length(); i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:aload_0         
	//*  10   12:invokevirtual   #17  <Method int String.length()>
	//*  11   15:icmpge          63
		{
			l ^= s.charAt(i);
	//   12   18:lload_2         
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:invokevirtual   #21  <Method char String.charAt(int)>
	//   16   24:i2l             
	//   17   25:lxor            
	//   18   26:lstore_2        
			l += (l << 1) + (l << 4) + (l << 5) + (l << 7) + (l << 8) + (l << 40);
	//   19   27:lload_2         
	//   20   28:lload_2         
	//   21   29:iconst_1        
	//   22   30:lshl            
	//   23   31:lload_2         
	//   24   32:iconst_4        
	//   25   33:lshl            
	//   26   34:ladd            
	//   27   35:lload_2         
	//   28   36:iconst_5        
	//   29   37:lshl            
	//   30   38:ladd            
	//   31   39:lload_2         
	//   32   40:bipush          7
	//   33   42:lshl            
	//   34   43:ladd            
	//   35   44:lload_2         
	//   36   45:bipush          8
	//   37   47:lshl            
	//   38   48:ladd            
	//   39   49:lload_2         
	//   40   50:bipush          40
	//   41   52:lshl            
	//   42   53:ladd            
	//   43   54:ladd            
	//   44   55:lstore_2        
		}

	//   45   56:iload_1         
	//   46   57:iconst_1        
	//   47   58:iadd            
	//   48   59:istore_1        
	//*  49   60:goto            10
		return l;
	//   50   63:lload_2         
	//   51   64:lreturn         
	}
}
