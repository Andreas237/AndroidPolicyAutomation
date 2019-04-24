// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;


// Referenced classes of package com.startapp.android.publish.ads.splash:
//			SplashConfig

public static final class SplashConfig$Orientation extends Enum
{

	public static SplashConfig$Orientation getByIndex(int i)
	{
		SplashConfig$Orientation splashconfig$orientation = PORTRAIT;
	//    0    0:getstatic       #25  <Field SplashConfig$Orientation PORTRAIT>
	//    1    3:astore_2        
		SplashConfig$Orientation asplashconfig$orientation[] = values();
	//    2    4:invokestatic    #47  <Method SplashConfig$Orientation[] values()>
	//    3    7:astore_3        
		for(int j = 0; j < asplashconfig$orientation.length; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpge          37
			if(asplashconfig$orientation[j].getIndex() == i)
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #51  <Method int getIndex()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          30
				splashconfig$orientation = asplashconfig$orientation[j];
	//   16   26:aload_3         
	//   17   27:iload_1         
	//   18   28:aaload          
	//   19   29:astore_2        

	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_1        
	//*  24   34:goto            10
		return splashconfig$orientation;
	//   25   37:aload_2         
	//   26   38:areturn         
	}

	public static SplashConfig$Orientation getByName(String s)
	{
		SplashConfig$Orientation splashconfig$orientation = AUTO;
	//    0    0:getstatic       #31  <Field SplashConfig$Orientation AUTO>
	//    1    3:astore_2        
		SplashConfig$Orientation asplashconfig$orientation[] = values();
	//    2    4:invokestatic    #47  <Method SplashConfig$Orientation[] values()>
	//    3    7:astore_3        
		for(int i = 0; i < asplashconfig$orientation.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpge          46
			if(asplashconfig$orientation[i].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #57  <Method String name()>
	//*  14   22:invokevirtual   #62  <Method String String.toLowerCase()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #62  <Method String String.toLowerCase()>
	//*  17   29:invokevirtual   #66  <Method int String.compareTo(String)>
	//*  18   32:ifne            39
				splashconfig$orientation = asplashconfig$orientation[i];
	//   19   35:aload_3         
	//   20   36:iload_1         
	//   21   37:aaload          
	//   22   38:astore_2        

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            10
		return splashconfig$orientation;
	//   28   46:aload_2         
	//   29   47:areturn         
	}

	public static SplashConfig$Orientation valueOf(String s)
	{
		return (SplashConfig$Orientation)Enum.valueOf(com/startapp/android/publish/ads/splash/SplashConfig$Orientation, s);
	//    0    0:ldc1            #2   <Class SplashConfig$Orientation>
	//    1    2:aload_0         
	//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SplashConfig$Orientation>
	//    4    9:areturn         
	}

	public static SplashConfig$Orientation[] values()
	{
		return (SplashConfig$Orientation[])((SplashConfig$Orientation []) ($VALUES)).clone();
	//    0    0:getstatic       #33  <Field SplashConfig$Orientation[] $VALUES>
	//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.startapp.android.publish.ads.splash.SplashConfig$Orientation_3B_.clone()>
	//    2    6:checkcast       #71  <Class SplashConfig$Orientation[]>
	//    3    9:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int index>
	//    2    4:ireturn         
	}

	private static final SplashConfig$Orientation $VALUES[];
	public static final SplashConfig$Orientation AUTO;
	public static final SplashConfig$Orientation LANDSCAPE;
	public static final SplashConfig$Orientation PORTRAIT;
	private int index;

	static 
	{
		PORTRAIT = new SplashConfig$Orientation("PORTRAIT", 0, 1);
	//    0    0:new             #2   <Class SplashConfig$Orientation>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "PORTRAIT">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #23  <Method void SplashConfig$Orientation(String, int, int)>
	//    6   11:putstatic       #25  <Field SplashConfig$Orientation PORTRAIT>
		LANDSCAPE = new SplashConfig$Orientation("LANDSCAPE", 1, 2);
	//    7   14:new             #2   <Class SplashConfig$Orientation>
	//    8   17:dup             
	//    9   18:ldc1            #26  <String "LANDSCAPE">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #23  <Method void SplashConfig$Orientation(String, int, int)>
	//   13   25:putstatic       #28  <Field SplashConfig$Orientation LANDSCAPE>
		AUTO = new SplashConfig$Orientation("AUTO", 2, 3);
	//   14   28:new             #2   <Class SplashConfig$Orientation>
	//   15   31:dup             
	//   16   32:ldc1            #29  <String "AUTO">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #23  <Method void SplashConfig$Orientation(String, int, int)>
	//   20   39:putstatic       #31  <Field SplashConfig$Orientation AUTO>
		$VALUES = (new SplashConfig$Orientation[] {
			PORTRAIT, LANDSCAPE, AUTO
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       SplashConfig$Orientation[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #25  <Field SplashConfig$Orientation PORTRAIT>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #28  <Field SplashConfig$Orientation LANDSCAPE>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #31  <Field SplashConfig$Orientation AUTO>
	//   34   63:aastore         
	//   35   64:putstatic       #33  <Field SplashConfig$Orientation[] $VALUES>
	//*  36   67:return          
	}

	private SplashConfig$Orientation(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		index = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #39  <Field int index>
	//    7   11:return          
	}
}
