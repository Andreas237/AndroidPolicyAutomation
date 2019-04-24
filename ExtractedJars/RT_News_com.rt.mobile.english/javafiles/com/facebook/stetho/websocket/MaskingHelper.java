// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;


class MaskingHelper
{

	MaskingHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void unmask(byte abyte0[], byte abyte1[], int i, int j)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int k = i;
	//    2    3:iload_2         
	//    3    4:istore          4
		for(i = ((int) (flag)); j > 0; i++)
	//*   4    6:iload           5
	//*   5    8:istore_2        
	//*   6    9:iload_3         
	//*   7   10:ifle            50
		{
			byte byte0 = abyte1[k];
	//    8   13:aload_1         
	//    9   14:iload           4
	//   10   16:baload          
	//   11   17:istore          5
			abyte1[k] = (byte)(abyte0[i % abyte0.length] ^ byte0);
	//   12   19:aload_1         
	//   13   20:iload           4
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:aload_0         
	//   17   25:arraylength     
	//   18   26:irem            
	//   19   27:baload          
	//   20   28:iload           5
	//   21   30:ixor            
	//   22   31:int2byte        
	//   23   32:bastore         
			k++;
	//   24   33:iload           4
	//   25   35:iconst_1        
	//   26   36:iadd            
	//   27   37:istore          4
			j--;
	//   28   39:iload_3         
	//   29   40:iconst_1        
	//   30   41:isub            
	//   31   42:istore_3        
		}

	//   32   43:iload_2         
	//   33   44:iconst_1        
	//   34   45:iadd            
	//   35   46:istore_2        
	//*  36   47:goto            9
	//   37   50:return          
	}
}
