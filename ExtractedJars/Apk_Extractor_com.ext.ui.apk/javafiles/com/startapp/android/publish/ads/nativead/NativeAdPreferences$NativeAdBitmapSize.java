// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;


// Referenced classes of package com.startapp.android.publish.ads.nativead:
//			NativeAdPreferences

public static final class NativeAdPreferences$NativeAdBitmapSize extends Enum
{

	public static NativeAdPreferences$NativeAdBitmapSize valueOf(String s)
	{
		return (NativeAdPreferences$NativeAdBitmapSize)Enum.valueOf(com/startapp/android/publish/ads/nativead/NativeAdPreferences$NativeAdBitmapSize, s);
	//    0    0:ldc1            #2   <Class NativeAdPreferences$NativeAdBitmapSize>
	//    1    2:aload_0         
	//    2    3:invokestatic    #53  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class NativeAdPreferences$NativeAdBitmapSize>
	//    4    9:areturn         
	}

	public static NativeAdPreferences$NativeAdBitmapSize[] values()
	{
		return (NativeAdPreferences$NativeAdBitmapSize[])((NativeAdPreferences$NativeAdBitmapSize []) ($VALUES)).clone();
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

	private static final NativeAdPreferences$NativeAdBitmapSize $VALUES[];
	public static final NativeAdPreferences$NativeAdBitmapSize SIZE100X100;
	public static final NativeAdPreferences$NativeAdBitmapSize SIZE150X150;
	public static final NativeAdPreferences$NativeAdBitmapSize SIZE340X340;
	public static final NativeAdPreferences$NativeAdBitmapSize SIZE72X72;
	int height;
	int width;

	static 
	{
		SIZE72X72 = new NativeAdPreferences$NativeAdBitmapSize("SIZE72X72", 0, 72, 72);
	//    0    0:new             #2   <Class NativeAdPreferences$NativeAdBitmapSize>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "SIZE72X72">
	//    3    6:iconst_0        
	//    4    7:bipush          72
	//    5    9:bipush          72
	//    6   11:invokespecial   #25  <Method void NativeAdPreferences$NativeAdBitmapSize(String, int, int, int)>
	//    7   14:putstatic       #27  <Field NativeAdPreferences$NativeAdBitmapSize SIZE72X72>
		SIZE100X100 = new NativeAdPreferences$NativeAdBitmapSize("SIZE100X100", 1, 100, 100);
	//    8   17:new             #2   <Class NativeAdPreferences$NativeAdBitmapSize>
	//    9   20:dup             
	//   10   21:ldc1            #28  <String "SIZE100X100">
	//   11   23:iconst_1        
	//   12   24:bipush          100
	//   13   26:bipush          100
	//   14   28:invokespecial   #25  <Method void NativeAdPreferences$NativeAdBitmapSize(String, int, int, int)>
	//   15   31:putstatic       #30  <Field NativeAdPreferences$NativeAdBitmapSize SIZE100X100>
		SIZE150X150 = new NativeAdPreferences$NativeAdBitmapSize("SIZE150X150", 2, 150, 150);
	//   16   34:new             #2   <Class NativeAdPreferences$NativeAdBitmapSize>
	//   17   37:dup             
	//   18   38:ldc1            #31  <String "SIZE150X150">
	//   19   40:iconst_2        
	//   20   41:sipush          150
	//   21   44:sipush          150
	//   22   47:invokespecial   #25  <Method void NativeAdPreferences$NativeAdBitmapSize(String, int, int, int)>
	//   23   50:putstatic       #33  <Field NativeAdPreferences$NativeAdBitmapSize SIZE150X150>
		SIZE340X340 = new NativeAdPreferences$NativeAdBitmapSize("SIZE340X340", 3, 340, 340);
	//   24   53:new             #2   <Class NativeAdPreferences$NativeAdBitmapSize>
	//   25   56:dup             
	//   26   57:ldc1            #34  <String "SIZE340X340">
	//   27   59:iconst_3        
	//   28   60:sipush          340
	//   29   63:sipush          340
	//   30   66:invokespecial   #25  <Method void NativeAdPreferences$NativeAdBitmapSize(String, int, int, int)>
	//   31   69:putstatic       #36  <Field NativeAdPreferences$NativeAdBitmapSize SIZE340X340>
		$VALUES = (new NativeAdPreferences$NativeAdBitmapSize[] {
			SIZE72X72, SIZE100X100, SIZE150X150, SIZE340X340
		});
	//   32   72:iconst_4        
	//   33   73:anewarray       NativeAdPreferences$NativeAdBitmapSize[]
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

	private NativeAdPreferences$NativeAdBitmapSize(String s, int i, int j, int k)
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
