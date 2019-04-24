// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adListeners;

import com.startapp.android.publish.adsCommon.Ad;

public interface AdDisplayListener
{
	public static final class NotDisplayedReason extends Enum
	{

		public static NotDisplayedReason valueOf(String s)
		{
			return (NotDisplayedReason)Enum.valueOf(com/startapp/android/publish/adsCommon/adListeners/AdDisplayListener$NotDisplayedReason, s);
		//    0    0:ldc1            #2   <Class AdDisplayListener$NotDisplayedReason>
		//    1    2:aload_0         
		//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AdDisplayListener$NotDisplayedReason>
		//    4    9:areturn         
		}

		public static NotDisplayedReason[] values()
		{
			return (NotDisplayedReason[])((NotDisplayedReason []) ($VALUES)).clone();
		//    0    0:getstatic       #63  <Field AdDisplayListener$NotDisplayedReason[] $VALUES>
		//    1    3:invokevirtual   #78  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason_3B_.clone()>
		//    2    6:checkcast       #74  <Class AdDisplayListener$NotDisplayedReason[]>
		//    3    9:areturn         
		}

		private static final NotDisplayedReason $VALUES[];
		public static final NotDisplayedReason AD_CLOSED_TOO_QUICKLY;
		public static final NotDisplayedReason AD_EXPIRED;
		public static final NotDisplayedReason AD_NOT_READY;
		public static final NotDisplayedReason AD_NOT_READY_VIDEO_FALLBACK;
		public static final NotDisplayedReason AD_RULES;
		public static final NotDisplayedReason APP_IN_BACKGROUND;
		public static final NotDisplayedReason INTERNAL_ERROR;
		public static final NotDisplayedReason NETWORK_PROBLEM;
		public static final NotDisplayedReason SERVING_ADS_DISABLED;
		public static final NotDisplayedReason VIDEO_BACK;
		public static final NotDisplayedReason VIDEO_ERROR;

