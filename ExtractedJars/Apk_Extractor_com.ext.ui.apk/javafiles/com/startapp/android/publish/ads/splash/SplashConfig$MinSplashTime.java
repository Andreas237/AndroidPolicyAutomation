// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;


// Referenced classes of package com.startapp.android.publish.ads.splash:
//			SplashConfig

public static final class SplashConfig$MinSplashTime extends Enum
{

	public static SplashConfig$MinSplashTime getByIndex(long l)
	{
		SplashConfig$MinSplashTime splashconfig$minsplashtime = SHORT;
	//    0    0:getstatic       #28  <Field SplashConfig$MinSplashTime SHORT>
	//    1    3:astore_3        
		SplashConfig$MinSplashTime asplashconfig$minsplashtime[] = values();
	//    2    4:invokestatic    #47  <Method SplashConfig$MinSplashTime[] values()>
	//    3    7:astore          4
		for(int i = 0; i < asplashconfig$minsplashtime.length; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_2        
	//*   6   11:iload_2         
	//*   7   12:aload           4
	//*   8   14:arraylength     
	//*   9   15:icmpge          42
			if(asplashconfig$minsplashtime[i].getIndex() == l)
	//*  10   18:aload           4
	//*  11   20:iload_2         
	//*  12   21:aaload          
	//*  13   22:invokevirtual   #51  <Method long getIndex()>
	//*  14   25:lload_0         
	//*  15   26:lcmp            
	//*  16   27:ifne            35
				splashconfig$minsplashtime = asplashconfig$minsplashtime[i];
	//   17   30:aload           4
	//   18   32:iload_2         
	//   19   33:aaload          
	//   20   34:astore_3        

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
	//*  25   39:goto            11
		return splashconfig$minsplashtime;
	//   26   42:aload_3         
	//   27   43:areturn         
	}

	public static SplashConfig$MinSplashTime getByName(String s)
	{
		SplashConfig$MinSplashTime splashconfig$minsplashtime = LONG;
	//    0    0:getstatic       #31  <Field SplashConfig$MinSplashTime LONG>
	//    1    3:astore_2        
		SplashConfig$MinSplashTime asplashconfig$minsplashtime[] = values();
	//    2    4:invokestatic    #47  <Method SplashConfig$MinSplashTime[] values()>
	//    3    7:astore_3        
		for(int i = 0; i < asplashconfig$minsplashtime.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpge          46
			if(asplashconfig$minsplashtime[i].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #57  <Method String name()>
	//*  14   22:invokevirtual   #62  <Method String String.toLowerCase()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #62  <Method String String.toLowerCase()>
	//*  17   29:invokevirtual   #66  <Method int String.compareTo(String)>
	//*  18   32:ifne            39
				splashconfig$minsplashtime = asplashconfig$minsplashtime[i];
	//   19   35:aload_3         
	//   20   36:iload_1         
	//   21   37:aaload          
	//   22   38:astore_2        

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            10
		return splashconfig$minsplashtime;
	//   28   46:aload_2         
	//   29   47:areturn         
	}

	public static SplashConfig$MinSplashTime valueOf(String s)
	{
		return (SplashConfig$MinSplashTime)Enum.valueOf(com/startapp/android/publish/ads/splash/SplashConfig$MinSplashTime, s);
	//    0    0:ldc1            #2   <Class SplashConfig$MinSplashTime>
	//    1    2:aload_0         
	//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SplashConfig$MinSplashTime>
	//    4    9:areturn         
	}

	public static SplashConfig$MinSplashTime[] values()
	{
		return (SplashConfig$MinSplashTime[])((SplashConfig$MinSplashTime []) ($VALUES)).clone();
	//    0    0:getstatic       #33  <Field SplashConfig$MinSplashTime[] $VALUES>
	//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.startapp.android.publish.ads.splash.SplashConfig$MinSplashTime_3B_.clone()>
	//    2    6:checkcast       #71  <Class SplashConfig$MinSplashTime[]>
	//    3    9:areturn         
	}

	public long getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long index>
	//    2    4:lreturn         
	}

	private static final SplashConfig$MinSplashTime $VALUES[];
	public static final SplashConfig$MinSplashTime LONG;
	public static final SplashConfig$MinSplashTime REGULAR;
	public static final SplashConfig$MinSplashTime SHORT;
	private long index;

	static 
	{
		REGULAR = new SplashConfig$MinSplashTime("REGULAR", 0, 3000);
	//    0    0:new             #2   <Class SplashConfig$MinSplashTime>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "REGULAR">
	//    3    6:iconst_0        
	//    4    7:sipush          3000
	//    5   10:invokespecial   #23  <Method void SplashConfig$MinSplashTime(String, int, int)>
	//    6   13:putstatic       #25  <Field SplashConfig$MinSplashTime REGULAR>
		SHORT = new SplashConfig$MinSplashTime("SHORT", 1, 2000);
	//    7   16:new             #2   <Class SplashConfig$MinSplashTime>
	//    8   19:dup             
	//    9   20:ldc1            #26  <String "SHORT">
	//   10   22:iconst_1        
	//   11   23:sipush          2000
	//   12   26:invokespecial   #23  <Method void SplashConfig$MinSplashTime(String, int, int)>
	//   13   29:putstatic       #28  <Field SplashConfig$MinSplashTime SHORT>
		LONG = new SplashConfig$MinSplashTime("LONG", 2, 5000);
	//   14   32:new             #2   <Class SplashConfig$MinSplashTime>
	//   15   35:dup             
	//   16   36:ldc1            #29  <String "LONG">
	//   17   38:iconst_2        
	//   18   39:sipush          5000
	//   19   42:invokespecial   #23  <Method void SplashConfig$MinSplashTime(String, int, int)>
	//   20   45:putstatic       #31  <Field SplashConfig$MinSplashTime LONG>
		$VALUES = (new SplashConfig$MinSplashTime[] {
			REGULAR, SHORT, LONG
		});
	//   21   48:iconst_3        
	//   22   49:anewarray       SplashConfig$MinSplashTime[]
	//   23   52:dup             
	//   24   53:iconst_0        
	//   25   54:getstatic       #25  <Field SplashConfig$MinSplashTime REGULAR>
	//   26   57:aastore         
	//   27   58:dup             
	//   28   59:iconst_1        
	//   29   60:getstatic       #28  <Field SplashConfig$MinSplashTime SHORT>
	//   30   63:aastore         
	//   31   64:dup             
	//   32   65:iconst_2        
	//   33   66:getstatic       #31  <Field SplashConfig$MinSplashTime LONG>
	//   34   69:aastore         
	//   35   70:putstatic       #33  <Field SplashConfig$MinSplashTime[] $VALUES>
	//*  36   73:return          
	}

	private SplashConfig$MinSplashTime(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		index = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:i2l             
	//    7    9:putfield        #39  <Field long index>
	//    8   12:return          
	}
}
