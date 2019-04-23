// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.prefill;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.engine.prefill:
//			PreFillType, PreFillQueue, BitmapPreFillRunner

public final class BitmapPreFiller
{

	public BitmapPreFiller(MemoryCache memorycache, BitmapPool bitmappool, DecodeFormat decodeformat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #27  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #30  <Method void Handler(Looper)>
	//    7   15:putfield        #32  <Field Handler handler>
		memoryCache = memorycache;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #34  <Field MemoryCache memoryCache>
		bitmapPool = bitmappool;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #36  <Field BitmapPool bitmapPool>
		defaultFormat = decodeformat;
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:putfield        #38  <Field DecodeFormat defaultFormat>
	//   17   33:return          
	}

	private static int getSizeInBytes(PreFillType prefilltype)
	{
		return Util.getBitmapByteSize(prefilltype.getWidth(), prefilltype.getHeight(), prefilltype.getConfig());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method int PreFillType.getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #50  <Method int PreFillType.getHeight()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #54  <Method android.graphics.Bitmap$Config PreFillType.getConfig()>
	//    6   12:invokestatic    #60  <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//    7   15:ireturn         
	}

	transient PreFillQueue generateAllocationOrder(PreFillType aprefilltype[])
	{
		long l1 = memoryCache.getMaxSize();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field MemoryCache memoryCache>
	//    2    4:invokeinterface #69  <Method long MemoryCache.getMaxSize()>
	//    3    9:lstore          7
		long l2 = memoryCache.getCurrentSize();
	//    4   11:aload_0         
	//    5   12:getfield        #34  <Field MemoryCache memoryCache>
	//    6   15:invokeinterface #72  <Method long MemoryCache.getCurrentSize()>
	//    7   20:lstore          9
		long l3 = bitmapPool.getMaxSize();
	//    8   22:aload_0         
	//    9   23:getfield        #36  <Field BitmapPool bitmapPool>
	//   10   26:invokeinterface #75  <Method long BitmapPool.getMaxSize()>
	//   11   31:lstore          11
		int l = aprefilltype.length;
	//   12   33:aload_1         
	//   13   34:arraylength     
	//   14   35:istore          6
		boolean flag = false;
	//   15   37:iconst_0        
	//   16   38:istore          5
		int i = 0;
	//   17   40:iconst_0        
	//   18   41:istore_3        
		int k = i;
	//   19   42:iload_3         
	//   20   43:istore          4
		for(; i < l; i++)
	//*  21   45:iload_3         
	//*  22   46:iload           6
	//*  23   48:icmpge          69
			k += aprefilltype[i].getWeight();
	//   24   51:iload           4
	//   25   53:aload_1         
	//   26   54:iload_3         
	//   27   55:aaload          
	//   28   56:invokevirtual   #78  <Method int PreFillType.getWeight()>
	//   29   59:iadd            
	//   30   60:istore          4

	//   31   62:iload_3         
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:istore_3        
	//*  35   66:goto            45
		float f = (float)((l1 - l2) + l3) / (float)k;
	//   36   69:lload           7
	//   37   71:lload           9
	//   38   73:lsub            
	//   39   74:lload           11
	//   40   76:ladd            
	//   41   77:l2f             
	//   42   78:iload           4
	//   43   80:i2f             
	//   44   81:fdiv            
	//   45   82:fstore_2        
		HashMap hashmap = new HashMap();
	//   46   83:new             #80  <Class HashMap>
	//   47   86:dup             
	//   48   87:invokespecial   #81  <Method void HashMap()>
	//   49   90:astore          13
		k = aprefilltype.length;
	//   50   92:aload_1         
	//   51   93:arraylength     
	//   52   94:istore          4
		for(int j = ((int) (flag)); j < k; j++)
	//*  53   96:iload           5
	//*  54   98:istore_3        
	//*  55   99:iload_3         
	//*  56  100:iload           4
	//*  57  102:icmpge          147
		{
			PreFillType prefilltype = aprefilltype[j];
	//   58  105:aload_1         
	//   59  106:iload_3         
	//   60  107:aaload          
	//   61  108:astore          14
			((Map) (hashmap)).put(((Object) (prefilltype)), ((Object) (Integer.valueOf(Math.round((float)prefilltype.getWeight() * f) / getSizeInBytes(prefilltype)))));
	//   62  110:aload           13
	//   63  112:aload           14
	//   64  114:aload           14
	//   65  116:invokevirtual   #78  <Method int PreFillType.getWeight()>
	//   66  119:i2f             
	//   67  120:fload_2         
	//   68  121:fmul            
	//   69  122:invokestatic    #87  <Method int Math.round(float)>
	//   70  125:aload           14
	//   71  127:invokestatic    #89  <Method int getSizeInBytes(PreFillType)>
	//   72  130:idiv            
	//   73  131:invokestatic    #95  <Method Integer Integer.valueOf(int)>
	//   74  134:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   75  139:pop             
		}

	//   76  140:iload_3         
	//   77  141:iconst_1        
	//   78  142:iadd            
	//   79  143:istore_3        
	//*  80  144:goto            99
		return new PreFillQueue(((Map) (hashmap)));
	//   81  147:new             #103 <Class PreFillQueue>
	//   82  150:dup             
	//   83  151:aload           13
	//   84  153:invokespecial   #106 <Method void PreFillQueue(Map)>
	//   85  156:areturn         
	}

