// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;

import com.startapp.android.publish.common.model.AdPreferences;

public class NativeAdPreferences extends AdPreferences
{
	public static final class NativeAdBitmapSize extends Enum
	{

		public static NativeAdBitmapSize valueOf(String s)
		{
			return (NativeAdBitmapSize)Enum.valueOf(com/startapp/android/publish/ads/nativead/NativeAdPreferences$NativeAdBitmapSize, s);
		//    0    0:ldc1            #2   <Class NativeAdPreferences$NativeAdBitmapSize>
		//    1    2:aload_0         
		//    2    3:invokestatic    #53  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class NativeAdPreferences$NativeAdBitmapSize>
		//    4    9:areturn         
		}

		public static NativeAdBitmapSize[] values()
		{
			return (NativeAdBitmapSize[])((NativeAdBitmapSize []) ($VALUES)).clone();
		//    0    0:getstatic       #38  <Field NativeAdPreferences$NativeAdBitmapSize[] $VALUES>
		//    1    3:invokevirtual   #60  <Method Object _5B_Lcom.startapp.android.publish.ads.nativead.NativeAdPreferences$NativeAdBitmapSize_3B_.clone()>
		//    2    6:checkcast       #56  <Class NativeAdPreferences$NativeAdBitmapSize[]>
		//    3    9:areturn         
		}

		public int getHeight()
		{
			return height;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field int height>
		//    2    4:ireturn         
		}

		public int getWidth()
		{
			return width;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field int width>
		//    2    4:ireturn         
		}

		private static final NativeAdBitmapSize $VALUES[];
		public static final NativeAdBitmapSize SIZE100X100;
		public static final NativeAdBitmapSize SIZE150X150;
		public static final NativeAdBitmapSize SIZE340X340;
		public static final NativeAdBitmapSize SIZE72X72;
		int height;
		int width;

		static 
		{
			SIZE72X72 = new NativeAdBitmapSize("SIZE72X72", 0, 72, 72);
		//    0    0:new             #2   <Class NativeAdPreferences$NativeAdBitmapSize>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "SIZE72X72">
		//    3    6:iconst_0        
		//    4    7:bipush          72
		//    5    9:bipush          72
		//    6   11:invokespecial   #25  <Method void NativeAdPreferences$NativeAdBitmapSize(String, int, int, int)>
		//    7   14:putstatic       #27  <Field NativeAdPreferences$NativeAdBitmapSize SIZE72X72>
			SIZE100X100 = new NativeAdBitmapSize("SIZE100X100", 1, 100, 100);
		//    8   17:new             #2   <Class NativeAdPreferences$NativeAdBitmapSize>
		//    9   20:dup             
		//   10   21:ldc1            #28  <String "SIZE100X100">
		//   11   23:iconst_1        
		//   12   24:bipush          100
		//   13   26:bipush          100
		//   14   28:invokespecial   #25  <Method void NativeAdPreferences$NativeAdBitmapSize(String, int, int, int)>
		//   15   31:putstatic       #30  <Field NativeAdPreferences$NativeAdBitmapSize SIZE100X100>
			SIZE150X150 = new NativeAdBitmapSize("SIZE150X150", 2, 150, 150);
		//   16   34:new             #2   <Class NativeAdPreferences$NativeAdBitmapSize>
		//   17   37:dup             
		//   18   38:ldc1            #31  <String "SIZE150X150">
		//   19   40:iconst_2        
		//   20   41:sipush          150
		//   21   44:sipush          150
		//   22   47:invokespecial   #25  <Method void NativeAdPreferences$NativeAdBitmapSize(String, int, int, int)>
		//   23   50:putstatic       #33  <Field NativeAdPreferences$NativeAdBitmapSize SIZE150X150>
			SIZE340X340 = new NativeAdBitmapSize("SIZE340X340", 3, 340, 340);
		//   24   53:new             #2   <Class NativeAdPreferences$NativeAdBitmapSize>
		//   25   56:dup             
		//   26   57:ldc1            #34  <String "SIZE340X340">
		//   27   59:iconst_3        
		//   28   60:sipush          340
		//   29   63:sipush          340
		//   30   66:invokespecial   #25  <Method void NativeAdPreferences$NativeAdBitmapSize(String, int, int, int)>
		//   31   69:putstatic       #36  <Field NativeAdPreferences$NativeAdBitmapSize SIZE340X340>
			$VALUES = (new NativeAdBitmapSize[] {
				SIZE72X72, SIZE100X100, SIZE150X150, SIZE340X340
			});
		//   32   72:iconst_4        
		//   33   73:anewarray       NativeAdBitmapSize[]
		//   34   76:dup             
		//   35   77:iconst_0        
		//   36   78:getstatic       #27  <Field NativeAdPreferences$NativeAdBitmapSize SIZE72X72>
		//   37   81:aastore         
		//   38   82:dup             
		//   39   83:iconst_1        
		//   40   84:getstatic       #30  <Field NativeAdPreferences$NativeAdBitmapSize SIZE100X100>
		//   41   87:aastore         
		//   42   88:dup             
		//   43   89:iconst_2        
		//   44   90:getstatic       #33  <Field NativeAdPreferences$NativeAdBitmapSize SIZE150X150>
		//   45   93:aastore         
		//   46   94:dup             
		//   47   95:iconst_3        
		//   48   96:getstatic       #36  <Field NativeAdPreferences$NativeAdBitmapSize SIZE340X340>
		//   49   99:aastore         
		//   50  100:putstatic       #38  <Field NativeAdPreferences$NativeAdBitmapSize[] $VALUES>
		//*  51  103:return          
		}

