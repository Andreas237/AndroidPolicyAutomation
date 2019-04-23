// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

public final class AccessibilityServiceInfoCompat
{

	private AccessibilityServiceInfoCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static String capabilityToString(int i)
	{
		if(i != 4)
	//*   0    0:iload_0         
	//*   1    1:iconst_4        
	//*   2    2:icmpeq          48
		{
			if(i != 8)
	//*   3    5:iload_0         
	//*   4    6:bipush          8
	//*   5    8:icmpeq          45
				switch(i)
	//*   6   11:iload_0         
				{
	//*   7   12:tableswitch     1 2: default 36
	//	               1 42
	//	               2 39
				default:
					return "UNKNOWN";
	//    8   36:ldc1            #33  <String "UNKNOWN">
	//    9   38:areturn         

				case 2: // '\002'
					return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
	//   10   39:ldc1            #34  <String "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION">
	//   11   41:areturn         

				case 1: // '\001'
					return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
	//   12   42:ldc1            #35  <String "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT">
	//   13   44:areturn         
				}
			else
				return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
	//   14   45:ldc1            #36  <String "CAPABILITY_CAN_FILTER_KEY_EVENTS">
	//   15   47:areturn         
		} else
		{
			return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
	//   16   48:ldc1            #37  <String "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY">
	//   17   50:areturn         
		}
	}

