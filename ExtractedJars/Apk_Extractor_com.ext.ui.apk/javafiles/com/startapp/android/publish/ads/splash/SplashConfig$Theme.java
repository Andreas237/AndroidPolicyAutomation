// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;


// Referenced classes of package com.startapp.android.publish.ads.splash:
//			SplashConfig

public static final class SplashConfig$Theme extends Enum
{

	public static SplashConfig$Theme getByIndex(int i)
	{
		SplashConfig$Theme splashconfig$theme = DEEP_BLUE;
	//    0    0:getstatic       #29  <Field SplashConfig$Theme DEEP_BLUE>
	//    1    3:astore_2        
		SplashConfig$Theme asplashconfig$theme[] = values();
	//    2    4:invokestatic    #63  <Method SplashConfig$Theme[] values()>
	//    3    7:astore_3        
		for(int j = 0; j < asplashconfig$theme.length; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpge          37
			if(asplashconfig$theme[j].getIndex() == i)
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #67  <Method int getIndex()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          30
				splashconfig$theme = asplashconfig$theme[j];
	//   16   26:aload_3         
	//   17   27:iload_1         
	//   18   28:aaload          
	//   19   29:astore_2        

	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_1        
	//*  24   34:goto            10
		return splashconfig$theme;
	//   25   37:aload_2         
	//   26   38:areturn         
	}

	public static SplashConfig$Theme getByName(String s)
	{
		SplashConfig$Theme splashconfig$theme = DEEP_BLUE;
	//    0    0:getstatic       #29  <Field SplashConfig$Theme DEEP_BLUE>
	//    1    3:astore_2        
		SplashConfig$Theme asplashconfig$theme[] = values();
	//    2    4:invokestatic    #63  <Method SplashConfig$Theme[] values()>
	//    3    7:astore_3        
		for(int i = 0; i < asplashconfig$theme.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpge          46
			if(asplashconfig$theme[i].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #73  <Method String name()>
	//*  14   22:invokevirtual   #78  <Method String String.toLowerCase()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #78  <Method String String.toLowerCase()>
	//*  17   29:invokevirtual   #82  <Method int String.compareTo(String)>
	//*  18   32:ifne            39
				splashconfig$theme = asplashconfig$theme[i];
	//   19   35:aload_3         
	//   20   36:iload_1         
	//   21   37:aaload          
	//   22   38:astore_2        

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            10
		return splashconfig$theme;
	//   28   46:aload_2         
	//   29   47:areturn         
	}

	public static SplashConfig$Theme valueOf(String s)
	{
		return (SplashConfig$Theme)Enum.valueOf(com/startapp/android/publish/ads/splash/SplashConfig$Theme, s);
	//    0    0:ldc1            #2   <Class SplashConfig$Theme>
	//    1    2:aload_0         
	//    2    3:invokestatic    #86  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SplashConfig$Theme>
	//    4    9:areturn         
	}

	public static SplashConfig$Theme[] values()
	{
		return (SplashConfig$Theme[])((SplashConfig$Theme []) ($VALUES)).clone();
	//    0    0:getstatic       #49  <Field SplashConfig$Theme[] $VALUES>
	//    1    3:invokevirtual   #91  <Method Object _5B_Lcom.startapp.android.publish.ads.splash.SplashConfig$Theme_3B_.clone()>
	//    2    6:checkcast       #87  <Class SplashConfig$Theme[]>
	//    3    9:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int index>
	//    2    4:ireturn         
	}

	private static final SplashConfig$Theme $VALUES[];
	public static final SplashConfig$Theme ASHEN_SKY;
	public static final SplashConfig$Theme BLAZE;
	public static final SplashConfig$Theme DEEP_BLUE;
	public static final SplashConfig$Theme GLOOMY;
	public static final SplashConfig$Theme OCEAN;
	public static final SplashConfig$Theme SKY;
	public static final SplashConfig$Theme USER_DEFINED;
	private int index;

	static 
	{
		DEEP_BLUE = new SplashConfig$Theme("DEEP_BLUE", 0, 1);
	//    0    0:new             #2   <Class SplashConfig$Theme>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "DEEP_BLUE">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
	//    6   11:putstatic       #29  <Field SplashConfig$Theme DEEP_BLUE>
		SKY = new SplashConfig$Theme("SKY", 1, 2);
	//    7   14:new             #2   <Class SplashConfig$Theme>
	//    8   17:dup             
	//    9   18:ldc1            #30  <String "SKY">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
	//   13   25:putstatic       #32  <Field SplashConfig$Theme SKY>
		ASHEN_SKY = new SplashConfig$Theme("ASHEN_SKY", 2, 3);
	//   14   28:new             #2   <Class SplashConfig$Theme>
	//   15   31:dup             
	//   16   32:ldc1            #33  <String "ASHEN_SKY">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
	//   20   39:putstatic       #35  <Field SplashConfig$Theme ASHEN_SKY>
		BLAZE = new SplashConfig$Theme("BLAZE", 3, 4);
	//   21   42:new             #2   <Class SplashConfig$Theme>
	//   22   45:dup             
	//   23   46:ldc1            #36  <String "BLAZE">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
	//   27   53:putstatic       #38  <Field SplashConfig$Theme BLAZE>
		GLOOMY = new SplashConfig$Theme("GLOOMY", 4, 5);
	//   28   56:new             #2   <Class SplashConfig$Theme>
	//   29   59:dup             
	//   30   60:ldc1            #39  <String "GLOOMY">
	//   31   62:iconst_4        
	//   32   63:iconst_5        
	//   33   64:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
	//   34   67:putstatic       #41  <Field SplashConfig$Theme GLOOMY>
		OCEAN = new SplashConfig$Theme("OCEAN", 5, 6);
	//   35   70:new             #2   <Class SplashConfig$Theme>
	//   36   73:dup             
	//   37   74:ldc1            #42  <String "OCEAN">
	//   38   76:iconst_5        
	//   39   77:bipush          6
	//   40   79:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
	//   41   82:putstatic       #44  <Field SplashConfig$Theme OCEAN>
		USER_DEFINED = new SplashConfig$Theme("USER_DEFINED", 6, 0);
	//   42   85:new             #2   <Class SplashConfig$Theme>
	//   43   88:dup             
	//   44   89:ldc1            #45  <String "USER_DEFINED">
	//   45   91:bipush          6
	//   46   93:iconst_0        
	//   47   94:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
	//   48   97:putstatic       #47  <Field SplashConfig$Theme USER_DEFINED>
		$VALUES = (new SplashConfig$Theme[] {
			DEEP_BLUE, SKY, ASHEN_SKY, BLAZE, GLOOMY, OCEAN, USER_DEFINED
		});
	//   49  100:bipush          7
	//   50  102:anewarray       SplashConfig$Theme[]
	//   51  105:dup             
	//   52  106:iconst_0        
	//   53  107:getstatic       #29  <Field SplashConfig$Theme DEEP_BLUE>
	//   54  110:aastore         
	//   55  111:dup             
	//   56  112:iconst_1        
	//   57  113:getstatic       #32  <Field SplashConfig$Theme SKY>
	//   58  116:aastore         
	//   59  117:dup             
	//   60  118:iconst_2        
	//   61  119:getstatic       #35  <Field SplashConfig$Theme ASHEN_SKY>
	//   62  122:aastore         
	//   63  123:dup             
	//   64  124:iconst_3        
	//   65  125:getstatic       #38  <Field SplashConfig$Theme BLAZE>
	//   66  128:aastore         
	//   67  129:dup             
	//   68  130:iconst_4        
	//   69  131:getstatic       #41  <Field SplashConfig$Theme GLOOMY>
	//   70  134:aastore         
	//   71  135:dup             
	//   72  136:iconst_5        
	//   73  137:getstatic       #44  <Field SplashConfig$Theme OCEAN>
	//   74  140:aastore         
	//   75  141:dup             
	//   76  142:bipush          6
	//   77  144:getstatic       #47  <Field SplashConfig$Theme USER_DEFINED>
	//   78  147:aastore         
	//   79  148:putstatic       #49  <Field SplashConfig$Theme[] $VALUES>
	//*  80  151:return          
	}

	private SplashConfig$Theme(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		index = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #55  <Field int index>
	//    7   11:return          
	}
}
