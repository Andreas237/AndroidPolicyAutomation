// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.prefill;


// Referenced classes of package com.bumptech.glide.load.engine.prefill:
//			PreFillType

public static class PreFillType$Builder
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

	public PreFillType$Builder setConfig(android.graphics.Bitmap.Config config1)
	{
		config = config1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field android.graphics.Bitmap$Config config>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PreFillType$Builder setWeight(int i)
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

	public PreFillType$Builder(int i)
	{
		this(i, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:invokespecial   #18  <Method void PreFillType$Builder(int, int)>
	//    4    6:return          
	}

	public PreFillType$Builder(int i, int j)
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
