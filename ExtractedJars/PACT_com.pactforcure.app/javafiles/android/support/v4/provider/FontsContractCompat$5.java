// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import java.util.Comparator;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

static final class FontsContractCompat$5
	implements Comparator
{

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((byte[])obj, (byte[])obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class byte[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class byte[]>
	//    5    9:invokevirtual   #21  <Method int compare(byte[], byte[])>
	//    6   12:ireturn         
	}

	public int compare(byte abyte0[], byte abyte1[])
	{
		if(abyte0.length != abyte1.length)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_2         
	//*   3    3:arraylength     
	//*   4    4:icmpeq          13
			return abyte0.length - abyte1.length;
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:aload_2         
	//    8   10:arraylength     
	//    9   11:isub            
	//   10   12:ireturn         
		for(int i = 0; i < abyte0.length; i++)
	//*  11   13:iconst_0        
	//*  12   14:istore_3        
	//*  13   15:iload_3         
	//*  14   16:aload_1         
	//*  15   17:arraylength     
	//*  16   18:icmpge          45
			if(abyte0[i] != abyte1[i])
	//*  17   21:aload_1         
	//*  18   22:iload_3         
	//*  19   23:baload          
	//*  20   24:aload_2         
	//*  21   25:iload_3         
	//*  22   26:baload          
	//*  23   27:icmpeq          38
				return abyte0[i] - abyte1[i];
	//   24   30:aload_1         
	//   25   31:iload_3         
	//   26   32:baload          
	//   27   33:aload_2         
	//   28   34:iload_3         
	//   29   35:baload          
	//   30   36:isub            
	//   31   37:ireturn         

	//   32   38:iload_3         
	//   33   39:iconst_1        
	//   34   40:iadd            
	//   35   41:istore_3        
	//*  36   42:goto            15
		return 0;
	//   37   45:iconst_0        
	//   38   46:ireturn         
	}

	FontsContractCompat$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
