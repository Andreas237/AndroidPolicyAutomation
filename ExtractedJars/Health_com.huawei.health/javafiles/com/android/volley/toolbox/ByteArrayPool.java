// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import java.util.*;

public class ByteArrayPool
{

	public ByteArrayPool(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mBuffersByLastUse = ((List) (new LinkedList()));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void LinkedList()>
	//    6   12:putfield        #31  <Field List mBuffersByLastUse>
		mBuffersBySize = ((List) (new ArrayList(64)));
	//    7   15:aload_0         
	//    8   16:new             #33  <Class ArrayList>
	//    9   19:dup             
	//   10   20:bipush          64
	//   11   22:invokespecial   #35  <Method void ArrayList(int)>
	//   12   25:putfield        #37  <Field List mBuffersBySize>
		mCurrentSize = 0;
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:putfield        #39  <Field int mCurrentSize>
		mSizeLimit = i;
	//   16   33:aload_0         
	//   17   34:iload_1         
	//   18   35:putfield        #41  <Field int mSizeLimit>
	//   19   38:return          
	}

	private void trim()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte0[];
		for(; mCurrentSize > mSizeLimit; mCurrentSize = mCurrentSize - abyte0.length)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field int mCurrentSize>
	//*   4    6:aload_0         
	//*   5    7:getfield        #41  <Field int mSizeLimit>
	//*   6   10:icmple          52
		{
			abyte0 = (byte[])mBuffersByLastUse.remove(0);
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field List mBuffersByLastUse>
	//    9   17:iconst_0        
	//   10   18:invokeinterface #48  <Method Object List.remove(int)>
	//   11   23:checkcast       #50  <Class byte[]>
	//   12   26:astore_1        
			mBuffersBySize.remove(((Object) (abyte0)));
	//   13   27:aload_0         
	//   14   28:getfield        #37  <Field List mBuffersBySize>
	//   15   31:aload_1         
	//   16   32:invokeinterface #53  <Method boolean List.remove(Object)>
	//   17   37:pop             
		}

	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #39  <Field int mCurrentSize>
	//   21   43:aload_1         
	//   22   44:arraylength     
	//   23   45:isub            
	//   24   46:putfield        #39  <Field int mCurrentSize>
	//*  25   49:goto            2
		this;
	//   26   52:aload_0         
		JVM INSTR monitorexit ;
	//   27   53:monitorexit     
		return;
	//   28   54:return          
		Exception exception;
		exception;
	//   29   55:astore_1        
	//*  30   56:aload_0         
		throw exception;
	//   31   57:monitorexit     
	//   32   58:aload_1         
	//   33   59:athrow          
	}

	public byte[] getBuf(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
_L2:
		byte abyte0[];
		if(j >= mBuffersBySize.size())
			break MISSING_BLOCK_LABEL_74;
	//    4    4:iload_2         
	//    5    5:aload_0         
	//    6    6:getfield        #37  <Field List mBuffersBySize>
	//    7    9:invokeinterface #59  <Method int List.size()>
	//    8   14:icmpge          74
		abyte0 = (byte[])mBuffersBySize.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #37  <Field List mBuffersBySize>
	//   11   21:iload_2         
	//   12   22:invokeinterface #62  <Method Object List.get(int)>
	//   13   27:checkcast       #50  <Class byte[]>
	//   14   30:astore_3        
		if(abyte0.length < i)
			break MISSING_BLOCK_LABEL_87;
	//   15   31:aload_3         
	//   16   32:arraylength     
	//   17   33:iload_1         
	//   18   34:icmplt          87
		mCurrentSize = mCurrentSize - abyte0.length;
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #39  <Field int mCurrentSize>
	//   22   42:aload_3         
	//   23   43:arraylength     
	//   24   44:isub            
	//   25   45:putfield        #39  <Field int mCurrentSize>
		mBuffersBySize.remove(j);
	//   26   48:aload_0         
	//   27   49:getfield        #37  <Field List mBuffersBySize>
	//   28   52:iload_2         
	//   29   53:invokeinterface #48  <Method Object List.remove(int)>
	//   30   58:pop             
		mBuffersByLastUse.remove(((Object) (abyte0)));
	//   31   59:aload_0         
	//   32   60:getfield        #31  <Field List mBuffersByLastUse>
	//   33   63:aload_3         
	//   34   64:invokeinterface #53  <Method boolean List.remove(Object)>
	//   35   69:pop             
		this;
	//   36   70:aload_0         
		JVM INSTR monitorexit ;
	//   37   71:monitorexit     
		return abyte0;
	//   38   72:aload_3         
	//   39   73:areturn         
		abyte0 = new byte[i];
	//   40   74:iload_1         
	//   41   75:newarray        byte[]
	//   42   77:astore_3        
		this;
	//   43   78:aload_0         
		JVM INSTR monitorexit ;
	//   44   79:monitorexit     
		return abyte0;
	//   45   80:aload_3         
	//   46   81:areturn         
		Exception exception;
		exception;
	//   47   82:astore_3        
	//*  48   83:aload_0         
		throw exception;
	//   49   84:monitorexit     
	//   50   85:aload_3         
	//   51   86:athrow          
		j++;
	//   52   87:iload_2         
	//   53   88:iconst_1        
	//   54   89:iadd            
	//   55   90:istore_2        
		if(true) goto _L2; else goto _L1
	//   56   91:goto            4
_L1:
	}

	public void returnBuf(byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_15;
	//    2    2:aload_1         
	//    3    3:ifnull          15
		if(abyte0.length <= mSizeLimit)
			break MISSING_BLOCK_LABEL_18;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:aload_0         
	//    7    9:getfield        #41  <Field int mSizeLimit>
	//    8   12:icmple          18
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		int j;
		mBuffersByLastUse.add(((Object) (abyte0)));
	//   12   18:aload_0         
	//   13   19:getfield        #31  <Field List mBuffersByLastUse>
	//   14   22:aload_1         
	//   15   23:invokeinterface #67  <Method boolean List.add(Object)>
	//   16   28:pop             
		j = Collections.binarySearch(mBuffersBySize, ((Object) (abyte0)), BUF_COMPARATOR);
	//   17   29:aload_0         
	//   18   30:getfield        #37  <Field List mBuffersBySize>
	//   19   33:aload_1         
	//   20   34:getstatic       #23  <Field Comparator BUF_COMPARATOR>
	//   21   37:invokestatic    #73  <Method int Collections.binarySearch(List, Object, Comparator)>
	//   22   40:istore_3        
		int i;
		i = j;
	//   23   41:iload_3         
	//   24   42:istore_2        
		if(j < 0)
	//*  25   43:iload_3         
	//*  26   44:ifge            52
			i = -j - 1;
	//   27   47:iload_3         
	//   28   48:ineg            
	//   29   49:iconst_1        
	//   30   50:isub            
	//   31   51:istore_2        
		mBuffersBySize.add(i, ((Object) (abyte0)));
	//   32   52:aload_0         
	//   33   53:getfield        #37  <Field List mBuffersBySize>
	//   34   56:iload_2         
	//   35   57:aload_1         
	//   36   58:invokeinterface #76  <Method void List.add(int, Object)>
		mCurrentSize = mCurrentSize + abyte0.length;
	//   37   63:aload_0         
	//   38   64:aload_0         
	//   39   65:getfield        #39  <Field int mCurrentSize>
	//   40   68:aload_1         
	//   41   69:arraylength     
	//   42   70:iadd            
	//   43   71:putfield        #39  <Field int mCurrentSize>
		trim();
	//   44   74:aload_0         
	//   45   75:invokespecial   #78  <Method void trim()>
		this;
	//   46   78:aload_0         
		JVM INSTR monitorexit ;
	//   47   79:monitorexit     
		return;
	//   48   80:return          
		abyte0;
	//   49   81:astore_1        
	//*  50   82:aload_0         
		throw abyte0;
	//   51   83:monitorexit     
	//   52   84:aload_1         
	//   53   85:athrow          
	}

	protected static final Comparator BUF_COMPARATOR = new Comparator() {

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
			return abyte0.length - abyte1.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:aload_2         
		//    3    3:arraylength     
		//    4    4:isub            
		//    5    5:ireturn         
		}

	}
;
	private List mBuffersByLastUse;
	private List mBuffersBySize;
	private int mCurrentSize;
	private final int mSizeLimit;

	static 
	{
	//    0    0:new             #6   <Class ByteArrayPool$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ByteArrayPool$1()>
	//    3    7:putstatic       #23  <Field Comparator BUF_COMPARATOR>
	//*   4   10:return          
	}
}
