// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			BitmapPool, SizeConfigStrategy, AttributeStrategy, LruPoolStrategy

public class LruBitmapPool
	implements BitmapPool
{
	private static interface BitmapTracker
	{

		public abstract void add(Bitmap bitmap);

		public abstract void remove(Bitmap bitmap);
	}

	private static final class NullBitmapTracker
		implements BitmapTracker
	{

		public void add(Bitmap bitmap)
		{
		//    0    0:return          
		}

		public void remove(Bitmap bitmap)
		{
		//    0    0:return          
		}

		NullBitmapTracker()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class ThrowingBitmapTracker
		implements BitmapTracker
	{

		public void add(Bitmap bitmap)
		{
			if(!bitmaps.contains(((Object) (bitmap))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Set bitmaps>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
		//*   4   10:ifne            25
			{
				bitmaps.add(((Object) (bitmap)));
		//    5   13:aload_0         
		//    6   14:getfield        #27  <Field Set bitmaps>
		//    7   17:aload_1         
		//    8   18:invokeinterface #38  <Method boolean Set.add(Object)>
		//    9   23:pop             
				return;
		//   10   24:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   11   25:new             #40  <Class StringBuilder>
		//   12   28:dup             
		//   13   29:invokespecial   #41  <Method void StringBuilder()>
		//   14   32:astore_2        
				stringbuilder.append("Can't add already added bitmap: ");
		//   15   33:aload_2         
		//   16   34:ldc1            #43  <String "Can't add already added bitmap: ">
		//   17   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   18   39:pop             
				stringbuilder.append(((Object) (bitmap)));
		//   19   40:aload_2         
		//   20   41:aload_1         
		//   21   42:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
		//   22   45:pop             
				stringbuilder.append(" [");
		//   23   46:aload_2         
		//   24   47:ldc1            #52  <String " [">
		//   25   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   26   52:pop             
				stringbuilder.append(bitmap.getWidth());
		//   27   53:aload_2         
		//   28   54:aload_1         
		//   29   55:invokevirtual   #58  <Method int Bitmap.getWidth()>
		//   30   58:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
		//   31   61:pop             
				stringbuilder.append("x");
		//   32   62:aload_2         
		//   33   63:ldc1            #63  <String "x">
		//   34   65:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   35   68:pop             
				stringbuilder.append(bitmap.getHeight());
		//   36   69:aload_2         
		//   37   70:aload_1         
		//   38   71:invokevirtual   #66  <Method int Bitmap.getHeight()>
		//   39   74:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
		//   40   77:pop             
				stringbuilder.append("]");
		//   41   78:aload_2         
		//   42   79:ldc1            #68  <String "]">
		//   43   81:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   44   84:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   45   85:new             #70  <Class IllegalStateException>
		//   46   88:dup             
		//   47   89:aload_2         
		//   48   90:invokevirtual   #74  <Method String StringBuilder.toString()>
		//   49   93:invokespecial   #77  <Method void IllegalStateException(String)>
		//   50   96:athrow          
			}
		}

		public void remove(Bitmap bitmap)
		{
			if(bitmaps.contains(((Object) (bitmap))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Set bitmaps>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
		//*   4   10:ifeq            25
			{
				bitmaps.remove(((Object) (bitmap)));
		//    5   13:aload_0         
		//    6   14:getfield        #27  <Field Set bitmaps>
		//    7   17:aload_1         
		//    8   18:invokeinterface #80  <Method boolean Set.remove(Object)>
		//    9   23:pop             
				return;
		//   10   24:return          
			} else
			{
				throw new IllegalStateException("Cannot remove bitmap not in tracker");
		//   11   25:new             #70  <Class IllegalStateException>
		//   12   28:dup             
		//   13   29:ldc1            #82  <String "Cannot remove bitmap not in tracker">
		//   14   31:invokespecial   #77  <Method void IllegalStateException(String)>
		//   15   34:athrow          
			}
		}

		private final Set bitmaps = Collections.synchronizedSet(((Set) (new HashSet())));

		private ThrowingBitmapTracker()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #18  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void HashSet()>
		//    6   12:invokestatic    #25  <Method Set Collections.synchronizedSet(Set)>
		//    7   15:putfield        #27  <Field Set bitmaps>
		//    8   18:return          
		}
	}


	public LruBitmapPool(long l)
	{
		this(l, getDefaultStrategy(), getDefaultAllowedConfigs());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #53  <Method LruPoolStrategy getDefaultStrategy()>
	//    3    5:invokestatic    #57  <Method Set getDefaultAllowedConfigs()>
	//    4    8:invokespecial   #60  <Method void LruBitmapPool(long, LruPoolStrategy, Set)>
	//    5   11:return          
	}

	LruBitmapPool(long l, LruPoolStrategy lrupoolstrategy, Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
		initialMaxSize = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #64  <Field long initialMaxSize>
		maxSize = l;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #66  <Field long maxSize>
		strategy = lrupoolstrategy;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #68  <Field LruPoolStrategy strategy>
		allowedConfigs = set;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #70  <Field Set allowedConfigs>
		tracker = ((BitmapTracker) (new NullBitmapTracker()));
	//   14   25:aload_0         
	//   15   26:new             #11  <Class LruBitmapPool$NullBitmapTracker>
	//   16   29:dup             
	//   17   30:invokespecial   #71  <Method void LruBitmapPool$NullBitmapTracker()>
	//   18   33:putfield        #73  <Field LruBitmapPool$BitmapTracker tracker>
	//   19   36:return          
	}

	public LruBitmapPool(long l, Set set)
	{
		this(l, getDefaultStrategy(), set);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #53  <Method LruPoolStrategy getDefaultStrategy()>
	//    3    5:aload_3         
	//    4    6:invokespecial   #60  <Method void LruBitmapPool(long, LruPoolStrategy, Set)>
	//    5    9:return          
	}

	private static void assertNotHardwareConfig(android.graphics.Bitmap.Config config)
	{
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		if(config != android.graphics.Bitmap.Config.HARDWARE)
	//*   4    9:aload_0         
	//*   5   10:getstatic       #90  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.HARDWARE>
	//*   6   13:if_acmpeq       17
		{
			return;
	//    7   16:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #92  <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #93  <Method void StringBuilder()>
	//   11   24:astore_1        
			stringbuilder.append("Cannot create a mutable Bitmap with config: ");
	//   12   25:aload_1         
	//   13   26:ldc1            #95  <String "Cannot create a mutable Bitmap with config: ">
	//   14   28:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			stringbuilder.append(((Object) (config)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   19   37:pop             
			stringbuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
	//   20   38:aload_1         
	//   21   39:ldc1            #104 <String ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions">
	//   22   41:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   24   45:new             #106 <Class IllegalArgumentException>
	//   25   48:dup             
	//   26   49:aload_1         
	//   27   50:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #113 <Method void IllegalArgumentException(String)>
	//   29   56:athrow          
		}
	}

	private static Bitmap createBitmap(int i, int j, android.graphics.Bitmap.Config config)
	{
		if(config == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          7
	//*   2    4:goto            11
			config = DEFAULT_CONFIG;
	//    3    7:getstatic       #46  <Field android.graphics.Bitmap$Config DEFAULT_CONFIG>
	//    4   10:astore_2        
		return Bitmap.createBitmap(i, j, config);
	//    5   11:iload_0         
	//    6   12:iload_1         
	//    7   13:aload_2         
	//    8   14:invokestatic    #122 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//    9   17:areturn         
	}

	private void dump()
	{
		if(Log.isLoggable("LruBitmapPool", 2))
	//*   0    0:ldc1            #21  <String "LruBitmapPool">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            13
			dumpUnchecked();
	//    4    9:aload_0         
	//    5   10:invokespecial   #133 <Method void dumpUnchecked()>
	//    6   13:return          
	}

	private void dumpUnchecked()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Hits=");
	//    4    8:aload_1         
	//    5    9:ldc1            #135 <String "Hits=">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(hits);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #137 <Field int hits>
	//   11   20:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", misses=");
	//   13   24:aload_1         
	//   14   25:ldc1            #142 <String ", misses=">
	//   15   27:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(misses);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #144 <Field int misses>
	//   20   36:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", puts=");
	//   22   40:aload_1         
	//   23   41:ldc1            #146 <String ", puts=">
	//   24   43:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(puts);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #148 <Field int puts>
	//   29   52:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", evictions=");
	//   31   56:aload_1         
	//   32   57:ldc1            #150 <String ", evictions=">
	//   33   59:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(evictions);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #152 <Field int evictions>
	//   38   68:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(", currentSize=");
	//   40   72:aload_1         
	//   41   73:ldc1            #154 <String ", currentSize=">
	//   42   75:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(currentSize);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #156 <Field long currentSize>
	//   47   84:invokevirtual   #159 <Method StringBuilder StringBuilder.append(long)>
	//   48   87:pop             
		stringbuilder.append(", maxSize=");
	//   49   88:aload_1         
	//   50   89:ldc1            #161 <String ", maxSize=">
	//   51   91:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(maxSize);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #66  <Field long maxSize>
	//   56  100:invokevirtual   #159 <Method StringBuilder StringBuilder.append(long)>
	//   57  103:pop             
		stringbuilder.append("\nStrategy=");
	//   58  104:aload_1         
	//   59  105:ldc1            #163 <String "\nStrategy=">
	//   60  107:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(((Object) (strategy)));
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #68  <Field LruPoolStrategy strategy>
	//   65  116:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   66  119:pop             
		Log.v("LruBitmapPool", stringbuilder.toString());
	//   67  120:ldc1            #21  <String "LruBitmapPool">
	//   68  122:aload_1         
	//   69  123:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   70  126:invokestatic    #167 <Method int Log.v(String, String)>
	//   71  129:pop             
	//   72  130:return          
	}

	private void evict()
	{
		trimToSize(maxSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field long maxSize>
	//    3    5:invokespecial   #171 <Method void trimToSize(long)>
	//    4    8:return          
	}

	private static Set getDefaultAllowedConfigs()
	{
		HashSet hashset = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (android.graphics.Bitmap.Config.values()))))));
	//    0    0:new             #173 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokestatic    #177 <Method android.graphics.Bitmap$Config[] android.graphics.Bitmap$Config.values()>
	//    3    7:invokestatic    #183 <Method java.util.List Arrays.asList(Object[])>
	//    4   10:invokespecial   #186 <Method void HashSet(java.util.Collection)>
	//    5   13:astore_0        
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   6   14:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   17:bipush          19
	//*   8   19:icmplt          30
			((Set) (hashset)).add(((Object) (null)));
	//    9   22:aload_0         
	//   10   23:aconst_null     
	//   11   24:invokeinterface #192 <Method boolean Set.add(Object)>
	//   12   29:pop             
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  13   30:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   33:bipush          26
	//*  15   35:icmplt          48
			((Set) (hashset)).remove(((Object) (android.graphics.Bitmap.Config.HARDWARE)));
	//   16   38:aload_0         
	//   17   39:getstatic       #90  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.HARDWARE>
	//   18   42:invokeinterface #195 <Method boolean Set.remove(Object)>
	//   19   47:pop             
		return Collections.unmodifiableSet(((Set) (hashset)));
	//   20   48:aload_0         
	//   21   49:invokestatic    #201 <Method Set Collections.unmodifiableSet(Set)>
	//   22   52:areturn         
	}

	private static LruPoolStrategy getDefaultStrategy()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return ((LruPoolStrategy) (new SizeConfigStrategy()));
	//    3    8:new             #204 <Class SizeConfigStrategy>
	//    4   11:dup             
	//    5   12:invokespecial   #205 <Method void SizeConfigStrategy()>
	//    6   15:areturn         
		else
			return ((LruPoolStrategy) (new AttributeStrategy()));
	//    7   16:new             #207 <Class AttributeStrategy>
	//    8   19:dup             
	//    9   20:invokespecial   #208 <Method void AttributeStrategy()>
	//   10   23:areturn         
	}

	private Bitmap getDirtyOrNull(int i, int j, android.graphics.Bitmap.Config config)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		LruPoolStrategy lrupoolstrategy;
		assertNotHardwareConfig(config);
	//    2    2:aload_3         
	//    3    3:invokestatic    #211 <Method void assertNotHardwareConfig(android.graphics.Bitmap$Config)>
		lrupoolstrategy = strategy;
	//    4    6:aload_0         
	//    5    7:getfield        #68  <Field LruPoolStrategy strategy>
	//    6   10:astore          5
		Object obj;
		if(config != null)
	//*   7   12:aload_3         
	//*   8   13:ifnull          22
		{
			obj = ((Object) (config));
	//    9   16:aload_3         
	//   10   17:astore          4
			break MISSING_BLOCK_LABEL_27;
	//   11   19:goto            27
		}
		obj = ((Object) (DEFAULT_CONFIG));
	//   12   22:getstatic       #46  <Field android.graphics.Bitmap$Config DEFAULT_CONFIG>
	//   13   25:astore          4
		obj = ((Object) (lrupoolstrategy.get(i, j, ((android.graphics.Bitmap.Config) (obj)))));
	//   14   27:aload           5
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:aload           4
	//   18   33:invokeinterface #216 <Method Bitmap LruPoolStrategy.get(int, int, android.graphics.Bitmap$Config)>
	//   19   38:astore          4
		if(obj != null)
			break MISSING_BLOCK_LABEL_113;
	//   20   40:aload           4
	//   21   42:ifnonnull       113
		if(Log.isLoggable("LruBitmapPool", 3))
	//*  22   45:ldc1            #21  <String "LruBitmapPool">
	//*  23   47:iconst_3        
	//*  24   48:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*  25   51:ifeq            100
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   26   54:new             #92  <Class StringBuilder>
	//   27   57:dup             
	//   28   58:invokespecial   #93  <Method void StringBuilder()>
	//   29   61:astore          5
			stringbuilder.append("Missing bitmap=");
	//   30   63:aload           5
	//   31   65:ldc1            #218 <String "Missing bitmap=">
	//   32   67:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
			stringbuilder.append(strategy.logBitmap(i, j, config));
	//   34   71:aload           5
	//   35   73:aload_0         
	//   36   74:getfield        #68  <Field LruPoolStrategy strategy>
	//   37   77:iload_1         
	//   38   78:iload_2         
	//   39   79:aload_3         
	//   40   80:invokeinterface #222 <Method String LruPoolStrategy.logBitmap(int, int, android.graphics.Bitmap$Config)>
	//   41   85:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
			Log.d("LruBitmapPool", stringbuilder.toString());
	//   43   89:ldc1            #21  <String "LruBitmapPool">
	//   44   91:aload           5
	//   45   93:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   46   96:invokestatic    #225 <Method int Log.d(String, String)>
	//   47   99:pop             
		}
		misses = misses + 1;
	//   48  100:aload_0         
	//   49  101:aload_0         
	//   50  102:getfield        #144 <Field int misses>
	//   51  105:iconst_1        
	//   52  106:iadd            
	//   53  107:putfield        #144 <Field int misses>
		break MISSING_BLOCK_LABEL_160;
	//   54  110:goto            160
		hits = hits + 1;
	//   55  113:aload_0         
	//   56  114:aload_0         
	//   57  115:getfield        #137 <Field int hits>
	//   58  118:iconst_1        
	//   59  119:iadd            
	//   60  120:putfield        #137 <Field int hits>
		currentSize = currentSize - (long)strategy.getSize(((Bitmap) (obj)));
	//   61  123:aload_0         
	//   62  124:aload_0         
	//   63  125:getfield        #156 <Field long currentSize>
	//   64  128:aload_0         
	//   65  129:getfield        #68  <Field LruPoolStrategy strategy>
	//   66  132:aload           4
	//   67  134:invokeinterface #229 <Method int LruPoolStrategy.getSize(Bitmap)>
	//   68  139:i2l             
	//   69  140:lsub            
	//   70  141:putfield        #156 <Field long currentSize>
		tracker.remove(((Bitmap) (obj)));
	//   71  144:aload_0         
	//   72  145:getfield        #73  <Field LruBitmapPool$BitmapTracker tracker>
	//   73  148:aload           4
	//   74  150:invokeinterface #232 <Method void LruBitmapPool$BitmapTracker.remove(Bitmap)>
		normalize(((Bitmap) (obj)));
	//   75  155:aload           4
	//   76  157:invokestatic    #235 <Method void normalize(Bitmap)>
		if(Log.isLoggable("LruBitmapPool", 2))
	//*  77  160:ldc1            #21  <String "LruBitmapPool">
	//*  78  162:iconst_2        
	//*  79  163:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*  80  166:ifeq            215
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   81  169:new             #92  <Class StringBuilder>
	//   82  172:dup             
	//   83  173:invokespecial   #93  <Method void StringBuilder()>
	//   84  176:astore          5
			stringbuilder1.append("Get bitmap=");
	//   85  178:aload           5
	//   86  180:ldc1            #237 <String "Get bitmap=">
	//   87  182:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   88  185:pop             
			stringbuilder1.append(strategy.logBitmap(i, j, config));
	//   89  186:aload           5
	//   90  188:aload_0         
	//   91  189:getfield        #68  <Field LruPoolStrategy strategy>
	//   92  192:iload_1         
	//   93  193:iload_2         
	//   94  194:aload_3         
	//   95  195:invokeinterface #222 <Method String LruPoolStrategy.logBitmap(int, int, android.graphics.Bitmap$Config)>
	//   96  200:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   97  203:pop             
			Log.v("LruBitmapPool", stringbuilder1.toString());
	//   98  204:ldc1            #21  <String "LruBitmapPool">
	//   99  206:aload           5
	//  100  208:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  101  211:invokestatic    #167 <Method int Log.v(String, String)>
	//  102  214:pop             
		}
		dump();
	//  103  215:aload_0         
	//  104  216:invokespecial   #239 <Method void dump()>
		this;
	//  105  219:aload_0         
		JVM INSTR monitorexit ;
	//  106  220:monitorexit     
		return ((Bitmap) (obj));
	//  107  221:aload           4
	//  108  223:areturn         
		config;
	//  109  224:astore_3        
	//* 110  225:aload_0         
		throw config;
	//  111  226:monitorexit     
	//  112  227:aload_3         
	//  113  228:athrow          
	}

	private static void maybeSetPreMultiplied(Bitmap bitmap)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			bitmap.setPremultiplied(true);
	//    3    8:aload_0         
	//    4    9:iconst_1        
	//    5   10:invokevirtual   #245 <Method void Bitmap.setPremultiplied(boolean)>
	//    6   13:return          
	}

	private static void normalize(Bitmap bitmap)
	{
		bitmap.setHasAlpha(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #248 <Method void Bitmap.setHasAlpha(boolean)>
		maybeSetPreMultiplied(bitmap);
	//    3    5:aload_0         
	//    4    6:invokestatic    #250 <Method void maybeSetPreMultiplied(Bitmap)>
	//    5    9:return          
	}

	private void trimToSize(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
_L2:
		Bitmap bitmap;
		if(currentSize <= l)
			break; /* Loop/switch isn't completed */
	//    2    2:aload_0         
	//    3    3:getfield        #156 <Field long currentSize>
	//    4    6:lload_1         
	//    5    7:lcmp            
	//    6    8:ifle            160
		bitmap = strategy.removeLast();
	//    7   11:aload_0         
	//    8   12:getfield        #68  <Field LruPoolStrategy strategy>
	//    9   15:invokeinterface #254 <Method Bitmap LruPoolStrategy.removeLast()>
	//   10   20:astore_3        
		if(bitmap != null)
			break MISSING_BLOCK_LABEL_55;
	//   11   21:aload_3         
	//   12   22:ifnonnull       55
		if(Log.isLoggable("LruBitmapPool", 5))
	//*  13   25:ldc1            #21  <String "LruBitmapPool">
	//*  14   27:iconst_5        
	//*  15   28:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*  16   31:ifeq            47
		{
			Log.w("LruBitmapPool", "Size mismatch, resetting");
	//   17   34:ldc1            #21  <String "LruBitmapPool">
	//   18   36:ldc2            #256 <String "Size mismatch, resetting">
	//   19   39:invokestatic    #259 <Method int Log.w(String, String)>
	//   20   42:pop             
			dumpUnchecked();
	//   21   43:aload_0         
	//   22   44:invokespecial   #133 <Method void dumpUnchecked()>
		}
		currentSize = 0L;
	//   23   47:aload_0         
	//   24   48:lconst_0        
	//   25   49:putfield        #156 <Field long currentSize>
		this;
	//   26   52:aload_0         
		JVM INSTR monitorexit ;
	//   27   53:monitorexit     
		return;
	//   28   54:return          
		tracker.remove(bitmap);
	//   29   55:aload_0         
	//   30   56:getfield        #73  <Field LruBitmapPool$BitmapTracker tracker>
	//   31   59:aload_3         
	//   32   60:invokeinterface #232 <Method void LruBitmapPool$BitmapTracker.remove(Bitmap)>
		currentSize = currentSize - (long)strategy.getSize(bitmap);
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #156 <Field long currentSize>
	//   36   70:aload_0         
	//   37   71:getfield        #68  <Field LruPoolStrategy strategy>
	//   38   74:aload_3         
	//   39   75:invokeinterface #229 <Method int LruPoolStrategy.getSize(Bitmap)>
	//   40   80:i2l             
	//   41   81:lsub            
	//   42   82:putfield        #156 <Field long currentSize>
		evictions = evictions + 1;
	//   43   85:aload_0         
	//   44   86:aload_0         
	//   45   87:getfield        #152 <Field int evictions>
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:putfield        #152 <Field int evictions>
		if(Log.isLoggable("LruBitmapPool", 3))
	//*  49   95:ldc1            #21  <String "LruBitmapPool">
	//*  50   97:iconst_3        
	//*  51   98:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*  52  101:ifeq            149
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   53  104:new             #92  <Class StringBuilder>
	//   54  107:dup             
	//   55  108:invokespecial   #93  <Method void StringBuilder()>
	//   56  111:astore          4
			stringbuilder.append("Evicting bitmap=");
	//   57  113:aload           4
	//   58  115:ldc2            #261 <String "Evicting bitmap=">
	//   59  118:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   60  121:pop             
			stringbuilder.append(strategy.logBitmap(bitmap));
	//   61  122:aload           4
	//   62  124:aload_0         
	//   63  125:getfield        #68  <Field LruPoolStrategy strategy>
	//   64  128:aload_3         
	//   65  129:invokeinterface #264 <Method String LruPoolStrategy.logBitmap(Bitmap)>
	//   66  134:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   67  137:pop             
			Log.d("LruBitmapPool", stringbuilder.toString());
	//   68  138:ldc1            #21  <String "LruBitmapPool">
	//   69  140:aload           4
	//   70  142:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   71  145:invokestatic    #225 <Method int Log.d(String, String)>
	//   72  148:pop             
		}
		dump();
	//   73  149:aload_0         
	//   74  150:invokespecial   #239 <Method void dump()>
		bitmap.recycle();
	//   75  153:aload_3         
	//   76  154:invokevirtual   #267 <Method void Bitmap.recycle()>
		if(true) goto _L2; else goto _L1
	//   77  157:goto            2
_L1:
		this;
	//   78  160:aload_0         
		JVM INSTR monitorexit ;
	//   79  161:monitorexit     
		return;
	//   80  162:return          
		Exception exception;
		exception;
	//   81  163:astore_3        
	//*  82  164:aload_0         
		throw exception;
	//   83  165:monitorexit     
	//   84  166:aload_3         
	//   85  167:athrow          
	}

	public void clearMemory()
	{
		if(Log.isLoggable("LruBitmapPool", 3))
	//*   0    0:ldc1            #21  <String "LruBitmapPool">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            18
			Log.d("LruBitmapPool", "clearMemory");
	//    4    9:ldc1            #21  <String "LruBitmapPool">
	//    5   11:ldc2            #269 <String "clearMemory">
	//    6   14:invokestatic    #225 <Method int Log.d(String, String)>
	//    7   17:pop             
		trimToSize(0L);
	//    8   18:aload_0         
	//    9   19:lconst_0        
	//   10   20:invokespecial   #171 <Method void trimToSize(long)>
	//   11   23:return          
	}

	public Bitmap get(int i, int j, android.graphics.Bitmap.Config config)
	{
		Bitmap bitmap = getDirtyOrNull(i, j, config);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #271 <Method Bitmap getDirtyOrNull(int, int, android.graphics.Bitmap$Config)>
	//    5    7:astore          4
		if(bitmap != null)
	//*   6    9:aload           4
	//*   7   11:ifnull          23
		{
			bitmap.eraseColor(0);
	//    8   14:aload           4
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #275 <Method void Bitmap.eraseColor(int)>
			return bitmap;
	//   11   20:aload           4
	//   12   22:areturn         
		} else
		{
			return createBitmap(i, j, config);
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:aload_3         
	//   16   26:invokestatic    #276 <Method Bitmap createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   17   29:areturn         
		}
	}

	public Bitmap getDirty(int i, int j, android.graphics.Bitmap.Config config)
	{
		Bitmap bitmap1 = getDirtyOrNull(i, j, config);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #271 <Method Bitmap getDirtyOrNull(int, int, android.graphics.Bitmap$Config)>
	//    5    7:astore          5
		Bitmap bitmap = bitmap1;
	//    6    9:aload           5
	//    7   11:astore          4
		if(bitmap1 == null)
	//*   8   13:aload           5
	//*   9   15:ifnonnull       26
			bitmap = createBitmap(i, j, config);
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:aload_3         
	//   13   21:invokestatic    #276 <Method Bitmap createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   14   24:astore          4
		return bitmap;
	//   15   26:aload           4
	//   16   28:areturn         
	}

	public long getMaxSize()
	{
		return maxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field long maxSize>
	//    2    4:lreturn         
	}

	public void put(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_282;
	//    2    2:aload_1         
	//    3    3:ifnull          282
		if(bitmap.isRecycled())
			break MISSING_BLOCK_LABEL_271;
	//    4    6:aload_1         
	//    5    7:invokevirtual   #284 <Method boolean Bitmap.isRecycled()>
	//    6   10:ifne            271
		if(!bitmap.isMutable() || (long)strategy.getSize(bitmap) > maxSize || !allowedConfigs.contains(((Object) (bitmap.getConfig()))))
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #287 <Method boolean Bitmap.isMutable()>
	//*   9   17:ifeq            171
	//*  10   20:aload_0         
	//*  11   21:getfield        #68  <Field LruPoolStrategy strategy>
	//*  12   24:aload_1         
	//*  13   25:invokeinterface #229 <Method int LruPoolStrategy.getSize(Bitmap)>
	//*  14   30:i2l             
	//*  15   31:aload_0         
	//*  16   32:getfield        #66  <Field long maxSize>
	//*  17   35:lcmp            
	//*  18   36:ifgt            171
	//*  19   39:aload_0         
	//*  20   40:getfield        #70  <Field Set allowedConfigs>
	//*  21   43:aload_1         
	//*  22   44:invokevirtual   #291 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*  23   47:invokeinterface #294 <Method boolean Set.contains(Object)>
	//*  24   52:ifne            58
			break MISSING_BLOCK_LABEL_171;
	//   25   55:goto            171
		int i = strategy.getSize(bitmap);
	//   26   58:aload_0         
	//   27   59:getfield        #68  <Field LruPoolStrategy strategy>
	//   28   62:aload_1         
	//   29   63:invokeinterface #229 <Method int LruPoolStrategy.getSize(Bitmap)>
	//   30   68:istore_2        
		strategy.put(bitmap);
	//   31   69:aload_0         
	//   32   70:getfield        #68  <Field LruPoolStrategy strategy>
	//   33   73:aload_1         
	//   34   74:invokeinterface #296 <Method void LruPoolStrategy.put(Bitmap)>
		tracker.add(bitmap);
	//   35   79:aload_0         
	//   36   80:getfield        #73  <Field LruBitmapPool$BitmapTracker tracker>
	//   37   83:aload_1         
	//   38   84:invokeinterface #298 <Method void LruBitmapPool$BitmapTracker.add(Bitmap)>
		puts = puts + 1;
	//   39   89:aload_0         
	//   40   90:aload_0         
	//   41   91:getfield        #148 <Field int puts>
	//   42   94:iconst_1        
	//   43   95:iadd            
	//   44   96:putfield        #148 <Field int puts>
		currentSize = currentSize + (long)i;
	//   45   99:aload_0         
	//   46  100:aload_0         
	//   47  101:getfield        #156 <Field long currentSize>
	//   48  104:iload_2         
	//   49  105:i2l             
	//   50  106:ladd            
	//   51  107:putfield        #156 <Field long currentSize>
		if(Log.isLoggable("LruBitmapPool", 2))
	//*  52  110:ldc1            #21  <String "LruBitmapPool">
	//*  53  112:iconst_2        
	//*  54  113:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*  55  116:ifeq            160
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   56  119:new             #92  <Class StringBuilder>
	//   57  122:dup             
	//   58  123:invokespecial   #93  <Method void StringBuilder()>
	//   59  126:astore_3        
			stringbuilder.append("Put bitmap in pool=");
	//   60  127:aload_3         
	//   61  128:ldc2            #300 <String "Put bitmap in pool=">
	//   62  131:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   63  134:pop             
			stringbuilder.append(strategy.logBitmap(bitmap));
	//   64  135:aload_3         
	//   65  136:aload_0         
	//   66  137:getfield        #68  <Field LruPoolStrategy strategy>
	//   67  140:aload_1         
	//   68  141:invokeinterface #264 <Method String LruPoolStrategy.logBitmap(Bitmap)>
	//   69  146:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   70  149:pop             
			Log.v("LruBitmapPool", stringbuilder.toString());
	//   71  150:ldc1            #21  <String "LruBitmapPool">
	//   72  152:aload_3         
	//   73  153:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   74  156:invokestatic    #167 <Method int Log.v(String, String)>
	//   75  159:pop             
		}
		dump();
	//   76  160:aload_0         
	//   77  161:invokespecial   #239 <Method void dump()>
		evict();
	//   78  164:aload_0         
	//   79  165:invokespecial   #302 <Method void evict()>
		this;
	//   80  168:aload_0         
		JVM INSTR monitorexit ;
	//   81  169:monitorexit     
		return;
	//   82  170:return          
		if(Log.isLoggable("LruBitmapPool", 2))
	//*  83  171:ldc1            #21  <String "LruBitmapPool">
	//*  84  173:iconst_2        
	//*  85  174:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*  86  177:ifeq            264
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   87  180:new             #92  <Class StringBuilder>
	//   88  183:dup             
	//   89  184:invokespecial   #93  <Method void StringBuilder()>
	//   90  187:astore_3        
			stringbuilder1.append("Reject bitmap from pool, bitmap: ");
	//   91  188:aload_3         
	//   92  189:ldc2            #304 <String "Reject bitmap from pool, bitmap: ">
	//   93  192:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   94  195:pop             
			stringbuilder1.append(strategy.logBitmap(bitmap));
	//   95  196:aload_3         
	//   96  197:aload_0         
	//   97  198:getfield        #68  <Field LruPoolStrategy strategy>
	//   98  201:aload_1         
	//   99  202:invokeinterface #264 <Method String LruPoolStrategy.logBitmap(Bitmap)>
	//  100  207:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  101  210:pop             
			stringbuilder1.append(", is mutable: ");
	//  102  211:aload_3         
	//  103  212:ldc2            #306 <String ", is mutable: ">
	//  104  215:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  105  218:pop             
			stringbuilder1.append(bitmap.isMutable());
	//  106  219:aload_3         
	//  107  220:aload_1         
	//  108  221:invokevirtual   #287 <Method boolean Bitmap.isMutable()>
	//  109  224:invokevirtual   #309 <Method StringBuilder StringBuilder.append(boolean)>
	//  110  227:pop             
			stringbuilder1.append(", is allowed config: ");
	//  111  228:aload_3         
	//  112  229:ldc2            #311 <String ", is allowed config: ">
	//  113  232:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  114  235:pop             
			stringbuilder1.append(allowedConfigs.contains(((Object) (bitmap.getConfig()))));
	//  115  236:aload_3         
	//  116  237:aload_0         
	//  117  238:getfield        #70  <Field Set allowedConfigs>
	//  118  241:aload_1         
	//  119  242:invokevirtual   #291 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//  120  245:invokeinterface #294 <Method boolean Set.contains(Object)>
	//  121  250:invokevirtual   #309 <Method StringBuilder StringBuilder.append(boolean)>
	//  122  253:pop             
			Log.v("LruBitmapPool", stringbuilder1.toString());
	//  123  254:ldc1            #21  <String "LruBitmapPool">
	//  124  256:aload_3         
	//  125  257:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  126  260:invokestatic    #167 <Method int Log.v(String, String)>
	//  127  263:pop             
		}
		bitmap.recycle();
	//  128  264:aload_1         
	//  129  265:invokevirtual   #267 <Method void Bitmap.recycle()>
		this;
	//  130  268:aload_0         
		JVM INSTR monitorexit ;
	//  131  269:monitorexit     
		return;
	//  132  270:return          
		throw new IllegalStateException("Cannot pool recycled bitmap");
	//  133  271:new             #313 <Class IllegalStateException>
	//  134  274:dup             
	//  135  275:ldc2            #315 <String "Cannot pool recycled bitmap">
	//  136  278:invokespecial   #316 <Method void IllegalStateException(String)>
	//  137  281:athrow          
		throw new NullPointerException("Bitmap must not be null");
	//  138  282:new             #318 <Class NullPointerException>
	//  139  285:dup             
	//  140  286:ldc2            #320 <String "Bitmap must not be null">
	//  141  289:invokespecial   #321 <Method void NullPointerException(String)>
	//  142  292:athrow          
	//* 143  293:aload_0         
