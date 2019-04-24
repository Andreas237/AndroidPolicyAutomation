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
		int l = memoryCache.getMaxSize();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field MemoryCache memoryCache>
	//    2    4:invokeinterface #67  <Method int MemoryCache.getMaxSize()>
	//    3    9:istore          5
		int i1 = memoryCache.getCurrentSize();
	//    4   11:aload_0         
	//    5   12:getfield        #34  <Field MemoryCache memoryCache>
	//    6   15:invokeinterface #70  <Method int MemoryCache.getCurrentSize()>
	//    7   20:istore          6
		int j1 = bitmapPool.getMaxSize();
	//    8   22:aload_0         
	//    9   23:getfield        #36  <Field BitmapPool bitmapPool>
	//   10   26:invokeinterface #73  <Method int BitmapPool.getMaxSize()>
	//   11   31:istore          7
		int k = 0;
	//   12   33:iconst_0        
	//   13   34:istore          4
		int k1 = aprefilltype.length;
	//   14   36:aload_1         
	//   15   37:arraylength     
	//   16   38:istore          8
		for(int i = 0; i < k1; i++)
	//*  17   40:iconst_0        
	//*  18   41:istore_3        
	//*  19   42:iload_3         
	//*  20   43:iload           8
	//*  21   45:icmpge          66
			k += aprefilltype[i].getWeight();
	//   22   48:iload           4
	//   23   50:aload_1         
	//   24   51:iload_3         
	//   25   52:aaload          
	//   26   53:invokevirtual   #76  <Method int PreFillType.getWeight()>
	//   27   56:iadd            
	//   28   57:istore          4

	//   29   59:iload_3         
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore_3        
	//*  33   63:goto            42
		float f = (float)((l - i1) + j1) / (float)k;
	//   34   66:iload           5
	//   35   68:iload           6
	//   36   70:isub            
	//   37   71:iload           7
	//   38   73:iadd            
	//   39   74:i2f             
	//   40   75:iload           4
	//   41   77:i2f             
	//   42   78:fdiv            
	//   43   79:fstore_2        
		HashMap hashmap = new HashMap();
	//   44   80:new             #78  <Class HashMap>
	//   45   83:dup             
	//   46   84:invokespecial   #79  <Method void HashMap()>
	//   47   87:astore          9
		k = aprefilltype.length;
	//   48   89:aload_1         
	//   49   90:arraylength     
	//   50   91:istore          4
		for(int j = 0; j < k; j++)
	//*  51   93:iconst_0        
	//*  52   94:istore_3        
	//*  53   95:iload_3         
	//*  54   96:iload           4
	//*  55   98:icmpge          143
		{
			PreFillType prefilltype = aprefilltype[j];
	//   56  101:aload_1         
	//   57  102:iload_3         
	//   58  103:aaload          
	//   59  104:astore          10
			((Map) (hashmap)).put(((Object) (prefilltype)), ((Object) (Integer.valueOf(Math.round((float)prefilltype.getWeight() * f) / getSizeInBytes(prefilltype)))));
	//   60  106:aload           9
	//   61  108:aload           10
	//   62  110:aload           10
	//   63  112:invokevirtual   #76  <Method int PreFillType.getWeight()>
	//   64  115:i2f             
	//   65  116:fload_2         
	//   66  117:fmul            
	//   67  118:invokestatic    #85  <Method int Math.round(float)>
	//   68  121:aload           10
	//   69  123:invokestatic    #87  <Method int getSizeInBytes(PreFillType)>
	//   70  126:idiv            
	//   71  127:invokestatic    #93  <Method Integer Integer.valueOf(int)>
	//   72  130:invokeinterface #99  <Method Object Map.put(Object, Object)>
	//   73  135:pop             
		}

	//   74  136:iload_3         
	//   75  137:iconst_1        
	//   76  138:iadd            
	//   77  139:istore_3        
	//*  78  140:goto            95
		return new PreFillQueue(((Map) (hashmap)));
	//   79  143:new             #101 <Class PreFillQueue>
	//   80  146:dup             
	//   81  147:aload           9
	//   82  149:invokespecial   #104 <Method void PreFillQueue(Map)>
	//   83  152:areturn         
	}

	public transient void preFill(PreFillType.Builder abuilder[])
	{
		if(current != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field BitmapPreFillRunner current>
	//*   2    4:ifnull          14
			current.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #108 <Field BitmapPreFillRunner current>
	//    5   11:invokevirtual   #113 <Method void BitmapPreFillRunner.cancel()>
		PreFillType aprefilltype[] = new PreFillType[abuilder.length];
	//    6   14:aload_1         
	//    7   15:arraylength     
	//    8   16:anewarray       PreFillType[]
	//    9   19:astore          4
		for(int i = 0; i < abuilder.length; i++)
	//*  10   21:iconst_0        
	//*  11   22:istore_2        
	//*  12   23:iload_2         
	//*  13   24:aload_1         
	//*  14   25:arraylength     
	//*  15   26:icmpge          96
		{
			PreFillType.Builder builder = abuilder[i];
	//   16   29:aload_1         
	//   17   30:iload_2         
	//   18   31:aaload          
	//   19   32:astore          5
			if(builder.getConfig() == null)
	//*  20   34:aload           5
	//*  21   36:invokevirtual   #116 <Method android.graphics.Bitmap$Config PreFillType$Builder.getConfig()>
	//*  22   39:ifnonnull       80
			{
				android.graphics.Bitmap.Config config;
				if(defaultFormat == DecodeFormat.PREFER_ARGB_8888 || defaultFormat == DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE)
	//*  23   42:aload_0         
	//*  24   43:getfield        #38  <Field DecodeFormat defaultFormat>
	//*  25   46:getstatic       #121 <Field DecodeFormat DecodeFormat.PREFER_ARGB_8888>
	//*  26   49:if_acmpeq       62
	//*  27   52:aload_0         
	//*  28   53:getfield        #38  <Field DecodeFormat defaultFormat>
	//*  29   56:getstatic       #124 <Field DecodeFormat DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE>
	//*  30   59:if_acmpne       69
					config = android.graphics.Bitmap.Config.ARGB_8888;
	//   31   62:getstatic       #130 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   32   65:astore_3        
				else
	//*  33   66:goto            73
					config = android.graphics.Bitmap.Config.RGB_565;
	//   34   69:getstatic       #133 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   35   72:astore_3        
				builder.setConfig(config);
	//   36   73:aload           5
	//   37   75:aload_3         
	//   38   76:invokevirtual   #137 <Method PreFillType$Builder PreFillType$Builder.setConfig(android.graphics.Bitmap$Config)>
	//   39   79:pop             
			}
			aprefilltype[i] = builder.build();
	//   40   80:aload           4
	//   41   82:iload_2         
	//   42   83:aload           5
	//   43   85:invokevirtual   #141 <Method PreFillType PreFillType$Builder.build()>
	//   44   88:aastore         
		}

	//   45   89:iload_2         
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:istore_2        
	//*  49   93:goto            23
		abuilder = ((PreFillType.Builder []) (generateAllocationOrder(aprefilltype)));
	//   50   96:aload_0         
	//   51   97:aload           4
	//   52   99:invokevirtual   #143 <Method PreFillQueue generateAllocationOrder(PreFillType[])>
	//   53  102:astore_1        
		current = new BitmapPreFillRunner(bitmapPool, memoryCache, ((PreFillQueue) (abuilder)));
	//   54  103:aload_0         
	//   55  104:new             #110 <Class BitmapPreFillRunner>
	//   56  107:dup             
	//   57  108:aload_0         
	//   58  109:getfield        #36  <Field BitmapPool bitmapPool>
	//   59  112:aload_0         
	//   60  113:getfield        #34  <Field MemoryCache memoryCache>
	//   61  116:aload_1         
	//   62  117:invokespecial   #146 <Method void BitmapPreFillRunner(BitmapPool, MemoryCache, PreFillQueue)>
	//   63  120:putfield        #108 <Field BitmapPreFillRunner current>
		handler.post(((Runnable) (current)));
	//   64  123:aload_0         
	//   65  124:getfield        #32  <Field Handler handler>
	//   66  127:aload_0         
	//   67  128:getfield        #108 <Field BitmapPreFillRunner current>
	//   68  131:invokevirtual   #150 <Method boolean Handler.post(Runnable)>
	//   69  134:pop             
	//   70  135:return          
	}

	private final BitmapPool bitmapPool;
	private BitmapPreFillRunner current;
	private final DecodeFormat defaultFormat;
	private final Handler handler = new Handler(Looper.getMainLooper());
	private final MemoryCache memoryCache;
}