		static 
		{
			NETWORK_PROBLEM = new NotDisplayedReason("NETWORK_PROBLEM", 0);
		//    0    0:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "NETWORK_PROBLEM">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//    5   10:putstatic       #31  <Field AdDisplayListener$NotDisplayedReason NETWORK_PROBLEM>
			AD_RULES = new NotDisplayedReason("AD_RULES", 1);
		//    6   13:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//    7   16:dup             
		//    8   17:ldc1            #32  <String "AD_RULES">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   11   23:putstatic       #34  <Field AdDisplayListener$NotDisplayedReason AD_RULES>
			AD_NOT_READY = new NotDisplayedReason("AD_NOT_READY", 2);
		//   12   26:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   13   29:dup             
		//   14   30:ldc1            #35  <String "AD_NOT_READY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   17   36:putstatic       #37  <Field AdDisplayListener$NotDisplayedReason AD_NOT_READY>
			AD_EXPIRED = new NotDisplayedReason("AD_EXPIRED", 3);
		//   18   39:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   19   42:dup             
		//   20   43:ldc1            #38  <String "AD_EXPIRED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   23   49:putstatic       #40  <Field AdDisplayListener$NotDisplayedReason AD_EXPIRED>
			VIDEO_BACK = new NotDisplayedReason("VIDEO_BACK", 4);
		//   24   52:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   25   55:dup             
		//   26   56:ldc1            #41  <String "VIDEO_BACK">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   29   62:putstatic       #43  <Field AdDisplayListener$NotDisplayedReason VIDEO_BACK>
			VIDEO_ERROR = new NotDisplayedReason("VIDEO_ERROR", 5);
		//   30   65:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   31   68:dup             
		//   32   69:ldc1            #44  <String "VIDEO_ERROR">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   35   75:putstatic       #46  <Field AdDisplayListener$NotDisplayedReason VIDEO_ERROR>
			INTERNAL_ERROR = new NotDisplayedReason("INTERNAL_ERROR", 6);
		//   36   78:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   37   81:dup             
		//   38   82:ldc1            #47  <String "INTERNAL_ERROR">
		//   39   84:bipush          6
		//   40   86:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   41   89:putstatic       #49  <Field AdDisplayListener$NotDisplayedReason INTERNAL_ERROR>
			AD_NOT_READY_VIDEO_FALLBACK = new NotDisplayedReason("AD_NOT_READY_VIDEO_FALLBACK", 7);
		//   42   92:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   43   95:dup             
		//   44   96:ldc1            #50  <String "AD_NOT_READY_VIDEO_FALLBACK">
		//   45   98:bipush          7
		//   46  100:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   47  103:putstatic       #52  <Field AdDisplayListener$NotDisplayedReason AD_NOT_READY_VIDEO_FALLBACK>
			APP_IN_BACKGROUND = new NotDisplayedReason("APP_IN_BACKGROUND", 8);
		//   48  106:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   49  109:dup             
		//   50  110:ldc1            #53  <String "APP_IN_BACKGROUND">
		//   51  112:bipush          8
		//   52  114:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   53  117:putstatic       #55  <Field AdDisplayListener$NotDisplayedReason APP_IN_BACKGROUND>
			AD_CLOSED_TOO_QUICKLY = new NotDisplayedReason("AD_CLOSED_TOO_QUICKLY", 9);
		//   54  120:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   55  123:dup             
		//   56  124:ldc1            #56  <String "AD_CLOSED_TOO_QUICKLY">
		//   57  126:bipush          9
		//   58  128:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   59  131:putstatic       #58  <Field AdDisplayListener$NotDisplayedReason AD_CLOSED_TOO_QUICKLY>
			SERVING_ADS_DISABLED = new NotDisplayedReason("SERVING_ADS_DISABLED", 10);
		//   60  134:new             #2   <Class AdDisplayListener$NotDisplayedReason>
		//   61  137:dup             
		//   62  138:ldc1            #59  <String "SERVING_ADS_DISABLED">
		//   63  140:bipush          10
		//   64  142:invokespecial   #29  <Method void AdDisplayListener$NotDisplayedReason(String, int)>
		//   65  145:putstatic       #61  <Field AdDisplayListener$NotDisplayedReason SERVING_ADS_DISABLED>
			$VALUES = (new NotDisplayedReason[] {
				NETWORK_PROBLEM, AD_RULES, AD_NOT_READY, AD_EXPIRED, VIDEO_BACK, VIDEO_ERROR, INTERNAL_ERROR, AD_NOT_READY_VIDEO_FALLBACK, APP_IN_BACKGROUND, AD_CLOSED_TOO_QUICKLY, 
				SERVING_ADS_DISABLED
			});
		//   66  148:bipush          11
		//   67  150:anewarray       NotDisplayedReason[]
		//   68  153:dup             
		//   69  154:iconst_0        
		//   70  155:getstatic       #31  <Field AdDisplayListener$NotDisplayedReason NETWORK_PROBLEM>
		//   71  158:aastore         
		//   72  159:dup             
		//   73  160:iconst_1        
		//   74  161:getstatic       #34  <Field AdDisplayListener$NotDisplayedReason AD_RULES>
		//   75  164:aastore         
		//   76  165:dup             
		//   77  166:iconst_2        
		//   78  167:getstatic       #37  <Field AdDisplayListener$NotDisplayedReason AD_NOT_READY>
		//   79  170:aastore         
		//   80  171:dup             
		//   81  172:iconst_3        
		//   82  173:getstatic       #40  <Field AdDisplayListener$NotDisplayedReason AD_EXPIRED>
		//   83  176:aastore         
		//   84  177:dup             
		//   85  178:iconst_4        
		//   86  179:getstatic       #43  <Field AdDisplayListener$NotDisplayedReason VIDEO_BACK>
		//   87  182:aastore         
		//   88  183:dup             
		//   89  184:iconst_5        
		//   90  185:getstatic       #46  <Field AdDisplayListener$NotDisplayedReason VIDEO_ERROR>
		//   91  188:aastore         
		//   92  189:dup             
		//   93  190:bipush          6
		//   94  192:getstatic       #49  <Field AdDisplayListener$NotDisplayedReason INTERNAL_ERROR>
		//   95  195:aastore         
		//   96  196:dup             
		//   97  197:bipush          7
		//   98  199:getstatic       #52  <Field AdDisplayListener$NotDisplayedReason AD_NOT_READY_VIDEO_FALLBACK>
		//   99  202:aastore         
		//  100  203:dup             
		//  101  204:bipush          8
		//  102  206:getstatic       #55  <Field AdDisplayListener$NotDisplayedReason APP_IN_BACKGROUND>
		//  103  209:aastore         
		//  104  210:dup             
		//  105  211:bipush          9
		//  106  213:getstatic       #58  <Field AdDisplayListener$NotDisplayedReason AD_CLOSED_TOO_QUICKLY>
		//  107  216:aastore         
		//  108  217:dup             
		//  109  218:bipush          10
		//  110  220:getstatic       #61  <Field AdDisplayListener$NotDisplayedReason SERVING_ADS_DISABLED>
		//  111  223:aastore         
		//  112  224:putstatic       #63  <Field AdDisplayListener$NotDisplayedReason[] $VALUES>
		//* 113  227:return          
		}

		private NotDisplayedReason(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #65  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract void adClicked(Ad ad);

	public abstract void adDisplayed(Ad ad);

	public abstract void adHidden(Ad ad);

	public abstract void adNotDisplayed(Ad ad);
}
