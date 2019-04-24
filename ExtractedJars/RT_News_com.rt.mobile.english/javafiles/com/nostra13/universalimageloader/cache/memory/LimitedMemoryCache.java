// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.cache.memory;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.utils.L;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.nostra13.universalimageloader.cache.memory:
//			BaseMemoryCache

public abstract class LimitedMemoryCache extends BaseMemoryCache
{

	public LimitedMemoryCache(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void BaseMemoryCache()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void LinkedList()>
	//    6   12:invokestatic    #29  <Method List Collections.synchronizedList(List)>
	//    7   15:putfield        #31  <Field List hardCache>
		sizeLimit = i;
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:putfield        #33  <Field int sizeLimit>
	//   11   23:aload_0         
	//   12   24:new             #35  <Class AtomicInteger>
	//   13   27:dup             
	//   14   28:invokespecial   #36  <Method void AtomicInteger()>
	//   15   31:putfield        #38  <Field AtomicInteger cacheSize>
		if(i > 0x1000000)
	//*  16   34:iload_1         
	//*  17   35:ldc1            #7   <Int 0x1000000>
	//*  18   37:icmple          57
			L.w("You set too large memory cache size (more than %1$d Mb)", new Object[] {
				Integer.valueOf(16)
			});
	//   19   40:ldc1            #40  <String "You set too large memory cache size (more than %1$d Mb)">
	//   20   42:iconst_1        
	//   21   43:anewarray       Object[]
	//   22   46:dup             
	//   23   47:iconst_0        
	//   24   48:bipush          16
	//   25   50:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//   26   53:aastore         
	//   27   54:invokestatic    #54  <Method void L.w(String, Object[])>
	//   28   57:return          
	}

	public void clear()
	{
		hardCache.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List hardCache>
	//    2    4:invokeinterface #60  <Method void List.clear()>
		cacheSize.set(0);
	//    3    9:aload_0         
	//    4   10:getfield        #38  <Field AtomicInteger cacheSize>
	//    5   13:iconst_0        
	//    6   14:invokevirtual   #63  <Method void AtomicInteger.set(int)>
		super.clear();
	//    7   17:aload_0         
	//    8   18:invokespecial   #64  <Method void BaseMemoryCache.clear()>
	//    9   21:return          
	}

	protected abstract int getSize(Bitmap bitmap);

	protected int getSizeLimit()
	{
		return sizeLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int sizeLimit>
	//    2    4:ireturn         
	}

	public boolean put(String s, Bitmap bitmap)
	{
		int j = getSize(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #72  <Method int getSize(Bitmap)>
	//    3    5:istore          4
		int k = getSizeLimit();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #74  <Method int getSizeLimit()>
	//    6   11:istore          5
		int i = cacheSize.get();
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field AtomicInteger cacheSize>
	//    9   17:invokevirtual   #77  <Method int AtomicInteger.get()>
	//   10   20:istore_3        
		boolean flag;
		if(j < k)
	//*  11   21:iload           4
	//*  12   23:iload           5
	//*  13   25:icmpge          102
		{
			do
			{
				if(i + j <= k)
					break;
	//   14   28:iload_3         
	//   15   29:iload           4
	//   16   31:iadd            
	//   17   32:iload           5
	//   18   34:icmple          75
				Bitmap bitmap1 = removeNext();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #81  <Method Bitmap removeNext()>
	//   21   41:astore          7
				if(hardCache.remove(((Object) (bitmap1))))
	//*  22   43:aload_0         
	//*  23   44:getfield        #31  <Field List hardCache>
	//*  24   47:aload           7
	//*  25   49:invokeinterface #85  <Method boolean List.remove(Object)>
	//*  26   54:ifeq            28
					i = cacheSize.addAndGet(-getSize(bitmap1));
	//   27   57:aload_0         
	//   28   58:getfield        #38  <Field AtomicInteger cacheSize>
	//   29   61:aload_0         
	//   30   62:aload           7
	//   31   64:invokevirtual   #72  <Method int getSize(Bitmap)>
	//   32   67:ineg            
	//   33   68:invokevirtual   #89  <Method int AtomicInteger.addAndGet(int)>
	//   34   71:istore_3        
			} while(true);
	//   35   72:goto            28
			hardCache.add(((Object) (bitmap)));
	//   36   75:aload_0         
	//   37   76:getfield        #31  <Field List hardCache>
	//   38   79:aload_2         
	//   39   80:invokeinterface #92  <Method boolean List.add(Object)>
	//   40   85:pop             
			cacheSize.addAndGet(j);
	//   41   86:aload_0         
	//   42   87:getfield        #38  <Field AtomicInteger cacheSize>
	//   43   90:iload           4
	//   44   92:invokevirtual   #89  <Method int AtomicInteger.addAndGet(int)>
	//   45   95:pop             
			flag = true;
	//   46   96:iconst_1        
	//   47   97:istore          6
		} else
	//*  48   99:goto            105
		{
			flag = false;
	//   49  102:iconst_0        
	//   50  103:istore          6
		}
		super.put(s, bitmap);
	//   51  105:aload_0         
	//   52  106:aload_1         
	//   53  107:aload_2         
	//   54  108:invokespecial   #94  <Method boolean BaseMemoryCache.put(String, Bitmap)>
	//   55  111:pop             
		return flag;
	//   56  112:iload           6
	//   57  114:ireturn         
	}

	public Bitmap remove(String s)
	{
		Bitmap bitmap = super.get(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #97  <Method Bitmap BaseMemoryCache.get(String)>
	//    3    5:astore_2        
		if(bitmap != null && hardCache.remove(((Object) (bitmap))))
	//*   4    6:aload_2         
	//*   5    7:ifnull          37
	//*   6   10:aload_0         
	//*   7   11:getfield        #31  <Field List hardCache>
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #85  <Method boolean List.remove(Object)>
	//*  10   20:ifeq            37
			cacheSize.addAndGet(-getSize(bitmap));
	//   11   23:aload_0         
	//   12   24:getfield        #38  <Field AtomicInteger cacheSize>
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #72  <Method int getSize(Bitmap)>
	//   16   32:ineg            
	//   17   33:invokevirtual   #89  <Method int AtomicInteger.addAndGet(int)>
	//   18   36:pop             
		return super.remove(s);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #99  <Method Bitmap BaseMemoryCache.remove(String)>
	//   22   42:areturn         
	}

	protected abstract Bitmap removeNext();

	private static final int MAX_NORMAL_CACHE_SIZE = 0x1000000;
	private static final int MAX_NORMAL_CACHE_SIZE_IN_MB = 16;
	private final AtomicInteger cacheSize = new AtomicInteger();
	private final List hardCache = Collections.synchronizedList(((List) (new LinkedList())));
	private final int sizeLimit;
}
