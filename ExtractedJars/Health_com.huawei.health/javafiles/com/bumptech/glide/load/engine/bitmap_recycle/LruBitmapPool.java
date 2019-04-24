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
	static interface BitmapTracker
	{

		public abstract void add(Bitmap bitmap);

		public abstract void remove(Bitmap bitmap);
	}

	static class NullBitmapTracker
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

	static class ThrowingBitmapTracker
		implements BitmapTracker
	{

		public void add(Bitmap bitmap)
		{
			if(bitmaps.contains(((Object) (bitmap))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Set bitmaps>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
		//*   4   10:ifeq            69
			{
				throw new IllegalStateException((new StringBuilder()).append("Can't add already added bitmap: ").append(((Object) (bitmap))).append(" [").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).append("]").toString());
		//    5   13:new             #38  <Class IllegalStateException>
		//    6   16:dup             
		//    7   17:new             #40  <Class StringBuilder>
		//    8   20:dup             
		//    9   21:invokespecial   #41  <Method void StringBuilder()>
		//   10   24:ldc1            #43  <String "Can't add already added bitmap: ">
		//   11   26:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   12   29:aload_1         
		//   13   30:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
		//   14   33:ldc1            #52  <String " [">
		//   15   35:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   16   38:aload_1         
		//   17   39:invokevirtual   #58  <Method int Bitmap.getWidth()>
		//   18   42:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
		//   19   45:ldc1            #63  <String "x">
		//   20   47:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   21   50:aload_1         
		//   22   51:invokevirtual   #66  <Method int Bitmap.getHeight()>
		//   23   54:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
		//   24   57:ldc1            #68  <String "]">
		//   25   59:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   26   62:invokevirtual   #72  <Method String StringBuilder.toString()>
		//   27   65:invokespecial   #75  <Method void IllegalStateException(String)>
		//   28   68:athrow          
			} else
			{
				bitmaps.add(((Object) (bitmap)));
		//   29   69:aload_0         
		//   30   70:getfield        #27  <Field Set bitmaps>
		//   31   73:aload_1         
		//   32   74:invokeinterface #77  <Method boolean Set.add(Object)>
		//   33   79:pop             
				return;
		//   34   80:return          
			}
		}

		public void remove(Bitmap bitmap)
		{
			if(!bitmaps.contains(((Object) (bitmap))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Set bitmaps>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
		//*   4   10:ifne            23
			{
				throw new IllegalStateException("Cannot remove bitmap not in tracker");
		//    5   13:new             #38  <Class IllegalStateException>
		//    6   16:dup             
		//    7   17:ldc1            #80  <String "Cannot remove bitmap not in tracker">
		//    8   19:invokespecial   #75  <Method void IllegalStateException(String)>
		//    9   22:athrow          
			} else
			{
				bitmaps.remove(((Object) (bitmap)));
		//   10   23:aload_0         
		//   11   24:getfield        #27  <Field Set bitmaps>
		//   12   27:aload_1         
		//   13   28:invokeinterface #82  <Method boolean Set.remove(Object)>
		//   14   33:pop             
				return;
		//   15   34:return          
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


	public LruBitmapPool(int i)
	{
		this(i, getDefaultStrategy(), getDefaultAllowedConfigs());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #52  <Method LruPoolStrategy getDefaultStrategy()>
	//    3    5:invokestatic    #56  <Method Set getDefaultAllowedConfigs()>
	//    4    8:invokespecial   #59  <Method void LruBitmapPool(int, LruPoolStrategy, Set)>
	//    5   11:return          
	}

	LruBitmapPool(int i, LruPoolStrategy lrupoolstrategy, Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
		initialMaxSize = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #63  <Field int initialMaxSize>
		maxSize = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #65  <Field int maxSize>
		strategy = lrupoolstrategy;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #67  <Field LruPoolStrategy strategy>
		allowedConfigs = set;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #69  <Field Set allowedConfigs>
		tracker = ((BitmapTracker) (new NullBitmapTracker()));
	//   14   24:aload_0         
	//   15   25:new             #11  <Class LruBitmapPool$NullBitmapTracker>
	//   16   28:dup             
	//   17   29:invokespecial   #70  <Method void LruBitmapPool$NullBitmapTracker()>
	//   18   32:putfield        #72  <Field LruBitmapPool$BitmapTracker tracker>
	//   19   35:return          
	}

	public LruBitmapPool(int i, Set set)
	{
		this(i, getDefaultStrategy(), set);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #52  <Method LruPoolStrategy getDefaultStrategy()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #59  <Method void LruBitmapPool(int, LruPoolStrategy, Set)>
	//    5    9:return          
	}

	private static void assertNotHardwareConfig(android.graphics.Bitmap.Config config)
	{
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		if(config == android.graphics.Bitmap.Config.HARDWARE)
	//*   4    9:aload_0         
	//*   5   10:getstatic       #89  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.HARDWARE>
	//*   6   13:if_acmpne       48
			throw new IllegalArgumentException((new StringBuilder()).append("Cannot create a mutable Bitmap with config: ").append(((Object) (config))).append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions").toString());
	//    7   16:new             #91  <Class IllegalArgumentException>
	//    8   19:dup             
	//    9   20:new             #93  <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #94  <Method void StringBuilder()>
	//   12   27:ldc1            #96  <String "Cannot create a mutable Bitmap with config: ">
	//   13   29:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   16   36:ldc1            #105 <String ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions">
	//   17   38:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   19   44:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//   20   47:athrow          
		else
			return;
	//   21   48:return          
	}

	private void dump()
	{
		if(Log.isLoggable("LruBitmapPool", 2))
	//*   0    0:ldc1            #21  <String "LruBitmapPool">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            13
			dumpUnchecked();
	//    4    9:aload_0         
	//    5   10:invokespecial   #123 <Method void dumpUnchecked()>
	//    6   13:return          
	}

	private void dumpUnchecked()
	{
		Log.v("LruBitmapPool", (new StringBuilder()).append("Hits=").append(hits).append(", misses=").append(misses).append(", puts=").append(puts).append(", evictions=").append(evictions).append(", currentSize=").append(currentSize).append(", maxSize=").append(maxSize).append("\nStrategy=").append(((Object) (strategy))).toString());
	//    0    0:ldc1            #21  <String "LruBitmapPool">
	//    1    2:new             #93  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #94  <Method void StringBuilder()>
	//    4    9:ldc1            #125 <String "Hits=">
	//    5   11:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #127 <Field int hits>
	//    8   18:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//    9   21:ldc1            #132 <String ", misses=">
	//   10   23:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_0         
	//   12   27:getfield        #134 <Field int misses>
	//   13   30:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   14   33:ldc1            #136 <String ", puts=">
	//   15   35:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:aload_0         
	//   17   39:getfield        #138 <Field int puts>
	//   18   42:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   19   45:ldc1            #140 <String ", evictions=">
	//   20   47:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:aload_0         
	//   22   51:getfield        #142 <Field int evictions>
	//   23   54:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   24   57:ldc1            #144 <String ", currentSize=">
	//   25   59:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   26   62:aload_0         
	//   27   63:getfield        #146 <Field int currentSize>
	//   28   66:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   29   69:ldc1            #148 <String ", maxSize=">
	//   30   71:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   31   74:aload_0         
	//   32   75:getfield        #65  <Field int maxSize>
	//   33   78:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   34   81:ldc1            #150 <String "\nStrategy=">
	//   35   83:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   36   86:aload_0         
	//   37   87:getfield        #67  <Field LruPoolStrategy strategy>
	//   38   90:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   39   93:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   40   96:invokestatic    #154 <Method int Log.v(String, String)>
	//   41   99:pop             
	//   42  100:return          
	}

	private void evict()
	{
		trimToSize(maxSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field int maxSize>
	//    3    5:invokespecial   #158 <Method void trimToSize(int)>
	//    4    8:return          
	}

	private static Set getDefaultAllowedConfigs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #160 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #161 <Method void HashSet()>
	//    3    7:astore_0        
		((Set) (hashset)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (android.graphics.Bitmap.Config.values()))))));
	//    4    8:aload_0         
	//    5    9:invokestatic    #165 <Method android.graphics.Bitmap$Config[] android.graphics.Bitmap$Config.values()>
	//    6   12:invokestatic    #171 <Method java.util.List Arrays.asList(Object[])>
	//    7   15:invokeinterface #177 <Method boolean Set.addAll(java.util.Collection)>
	//    8   20:pop             
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   9   21:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   24:bipush          19
	//*  11   26:icmplt          37
			((Set) (hashset)).add(((Object) (null)));
	//   12   29:aload_0         
	//   13   30:aconst_null     
	//   14   31:invokeinterface #181 <Method boolean Set.add(Object)>
	//   15   36:pop             
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  16   37:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   40:bipush          26
	//*  18   42:icmplt          55
			((Set) (hashset)).remove(((Object) (android.graphics.Bitmap.Config.HARDWARE)));
	//   19   45:aload_0         
	//   20   46:getstatic       #89  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.HARDWARE>
	//   21   49:invokeinterface #184 <Method boolean Set.remove(Object)>
	//   22   54:pop             
		return Collections.unmodifiableSet(((Set) (hashset)));
	//   23   55:aload_0         
	//   24   56:invokestatic    #190 <Method Set Collections.unmodifiableSet(Set)>
	//   25   59:areturn         
	}

	private static LruPoolStrategy getDefaultStrategy()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return ((LruPoolStrategy) (new SizeConfigStrategy()));
	//    3    8:new             #193 <Class SizeConfigStrategy>
	//    4   11:dup             
	//    5   12:invokespecial   #194 <Method void SizeConfigStrategy()>
	//    6   15:areturn         
		else
			return ((LruPoolStrategy) (new AttributeStrategy()));
	//    7   16:new             #196 <Class AttributeStrategy>
	//    8   19:dup             
	//    9   20:invokespecial   #197 <Method void AttributeStrategy()>
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
	//    3    3:invokestatic    #202 <Method void assertNotHardwareConfig(android.graphics.Bitmap$Config)>
		lrupoolstrategy = strategy;
	//    4    6:aload_0         
	//    5    7:getfield        #67  <Field LruPoolStrategy strategy>
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
	//   12   22:getstatic       #45  <Field android.graphics.Bitmap$Config DEFAULT_CONFIG>
	//   13   25:astore          4
		obj = ((Object) (lrupoolstrategy.get(i, j, ((android.graphics.Bitmap.Config) (obj)))));
	//   14   27:aload           5
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:aload           4
	//   18   33:invokeinterface #207 <Method Bitmap LruPoolStrategy.get(int, int, android.graphics.Bitmap$Config)>
	//   19   38:astore          4
		if(obj != null)
			break MISSING_BLOCK_LABEL_103;
	//   20   40:aload           4
	//   21   42:ifnonnull       103
		if(Log.isLoggable("LruBitmapPool", 3))
	//*  22   45:ldc1            #21  <String "LruBitmapPool">
	//*  23   47:iconst_3        
	//*  24   48:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*  25   51:ifeq            90
			Log.d("LruBitmapPool", (new StringBuilder()).append("Missing bitmap=").append(strategy.logBitmap(i, j, config)).toString());
	//   26   54:ldc1            #21  <String "LruBitmapPool">
	//   27   56:new             #93  <Class StringBuilder>
	//   28   59:dup             
	//   29   60:invokespecial   #94  <Method void StringBuilder()>
	//   30   63:ldc1            #209 <String "Missing bitmap=">
	//   31   65:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   32   68:aload_0         
	//   33   69:getfield        #67  <Field LruPoolStrategy strategy>
	//   34   72:iload_1         
	//   35   73:iload_2         
	//   36   74:aload_3         
	//   37   75:invokeinterface #213 <Method String LruPoolStrategy.logBitmap(int, int, android.graphics.Bitmap$Config)>
	//   38   80:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   40   86:invokestatic    #216 <Method int Log.d(String, String)>
	//   41   89:pop             
		misses = misses + 1;
	//   42   90:aload_0         
	//   43   91:aload_0         
	//   44   92:getfield        #134 <Field int misses>
	//   45   95:iconst_1        
	//   46   96:iadd            
	//   47   97:putfield        #134 <Field int misses>
		break MISSING_BLOCK_LABEL_149;
	//   48  100:goto            149
		hits = hits + 1;
	//   49  103:aload_0         
	//   50  104:aload_0         
	//   51  105:getfield        #127 <Field int hits>
	//   52  108:iconst_1        
	//   53  109:iadd            
	//   54  110:putfield        #127 <Field int hits>
		currentSize = currentSize - strategy.getSize(((Bitmap) (obj)));
	//   55  113:aload_0         
	//   56  114:aload_0         
	//   57  115:getfield        #146 <Field int currentSize>
	//   58  118:aload_0         
	//   59  119:getfield        #67  <Field LruPoolStrategy strategy>
	//   60  122:aload           4
	//   61  124:invokeinterface #220 <Method int LruPoolStrategy.getSize(Bitmap)>
	//   62  129:isub            
	//   63  130:putfield        #146 <Field int currentSize>
		tracker.remove(((Bitmap) (obj)));
	//   64  133:aload_0         
	//   65  134:getfield        #72  <Field LruBitmapPool$BitmapTracker tracker>
	//   66  137:aload           4
	//   67  139:invokeinterface #223 <Method void LruBitmapPool$BitmapTracker.remove(Bitmap)>
		normalize(((Bitmap) (obj)));
	//   68  144:aload           4
	//   69  146:invokestatic    #226 <Method void normalize(Bitmap)>
		if(Log.isLoggable("LruBitmapPool", 2))
	//*  70  149:ldc1            #21  <String "LruBitmapPool">
	//*  71  151:iconst_2        
	//*  72  152:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*  73  155:ifeq            194
			Log.v("LruBitmapPool", (new StringBuilder()).append("Get bitmap=").append(strategy.logBitmap(i, j, config)).toString());
	//   74  158:ldc1            #21  <String "LruBitmapPool">
	//   75  160:new             #93  <Class StringBuilder>
	//   76  163:dup             
	//   77  164:invokespecial   #94  <Method void StringBuilder()>
	//   78  167:ldc1            #228 <String "Get bitmap=">
	//   79  169:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   80  172:aload_0         
	//   81  173:getfield        #67  <Field LruPoolStrategy strategy>
	//   82  176:iload_1         
	//   83  177:iload_2         
	//   84  178:aload_3         
	//   85  179:invokeinterface #213 <Method String LruPoolStrategy.logBitmap(int, int, android.graphics.Bitmap$Config)>
	//   86  184:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   87  187:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   88  190:invokestatic    #154 <Method int Log.v(String, String)>
	//   89  193:pop             
		dump();
	//   90  194:aload_0         
	//   91  195:invokespecial   #230 <Method void dump()>
		this;
	//   92  198:aload_0         
		JVM INSTR monitorexit ;
	//   93  199:monitorexit     
		return ((Bitmap) (obj));
	//   94  200:aload           4
	//   95  202:areturn         
		config;
	//   96  203:astore_3        
	//*  97  204:aload_0         
		throw config;
	//   98  205:monitorexit     
	//   99  206:aload_3         
	//  100  207:athrow          
	}

	private static void maybeSetPreMultiplied(Bitmap bitmap)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			bitmap.setPremultiplied(true);
	//    3    8:aload_0         
	//    4    9:iconst_1        
	//    5   10:invokevirtual   #238 <Method void Bitmap.setPremultiplied(boolean)>
	//    6   13:return          
	}

	private static void normalize(Bitmap bitmap)
	{
		bitmap.setHasAlpha(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #241 <Method void Bitmap.setHasAlpha(boolean)>
		maybeSetPreMultiplied(bitmap);
	//    3    5:aload_0         
	//    4    6:invokestatic    #243 <Method void maybeSetPreMultiplied(Bitmap)>
	//    5    9:return          
	}

	private void trimToSize(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
_L2:
		Bitmap bitmap;
		if(currentSize <= i)
			break; /* Loop/switch isn't completed */
	//    2    2:aload_0         
	//    3    3:getfield        #146 <Field int currentSize>
	//    4    6:iload_1         
	//    5    7:icmple          146
		bitmap = strategy.removeLast();
	//    6   10:aload_0         
	//    7   11:getfield        #67  <Field LruPoolStrategy strategy>
	//    8   14:invokeinterface #247 <Method Bitmap LruPoolStrategy.removeLast()>
	//    9   19:astore_2        
		if(bitmap != null)
			break MISSING_BLOCK_LABEL_53;
	//   10   20:aload_2         
	//   11   21:ifnonnull       53
		if(Log.isLoggable("LruBitmapPool", 5))
	//*  12   24:ldc1            #21  <String "LruBitmapPool">
	//*  13   26:iconst_5        
	//*  14   27:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*  15   30:ifeq            45
		{
			Log.w("LruBitmapPool", "Size mismatch, resetting");
	//   16   33:ldc1            #21  <String "LruBitmapPool">
	//   17   35:ldc1            #249 <String "Size mismatch, resetting">
	//   18   37:invokestatic    #252 <Method int Log.w(String, String)>
	//   19   40:pop             
			dumpUnchecked();
	//   20   41:aload_0         
	//   21   42:invokespecial   #123 <Method void dumpUnchecked()>
		}
		currentSize = 0;
	//   22   45:aload_0         
	//   23   46:iconst_0        
	//   24   47:putfield        #146 <Field int currentSize>
		this;
	//   25   50:aload_0         
		JVM INSTR monitorexit ;
	//   26   51:monitorexit     
		return;
	//   27   52:return          
		tracker.remove(bitmap);
	//   28   53:aload_0         
	//   29   54:getfield        #72  <Field LruBitmapPool$BitmapTracker tracker>
	//   30   57:aload_2         
	//   31   58:invokeinterface #223 <Method void LruBitmapPool$BitmapTracker.remove(Bitmap)>
		currentSize = currentSize - strategy.getSize(bitmap);
	//   32   63:aload_0         
	//   33   64:aload_0         
	//   34   65:getfield        #146 <Field int currentSize>
	//   35   68:aload_0         
	//   36   69:getfield        #67  <Field LruPoolStrategy strategy>
	//   37   72:aload_2         
	//   38   73:invokeinterface #220 <Method int LruPoolStrategy.getSize(Bitmap)>
	//   39   78:isub            
	//   40   79:putfield        #146 <Field int currentSize>
		evictions = evictions + 1;
	//   41   82:aload_0         
	//   42   83:aload_0         
	//   43   84:getfield        #142 <Field int evictions>
	//   44   87:iconst_1        
	//   45   88:iadd            
	//   46   89:putfield        #142 <Field int evictions>
		if(Log.isLoggable("LruBitmapPool", 3))
	//*  47   92:ldc1            #21  <String "LruBitmapPool">
	//*  48   94:iconst_3        
	//*  49   95:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*  50   98:ifeq            135
			Log.d("LruBitmapPool", (new StringBuilder()).append("Evicting bitmap=").append(strategy.logBitmap(bitmap)).toString());
	//   51  101:ldc1            #21  <String "LruBitmapPool">
	//   52  103:new             #93  <Class StringBuilder>
	//   53  106:dup             
	//   54  107:invokespecial   #94  <Method void StringBuilder()>
	//   55  110:ldc1            #254 <String "Evicting bitmap=">
	//   56  112:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:aload_0         
	//   58  116:getfield        #67  <Field LruPoolStrategy strategy>
	//   59  119:aload_2         
	//   60  120:invokeinterface #257 <Method String LruPoolStrategy.logBitmap(Bitmap)>
	//   61  125:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   62  128:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   63  131:invokestatic    #216 <Method int Log.d(String, String)>
	//   64  134:pop             
		dump();
	//   65  135:aload_0         
	//   66  136:invokespecial   #230 <Method void dump()>
		bitmap.recycle();
	//   67  139:aload_2         
	//   68  140:invokevirtual   #260 <Method void Bitmap.recycle()>
		if(true) goto _L2; else goto _L1
	//   69  143:goto            2
_L1:
		this;
	//   70  146:aload_0         
		JVM INSTR monitorexit ;
	//   71  147:monitorexit     
		return;
	//   72  148:return          
		Exception exception;
		exception;
	//   73  149:astore_2        
	//*  74  150:aload_0         
		throw exception;
	//   75  151:monitorexit     
	//   76  152:aload_2         
	//   77  153:athrow          
	}

	public void clearMemory()
	{
		if(Log.isLoggable("LruBitmapPool", 3))
	//*   0    0:ldc1            #21  <String "LruBitmapPool">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            18
			Log.d("LruBitmapPool", "clearMemory");
	//    4    9:ldc1            #21  <String "LruBitmapPool">
	//    5   11:ldc2            #262 <String "clearMemory">
	//    6   14:invokestatic    #216 <Method int Log.d(String, String)>
	//    7   17:pop             
		trimToSize(0);
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:invokespecial   #158 <Method void trimToSize(int)>
	//   11   23:return          
	}

	public Bitmap get(int i, int j, android.graphics.Bitmap.Config config)
	{
		Bitmap bitmap = getDirtyOrNull(i, j, config);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #265 <Method Bitmap getDirtyOrNull(int, int, android.graphics.Bitmap$Config)>
	//    5    7:astore          4
		if(bitmap != null)
	//*   6    9:aload           4
	//*   7   11:ifnull          23
		{
			bitmap.eraseColor(0);
	//    8   14:aload           4
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #268 <Method void Bitmap.eraseColor(int)>
			return bitmap;
	//   11   20:aload           4
	//   12   22:areturn         
		} else
		{
			return Bitmap.createBitmap(i, j, config);
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:aload_3         
	//   16   26:invokestatic    #271 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
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
	//    4    4:invokespecial   #265 <Method Bitmap getDirtyOrNull(int, int, android.graphics.Bitmap$Config)>
	//    5    7:astore          5
		Bitmap bitmap = bitmap1;
	//    6    9:aload           5
	//    7   11:astore          4
		if(bitmap1 == null)
	//*   8   13:aload           5
	//*   9   15:ifnonnull       26
			bitmap = Bitmap.createBitmap(i, j, config);
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:aload_3         
	//   13   21:invokestatic    #271 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   14   24:astore          4
		return bitmap;
	//   15   26:aload           4
	//   16   28:areturn         
	}

	public int getMaxSize()
	{
		return maxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int maxSize>
	//    2    4:ireturn         
	}

	public void put(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap != null)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_1         
	//    3    3:ifnonnull       17
		throw new NullPointerException("Bitmap must not be null");
	//    4    6:new             #277 <Class NullPointerException>
	//    5    9:dup             
	//    6   10:ldc2            #279 <String "Bitmap must not be null">
	//    7   13:invokespecial   #280 <Method void NullPointerException(String)>
	//    8   16:athrow          
		if(bitmap.isRecycled())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #284 <Method boolean Bitmap.isRecycled()>
	//*  11   21:ifeq            35
			throw new IllegalStateException("Cannot pool recycled bitmap");
	//   12   24:new             #286 <Class IllegalStateException>
	//   13   27:dup             
	//   14   28:ldc2            #288 <String "Cannot pool recycled bitmap">
	//   15   31:invokespecial   #289 <Method void IllegalStateException(String)>
	//   16   34:athrow          
		if(bitmap.isMutable() && strategy.getSize(bitmap) <= maxSize && allowedConfigs.contains(((Object) (bitmap.getConfig()))))
			break MISSING_BLOCK_LABEL_161;
	//   17   35:aload_1         
	//   18   36:invokevirtual   #292 <Method boolean Bitmap.isMutable()>
	//   19   39:ifeq            75
	//   20   42:aload_0         
	//   21   43:getfield        #67  <Field LruPoolStrategy strategy>
	//   22   46:aload_1         
	//   23   47:invokeinterface #220 <Method int LruPoolStrategy.getSize(Bitmap)>
	//   24   52:aload_0         
	//   25   53:getfield        #65  <Field int maxSize>
	//   26   56:icmpgt          75
	//   27   59:aload_0         
	//   28   60:getfield        #69  <Field Set allowedConfigs>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #296 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   31   67:invokeinterface #299 <Method boolean Set.contains(Object)>
	//   32   72:ifne            161
		if(Log.isLoggable("LruBitmapPool", 2))
	//*  33   75:ldc1            #21  <String "LruBitmapPool">
	//*  34   77:iconst_2        
	//*  35   78:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*  36   81:ifeq            154
			Log.v("LruBitmapPool", (new StringBuilder()).append("Reject bitmap from pool, bitmap: ").append(strategy.logBitmap(bitmap)).append(", is mutable: ").append(bitmap.isMutable()).append(", is allowed config: ").append(allowedConfigs.contains(((Object) (bitmap.getConfig())))).toString());
	//   37   84:ldc1            #21  <String "LruBitmapPool">
	//   38   86:new             #93  <Class StringBuilder>
	//   39   89:dup             
	//   40   90:invokespecial   #94  <Method void StringBuilder()>
	//   41   93:ldc2            #301 <String "Reject bitmap from pool, bitmap: ">
	//   42   96:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   43   99:aload_0         
	//   44  100:getfield        #67  <Field LruPoolStrategy strategy>
	//   45  103:aload_1         
	//   46  104:invokeinterface #257 <Method String LruPoolStrategy.logBitmap(Bitmap)>
	//   47  109:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   48  112:ldc2            #303 <String ", is mutable: ">
	//   49  115:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   50  118:aload_1         
	//   51  119:invokevirtual   #292 <Method boolean Bitmap.isMutable()>
	//   52  122:invokevirtual   #306 <Method StringBuilder StringBuilder.append(boolean)>
	//   53  125:ldc2            #308 <String ", is allowed config: ">
	//   54  128:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   55  131:aload_0         
	//   56  132:getfield        #69  <Field Set allowedConfigs>
	//   57  135:aload_1         
	//   58  136:invokevirtual   #296 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   59  139:invokeinterface #299 <Method boolean Set.contains(Object)>
	//   60  144:invokevirtual   #306 <Method StringBuilder StringBuilder.append(boolean)>
	//   61  147:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   62  150:invokestatic    #154 <Method int Log.v(String, String)>
	//   63  153:pop             
		bitmap.recycle();
	//   64  154:aload_1         
	//   65  155:invokevirtual   #260 <Method void Bitmap.recycle()>
		this;
	//   66  158:aload_0         
		JVM INSTR monitorexit ;
	//   67  159:monitorexit     
		return;
	//   68  160:return          
		int i = strategy.getSize(bitmap);
	//   69  161:aload_0         
	//   70  162:getfield        #67  <Field LruPoolStrategy strategy>
	//   71  165:aload_1         
	//   72  166:invokeinterface #220 <Method int LruPoolStrategy.getSize(Bitmap)>
	//   73  171:istore_2        
		strategy.put(bitmap);
	//   74  172:aload_0         
	//   75  173:getfield        #67  <Field LruPoolStrategy strategy>
	//   76  176:aload_1         
	//   77  177:invokeinterface #310 <Method void LruPoolStrategy.put(Bitmap)>
		tracker.add(bitmap);
	//   78  182:aload_0         
	//   79  183:getfield        #72  <Field LruBitmapPool$BitmapTracker tracker>
	//   80  186:aload_1         
	//   81  187:invokeinterface #312 <Method void LruBitmapPool$BitmapTracker.add(Bitmap)>
		puts = puts + 1;
	//   82  192:aload_0         
	//   83  193:aload_0         
	//   84  194:getfield        #138 <Field int puts>
	//   85  197:iconst_1        
	//   86  198:iadd            
	//   87  199:putfield        #138 <Field int puts>
		currentSize = currentSize + i;
	//   88  202:aload_0         
	//   89  203:aload_0         
	//   90  204:getfield        #146 <Field int currentSize>
	//   91  207:iload_2         
	//   92  208:iadd            
	//   93  209:putfield        #146 <Field int currentSize>
		if(Log.isLoggable("LruBitmapPool", 2))
	//*  94  212:ldc1            #21  <String "LruBitmapPool">
	//*  95  214:iconst_2        
	//*  96  215:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*  97  218:ifeq            256
			Log.v("LruBitmapPool", (new StringBuilder()).append("Put bitmap in pool=").append(strategy.logBitmap(bitmap)).toString());
	//   98  221:ldc1            #21  <String "LruBitmapPool">
	//   99  223:new             #93  <Class StringBuilder>
	//  100  226:dup             
	//  101  227:invokespecial   #94  <Method void StringBuilder()>
	//  102  230:ldc2            #314 <String "Put bitmap in pool=">
	//  103  233:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  104  236:aload_0         
	//  105  237:getfield        #67  <Field LruPoolStrategy strategy>
	//  106  240:aload_1         
	//  107  241:invokeinterface #257 <Method String LruPoolStrategy.logBitmap(Bitmap)>
	//  108  246:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  109  249:invokevirtual   #109 <Method String StringBuilder.toString()>
	//  110  252:invokestatic    #154 <Method int Log.v(String, String)>
	//  111  255:pop             
		dump();
	//  112  256:aload_0         
	//  113  257:invokespecial   #230 <Method void dump()>
		evict();
	//  114  260:aload_0         
	//  115  261:invokespecial   #316 <Method void evict()>
		this;
	//  116  264:aload_0         
		JVM INSTR monitorexit ;
	//  117  265:monitorexit     
		return;
	//  118  266:return          
		bitmap;
	//  119  267:astore_1        
	//* 120  268:aload_0         
		throw bitmap;
	//  121  269:monitorexit     
	//  122  270:aload_1         
	//  123  271:athrow          
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
	//    4    4:getfield        #63  <Field int initialMaxSize>
	//    5    7:i2f             
	//    6    8:fload_1         
	//    7    9:fmul            
	//    8   10:invokestatic    #324 <Method int Math.round(float)>
	//    9   13:putfield        #65  <Field int maxSize>
		evict();
	//   10   16:aload_0         
	//   11   17:invokespecial   #316 <Method void evict()>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		Exception exception;
		exception;
	//   15   23:astore_2        
	//*  16   24:aload_0         
		throw exception;
	//   17   25:monitorexit     
	//   18   26:aload_2         
	//   19   27:athrow          
	}

	public void trimMemory(int i)
	{
		if(Log.isLoggable("LruBitmapPool", 3))
	//*   0    0:ldc1            #21  <String "LruBitmapPool">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #120 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            35
			Log.d("LruBitmapPool", (new StringBuilder()).append("trimMemory, level=").append(i).toString());
	//    4    9:ldc1            #21  <String "LruBitmapPool">
	//    5   11:new             #93  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #94  <Method void StringBuilder()>
	//    8   18:ldc2            #329 <String "trimMemory, level=">
	//    9   21:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:iload_1         
	//   11   25:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   12   28:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   13   31:invokestatic    #216 <Method int Log.d(String, String)>
	//   14   34:pop             
		if(i >= 40)
	//*  15   35:iload_1         
	//*  16   36:bipush          40
	//*  17   38:icmplt          46
		{
			clearMemory();
	//   18   41:aload_0         
	//   19   42:invokevirtual   #331 <Method void clearMemory()>
			return;
	//   20   45:return          
		}
		if(i >= 20)
	//*  21   46:iload_1         
	//*  22   47:bipush          20
	//*  23   49:icmplt          62
			trimToSize(maxSize / 2);
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:getfield        #65  <Field int maxSize>
	//   27   57:iconst_2        
	//   28   58:idiv            
	//   29   59:invokespecial   #158 <Method void trimToSize(int)>
	//   30   62:return          
	}

	private static final android.graphics.Bitmap.Config DEFAULT_CONFIG;
	private static final String TAG = "LruBitmapPool";
	private final Set allowedConfigs;
	private int currentSize;
	private int evictions;
	private int hits;
	private final int initialMaxSize;
	private int maxSize;
	private int misses;
	private int puts;
	private final LruPoolStrategy strategy;
	private final BitmapTracker tracker;

	static 
	{
		DEFAULT_CONFIG = android.graphics.Bitmap.Config.ARGB_8888;
	//    0    0:getstatic       #43  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    1    3:putstatic       #45  <Field android.graphics.Bitmap$Config DEFAULT_CONFIG>
	//*   2    6:return          
	}
}
