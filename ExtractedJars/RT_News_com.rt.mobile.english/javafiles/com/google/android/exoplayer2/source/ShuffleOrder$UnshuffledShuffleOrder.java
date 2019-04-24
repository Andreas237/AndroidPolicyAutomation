// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			ShuffleOrder

public static final class ShuffleOrder$UnshuffledShuffleOrder
	implements ShuffleOrder
{

	public ShuffleOrder cloneAndClear()
	{
		return ((ShuffleOrder) (new ShuffleOrder$UnshuffledShuffleOrder(0)));
	//    0    0:new             #2   <Class ShuffleOrder$UnshuffledShuffleOrder>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #21  <Method void ShuffleOrder$UnshuffledShuffleOrder(int)>
	//    4    8:areturn         
	}

	public ShuffleOrder cloneAndInsert(int i, int j)
	{
		return ((ShuffleOrder) (new ShuffleOrder$UnshuffledShuffleOrder(length + j)));
	//    0    0:new             #2   <Class ShuffleOrder$UnshuffledShuffleOrder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field int length>
	//    4    8:iload_2         
	//    5    9:iadd            
	//    6   10:invokespecial   #21  <Method void ShuffleOrder$UnshuffledShuffleOrder(int)>
	//    7   13:areturn         
	}

	public ShuffleOrder cloneAndRemove(int i)
	{
		return ((ShuffleOrder) (new ShuffleOrder$UnshuffledShuffleOrder(length - 1)));
	//    0    0:new             #2   <Class ShuffleOrder$UnshuffledShuffleOrder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field int length>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:invokespecial   #21  <Method void ShuffleOrder$UnshuffledShuffleOrder(int)>
	//    7   13:areturn         
	}

	public int getFirstIndex()
	{
		return length <= 0 ? -1 : 0;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int length>
	//    2    4:ifle            9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_m1       
	//    6   10:ireturn         
	}

	public int getLastIndex()
	{
		if(length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field int length>
	//*   2    4:ifle            14
			return length - 1;
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field int length>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:ireturn         
		else
			return -1;
	//    8   14:iconst_m1       
	//    9   15:ireturn         
	}

	public int getLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int length>
	//    2    4:ireturn         
	}

	public int getNextIndex(int i)
	{
		i++;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore_1        
		if(i < length)
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #16  <Field int length>
	//*   7    9:icmpge          14
			return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
		else
			return -1;
	//   10   14:iconst_m1       
	//   11   15:ireturn         
	}

	public int getPreviousIndex(int i)
	{
		i--;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:istore_1        
		if(i >= 0)
	//*   4    4:iload_1         
	//*   5    5:iflt            10
			return i;
	//    6    8:iload_1         
	//    7    9:ireturn         
		else
			return -1;
	//    8   10:iconst_m1       
	//    9   11:ireturn         
	}

	private final int length;

	public ShuffleOrder$UnshuffledShuffleOrder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		length = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int length>
	//    5    9:return          
	}
}
