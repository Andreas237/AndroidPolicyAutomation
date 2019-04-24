// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;

import android.content.Context;
import com.startapp.android.publish.adsCommon.SDKAdPreferences;
import com.startapp.android.publish.adsCommon.m;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class AdPreferences
	implements Serializable
{
	public static final class Placement extends Enum
	{

		public static Placement getByIndex(int i)
		{
			Placement placement = INAPP_FULL_SCREEN;
		//    0    0:getstatic       #31  <Field AdPreferences$Placement INAPP_FULL_SCREEN>
		//    1    3:astore_2        
			Placement aplacement[] = values();
		//    2    4:invokestatic    #71  <Method AdPreferences$Placement[] values()>
		//    3    7:astore_3        
			for(int j = 0; j < aplacement.length; j++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          37
				if(aplacement[j].getIndex() == i)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #75  <Method int getIndex()>
		//*  14   22:iload_0         
		//*  15   23:icmpne          30
					placement = aplacement[j];
		//   16   26:aload_3         
		//   17   27:iload_1         
		//   18   28:aaload          
		//   19   29:astore_2        

		//   20   30:iload_1         
		//   21   31:iconst_1        
		//   22   32:iadd            
		//   23   33:istore_1        
		//*  24   34:goto            10
			return placement;
		//   25   37:aload_2         
		//   26   38:areturn         
		}

		public static Placement valueOf(String s)
		{
			return (Placement)Enum.valueOf(com/startapp/android/publish/common/model/AdPreferences$Placement, s);
		//    0    0:ldc1            #2   <Class AdPreferences$Placement>
		//    1    2:aload_0         
		//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AdPreferences$Placement>
		//    4    9:areturn         
		}

		public static Placement[] values()
		{
			return (Placement[])((Placement []) ($VALUES)).clone();
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

		private static final Placement $VALUES[];
		public static final Placement DEVICE_SIDEBAR;
		public static final Placement INAPP_BANNER;
		public static final Placement INAPP_BROWSER;
		public static final Placement INAPP_FULL_SCREEN;
		public static final Placement INAPP_NATIVE;
		public static final Placement INAPP_OFFER_WALL;
		public static final Placement INAPP_OVERLAY;
		public static final Placement INAPP_RETURN;
		public static final Placement INAPP_SPLASH;
		private int index;

		static 
		{
			INAPP_FULL_SCREEN = new Placement("INAPP_FULL_SCREEN", 0, 1);
		//    0    0:new             #2   <Class AdPreferences$Placement>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "INAPP_FULL_SCREEN">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//    6   11:putstatic       #31  <Field AdPreferences$Placement INAPP_FULL_SCREEN>
			INAPP_BANNER = new Placement("INAPP_BANNER", 1, 2);
		//    7   14:new             #2   <Class AdPreferences$Placement>
		//    8   17:dup             
		//    9   18:ldc1            #32  <String "INAPP_BANNER">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//   13   25:putstatic       #34  <Field AdPreferences$Placement INAPP_BANNER>
			INAPP_OFFER_WALL = new Placement("INAPP_OFFER_WALL", 2, 3);
		//   14   28:new             #2   <Class AdPreferences$Placement>
		//   15   31:dup             
		//   16   32:ldc1            #35  <String "INAPP_OFFER_WALL">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//   20   39:putstatic       #37  <Field AdPreferences$Placement INAPP_OFFER_WALL>
			INAPP_SPLASH = new Placement("INAPP_SPLASH", 3, 4);
		//   21   42:new             #2   <Class AdPreferences$Placement>
		//   22   45:dup             
		//   23   46:ldc1            #38  <String "INAPP_SPLASH">
		//   24   48:iconst_3        
		//   25   49:iconst_4        
		//   26   50:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//   27   53:putstatic       #40  <Field AdPreferences$Placement INAPP_SPLASH>
			INAPP_OVERLAY = new Placement("INAPP_OVERLAY", 4, 5);
		//   28   56:new             #2   <Class AdPreferences$Placement>
		//   29   59:dup             
		//   30   60:ldc1            #41  <String "INAPP_OVERLAY">
		//   31   62:iconst_4        
		//   32   63:iconst_5        
		//   33   64:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//   34   67:putstatic       #43  <Field AdPreferences$Placement INAPP_OVERLAY>
			INAPP_NATIVE = new Placement("INAPP_NATIVE", 5, 6);
		//   35   70:new             #2   <Class AdPreferences$Placement>
		//   36   73:dup             
		//   37   74:ldc1            #44  <String "INAPP_NATIVE">
		//   38   76:iconst_5        
		//   39   77:bipush          6
		//   40   79:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//   41   82:putstatic       #46  <Field AdPreferences$Placement INAPP_NATIVE>
			DEVICE_SIDEBAR = new Placement("DEVICE_SIDEBAR", 6, 7);
		//   42   85:new             #2   <Class AdPreferences$Placement>
		//   43   88:dup             
		//   44   89:ldc1            #47  <String "DEVICE_SIDEBAR">
		//   45   91:bipush          6
		//   46   93:bipush          7
		//   47   95:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//   48   98:putstatic       #49  <Field AdPreferences$Placement DEVICE_SIDEBAR>
			INAPP_RETURN = new Placement("INAPP_RETURN", 7, 8);
		//   49  101:new             #2   <Class AdPreferences$Placement>
		//   50  104:dup             
		//   51  105:ldc1            #50  <String "INAPP_RETURN">
		//   52  107:bipush          7
		//   53  109:bipush          8
		//   54  111:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//   55  114:putstatic       #52  <Field AdPreferences$Placement INAPP_RETURN>
			INAPP_BROWSER = new Placement("INAPP_BROWSER", 8, 9);
		//   56  117:new             #2   <Class AdPreferences$Placement>
		//   57  120:dup             
		//   58  121:ldc1            #53  <String "INAPP_BROWSER">
		//   59  123:bipush          8
		//   60  125:bipush          9
		//   61  127:invokespecial   #29  <Method void AdPreferences$Placement(String, int, int)>
		//   62  130:putstatic       #55  <Field AdPreferences$Placement INAPP_BROWSER>
			$VALUES = (new Placement[] {
				INAPP_FULL_SCREEN, INAPP_BANNER, INAPP_OFFER_WALL, INAPP_SPLASH, INAPP_OVERLAY, INAPP_NATIVE, DEVICE_SIDEBAR, INAPP_RETURN, INAPP_BROWSER
			});
		//   63  133:bipush          9
		//   64  135:anewarray       Placement[]
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

		private Placement(String s, int i, int j)
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


	public AdPreferences()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		country = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #66  <Field String country>
		advertiserId = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #68  <Field String advertiserId>
		template = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #70  <Field String template>
		type = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
		packageInclude = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #74  <Field Set packageInclude>
		forceOfferWall3D = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #76  <Field boolean forceOfferWall3D>
		forceOfferWall2D = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #78  <Field boolean forceOfferWall2D>
		forceFullpage = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #80  <Field boolean forceFullpage>
		forceOverlay = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #82  <Field boolean forceOverlay>
		minCpm = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #84  <Field Double minCpm>
		publisherId = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #86  <Field String publisherId>
		productId = null;
	//   35   59:aload_0         
	//   36   60:aconst_null     
	//   37   61:putfield        #88  <Field String productId>
		testMode = false;
	//   38   64:aload_0         
	//   39   65:iconst_0        
	//   40   66:putfield        #90  <Field boolean testMode>
		longitude = null;
	//   41   69:aload_0         
	//   42   70:aconst_null     
	//   43   71:putfield        #92  <Field Double longitude>
		latitude = null;
	//   44   74:aload_0         
	//   45   75:aconst_null     
	//   46   76:putfield        #94  <Field Double latitude>
		keywords = null;
	//   47   79:aload_0         
	//   48   80:aconst_null     
	//   49   81:putfield        #96  <Field String keywords>
		gender = null;
	//   50   84:aload_0         
	//   51   85:aconst_null     
	//   52   86:putfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
		age = null;
	//   53   89:aload_0         
	//   54   90:aconst_null     
	//   55   91:putfield        #100 <Field String age>
		ai = null;
	//   56   94:aload_0         
	//   57   95:aconst_null     
	//   58   96:putfield        #102 <Field Boolean ai>
		as = null;
	//   59   99:aload_0         
	//   60  100:aconst_null     
	//   61  101:putfield        #104 <Field Boolean as>
		videoMuted = false;
	//   62  104:aload_0         
	//   63  105:iconst_0        
	//   64  106:putfield        #106 <Field boolean videoMuted>
		hardwareAccelerated = m.a().d();
	//   65  109:aload_0         
	//   66  110:invokestatic    #112 <Method m m.a()>
	//   67  113:invokevirtual   #116 <Method boolean m.d()>
	//   68  116:putfield        #118 <Field boolean hardwareAccelerated>
		categories = null;
	//   69  119:aload_0         
	//   70  120:aconst_null     
	//   71  121:putfield        #120 <Field Set categories>
		categoriesExclude = null;
	//   72  124:aload_0         
	//   73  125:aconst_null     
	//   74  126:putfield        #122 <Field Set categoriesExclude>
	//   75  129:return          
	}

	public AdPreferences(AdPreferences adpreferences)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		country = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #66  <Field String country>
		advertiserId = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #68  <Field String advertiserId>
		template = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #70  <Field String template>
		type = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
		packageInclude = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #74  <Field Set packageInclude>
		forceOfferWall3D = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #76  <Field boolean forceOfferWall3D>
		forceOfferWall2D = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #78  <Field boolean forceOfferWall2D>
		forceFullpage = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #80  <Field boolean forceFullpage>
		forceOverlay = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #82  <Field boolean forceOverlay>
		minCpm = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #84  <Field Double minCpm>
		publisherId = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #86  <Field String publisherId>
		productId = null;
	//   35   59:aload_0         
	//   36   60:aconst_null     
	//   37   61:putfield        #88  <Field String productId>
		testMode = false;
	//   38   64:aload_0         
	//   39   65:iconst_0        
	//   40   66:putfield        #90  <Field boolean testMode>
		longitude = null;
	//   41   69:aload_0         
	//   42   70:aconst_null     
	//   43   71:putfield        #92  <Field Double longitude>
		latitude = null;
	//   44   74:aload_0         
	//   45   75:aconst_null     
	//   46   76:putfield        #94  <Field Double latitude>
		keywords = null;
	//   47   79:aload_0         
	//   48   80:aconst_null     
	//   49   81:putfield        #96  <Field String keywords>
		gender = null;
	//   50   84:aload_0         
	//   51   85:aconst_null     
	//   52   86:putfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
		age = null;
	//   53   89:aload_0         
	//   54   90:aconst_null     
	//   55   91:putfield        #100 <Field String age>
		ai = null;
	//   56   94:aload_0         
	//   57   95:aconst_null     
	//   58   96:putfield        #102 <Field Boolean ai>
		as = null;
	//   59   99:aload_0         
	//   60  100:aconst_null     
	//   61  101:putfield        #104 <Field Boolean as>
		videoMuted = false;
	//   62  104:aload_0         
	//   63  105:iconst_0        
	//   64  106:putfield        #106 <Field boolean videoMuted>
		hardwareAccelerated = m.a().d();
	//   65  109:aload_0         
	//   66  110:invokestatic    #112 <Method m m.a()>
	//   67  113:invokevirtual   #116 <Method boolean m.d()>
	//   68  116:putfield        #118 <Field boolean hardwareAccelerated>
		categories = null;
	//   69  119:aload_0         
	//   70  120:aconst_null     
	//   71  121:putfield        #120 <Field Set categories>
		categoriesExclude = null;
	//   72  124:aload_0         
	//   73  125:aconst_null     
	//   74  126:putfield        #122 <Field Set categoriesExclude>
		country = adpreferences.country;
	//   75  129:aload_0         
	//   76  130:aload_1         
	//   77  131:getfield        #66  <Field String country>
	//   78  134:putfield        #66  <Field String country>
		advertiserId = adpreferences.advertiserId;
	//   79  137:aload_0         
	//   80  138:aload_1         
	//   81  139:getfield        #68  <Field String advertiserId>
	//   82  142:putfield        #68  <Field String advertiserId>
		template = adpreferences.template;
	//   83  145:aload_0         
	//   84  146:aload_1         
	//   85  147:getfield        #70  <Field String template>
	//   86  150:putfield        #70  <Field String template>
		type = adpreferences.type;
	//   87  153:aload_0         
	//   88  154:aload_1         
	//   89  155:getfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//   90  158:putfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
		if(adpreferences.packageInclude != null)
	//*  91  161:aload_1         
	//*  92  162:getfield        #74  <Field Set packageInclude>
	//*  93  165:ifnull          183
			packageInclude = ((Set) (new HashSet(((java.util.Collection) (adpreferences.packageInclude)))));
	//   94  168:aload_0         
	//   95  169:new             #126 <Class HashSet>
	//   96  172:dup             
	//   97  173:aload_1         
	//   98  174:getfield        #74  <Field Set packageInclude>
	//   99  177:invokespecial   #129 <Method void HashSet(java.util.Collection)>
	//  100  180:putfield        #74  <Field Set packageInclude>
		minCpm = adpreferences.minCpm;
	//  101  183:aload_0         
	//  102  184:aload_1         
	//  103  185:getfield        #84  <Field Double minCpm>
	//  104  188:putfield        #84  <Field Double minCpm>
		forceOfferWall3D = adpreferences.forceOfferWall3D;
	//  105  191:aload_0         
	//  106  192:aload_1         
	//  107  193:getfield        #76  <Field boolean forceOfferWall3D>
	//  108  196:putfield        #76  <Field boolean forceOfferWall3D>
		forceOfferWall2D = adpreferences.forceOfferWall2D;
	//  109  199:aload_0         
	//  110  200:aload_1         
	//  111  201:getfield        #78  <Field boolean forceOfferWall2D>
	//  112  204:putfield        #78  <Field boolean forceOfferWall2D>
		forceFullpage = adpreferences.forceFullpage;
	//  113  207:aload_0         
	//  114  208:aload_1         
	//  115  209:getfield        #80  <Field boolean forceFullpage>
	//  116  212:putfield        #80  <Field boolean forceFullpage>
		forceOverlay = adpreferences.forceOverlay;
	//  117  215:aload_0         
	//  118  216:aload_1         
	//  119  217:getfield        #82  <Field boolean forceOverlay>
	//  120  220:putfield        #82  <Field boolean forceOverlay>
		publisherId = adpreferences.publisherId;
	//  121  223:aload_0         
	//  122  224:aload_1         
	//  123  225:getfield        #86  <Field String publisherId>
	//  124  228:putfield        #86  <Field String publisherId>
		productId = adpreferences.productId;
	//  125  231:aload_0         
	//  126  232:aload_1         
	//  127  233:getfield        #88  <Field String productId>
	//  128  236:putfield        #88  <Field String productId>
		testMode = adpreferences.testMode;
	//  129  239:aload_0         
	//  130  240:aload_1         
	//  131  241:getfield        #90  <Field boolean testMode>
	//  132  244:putfield        #90  <Field boolean testMode>
		longitude = adpreferences.longitude;
	//  133  247:aload_0         
	//  134  248:aload_1         
	//  135  249:getfield        #92  <Field Double longitude>
	//  136  252:putfield        #92  <Field Double longitude>
		latitude = adpreferences.latitude;
	//  137  255:aload_0         
	//  138  256:aload_1         
	//  139  257:getfield        #94  <Field Double latitude>
	//  140  260:putfield        #94  <Field Double latitude>
		keywords = adpreferences.keywords;
	//  141  263:aload_0         
	//  142  264:aload_1         
	//  143  265:getfield        #96  <Field String keywords>
	//  144  268:putfield        #96  <Field String keywords>
		gender = adpreferences.gender;
	//  145  271:aload_0         
	//  146  272:aload_1         
	//  147  273:getfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//  148  276:putfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
		age = adpreferences.age;
	//  149  279:aload_0         
	//  150  280:aload_1         
	//  151  281:getfield        #100 <Field String age>
	//  152  284:putfield        #100 <Field String age>
		ai = adpreferences.ai;
	//  153  287:aload_0         
	//  154  288:aload_1         
	//  155  289:getfield        #102 <Field Boolean ai>
	//  156  292:putfield        #102 <Field Boolean ai>
		as = adpreferences.as;
	//  157  295:aload_0         
	//  158  296:aload_1         
	//  159  297:getfield        #104 <Field Boolean as>
	//  160  300:putfield        #104 <Field Boolean as>
		videoMuted = adpreferences.videoMuted;
	//  161  303:aload_0         
	//  162  304:aload_1         
	//  163  305:getfield        #106 <Field boolean videoMuted>
	//  164  308:putfield        #106 <Field boolean videoMuted>
		hardwareAccelerated = adpreferences.hardwareAccelerated;
	//  165  311:aload_0         
	//  166  312:aload_1         
	//  167  313:getfield        #118 <Field boolean hardwareAccelerated>
	//  168  316:putfield        #118 <Field boolean hardwareAccelerated>
		if(adpreferences.categories != null)
	//* 169  319:aload_1         
	//* 170  320:getfield        #120 <Field Set categories>
	//* 171  323:ifnull          341
			categories = ((Set) (new HashSet(((java.util.Collection) (adpreferences.categories)))));
	//  172  326:aload_0         
	//  173  327:new             #126 <Class HashSet>
	//  174  330:dup             
	//  175  331:aload_1         
	//  176  332:getfield        #120 <Field Set categories>
	//  177  335:invokespecial   #129 <Method void HashSet(java.util.Collection)>
	//  178  338:putfield        #120 <Field Set categories>
		if(adpreferences.categoriesExclude != null)
	//* 179  341:aload_1         
	//* 180  342:getfield        #122 <Field Set categoriesExclude>
	//* 181  345:ifnull          363
			categoriesExclude = ((Set) (new HashSet(((java.util.Collection) (adpreferences.categoriesExclude)))));
	//  182  348:aload_0         
	//  183  349:new             #126 <Class HashSet>
	//  184  352:dup             
	//  185  353:aload_1         
	//  186  354:getfield        #122 <Field Set categoriesExclude>
	//  187  357:invokespecial   #129 <Method void HashSet(java.util.Collection)>
	//  188  360:putfield        #122 <Field Set categoriesExclude>
	//  189  363:return          
	}

	public AdPreferences(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		country = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #66  <Field String country>
		advertiserId = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #68  <Field String advertiserId>
		template = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #70  <Field String template>
		type = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
		packageInclude = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #74  <Field Set packageInclude>
		forceOfferWall3D = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #76  <Field boolean forceOfferWall3D>
		forceOfferWall2D = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #78  <Field boolean forceOfferWall2D>
		forceFullpage = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #80  <Field boolean forceFullpage>
		forceOverlay = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #82  <Field boolean forceOverlay>
		minCpm = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #84  <Field Double minCpm>
		publisherId = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #86  <Field String publisherId>
		productId = null;
	//   35   59:aload_0         
	//   36   60:aconst_null     
	//   37   61:putfield        #88  <Field String productId>
		testMode = false;
	//   38   64:aload_0         
	//   39   65:iconst_0        
	//   40   66:putfield        #90  <Field boolean testMode>
		longitude = null;
	//   41   69:aload_0         
	//   42   70:aconst_null     
	//   43   71:putfield        #92  <Field Double longitude>
		latitude = null;
	//   44   74:aload_0         
	//   45   75:aconst_null     
	//   46   76:putfield        #94  <Field Double latitude>
		keywords = null;
	//   47   79:aload_0         
	//   48   80:aconst_null     
	//   49   81:putfield        #96  <Field String keywords>
		gender = null;
	//   50   84:aload_0         
	//   51   85:aconst_null     
	//   52   86:putfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
		age = null;
	//   53   89:aload_0         
	//   54   90:aconst_null     
	//   55   91:putfield        #100 <Field String age>
		ai = null;
	//   56   94:aload_0         
	//   57   95:aconst_null     
	//   58   96:putfield        #102 <Field Boolean ai>
		as = null;
	//   59   99:aload_0         
	//   60  100:aconst_null     
	//   61  101:putfield        #104 <Field Boolean as>
		videoMuted = false;
	//   62  104:aload_0         
	//   63  105:iconst_0        
	//   64  106:putfield        #106 <Field boolean videoMuted>
		hardwareAccelerated = m.a().d();
	//   65  109:aload_0         
	//   66  110:invokestatic    #112 <Method m m.a()>
	//   67  113:invokevirtual   #116 <Method boolean m.d()>
	//   68  116:putfield        #118 <Field boolean hardwareAccelerated>
		categories = null;
	//   69  119:aload_0         
	//   70  120:aconst_null     
	//   71  121:putfield        #120 <Field Set categories>
		categoriesExclude = null;
	//   72  124:aload_0         
	//   73  125:aconst_null     
	//   74  126:putfield        #122 <Field Set categoriesExclude>
		publisherId = s;
	//   75  129:aload_0         
	//   76  130:aload_1         
	//   77  131:putfield        #86  <Field String publisherId>
		productId = s1;
	//   78  134:aload_0         
	//   79  135:aload_2         
	//   80  136:putfield        #88  <Field String productId>
	//   81  139:return          
	}

	public AdPreferences(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		country = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #66  <Field String country>
		advertiserId = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #68  <Field String advertiserId>
		template = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #70  <Field String template>
		type = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
		packageInclude = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #74  <Field Set packageInclude>
		forceOfferWall3D = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #76  <Field boolean forceOfferWall3D>
		forceOfferWall2D = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #78  <Field boolean forceOfferWall2D>
		forceFullpage = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #80  <Field boolean forceFullpage>
		forceOverlay = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #82  <Field boolean forceOverlay>
		minCpm = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #84  <Field Double minCpm>
		publisherId = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #86  <Field String publisherId>
		productId = null;
	//   35   59:aload_0         
	//   36   60:aconst_null     
	//   37   61:putfield        #88  <Field String productId>
		testMode = false;
	//   38   64:aload_0         
	//   39   65:iconst_0        
	//   40   66:putfield        #90  <Field boolean testMode>
		longitude = null;
	//   41   69:aload_0         
	//   42   70:aconst_null     
	//   43   71:putfield        #92  <Field Double longitude>
		latitude = null;
	//   44   74:aload_0         
	//   45   75:aconst_null     
	//   46   76:putfield        #94  <Field Double latitude>
		keywords = null;
	//   47   79:aload_0         
	//   48   80:aconst_null     
	//   49   81:putfield        #96  <Field String keywords>
		gender = null;
	//   50   84:aload_0         
	//   51   85:aconst_null     
	//   52   86:putfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
		age = null;
	//   53   89:aload_0         
	//   54   90:aconst_null     
	//   55   91:putfield        #100 <Field String age>
		ai = null;
	//   56   94:aload_0         
	//   57   95:aconst_null     
	//   58   96:putfield        #102 <Field Boolean ai>
		as = null;
	//   59   99:aload_0         
	//   60  100:aconst_null     
	//   61  101:putfield        #104 <Field Boolean as>
		videoMuted = false;
	//   62  104:aload_0         
	//   63  105:iconst_0        
	//   64  106:putfield        #106 <Field boolean videoMuted>
		hardwareAccelerated = m.a().d();
	//   65  109:aload_0         
	//   66  110:invokestatic    #112 <Method m m.a()>
	//   67  113:invokevirtual   #116 <Method boolean m.d()>
	//   68  116:putfield        #118 <Field boolean hardwareAccelerated>
		categories = null;
	//   69  119:aload_0         
	//   70  120:aconst_null     
	//   71  121:putfield        #120 <Field Set categories>
		categoriesExclude = null;
	//   72  124:aload_0         
	//   73  125:aconst_null     
	//   74  126:putfield        #122 <Field Set categoriesExclude>
		publisherId = s;
	//   75  129:aload_0         
	//   76  130:aload_1         
	//   77  131:putfield        #86  <Field String publisherId>
		productId = s1;
	//   78  134:aload_0         
	//   79  135:aload_2         
	//   80  136:putfield        #88  <Field String productId>
	//   81  139:return          
	}

	public AdPreferences addCategory(String s)
	{
		if(categories == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Set categories>
	//*   2    4:ifnonnull       18
			categories = ((Set) (new HashSet()));
	//    3    7:aload_0         
	//    4    8:new             #126 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #136 <Method void HashSet()>
	//    7   15:putfield        #120 <Field Set categories>
		categories.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #120 <Field Set categories>
	//   10   22:aload_1         
	//   11   23:invokeinterface #142 <Method boolean Set.add(Object)>
	//   12   28:pop             
		return this;
	//   13   29:aload_0         
	//   14   30:areturn         
	}

	public AdPreferences addCategoryExclude(String s)
	{
		if(categoriesExclude == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field Set categoriesExclude>
	//*   2    4:ifnonnull       18
			categoriesExclude = ((Set) (new HashSet()));
	//    3    7:aload_0         
	//    4    8:new             #126 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #136 <Method void HashSet()>
	//    7   15:putfield        #122 <Field Set categoriesExclude>
		categoriesExclude.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #122 <Field Set categoriesExclude>
	//   10   22:aload_1         
	//   11   23:invokeinterface #142 <Method boolean Set.add(Object)>
	//   12   28:pop             
		return this;
	//   13   29:aload_0         
	//   14   30:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag2;
		boolean flag3;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag3 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		if(this != obj) goto _L2; else goto _L1
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:if_acmpne       14
_L1:
		boolean flag = true;
	//    7   10:iconst_1        
	//    8   11:istore_2        
_L4:
		return flag;
	//    9   12:iload_2         
	//   10   13:ireturn         
_L2:
		flag = flag3;
	//   11   14:iload           4
	//   12   16:istore_2        
		if(obj == null) goto _L4; else goto _L3
	//   13   17:aload_1         
	//   14   18:ifnull          12
_L3:
		flag = flag3;
	//   15   21:iload           4
	//   16   23:istore_2        
		if(((Object)this).getClass() != obj.getClass()) goto _L4; else goto _L5
	//   17   24:aload_0         
	//   18   25:invokevirtual   #148 <Method Class Object.getClass()>
	//   19   28:aload_1         
	//   20   29:invokevirtual   #148 <Method Class Object.getClass()>
	//   21   32:if_acmpne       12
_L5:
		obj = ((Object) ((AdPreferences)obj));
	//   22   35:aload_1         
	//   23   36:checkcast       #2   <Class AdPreferences>
	//   24   39:astore_1        
		flag = flag3;
	//   25   40:iload           4
	//   26   42:istore_2        
		if(forceOfferWall3D != ((AdPreferences) (obj)).forceOfferWall3D) goto _L4; else goto _L6
	//   27   43:aload_0         
	//   28   44:getfield        #76  <Field boolean forceOfferWall3D>
	//   29   47:aload_1         
	//   30   48:getfield        #76  <Field boolean forceOfferWall3D>
	//   31   51:icmpne          12
_L6:
		flag = flag3;
	//   32   54:iload           4
	//   33   56:istore_2        
		if(forceOfferWall2D != ((AdPreferences) (obj)).forceOfferWall2D) goto _L4; else goto _L7
	//   34   57:aload_0         
	//   35   58:getfield        #78  <Field boolean forceOfferWall2D>
	//   36   61:aload_1         
	//   37   62:getfield        #78  <Field boolean forceOfferWall2D>
	//   38   65:icmpne          12
_L7:
		flag = flag3;
	//   39   68:iload           4
	//   40   70:istore_2        
		if(forceFullpage != ((AdPreferences) (obj)).forceFullpage) goto _L4; else goto _L8
	//   41   71:aload_0         
	//   42   72:getfield        #80  <Field boolean forceFullpage>
	//   43   75:aload_1         
	//   44   76:getfield        #80  <Field boolean forceFullpage>
	//   45   79:icmpne          12
_L8:
		flag = flag3;
	//   46   82:iload           4
	//   47   84:istore_2        
		if(forceOverlay != ((AdPreferences) (obj)).forceOverlay) goto _L4; else goto _L9
	//   48   85:aload_0         
	//   49   86:getfield        #82  <Field boolean forceOverlay>
	//   50   89:aload_1         
	//   51   90:getfield        #82  <Field boolean forceOverlay>
	//   52   93:icmpne          12
_L9:
		flag = flag3;
	//   53   96:iload           4
	//   54   98:istore_2        
		if(testMode != ((AdPreferences) (obj)).testMode) goto _L4; else goto _L10
	//   55   99:aload_0         
	//   56  100:getfield        #90  <Field boolean testMode>
	//   57  103:aload_1         
	//   58  104:getfield        #90  <Field boolean testMode>
	//   59  107:icmpne          12
_L10:
		flag = flag3;
	//   60  110:iload           4
	//   61  112:istore_2        
		if(videoMuted != ((AdPreferences) (obj)).videoMuted) goto _L4; else goto _L11
	//   62  113:aload_0         
	//   63  114:getfield        #106 <Field boolean videoMuted>
	//   64  117:aload_1         
	//   65  118:getfield        #106 <Field boolean videoMuted>
	//   66  121:icmpne          12
_L11:
		flag = flag3;
	//   67  124:iload           4
	//   68  126:istore_2        
		if(hardwareAccelerated != ((AdPreferences) (obj)).hardwareAccelerated) goto _L4; else goto _L12
	//   69  127:aload_0         
	//   70  128:getfield        #118 <Field boolean hardwareAccelerated>
	//   71  131:aload_1         
	//   72  132:getfield        #118 <Field boolean hardwareAccelerated>
	//   73  135:icmpne          12
_L12:
		if(country == null) goto _L14; else goto _L13
	//   74  138:aload_0         
	//   75  139:getfield        #66  <Field String country>
	//   76  142:ifnull          529
_L13:
		flag = flag3;
	//   77  145:iload           4
	//   78  147:istore_2        
		if(!country.equals(((Object) (((AdPreferences) (obj)).country)))) goto _L4; else goto _L15
	//   79  148:aload_0         
	//   80  149:getfield        #66  <Field String country>
	//   81  152:aload_1         
	//   82  153:getfield        #66  <Field String country>
	//   83  156:invokevirtual   #152 <Method boolean String.equals(Object)>
	//   84  159:ifeq            12
_L15:
		if(advertiserId == null) goto _L17; else goto _L16
	//   85  162:aload_0         
	//   86  163:getfield        #68  <Field String advertiserId>
	//   87  166:ifnull          538
_L16:
		flag = flag3;
	//   88  169:iload           4
	//   89  171:istore_2        
		if(!advertiserId.equals(((Object) (((AdPreferences) (obj)).advertiserId)))) goto _L4; else goto _L18
	//   90  172:aload_0         
	//   91  173:getfield        #68  <Field String advertiserId>
	//   92  176:aload_1         
	//   93  177:getfield        #68  <Field String advertiserId>
	//   94  180:invokevirtual   #152 <Method boolean String.equals(Object)>
	//   95  183:ifeq            12
_L18:
		if(template == null) goto _L20; else goto _L19
	//   96  186:aload_0         
	//   97  187:getfield        #70  <Field String template>
	//   98  190:ifnull          547
_L19:
		flag = flag3;
	//   99  193:iload           4
	//  100  195:istore_2        
		if(!template.equals(((Object) (((AdPreferences) (obj)).template)))) goto _L4; else goto _L21
	//  101  196:aload_0         
	//  102  197:getfield        #70  <Field String template>
	//  103  200:aload_1         
	//  104  201:getfield        #70  <Field String template>
	//  105  204:invokevirtual   #152 <Method boolean String.equals(Object)>
	//  106  207:ifeq            12
_L21:
		flag = flag3;
	//  107  210:iload           4
	//  108  212:istore_2        
		if(type != ((AdPreferences) (obj)).type) goto _L4; else goto _L22
	//  109  213:aload_0         
	//  110  214:getfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//  111  217:aload_1         
	//  112  218:getfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//  113  221:if_acmpne       12
_L22:
		if(packageInclude == null) goto _L24; else goto _L23
	//  114  224:aload_0         
	//  115  225:getfield        #74  <Field Set packageInclude>
	//  116  228:ifnull          556
_L23:
		flag = flag3;
	//  117  231:iload           4
	//  118  233:istore_2        
		if(!packageInclude.equals(((Object) (((AdPreferences) (obj)).packageInclude)))) goto _L4; else goto _L25
	//  119  234:aload_0         
	//  120  235:getfield        #74  <Field Set packageInclude>
	//  121  238:aload_1         
	//  122  239:getfield        #74  <Field Set packageInclude>
	//  123  242:invokeinterface #153 <Method boolean Set.equals(Object)>
	//  124  247:ifeq            12
_L25:
		if(minCpm == null) goto _L27; else goto _L26
	//  125  250:aload_0         
	//  126  251:getfield        #84  <Field Double minCpm>
	//  127  254:ifnull          565
_L26:
		flag = flag3;
	//  128  257:iload           4
	//  129  259:istore_2        
		if(!minCpm.equals(((Object) (((AdPreferences) (obj)).minCpm)))) goto _L4; else goto _L28
	//  130  260:aload_0         
	//  131  261:getfield        #84  <Field Double minCpm>
	//  132  264:aload_1         
	//  133  265:getfield        #84  <Field Double minCpm>
	//  134  268:invokevirtual   #156 <Method boolean Double.equals(Object)>
	//  135  271:ifeq            12
_L28:
		if(publisherId == null) goto _L30; else goto _L29
	//  136  274:aload_0         
	//  137  275:getfield        #86  <Field String publisherId>
	//  138  278:ifnull          574
_L29:
		flag = flag3;
	//  139  281:iload           4
	//  140  283:istore_2        
		if(!publisherId.equals(((Object) (((AdPreferences) (obj)).publisherId)))) goto _L4; else goto _L31
	//  141  284:aload_0         
	//  142  285:getfield        #86  <Field String publisherId>
	//  143  288:aload_1         
	//  144  289:getfield        #86  <Field String publisherId>
	//  145  292:invokevirtual   #152 <Method boolean String.equals(Object)>
	//  146  295:ifeq            12
_L31:
		if(productId == null) goto _L33; else goto _L32
	//  147  298:aload_0         
	//  148  299:getfield        #88  <Field String productId>
	//  149  302:ifnull          583
_L32:
		flag = flag3;
	//  150  305:iload           4
	//  151  307:istore_2        
		if(!productId.equals(((Object) (((AdPreferences) (obj)).productId)))) goto _L4; else goto _L34
	//  152  308:aload_0         
	//  153  309:getfield        #88  <Field String productId>
	//  154  312:aload_1         
	//  155  313:getfield        #88  <Field String productId>
	//  156  316:invokevirtual   #152 <Method boolean String.equals(Object)>
	//  157  319:ifeq            12
_L34:
		if(longitude == null) goto _L36; else goto _L35
	//  158  322:aload_0         
	//  159  323:getfield        #92  <Field Double longitude>
	//  160  326:ifnull          592
_L35:
		flag = flag3;
	//  161  329:iload           4
	//  162  331:istore_2        
		if(!longitude.equals(((Object) (((AdPreferences) (obj)).longitude)))) goto _L4; else goto _L37
	//  163  332:aload_0         
	//  164  333:getfield        #92  <Field Double longitude>
	//  165  336:aload_1         
	//  166  337:getfield        #92  <Field Double longitude>
	//  167  340:invokevirtual   #156 <Method boolean Double.equals(Object)>
	//  168  343:ifeq            12
_L37:
		if(latitude == null) goto _L39; else goto _L38
	//  169  346:aload_0         
	//  170  347:getfield        #94  <Field Double latitude>
	//  171  350:ifnull          601
_L38:
		flag = flag3;
	//  172  353:iload           4
	//  173  355:istore_2        
		if(!latitude.equals(((Object) (((AdPreferences) (obj)).latitude)))) goto _L4; else goto _L40
	//  174  356:aload_0         
	//  175  357:getfield        #94  <Field Double latitude>
	//  176  360:aload_1         
	//  177  361:getfield        #94  <Field Double latitude>
	//  178  364:invokevirtual   #156 <Method boolean Double.equals(Object)>
	//  179  367:ifeq            12
_L40:
		if(keywords == null) goto _L42; else goto _L41
	//  180  370:aload_0         
	//  181  371:getfield        #96  <Field String keywords>
	//  182  374:ifnull          610
_L41:
		flag = flag3;
	//  183  377:iload           4
	//  184  379:istore_2        
		if(!keywords.equals(((Object) (((AdPreferences) (obj)).keywords)))) goto _L4; else goto _L43
	//  185  380:aload_0         
	//  186  381:getfield        #96  <Field String keywords>
	//  187  384:aload_1         
	//  188  385:getfield        #96  <Field String keywords>
	//  189  388:invokevirtual   #152 <Method boolean String.equals(Object)>
	//  190  391:ifeq            12
_L43:
		flag = flag3;
	//  191  394:iload           4
	//  192  396:istore_2        
		if(gender != ((AdPreferences) (obj)).gender) goto _L4; else goto _L44
	//  193  397:aload_0         
	//  194  398:getfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//  195  401:aload_1         
	//  196  402:getfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//  197  405:if_acmpne       12
_L44:
		if(age == null) goto _L46; else goto _L45
	//  198  408:aload_0         
	//  199  409:getfield        #100 <Field String age>
	//  200  412:ifnull          619
_L45:
		flag = flag3;
	//  201  415:iload           4
	//  202  417:istore_2        
		if(!age.equals(((Object) (((AdPreferences) (obj)).age)))) goto _L4; else goto _L47
	//  203  418:aload_0         
	//  204  419:getfield        #100 <Field String age>
	//  205  422:aload_1         
	//  206  423:getfield        #100 <Field String age>
	//  207  426:invokevirtual   #152 <Method boolean String.equals(Object)>
	//  208  429:ifeq            12
_L47:
		if(ai == null) goto _L49; else goto _L48
	//  209  432:aload_0         
	//  210  433:getfield        #102 <Field Boolean ai>
	//  211  436:ifnull          628
_L48:
		flag = flag3;
	//  212  439:iload           4
	//  213  441:istore_2        
		if(!ai.equals(((Object) (((AdPreferences) (obj)).ai)))) goto _L4; else goto _L50
	//  214  442:aload_0         
	//  215  443:getfield        #102 <Field Boolean ai>
	//  216  446:aload_1         
	//  217  447:getfield        #102 <Field Boolean ai>
	//  218  450:invokevirtual   #159 <Method boolean Boolean.equals(Object)>
	//  219  453:ifeq            12
_L50:
		if(as == null) goto _L52; else goto _L51
	//  220  456:aload_0         
	//  221  457:getfield        #104 <Field Boolean as>
	//  222  460:ifnull          637
_L51:
		flag = flag3;
	//  223  463:iload           4
	//  224  465:istore_2        
		if(!as.equals(((Object) (((AdPreferences) (obj)).as)))) goto _L4; else goto _L53
	//  225  466:aload_0         
	//  226  467:getfield        #104 <Field Boolean as>
	//  227  470:aload_1         
	//  228  471:getfield        #104 <Field Boolean as>
	//  229  474:invokevirtual   #159 <Method boolean Boolean.equals(Object)>
	//  230  477:ifeq            12
_L53:
		if(categories == null)
			break MISSING_BLOCK_LABEL_646;
	//  231  480:aload_0         
	//  232  481:getfield        #120 <Field Set categories>
	//  233  484:ifnull          646
		flag = flag3;
	//  234  487:iload           4
	//  235  489:istore_2        
		if(!categories.equals(((Object) (((AdPreferences) (obj)).categories)))) goto _L4; else goto _L54
	//  236  490:aload_0         
	//  237  491:getfield        #120 <Field Set categories>
	//  238  494:aload_1         
	//  239  495:getfield        #120 <Field Set categories>
	//  240  498:invokeinterface #153 <Method boolean Set.equals(Object)>
	//  241  503:ifeq            12
_L54:
		boolean flag1;
		if(categoriesExclude != null)
	//* 242  506:aload_0         
	//* 243  507:getfield        #122 <Field Set categoriesExclude>
	//* 244  510:ifnull          655
		{
			flag1 = categoriesExclude.equals(((Object) (((AdPreferences) (obj)).categoriesExclude)));
	//  245  513:aload_0         
	//  246  514:getfield        #122 <Field Set categoriesExclude>
	//  247  517:aload_1         
	//  248  518:getfield        #122 <Field Set categoriesExclude>
	//  249  521:invokeinterface #153 <Method boolean Set.equals(Object)>
	//  250  526:istore_2        
		} else
	//* 251  527:iload_2         
	//* 252  528:ireturn         
	//* 253  529:aload_1         
	//* 254  530:getfield        #66  <Field String country>
	//* 255  533:ifnull          162
	//* 256  536:iconst_0        
	//* 257  537:ireturn         
	//* 258  538:aload_1         
	//* 259  539:getfield        #68  <Field String advertiserId>
	//* 260  542:ifnull          186
	//* 261  545:iconst_0        
	//* 262  546:ireturn         
	//* 263  547:aload_1         
	//* 264  548:getfield        #70  <Field String template>
	//* 265  551:ifnull          210
	//* 266  554:iconst_0        
	//* 267  555:ireturn         
	//* 268  556:aload_1         
	//* 269  557:getfield        #74  <Field Set packageInclude>
	//* 270  560:ifnull          250
	//* 271  563:iconst_0        
	//* 272  564:ireturn         
	//* 273  565:aload_1         
	//* 274  566:getfield        #84  <Field Double minCpm>
	//* 275  569:ifnull          274
	//* 276  572:iconst_0        
	//* 277  573:ireturn         
	//* 278  574:aload_1         
	//* 279  575:getfield        #86  <Field String publisherId>
	//* 280  578:ifnull          298
	//* 281  581:iconst_0        
	//* 282  582:ireturn         
	//* 283  583:aload_1         
	//* 284  584:getfield        #88  <Field String productId>
	//* 285  587:ifnull          322
	//* 286  590:iconst_0        
	//* 287  591:ireturn         
	//* 288  592:aload_1         
	//* 289  593:getfield        #92  <Field Double longitude>
	//* 290  596:ifnull          346
	//* 291  599:iconst_0        
	//* 292  600:ireturn         
	//* 293  601:aload_1         
	//* 294  602:getfield        #94  <Field Double latitude>
	//* 295  605:ifnull          370
	//* 296  608:iconst_0        
	//* 297  609:ireturn         
	//* 298  610:aload_1         
	//* 299  611:getfield        #96  <Field String keywords>
	//* 300  614:ifnull          394
	//* 301  617:iconst_0        
	//* 302  618:ireturn         
	//* 303  619:aload_1         
	//* 304  620:getfield        #100 <Field String age>
	//* 305  623:ifnull          432
	//* 306  626:iconst_0        
	//* 307  627:ireturn         
	//* 308  628:aload_1         
	//* 309  629:getfield        #102 <Field Boolean ai>
	//* 310  632:ifnull          456
	//* 311  635:iconst_0        
	//* 312  636:ireturn         
	//* 313  637:aload_1         
	//* 314  638:getfield        #104 <Field Boolean as>
	//* 315  641:ifnull          480
	//* 316  644:iconst_0        
	//* 317  645:ireturn         
	//* 318  646:aload_1         
	//* 319  647:getfield        #120 <Field Set categories>
	//* 320  650:ifnull          506
	//* 321  653:iconst_0        
	//* 322  654:ireturn         
		{
			flag1 = flag2;
	//  323  655:iload_3         
	//  324  656:istore_2        
			if(((AdPreferences) (obj)).categoriesExclude != null)
	//* 325  657:aload_1         
	//* 326  658:getfield        #122 <Field Set categoriesExclude>
	//* 327  661:ifnull          527
				flag1 = false;
	//  328  664:iconst_0        
	//  329  665:istore_2        
		}
		return flag1;
_L14:
		if(((AdPreferences) (obj)).country != null)
			return false;
		  goto _L15
_L17:
		if(((AdPreferences) (obj)).advertiserId != null)
			return false;
		  goto _L18
_L20:
		if(((AdPreferences) (obj)).template != null)
			return false;
		  goto _L21
_L24:
		if(((AdPreferences) (obj)).packageInclude != null)
			return false;
		  goto _L25
_L27:
		if(((AdPreferences) (obj)).minCpm != null)
			return false;
		  goto _L28
_L30:
		if(((AdPreferences) (obj)).publisherId != null)
			return false;
		  goto _L31
_L33:
		if(((AdPreferences) (obj)).productId != null)
			return false;
		  goto _L34
_L36:
		if(((AdPreferences) (obj)).longitude != null)
			return false;
		  goto _L37
_L39:
		if(((AdPreferences) (obj)).latitude != null)
			return false;
		  goto _L40
_L42:
		if(((AdPreferences) (obj)).keywords != null)
			return false;
		  goto _L43
_L46:
		if(((AdPreferences) (obj)).age != null)
			return false;
		  goto _L47
_L49:
		if(((AdPreferences) (obj)).ai != null)
			return false;
		  goto _L50
_L52:
		if(((AdPreferences) (obj)).as != null)
			return false;
		  goto _L53
		if(((AdPreferences) (obj)).categories != null)
			return false;
		  goto _L54
	//* 330  666:goto            527
	}

	public String getAge(Context context)
	{
		if(age == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field String age>
	//*   2    4:ifnonnull       18
			return m.a().g(context).getAge();
	//    3    7:invokestatic    #112 <Method m m.a()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #165 <Method SDKAdPreferences m.g(Context)>
	//    6   14:invokevirtual   #170 <Method String SDKAdPreferences.getAge()>
	//    7   17:areturn         
		else
			return age;
	//    8   18:aload_0         
	//    9   19:getfield        #100 <Field String age>
	//   10   22:areturn         
	}

	public Boolean getAi()
	{
		return ai;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Boolean ai>
	//    2    4:areturn         
	}

	public Boolean getAs()
	{
		return as;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Boolean as>
	//    2    4:areturn         
	}

	public Set getCategories()
	{
		return categories;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Set categories>
	//    2    4:areturn         
	}

	public Set getCategoriesExclude()
	{
		return categoriesExclude;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Set categoriesExclude>
	//    2    4:areturn         
	}

	public com.startapp.android.publish.adsCommon.SDKAdPreferences.Gender getGender(Context context)
	{
		if(gender == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//*   2    4:ifnonnull       18
			return m.a().g(context).getGender();
	//    3    7:invokestatic    #112 <Method m m.a()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #165 <Method SDKAdPreferences m.g(Context)>
	//    6   14:invokevirtual   #183 <Method com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender SDKAdPreferences.getGender()>
	//    7   17:areturn         
		else
			return gender;
	//    8   18:aload_0         
	//    9   19:getfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//   10   22:areturn         
	}

	public String getKeywords()
	{
		return keywords;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String keywords>
	//    2    4:areturn         
	}

	public Double getLatitude()
	{
		return latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Double latitude>
	//    2    4:areturn         
	}

	public Double getLongitude()
	{
		return longitude;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Double longitude>
	//    2    4:areturn         
	}

	public Double getMinCpm()
	{
		return minCpm;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Double minCpm>
	//    2    4:areturn         
	}

	public String getProductId()
	{
		return productId;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String productId>
	//    2    4:areturn         
	}

	public String getPublisherId()
	{
		return publisherId;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String publisherId>
	//    2    4:areturn         
	}

	public com.startapp.android.publish.adsCommon.Ad.AdType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int j5 = 1;
	//    0    0:iconst_1        
	//    1    1:istore          22
		int l5 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          24
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l2;
		int i3;
		int j3;
		int k3;
		int l3;
		int i4;
		int j4;
		int k4;
		int l4;
		int i5;
		int k5;
		if(country != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #66  <Field String country>
	//*   6   10:ifnull          486
			i = country.hashCode();
	//    7   13:aload_0         
	//    8   14:getfield        #66  <Field String country>
	//    9   17:invokevirtual   #196 <Method int String.hashCode()>
	//   10   20:istore_1        
		else
	//*  11   21:aload_0         
	//*  12   22:getfield        #68  <Field String advertiserId>
	//*  13   25:ifnull          491
	//*  14   28:aload_0         
	//*  15   29:getfield        #68  <Field String advertiserId>
	//*  16   32:invokevirtual   #196 <Method int String.hashCode()>
	//*  17   35:istore_2        
	//*  18   36:aload_0         
	//*  19   37:getfield        #70  <Field String template>
	//*  20   40:ifnull          496
	//*  21   43:aload_0         
	//*  22   44:getfield        #70  <Field String template>
	//*  23   47:invokevirtual   #196 <Method int String.hashCode()>
	//*  24   50:istore_3        
	//*  25   51:aload_0         
	//*  26   52:getfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//*  27   55:ifnull          501
	//*  28   58:aload_0         
	//*  29   59:getfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//*  30   62:invokevirtual   #199 <Method int com.startapp.android.publish.adsCommon.Ad$AdType.hashCode()>
	//*  31   65:istore          4
	//*  32   67:aload_0         
	//*  33   68:getfield        #74  <Field Set packageInclude>
	//*  34   71:ifnull          507
	//*  35   74:aload_0         
	//*  36   75:getfield        #74  <Field Set packageInclude>
	//*  37   78:invokeinterface #200 <Method int Set.hashCode()>
	//*  38   83:istore          5
	//*  39   85:aload_0         
	//*  40   86:getfield        #76  <Field boolean forceOfferWall3D>
	//*  41   89:ifeq            513
	//*  42   92:iconst_1        
	//*  43   93:istore          6
	//*  44   95:aload_0         
	//*  45   96:getfield        #78  <Field boolean forceOfferWall2D>
	//*  46   99:ifeq            519
	//*  47  102:iconst_1        
	//*  48  103:istore          7
	//*  49  105:aload_0         
	//*  50  106:getfield        #80  <Field boolean forceFullpage>
	//*  51  109:ifeq            525
	//*  52  112:iconst_1        
	//*  53  113:istore          8
	//*  54  115:aload_0         
	//*  55  116:getfield        #82  <Field boolean forceOverlay>
	//*  56  119:ifeq            531
	//*  57  122:iconst_1        
	//*  58  123:istore          9
	//*  59  125:aload_0         
	//*  60  126:getfield        #84  <Field Double minCpm>
	//*  61  129:ifnull          537
	//*  62  132:aload_0         
	//*  63  133:getfield        #84  <Field Double minCpm>
	//*  64  136:invokevirtual   #201 <Method int Double.hashCode()>
	//*  65  139:istore          10
	//*  66  141:aload_0         
	//*  67  142:getfield        #86  <Field String publisherId>
	//*  68  145:ifnull          543
	//*  69  148:aload_0         
	//*  70  149:getfield        #86  <Field String publisherId>
	//*  71  152:invokevirtual   #196 <Method int String.hashCode()>
	//*  72  155:istore          11
	//*  73  157:aload_0         
	//*  74  158:getfield        #88  <Field String productId>
	//*  75  161:ifnull          549
	//*  76  164:aload_0         
	//*  77  165:getfield        #88  <Field String productId>
	//*  78  168:invokevirtual   #196 <Method int String.hashCode()>
	//*  79  171:istore          12
	//*  80  173:aload_0         
	//*  81  174:getfield        #90  <Field boolean testMode>
	//*  82  177:ifeq            555
	//*  83  180:iconst_1        
	//*  84  181:istore          13
	//*  85  183:aload_0         
	//*  86  184:getfield        #92  <Field Double longitude>
	//*  87  187:ifnull          561
	//*  88  190:aload_0         
	//*  89  191:getfield        #92  <Field Double longitude>
	//*  90  194:invokevirtual   #201 <Method int Double.hashCode()>
	//*  91  197:istore          14
	//*  92  199:aload_0         
	//*  93  200:getfield        #94  <Field Double latitude>
	//*  94  203:ifnull          567
	//*  95  206:aload_0         
	//*  96  207:getfield        #94  <Field Double latitude>
	//*  97  210:invokevirtual   #201 <Method int Double.hashCode()>
	//*  98  213:istore          15
	//*  99  215:aload_0         
	//* 100  216:getfield        #96  <Field String keywords>
	//* 101  219:ifnull          573
	//* 102  222:aload_0         
	//* 103  223:getfield        #96  <Field String keywords>
	//* 104  226:invokevirtual   #196 <Method int String.hashCode()>
	//* 105  229:istore          16
	//* 106  231:aload_0         
	//* 107  232:getfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//* 108  235:ifnull          579
	//* 109  238:aload_0         
	//* 110  239:getfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//* 111  242:invokevirtual   #204 <Method int com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender.hashCode()>
	//* 112  245:istore          17
	//* 113  247:aload_0         
	//* 114  248:getfield        #100 <Field String age>
	//* 115  251:ifnull          585
	//* 116  254:aload_0         
	//* 117  255:getfield        #100 <Field String age>
	//* 118  258:invokevirtual   #196 <Method int String.hashCode()>
	//* 119  261:istore          18
	//* 120  263:aload_0         
	//* 121  264:getfield        #102 <Field Boolean ai>
	//* 122  267:ifnull          591
	//* 123  270:aload_0         
	//* 124  271:getfield        #102 <Field Boolean ai>
	//* 125  274:invokevirtual   #205 <Method int Boolean.hashCode()>
	//* 126  277:istore          19
	//* 127  279:aload_0         
	//* 128  280:getfield        #104 <Field Boolean as>
	//* 129  283:ifnull          597
	//* 130  286:aload_0         
	//* 131  287:getfield        #104 <Field Boolean as>
	//* 132  290:invokevirtual   #205 <Method int Boolean.hashCode()>
	//* 133  293:istore          20
	//* 134  295:aload_0         
	//* 135  296:getfield        #106 <Field boolean videoMuted>
	//* 136  299:ifeq            603
	//* 137  302:iconst_1        
	//* 138  303:istore          21
	//* 139  305:aload_0         
	//* 140  306:getfield        #118 <Field boolean hardwareAccelerated>
	//* 141  309:ifeq            609
	//* 142  312:aload_0         
	//* 143  313:getfield        #120 <Field Set categories>
	//* 144  316:ifnull          615
	//* 145  319:aload_0         
	//* 146  320:getfield        #120 <Field Set categories>
	//* 147  323:invokeinterface #200 <Method int Set.hashCode()>
	//* 148  328:istore          23
	//* 149  330:aload_0         
	//* 150  331:getfield        #122 <Field Set categoriesExclude>
	//* 151  334:ifnull          348
	//* 152  337:aload_0         
	//* 153  338:getfield        #122 <Field Set categoriesExclude>
	//* 154  341:invokeinterface #200 <Method int Set.hashCode()>
	//* 155  346:istore          24
	//* 156  348:iload           23
	//* 157  350:iload           21
	//* 158  352:iload           20
	//* 159  354:iload           19
	//* 160  356:iload           18
	//* 161  358:iload           17
	//* 162  360:iload           16
	//* 163  362:iload           15
	//* 164  364:iload           14
	//* 165  366:iload           13
	//* 166  368:iload           12
	//* 167  370:iload           11
	//* 168  372:iload           10
	//* 169  374:iload           9
	//* 170  376:iload           8
	//* 171  378:iload           7
	//* 172  380:iload           6
	//* 173  382:iload           5
	//* 174  384:iload           4
	//* 175  386:iload_3         
	//* 176  387:iload_2         
	//* 177  388:iload_1         
	//* 178  389:bipush          31
	//* 179  391:imul            
	//* 180  392:iadd            
	//* 181  393:bipush          31
	//* 182  395:imul            
	//* 183  396:iadd            
	//* 184  397:bipush          31
	//* 185  399:imul            
	//* 186  400:iadd            
	//* 187  401:bipush          31
	//* 188  403:imul            
	//* 189  404:iadd            
	//* 190  405:bipush          31
	//* 191  407:imul            
	//* 192  408:iadd            
	//* 193  409:bipush          31
	//* 194  411:imul            
	//* 195  412:iadd            
	//* 196  413:bipush          31
	//* 197  415:imul            
	//* 198  416:iadd            
	//* 199  417:bipush          31
	//* 200  419:imul            
	//* 201  420:iadd            
	//* 202  421:bipush          31
	//* 203  423:imul            
	//* 204  424:iadd            
	//* 205  425:bipush          31
	//* 206  427:imul            
	//* 207  428:iadd            
	//* 208  429:bipush          31
	//* 209  431:imul            
	//* 210  432:iadd            
	//* 211  433:bipush          31
	//* 212  435:imul            
	//* 213  436:iadd            
	//* 214  437:bipush          31
	//* 215  439:imul            
	//* 216  440:iadd            
	//* 217  441:bipush          31
	//* 218  443:imul            
	//* 219  444:iadd            
	//* 220  445:bipush          31
	//* 221  447:imul            
	//* 222  448:iadd            
	//* 223  449:bipush          31
	//* 224  451:imul            
	//* 225  452:iadd            
	//* 226  453:bipush          31
	//* 227  455:imul            
	//* 228  456:iadd            
	//* 229  457:bipush          31
	//* 230  459:imul            
	//* 231  460:iadd            
	//* 232  461:bipush          31
	//* 233  463:imul            
	//* 234  464:iadd            
	//* 235  465:bipush          31
	//* 236  467:imul            
	//* 237  468:iadd            
	//* 238  469:bipush          31
	//* 239  471:imul            
	//* 240  472:iload           22
	//* 241  474:iadd            
	//* 242  475:bipush          31
	//* 243  477:imul            
	//* 244  478:iadd            
	//* 245  479:bipush          31
	//* 246  481:imul            
	//* 247  482:iload           24
	//* 248  484:iadd            
	//* 249  485:ireturn         
			i = 0;
	//  250  486:iconst_0        
	//  251  487:istore_1        
		if(advertiserId != null)
			j = advertiserId.hashCode();
		else
	//* 252  488:goto            21
			j = 0;
	//  253  491:iconst_0        
	//  254  492:istore_2        
		if(template != null)
			k = template.hashCode();
		else
	//* 255  493:goto            36
			k = 0;
	//  256  496:iconst_0        
	//  257  497:istore_3        
		if(type != null)
			l = type.hashCode();
		else
	//* 258  498:goto            51
			l = 0;
	//  259  501:iconst_0        
	//  260  502:istore          4
		if(packageInclude != null)
			i1 = packageInclude.hashCode();
		else
	//* 261  504:goto            67
			i1 = 0;
	//  262  507:iconst_0        
	//  263  508:istore          5
		if(forceOfferWall3D)
			j1 = 1;
		else
	//* 264  510:goto            85
			j1 = 0;
	//  265  513:iconst_0        
	//  266  514:istore          6
		if(forceOfferWall2D)
			k1 = 1;
		else
	//* 267  516:goto            95
			k1 = 0;
	//  268  519:iconst_0        
	//  269  520:istore          7
		if(forceFullpage)
			l1 = 1;
		else
	//* 270  522:goto            105
			l1 = 0;
	//  271  525:iconst_0        
	//  272  526:istore          8
		if(forceOverlay)
			i2 = 1;
		else
	//* 273  528:goto            115
			i2 = 0;
	//  274  531:iconst_0        
	//  275  532:istore          9
		if(minCpm != null)
			j2 = minCpm.hashCode();
		else
	//* 276  534:goto            125
			j2 = 0;
	//  277  537:iconst_0        
	//  278  538:istore          10
		if(publisherId != null)
			k2 = publisherId.hashCode();
		else
	//* 279  540:goto            141
			k2 = 0;
	//  280  543:iconst_0        
	//  281  544:istore          11
		if(productId != null)
			l2 = productId.hashCode();
		else
	//* 282  546:goto            157
			l2 = 0;
	//  283  549:iconst_0        
	//  284  550:istore          12
		if(testMode)
			i3 = 1;
		else
	//* 285  552:goto            173
			i3 = 0;
	//  286  555:iconst_0        
	//  287  556:istore          13
		if(longitude != null)
			j3 = longitude.hashCode();
		else
	//* 288  558:goto            183
			j3 = 0;
	//  289  561:iconst_0        
	//  290  562:istore          14
		if(latitude != null)
			k3 = latitude.hashCode();
		else
	//* 291  564:goto            199
			k3 = 0;
	//  292  567:iconst_0        
	//  293  568:istore          15
		if(keywords != null)
			l3 = keywords.hashCode();
		else
	//* 294  570:goto            215
			l3 = 0;
	//  295  573:iconst_0        
	//  296  574:istore          16
		if(gender != null)
			i4 = gender.hashCode();
		else
	//* 297  576:goto            231
			i4 = 0;
	//  298  579:iconst_0        
	//  299  580:istore          17
		if(age != null)
			j4 = age.hashCode();
		else
	//* 300  582:goto            247
			j4 = 0;
	//  301  585:iconst_0        
	//  302  586:istore          18
		if(ai != null)
			k4 = ai.hashCode();
		else
	//* 303  588:goto            263
			k4 = 0;
	//  304  591:iconst_0        
	//  305  592:istore          19
		if(as != null)
			l4 = as.hashCode();
		else
	//* 306  594:goto            279
			l4 = 0;
	//  307  597:iconst_0        
	//  308  598:istore          20
		if(videoMuted)
			i5 = 1;
		else
	//* 309  600:goto            295
			i5 = 0;
	//  310  603:iconst_0        
	//  311  604:istore          21
		if(!hardwareAccelerated)
	//* 312  606:goto            305
			j5 = 0;
	//  313  609:iconst_0        
	//  314  610:istore          22
		if(categories != null)
			k5 = categories.hashCode();
		else
	//* 315  612:goto            312
			k5 = 0;
	//  316  615:iconst_0        
	//  317  616:istore          23
		if(categoriesExclude != null)
			l5 = categoriesExclude.hashCode();
		return (k5 + ((i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j5) * 31) * 31 + l5;
	//* 318  618:goto            330
	}

	protected boolean isHardwareAccelerated()
	{
		return hardwareAccelerated;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field boolean hardwareAccelerated>
	//    2    4:ireturn         
	}

	public boolean isSimpleToken()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isTestMode()
	{
		return testMode;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean testMode>
	//    2    4:ireturn         
	}

	public boolean isVideoMuted()
	{
		return videoMuted;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean videoMuted>
	//    2    4:ireturn         
	}

	public AdPreferences muteVideo()
	{
		videoMuted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #106 <Field boolean videoMuted>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdPreferences setAge(Integer integer)
	{
		age = Integer.toString(integer.intValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #218 <Method int Integer.intValue()>
	//    3    5:invokestatic    #222 <Method String Integer.toString(int)>
	//    4    8:putfield        #100 <Field String age>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public AdPreferences setAge(String s)
	{
		age = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field String age>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdPreferences setAi(Boolean boolean1)
	{
		ai = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field Boolean ai>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdPreferences setAs(Boolean boolean1)
	{
		as = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field Boolean as>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdPreferences setGender(com.startapp.android.publish.adsCommon.SDKAdPreferences.Gender gender1)
	{
		gender = gender1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdPreferences setKeywords(String s)
	{
		keywords = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field String keywords>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdPreferences setLatitude(double d)
	{
		latitude = Double.valueOf(d);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #234 <Method Double Double.valueOf(double)>
	//    3    5:putfield        #94  <Field Double latitude>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AdPreferences setLongitude(double d)
	{
		longitude = Double.valueOf(d);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #234 <Method Double Double.valueOf(double)>
	//    3    5:putfield        #92  <Field Double longitude>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public void setMinCpm(Double double1)
	{
		minCpm = double1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Double minCpm>
	//    3    5:return          
	}

	public AdPreferences setProductId(String s)
	{
		productId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field String productId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdPreferences setPublisherId(String s)
	{
		publisherId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field String publisherId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AdPreferences setTestMode(boolean flag)
	{
		testMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean testMode>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setType(com.startapp.android.publish.adsCommon.Ad.AdType adtype)
	{
		type = adtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("AdPreferences [publisherId=").append(publisherId).append(", productId=").append(productId).append(", testMode=").append(testMode).append(", longitude=").append(((Object) (longitude))).append(", latitude=").append(((Object) (latitude))).append(", keywords=").append(keywords).append(", minCPM=").append(((Object) (minCpm))).append(", categories=").append(((Object) (categories))).append(", categoriesExclude=").append(((Object) (categoriesExclude))).append("]").toString();
	//    0    0:new             #245 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #246 <Method void StringBuilder()>
	//    3    7:ldc1            #248 <String "AdPreferences [publisherId=">
	//    4    9:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #86  <Field String publisherId>
	//    7   16:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #254 <String ", productId=">
	//    9   21:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #88  <Field String productId>
	//   12   28:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc2            #256 <String ", testMode=">
	//   14   34:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:aload_0         
	//   16   38:getfield        #90  <Field boolean testMode>
	//   17   41:invokevirtual   #259 <Method StringBuilder StringBuilder.append(boolean)>
	//   18   44:ldc2            #261 <String ", longitude=">
	//   19   47:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   20   50:aload_0         
	//   21   51:getfield        #92  <Field Double longitude>
	//   22   54:invokevirtual   #264 <Method StringBuilder StringBuilder.append(Object)>
	//   23   57:ldc2            #266 <String ", latitude=">
	//   24   60:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   25   63:aload_0         
	//   26   64:getfield        #94  <Field Double latitude>
	//   27   67:invokevirtual   #264 <Method StringBuilder StringBuilder.append(Object)>
	//   28   70:ldc2            #268 <String ", keywords=">
	//   29   73:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   30   76:aload_0         
	//   31   77:getfield        #96  <Field String keywords>
	//   32   80:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   33   83:ldc2            #270 <String ", minCPM=">
	//   34   86:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   35   89:aload_0         
	//   36   90:getfield        #84  <Field Double minCpm>
	//   37   93:invokevirtual   #264 <Method StringBuilder StringBuilder.append(Object)>
	//   38   96:ldc2            #272 <String ", categories=">
	//   39   99:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   40  102:aload_0         
	//   41  103:getfield        #120 <Field Set categories>
	//   42  106:invokevirtual   #264 <Method StringBuilder StringBuilder.append(Object)>
	//   43  109:ldc2            #274 <String ", categoriesExclude=">
	//   44  112:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   45  115:aload_0         
	//   46  116:getfield        #122 <Field Set categoriesExclude>
	//   47  119:invokevirtual   #264 <Method StringBuilder StringBuilder.append(Object)>
	//   48  122:ldc2            #276 <String "]">
	//   49  125:invokevirtual   #252 <Method StringBuilder StringBuilder.append(String)>
	//   50  128:invokevirtual   #278 <Method String StringBuilder.toString()>
	//   51  131:areturn         
	}

	public static final String TYPE_APP_WALL = "APP_WALL";
	public static final String TYPE_BANNER = "BANNER";
	public static final String TYPE_INAPP_EXIT = "INAPP_EXIT";
	public static final String TYPE_SCRINGO_TOOLBAR = "SCRINGO_TOOLBAR";
	public static final String TYPE_TEXT = "TEXT";
	private static final long serialVersionUID = 1L;
	protected String advertiserId;
	private String age;
	private Boolean ai;
	private Boolean as;
	private Set categories;
	private Set categoriesExclude;
	protected String country;
	protected boolean forceFullpage;
	protected boolean forceOfferWall2D;
	protected boolean forceOfferWall3D;
	protected boolean forceOverlay;
	private com.startapp.android.publish.adsCommon.SDKAdPreferences.Gender gender;
	private boolean hardwareAccelerated;
	private String keywords;
	private Double latitude;
	private Double longitude;
	protected Double minCpm;
	protected Set packageInclude;
	private String productId;
	private String publisherId;
	protected String template;
	private boolean testMode;
	protected com.startapp.android.publish.adsCommon.Ad.AdType type;
	private boolean videoMuted;
}