		private NativeAdBitmapSize(String s, int i, int j, int k)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void Enum(String, int)>
			width = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #44  <Field int width>
			height = k;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #46  <Field int height>
		//   10   17:return          
		}
	}


	public NativeAdPreferences()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AdPreferences()>
		adsNumber = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #41  <Field int adsNumber>
		autoBitmapDownload = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #43  <Field boolean autoBitmapDownload>
		primaryImage = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #45  <Field int primaryImage>
		moreImage = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #47  <Field int moreImage>
		isContentAd = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #49  <Field boolean isContentAd>
		useSimpleToken = true;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #51  <Field boolean useSimpleToken>
	//   20   34:return          
	}

	public int getAdsNumber()
	{
		return adsNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int adsNumber>
	//    2    4:ireturn         
	}

	public NativeAdBitmapSize getImageSize()
	{
		return bitmapSize;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field NativeAdPreferences$NativeAdBitmapSize bitmapSize>
	//    2    4:areturn         
	}

	public int getPrimaryImageSize()
	{
		return primaryImage;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int primaryImage>
	//    2    4:ireturn         
	}

	public int getSecondaryImageSize()
	{
		return moreImage;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int moreImage>
	//    2    4:ireturn         
	}

	public boolean isAutoBitmapDownload()
	{
		return autoBitmapDownload;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean autoBitmapDownload>
	//    2    4:ireturn         
	}

	public boolean isContentAd()
	{
		return isContentAd;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean isContentAd>
	//    2    4:ireturn         
	}

	public boolean isSimpleToken()
	{
		return useSimpleToken;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean useSimpleToken>
	//    2    4:ireturn         
	}

	public NativeAdPreferences setAdsNumber(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            15
		{
			throw new IllegalArgumentException(EXCEPTION_LOW_ADS_NUMBER);
	//    2    4:new             #66  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:getstatic       #35  <Field String EXCEPTION_LOW_ADS_NUMBER>
	//    5   11:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			adsNumber = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #41  <Field int adsNumber>
			return this;
	//   10   20:aload_0         
	//   11   21:areturn         
		}
	}

	public NativeAdPreferences setAutoBitmapDownload(boolean flag)
	{
		autoBitmapDownload = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean autoBitmapDownload>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NativeAdPreferences setContentAd(boolean flag)
	{
		isContentAd = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean isContentAd>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NativeAdPreferences setImageSize(NativeAdBitmapSize nativeadbitmapsize)
	{
		bitmapSize = nativeadbitmapsize;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field NativeAdPreferences$NativeAdBitmapSize bitmapSize>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NativeAdPreferences setPrimaryImageSize(int i)
	{
		primaryImage = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int primaryImage>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NativeAdPreferences setSecondaryImageSize(int i)
	{
		moreImage = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int moreImage>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #80  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void StringBuffer()>
	//    3    7:astore_1        
		stringbuffer.append("\n===== NativeAdConfig =====\n");
	//    4    8:aload_1         
	//    5    9:ldc1            #83  <String "\n===== NativeAdConfig =====\n">
	//    6   11:invokevirtual   #87  <Method StringBuffer StringBuffer.append(String)>
	//    7   14:pop             
		stringbuffer.append((new StringBuilder()).append("    adsNumber: [").append(getAdsNumber()).append("]\n").toString());
	//    8   15:aload_1         
	//    9   16:new             #89  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #90  <Method void StringBuilder()>
	//   12   23:ldc1            #92  <String "    adsNumber: [">
	//   13   25:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #97  <Method int getAdsNumber()>
	//   16   32:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   17   35:ldc1            #102 <String "]\n">
	//   18   37:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   20   43:invokevirtual   #87  <Method StringBuffer StringBuffer.append(String)>
	//   21   46:pop             
		stringbuffer.append((new StringBuilder()).append("    autoBitmapDownload: [").append(isAutoBitmapDownload()).append("]\n").toString());
	//   22   47:aload_1         
	//   23   48:new             #89  <Class StringBuilder>
	//   24   51:dup             
	//   25   52:invokespecial   #90  <Method void StringBuilder()>
	//   26   55:ldc1            #106 <String "    autoBitmapDownload: [">
	//   27   57:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   28   60:aload_0         
	//   29   61:invokevirtual   #108 <Method boolean isAutoBitmapDownload()>
	//   30   64:invokevirtual   #111 <Method StringBuilder StringBuilder.append(boolean)>
	//   31   67:ldc1            #102 <String "]\n">
	//   32   69:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   33   72:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   34   75:invokevirtual   #87  <Method StringBuffer StringBuffer.append(String)>
	//   35   78:pop             
		stringbuffer.append((new StringBuilder()).append("    useSimpleToken: [").append(isSimpleToken()).append("]\n").toString());
	//   36   79:aload_1         
	//   37   80:new             #89  <Class StringBuilder>
	//   38   83:dup             
	//   39   84:invokespecial   #90  <Method void StringBuilder()>
	//   40   87:ldc1            #113 <String "    useSimpleToken: [">
	//   41   89:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   42   92:aload_0         
	//   43   93:invokevirtual   #115 <Method boolean isSimpleToken()>
	//   44   96:invokevirtual   #111 <Method StringBuilder StringBuilder.append(boolean)>
	//   45   99:ldc1            #102 <String "]\n">
	//   46  101:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   47  104:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   48  107:invokevirtual   #87  <Method StringBuffer StringBuffer.append(String)>
	//   49  110:pop             
		stringbuffer.append("===== End NativeAdConfig =====");
	//   50  111:aload_1         
	//   51  112:ldc1            #117 <String "===== End NativeAdConfig =====">
	//   52  114:invokevirtual   #87  <Method StringBuffer StringBuffer.append(String)>
	//   53  117:pop             
		return stringbuffer.toString();
	//   54  118:aload_1         
	//   55  119:invokevirtual   #118 <Method String StringBuffer.toString()>
	//   56  122:areturn         
	}

	public NativeAdPreferences useSimpleToken(boolean flag)
	{
		useSimpleToken = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field boolean useSimpleToken>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final int DEFAULT_ADS_NUMBER = 1;
	private static final boolean DEFAULT_AUTO_DOWNLOAD_BITMAP = false;
	private static final boolean DEFAULT_IS_CONTENT_AD = false;
	private static final boolean DEFAULT_USE_SIMPLE_TOKEN = true;
	private static String EXCEPTION_LOW_ADS_NUMBER = "Ads Number must be >= 1";
	private static final long serialVersionUID = 1L;
	private int adsNumber;
	private boolean autoBitmapDownload;
	private NativeAdBitmapSize bitmapSize;
	private boolean isContentAd;
	private int moreImage;
	private int primaryImage;
	private boolean useSimpleToken;

	static 
	{
	//    0    0:ldc1            #33  <String "Ads Number must be >= 1">
	//    1    2:putstatic       #35  <Field String EXCEPTION_LOW_ADS_NUMBER>
	//*   2    5:return          
	}
}
