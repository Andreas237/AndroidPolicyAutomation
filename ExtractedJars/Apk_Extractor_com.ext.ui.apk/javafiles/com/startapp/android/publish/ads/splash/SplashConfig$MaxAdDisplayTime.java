// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;


// Referenced classes of package com.startapp.android.publish.ads.splash:
//			SplashConfig

public static final class SplashConfig$MaxAdDisplayTime extends Enum
{

	public static SplashConfig$MaxAdDisplayTime getByIndex(long l)
	{
		SplashConfig$MaxAdDisplayTime splashconfig$maxaddisplaytime = SHORT;
	//    0    0:getstatic       #27  <Field SplashConfig$MaxAdDisplayTime SHORT>
	//    1    3:astore_3        
		SplashConfig$MaxAdDisplayTime asplashconfig$maxaddisplaytime[] = values();
	//    2    4:invokestatic    #53  <Method SplashConfig$MaxAdDisplayTime[] values()>
	//    3    7:astore          4
		for(int i = 0; i < asplashconfig$maxaddisplaytime.length; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_2        
	//*   6   11:iload_2         
	//*   7   12:aload           4
	//*   8   14:arraylength     
	//*   9   15:icmpge          42
			if(asplashconfig$maxaddisplaytime[i].getIndex() == l)
	//*  10   18:aload           4
	//*  11   20:iload_2         
	//*  12   21:aaload          
	//*  13   22:invokevirtual   #57  <Method long getIndex()>
	//*  14   25:lload_0         
	//*  15   26:lcmp            
	//*  16   27:ifne            35
				splashconfig$maxaddisplaytime = asplashconfig$maxaddisplaytime[i];
	//   17   30:aload           4
	//   18   32:iload_2         
	//   19   33:aaload          
	//   20   34:astore_3        

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
	//*  25   39:goto            11
		return splashconfig$maxaddisplaytime;
	//   26   42:aload_3         
	//   27   43:areturn         
	}

	public static SplashConfig$MaxAdDisplayTime getByName(String s)
	{
		SplashConfig$MaxAdDisplayTime splashconfig$maxaddisplaytime = FOR_EVER;
	//    0    0:getstatic       #37  <Field SplashConfig$MaxAdDisplayTime FOR_EVER>
	//    1    3:astore_2        
		SplashConfig$MaxAdDisplayTime asplashconfig$maxaddisplaytime[] = values();
	//    2    4:invokestatic    #53  <Method SplashConfig$MaxAdDisplayTime[] values()>
	//    3    7:astore_3        
		for(int i = 0; i < asplashconfig$maxaddisplaytime.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpge          46
			if(asplashconfig$maxaddisplaytime[i].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #63  <Method String name()>
	//*  14   22:invokevirtual   #68  <Method String String.toLowerCase()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #68  <Method String String.toLowerCase()>
	//*  17   29:invokevirtual   #72  <Method int String.compareTo(String)>
	//*  18   32:ifne            39
				splashconfig$maxaddisplaytime = asplashconfig$maxaddisplaytime[i];
	//   19   35:aload_3         
	//   20   36:iload_1         
	//   21   37:aaload          
	//   22   38:astore_2        

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            10
		return splashconfig$maxaddisplaytime;
	//   28   46:aload_2         
	//   29   47:areturn         
	}

	public static SplashConfig$MaxAdDisplayTime valueOf(String s)
	{
		return (SplashConfig$MaxAdDisplayTime)Enum.valueOf(com/startapp/android/publish/ads/splash/SplashConfig$MaxAdDisplayTime, s);
	//    0    0:ldc1            #2   <Class SplashConfig$MaxAdDisplayTime>
	//    1    2:aload_0         
	//    2    3:invokestatic    #76  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SplashConfig$MaxAdDisplayTime>
	//    4    9:areturn         
	}

	public static SplashConfig$MaxAdDisplayTime[] values()
	{
		return (SplashConfig$MaxAdDisplayTime[])((SplashConfig$MaxAdDisplayTime []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field SplashConfig$MaxAdDisplayTime[] $VALUES>
	//    1    3:invokevirtual   #81  <Method Object _5B_Lcom.startapp.android.publish.ads.splash.SplashConfig$MaxAdDisplayTime_3B_.clone()>
	//    2    6:checkcast       #77  <Class SplashConfig$MaxAdDisplayTime[]>
	//    3    9:areturn         
	}

	public long getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field long index>
	//    2    4:lreturn         
	}

	private static final SplashConfig$MaxAdDisplayTime $VALUES[];
	public static final SplashConfig$MaxAdDisplayTime FOR_EVER;
	public static final SplashConfig$MaxAdDisplayTime LONG;
	public static final SplashConfig$MaxAdDisplayTime SHORT;
	private long index;

	static 
	{
		SHORT = new SplashConfig$MaxAdDisplayTime("SHORT", 0, 5000L);
	//    0    0:new             #2   <Class SplashConfig$MaxAdDisplayTime>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "SHORT">
	//    3    6:iconst_0        
	//    4    7:ldc2w           #20  <Long 5000L>
	//    5   10:invokespecial   #25  <Method void SplashConfig$MaxAdDisplayTime(String, int, long)>
	//    6   13:putstatic       #27  <Field SplashConfig$MaxAdDisplayTime SHORT>
		LONG = new SplashConfig$MaxAdDisplayTime("LONG", 1, 10000L);
	//    7   16:new             #2   <Class SplashConfig$MaxAdDisplayTime>
	//    8   19:dup             
	//    9   20:ldc1            #28  <String "LONG">
	//   10   22:iconst_1        
	//   11   23:ldc2w           #29  <Long 10000L>
	//   12   26:invokespecial   #25  <Method void SplashConfig$MaxAdDisplayTime(String, int, long)>
	//   13   29:putstatic       #32  <Field SplashConfig$MaxAdDisplayTime LONG>
		FOR_EVER = new SplashConfig$MaxAdDisplayTime("FOR_EVER", 2, 0x5265c00L);
	//   14   32:new             #2   <Class SplashConfig$MaxAdDisplayTime>
	//   15   35:dup             
	//   16   36:ldc1            #33  <String "FOR_EVER">
	//   17   38:iconst_2        
	//   18   39:ldc2w           #34  <Long 0x5265c00L>
	//   19   42:invokespecial   #25  <Method void SplashConfig$MaxAdDisplayTime(String, int, long)>
	//   20   45:putstatic       #37  <Field SplashConfig$MaxAdDisplayTime FOR_EVER>
		$VALUES = (new SplashConfig$MaxAdDisplayTime[] {
			SHORT, LONG, FOR_EVER
		});
	//   21   48:iconst_3        
	//   22   49:anewarray       SplashConfig$MaxAdDisplayTime[]
	//   23   52:dup             
	//   24   53:iconst_0        
	//   25   54:getstatic       #27  <Field SplashConfig$MaxAdDisplayTime SHORT>
	//   26   57:aastore         
	//   27   58:dup             
	//   28   59:iconst_1        
	//   29   60:getstatic       #32  <Field SplashConfig$MaxAdDisplayTime LONG>
	//   30   63:aastore         
	//   31   64:dup             
	//   32   65:iconst_2        
	//   33   66:getstatic       #37  <Field SplashConfig$MaxAdDisplayTime FOR_EVER>
	//   34   69:aastore         
	//   35   70:putstatic       #39  <Field SplashConfig$MaxAdDisplayTime[] $VALUES>
	//*  36   73:return          
	}

	private SplashConfig$MaxAdDisplayTime(String s, int i, long l)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void Enum(String, int)>
		index = l;
	//    4    6:aload_0         
	//    5    7:lload_3         
	//    6    8:putfield        #45  <Field long index>
	//    7   11:return          
	}
}
