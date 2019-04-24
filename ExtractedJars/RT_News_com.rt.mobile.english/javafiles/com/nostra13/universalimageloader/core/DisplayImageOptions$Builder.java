// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.core;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;

// Referenced classes of package com.nostra13.universalimageloader.core:
//			DisplayImageOptions, DefaultConfigurationFactory

public static class DisplayImageOptions$Builder
{

	public DisplayImageOptions$Builder bitmapConfig(android.graphics.Bitmap.Config config)
	{
		if(config == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("bitmapConfig can't be null");
	//    2    4:new             #130 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #132 <String "bitmapConfig can't be null">
	//    5   10:invokespecial   #135 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			decodingOptions.inPreferredConfig = config;
	//    7   14:aload_0         
	//    8   15:getfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
	//    9   18:aload_1         
	//   10   19:putfield        #139 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
			return this;
	//   11   22:aload_0         
	//   12   23:areturn         
		}
	}

	public DisplayImageOptions build()
	{
		return new DisplayImageOptions(this, ((DisplayImageOptions._cls1) (null)));
	//    0    0:new             #6   <Class DisplayImageOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #144 <Method void DisplayImageOptions(DisplayImageOptions$Builder, DisplayImageOptions$1)>
	//    5    9:areturn         
	}

	public DisplayImageOptions$Builder cacheInMemory()
	{
		cacheInMemory = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #55  <Field boolean cacheInMemory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder cacheInMemory(boolean flag)
	{
		cacheInMemory = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field boolean cacheInMemory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder cacheOnDisc()
	{
		return cacheOnDisk(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #151 <Method DisplayImageOptions$Builder cacheOnDisk(boolean)>
	//    3    5:areturn         
	}

	public DisplayImageOptions$Builder cacheOnDisc(boolean flag)
	{
		return cacheOnDisk(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #151 <Method DisplayImageOptions$Builder cacheOnDisk(boolean)>
	//    3    5:areturn         
	}

	public DisplayImageOptions$Builder cacheOnDisk(boolean flag)
	{
		cacheOnDisk = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean cacheOnDisk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder cloneFrom(DisplayImageOptions displayimageoptions)
	{
		imageResOnLoading = DisplayImageOptions.access$1900(displayimageoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #157 <Method int DisplayImageOptions.access$1900(DisplayImageOptions)>
	//    3    5:putfield        #41  <Field int imageResOnLoading>
		imageResForEmptyUri = DisplayImageOptions.access$2000(displayimageoptions);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #160 <Method int DisplayImageOptions.access$2000(DisplayImageOptions)>
	//    7   13:putfield        #43  <Field int imageResForEmptyUri>
		imageResOnFail = DisplayImageOptions.access$2100(displayimageoptions);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #163 <Method int DisplayImageOptions.access$2100(DisplayImageOptions)>
	//   11   21:putfield        #45  <Field int imageResOnFail>
		imageOnLoading = DisplayImageOptions.access$2200(displayimageoptions);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokestatic    #167 <Method Drawable DisplayImageOptions.access$2200(DisplayImageOptions)>
	//   15   29:putfield        #47  <Field Drawable imageOnLoading>
		imageForEmptyUri = DisplayImageOptions.access$2300(displayimageoptions);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokestatic    #170 <Method Drawable DisplayImageOptions.access$2300(DisplayImageOptions)>
	//   19   37:putfield        #49  <Field Drawable imageForEmptyUri>
		imageOnFail = DisplayImageOptions.access$2400(displayimageoptions);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokestatic    #173 <Method Drawable DisplayImageOptions.access$2400(DisplayImageOptions)>
	//   23   45:putfield        #51  <Field Drawable imageOnFail>
		resetViewBeforeLoading = DisplayImageOptions.access$2500(displayimageoptions);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokestatic    #177 <Method boolean DisplayImageOptions.access$2500(DisplayImageOptions)>
	//   27   53:putfield        #53  <Field boolean resetViewBeforeLoading>
		cacheInMemory = DisplayImageOptions.access$2600(displayimageoptions);
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokestatic    #180 <Method boolean DisplayImageOptions.access$2600(DisplayImageOptions)>
	//   31   61:putfield        #55  <Field boolean cacheInMemory>
		cacheOnDisk = DisplayImageOptions.access$2700(displayimageoptions);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokestatic    #183 <Method boolean DisplayImageOptions.access$2700(DisplayImageOptions)>
	//   35   69:putfield        #57  <Field boolean cacheOnDisk>
		imageScaleType = DisplayImageOptions.access$2800(displayimageoptions);
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokestatic    #187 <Method ImageScaleType DisplayImageOptions.access$2800(DisplayImageOptions)>
	//   39   77:putfield        #64  <Field ImageScaleType imageScaleType>
		decodingOptions = DisplayImageOptions.access$2900(displayimageoptions);
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokestatic    #191 <Method android.graphics.BitmapFactory$Options DisplayImageOptions.access$2900(DisplayImageOptions)>
	//   43   85:putfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
		delayBeforeLoading = DisplayImageOptions.access$3000(displayimageoptions);
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:invokestatic    #194 <Method int DisplayImageOptions.access$3000(DisplayImageOptions)>
	//   47   93:putfield        #71  <Field int delayBeforeLoading>
		considerExifParams = DisplayImageOptions.access$3100(displayimageoptions);
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:invokestatic    #197 <Method boolean DisplayImageOptions.access$3100(DisplayImageOptions)>
	//   51  101:putfield        #73  <Field boolean considerExifParams>
		extraForDownloader = DisplayImageOptions.access$3200(displayimageoptions);
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:invokestatic    #201 <Method Object DisplayImageOptions.access$3200(DisplayImageOptions)>
	//   55  109:putfield        #75  <Field Object extraForDownloader>
		preProcessor = DisplayImageOptions.access$3300(displayimageoptions);
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:invokestatic    #205 <Method BitmapProcessor DisplayImageOptions.access$3300(DisplayImageOptions)>
	//   59  117:putfield        #77  <Field BitmapProcessor preProcessor>
		postProcessor = DisplayImageOptions.access$3400(displayimageoptions);
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:invokestatic    #208 <Method BitmapProcessor DisplayImageOptions.access$3400(DisplayImageOptions)>
	//   63  125:putfield        #79  <Field BitmapProcessor postProcessor>
		displayer = DisplayImageOptions.access$3500(displayimageoptions);
	//   64  128:aload_0         
	//   65  129:aload_1         
	//   66  130:invokestatic    #212 <Method BitmapDisplayer DisplayImageOptions.access$3500(DisplayImageOptions)>
	//   67  133:putfield        #87  <Field BitmapDisplayer displayer>
		handler = DisplayImageOptions.access$3600(displayimageoptions);
	//   68  136:aload_0         
	//   69  137:aload_1         
	//   70  138:invokestatic    #216 <Method Handler DisplayImageOptions.access$3600(DisplayImageOptions)>
	//   71  141:putfield        #89  <Field Handler handler>
		isSyncLoading = DisplayImageOptions.access$3700(displayimageoptions);
	//   72  144:aload_0         
	//   73  145:aload_1         
	//   74  146:invokestatic    #219 <Method boolean DisplayImageOptions.access$3700(DisplayImageOptions)>
	//   75  149:putfield        #91  <Field boolean isSyncLoading>
		return this;
	//   76  152:aload_0         
	//   77  153:areturn         
	}

	public DisplayImageOptions$Builder considerExifParams(boolean flag)
	{
		considerExifParams = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean considerExifParams>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder decodingOptions(android.graphics.BitmapFactory.Options options)
	{
		if(options == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("decodingOptions can't be null");
	//    2    4:new             #130 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #222 <String "decodingOptions can't be null">
	//    5   10:invokespecial   #135 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			decodingOptions = options;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
			return this;
	//   10   19:aload_0         
	//   11   20:areturn         
		}
	}

	public DisplayImageOptions$Builder delayBeforeLoading(int i)
	{
		delayBeforeLoading = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int delayBeforeLoading>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder displayer(BitmapDisplayer bitmapdisplayer)
	{
		if(bitmapdisplayer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("displayer can't be null");
	//    2    4:new             #130 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #226 <String "displayer can't be null">
	//    5   10:invokespecial   #135 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			displayer = bitmapdisplayer;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #87  <Field BitmapDisplayer displayer>
			return this;
	//   10   19:aload_0         
	//   11   20:areturn         
		}
	}

	public DisplayImageOptions$Builder extraForDownloader(Object obj)
	{
		extraForDownloader = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field Object extraForDownloader>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder handler(Handler handler1)
	{
		handler = handler1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field Handler handler>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder imageScaleType(ImageScaleType imagescaletype)
	{
		imageScaleType = imagescaletype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field ImageScaleType imageScaleType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder postProcessor(BitmapProcessor bitmapprocessor)
	{
		postProcessor = bitmapprocessor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field BitmapProcessor postProcessor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder preProcessor(BitmapProcessor bitmapprocessor)
	{
		preProcessor = bitmapprocessor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field BitmapProcessor preProcessor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder resetViewBeforeLoading()
	{
		resetViewBeforeLoading = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #53  <Field boolean resetViewBeforeLoading>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder resetViewBeforeLoading(boolean flag)
	{
		resetViewBeforeLoading = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean resetViewBeforeLoading>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder showImageForEmptyUri(int i)
	{
		imageResForEmptyUri = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int imageResForEmptyUri>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder showImageForEmptyUri(Drawable drawable)
	{
		imageForEmptyUri = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field Drawable imageForEmptyUri>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder showImageOnFail(int i)
	{
		imageResOnFail = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int imageResOnFail>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder showImageOnFail(Drawable drawable)
	{
		imageOnFail = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Drawable imageOnFail>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder showImageOnLoading(int i)
	{
		imageResOnLoading = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int imageResOnLoading>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder showImageOnLoading(Drawable drawable)
	{
		imageOnLoading = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field Drawable imageOnLoading>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DisplayImageOptions$Builder showStubImage(int i)
	{
		imageResOnLoading = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int imageResOnLoading>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	DisplayImageOptions$Builder syncLoading(boolean flag)
	{
		isSyncLoading = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field boolean isSyncLoading>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean cacheInMemory;
	private boolean cacheOnDisk;
	private boolean considerExifParams;
	private android.graphics.BitmapFactory.Options decodingOptions;
	private int delayBeforeLoading;
	private BitmapDisplayer displayer;
	private Object extraForDownloader;
	private Handler handler;
	private Drawable imageForEmptyUri;
	private Drawable imageOnFail;
	private Drawable imageOnLoading;
	private int imageResForEmptyUri;
	private int imageResOnFail;
	private int imageResOnLoading;
	private ImageScaleType imageScaleType;
	private boolean isSyncLoading;
	private BitmapProcessor postProcessor;
	private BitmapProcessor preProcessor;
	private boolean resetViewBeforeLoading;


/*
	static int access$000(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.imageResOnLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int imageResOnLoading>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.imageResForEmptyUri;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int imageResForEmptyUri>
	//    2    4:ireturn         
	}

*/


/*
	static android.graphics.BitmapFactory.Options access$1000(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.decodingOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
	//    2    4:areturn         
	}

*/


/*
	static int access$1100(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.delayBeforeLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int delayBeforeLoading>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1200(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.considerExifParams;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean considerExifParams>
	//    2    4:ireturn         
	}

*/


/*
	static Object access$1300(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.extraForDownloader;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Object extraForDownloader>
	//    2    4:areturn         
	}

*/


/*
	static BitmapProcessor access$1400(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.preProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field BitmapProcessor preProcessor>
	//    2    4:areturn         
	}

*/


/*
	static BitmapProcessor access$1500(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.postProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field BitmapProcessor postProcessor>
	//    2    4:areturn         
	}

*/


/*
	static BitmapDisplayer access$1600(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.displayer;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field BitmapDisplayer displayer>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$1700(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Handler handler>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1800(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.isSyncLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field boolean isSyncLoading>
	//    2    4:ireturn         
	}

*/


/*
	static int access$200(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.imageResOnFail;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int imageResOnFail>
	//    2    4:ireturn         
	}

*/


/*
	static Drawable access$300(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.imageOnLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Drawable imageOnLoading>
	//    2    4:areturn         
	}

*/


/*
	static Drawable access$400(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.imageForEmptyUri;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Drawable imageForEmptyUri>
	//    2    4:areturn         
	}

*/


/*
	static Drawable access$500(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.imageOnFail;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Drawable imageOnFail>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$600(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.resetViewBeforeLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean resetViewBeforeLoading>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$700(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.cacheInMemory;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean cacheInMemory>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$800(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.cacheOnDisk;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean cacheOnDisk>
	//    2    4:ireturn         
	}

*/


/*
	static ImageScaleType access$900(DisplayImageOptions$Builder displayimageoptions$builder)
	{
		return displayimageoptions$builder.imageScaleType;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ImageScaleType imageScaleType>
	//    2    4:areturn         
	}

*/

	public DisplayImageOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		imageResOnLoading = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #41  <Field int imageResOnLoading>
		imageResForEmptyUri = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #43  <Field int imageResForEmptyUri>
		imageResOnFail = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #45  <Field int imageResOnFail>
		imageOnLoading = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #47  <Field Drawable imageOnLoading>
		imageForEmptyUri = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #49  <Field Drawable imageForEmptyUri>
		imageOnFail = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #51  <Field Drawable imageOnFail>
		resetViewBeforeLoading = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #53  <Field boolean resetViewBeforeLoading>
		cacheInMemory = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #55  <Field boolean cacheInMemory>
		cacheOnDisk = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #57  <Field boolean cacheOnDisk>
		imageScaleType = ImageScaleType.IN_SAMPLE_POWER_OF_2;
	//   29   49:aload_0         
	//   30   50:getstatic       #62  <Field ImageScaleType ImageScaleType.IN_SAMPLE_POWER_OF_2>
	//   31   53:putfield        #64  <Field ImageScaleType imageScaleType>
		decodingOptions = new android.graphics.BitmapFactory.Options();
	//   32   56:aload_0         
	//   33   57:new             #66  <Class android.graphics.BitmapFactory$Options>
	//   34   60:dup             
	//   35   61:invokespecial   #67  <Method void android.graphics.BitmapFactory$Options()>
	//   36   64:putfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
		delayBeforeLoading = 0;
	//   37   67:aload_0         
	//   38   68:iconst_0        
	//   39   69:putfield        #71  <Field int delayBeforeLoading>
		considerExifParams = false;
	//   40   72:aload_0         
	//   41   73:iconst_0        
	//   42   74:putfield        #73  <Field boolean considerExifParams>
		extraForDownloader = null;
	//   43   77:aload_0         
	//   44   78:aconst_null     
	//   45   79:putfield        #75  <Field Object extraForDownloader>
		preProcessor = null;
	//   46   82:aload_0         
	//   47   83:aconst_null     
	//   48   84:putfield        #77  <Field BitmapProcessor preProcessor>
		postProcessor = null;
	//   49   87:aload_0         
	//   50   88:aconst_null     
	//   51   89:putfield        #79  <Field BitmapProcessor postProcessor>
		displayer = DefaultConfigurationFactory.createBitmapDisplayer();
	//   52   92:aload_0         
	//   53   93:invokestatic    #85  <Method BitmapDisplayer DefaultConfigurationFactory.createBitmapDisplayer()>
	//   54   96:putfield        #87  <Field BitmapDisplayer displayer>
		handler = null;
	//   55   99:aload_0         
	//   56  100:aconst_null     
	//   57  101:putfield        #89  <Field Handler handler>
		isSyncLoading = false;
	//   58  104:aload_0         
	//   59  105:iconst_0        
	//   60  106:putfield        #91  <Field boolean isSyncLoading>
		decodingOptions.inPurgeable = true;
	//   61  109:aload_0         
	//   62  110:getfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
	//   63  113:iconst_1        
	//   64  114:putfield        #94  <Field boolean android.graphics.BitmapFactory$Options.inPurgeable>
		decodingOptions.inInputShareable = true;
	//   65  117:aload_0         
	//   66  118:getfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
	//   67  121:iconst_1        
	//   68  122:putfield        #97  <Field boolean android.graphics.BitmapFactory$Options.inInputShareable>
	//   69  125:return          
	}
}
