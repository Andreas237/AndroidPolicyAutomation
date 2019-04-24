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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(abyte0.length == abyte1.length) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:arraylength     
	//    4    5:aload_2         
	//    5    6:arraylength     
	//    6    7:icmpeq          18
_L1:
		int i = abyte0.length - abyte1.length;
	//    7   10:aload_1         
	//    8   11:arraylength     
	//    9   12:aload_2         
	//   10   13:arraylength     
	//   11   14:isub            
	//   12   15:istore_3        
_L4:
		return i;
	//   13   16:iload_3         
	//   14   17:ireturn         
_L2:
		int j = 0;
	//   15   18:iconst_0        
	//   16   19:istore          4
		do
		{
			i = ((int) (flag));
	//   17   21:iload           5
	//   18   23:istore_3        
			if(j >= abyte0.length)
				continue;
	//   19   24:iload           4
	//   20   26:aload_1         
	//   21   27:arraylength     
	//   22   28:icmpge          16
			if(abyte0[j] != abyte1[j])
	//*  23   31:aload_1         
	//*  24   32:iload           4
	//*  25   34:baload          
	//*  26   35:aload_2         
	//*  27   36:iload           4
	//*  28   38:baload          
	//*  29   39:icmpeq          52
				return abyte0[j] - abyte1[j];
	//   30   42:aload_1         
	//   31   43:iload           4
	//   32   45:baload          
	//   33   46:aload_2         
	//   34   47:iload           4
	//   35   49:baload          
	//   36   50:isub            
	//   37   51:ireturn         
			j++;
	//   38   52:iload           4
	//   39   54:iconst_1        
	//   40   55:iadd            
	//   41   56:istore          4
		} while(true);
	//   42   58:goto            21
		if(true) goto _L4; else goto _L3
_L3:
	}

	FontsContractCompat$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