	public static String feedbackTypeToString(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[");
	//    4    8:aload_2         
	//    5    9:ldc1            #44  <String "[">
	//    6   11:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		do
			if(i > 0)
	//*   8   15:iload_0         
	//*   9   16:ifle            137
			{
				int j = 1 << Integer.numberOfTrailingZeros(i);
	//   10   19:iconst_1        
	//   11   20:iload_0         
	//   12   21:invokestatic    #54  <Method int Integer.numberOfTrailingZeros(int)>
	//   13   24:ishl            
	//   14   25:istore_1        
				i &= j;
	//   15   26:iload_0         
	//   16   27:iload_1         
	//   17   28:iand            
	//   18   29:istore_0        
				if(stringbuilder.length() > 1)
	//*  19   30:aload_2         
	//*  20   31:invokevirtual   #58  <Method int StringBuilder.length()>
	//*  21   34:iconst_1        
	//*  22   35:icmple          45
					stringbuilder.append(", ");
	//   23   38:aload_2         
	//   24   39:ldc1            #60  <String ", ">
	//   25   41:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   44:pop             
				if(j != 4)
	//*  27   45:iload_1         
	//*  28   46:iconst_4        
	//*  29   47:icmpeq          127
				{
					if(j != 8)
	//*  30   50:iload_1         
	//*  31   51:bipush          8
	//*  32   53:icmpeq          117
					{
						if(j != 16)
	//*  33   56:iload_1         
	//*  34   57:bipush          16
	//*  35   59:icmpeq          107
							switch(j)
	//*  36   62:iload_1         
							{
	//*  37   63:tableswitch     1 2: default 84
	//	               1 97
	//	               2 87
	//*  38   84:goto            15
							case 2: // '\002'
								stringbuilder.append("FEEDBACK_HAPTIC");
	//   39   87:aload_2         
	//   40   88:ldc1            #62  <String "FEEDBACK_HAPTIC">
	//   41   90:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   42   93:pop             
								break;

	//*  43   94:goto            15
							case 1: // '\001'
								stringbuilder.append("FEEDBACK_SPOKEN");
	//   44   97:aload_2         
	//   45   98:ldc1            #64  <String "FEEDBACK_SPOKEN">
	//   46  100:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   47  103:pop             
								break;
							}
						else
	//*  48  104:goto            15
							stringbuilder.append("FEEDBACK_GENERIC");
	//   49  107:aload_2         
	//   50  108:ldc1            #66  <String "FEEDBACK_GENERIC">
	//   51  110:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   52  113:pop             
					} else
	//*  53  114:goto            15
					{
						stringbuilder.append("FEEDBACK_VISUAL");
	//   54  117:aload_2         
	//   55  118:ldc1            #68  <String "FEEDBACK_VISUAL">
	//   56  120:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   57  123:pop             
					}
				} else
	//*  58  124:goto            15
				{
					stringbuilder.append("FEEDBACK_AUDIBLE");
	//   59  127:aload_2         
	//   60  128:ldc1            #70  <String "FEEDBACK_AUDIBLE">
	//   61  130:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   62  133:pop             
				}
			} else
	//*  63  134:goto            15
			{
				stringbuilder.append("]");
	//   64  137:aload_2         
	//   65  138:ldc1            #72  <String "]">
	//   66  140:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   67  143:pop             
				return stringbuilder.toString();
	//   68  144:aload_2         
	//   69  145:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   70  148:areturn         
			}
		while(true);
	}

	public static String flagToString(int i)
	{
		if(i != 4)
	//*   0    0:iload_0         
	//*   1    1:iconst_4        
	//*   2    2:icmpeq          65
		{
			if(i != 8)
	//*   3    5:iload_0         
	//*   4    6:bipush          8
	//*   5    8:icmpeq          62
			{
				if(i != 16)
	//*   6   11:iload_0         
	//*   7   12:bipush          16
	//*   8   14:icmpeq          59
				{
					if(i != 32)
	//*   9   17:iload_0         
	//*  10   18:bipush          32
	//*  11   20:icmpeq          56
						switch(i)
	//*  12   23:iload_0         
						{
	//*  13   24:tableswitch     1 2: default 48
	//	               1 53
	//	               2 50
						default:
							return null;
	//   14   48:aconst_null     
	//   15   49:areturn         

						case 2: // '\002'
							return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
	//   16   50:ldc1            #79  <String "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS">
	//   17   52:areturn         

						case 1: // '\001'
							return "DEFAULT";
	//   18   53:ldc1            #81  <String "DEFAULT">
	//   19   55:areturn         
						}
					else
						return "FLAG_REQUEST_FILTER_KEY_EVENTS";
	//   20   56:ldc1            #82  <String "FLAG_REQUEST_FILTER_KEY_EVENTS">
	//   21   58:areturn         
				} else
				{
					return "FLAG_REPORT_VIEW_IDS";
	//   22   59:ldc1            #83  <String "FLAG_REPORT_VIEW_IDS">
	//   23   61:areturn         
				}
			} else
			{
				return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
	//   24   62:ldc1            #84  <String "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY">
	//   25   64:areturn         
			}
		} else
		{
			return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
	//   26   65:ldc1            #85  <String "FLAG_REQUEST_TOUCH_EXPLORATION_MODE">
	//   27   67:areturn         
		}
	}

	public static int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #92  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			return accessibilityserviceinfo.getCapabilities();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #96  <Method int AccessibilityServiceInfo.getCapabilities()>
	//    5   12:ireturn         
		return !accessibilityserviceinfo.getCanRetrieveWindowContent() ? 0 : 1;
	//    6   13:aload_0         
	//    7   14:invokevirtual   #100 <Method boolean AccessibilityServiceInfo.getCanRetrieveWindowContent()>
	//    8   17:ifeq            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	public static String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #92  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
			return accessibilityserviceinfo.loadDescription(packagemanager);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #106 <Method String AccessibilityServiceInfo.loadDescription(PackageManager)>
	//    6   13:areturn         
		else
			return accessibilityserviceinfo.getDescription();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #109 <Method String AccessibilityServiceInfo.getDescription()>
	//    9   18:areturn         
	}

	public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
	public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
	public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
	public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
	public static final int FEEDBACK_ALL_MASK = -1;
	public static final int FEEDBACK_BRAILLE = 32;
	public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
	public static final int FLAG_REPORT_VIEW_IDS = 16;
	public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
	public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
	public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
}
