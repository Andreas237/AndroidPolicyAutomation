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
