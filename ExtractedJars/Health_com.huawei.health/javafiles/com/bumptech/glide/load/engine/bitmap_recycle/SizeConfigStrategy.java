// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import com.bumptech.glide.util.Util;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			LruPoolStrategy, GroupedLinkedMap, Poolable, BaseKeyPool

public class SizeConfigStrategy
	implements LruPoolStrategy
{
	static final class Key
		implements Poolable
	{

		public boolean equals(Object obj)
		{
			if(obj instanceof Key)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class SizeConfigStrategy$Key>
		//*   2    4:ifeq            41
			{
				obj = ((Object) ((Key)obj));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class SizeConfigStrategy$Key>
		//    5   11:astore_1        
				return size == ((Key) (obj)).size && Util.bothNullOrEqual(((Object) (config)), ((Object) (((Key) (obj)).config)));
		//    6   12:aload_0         
		//    7   13:getfield        #34  <Field int size>
		//    8   16:aload_1         
		//    9   17:getfield        #34  <Field int size>
		//   10   20:icmpne          39
		//   11   23:aload_0         
		//   12   24:getfield        #36  <Field android.graphics.Bitmap$Config config>
		//   13   27:aload_1         
		//   14   28:getfield        #36  <Field android.graphics.Bitmap$Config config>
		//   15   31:invokestatic    #42  <Method boolean Util.bothNullOrEqual(Object, Object)>
		//   16   34:ifeq            39
		//   17   37:iconst_1        
		//   18   38:ireturn         
		//   19   39:iconst_0        
		//   20   40:ireturn         
			} else
			{
				return false;
		//   21   41:iconst_0        
		//   22   42:ireturn         
			}
		}

		public int hashCode()
		{
			int j = size;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int size>
		//    2    4:istore_2        
			int i;
			if(config != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #36  <Field android.graphics.Bitmap$Config config>
		//*   5    9:ifnull          23
				i = config.hashCode();
		//    6   12:aload_0         
		//    7   13:getfield        #36  <Field android.graphics.Bitmap$Config config>
		//    8   16:invokevirtual   #48  <Method int android.graphics.Bitmap$Config.hashCode()>
		//    9   19:istore_1        
			else
		//*  10   20:goto            25
				i = 0;
		//   11   23:iconst_0        
		//   12   24:istore_1        
			return j * 31 + i;
		//   13   25:iload_2         
		//   14   26:bipush          31
		//   15   28:imul            
		//   16   29:iload_1         
		//   17   30:iadd            
		//   18   31:ireturn         
		}

		public void init(int i, android.graphics.Bitmap.Config config1)
		{
			size = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #34  <Field int size>
			config = config1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #36  <Field android.graphics.Bitmap$Config config>
		//    6   10:return          
		}

		public void offer()
		{
			pool.offer(((Poolable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field SizeConfigStrategy$KeyPool pool>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #54  <Method void SizeConfigStrategy$KeyPool.offer(Poolable)>
		//    4    8:return          
		}

		public String toString()
		{
			return SizeConfigStrategy.getBitmapString(size, config);
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int size>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field android.graphics.Bitmap$Config config>
		//    4    8:invokestatic    #60  <Method String SizeConfigStrategy.getBitmapString(int, android.graphics.Bitmap$Config)>
		//    5   11:areturn         
		}

		private android.graphics.Bitmap.Config config;
		private final KeyPool pool;
		int size;

		public Key(KeyPool keypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			pool = keypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field SizeConfigStrategy$KeyPool pool>
		//    5    9:return          
		}

		Key(KeyPool keypool, int i, android.graphics.Bitmap.Config config1)
		{
			this(keypool);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void SizeConfigStrategy$Key(SizeConfigStrategy$KeyPool)>
			init(i, config1);
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:aload_3         
		//    6    8:invokevirtual   #30  <Method void init(int, android.graphics.Bitmap$Config)>
		//    7   11:return          
		}
	}

	static class KeyPool extends BaseKeyPool
	{

		protected volatile Poolable create()
		{
			return ((Poolable) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #18  <Method SizeConfigStrategy$Key create()>
		//    2    4:areturn         
		}

		protected Key create()
		{
			return new Key(this);
		//    0    0:new             #20  <Class SizeConfigStrategy$Key>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #23  <Method void SizeConfigStrategy$Key(SizeConfigStrategy$KeyPool)>
		//    4    8:areturn         
		}

		public Key get(int i, android.graphics.Bitmap.Config config)
		{
			Key key = (Key)get();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #27  <Method Poolable get()>
		//    2    4:checkcast       #20  <Class SizeConfigStrategy$Key>
		//    3    7:astore_3        
			key.init(i, config);
		//    4    8:aload_3         
		//    5    9:iload_1         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #31  <Method void SizeConfigStrategy$Key.init(int, android.graphics.Bitmap$Config)>
			return key;
		//    8   14:aload_3         
		//    9   15:areturn         
		}

		KeyPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void BaseKeyPool()>
		//    2    4:return          
		}
	}


	public SizeConfigStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class SizeConfigStrategy$KeyPool>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void SizeConfigStrategy$KeyPool()>
	//    6   12:putfield        #65  <Field SizeConfigStrategy$KeyPool keyPool>
	//    7   15:aload_0         
	//    8   16:new             #67  <Class GroupedLinkedMap>
	//    9   19:dup             
	//   10   20:invokespecial   #68  <Method void GroupedLinkedMap()>
	//   11   23:putfield        #70  <Field GroupedLinkedMap groupedMap>
	//   12   26:aload_0         
	//   13   27:new             #72  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #73  <Method void HashMap()>
	//   16   34:putfield        #75  <Field Map sortedSizes>
	//   17   37:return          
	}

	private void decrementBitmapOfSize(Integer integer, Bitmap bitmap)
	{
		NavigableMap navigablemap = getSizesForConfig(bitmap.getConfig());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #83  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    3    5:invokespecial   #87  <Method NavigableMap getSizesForConfig(android.graphics.Bitmap$Config)>
	//    4    8:astore_3        
		Integer integer1 = (Integer)navigablemap.get(((Object) (integer)));
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokeinterface #93  <Method Object NavigableMap.get(Object)>
	//    8   16:checkcast       #95  <Class Integer>
	//    9   19:astore          4
		if(integer1 == null)
	//*  10   21:aload           4
	//*  11   23:ifnonnull       75
			throw new NullPointerException((new StringBuilder()).append("Tried to decrement empty size, size: ").append(((Object) (integer))).append(", removed: ").append(logBitmap(bitmap)).append(", this: ").append(((Object) (this))).toString());
	//   12   26:new             #97  <Class NullPointerException>
	//   13   29:dup             
	//   14   30:new             #99  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #100 <Method void StringBuilder()>
	//   17   37:ldc1            #102 <String "Tried to decrement empty size, size: ">
	//   18   39:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:aload_1         
	//   20   43:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   21   46:ldc1            #111 <String ", removed: ">
	//   22   48:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:aload_0         
	//   24   52:aload_2         
	//   25   53:invokevirtual   #115 <Method String logBitmap(Bitmap)>
	//   26   56:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:ldc1            #117 <String ", this: ">
	//   28   61:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   29   64:aload_0         
	//   30   65:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   31   68:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   32   71:invokespecial   #124 <Method void NullPointerException(String)>
	//   33   74:athrow          
		if(integer1.intValue() == 1)
	//*  34   75:aload           4
	//*  35   77:invokevirtual   #128 <Method int Integer.intValue()>
	//*  36   80:iconst_1        
	//*  37   81:icmpne          93
		{
			navigablemap.remove(((Object) (integer)));
	//   38   84:aload_3         
	//   39   85:aload_1         
	//   40   86:invokeinterface #131 <Method Object NavigableMap.remove(Object)>
	//   41   91:pop             
			return;
	//   42   92:return          
		} else
		{
			navigablemap.put(((Object) (integer)), ((Object) (Integer.valueOf(integer1.intValue() - 1))));
	//   43   93:aload_3         
	//   44   94:aload_1         
	//   45   95:aload           4
	//   46   97:invokevirtual   #128 <Method int Integer.intValue()>
	//   47  100:iconst_1        
	//   48  101:isub            
	//   49  102:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   50  105:invokeinterface #139 <Method Object NavigableMap.put(Object, Object)>
	//   51  110:pop             
			return;
	//   52  111:return          
		}
	}

	private Key findBestKey(int i, android.graphics.Bitmap.Config config)
	{
		Key key = keyPool.get(i, config);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SizeConfigStrategy$KeyPool keyPool>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #143 <Method SizeConfigStrategy$Key SizeConfigStrategy$KeyPool.get(int, android.graphics.Bitmap$Config)>
	//    5    9:astore          5
		android.graphics.Bitmap.Config aconfig[] = getInConfigs(config);
	//    6   11:aload_2         
	//    7   12:invokestatic    #147 <Method android.graphics.Bitmap$Config[] getInConfigs(android.graphics.Bitmap$Config)>
	//    8   15:astore          6
		int k = aconfig.length;
	//    9   17:aload           6
	//   10   19:arraylength     
	//   11   20:istore          4
		int j = 0;
	//   12   22:iconst_0        
	//   13   23:istore_3        
		do
		{
			if(j >= k)
				break;
	//   14   24:iload_3         
	//   15   25:iload           4
	//   16   27:icmpge          134
			android.graphics.Bitmap.Config config1 = aconfig[j];
	//   17   30:aload           6
	//   18   32:iload_3         
	//   19   33:aaload          
	//   20   34:astore          7
			Integer integer = (Integer)getSizesForConfig(config1).ceilingKey(((Object) (Integer.valueOf(i))));
	//   21   36:aload_0         
	//   22   37:aload           7
	//   23   39:invokespecial   #87  <Method NavigableMap getSizesForConfig(android.graphics.Bitmap$Config)>
	//   24   42:iload_1         
	//   25   43:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   26   46:invokeinterface #150 <Method Object NavigableMap.ceilingKey(Object)>
	//   27   51:checkcast       #95  <Class Integer>
	//   28   54:astore          8
			if(integer != null && integer.intValue() <= i * 8)
	//*  29   56:aload           8
	//*  30   58:ifnull          127
	//*  31   61:aload           8
	//*  32   63:invokevirtual   #128 <Method int Integer.intValue()>
	//*  33   66:iload_1         
	//*  34   67:bipush          8
	//*  35   69:imul            
	//*  36   70:icmpgt          127
			{
				if(integer.intValue() != i || (config1 != null ? !config1.equals(((Object) (config))) : config != null))
	//*  37   73:aload           8
	//*  38   75:invokevirtual   #128 <Method int Integer.intValue()>
	//*  39   78:iload_1         
	//*  40   79:icmpne          103
	//*  41   82:aload           7
	//*  42   84:ifnonnull       94
	//*  43   87:aload_2         
	//*  44   88:ifnull          134
	//*  45   91:goto            103
	//*  46   94:aload           7
	//*  47   96:aload_2         
	//*  48   97:invokevirtual   #154 <Method boolean android.graphics.Bitmap$Config.equals(Object)>
	//*  49  100:ifne            134
				{
					keyPool.offer(((Poolable) (key)));
	//   50  103:aload_0         
	//   51  104:getfield        #65  <Field SizeConfigStrategy$KeyPool keyPool>
	//   52  107:aload           5
	//   53  109:invokevirtual   #158 <Method void SizeConfigStrategy$KeyPool.offer(Poolable)>
					return keyPool.get(integer.intValue(), config1);
	//   54  112:aload_0         
	//   55  113:getfield        #65  <Field SizeConfigStrategy$KeyPool keyPool>
	//   56  116:aload           8
	//   57  118:invokevirtual   #128 <Method int Integer.intValue()>
	//   58  121:aload           7
	//   59  123:invokevirtual   #143 <Method SizeConfigStrategy$Key SizeConfigStrategy$KeyPool.get(int, android.graphics.Bitmap$Config)>
	//   60  126:areturn         
				}
				break;
			}
			j++;
	//   61  127:iload_3         
	//   62  128:iconst_1        
	//   63  129:iadd            
	//   64  130:istore_3        
		} while(true);
	//   65  131:goto            24
		return key;
	//   66  134:aload           5
	//   67  136:areturn         
	}

	static String getBitmapString(int i, android.graphics.Bitmap.Config config)
	{
		return (new StringBuilder()).append("[").append(i).append("](").append(((Object) (config))).append(")").toString();
	//    0    0:new             #99  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void StringBuilder()>
	//    3    7:ldc1            #162 <String "[">
	//    4    9:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:iload_0         
	//    6   13:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//    7   16:ldc1            #167 <String "](">
	//    8   18:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   11   25:ldc1            #169 <String ")">
	//   12   27:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   14   33:areturn         
	}

	private static android.graphics.Bitmap.Config[] getInConfigs(android.graphics.Bitmap.Config config)
	{
		static class _cls1
		{

			static final int $SwitchMap$android$graphics$Bitmap$Config[];

			static 
			{
				$SwitchMap$android$graphics$Bitmap$Config = new int[android.graphics.Bitmap.Config.values().length];
			//    0    0:invokestatic    #18  <Method android.graphics.Bitmap$Config[] android.graphics.Bitmap$Config.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//    5   12:getstatic       #24  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
			//    6   15:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
			//   11   24:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//   12   27:getstatic       #31  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
			//   13   30:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
			//   18   39:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//   19   42:getstatic       #34  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
			//   20   45:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
				}
			//*  23   50:goto            54
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   53:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 4;
			//   25   54:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//   26   57:getstatic       #37  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
			//   27   60:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//   28   63:iconst_4        
			//   29   64:iastore         
			//   30   65:return          
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1..SwitchMap.android.graphics.Bitmap.Config[config.ordinal()])
	//*   0    0:getstatic       #173 <Field int[] SizeConfigStrategy$1.$SwitchMap$android$graphics$Bitmap$Config>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #176 <Method int android.graphics.Bitmap$Config.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 4: default 40
	//	               1 43
	//	               2 47
	//	               3 51
	//	               4 55
	//*   5   40:goto            59
		case 1: // '\001'
			return ARGB_8888_IN_CONFIGS;
	//    6   43:getstatic       #43  <Field android.graphics.Bitmap$Config[] ARGB_8888_IN_CONFIGS>
	//    7   46:areturn         

		case 2: // '\002'
			return RGB_565_IN_CONFIGS;
	//    8   47:getstatic       #48  <Field android.graphics.Bitmap$Config[] RGB_565_IN_CONFIGS>
	//    9   50:areturn         

		case 3: // '\003'
			return ARGB_4444_IN_CONFIGS;
	//   10   51:getstatic       #53  <Field android.graphics.Bitmap$Config[] ARGB_4444_IN_CONFIGS>
	//   11   54:areturn         

		case 4: // '\004'
			return ALPHA_8_IN_CONFIGS;
	//   12   55:getstatic       #58  <Field android.graphics.Bitmap$Config[] ALPHA_8_IN_CONFIGS>
	//   13   58:areturn         
		}
		return (new android.graphics.Bitmap.Config[] {
			config
		});
	//   14   59:iconst_1        
	//   15   60:anewarray       android.graphics.Bitmap.Config[]
	//   16   63:dup             
	//   17   64:iconst_0        
	//   18   65:aload_0         
	//   19   66:aastore         
	//   20   67:areturn         
	}

	private NavigableMap getSizesForConfig(android.graphics.Bitmap.Config config)
	{
		NavigableMap navigablemap = (NavigableMap)sortedSizes.get(((Object) (config)));
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Map sortedSizes>
	//    2    4:aload_1         
	//    3    5:invokeinterface #179 <Method Object Map.get(Object)>
	//    4   10:checkcast       #89  <Class NavigableMap>
	//    5   13:astore_3        
		Object obj = ((Object) (navigablemap));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(navigablemap == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       40
		{
			obj = ((Object) (new TreeMap()));
	//   10   20:new             #181 <Class TreeMap>
	//   11   23:dup             
	//   12   24:invokespecial   #182 <Method void TreeMap()>
	//   13   27:astore_2        
			sortedSizes.put(((Object) (config)), obj);
	//   14   28:aload_0         
	//   15   29:getfield        #75  <Field Map sortedSizes>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//   19   39:pop             
		}
		return ((NavigableMap) (obj));
	//   20   40:aload_2         
	//   21   41:areturn         
	}

	public Bitmap get(int i, int j, android.graphics.Bitmap.Config config)
	{
		config = ((android.graphics.Bitmap.Config) (findBestKey(Util.getBitmapByteSize(i, j, config), config)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #193 <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//    5    7:aload_3         
	//    6    8:invokespecial   #195 <Method SizeConfigStrategy$Key findBestKey(int, android.graphics.Bitmap$Config)>
	//    7   11:astore_3        
		Bitmap bitmap = (Bitmap)groupedMap.get(((Poolable) (config)));
	//    8   12:aload_0         
	//    9   13:getfield        #70  <Field GroupedLinkedMap groupedMap>
	//   10   16:aload_3         
	//   11   17:invokevirtual   #198 <Method Object GroupedLinkedMap.get(Poolable)>
	//   12   20:checkcast       #79  <Class Bitmap>
	//   13   23:astore          4
		if(bitmap != null)
	//*  14   25:aload           4
	//*  15   27:ifnull          72
		{
			decrementBitmapOfSize(Integer.valueOf(((Key) (config)).size), bitmap);
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:getfield        #201 <Field int SizeConfigStrategy$Key.size>
	//   19   35:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   20   38:aload           4
	//   21   40:invokespecial   #203 <Method void decrementBitmapOfSize(Integer, Bitmap)>
			if(bitmap.getConfig() != null)
	//*  22   43:aload           4
	//*  23   45:invokevirtual   #83  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*  24   48:ifnull          60
				config = bitmap.getConfig();
	//   25   51:aload           4
	//   26   53:invokevirtual   #83  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   27   56:astore_3        
			else
	//*  28   57:goto            64
				config = android.graphics.Bitmap.Config.ARGB_8888;
	//   29   60:getstatic       #41  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   30   63:astore_3        
			bitmap.reconfigure(i, j, config);
	//   31   64:aload           4
	//   32   66:iload_1         
	//   33   67:iload_2         
	//   34   68:aload_3         
	//   35   69:invokevirtual   #207 <Method void Bitmap.reconfigure(int, int, android.graphics.Bitmap$Config)>
		}
		return bitmap;
	//   36   72:aload           4
	//   37   74:areturn         
	}

	public int getSize(Bitmap bitmap)
	{
		return Util.getBitmapByteSize(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #212 <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:ireturn         
	}

	public String logBitmap(int i, int j, android.graphics.Bitmap.Config config)
	{
		return getBitmapString(Util.getBitmapByteSize(i, j, config), config);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #193 <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//    4    6:aload_3         
	//    5    7:invokestatic    #215 <Method String getBitmapString(int, android.graphics.Bitmap$Config)>
	//    6   10:areturn         
	}

	public String logBitmap(Bitmap bitmap)
	{
		return getBitmapString(Util.getBitmapByteSize(bitmap), bitmap.getConfig());
	//    0    0:aload_1         
	//    1    1:invokestatic    #212 <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    4    8:invokestatic    #215 <Method String getBitmapString(int, android.graphics.Bitmap$Config)>
	//    5   11:areturn         
	}

	public void put(Bitmap bitmap)
	{
		int i = Util.getBitmapByteSize(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #212 <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:istore_2        
		Key key = keyPool.get(i, bitmap.getConfig());
	//    3    5:aload_0         
	//    4    6:getfield        #65  <Field SizeConfigStrategy$KeyPool keyPool>
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #83  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    8   14:invokevirtual   #143 <Method SizeConfigStrategy$Key SizeConfigStrategy$KeyPool.get(int, android.graphics.Bitmap$Config)>
	//    9   17:astore          4
		groupedMap.put(((Poolable) (key)), ((Object) (bitmap)));
	//   10   19:aload_0         
	//   11   20:getfield        #70  <Field GroupedLinkedMap groupedMap>
	//   12   23:aload           4
	//   13   25:aload_1         
	//   14   26:invokevirtual   #219 <Method void GroupedLinkedMap.put(Poolable, Object)>
		bitmap = ((Bitmap) (getSizesForConfig(bitmap.getConfig())));
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #83  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   18   34:invokespecial   #87  <Method NavigableMap getSizesForConfig(android.graphics.Bitmap$Config)>
	//   19   37:astore_1        
		Integer integer = (Integer)((NavigableMap) (bitmap)).get(((Object) (Integer.valueOf(key.size))));
	//   20   38:aload_1         
	//   21   39:aload           4
	//   22   41:getfield        #201 <Field int SizeConfigStrategy$Key.size>
	//   23   44:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   24   47:invokeinterface #93  <Method Object NavigableMap.get(Object)>
	//   25   52:checkcast       #95  <Class Integer>
	//   26   55:astore          5
		int j = key.size;
	//   27   57:aload           4
	//   28   59:getfield        #201 <Field int SizeConfigStrategy$Key.size>
	//   29   62:istore_3        
		if(integer == null)
	//*  30   63:aload           5
	//*  31   65:ifnonnull       73
			i = 1;
	//   32   68:iconst_1        
	//   33   69:istore_2        
		else
	//*  34   70:goto            81
			i = integer.intValue() + 1;
	//   35   73:aload           5
	//   36   75:invokevirtual   #128 <Method int Integer.intValue()>
	//   37   78:iconst_1        
	//   38   79:iadd            
	//   39   80:istore_2        
		((NavigableMap) (bitmap)).put(((Object) (Integer.valueOf(j))), ((Object) (Integer.valueOf(i))));
	//   40   81:aload_1         
	//   41   82:iload_3         
	//   42   83:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   43   86:iload_2         
	//   44   87:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   45   90:invokeinterface #139 <Method Object NavigableMap.put(Object, Object)>
	//   46   95:pop             
	//   47   96:return          
	}

	public Bitmap removeLast()
	{
		Bitmap bitmap = (Bitmap)groupedMap.removeLast();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field GroupedLinkedMap groupedMap>
	//    2    4:invokevirtual   #224 <Method Object GroupedLinkedMap.removeLast()>
	//    3    7:checkcast       #79  <Class Bitmap>
	//    4   10:astore_1        
		if(bitmap != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          27
			decrementBitmapOfSize(Integer.valueOf(Util.getBitmapByteSize(bitmap)), bitmap);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #212 <Method int Util.getBitmapByteSize(Bitmap)>
	//   10   20:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   11   23:aload_1         
	//   12   24:invokespecial   #203 <Method void decrementBitmapOfSize(Integer, Bitmap)>
		return bitmap;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = (new StringBuilder()).append("SizeConfigStrategy{groupedMap=").append(((Object) (groupedMap))).append(", sortedSizes=(");
	//    0    0:new             #99  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void StringBuilder()>
	//    3    7:ldc1            #226 <String "SizeConfigStrategy{groupedMap=">
	//    4    9:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #70  <Field GroupedLinkedMap groupedMap>
	//    7   16:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #228 <String ", sortedSizes=(">
	//    9   21:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = sortedSizes.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(entry.getKey()).append('[').append(entry.getValue()).append("], "))
	//*  11   25:aload_0         
	//*  12   26:getfield        #75  <Field Map sortedSizes>
	//*  13   29:invokeinterface #232 <Method Set Map.entrySet()>
	//*  14   34:invokeinterface #238 <Method Iterator Set.iterator()>
	//*  15   39:astore_2        
	//*  16   40:aload_2         
	//*  17   41:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//*  18   46:ifeq            93
			entry = (java.util.Map.Entry)iterator.next();
	//   19   49:aload_2         
	//   20   50:invokeinterface #247 <Method Object Iterator.next()>
	//   21   55:checkcast       #249 <Class java.util.Map$Entry>
	//   22   58:astore_3        

	//   23   59:aload_1         
	//   24   60:aload_3         
	//   25   61:invokeinterface #252 <Method Object java.util.Map$Entry.getKey()>
	//   26   66:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   27   69:bipush          91
	//   28   71:invokevirtual   #255 <Method StringBuilder StringBuilder.append(char)>
	//   29   74:aload_3         
	//   30   75:invokeinterface #258 <Method Object java.util.Map$Entry.getValue()>
	//   31   80:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   32   83:ldc2            #260 <String "], ">
	//   33   86:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   34   89:pop             
	//*  35   90:goto            40
		if(!sortedSizes.isEmpty())
	//*  36   93:aload_0         
	//*  37   94:getfield        #75  <Field Map sortedSizes>
	//*  38   97:invokeinterface #263 <Method boolean Map.isEmpty()>
	//*  39  102:ifne            123
			stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length(), "");
	//   40  105:aload_1         
	//   41  106:aload_1         
	//   42  107:invokevirtual   #266 <Method int StringBuilder.length()>
	//   43  110:iconst_2        
	//   44  111:isub            
	//   45  112:aload_1         
	//   46  113:invokevirtual   #266 <Method int StringBuilder.length()>
	//   47  116:ldc2            #268 <String "">
	//   48  119:invokevirtual   #272 <Method StringBuilder StringBuilder.replace(int, int, String)>
	//   49  122:pop             
		return stringbuilder.append(")}").toString();
	//   50  123:aload_1         
	//   51  124:ldc2            #274 <String ")}">
	//   52  127:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   53  130:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   54  133:areturn         
	}

	private static final android.graphics.Bitmap.Config ALPHA_8_IN_CONFIGS[];
	private static final android.graphics.Bitmap.Config ARGB_4444_IN_CONFIGS[];
	private static final android.graphics.Bitmap.Config ARGB_8888_IN_CONFIGS[];
	private static final int MAX_SIZE_MULTIPLE = 8;
	private static final android.graphics.Bitmap.Config RGB_565_IN_CONFIGS[];
	private final GroupedLinkedMap groupedMap = new GroupedLinkedMap();
	private final KeyPool keyPool = new KeyPool();
	private final Map sortedSizes = new HashMap();

	static 
	{
		ARGB_8888_IN_CONFIGS = (new android.graphics.Bitmap.Config[] {
			android.graphics.Bitmap.Config.ARGB_8888, null
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       android.graphics.Bitmap.Config[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:getstatic       #41  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:aconst_null     
	//    9   13:aastore         
	//   10   14:putstatic       #43  <Field android.graphics.Bitmap$Config[] ARGB_8888_IN_CONFIGS>
		RGB_565_IN_CONFIGS = (new android.graphics.Bitmap.Config[] {
			android.graphics.Bitmap.Config.RGB_565
		});
	//   11   17:iconst_1        
	//   12   18:anewarray       android.graphics.Bitmap.Config[]
	//   13   21:dup             
	//   14   22:iconst_0        
	//   15   23:getstatic       #46  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   16   26:aastore         
	//   17   27:putstatic       #48  <Field android.graphics.Bitmap$Config[] RGB_565_IN_CONFIGS>
		ARGB_4444_IN_CONFIGS = (new android.graphics.Bitmap.Config[] {
			android.graphics.Bitmap.Config.ARGB_4444
		});
	//   18   30:iconst_1        
	//   19   31:anewarray       android.graphics.Bitmap.Config[]
	//   20   34:dup             
	//   21   35:iconst_0        
	//   22   36:getstatic       #51  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
	//   23   39:aastore         
	//   24   40:putstatic       #53  <Field android.graphics.Bitmap$Config[] ARGB_4444_IN_CONFIGS>
		ALPHA_8_IN_CONFIGS = (new android.graphics.Bitmap.Config[] {
			android.graphics.Bitmap.Config.ALPHA_8
		});
	//   25   43:iconst_1        
	//   26   44:anewarray       android.graphics.Bitmap.Config[]
	//   27   47:dup             
	//   28   48:iconst_0        
	//   29   49:getstatic       #56  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
	//   30   52:aastore         
	//   31   53:putstatic       #58  <Field android.graphics.Bitmap$Config[] ALPHA_8_IN_CONFIGS>
	//*  32   56:return          
	}
}