	public transient void preFill(PreFillType.Builder abuilder[])
	{
		BitmapPreFillRunner bitmapprefillrunner = current;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field BitmapPreFillRunner current>
	//    2    4:astore_3        
		if(bitmapprefillrunner != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          13
			bitmapprefillrunner.cancel();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #116 <Method void BitmapPreFillRunner.cancel()>
		PreFillType aprefilltype[] = new PreFillType[abuilder.length];
	//    7   13:aload_1         
	//    8   14:arraylength     
	//    9   15:anewarray       PreFillType[]
	//   10   18:astore          4
		for(int i = 0; i < abuilder.length; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:aload_1         
	//*  15   24:arraylength     
	//*  16   25:icmpge          85
		{
			PreFillType.Builder builder = abuilder[i];
	//   17   28:aload_1         
	//   18   29:iload_2         
	//   19   30:aaload          
	//   20   31:astore          5
			if(builder.getConfig() == null)
	//*  21   33:aload           5
	//*  22   35:invokevirtual   #119 <Method android.graphics.Bitmap$Config PreFillType$Builder.getConfig()>
	//*  23   38:ifnonnull       69
			{
				android.graphics.Bitmap.Config config;
				if(defaultFormat == DecodeFormat.PREFER_ARGB_8888)
	//*  24   41:aload_0         
	//*  25   42:getfield        #38  <Field DecodeFormat defaultFormat>
	//*  26   45:getstatic       #124 <Field DecodeFormat DecodeFormat.PREFER_ARGB_8888>
	//*  27   48:if_acmpne       58
					config = android.graphics.Bitmap.Config.ARGB_8888;
	//   28   51:getstatic       #130 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   29   54:astore_3        
				else
	//*  30   55:goto            62
					config = android.graphics.Bitmap.Config.RGB_565;
	//   31   58:getstatic       #133 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   32   61:astore_3        
				builder.setConfig(config);
	//   33   62:aload           5
	//   34   64:aload_3         
	//   35   65:invokevirtual   #137 <Method PreFillType$Builder PreFillType$Builder.setConfig(android.graphics.Bitmap$Config)>
	//   36   68:pop             
			}
			aprefilltype[i] = builder.build();
	//   37   69:aload           4
	//   38   71:iload_2         
	//   39   72:aload           5
	//   40   74:invokevirtual   #141 <Method PreFillType PreFillType$Builder.build()>
	//   41   77:aastore         
		}

	//   42   78:iload_2         
	//   43   79:iconst_1        
	//   44   80:iadd            
	//   45   81:istore_2        
	//*  46   82:goto            22
		abuilder = ((PreFillType.Builder []) (generateAllocationOrder(aprefilltype)));
	//   47   85:aload_0         
	//   48   86:aload           4
	//   49   88:invokevirtual   #143 <Method PreFillQueue generateAllocationOrder(PreFillType[])>
	//   50   91:astore_1        
		current = new BitmapPreFillRunner(bitmapPool, memoryCache, ((PreFillQueue) (abuilder)));
	//   51   92:aload_0         
	//   52   93:new             #113 <Class BitmapPreFillRunner>
	//   53   96:dup             
	//   54   97:aload_0         
	//   55   98:getfield        #36  <Field BitmapPool bitmapPool>
	//   56  101:aload_0         
	//   57  102:getfield        #34  <Field MemoryCache memoryCache>
	//   58  105:aload_1         
	//   59  106:invokespecial   #146 <Method void BitmapPreFillRunner(BitmapPool, MemoryCache, PreFillQueue)>
	//   60  109:putfield        #111 <Field BitmapPreFillRunner current>
		handler.post(((Runnable) (current)));
	//   61  112:aload_0         
	//   62  113:getfield        #32  <Field Handler handler>
	//   63  116:aload_0         
	//   64  117:getfield        #111 <Field BitmapPreFillRunner current>
	//   65  120:invokevirtual   #150 <Method boolean Handler.post(Runnable)>
	//   66  123:pop             
	//   67  124:return          
	}

	private final BitmapPool bitmapPool;
	private BitmapPreFillRunner current;
	private final DecodeFormat defaultFormat;
	private final Handler handler = new Handler(Looper.getMainLooper());
	private final MemoryCache memoryCache;
}
