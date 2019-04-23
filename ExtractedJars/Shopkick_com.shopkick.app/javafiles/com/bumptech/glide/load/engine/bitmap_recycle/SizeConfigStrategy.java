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
			boolean flag = obj instanceof Key;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class SizeConfigStrategy$Key>
		//    2    4:istore_2        
			boolean flag2 = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			if(flag)
		//*   5    7:iload_2         
		//*   6    8:ifeq            49
			{
				obj = ((Object) ((Key)obj));
		//    7   11:aload_1         
		//    8   12:checkcast       #2   <Class SizeConfigStrategy$Key>
		//    9   15:astore_1        
				boolean flag1 = flag2;
		//   10   16:iload_3         
		//   11   17:istore_2        
				if(size == ((Key) (obj)).size)
		//*  12   18:aload_0         
		//*  13   19:getfield        #36  <Field int size>
		//*  14   22:aload_1         
		//*  15   23:getfield        #36  <Field int size>
		//*  16   26:icmpne          47
				{
					flag1 = flag2;
		//   17   29:iload_3         
		//   18   30:istore_2        
					if(Util.bothNullOrEqual(((Object) (config)), ((Object) (((Key) (obj)).config))))
		//*  19   31:aload_0         
		//*  20   32:getfield        #38  <Field android.graphics.Bitmap$Config config>
		//*  21   35:aload_1         
		//*  22   36:getfield        #38  <Field android.graphics.Bitmap$Config config>
		//*  23   39:invokestatic    #44  <Method boolean Util.bothNullOrEqual(Object, Object)>
		//*  24   42:ifeq            47
						flag1 = true;
		//   25   45:iconst_1        
		//   26   46:istore_2        
				}
				return flag1;
		//   27   47:iload_2         
		//   28   48:ireturn         
			} else
			{
				return false;
		//   29   49:iconst_0        
		//   30   50:ireturn         
			}
		}

		public int hashCode()
		{
			int j = size;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int size>
		//    2    4:istore_2        
			android.graphics.Bitmap.Config config1 = config;
		//    3    5:aload_0         
		//    4    6:getfield        #38  <Field android.graphics.Bitmap$Config config>
		//    5    9:astore_3        
			int i;
			if(config1 != null)
		//*   6   10:aload_3         
		//*   7   11:ifnull          22
				i = config1.hashCode();
		//    8   14:aload_3         
		//    9   15:invokevirtual   #50  <Method int android.graphics.Bitmap$Config.hashCode()>
		//   10   18:istore_1        
			else
		//*  11   19:goto            24
				i = 0;
		//   12   22:iconst_0        
		//   13   23:istore_1        
			return j * 31 + i;
		//   14   24:iload_2         
		//   15   25:bipush          31
		//   16   27:imul            
		//   17   28:iload_1         
		//   18   29:iadd            
		//   19   30:ireturn         
		}

		public void init(int i, android.graphics.Bitmap.Config config1)
		{
			size = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #36  <Field int size>
			config = config1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #38  <Field android.graphics.Bitmap$Config config>
		//    6   10:return          
		}

		public void offer()
		{
			pool.offer(((Poolable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SizeConfigStrategy$KeyPool pool>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #56  <Method void SizeConfigStrategy$KeyPool.offer(Poolable)>
		//    4    8:return          
		}

		public String toString()
		{
			return SizeConfigStrategy.getBitmapString(size, config);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int size>
		//    2    4:aload_0         
		//    3    5:getfield        #38  <Field android.graphics.Bitmap$Config config>
		//    4    8:invokestatic    #62  <Method String SizeConfigStrategy.getBitmapString(int, android.graphics.Bitmap$Config)>
		//    5   11:areturn         
		}

		private android.graphics.Bitmap.Config config;
		private final KeyPool pool;
		int size;

		public Key(KeyPool keypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			pool = keypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field SizeConfigStrategy$KeyPool pool>
		//    5    9:return          
		}

		Key(KeyPool keypool, int i, android.graphics.Bitmap.Config config1)
		{
			this(keypool);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #27  <Method void SizeConfigStrategy$Key(SizeConfigStrategy$KeyPool)>
			init(i, config1);
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:aload_3         
		//    6    8:invokevirtual   #31  <Method void init(int, android.graphics.Bitmap$Config)>
		//    7   11:return          
		}
	}

	static class KeyPool extends BaseKeyPool
	{

		protected volatile Poolable create()
		{
			return ((Poolable) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #19  <Method SizeConfigStrategy$Key create()>
		//    2    4:areturn         
		}

		protected Key create()
		{
			return new Key(this);
		//    0    0:new             #21  <Class SizeConfigStrategy$Key>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #24  <Method void SizeConfigStrategy$Key(SizeConfigStrategy$KeyPool)>
		//    4    8:areturn         
		}

		public Key get(int i, android.graphics.Bitmap.Config config)
		{
			Key key = (Key)get();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method Poolable get()>
		//    2    4:checkcast       #21  <Class SizeConfigStrategy$Key>
		//    3    7:astore_3        
			key.init(i, config);
		//    4    8:aload_3         
		//    5    9:iload_1         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #32  <Method void SizeConfigStrategy$Key.init(int, android.graphics.Bitmap$Config)>
			return key;
		//    8   14:aload_3         
		//    9   15:areturn         
		}

		KeyPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void BaseKeyPool()>
		//    2    4:return          
		}
	}


	public SizeConfigStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class SizeConfigStrategy$KeyPool>
	//    4    8:dup             
	//    5    9:invokespecial   #81  <Method void SizeConfigStrategy$KeyPool()>
	//    6   12:putfield        #83  <Field SizeConfigStrategy$KeyPool keyPool>
	//    7   15:aload_0         
	//    8   16:new             #85  <Class GroupedLinkedMap>
	//    9   19:dup             
	//   10   20:invokespecial   #86  <Method void GroupedLinkedMap()>
	//   11   23:putfield        #88  <Field GroupedLinkedMap groupedMap>
	//   12   26:aload_0         
	//   13   27:new             #90  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #91  <Method void HashMap()>
	//   16   34:putfield        #93  <Field Map sortedSizes>
	//   17   37:return          
	}

	private void decrementBitmapOfSize(Integer integer, Bitmap bitmap)
	{
		NavigableMap navigablemap = getSizesForConfig(bitmap.getConfig());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #101 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    3    5:invokespecial   #105 <Method NavigableMap getSizesForConfig(android.graphics.Bitmap$Config)>
	//    4    8:astore_3        
		Integer integer1 = (Integer)navigablemap.get(((Object) (integer)));
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokeinterface #111 <Method Object NavigableMap.get(Object)>
	//    8   16:checkcast       #113 <Class Integer>
	//    9   19:astore          4
		if(integer1 != null)
	//*  10   21:aload           4
	//*  11   23:ifnull          63
		{
			if(integer1.intValue() == 1)
	//*  12   26:aload           4
	//*  13   28:invokevirtual   #117 <Method int Integer.intValue()>
	//*  14   31:iconst_1        
	//*  15   32:icmpne          44
			{
				navigablemap.remove(((Object) (integer)));
	//   16   35:aload_3         
	//   17   36:aload_1         
	//   18   37:invokeinterface #120 <Method Object NavigableMap.remove(Object)>
	//   19   42:pop             
				return;
	//   20   43:return          
			} else
			{
				navigablemap.put(((Object) (integer)), ((Object) (Integer.valueOf(integer1.intValue() - 1))));
	//   21   44:aload_3         
	//   22   45:aload_1         
	//   23   46:aload           4
	//   24   48:invokevirtual   #117 <Method int Integer.intValue()>
	//   25   51:iconst_1        
	//   26   52:isub            
	//   27   53:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   28   56:invokeinterface #128 <Method Object NavigableMap.put(Object, Object)>
	//   29   61:pop             
				return;
	//   30   62:return          
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   31   63:new             #130 <Class StringBuilder>
	//   32   66:dup             
	//   33   67:invokespecial   #131 <Method void StringBuilder()>
	//   34   70:astore_3        
			stringbuilder.append("Tried to decrement empty size, size: ");
	//   35   71:aload_3         
	//   36   72:ldc1            #133 <String "Tried to decrement empty size, size: ">
	//   37   74:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
			stringbuilder.append(((Object) (integer)));
	//   39   78:aload_3         
	//   40   79:aload_1         
	//   41   80:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   42   83:pop             
			stringbuilder.append(", removed: ");
	//   43   84:aload_3         
	//   44   85:ldc1            #142 <String ", removed: ">
	//   45   87:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
			stringbuilder.append(logBitmap(bitmap));
	//   47   91:aload_3         
	//   48   92:aload_0         
	//   49   93:aload_2         
	//   50   94:invokevirtual   #146 <Method String logBitmap(Bitmap)>
	//   51   97:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
			stringbuilder.append(", this: ");
	//   53  101:aload_3         
	//   54  102:ldc1            #148 <String ", this: ">
	//   55  104:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   56  107:pop             
			stringbuilder.append(((Object) (this)));
	//   57  108:aload_3         
	//   58  109:aload_0         
	//   59  110:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   60  113:pop             
			throw new NullPointerException(stringbuilder.toString());
	//   61  114:new             #150 <Class NullPointerException>
	//   62  117:dup             
	//   63  118:aload_3         
	//   64  119:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   65  122:invokespecial   #157 <Method void NullPointerException(String)>
	//   66  125:athrow          
		}
	}

	private Key findBestKey(int i, android.graphics.Bitmap.Config config)
	{
		Key key = keyPool.get(i, config);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field SizeConfigStrategy$KeyPool keyPool>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #161 <Method SizeConfigStrategy$Key SizeConfigStrategy$KeyPool.get(int, android.graphics.Bitmap$Config)>
	//    5    9:astore          5
		android.graphics.Bitmap.Config aconfig[] = getInConfigs(config);
	//    6   11:aload_2         
	//    7   12:invokestatic    #165 <Method android.graphics.Bitmap$Config[] getInConfigs(android.graphics.Bitmap$Config)>
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
	//   23   39:invokespecial   #105 <Method NavigableMap getSizesForConfig(android.graphics.Bitmap$Config)>
	//   24   42:iload_1         
	//   25   43:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   26   46:invokeinterface #168 <Method Object NavigableMap.ceilingKey(Object)>
	//   27   51:checkcast       #113 <Class Integer>
	//   28   54:astore          8
			if(integer != null && integer.intValue() <= i * 8)
	//*  29   56:aload           8
	//*  30   58:ifnull          127
	//*  31   61:aload           8
	//*  32   63:invokevirtual   #117 <Method int Integer.intValue()>
	//*  33   66:iload_1         
	//*  34   67:bipush          8
	//*  35   69:imul            
	//*  36   70:icmpgt          127
			{
				if(integer.intValue() != i || (config1 != null ? !config1.equals(((Object) (config))) : config != null))
	//*  37   73:aload           8
	//*  38   75:invokevirtual   #117 <Method int Integer.intValue()>
	//*  39   78:iload_1         
	//*  40   79:icmpne          103
	//*  41   82:aload           7
	//*  42   84:ifnonnull       94
	//*  43   87:aload_2         
	//*  44   88:ifnull          134
	//*  45   91:goto            103
	//*  46   94:aload           7
	//*  47   96:aload_2         
	//*  48   97:invokevirtual   #172 <Method boolean android.graphics.Bitmap$Config.equals(Object)>
	//*  49  100:ifne            134
				{
					keyPool.offer(((Poolable) (key)));
	//   50  103:aload_0         
	//   51  104:getfield        #83  <Field SizeConfigStrategy$KeyPool keyPool>
	//   52  107:aload           5
	//   53  109:invokevirtual   #176 <Method void SizeConfigStrategy$KeyPool.offer(Poolable)>
					return keyPool.get(integer.intValue(), config1);
	//   54  112:aload_0         
	//   55  113:getfield        #83  <Field SizeConfigStrategy$KeyPool keyPool>
	//   56  116:aload           8
	//   57  118:invokevirtual   #117 <Method int Integer.intValue()>
	//   58  121:aload           7
	//   59  123:invokevirtual   #161 <Method SizeConfigStrategy$Key SizeConfigStrategy$KeyPool.get(int, android.graphics.Bitmap$Config)>
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #130 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[");
	//    4    8:aload_2         
	//    5    9:ldc1            #180 <String "[">
	//    6   11:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_0         
	//   10   17:invokevirtual   #183 <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append("](");
	//   12   21:aload_2         
	//   13   22:ldc1            #185 <String "](">
	//   14   24:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(((Object) (config)));
	//   16   28:aload_2         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   19   33:pop             
		stringbuilder.append(")");
	//   20   34:aload_2         
	//   21   35:ldc1            #187 <String ")">
	//   22   37:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		return stringbuilder.toString();
	//   24   41:aload_2         
	//   25   42:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   26   45:areturn         
	}

	private static android.graphics.Bitmap.Config[] getInConfigs(android.graphics.Bitmap.Config config)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26 && android.graphics.Bitmap.Config.RGBA_F16.equals(((Object) (config))))
	//*   0    0:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          22
	//*   3    8:getstatic       #57  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGBA_F16>
	//*   4   11:aload_0         
	//*   5   12:invokevirtual   #172 <Method boolean android.graphics.Bitmap$Config.equals(Object)>
	//*   6   15:ifeq            22
			return RGBA_F16_IN_CONFIGS;
	//    7   18:getstatic       #61  <Field android.graphics.Bitmap$Config[] RGBA_F16_IN_CONFIGS>
	//    8   21:areturn         
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
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//*  10   23:getstatic       #31  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
			//*  11   26:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//*  15   34:getstatic       #34  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
			//*  16   37:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//*  20   45:getstatic       #37  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
			//*  21   48:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1..SwitchMap.android.graphics.Bitmap.Config[config.ordinal()])
	//*   9   22:getstatic       #191 <Field int[] SizeConfigStrategy$1.$SwitchMap$android$graphics$Bitmap$Config>
	//*  10   25:aload_0         
	//*  11   26:invokevirtual   #194 <Method int android.graphics.Bitmap$Config.ordinal()>
	//*  12   29:iaload          
		{
	//*  13   30:tableswitch     1 4: default 60
	//	               1 81
	//	               2 77
	//	               3 73
	//	               4 69
		default:
			return (new android.graphics.Bitmap.Config[] {
				config
			});
	//   14   60:iconst_1        
	//   15   61:anewarray       android.graphics.Bitmap.Config[]
	//   16   64:dup             
	//   17   65:iconst_0        
	//   18   66:aload_0         
	//   19   67:aastore         
	//   20   68:areturn         

		case 4: // '\004'
			return ALPHA_8_IN_CONFIGS;
	//   21   69:getstatic       #76  <Field android.graphics.Bitmap$Config[] ALPHA_8_IN_CONFIGS>
	//   22   72:areturn         

		case 3: // '\003'
			return ARGB_4444_IN_CONFIGS;
	//   23   73:getstatic       #71  <Field android.graphics.Bitmap$Config[] ARGB_4444_IN_CONFIGS>
	//   24   76:areturn         

		case 2: // '\002'
			return RGB_565_IN_CONFIGS;
	//   25   77:getstatic       #66  <Field android.graphics.Bitmap$Config[] RGB_565_IN_CONFIGS>
	//   26   80:areturn         

		case 1: // '\001'
			return ARGB_8888_IN_CONFIGS;
	//   27   81:getstatic       #59  <Field android.graphics.Bitmap$Config[] ARGB_8888_IN_CONFIGS>
	//   28   84:areturn         
		}
	}

	private NavigableMap getSizesForConfig(android.graphics.Bitmap.Config config)
	{
		NavigableMap navigablemap = (NavigableMap)sortedSizes.get(((Object) (config)));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Map sortedSizes>
	//    2    4:aload_1         
	//    3    5:invokeinterface #197 <Method Object Map.get(Object)>
	//    4   10:checkcast       #107 <Class NavigableMap>
	//    5   13:astore_3        
		Object obj = ((Object) (navigablemap));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(navigablemap == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       40
		{
			obj = ((Object) (new TreeMap()));
	//   10   20:new             #199 <Class TreeMap>
	//   11   23:dup             
	//   12   24:invokespecial   #200 <Method void TreeMap()>
	//   13   27:astore_2        
			sortedSizes.put(((Object) (config)), obj);
	//   14   28:aload_0         
	//   15   29:getfield        #93  <Field Map sortedSizes>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokeinterface #201 <Method Object Map.put(Object, Object)>
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
	//    4    4:invokestatic    #211 <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//    5    7:aload_3         
	//    6    8:invokespecial   #213 <Method SizeConfigStrategy$Key findBestKey(int, android.graphics.Bitmap$Config)>
	//    7   11:astore_3        
		Bitmap bitmap = (Bitmap)groupedMap.get(((Poolable) (config)));
	//    8   12:aload_0         
	//    9   13:getfield        #88  <Field GroupedLinkedMap groupedMap>
	//   10   16:aload_3         
	//   11   17:invokevirtual   #216 <Method Object GroupedLinkedMap.get(Poolable)>
	//   12   20:checkcast       #97  <Class Bitmap>
	//   13   23:astore          4
		if(bitmap != null)
	//*  14   25:aload           4
	//*  15   27:ifnull          72
		{
			decrementBitmapOfSize(Integer.valueOf(((Key) (config)).size), bitmap);
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:getfield        #219 <Field int SizeConfigStrategy$Key.size>
	//   19   35:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   20   38:aload           4
	//   21   40:invokespecial   #221 <Method void decrementBitmapOfSize(Integer, Bitmap)>
			if(bitmap.getConfig() != null)
	//*  22   43:aload           4
	//*  23   45:invokevirtual   #101 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//*  24   48:ifnull          60
				config = bitmap.getConfig();
	//   25   51:aload           4
	//   26   53:invokevirtual   #101 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   27   56:astore_3        
			else
	//*  28   57:goto            64
				config = android.graphics.Bitmap.Config.ARGB_8888;
	//   29   60:getstatic       #42  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   30   63:astore_3        
			bitmap.reconfigure(i, j, config);
	//   31   64:aload           4
	//   32   66:iload_1         
	//   33   67:iload_2         
	//   34   68:aload_3         
	//   35   69:invokevirtual   #225 <Method void Bitmap.reconfigure(int, int, android.graphics.Bitmap$Config)>
		}
		return bitmap;
	//   36   72:aload           4
	//   37   74:areturn         
	}

	public int getSize(Bitmap bitmap)
	{
		return Util.getBitmapByteSize(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #230 <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:ireturn         
	}

	public String logBitmap(int i, int j, android.graphics.Bitmap.Config config)
	{
		return getBitmapString(Util.getBitmapByteSize(i, j, config), config);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #211 <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//    4    6:aload_3         
	//    5    7:invokestatic    #233 <Method String getBitmapString(int, android.graphics.Bitmap$Config)>
	//    6   10:areturn         
	}

	public String logBitmap(Bitmap bitmap)
	{
		return getBitmapString(Util.getBitmapByteSize(bitmap), bitmap.getConfig());
	//    0    0:aload_1         
	//    1    1:invokestatic    #230 <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    4    8:invokestatic    #233 <Method String getBitmapString(int, android.graphics.Bitmap$Config)>
	//    5   11:areturn         
	}

	public void put(Bitmap bitmap)
	{
		int i = Util.getBitmapByteSize(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #230 <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:istore_2        
		Key key = keyPool.get(i, bitmap.getConfig());
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field SizeConfigStrategy$KeyPool keyPool>
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #101 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    8   14:invokevirtual   #161 <Method SizeConfigStrategy$Key SizeConfigStrategy$KeyPool.get(int, android.graphics.Bitmap$Config)>
	//    9   17:astore          4
		groupedMap.put(((Poolable) (key)), ((Object) (bitmap)));
	//   10   19:aload_0         
	//   11   20:getfield        #88  <Field GroupedLinkedMap groupedMap>
	//   12   23:aload           4
	//   13   25:aload_1         
	//   14   26:invokevirtual   #237 <Method void GroupedLinkedMap.put(Poolable, Object)>
		bitmap = ((Bitmap) (getSizesForConfig(bitmap.getConfig())));
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #101 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   18   34:invokespecial   #105 <Method NavigableMap getSizesForConfig(android.graphics.Bitmap$Config)>
	//   19   37:astore_1        
		Integer integer = (Integer)((NavigableMap) (bitmap)).get(((Object) (Integer.valueOf(key.size))));
	//   20   38:aload_1         
	//   21   39:aload           4
	//   22   41:getfield        #219 <Field int SizeConfigStrategy$Key.size>
	//   23   44:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   24   47:invokeinterface #111 <Method Object NavigableMap.get(Object)>
	//   25   52:checkcast       #113 <Class Integer>
	//   26   55:astore          5
		int j = key.size;
	//   27   57:aload           4
	//   28   59:getfield        #219 <Field int SizeConfigStrategy$Key.size>
	//   29   62:istore_3        
		i = 1;
	//   30   63:iconst_1        
	//   31   64:istore_2        
		if(integer != null)
	//*  32   65:aload           5
	//*  33   67:ifnonnull       73
	//*  34   70:goto            81
			i = 1 + integer.intValue();
	//   35   73:iconst_1        
	//   36   74:aload           5
	//   37   76:invokevirtual   #117 <Method int Integer.intValue()>
	//   38   79:iadd            
	//   39   80:istore_2        
		((NavigableMap) (bitmap)).put(((Object) (Integer.valueOf(j))), ((Object) (Integer.valueOf(i))));
	//   40   81:aload_1         
	//   41   82:iload_3         
	//   42   83:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   43   86:iload_2         
	//   44   87:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   45   90:invokeinterface #128 <Method Object NavigableMap.put(Object, Object)>
	//   46   95:pop             
	//   47   96:return          
	}

	public Bitmap removeLast()
	{
		Bitmap bitmap = (Bitmap)groupedMap.removeLast();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field GroupedLinkedMap groupedMap>
	//    2    4:invokevirtual   #242 <Method Object GroupedLinkedMap.removeLast()>
	//    3    7:checkcast       #97  <Class Bitmap>
	//    4   10:astore_1        
		if(bitmap != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          27
			decrementBitmapOfSize(Integer.valueOf(Util.getBitmapByteSize(bitmap)), bitmap);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #230 <Method int Util.getBitmapByteSize(Bitmap)>
	//   10   20:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   11   23:aload_1         
	//   12   24:invokespecial   #221 <Method void decrementBitmapOfSize(Integer, Bitmap)>
		return bitmap;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #130 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("SizeConfigStrategy{groupedMap=");
	//    4    8:aload_1         
	//    5    9:ldc1            #244 <String "SizeConfigStrategy{groupedMap=">
	//    6   11:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (groupedMap)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #88  <Field GroupedLinkedMap groupedMap>
	//   11   20:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", sortedSizes=(");
	//   13   24:aload_1         
	//   14   25:ldc1            #246 <String ", sortedSizes=(">
	//   15   27:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		for(Iterator iterator = sortedSizes.entrySet().iterator(); iterator.hasNext(); stringbuilder.append("], "))
	//*  17   31:aload_0         
	//*  18   32:getfield        #93  <Field Map sortedSizes>
	//*  19   35:invokeinterface #250 <Method Set Map.entrySet()>
	//*  20   40:invokeinterface #256 <Method Iterator Set.iterator()>
	//*  21   45:astore_2        
	//*  22   46:aload_2         
	//*  23   47:invokeinterface #262 <Method boolean Iterator.hasNext()>
	//*  24   52:ifeq            105
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   25   55:aload_2         
	//   26   56:invokeinterface #265 <Method Object Iterator.next()>
	//   27   61:checkcast       #267 <Class java.util.Map$Entry>
	//   28   64:astore_3        
			stringbuilder.append(entry.getKey());
	//   29   65:aload_1         
	//   30   66:aload_3         
	//   31   67:invokeinterface #270 <Method Object java.util.Map$Entry.getKey()>
	//   32   72:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   33   75:pop             
			stringbuilder.append('[');
	//   34   76:aload_1         
	//   35   77:bipush          91
	//   36   79:invokevirtual   #273 <Method StringBuilder StringBuilder.append(char)>
	//   37   82:pop             
			stringbuilder.append(entry.getValue());
	//   38   83:aload_1         
	//   39   84:aload_3         
	//   40   85:invokeinterface #276 <Method Object java.util.Map$Entry.getValue()>
	//   41   90:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   42   93:pop             
		}

	//   43   94:aload_1         
	//   44   95:ldc2            #278 <String "], ">
	//   45   98:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   46  101:pop             
	//*  47  102:goto            46
		if(!sortedSizes.isEmpty())
	//*  48  105:aload_0         
	//*  49  106:getfield        #93  <Field Map sortedSizes>
	//*  50  109:invokeinterface #281 <Method boolean Map.isEmpty()>
	//*  51  114:ifne            135
			stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length(), "");
	//   52  117:aload_1         
	//   53  118:aload_1         
	//   54  119:invokevirtual   #284 <Method int StringBuilder.length()>
	//   55  122:iconst_2        
	//   56  123:isub            
	//   57  124:aload_1         
	//   58  125:invokevirtual   #284 <Method int StringBuilder.length()>
	//   59  128:ldc2            #286 <String "">
	//   60  131:invokevirtual   #290 <Method StringBuilder StringBuilder.replace(int, int, String)>
	//   61  134:pop             
		stringbuilder.append(")}");
	//   62  135:aload_1         
	//   63  136:ldc2            #292 <String ")}">
	//   64  139:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   65  142:pop             
		return stringbuilder.toString();
	//   66  143:aload_1         
	//   67  144:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   68  147:areturn         
	}

	private static final android.graphics.Bitmap.Config ALPHA_8_IN_CONFIGS[];
	private static final android.graphics.Bitmap.Config ARGB_4444_IN_CONFIGS[];
	private static final android.graphics.Bitmap.Config ARGB_8888_IN_CONFIGS[];
	private static final int MAX_SIZE_MULTIPLE = 8;
	private static final android.graphics.Bitmap.Config RGBA_F16_IN_CONFIGS[];
	private static final android.graphics.Bitmap.Config RGB_565_IN_CONFIGS[];
	private final GroupedLinkedMap groupedMap = new GroupedLinkedMap();
	private final KeyPool keyPool = new KeyPool();
	private final Map sortedSizes = new HashMap();

	static 
	{
		android.graphics.Bitmap.Config aconfig1[] = new android.graphics.Bitmap.Config[2];
	//    0    0:iconst_2        
	//    1    1:anewarray       android.graphics.Bitmap.Config[]
	//    2    4:astore_1        
		aconfig1[0] = android.graphics.Bitmap.Config.ARGB_8888;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:getstatic       #42  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    6   10:aastore         
		aconfig1[1] = null;
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:aconst_null     
	//   10   14:aastore         
		android.graphics.Bitmap.Config aconfig[] = aconfig1;
	//   11   15:aload_1         
	//   12   16:astore_0        
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  13   17:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   20:bipush          26
	//*  15   22:icmplt          46
		{
			aconfig = (android.graphics.Bitmap.Config[])Arrays.copyOf(((Object []) (aconfig1)), aconfig1.length + 1);
	//   16   25:aload_1         
	//   17   26:aload_1         
	//   18   27:arraylength     
	//   19   28:iconst_1        
	//   20   29:iadd            
	//   21   30:invokestatic    #53  <Method Object[] Arrays.copyOf(Object[], int)>
	//   22   33:checkcast       #54  <Class android.graphics.Bitmap$Config[]>
	//   23   36:astore_0        
			aconfig[aconfig.length - 1] = android.graphics.Bitmap.Config.RGBA_F16;
	//   24   37:aload_0         
	//   25   38:aload_0         
	//   26   39:arraylength     
	//   27   40:iconst_1        
	//   28   41:isub            
	//   29   42:getstatic       #57  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGBA_F16>
	//   30   45:aastore         
		}
		ARGB_8888_IN_CONFIGS = aconfig;
	//   31   46:aload_0         
	//   32   47:putstatic       #59  <Field android.graphics.Bitmap$Config[] ARGB_8888_IN_CONFIGS>
		RGBA_F16_IN_CONFIGS = ARGB_8888_IN_CONFIGS;
	//   33   50:getstatic       #59  <Field android.graphics.Bitmap$Config[] ARGB_8888_IN_CONFIGS>
	//   34   53:putstatic       #61  <Field android.graphics.Bitmap$Config[] RGBA_F16_IN_CONFIGS>
		RGB_565_IN_CONFIGS = (new android.graphics.Bitmap.Config[] {
			android.graphics.Bitmap.Config.RGB_565
		});
	//   35   56:iconst_1        
	//   36   57:anewarray       android.graphics.Bitmap.Config[]
	//   37   60:dup             
	//   38   61:iconst_0        
	//   39   62:getstatic       #64  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   40   65:aastore         
	//   41   66:putstatic       #66  <Field android.graphics.Bitmap$Config[] RGB_565_IN_CONFIGS>
		ARGB_4444_IN_CONFIGS = (new android.graphics.Bitmap.Config[] {
			android.graphics.Bitmap.Config.ARGB_4444
		});
	//   42   69:iconst_1        
	//   43   70:anewarray       android.graphics.Bitmap.Config[]
	//   44   73:dup             
	//   45   74:iconst_0        
	//   46   75:getstatic       #69  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
	//   47   78:aastore         
	//   48   79:putstatic       #71  <Field android.graphics.Bitmap$Config[] ARGB_4444_IN_CONFIGS>
		ALPHA_8_IN_CONFIGS = (new android.graphics.Bitmap.Config[] {
			android.graphics.Bitmap.Config.ALPHA_8
		});
	//   49   82:iconst_1        
	//   50   83:anewarray       android.graphics.Bitmap.Config[]
	//   51   86:dup             
	//   52   87:iconst_0        
	//   53   88:getstatic       #74  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
	//   54   91:aastore         
	//   55   92:putstatic       #76  <Field android.graphics.Bitmap$Config[] ALPHA_8_IN_CONFIGS>
	//*  56   95:return          
	}
}