_L2:
		throw bitmap;
	//  144  294:monitorexit     
	//  145  295:aload_1         
	//  146  296:athrow          
		bitmap;
	//  147  297:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//* 148  298:goto            293
	}

	public void setSizeMultiplier(float f)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		maxSize = Math.round((float)initialMaxSize * f);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #64  <Field long initialMaxSize>
	//    5    7:l2f             
	//    6    8:fload_1         
	//    7    9:fmul            
	//    8   10:invokestatic    #329 <Method int Math.round(float)>
	//    9   13:i2l             
	//   10   14:putfield        #66  <Field long maxSize>
		evict();
	//   11   17:aload_0         
	//   12   18:invokespecial   #302 <Method void evict()>
		this;
	//   13   21:aload_0         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		return;
	//   15   23:return          
		Exception exception;
		exception;
	//   16   24:astore_2        
	//*  17   25:aload_0         
		throw exception;
	//   18   26:monitorexit     
	//   19   27:aload_2         
	//   20   28:athrow          
	}

	public void trimMemory(int i)
	{
		if(Log.isLoggable("LruBitmapPool", 3))
	//*   0    0:ldc1            #21  <String "LruBitmapPool">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            41
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #92  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #93  <Method void StringBuilder()>
	//    7   16:astore_2        
			stringbuilder.append("trimMemory, level=");
	//    8   17:aload_2         
	//    9   18:ldc2            #334 <String "trimMemory, level=">
	//   10   21:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			stringbuilder.append(i);
	//   12   25:aload_2         
	//   13   26:iload_1         
	//   14   27:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   15   30:pop             
			Log.d("LruBitmapPool", stringbuilder.toString());
	//   16   31:ldc1            #21  <String "LruBitmapPool">
	//   17   33:aload_2         
	//   18   34:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   19   37:invokestatic    #225 <Method int Log.d(String, String)>
	//   20   40:pop             
		}
		if(i >= 40)
	//*  21   41:iload_1         
	//*  22   42:bipush          40
	//*  23   44:icmplt          52
		{
			clearMemory();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #336 <Method void clearMemory()>
			return;
	//   26   51:return          
		}
		if(i >= 20 || i == 15)
	//*  27   52:iload_1         
	//*  28   53:bipush          20
	//*  29   55:icmpge          64
	//*  30   58:iload_1         
	//*  31   59:bipush          15
	//*  32   61:icmpne          76
			trimToSize(getMaxSize() / 2L);
	//   33   64:aload_0         
	//   34   65:aload_0         
	//   35   66:invokevirtual   #338 <Method long getMaxSize()>
	//   36   69:ldc2w           #339 <Long 2L>
	//   37   72:ldiv            
	//   38   73:invokespecial   #171 <Method void trimToSize(long)>
	//   39   76:return          
	}

	private static final android.graphics.Bitmap.Config DEFAULT_CONFIG;
	private static final String TAG = "LruBitmapPool";
	private final Set allowedConfigs;
	private long currentSize;
	private int evictions;
	private int hits;
	private final long initialMaxSize;
	private long maxSize;
	private int misses;
	private int puts;
	private final LruPoolStrategy strategy;
	private final BitmapTracker tracker;

	static 
	{
		DEFAULT_CONFIG = android.graphics.Bitmap.Config.ARGB_8888;
	//    0    0:getstatic       #44  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    1    3:putstatic       #46  <Field android.graphics.Bitmap$Config DEFAULT_CONFIG>
	//*   2    6:return          
	}
}