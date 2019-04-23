// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			Allocator, Allocation

public final class DefaultAllocator
	implements Allocator
{

	public DefaultAllocator(int i)
	{
		this(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #21  <Method void DefaultAllocator(int, int)>
	//    4    6:return          
	}

	public DefaultAllocator(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          5
		int k = 0;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		boolean flag;
		if(i > 0)
	//*   6    9:iload_1         
	//*   7   10:ifle            19
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore          4
		else
	//*  10   16:goto            22
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          4
		Assertions.checkArgument(flag);
	//   13   22:iload           4
	//   14   24:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
		if(j >= 0)
	//*  15   27:iload_2         
	//*  16   28:iflt            38
			flag = flag1;
	//   17   31:iload           5
	//   18   33:istore          4
		else
	//*  19   35:goto            41
			flag = false;
	//   20   38:iconst_0        
	//   21   39:istore          4
		Assertions.checkArgument(flag);
	//   22   41:iload           4
	//   23   43:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
		individualAllocationSize = i;
	//   24   46:aload_0         
	//   25   47:iload_1         
	//   26   48:putfield        #33  <Field int individualAllocationSize>
		availableCount = j;
	//   27   51:aload_0         
	//   28   52:iload_2         
	//   29   53:putfield        #35  <Field int availableCount>
		availableAllocations = new Allocation[j + 100];
	//   30   56:aload_0         
	//   31   57:iload_2         
	//   32   58:bipush          100
	//   33   60:iadd            
	//   34   61:anewarray       Allocation[]
	//   35   64:putfield        #39  <Field Allocation[] availableAllocations>
		if(j > 0)
	//*  36   67:iload_2         
	//*  37   68:ifle            112
		{
			initialAllocationBlock = new byte[j * i];
	//   38   71:aload_0         
	//   39   72:iload_2         
	//   40   73:iload_1         
	//   41   74:imul            
	//   42   75:newarray        byte[]
	//   43   77:putfield        #41  <Field byte[] initialAllocationBlock>
			for(; k < j; k++)
	//*  44   80:iload_3         
	//*  45   81:iload_2         
	//*  46   82:icmpge          117
				availableAllocations[k] = new Allocation(initialAllocationBlock, k * i);
	//   47   85:aload_0         
	//   48   86:getfield        #39  <Field Allocation[] availableAllocations>
	//   49   89:iload_3         
	//   50   90:new             #37  <Class Allocation>
	//   51   93:dup             
	//   52   94:aload_0         
	//   53   95:getfield        #41  <Field byte[] initialAllocationBlock>
	//   54   98:iload_3         
	//   55   99:iload_1         
	//   56  100:imul            
	//   57  101:invokespecial   #44  <Method void Allocation(byte[], int)>
	//   58  104:aastore         

	//   59  105:iload_3         
	//   60  106:iconst_1        
	//   61  107:iadd            
	//   62  108:istore_3        
		} else
	//*  63  109:goto            80
		{
			initialAllocationBlock = null;
	//   64  112:aload_0         
	//   65  113:aconst_null     
	//   66  114:putfield        #41  <Field byte[] initialAllocationBlock>
		}
	//   67  117:return          
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
	//    4    4:getfield        #48  <Field int allocatedCount>
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #48  <Field int allocatedCount>
		if(availableCount <= 0)
			break MISSING_BLOCK_LABEL_53;
	//    8   12:aload_0         
	//    9   13:getfield        #35  <Field int availableCount>
	//   10   16:ifle            53
		aallocation = availableAllocations;
	//   11   19:aload_0         
	//   12   20:getfield        #39  <Field Allocation[] availableAllocations>
	//   13   23:astore_2        
		i = availableCount - 1;
	//   14   24:aload_0         
	//   15   25:getfield        #35  <Field int availableCount>
	//   16   28:iconst_1        
	//   17   29:isub            
	//   18   30:istore_1        
		availableCount = i;
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:putfield        #35  <Field int availableCount>
		Allocation allocation = aallocation[i];
	//   22   36:aload_2         
	//   23   37:iload_1         
	//   24   38:aaload          
	//   25   39:astore_2        
		availableAllocations[availableCount] = null;
	//   26   40:aload_0         
	//   27   41:getfield        #39  <Field Allocation[] availableAllocations>
	//   28   44:aload_0         
	//   29   45:getfield        #35  <Field int availableCount>
	//   30   48:aconst_null     
	//   31   49:aastore         
		break MISSING_BLOCK_LABEL_68;
	//   32   50:goto            68
		allocation = new Allocation(new byte[individualAllocationSize], 0);
	//   33   53:new             #37  <Class Allocation>
	//   34   56:dup             
	//   35   57:aload_0         
	//   36   58:getfield        #33  <Field int individualAllocationSize>
	//   37   61:newarray        byte[]
	//   38   63:iconst_0        
	//   39   64:invokespecial   #44  <Method void Allocation(byte[], int)>
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

	public void blockWhileTotalBytesAllocatedExceeds(int i)
		throws InterruptedException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(; getTotalBytesAllocated() > i; ((Object)this).wait());
	//    2    2:aload_0         
	//    3    3:invokevirtual   #55  <Method int getTotalBytesAllocated()>
	//    4    6:iload_1         
	//    5    7:icmple          17
	//    6   10:aload_0         
	//    7   11:invokevirtual   #58  <Method void Object.wait()>
	//*   8   14:goto            2
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		Exception exception;
		exception;
	//   12   20:astore_2        
	//*  13   21:aload_0         
		throw exception;
	//   14   22:monitorexit     
	//   15   23:aload_2         
	//   16   24:athrow          
	}

	public int getIndividualAllocationLength()
	{
		return individualAllocationSize;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int individualAllocationSize>
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
	//    3    3:getfield        #48  <Field int allocatedCount>
	//    4    6:istore_1        
		j = individualAllocationSize;
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field int individualAllocationSize>
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
		int i;
		boolean flag;
		Allocation aallocation[];
		if(allocation.data != initialAllocationBlock && allocation.data.length != individualAllocationSize)
	//*   2    2:aload_1         
	//*   3    3:getfield        #65  <Field byte[] Allocation.data>
	//*   4    6:aload_0         
	//*   5    7:getfield        #41  <Field byte[] initialAllocationBlock>
	//*   6   10:if_acmpeq       115
	//*   7   13:aload_1         
	//*   8   14:getfield        #65  <Field byte[] Allocation.data>
	//*   9   17:arraylength     
	//*  10   18:aload_0         
	//*  11   19:getfield        #33  <Field int individualAllocationSize>
	//*  12   22:icmpne          110
	//*  13   25:goto            115
	//*  14   28:iload_3         
	//*  15   29:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
	//*  16   32:aload_0         
	//*  17   33:aload_0         
	//*  18   34:getfield        #48  <Field int allocatedCount>
	//*  19   37:iconst_1        
	//*  20   38:isub            
	//*  21   39:putfield        #48  <Field int allocatedCount>
	//*  22   42:aload_0         
	//*  23   43:getfield        #35  <Field int availableCount>
	//*  24   46:aload_0         
	//*  25   47:getfield        #39  <Field Allocation[] availableAllocations>
	//*  26   50:arraylength     
	//*  27   51:icmpne          75
	//*  28   54:aload_0         
	//*  29   55:aload_0         
	//*  30   56:getfield        #39  <Field Allocation[] availableAllocations>
	//*  31   59:aload_0         
	//*  32   60:getfield        #39  <Field Allocation[] availableAllocations>
	//*  33   63:arraylength     
	//*  34   64:iconst_2        
	//*  35   65:imul            
	//*  36   66:invokestatic    #71  <Method Object[] Arrays.copyOf(Object[], int)>
	//*  37   69:checkcast       #72  <Class Allocation[]>
	//*  38   72:putfield        #39  <Field Allocation[] availableAllocations>
	//*  39   75:aload_0         
	//*  40   76:getfield        #39  <Field Allocation[] availableAllocations>
	//*  41   79:astore          4
	//*  42   81:aload_0         
	//*  43   82:getfield        #35  <Field int availableCount>
	//*  44   85:istore_2        
	//*  45   86:aload_0         
	//*  46   87:iload_2         
	//*  47   88:iconst_1        
	//*  48   89:iadd            
	//*  49   90:putfield        #35  <Field int availableCount>
	//*  50   93:aload           4
	//*  51   95:iload_2         
	//*  52   96:aload_1         
	//*  53   97:aastore         
	//*  54   98:aload_0         
	//*  55   99:invokevirtual   #75  <Method void Object.notifyAll()>
	//*  56  102:aload_0         
	//*  57  103:monitorexit     
	//*  58  104:return          
	//*  59  105:astore_1        
	//*  60  106:aload_0         
	//*  61  107:monitorexit     
	//*  62  108:aload_1         
	//*  63  109:athrow          
			flag = false;
	//   64  110:iconst_0        
	//   65  111:istore_3        
		else
	//*  66  112:goto            28
			flag = true;
	//   67  115:iconst_1        
	//   68  116:istore_3        
		Assertions.checkArgument(flag);
		allocatedCount = allocatedCount - 1;
		if(availableCount == availableAllocations.length)
			availableAllocations = (Allocation[])Arrays.copyOf(((Object []) (availableAllocations)), availableAllocations.length * 2);
		aallocation = availableAllocations;
		i = availableCount;
		availableCount = i + 1;
		aallocation[i] = allocation;
		((Object)this).notifyAll();
		this;
		JVM INSTR monitorexit ;
		return;
		allocation;
		throw allocation;
	//*  69  117:goto            28
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
	//*   3    3:getfield        #35  <Field int availableCount>
	//*   4    6:aload_1         
	//*   5    7:arraylength     
	//*   6    8:iadd            
	//*   7    9:aload_0         
	//*   8   10:getfield        #39  <Field Allocation[] availableAllocations>
	//*   9   13:arraylength     
	//*  10   14:icmplt          48
			availableAllocations = (Allocation[])Arrays.copyOf(((Object []) (availableAllocations)), Math.max(availableAllocations.length * 2, availableCount + aallocation.length));
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #39  <Field Allocation[] availableAllocations>
	//   14   22:aload_0         
	//   15   23:getfield        #39  <Field Allocation[] availableAllocations>
	//   16   26:arraylength     
	//   17   27:iconst_2        
	//   18   28:imul            
	//   19   29:aload_0         
	//   20   30:getfield        #35  <Field int availableCount>
	//   21   33:aload_1         
	//   22   34:arraylength     
	//   23   35:iadd            
	//   24   36:invokestatic    #82  <Method int Math.max(int, int)>
	//   25   39:invokestatic    #71  <Method Object[] Arrays.copyOf(Object[], int)>
	//   26   42:checkcast       #72  <Class Allocation[]>
	//   27   45:putfield        #39  <Field Allocation[] availableAllocations>
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
	//*  41   65:getfield        #65  <Field byte[] Allocation.data>
	//*  42   68:aload_0         
	//*  43   69:getfield        #41  <Field byte[] initialAllocationBlock>
	//*  44   72:if_acmpeq       159
	//*  45   75:aload           6
	//*  46   77:getfield        #65  <Field byte[] Allocation.data>
	//*  47   80:arraylength     
	//*  48   81:aload_0         
	//*  49   82:getfield        #33  <Field int individualAllocationSize>
	//*  50   85:icmpne          153
	//*  51   88:goto            159
	//*  52   91:iload           5
	//*  53   93:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
	//*  54   96:aload_0         
	//*  55   97:getfield        #39  <Field Allocation[] availableAllocations>
	//*  56  100:astore          7
	//*  57  102:aload_0         
	//*  58  103:getfield        #35  <Field int availableCount>
	//*  59  106:istore          4
	//*  60  108:aload_0         
	//*  61  109:iload           4
	//*  62  111:iconst_1        
	//*  63  112:iadd            
	//*  64  113:putfield        #35  <Field int availableCount>
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
	//*  76  132:getfield        #48  <Field int allocatedCount>
	//*  77  135:aload_1         
	//*  78  136:arraylength     
	//*  79  137:isub            
	//*  80  138:putfield        #48  <Field int allocatedCount>
	//*  81  141:aload_0         
	//*  82  142:invokevirtual   #75  <Method void Object.notifyAll()>
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

	public void trim(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		i = Util.ceilDivide(i, individualAllocationSize);
	//    2    2:iload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #33  <Field int individualAllocationSize>
	//    5    7:invokestatic    #88  <Method int Util.ceilDivide(int, int)>
	//    6   10:istore_1        
		j = allocatedCount;
	//    7   11:aload_0         
	//    8   12:getfield        #48  <Field int allocatedCount>
	//    9   15:istore_2        
		boolean flag = false;
	//   10   16:iconst_0        
	//   11   17:istore          4
		int k;
		k = Math.max(0, i - j);
	//   12   19:iconst_0        
	//   13   20:iload_1         
	//   14   21:iload_2         
	//   15   22:isub            
	//   16   23:invokestatic    #82  <Method int Math.max(int, int)>
	//   17   26:istore_3        
		i = availableCount;
	//   18   27:aload_0         
	//   19   28:getfield        #35  <Field int availableCount>
	//   20   31:istore_1        
		if(k < i)
			break MISSING_BLOCK_LABEL_40;
	//   21   32:iload_3         
	//   22   33:iload_1         
	//   23   34:icmplt          40
		this;
	//   24   37:aload_0         
		JVM INSTR monitorexit ;
	//   25   38:monitorexit     
		return;
	//   26   39:return          
		i = k;
	//   27   40:iload_3         
	//   28   41:istore_1        
		if(initialAllocationBlock == null)
			break MISSING_BLOCK_LABEL_166;
	//   29   42:aload_0         
	//   30   43:getfield        #41  <Field byte[] initialAllocationBlock>
	//   31   46:ifnull          166
		j = availableCount - 1;
	//   32   49:aload_0         
	//   33   50:getfield        #35  <Field int availableCount>
	//   34   53:iconst_1        
	//   35   54:isub            
	//   36   55:istore_2        
		i = ((int) (flag));
	//   37   56:iload           4
	//   38   58:istore_1        
_L2:
		if(i > j)
			break; /* Loop/switch isn't completed */
	//   39   59:iload_1         
	//   40   60:iload_2         
	//   41   61:icmpgt          145
		Allocation allocation = availableAllocations[i];
	//   42   64:aload_0         
	//   43   65:getfield        #39  <Field Allocation[] availableAllocations>
	//   44   68:iload_1         
	//   45   69:aaload          
	//   46   70:astore          5
		if(allocation.data == initialAllocationBlock)
	//*  47   72:aload           5
	//*  48   74:getfield        #65  <Field byte[] Allocation.data>
	//*  49   77:aload_0         
	//*  50   78:getfield        #41  <Field byte[] initialAllocationBlock>
	//*  51   81:if_acmpne       91
		{
			i++;
	//   52   84:iload_1         
	//   53   85:iconst_1        
	//   54   86:iadd            
	//   55   87:istore_1        
			continue; /* Loop/switch isn't completed */
	//   56   88:goto            59
		}
		Allocation allocation1 = availableAllocations[j];
	//   57   91:aload_0         
	//   58   92:getfield        #39  <Field Allocation[] availableAllocations>
	//   59   95:iload_2         
	//   60   96:aaload          
	//   61   97:astore          6
		if(allocation1.data != initialAllocationBlock)
	//*  62   99:aload           6
	//*  63  101:getfield        #65  <Field byte[] Allocation.data>
	//*  64  104:aload_0         
	//*  65  105:getfield        #41  <Field byte[] initialAllocationBlock>
	//*  66  108:if_acmpeq       118
		{
			j--;
	//   67  111:iload_2         
	//   68  112:iconst_1        
	//   69  113:isub            
	//   70  114:istore_2        
			continue; /* Loop/switch isn't completed */
	//   71  115:goto            59
		}
		availableAllocations[i] = allocation1;
	//   72  118:aload_0         
	//   73  119:getfield        #39  <Field Allocation[] availableAllocations>
	//   74  122:iload_1         
	//   75  123:aload           6
	//   76  125:aastore         
		availableAllocations[j] = allocation;
	//   77  126:aload_0         
	//   78  127:getfield        #39  <Field Allocation[] availableAllocations>
	//   79  130:iload_2         
	//   80  131:aload           5
	//   81  133:aastore         
		j--;
	//   82  134:iload_2         
	//   83  135:iconst_1        
	//   84  136:isub            
	//   85  137:istore_2        
		i++;
	//   86  138:iload_1         
	//   87  139:iconst_1        
	//   88  140:iadd            
	//   89  141:istore_1        
		if(true) goto _L2; else goto _L1
	//   90  142:goto            59
_L1:
		j = Math.max(k, i);
	//   91  145:iload_3         
	//   92  146:iload_1         
	//   93  147:invokestatic    #82  <Method int Math.max(int, int)>
	//   94  150:istore_2        
		k = availableCount;
	//   95  151:aload_0         
	//   96  152:getfield        #35  <Field int availableCount>
	//   97  155:istore_3        
		i = j;
	//   98  156:iload_2         
	//   99  157:istore_1        
		if(j >= k)
	//* 100  158:iload_2         
	//* 101  159:iload_3         
	//* 102  160:icmplt          166
	//* 103  163:aload_0         
			return;
	//  104  164:monitorexit     
	//  105  165:return          
		Arrays.fill(((Object []) (availableAllocations)), i, availableCount, ((Object) (null)));
	//  106  166:aload_0         
	//  107  167:getfield        #39  <Field Allocation[] availableAllocations>
	//  108  170:iload_1         
	//  109  171:aload_0         
	//  110  172:getfield        #35  <Field int availableCount>
	//  111  175:aconst_null     
	//  112  176:invokestatic    #92  <Method void Arrays.fill(Object[], int, int, Object)>
		availableCount = i;
	//  113  179:aload_0         
	//  114  180:iload_1         
	//  115  181:putfield        #35  <Field int availableCount>
		this;
	//  116  184:aload_0         
		JVM INSTR monitorexit ;
	//  117  185:monitorexit     
		return;
	//  118  186:return          
		Exception exception;
		exception;
	//  119  187:astore          5
	//* 120  189:aload_0         
		throw exception;
	//  121  190:monitorexit     
	//  122  191:aload           5
	//  123  193:athrow          
	}

	private static final int AVAILABLE_EXTRA_CAPACITY = 100;
	private int allocatedCount;
	private Allocation availableAllocations[];
	private int availableCount;
	private final int individualAllocationSize;
	private final byte initialAllocationBlock[];
}
