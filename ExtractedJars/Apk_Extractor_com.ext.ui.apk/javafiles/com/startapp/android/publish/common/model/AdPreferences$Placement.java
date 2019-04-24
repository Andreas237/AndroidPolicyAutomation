// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;


// Referenced classes of package com.startapp.android.publish.common.model:
//			AdPreferences

public static final class AdPreferences$Placement extends Enum
{

	public static AdPreferences$Placement getByIndex(int i)
	{
		AdPreferences$Placement adpreferences$placement = INAPP_FULL_SCREEN;
	//    0    0:getstatic       #31  <Field AdPreferences$Placement INAPP_FULL_SCREEN>
	//    1    3:astore_2        
		AdPreferences$Placement aadpreferences$placement[] = values();
	//    2    4:invokestatic    #71  <Method AdPreferences$Placement[] values()>
	//    3    7:astore_3        
		for(int j = 0; j < aadpreferences$placement.length; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpge          37
			if(aadpreferences$placement[j].getIndex() == i)
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #75  <Method int getIndex()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          30
				adpreferences$placement = aadpreferences$placement[j];
	//   16   26:aload_3         
	//   17   27:iload_1         
	//   18   28:aaload          
	//   19   29:astore_2        

	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_1        
	//*  24   34:goto            10
		return adpreferences$placement;
	//   25   37:aload_2         
	//   26   38:areturn         
	}

	public static AdPreferences$Placement valueOf(String s)
	{
		return (AdPreferences$Placement)Enum.valueOf(com/startapp/android/publish/common/model/AdPreferences$Placement, s);
	//    0    0:ldc1            #2   <Class AdPreferences$Placement>
	//    1    2:aload_0         
	//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AdPreferences$Placement>
	//    4    9:areturn         
	}

	public static AdPreferences$Placement[] values()
	{
		return (AdPreferences$Placement[])((AdPreferences$Placement []) ($VALUES)).clone();
	//    0    0:getstatic       #57  <Field AdPreferences$Placement[] $VALUES>
	//    1    3:invokevirtual   #85  <Method Object _5B_Lcom.startapp.android.publish.common.model.AdPreferences$Placement_3B_.clone()>
	//    2    6:checkcast       #81  <Class AdPreferences$Placement[]>
	//    3    9:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int index>
	//    2    4:ireturn         
	}

	public boolean isInterstitial()
	{
		return this == INAPP_FULL_SCREEN || this == INAPP_OFFER_WALL || this == INAPP_SPLASH || this == INAPP_OVERLAY;
	//    0    0:aload_0         
	//    1    1:getstatic       #31  <Field AdPreferences$Placement INAPP_FULL_SCREEN>
	//    2    4:if_acmpeq       28
	//    3    7:aload_0         
	//    4    8:getstatic       #37  <Field AdPreferences$Placement INAPP_OFFER_WALL>
	//    5   11:if_acmpeq       28
	//    6   14:aload_0         
	//    7   15:getstatic       #40  <Field AdPreferences$Placement INAPP_SPLASH>
	//    8   18:if_acmpeq       28
	//    9   21:aload_0         
	//   10   22:getstatic       #43  <Field AdPreferences$Placement INAPP_OVERLAY>
	//   11   25:if_acmpne       30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	private static final AdPreferences$Placement $VALUES[];
	public static final AdPreferences$Placement DEVICE_SIDEBAR;
	public static final AdPreferences$Placement INAPP_BANNER;
	public static final AdPreferences$Placement INAPP_BROWSER;
	public static final AdPreferences$Placement INAPP_FULL_SCREEN;
	public static final AdPreferences$Placement INAPP_NATIVE;
	public static final AdPreferences$Placement INAPP_OFFER_WALL;
	public static final AdPreferences$Placement INAPP_OVERLAY;
	public static final AdPreferences$Placement INAPP_RETURN;
	public static final AdPreferences$Placement INAPP_SPLASH;
	private int index;

	static 
	{
		INAPP_FULL_SCREEN = new AdPreferences$Placement("INAPP_FULL_SCREEN", 0, 1);
	//    0    0:new             #2   <Class AdPreferences$Placement>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "INAPP_FULL_SCREEN">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//    6   11:putstatic       #31  <Field AdPreferences$Placement INAPP_FULL_SCREEN>
		INAPP_BANNER = new AdPreferences$Placement("INAPP_BANNER", 1, 2);
	//    7   14:new             #2   <Class AdPreferences$Placement>
	//    8   17:dup             
	//    9   18:ldc1            #32  <String "INAPP_BANNER">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//   13   25:putstatic       #34  <Field AdPreferences$Placement INAPP_BANNER>
		INAPP_OFFER_WALL = new AdPreferences$Placement("INAPP_OFFER_WALL", 2, 3);
	//   14   28:new             #2   <Class AdPreferences$Placement>
	//   15   31:dup             
	//   16   32:ldc1            #35  <String "INAPP_OFFER_WALL">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//   20   39:putstatic       #37  <Field AdPreferences$Placement INAPP_OFFER_WALL>
		INAPP_SPLASH = new AdPreferences$Placement("INAPP_SPLASH", 3, 4);
	//   21   42:new             #2   <Class AdPreferences$Placement>
	//   22   45:dup             
	//   23   46:ldc1            #38  <String "INAPP_SPLASH">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//   27   53:putstatic       #40  <Field AdPreferences$Placement INAPP_SPLASH>
		INAPP_OVERLAY = new AdPreferences$Placement("INAPP_OVERLAY", 4, 5);
	//   28   56:new             #2   <Class AdPreferences$Placement>
	//   29   59:dup             
	//   30   60:ldc1            #41  <String "INAPP_OVERLAY">
	//   31   62:iconst_4        
	//   32   63:iconst_5        
	//   33   64:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//   34   67:putstatic       #43  <Field AdPreferences$Placement INAPP_OVERLAY>
		INAPP_NATIVE = new AdPreferences$Placement("INAPP_NATIVE", 5, 6);
	//   35   70:new             #2   <Class AdPreferences$Placement>
	//   36   73:dup             
	//   37   74:ldc1            #44  <String "INAPP_NATIVE">
	//   38   76:iconst_5        
	//   39   77:bipush          6
	//   40   79:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//   41   82:putstatic       #46  <Field AdPreferences$Placement INAPP_NATIVE>
		DEVICE_SIDEBAR = new AdPreferences$Placement("DEVICE_SIDEBAR", 6, 7);
	//   42   85:new             #2   <Class AdPreferences$Placement>
	//   43   88:dup             
	//   44   89:ldc1            #47  <String "DEVICE_SIDEBAR">
	//   45   91:bipush          6
	//   46   93:bipush          7
	//   47   95:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//   48   98:putstatic       #49  <Field AdPreferences$Placement DEVICE_SIDEBAR>
		INAPP_RETURN = new AdPreferences$Placement("INAPP_RETURN", 7, 8);
	//   49  101:new             #2   <Class AdPreferences$Placement>
	//   50  104:dup             
	//   51  105:ldc1            #50  <String "INAPP_RETURN">
	//   52  107:bipush          7
	//   53  109:bipush          8
	//   54  111:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//   55  114:putstatic       #52  <Field AdPreferences$Placement INAPP_RETURN>
		INAPP_BROWSER = new AdPreferences$Placement("INAPP_BROWSER", 8, 9);
	//   56  117:new             #2   <Class AdPreferences$Placement>
	//   57  120:dup             
	//   58  121:ldc1            #53  <String "INAPP_BROWSER">
	//   59  123:bipush          8
	//   60  125:bipush          9
	//   61  127:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
	//   62  130:putstatic       #55  <Field AdPreferences$Placement INAPP_BROWSER>
		$VALUES = (new AdPreferences$Placement[] {
			INAPP_FULL_SCREEN, INAPP_BANNER, INAPP_OFFER_WALL, INAPP_SPLASH, INAPP_OVERLAY, INAPP_NATIVE, DEVICE_SIDEBAR, INAPP_RETURN, INAPP_BROWSER
		});
	//   63  133:bipush          9
	//   64  135:anewarray       AdPreferences$Placement[]
	//   65  138:dup             
	//   66  139:iconst_0        
	//   67  140:getstatic       #31  <Field AdPreferences$Placement INAPP_FULL_SCREEN>
	//   68  143:aastore         
	//   69  144:dup             
	//   70  145:iconst_1        
	//   71  146:getstatic       #34  <Field AdPreferences$Placement INAPP_BANNER>
	//   72  149:aastore         
	//   73  150:dup             
	//   74  151:iconst_2        
	//   75  152:getstatic       #37  <Field AdPreferences$Placement INAPP_OFFER_WALL>
	//   76  155:aastore         
	//   77  156:dup             
	//   78  157:iconst_3        
	//   79  158:getstatic       #40  <Field AdPreferences$Placement INAPP_SPLASH>
	//   80  161:aastore         
	//   81  162:dup             
	//   82  163:iconst_4        
	//   83  164:getstatic       #43  <Field AdPreferences$Placement INAPP_OVERLAY>
	//   84  167:aastore         
	//   85  168:dup             
	//   86  169:iconst_5        
	//   87  170:getstatic       #46  <Field AdPreferences$Placement INAPP_NATIVE>
	//   88  173:aastore         
	//   89  174:dup             
	//   90  175:bipush          6
	//   91  177:getstatic       #49  <Field AdPreferences$Placement DEVICE_SIDEBAR>
	//   92  180:aastore         
	//   93  181:dup             
	//   94  182:bipush          7
	//   95  184:getstatic       #52  <Field AdPreferences$Placement INAPP_RETURN>
	//   96  187:aastore         
	//   97  188:dup             
	//   98  189:bipush          8
	//   99  191:getstatic       #55  <Field AdPreferences$Placement INAPP_BROWSER>
	//  100  194:aastore         
	//  101  195:putstatic       #57  <Field AdPreferences$Placement[] $VALUES>
	//* 102  198:return          
	}

	private AdPreferences$Placement(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		index = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #63  <Field int index>
	//    7   11:return          
	}
}
