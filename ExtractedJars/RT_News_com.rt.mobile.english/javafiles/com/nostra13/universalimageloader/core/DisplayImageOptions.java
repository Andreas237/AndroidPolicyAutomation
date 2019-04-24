// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.core;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;

// Referenced classes of package com.nostra13.universalimageloader.core:
//			DefaultConfigurationFactory

public final class DisplayImageOptions
{
	public static class Builder
	{

		public Builder bitmapConfig(android.graphics.Bitmap.Config config)
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
			return new DisplayImageOptions(this, ((_cls1) (null)));
		//    0    0:new             #6   <Class DisplayImageOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #144 <Method void DisplayImageOptions(DisplayImageOptions$Builder, DisplayImageOptions$1)>
		//    5    9:areturn         
		}

		public Builder cacheInMemory()
		{
			cacheInMemory = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #55  <Field boolean cacheInMemory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder cacheInMemory(boolean flag)
		{
			cacheInMemory = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #55  <Field boolean cacheInMemory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder cacheOnDisc()
		{
			return cacheOnDisk(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokevirtual   #151 <Method DisplayImageOptions$Builder cacheOnDisk(boolean)>
		//    3    5:areturn         
		}

		public Builder cacheOnDisc(boolean flag)
		{
			return cacheOnDisk(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #151 <Method DisplayImageOptions$Builder cacheOnDisk(boolean)>
		//    3    5:areturn         
		}

		public Builder cacheOnDisk(boolean flag)
		{
			cacheOnDisk = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #57  <Field boolean cacheOnDisk>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder cloneFrom(DisplayImageOptions displayimageoptions)
		{
			imageResOnLoading = displayimageoptions.imageResOnLoading;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #157 <Method int DisplayImageOptions.access$1900(DisplayImageOptions)>
		//    3    5:putfield        #41  <Field int imageResOnLoading>
			imageResForEmptyUri = displayimageoptions.imageResForEmptyUri;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokestatic    #160 <Method int DisplayImageOptions.access$2000(DisplayImageOptions)>
		//    7   13:putfield        #43  <Field int imageResForEmptyUri>
			imageResOnFail = displayimageoptions.imageResOnFail;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokestatic    #163 <Method int DisplayImageOptions.access$2100(DisplayImageOptions)>
		//   11   21:putfield        #45  <Field int imageResOnFail>
			imageOnLoading = displayimageoptions.imageOnLoading;
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokestatic    #167 <Method Drawable DisplayImageOptions.access$2200(DisplayImageOptions)>
		//   15   29:putfield        #47  <Field Drawable imageOnLoading>
			imageForEmptyUri = displayimageoptions.imageForEmptyUri;
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:invokestatic    #170 <Method Drawable DisplayImageOptions.access$2300(DisplayImageOptions)>
		//   19   37:putfield        #49  <Field Drawable imageForEmptyUri>
			imageOnFail = displayimageoptions.imageOnFail;
		//   20   40:aload_0         
		//   21   41:aload_1         
		//   22   42:invokestatic    #173 <Method Drawable DisplayImageOptions.access$2400(DisplayImageOptions)>
		//   23   45:putfield        #51  <Field Drawable imageOnFail>
			resetViewBeforeLoading = displayimageoptions.resetViewBeforeLoading;
		//   24   48:aload_0         
		//   25   49:aload_1         
		//   26   50:invokestatic    #177 <Method boolean DisplayImageOptions.access$2500(DisplayImageOptions)>
		//   27   53:putfield        #53  <Field boolean resetViewBeforeLoading>
			cacheInMemory = displayimageoptions.cacheInMemory;
		//   28   56:aload_0         
		//   29   57:aload_1         
		//   30   58:invokestatic    #180 <Method boolean DisplayImageOptions.access$2600(DisplayImageOptions)>
		//   31   61:putfield        #55  <Field boolean cacheInMemory>
			cacheOnDisk = displayimageoptions.cacheOnDisk;
		//   32   64:aload_0         
		//   33   65:aload_1         
		//   34   66:invokestatic    #183 <Method boolean DisplayImageOptions.access$2700(DisplayImageOptions)>
		//   35   69:putfield        #57  <Field boolean cacheOnDisk>
			imageScaleType = displayimageoptions.imageScaleType;
		//   36   72:aload_0         
		//   37   73:aload_1         
		//   38   74:invokestatic    #187 <Method ImageScaleType DisplayImageOptions.access$2800(DisplayImageOptions)>
		//   39   77:putfield        #64  <Field ImageScaleType imageScaleType>
			decodingOptions = displayimageoptions.decodingOptions;
		//   40   80:aload_0         
		//   41   81:aload_1         
		//   42   82:invokestatic    #191 <Method android.graphics.BitmapFactory$Options DisplayImageOptions.access$2900(DisplayImageOptions)>
		//   43   85:putfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
			delayBeforeLoading = displayimageoptions.delayBeforeLoading;
		//   44   88:aload_0         
		//   45   89:aload_1         
		//   46   90:invokestatic    #194 <Method int DisplayImageOptions.access$3000(DisplayImageOptions)>
		//   47   93:putfield        #71  <Field int delayBeforeLoading>
			considerExifParams = displayimageoptions.considerExifParams;
		//   48   96:aload_0         
		//   49   97:aload_1         
		//   50   98:invokestatic    #197 <Method boolean DisplayImageOptions.access$3100(DisplayImageOptions)>
		//   51  101:putfield        #73  <Field boolean considerExifParams>
			extraForDownloader = displayimageoptions.extraForDownloader;
		//   52  104:aload_0         
		//   53  105:aload_1         
		//   54  106:invokestatic    #201 <Method Object DisplayImageOptions.access$3200(DisplayImageOptions)>
		//   55  109:putfield        #75  <Field Object extraForDownloader>
			preProcessor = displayimageoptions.preProcessor;
		//   56  112:aload_0         
		//   57  113:aload_1         
		//   58  114:invokestatic    #205 <Method BitmapProcessor DisplayImageOptions.access$3300(DisplayImageOptions)>
		//   59  117:putfield        #77  <Field BitmapProcessor preProcessor>
			postProcessor = displayimageoptions.postProcessor;
		//   60  120:aload_0         
		//   61  121:aload_1         
		//   62  122:invokestatic    #208 <Method BitmapProcessor DisplayImageOptions.access$3400(DisplayImageOptions)>
		//   63  125:putfield        #79  <Field BitmapProcessor postProcessor>
			displayer = displayimageoptions.displayer;
		//   64  128:aload_0         
		//   65  129:aload_1         
		//   66  130:invokestatic    #212 <Method BitmapDisplayer DisplayImageOptions.access$3500(DisplayImageOptions)>
		//   67  133:putfield        #87  <Field BitmapDisplayer displayer>
			handler = displayimageoptions.handler;
		//   68  136:aload_0         
		//   69  137:aload_1         
		//   70  138:invokestatic    #216 <Method Handler DisplayImageOptions.access$3600(DisplayImageOptions)>
		//   71  141:putfield        #89  <Field Handler handler>
			isSyncLoading = displayimageoptions.isSyncLoading;
		//   72  144:aload_0         
		//   73  145:aload_1         
		//   74  146:invokestatic    #219 <Method boolean DisplayImageOptions.access$3700(DisplayImageOptions)>
		//   75  149:putfield        #91  <Field boolean isSyncLoading>
			return this;
		//   76  152:aload_0         
		//   77  153:areturn         
		}

		public Builder considerExifParams(boolean flag)
		{
			considerExifParams = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #73  <Field boolean considerExifParams>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder decodingOptions(android.graphics.BitmapFactory.Options options)
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

		public Builder delayBeforeLoading(int i)
		{
			delayBeforeLoading = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #71  <Field int delayBeforeLoading>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder displayer(BitmapDisplayer bitmapdisplayer)
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

		public Builder extraForDownloader(Object obj)
		{
			extraForDownloader = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #75  <Field Object extraForDownloader>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder handler(Handler handler1)
		{
			handler = handler1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #89  <Field Handler handler>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder imageScaleType(ImageScaleType imagescaletype)
		{
			imageScaleType = imagescaletype;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #64  <Field ImageScaleType imageScaleType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder postProcessor(BitmapProcessor bitmapprocessor)
		{
			postProcessor = bitmapprocessor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #79  <Field BitmapProcessor postProcessor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder preProcessor(BitmapProcessor bitmapprocessor)
		{
			preProcessor = bitmapprocessor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #77  <Field BitmapProcessor preProcessor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder resetViewBeforeLoading()
		{
			resetViewBeforeLoading = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #53  <Field boolean resetViewBeforeLoading>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder resetViewBeforeLoading(boolean flag)
		{
			resetViewBeforeLoading = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #53  <Field boolean resetViewBeforeLoading>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder showImageForEmptyUri(int i)
		{
			imageResForEmptyUri = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #43  <Field int imageResForEmptyUri>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder showImageForEmptyUri(Drawable drawable)
		{
			imageForEmptyUri = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field Drawable imageForEmptyUri>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder showImageOnFail(int i)
		{
			imageResOnFail = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #45  <Field int imageResOnFail>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder showImageOnFail(Drawable drawable)
		{
			imageOnFail = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field Drawable imageOnFail>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder showImageOnLoading(int i)
		{
			imageResOnLoading = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #41  <Field int imageResOnLoading>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder showImageOnLoading(Drawable drawable)
		{
			imageOnLoading = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field Drawable imageOnLoading>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder showStubImage(int i)
		{
			imageResOnLoading = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #41  <Field int imageResOnLoading>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Builder syncLoading(boolean flag)
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
		static int access$000(Builder builder)
		{
			return builder.imageResOnLoading;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field int imageResOnLoading>
		//    2    4:ireturn         
		}

*/


/*
		static int access$100(Builder builder)
		{
			return builder.imageResForEmptyUri;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field int imageResForEmptyUri>
		//    2    4:ireturn         
		}

*/


/*
		static android.graphics.BitmapFactory.Options access$1000(Builder builder)
		{
			return builder.decodingOptions;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field android.graphics.BitmapFactory$Options decodingOptions>
		//    2    4:areturn         
		}

*/


/*
		static int access$1100(Builder builder)
		{
			return builder.delayBeforeLoading;
		//    0    0:aload_0         
		//    1    1:getfield        #71  <Field int delayBeforeLoading>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$1200(Builder builder)
		{
			return builder.considerExifParams;
		//    0    0:aload_0         
		//    1    1:getfield        #73  <Field boolean considerExifParams>
		//    2    4:ireturn         
		}

*/


/*
		static Object access$1300(Builder builder)
		{
			return builder.extraForDownloader;
		//    0    0:aload_0         
		//    1    1:getfield        #75  <Field Object extraForDownloader>
		//    2    4:areturn         
		}

*/


/*
		static BitmapProcessor access$1400(Builder builder)
		{
			return builder.preProcessor;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field BitmapProcessor preProcessor>
		//    2    4:areturn         
		}

*/


/*
		static BitmapProcessor access$1500(Builder builder)
		{
			return builder.postProcessor;
		//    0    0:aload_0         
		//    1    1:getfield        #79  <Field BitmapProcessor postProcessor>
		//    2    4:areturn         
		}

*/


/*
		static BitmapDisplayer access$1600(Builder builder)
		{
			return builder.displayer;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field BitmapDisplayer displayer>
		//    2    4:areturn         
		}

*/


/*
		static Handler access$1700(Builder builder)
		{
			return builder.handler;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field Handler handler>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$1800(Builder builder)
		{
			return builder.isSyncLoading;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field boolean isSyncLoading>
		//    2    4:ireturn         
		}

*/


/*
		static int access$200(Builder builder)
		{
			return builder.imageResOnFail;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field int imageResOnFail>
		//    2    4:ireturn         
		}

*/


/*
		static Drawable access$300(Builder builder)
		{
			return builder.imageOnLoading;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Drawable imageOnLoading>
		//    2    4:areturn         
		}

*/


/*
		static Drawable access$400(Builder builder)
		{
			return builder.imageForEmptyUri;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Drawable imageForEmptyUri>
		//    2    4:areturn         
		}

*/


/*
		static Drawable access$500(Builder builder)
		{
			return builder.imageOnFail;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Drawable imageOnFail>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$600(Builder builder)
		{
			return builder.resetViewBeforeLoading;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field boolean resetViewBeforeLoading>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$700(Builder builder)
		{
			return builder.cacheInMemory;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field boolean cacheInMemory>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$800(Builder builder)
		{
			return builder.cacheOnDisk;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field boolean cacheOnDisk>
		//    2    4:ireturn         
		}

*/


/*
		static ImageScaleType access$900(Builder builder)
		{
			return builder.imageScaleType;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field ImageScaleType imageScaleType>
		//    2    4:areturn         
		}

*/

		public Builder()
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


	private DisplayImageOptions(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		imageResOnLoading = builder.imageResOnLoading;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #44  <Method int DisplayImageOptions$Builder.access$000(DisplayImageOptions$Builder)>
	//    5    9:putfield        #46  <Field int imageResOnLoading>
		imageResForEmptyUri = builder.imageResForEmptyUri;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #49  <Method int DisplayImageOptions$Builder.access$100(DisplayImageOptions$Builder)>
	//    9   17:putfield        #51  <Field int imageResForEmptyUri>
		imageResOnFail = builder.imageResOnFail;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #54  <Method int DisplayImageOptions$Builder.access$200(DisplayImageOptions$Builder)>
	//   13   25:putfield        #56  <Field int imageResOnFail>
		imageOnLoading = builder.imageOnLoading;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #60  <Method Drawable DisplayImageOptions$Builder.access$300(DisplayImageOptions$Builder)>
	//   17   33:putfield        #62  <Field Drawable imageOnLoading>
		imageForEmptyUri = builder.imageForEmptyUri;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #65  <Method Drawable DisplayImageOptions$Builder.access$400(DisplayImageOptions$Builder)>
	//   21   41:putfield        #67  <Field Drawable imageForEmptyUri>
		imageOnFail = builder.imageOnFail;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #70  <Method Drawable DisplayImageOptions$Builder.access$500(DisplayImageOptions$Builder)>
	//   25   49:putfield        #72  <Field Drawable imageOnFail>
		resetViewBeforeLoading = builder.resetViewBeforeLoading;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #76  <Method boolean DisplayImageOptions$Builder.access$600(DisplayImageOptions$Builder)>
	//   29   57:putfield        #78  <Field boolean resetViewBeforeLoading>
		cacheInMemory = builder.cacheInMemory;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokestatic    #81  <Method boolean DisplayImageOptions$Builder.access$700(DisplayImageOptions$Builder)>
	//   33   65:putfield        #83  <Field boolean cacheInMemory>
		cacheOnDisk = builder.cacheOnDisk;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokestatic    #86  <Method boolean DisplayImageOptions$Builder.access$800(DisplayImageOptions$Builder)>
	//   37   73:putfield        #88  <Field boolean cacheOnDisk>
		imageScaleType = builder.imageScaleType;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokestatic    #92  <Method ImageScaleType DisplayImageOptions$Builder.access$900(DisplayImageOptions$Builder)>
	//   41   81:putfield        #94  <Field ImageScaleType imageScaleType>
		decodingOptions = builder.decodingOptions;
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokestatic    #98  <Method android.graphics.BitmapFactory$Options DisplayImageOptions$Builder.access$1000(DisplayImageOptions$Builder)>
	//   45   89:putfield        #100 <Field android.graphics.BitmapFactory$Options decodingOptions>
		delayBeforeLoading = builder.delayBeforeLoading;
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:invokestatic    #103 <Method int DisplayImageOptions$Builder.access$1100(DisplayImageOptions$Builder)>
	//   49   97:putfield        #105 <Field int delayBeforeLoading>
		considerExifParams = builder.considerExifParams;
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:invokestatic    #108 <Method boolean DisplayImageOptions$Builder.access$1200(DisplayImageOptions$Builder)>
	//   53  105:putfield        #110 <Field boolean considerExifParams>
		extraForDownloader = builder.extraForDownloader;
	//   54  108:aload_0         
	//   55  109:aload_1         
	//   56  110:invokestatic    #114 <Method Object DisplayImageOptions$Builder.access$1300(DisplayImageOptions$Builder)>
	//   57  113:putfield        #116 <Field Object extraForDownloader>
		preProcessor = builder.preProcessor;
	//   58  116:aload_0         
	//   59  117:aload_1         
	//   60  118:invokestatic    #120 <Method BitmapProcessor DisplayImageOptions$Builder.access$1400(DisplayImageOptions$Builder)>
	//   61  121:putfield        #122 <Field BitmapProcessor preProcessor>
		postProcessor = builder.postProcessor;
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:invokestatic    #125 <Method BitmapProcessor DisplayImageOptions$Builder.access$1500(DisplayImageOptions$Builder)>
	//   65  129:putfield        #127 <Field BitmapProcessor postProcessor>
		displayer = builder.displayer;
	//   66  132:aload_0         
	//   67  133:aload_1         
	//   68  134:invokestatic    #131 <Method BitmapDisplayer DisplayImageOptions$Builder.access$1600(DisplayImageOptions$Builder)>
	//   69  137:putfield        #133 <Field BitmapDisplayer displayer>
		handler = builder.handler;
	//   70  140:aload_0         
	//   71  141:aload_1         
	//   72  142:invokestatic    #137 <Method Handler DisplayImageOptions$Builder.access$1700(DisplayImageOptions$Builder)>
	//   73  145:putfield        #139 <Field Handler handler>
		isSyncLoading = builder.isSyncLoading;
	//   74  148:aload_0         
	//   75  149:aload_1         
	//   76  150:invokestatic    #142 <Method boolean DisplayImageOptions$Builder.access$1800(DisplayImageOptions$Builder)>
	//   77  153:putfield        #144 <Field boolean isSyncLoading>
	//   78  156:return          
	}

	DisplayImageOptions(Builder builder, _cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void DisplayImageOptions(DisplayImageOptions$Builder)>
	//    3    5:return          
	}

	public static DisplayImageOptions createSimple()
	{
		return (new Builder()).build();
	//    0    0:new             #6   <Class DisplayImageOptions$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #179 <Method void DisplayImageOptions$Builder()>
	//    3    7:invokevirtual   #182 <Method DisplayImageOptions DisplayImageOptions$Builder.build()>
	//    4   10:areturn         
	}

	public android.graphics.BitmapFactory.Options getDecodingOptions()
	{
		return decodingOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field android.graphics.BitmapFactory$Options decodingOptions>
	//    2    4:areturn         
	}

	public int getDelayBeforeLoading()
	{
		return delayBeforeLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int delayBeforeLoading>
	//    2    4:ireturn         
	}

	public BitmapDisplayer getDisplayer()
	{
		return displayer;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field BitmapDisplayer displayer>
	//    2    4:areturn         
	}

	public Object getExtraForDownloader()
	{
		return extraForDownloader;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Object extraForDownloader>
	//    2    4:areturn         
	}

	public Handler getHandler()
	{
		return handler;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Handler handler>
	//    2    4:areturn         
	}

	public Drawable getImageForEmptyUri(Resources resources)
	{
		if(imageResForEmptyUri != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field int imageResForEmptyUri>
	//*   2    4:ifeq            16
			return resources.getDrawable(imageResForEmptyUri);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field int imageResForEmptyUri>
	//    6   12:invokevirtual   #200 <Method Drawable Resources.getDrawable(int)>
	//    7   15:areturn         
		else
			return imageForEmptyUri;
	//    8   16:aload_0         
	//    9   17:getfield        #67  <Field Drawable imageForEmptyUri>
	//   10   20:areturn         
	}

	public Drawable getImageOnFail(Resources resources)
	{
		if(imageResOnFail != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int imageResOnFail>
	//*   2    4:ifeq            16
			return resources.getDrawable(imageResOnFail);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field int imageResOnFail>
	//    6   12:invokevirtual   #200 <Method Drawable Resources.getDrawable(int)>
	//    7   15:areturn         
		else
			return imageOnFail;
	//    8   16:aload_0         
	//    9   17:getfield        #72  <Field Drawable imageOnFail>
	//   10   20:areturn         
	}

	public Drawable getImageOnLoading(Resources resources)
	{
		if(imageResOnLoading != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field int imageResOnLoading>
	//*   2    4:ifeq            16
			return resources.getDrawable(imageResOnLoading);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field int imageResOnLoading>
	//    6   12:invokevirtual   #200 <Method Drawable Resources.getDrawable(int)>
	//    7   15:areturn         
		else
			return imageOnLoading;
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field Drawable imageOnLoading>
	//   10   20:areturn         
	}

	public ImageScaleType getImageScaleType()
	{
		return imageScaleType;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field ImageScaleType imageScaleType>
	//    2    4:areturn         
	}

	public BitmapProcessor getPostProcessor()
	{
		return postProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field BitmapProcessor postProcessor>
	//    2    4:areturn         
	}

	public BitmapProcessor getPreProcessor()
	{
		return preProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field BitmapProcessor preProcessor>
	//    2    4:areturn         
	}

	public boolean isCacheInMemory()
	{
		return cacheInMemory;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean cacheInMemory>
	//    2    4:ireturn         
	}

	public boolean isCacheOnDisk()
	{
		return cacheOnDisk;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean cacheOnDisk>
	//    2    4:ireturn         
	}

	public boolean isConsiderExifParams()
	{
		return considerExifParams;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field boolean considerExifParams>
	//    2    4:ireturn         
	}

	public boolean isResetViewBeforeLoading()
	{
		return resetViewBeforeLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean resetViewBeforeLoading>
	//    2    4:ireturn         
	}

	boolean isSyncLoading()
	{
		return isSyncLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field boolean isSyncLoading>
	//    2    4:ireturn         
	}

	public boolean shouldDelayBeforeLoading()
	{
		return delayBeforeLoading > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int delayBeforeLoading>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean shouldPostProcess()
	{
		return postProcessor != null;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field BitmapProcessor postProcessor>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean shouldPreProcess()
	{
		return preProcessor != null;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field BitmapProcessor preProcessor>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean shouldShowImageForEmptyUri()
	{
		return imageForEmptyUri != null || imageResForEmptyUri != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Drawable imageForEmptyUri>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field int imageResForEmptyUri>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean shouldShowImageOnFail()
	{
		return imageOnFail != null || imageResOnFail != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Drawable imageOnFail>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field int imageResOnFail>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean shouldShowImageOnLoading()
	{
		return imageOnLoading != null || imageResOnLoading != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Drawable imageOnLoading>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field int imageResOnLoading>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private final boolean cacheInMemory;
	private final boolean cacheOnDisk;
	private final boolean considerExifParams;
	private final android.graphics.BitmapFactory.Options decodingOptions;
	private final int delayBeforeLoading;
	private final BitmapDisplayer displayer;
	private final Object extraForDownloader;
	private final Handler handler;
	private final Drawable imageForEmptyUri;
	private final Drawable imageOnFail;
	private final Drawable imageOnLoading;
	private final int imageResForEmptyUri;
	private final int imageResOnFail;
	private final int imageResOnLoading;
	private final ImageScaleType imageScaleType;
	private final boolean isSyncLoading;
	private final BitmapProcessor postProcessor;
	private final BitmapProcessor preProcessor;
	private final boolean resetViewBeforeLoading;


/*
	static int access$1900(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.imageResOnLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int imageResOnLoading>
	//    2    4:ireturn         
	}

*/


/*
	static int access$2000(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.imageResForEmptyUri;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int imageResForEmptyUri>
	//    2    4:ireturn         
	}

*/


/*
	static int access$2100(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.imageResOnFail;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int imageResOnFail>
	//    2    4:ireturn         
	}

*/


/*
	static Drawable access$2200(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.imageOnLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Drawable imageOnLoading>
	//    2    4:areturn         
	}

*/


/*
	static Drawable access$2300(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.imageForEmptyUri;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Drawable imageForEmptyUri>
	//    2    4:areturn         
	}

*/


/*
	static Drawable access$2400(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.imageOnFail;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Drawable imageOnFail>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$2500(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.resetViewBeforeLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean resetViewBeforeLoading>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$2600(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.cacheInMemory;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean cacheInMemory>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$2700(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.cacheOnDisk;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean cacheOnDisk>
	//    2    4:ireturn         
	}

*/


/*
	static ImageScaleType access$2800(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.imageScaleType;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field ImageScaleType imageScaleType>
	//    2    4:areturn         
	}

*/


/*
	static android.graphics.BitmapFactory.Options access$2900(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.decodingOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field android.graphics.BitmapFactory$Options decodingOptions>
	//    2    4:areturn         
	}

*/


/*
	static int access$3000(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.delayBeforeLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int delayBeforeLoading>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$3100(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.considerExifParams;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field boolean considerExifParams>
	//    2    4:ireturn         
	}

*/


/*
	static Object access$3200(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.extraForDownloader;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Object extraForDownloader>
	//    2    4:areturn         
	}

*/


/*
	static BitmapProcessor access$3300(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.preProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field BitmapProcessor preProcessor>
	//    2    4:areturn         
	}

*/


/*
	static BitmapProcessor access$3400(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.postProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field BitmapProcessor postProcessor>
	//    2    4:areturn         
	}

*/


/*
	static BitmapDisplayer access$3500(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.displayer;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field BitmapDisplayer displayer>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$3600(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Handler handler>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$3700(DisplayImageOptions displayimageoptions)
	{
		return displayimageoptions.isSyncLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field boolean isSyncLoading>
	//    2    4:ireturn         
	}

*/
}
