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
		//    3    5:getfield        #35  <Field int width>
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field int height>
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
			if(i <= 0)
		//*   0    0:iload_1         
		//*   1    1:ifgt            14
			{
				throw new IllegalArgumentException("Weight must be > 0");
		//    2    4:new             #26  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #54  <String "Weight must be > 0">
		//    5   10:invokespecial   #31  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			} else
			{
				weight = i;
		//    7   14:aload_0         
		//    8   15:iload_1         
		//    9   16:putfield        #24  <Field int weight>
				return this;
		//   10   19:aload_0         
		//   11   20:areturn         
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
			if(i <= 0)
		//*   5    9:iload_1         
		//*   6   10:ifgt            23
				throw new IllegalArgumentException("Width must be > 0");
		//    7   13:new             #26  <Class IllegalArgumentException>
		//    8   16:dup             
		//    9   17:ldc1            #28  <String "Width must be > 0">
		//   10   19:invokespecial   #31  <Method void IllegalArgumentException(String)>
		//   11   22:athrow          
			if(j <= 0)
		//*  12   23:iload_2         
		//*  13   24:ifgt            37
			{
				throw new IllegalArgumentException("Height must be > 0");
		//   14   27:new             #26  <Class IllegalArgumentException>
		//   15   30:dup             
		//   16   31:ldc1            #33  <String "Height must be > 0">
		//   17   33:invokespecial   #31  <Method void IllegalArgumentException(String)>
		//   18   36:athrow          
			} else
			{
				width = i;
		//   19   37:aload_0         
		//   20   38:iload_1         
		//   21   39:putfield        #35  <Field int width>
				height = j;
		//   22   42:aload_0         
		//   23   43:iload_2         
		//   24   44:putfield        #37  <Field int height>
				return;
		//   25   47:return          
			}
		}
	}


	PreFillType(int i, int j, android.graphics.Bitmap.Config config1, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		config = (android.graphics.Bitmap.Config)Preconditions.checkNotNull(((Object) (config1)), "Config must not be null");
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:ldc1            #30  <String "Config must not be null">
	//    5    8:invokestatic    #36  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #18  <Class android.graphics.Bitmap$Config>
	//    7   14:putfield        #38  <Field android.graphics.Bitmap$Config config>
		width = i;
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:putfield        #40  <Field int width>
		height = j;
	//   11   22:aload_0         
	//   12   23:iload_2         
	//   13   24:putfield        #42  <Field int height>
		weight = k;
	//   14   27:aload_0         
	//   15   28:iload           4
	//   16   30:putfield        #44  <Field int weight>
	//   17   33:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof PreFillType)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class PreFillType>
	//*   2    4:ifeq            60
		{
			obj = ((Object) ((PreFillType)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class PreFillType>
	//    5   11:astore_1        
			return height == ((PreFillType) (obj)).height && width == ((PreFillType) (obj)).width && weight == ((PreFillType) (obj)).weight && config == ((PreFillType) (obj)).config;
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field int height>
	//    8   16:aload_1         
	//    9   17:getfield        #42  <Field int height>
	//   10   20:icmpne          58
	//   11   23:aload_0         
	//   12   24:getfield        #40  <Field int width>
	//   13   27:aload_1         
	//   14   28:getfield        #40  <Field int width>
	//   15   31:icmpne          58
	//   16   34:aload_0         
	//   17   35:getfield        #44  <Field int weight>
	//   18   38:aload_1         
	//   19   39:getfield        #44  <Field int weight>
	//   20   42:icmpne          58
	//   21   45:aload_0         
	//   22   46:getfield        #38  <Field android.graphics.Bitmap$Config config>
	//   23   49:aload_1         
	//   24   50:getfield        #38  <Field android.graphics.Bitmap$Config config>
	//   25   53:if_acmpne       58
	//   26   56:iconst_1        
	//   27   57:ireturn         
	//   28   58:iconst_0        
	//   29   59:ireturn         
		} else
		{
			return false;
	//   30   60:iconst_0        
	//   31   61:ireturn         
		}
	}

	android.graphics.Bitmap.Config getConfig()
	{
		return config;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field android.graphics.Bitmap$Config config>
	//    2    4:areturn         
	}

	int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int height>
	//    2    4:ireturn         
	}

	int getWeight()
	{
		return weight;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int weight>
	//    2    4:ireturn         
	}

	int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int width>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return ((width * 31 + height) * 31 + config.hashCode()) * 31 + weight;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int width>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #42  <Field int height>
	//    6   11:iadd            
	//    7   12:bipush          31
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #38  <Field android.graphics.Bitmap$Config config>
	//   11   19:invokevirtual   #55  <Method int android.graphics.Bitmap$Config.hashCode()>
	//   12   22:iadd            
	//   13   23:bipush          31
	//   14   25:imul            
	//   15   26:aload_0         
	//   16   27:getfield        #44  <Field int weight>
	//   17   30:iadd            
	//   18   31:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("PreFillSize{width=").append(width).append(", height=").append(height).append(", config=").append(((Object) (config))).append(", weight=").append(weight).append('}').toString();
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuilder()>
	//    3    7:ldc1            #62  <String "PreFillSize{width=">
	//    4    9:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #40  <Field int width>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #71  <String ", height=">
	//    9   21:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #42  <Field int height>
	//   12   28:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #73  <String ", config=">
	//   14   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #38  <Field android.graphics.Bitmap$Config config>
	//   17   40:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:ldc1            #78  <String ", weight=">
	//   19   45:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #44  <Field int weight>
	//   22   52:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   23   55:bipush          125
	//   24   57:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   25   60:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   26   63:areturn         
	}

	static final android.graphics.Bitmap.Config DEFAULT_CONFIG;
	private final android.graphics.Bitmap.Config config;
	private final int height;
	private final int weight;
	private final int width;

	static 
	{
		DEFAULT_CONFIG = android.graphics.Bitmap.Config.RGB_565;
	//    0    0:getstatic       #21  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//    1    3:putstatic       #23  <Field android.graphics.Bitmap$Config DEFAULT_CONFIG>
	//*   2    6:return          
	}
}
