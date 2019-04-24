// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			Allocator, Allocation

public final class DefaultAllocator
	implements Allocator
{

	public DefaultAllocator(boolean flag, int i)
	{
		this(flag, i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #25  <Method void DefaultAllocator(boolean, int, int)>
	//    5    7:return          
	}

	public DefaultAllocator(boolean flag, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		int k = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
		boolean flag1;
		if(i > 0)
	//*   4    7:iload_2         
	//*   5    8:ifle            17
			flag1 = true;
	//    6   11:iconst_1        
	//    7   12:istore          5
		else
	//*   8   14:goto            20
			flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          5
		Assertions.checkArgument(flag1);
	//   11   20:iload           5
	//   12   22:invokestatic    #35  <Method void Assertions.checkArgument(boolean)>
		if(j >= 0)
	//*  13   25:iload_3         
	//*  14   26:iflt            35
			flag1 = true;
	//   15   29:iconst_1        
	//   16   30:istore          5
		else
	//*  17   32:goto            38
			flag1 = false;
	//   18   35:iconst_0        
	//   19   36:istore          5
		Assertions.checkArgument(flag1);
	//   20   38:iload           5
	//   21   40:invokestatic    #35  <Method void Assertions.checkArgument(boolean)>
		trimOnReset = flag;
	//   22   43:aload_0         
	//   23   44:iload_1         
	//   24   45:putfield        #37  <Field boolean trimOnReset>
		individualAllocationSize = i;
	//   25   48:aload_0         
	//   26   49:iload_2         
	//   27   50:putfield        #39  <Field int individualAllocationSize>
		availableCount = j;
	//   28   53:aload_0         
	//   29   54:iload_3         
	//   30   55:putfield        #41  <Field int availableCount>
		availableAllocations = new Allocation[j + 100];
	//   31   58:aload_0         
	//   32   59:iload_3         
	//   33   60:bipush          100
	//   34   62:iadd            
	//   35   63:anewarray       Allocation[]
	//   36   66:putfield        #45  <Field Allocation[] availableAllocations>
		if(j > 0)
	//*  37   69:iload_3         
	//*  38   70:ifle            119
		{
			initialAllocationBlock = new byte[j * i];
	//   39   73:aload_0         
	//   40   74:iload_3         
	//   41   75:iload_2         
	//   42   76:imul            
	//   43   77:newarray        byte[]
	//   44   79:putfield        #47  <Field byte[] initialAllocationBlock>
			for(; k < j; k++)
	//*  45   82:iload           4
	//*  46   84:iload_3         
	//*  47   85:icmpge          124
				availableAllocations[k] = new Allocation(initialAllocationBlock, k * i);
	//   48   88:aload_0         
	//   49   89:getfield        #45  <Field Allocation[] availableAllocations>
	//   50   92:iload           4
	//   51   94:new             #43  <Class Allocation>
	//   52   97:dup             
	//   53   98:aload_0         
	//   54   99:getfield        #47  <Field byte[] initialAllocationBlock>
	//   55  102:iload           4
	//   56  104:iload_2         
	//   57  105:imul            
	//   58  106:invokespecial   #50  <Method void Allocation(byte[], int)>
	//   59  109:aastore         

	//   60  110:iload           4
	//   61  112:iconst_1        
	//   62  113:iadd            
	//   63  114:istore          4
		} else
	//*  64  116:goto            82
		{
			initialAllocationBlock = null;
	//   65  119:aload_0         
	//   66  120:aconst_null     
	//   67  121:putfield        #47  <Field byte[] initialAllocationBlock>
		}
		singleAllocationReleaseHolder = new Allocation[1];
	//   68  124:aload_0         
	//   69  125:iconst_1        
	//   70  126:anewarray       Allocation[]
	//   71  129:putfield        #52  <Field Allocation[] singleAllocationReleaseHolder>
	//   72  132:return          
	}

	public Allocation allocate()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		Allocation aallocation[];
		allocatedCount = allocatedCount + 1;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #56  <Field int allocatedCount>
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #56  <Field int allocatedCount>
		if(availableCount <= 0)
			break MISSING_BLOCK_LABEL_53;
	//    8   12:aload_0         
	//    9   13:getfield        #41  <Field int availableCount>
	//   10   16:ifle            53
		aallocation = availableAllocations;
	//   11   19:aload_0         
	//   12   20:getfield        #45  <Field Allocation[] availableAllocations>
	//   13   23:astore_2        
		i = availableCount - 1;
	//   14   24:aload_0         
	//   15   25:getfield        #41  <Field int availableCount>
	//   16   28:iconst_1        
	//   17   29:isub            
	//   18   30:istore_1        
		availableCount = i;
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:putfield        #41  <Field int availableCount>
		Allocation allocation = aallocation[i];
	//   22   36:aload_2         
	//   23   37:iload_1         
	//   24   38:aaload          
	//   25   39:astore_2        
		availableAllocations[availableCount] = null;
	//   26   40:aload_0         
	//   27   41:getfield        #45  <Field Allocation[] availableAllocations>
	//   28   44:aload_0         
	//   29   45:getfield        #41  <Field int availableCount>
	//   30   48:aconst_null     
	//   31   49:aastore         
		break MISSING_BLOCK_LABEL_68;
	//   32   50:goto            68
		allocation = new Allocation(new byte[individualAllocationSize], 0);
	//   33   53:new             #43  <Class Allocation>
	//   34   56:dup             
	//   35   57:aload_0         
	//   36   58:getfield        #39  <Field int individualAllocationSize>
	//   37   61:newarray        byte[]
	//   38   63:iconst_0        
	//   39   64:invokespecial   #50  <Method void Allocation(byte[], int)>
	//   40   67:astore_2        
		this;
	//   41   68:aload_0         
		JVM INSTR monitorexit ;
	//   42   69:monitorexit     
		return allocation;
	//   43   70:aload_2         
	//   44   71:areturn         
		Exception exception;
		exception;
	//   45   72:astore_2        
	//*  46   73:aload_0         
		throw exception;
	//   47   74:monitorexit     
	//   48   75:aload_2         
	//   49   76:athrow          
	}

	public int getIndividualAllocationLength()
	{
		return individualAllocationSize;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int individualAllocationSize>
	//    2    4:ireturn         
	}

	public int getTotalBytesAllocated()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		i = allocatedCount;
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field int allocatedCount>
	//    4    6:istore_1        
		j = individualAllocationSize;
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field int individualAllocationSize>
	//    7   11:istore_2        
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return i * j;
	//   10   14:iload_1         
	//   11   15:iload_2         
	//   12   16:imul            
	//   13   17:ireturn         
		Exception exception;
		exception;
	//   14   18:astore_3        
	//*  15   19:aload_0         
		throw exception;
	//   16   20:monitorexit     
	//   17   21:aload_3         
	//   18   22:athrow          
	}

	public void release(Allocation allocation)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		singleAllocationReleaseHolder[0] = allocation;
	//    2    2:aload_0         
	//    3    3:getfield        #52  <Field Allocation[] singleAllocationReleaseHolder>
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
		release(singleAllocationReleaseHolder);
	//    7    9:aload_0         
	//    8   10:aload_0         
	//    9   11:getfield        #52  <Field Allocation[] singleAllocationReleaseHolder>
	//   10   14:invokevirtual   #64  <Method void release(Allocation[])>
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		allocation;
	//   14   20:astore_1        
	//*  15   21:aload_0         
		throw allocation;
	//   16   22:monitorexit     
	//   17   23:aload_1         
	//   18   24:athrow          
	}

	public void release(Allocation aallocation[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		if(availableCount + aallocation.length >= availableAllocations.length)
	//*   2    2:aload_0         
	//*   3    3:getfield        #41  <Field int availableCount>
	//*   4    6:aload_1         
	//*   5    7:arraylength     
	//*   6    8:iadd            
	//*   7    9:aload_0         
	//*   8   10:getfield        #45  <Field Allocation[] availableAllocations>
	//*   9   13:arraylength     
	//*  10   14:icmplt          48
			availableAllocations = (Allocation[])Arrays.copyOf(((Object []) (availableAllocations)), Math.max(availableAllocations.length * 2, availableCount + aallocation.length));
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #45  <Field Allocation[] availableAllocations>
	//   14   22:aload_0         
	//   15   23:getfield        #45  <Field Allocation[] availableAllocations>
	//   16   26:arraylength     
	//   17   27:iconst_2        
	//   18   28:imul            
	//   19   29:aload_0         
	//   20   30:getfield        #41  <Field int availableCount>
	//   21   33:aload_1         
	//   22   34:arraylength     
	//   23   35:iadd            
	//   24   36:invokestatic    #70  <Method int Math.max(int, int)>
	//   25   39:invokestatic    #76  <Method Object[] Arrays.copyOf(Object[], int)>
	//   26   42:checkcast       #77  <Class Allocation[]>
	//   27   45:putfield        #45  <Field Allocation[] availableAllocations>
		j = aallocation.length;
	//   28   48:aload_1         
	//   29   49:arraylength     
	//   30   50:istore_3        
		int i = 0;
	//   31   51:iconst_0        
	//   32   52:istore_2        
_L2:
		Allocation allocation;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   33   53:iload_2         
	//   34   54:iload_3         
	//   35   55:icmpge          130
		allocation = aallocation[i];
	//   36   58:aload_1         
	//   37   59:iload_2         
	//   38   60:aaload          
	//   39   61:astore          6
		int k;
		boolean flag;
		Allocation aallocation1[];
		if(allocation.data != initialAllocationBlock && allocation.data.length != individualAllocationSize)
	//*  40   63:aload           6
	//*  41   65:getfield        #80  <Field byte[] Allocation.data>
	//*  42   68:aload_0         
	//*  43   69:getfield        #47  <Field byte[] initialAllocationBlock>
	//*  44   72:if_acmpeq       159
	//*  45   75:aload           6
	//*  46   77:getfield        #80  <Field byte[] Allocation.data>
	//*  47   80:arraylength     
	//*  48   81:aload_0         
	//*  49   82:getfield        #39  <Field int individualAllocationSize>
	//*  50   85:icmpne          153
	//*  51   88:goto            159
	//*  52   91:iload           5
	//*  53   93:invokestatic    #35  <Method void Assertions.checkArgument(boolean)>
	//*  54   96:aload_0         
	//*  55   97:getfield        #45  <Field Allocation[] availableAllocations>
	//*  56  100:astore          7
	//*  57  102:aload_0         
	//*  58  103:getfield        #41  <Field int availableCount>
	//*  59  106:istore          4
	//*  60  108:aload_0         
	//*  61  109:iload           4
	//*  62  111:iconst_1        
	//*  63  112:iadd            
	//*  64  113:putfield        #41  <Field int availableCount>
	//*  65  116:aload           7
	//*  66  118:iload           4
	//*  67  120:aload           6
	//*  68  122:aastore         
	//*  69  123:iload_2         
	//*  70  124:iconst_1        
	//*  71  125:iadd            
	//*  72  126:istore_2        
	//*  73  127:goto            53
	//*  74  130:aload_0         
	//*  75  131:aload_0         
	//*  76  132:getfield        #56  <Field int allocatedCount>
	//*  77  135:aload_1         
	//*  78  136:arraylength     
	//*  79  137:isub            
	//*  80  138:putfield        #56  <Field int allocatedCount>
	//*  81  141:aload_0         
	//*  82  142:invokevirtual   #83  <Method void Object.notifyAll()>
	//*  83  145:aload_0         
	//*  84  146:monitorexit     
	//*  85  147:return          
	//*  86  148:astore_1        
	//*  87  149:aload_0         
	//*  88  150:monitorexit     
	//*  89  151:aload_1         
	//*  90  152:athrow          
			flag = false;
	//   91  153:iconst_0        
	//   92  154:istore          5
		else
	//*  93  156:goto            91
			flag = true;
	//   94  159:iconst_1        
	//   95  160:istore          5
		Assertions.checkArgument(flag);
		aallocation1 = availableAllocations;
		k = availableCount;
		availableCount = k + 1;
		aallocation1[k] = allocation;
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		allocatedCount = allocatedCount - aallocation.length;
		((Object)this).notifyAll();
		this;
		JVM INSTR monitorexit ;
		return;
		aallocation;
		throw aallocation;
	//*  96  162:goto            91
	}

	public void reset()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(trimOnReset)
	//*   2    2:aload_0         
	//*   3    3:getfield        #37  <Field boolean trimOnReset>
	//*   4    6:ifeq            14
			setTargetBufferSize(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #88  <Method void setTargetBufferSize(int)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		Exception exception;
		exception;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw exception;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public void setTargetBufferSize(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		Exception exception;
		if(i < targetBufferSize)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #90  <Field int targetBufferSize>
	//*   5    7:icmpge          36
			flag = true;
	//    6   10:iconst_1        
	//    7   11:istore_2        
		else
	//*   8   12:goto            15
	//*   9   15:aload_0         
	//*  10   16:iload_1         
	//*  11   17:putfield        #90  <Field int targetBufferSize>
	//*  12   20:iload_2         
	//*  13   21:ifeq            28
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #93  <Method void trim()>
	//*  16   28:aload_0         
	//*  17   29:monitorexit     
	//*  18   30:return          
	//*  19   31:astore_3        
	//*  20   32:aload_0         
	//*  21   33:monitorexit     
	//*  22   34:aload_3         
	//*  23   35:athrow          
			flag = false;
	//   24   36:iconst_0        
	//   25   37:istore_2        
		targetBufferSize = i;
		if(!flag)
			break MISSING_BLOCK_LABEL_28;
		trim();
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  26   38:goto            15
	}

	public void trim()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		i = Util.ceilDivide(targetBufferSize, individualAllocationSize);
	//    2    2:aload_0         
	//    3    3:getfield        #90  <Field int targetBufferSize>
	//    4    6:aload_0         
	//    5    7:getfield        #39  <Field int individualAllocationSize>
	//    6   10:invokestatic    #98  <Method int Util.ceilDivide(int, int)>
	//    7   13:istore_1        
		j = allocatedCount;
	//    8   14:aload_0         
	//    9   15:getfield        #56  <Field int allocatedCount>
	//   10   18:istore_2        
		boolean flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          4
		int k;
		k = Math.max(0, i - j);
	//   13   22:iconst_0        
	//   14   23:iload_1         
	//   15   24:iload_2         
	//   16   25:isub            
	//   17   26:invokestatic    #70  <Method int Math.max(int, int)>
	//   18   29:istore_3        
		i = availableCount;
	//   19   30:aload_0         
	//   20   31:getfield        #41  <Field int availableCount>
	//   21   34:istore_1        
		if(k < i)
			break MISSING_BLOCK_LABEL_43;
	//   22   35:iload_3         
	//   23   36:iload_1         
	//   24   37:icmplt          43
		this;
	//   25   40:aload_0         
		JVM INSTR monitorexit ;
	//   26   41:monitorexit     
		return;
	//   27   42:return          
		i = k;
	//   28   43:iload_3         
	//   29   44:istore_1        
		if(initialAllocationBlock == null)
			break MISSING_BLOCK_LABEL_169;
	//   30   45:aload_0         
	//   31   46:getfield        #47  <Field byte[] initialAllocationBlock>
	//   32   49:ifnull          169
		j = availableCount - 1;
	//   33   52:aload_0         
	//   34   53:getfield        #41  <Field int availableCount>
	//   35   56:iconst_1        
	//   36   57:isub            
	//   37   58:istore_2        
		i = ((int) (flag));
	//   38   59:iload           4
	//   39   61:istore_1        
_L2:
		if(i > j)
			break; /* Loop/switch isn't completed */
	//   40   62:iload_1         
	//   41   63:iload_2         
	//   42   64:icmpgt          148
		Allocation allocation = availableAllocations[i];
	//   43   67:aload_0         
	//   44   68:getfield        #45  <Field Allocation[] availableAllocations>
	//   45   71:iload_1         
	//   46   72:aaload          
	//   47   73:astore          5
		if(allocation.data == initialAllocationBlock)
	//*  48   75:aload           5
	//*  49   77:getfield        #80  <Field byte[] Allocation.data>
	//*  50   80:aload_0         
	//*  51   81:getfield        #47  <Field byte[] initialAllocationBlock>
	//*  52   84:if_acmpne       94
		{
			i++;
	//   53   87:iload_1         
	//   54   88:iconst_1        
	//   55   89:iadd            
	//   56   90:istore_1        
			continue; /* Loop/switch isn't completed */
	//   57   91:goto            62
		}
		Allocation allocation1 = availableAllocations[j];
	//   58   94:aload_0         
	//   59   95:getfield        #45  <Field Allocation[] availableAllocations>
	//   60   98:iload_2         
	//   61   99:aaload          
	//   62  100:astore          6
		if(allocation1.data != initialAllocationBlock)
	//*  63  102:aload           6
	//*  64  104:getfield        #80  <Field byte[] Allocation.data>
	//*  65  107:aload_0         
	//*  66  108:getfield        #47  <Field byte[] initialAllocationBlock>
	//*  67  111:if_acmpeq       121
		{
			j--;
	//   68  114:iload_2         
	//   69  115:iconst_1        
	//   70  116:isub            
	//   71  117:istore_2        
			continue; /* Loop/switch isn't completed */
	//   72  118:goto            62
		}
		availableAllocations[i] = allocation1;
	//   73  121:aload_0         
	//   74  122:getfield        #45  <Field Allocation[] availableAllocations>
	//   75  125:iload_1         
	//   76  126:aload           6
	//   77  128:aastore         
		availableAllocations[j] = allocation;
	//   78  129:aload_0         
	//   79  130:getfield        #45  <Field Allocation[] availableAllocations>
	//   80  133:iload_2         
	//   81  134:aload           5
	//   82  136:aastore         
		j--;
	//   83  137:iload_2         
	//   84  138:iconst_1        
	//   85  139:isub            
	//   86  140:istore_2        
		i++;
	//   87  141:iload_1         
	//   88  142:iconst_1        
	//   89  143:iadd            
	//   90  144:istore_1        
		if(true) goto _L2; else goto _L1
	//   91  145:goto            62
_L1:
		j = Math.max(k, i);
	//   92  148:iload_3         
	//   93  149:iload_1         
	//   94  150:invokestatic    #70  <Method int Math.max(int, int)>
	//   95  153:istore_2        
		k = availableCount;
	//   96  154:aload_0         
	//   97  155:getfield        #41  <Field int availableCount>
	//   98  158:istore_3        
		i = j;
	//   99  159:iload_2         
	//  100  160:istore_1        
		if(j >= k)
	//* 101  161:iload_2         
	//* 102  162:iload_3         
	//* 103  163:icmplt          169
	//* 104  166:aload_0         
			return;
	//  105  167:monitorexit     
	//  106  168:return          
		Arrays.fill(((Object []) (availableAllocations)), i, availableCount, ((Object) (null)));
	//  107  169:aload_0         
	//  108  170:getfield        #45  <Field Allocation[] availableAllocations>
	//  109  173:iload_1         
	//  110  174:aload_0         
	//  111  175:getfield        #41  <Field int availableCount>
	//  112  178:aconst_null     
	//  113  179:invokestatic    #102 <Method void Arrays.fill(Object[], int, int, Object)>
		availableCount = i;
	//  114  182:aload_0         
	//  115  183:iload_1         
	//  116  184:putfield        #41  <Field int availableCount>
		this;
	//  117  187:aload_0         
		JVM INSTR monitorexit ;
	//  118  188:monitorexit     
		return;
	//  119  189:return          
		Exception exception;
		exception;
	//  120  190:astore          5
	//* 121  192:aload_0         
		throw exception;
	//  122  193:monitorexit     
	//  123  194:aload           5
	//  124  196:athrow          
	}

	private static final int AVAILABLE_EXTRA_CAPACITY = 100;
	private int allocatedCount;
	private Allocation availableAllocations[];
	private int availableCount;
	private final int individualAllocationSize;
	private final byte initialAllocationBlock[];
	private final Allocation singleAllocationReleaseHolder[];
	private int targetBufferSize;
	private final boolean trimOnReset;
}
