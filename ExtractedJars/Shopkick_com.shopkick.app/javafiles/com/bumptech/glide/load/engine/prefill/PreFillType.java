// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.prefill;

import com.bumptech.glide.util.Preconditions;

public final class PreFillType
{
	public static class Builder
	{

		PreFillType build()
		{
			return new PreFillType(width, height, config, weight);
		//    0    0:new             #6   <Class PreFillType>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field int width>
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field int height>
		//    6   12:aload_0         
		//    7   13:getfield        #41  <Field android.graphics.Bitmap$Config config>
		//    8   16:aload_0         
		//    9   17:getfield        #24  <Field int weight>
		//   10   20:invokespecial   #44  <Method void PreFillType(int, int, android.graphics.Bitmap$Config, int)>
		//   11   23:areturn         
		}

		android.graphics.Bitmap.Config getConfig()
		{
			return config;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field android.graphics.Bitmap$Config config>
		//    2    4:areturn         
		}

		public Builder setConfig(android.graphics.Bitmap.Config config1)
		{
			config = config1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field android.graphics.Bitmap$Config config>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWeight(int i)
		{
			if(i > 0)
		//*   0    0:iload_1         
		//*   1    1:ifle            11
			{
				weight = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #24  <Field int weight>
				return this;
		//    5    9:aload_0         
		//    6   10:areturn         
			} else
			{
				throw new IllegalArgumentException("Weight must be > 0");
		//    7   11:new             #30  <Class IllegalArgumentException>
		//    8   14:dup             
		//    9   15:ldc1            #54  <String "Weight must be > 0">
		//   10   17:invokespecial   #35  <Method void IllegalArgumentException(String)>
		//   11   20:athrow          
			}
		}

		private android.graphics.Bitmap.Config config;
		private final int height;
		private int weight;
		private final int width;

		public Builder(int i)
		{
			this(i, i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_1         
		//    3    3:invokespecial   #18  <Method void PreFillType$Builder(int, int)>
		//    4    6:return          
		}

		public Builder(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			weight = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #24  <Field int weight>
			if(i > 0)
		//*   5    9:iload_1         
		//*   6   10:ifle            38
			{
				if(j > 0)
		//*   7   13:iload_2         
		//*   8   14:ifle            28
				{
					width = i;
		//    9   17:aload_0         
		//   10   18:iload_1         
		//   11   19:putfield        #26  <Field int width>
					height = j;
		//   12   22:aload_0         
		//   13   23:iload_2         
		//   14   24:putfield        #28  <Field int height>
					return;
		//   15   27:return          
				} else
				{
					throw new IllegalArgumentException("Height must be > 0");
		//   16   28:new             #30  <Class IllegalArgumentException>
		//   17   31:dup             
		//   18   32:ldc1            #32  <String "Height must be > 0">
		//   19   34:invokespecial   #35  <Method void IllegalArgumentException(String)>
		//   20   37:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("Width must be > 0");
		//   21   38:new             #30  <Class IllegalArgumentException>
		//   22   41:dup             
		//   23   42:ldc1            #37  <String "Width must be > 0">
		//   24   44:invokespecial   #35  <Method void IllegalArgumentException(String)>
		//   25   47:athrow          
			}
		}
	}


	PreFillType(int i, int j, android.graphics.Bitmap.Config config1, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		config = (android.graphics.Bitmap.Config)Preconditions.checkNotNull(((Object) (config1)), "Config must not be null");
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:ldc1            #31  <String "Config must not be null">
	//    5    8:invokestatic    #37  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #19  <Class android.graphics.Bitmap$Config>
	//    7   14:putfield        #39  <Field android.graphics.Bitmap$Config config>
		width = i;
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:putfield        #41  <Field int width>
		height = j;
	//   11   22:aload_0         
	//   12   23:iload_2         
	//   13   24:putfield        #43  <Field int height>
		weight = k;
	//   14   27:aload_0         
	//   15   28:iload           4
	//   16   30:putfield        #45  <Field int weight>
	//   17   33:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof PreFillType;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class PreFillType>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            72
		{
			obj = ((Object) ((PreFillType)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class PreFillType>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(height == ((PreFillType) (obj)).height)
	//*  12   18:aload_0         
	//*  13   19:getfield        #43  <Field int height>
	//*  14   22:aload_1         
	//*  15   23:getfield        #43  <Field int height>
	//*  16   26:icmpne          70
			{
				flag1 = flag2;
	//   17   29:iload_3         
	//   18   30:istore_2        
				if(width == ((PreFillType) (obj)).width)
	//*  19   31:aload_0         
	//*  20   32:getfield        #41  <Field int width>
	//*  21   35:aload_1         
	//*  22   36:getfield        #41  <Field int width>
	//*  23   39:icmpne          70
				{
					flag1 = flag2;
	//   24   42:iload_3         
	//   25   43:istore_2        
					if(weight == ((PreFillType) (obj)).weight)
	//*  26   44:aload_0         
	//*  27   45:getfield        #45  <Field int weight>
	//*  28   48:aload_1         
	//*  29   49:getfield        #45  <Field int weight>
	//*  30   52:icmpne          70
					{
						flag1 = flag2;
	//   31   55:iload_3         
	//   32   56:istore_2        
						if(config == ((PreFillType) (obj)).config)
	//*  33   57:aload_0         
	//*  34   58:getfield        #39  <Field android.graphics.Bitmap$Config config>
	//*  35   61:aload_1         
	//*  36   62:getfield        #39  <Field android.graphics.Bitmap$Config config>
	//*  37   65:if_acmpne       70
							flag1 = true;
	//   38   68:iconst_1        
	//   39   69:istore_2        
					}
				}
			}
			return flag1;
	//   40   70:iload_2         
	//   41   71:ireturn         
		} else
		{
			return false;
	//   42   72:iconst_0        
	//   43   73:ireturn         
		}
	}

	android.graphics.Bitmap.Config getConfig()
	{
		return config;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field android.graphics.Bitmap$Config config>
	//    2    4:areturn         
	}

	int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int height>
	//    2    4:ireturn         
	}

	int getWeight()
	{
		return weight;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int weight>
	//    2    4:ireturn         
	}

	int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int width>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return ((width * 31 + height) * 31 + config.hashCode()) * 31 + weight;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int width>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #43  <Field int height>
	//    6   11:iadd            
	//    7   12:bipush          31
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field android.graphics.Bitmap$Config config>
	//   11   19:invokevirtual   #56  <Method int android.graphics.Bitmap$Config.hashCode()>
	//   12   22:iadd            
	//   13   23:bipush          31
	//   14   25:imul            
	//   15   26:aload_0         
	//   16   27:getfield        #45  <Field int weight>
	//   17   30:iadd            
	//   18   31:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("PreFillSize{width=");
	//    4    8:aload_1         
	//    5    9:ldc1            #63  <String "PreFillSize{width=">
	//    6   11:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(width);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field int width>
	//   11   20:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", height=");
	//   13   24:aload_1         
	//   14   25:ldc1            #72  <String ", height=">
	//   15   27:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(height);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #43  <Field int height>
	//   20   36:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", config=");
	//   22   40:aload_1         
	//   23   41:ldc1            #74  <String ", config=">
	//   24   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (config)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #39  <Field android.graphics.Bitmap$Config config>
	//   29   52:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append(", weight=");
	//   31   56:aload_1         
	//   32   57:ldc1            #79  <String ", weight=">
	//   33   59:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(weight);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #45  <Field int weight>
	//   38   68:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append('}');
	//   40   72:aload_1         
	//   41   73:bipush          125
	//   42   75:invokevirtual   #82  <Method StringBuilder StringBuilder.append(char)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	static final android.graphics.Bitmap.Config DEFAULT_CONFIG;
	private final android.graphics.Bitmap.Config config;
	private final int height;
	private final int weight;
	private final int width;

	static 
	{
		DEFAULT_CONFIG = android.graphics.Bitmap.Config.RGB_565;
	//    0    0:getstatic       #22  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//    1    3:putstatic       #24  <Field android.graphics.Bitmap$Config DEFAULT_CONFIG>
	//*   2    6:return          
	}
}
