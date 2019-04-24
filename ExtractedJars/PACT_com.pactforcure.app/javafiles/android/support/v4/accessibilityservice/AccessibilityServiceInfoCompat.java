// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

public final class AccessibilityServiceInfoCompat
{
	static class AccessibilityServiceInfoApi16Impl extends AccessibilityServiceInfoBaseImpl
	{

		public String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
		{
			return accessibilityserviceinfo.loadDescription(packagemanager);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #22  <Method String AccessibilityServiceInfo.loadDescription(PackageManager)>
		//    3    5:areturn         
		}

		AccessibilityServiceInfoApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityServiceInfoApi18Impl extends AccessibilityServiceInfoApi16Impl
	{

		public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return accessibilityserviceinfo.getCapabilities();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int AccessibilityServiceInfo.getCapabilities()>
		//    2    4:ireturn         
		}

		AccessibilityServiceInfoApi18Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi16Impl()>
		//    2    4:return          
		}
	}

	static class AccessibilityServiceInfoBaseImpl
	{

		public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return !AccessibilityServiceInfoCompat.getCanRetrieveWindowContent(accessibilityserviceinfo) ? 0 : 1;
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method boolean AccessibilityServiceInfoCompat.getCanRetrieveWindowContent(AccessibilityServiceInfo)>
		//    2    4:ifeq            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		AccessibilityServiceInfoBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private AccessibilityServiceInfoCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static String capabilityToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 8: default 48
	//	               1 51
	//	               2 54
	//	               3 48
	//	               4 57
	//	               5 48
	//	               6 48
	//	               7 48
	//	               8 60
		case 3: // '\003'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		default:
			return "UNKNOWN";
	//    2   48:ldc1            #56  <String "UNKNOWN">
	//    3   50:areturn         

		case 1: // '\001'
			return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
	//    4   51:ldc1            #57  <String "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT">
	//    5   53:areturn         

		case 2: // '\002'
			return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
	//    6   54:ldc1            #58  <String "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION">
	//    7   56:areturn         

		case 4: // '\004'
			return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
	//    8   57:ldc1            #59  <String "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY">
	//    9   59:areturn         

		case 8: // '\b'
			return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
	//   10   60:ldc1            #60  <String "CAPABILITY_CAN_FILTER_KEY_EVENTS">
	//   11   62:areturn         
		}
	}

	public static String feedbackTypeToString(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[");
	//    4    8:aload_2         
	//    5    9:ldc1            #66  <String "[">
	//    6   11:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		do
			if(i > 0)
	//*   8   15:iload_0         
	//*   9   16:ifle            153
			{
				int j = 1 << Integer.numberOfTrailingZeros(i);
	//   10   19:iconst_1        
	//   11   20:iload_0         
	//   12   21:invokestatic    #76  <Method int Integer.numberOfTrailingZeros(int)>
	//   13   24:ishl            
	//   14   25:istore_1        
				i &= ~j;
	//   15   26:iload_0         
	//   16   27:iload_1         
	//   17   28:iconst_m1       
	//   18   29:ixor            
	//   19   30:iand            
	//   20   31:istore_0        
				if(stringbuilder.length() > 1)
	//*  21   32:aload_2         
	//*  22   33:invokevirtual   #80  <Method int StringBuilder.length()>
	//*  23   36:iconst_1        
	//*  24   37:icmple          47
					stringbuilder.append(", ");
	//   25   40:aload_2         
	//   26   41:ldc1            #82  <String ", ">
	//   27   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   28   46:pop             
				switch(j)
	//*  29   47:iload_1         
				{
	//*  30   48:lookupswitch    5: default 100
	//	               1: 103
	//	               2: 123
	//	               4: 113
	//	               8: 143
	//	               16: 133
	//*  31  100:goto            15
				case 1: // '\001'
					stringbuilder.append("FEEDBACK_SPOKEN");
	//   32  103:aload_2         
	//   33  104:ldc1            #84  <String "FEEDBACK_SPOKEN">
	//   34  106:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   35  109:pop             
					break;

	//*  36  110:goto            15
				case 4: // '\004'
					stringbuilder.append("FEEDBACK_AUDIBLE");
	//   37  113:aload_2         
	//   38  114:ldc1            #86  <String "FEEDBACK_AUDIBLE">
	//   39  116:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   40  119:pop             
					break;

	//*  41  120:goto            15
				case 2: // '\002'
					stringbuilder.append("FEEDBACK_HAPTIC");
	//   42  123:aload_2         
	//   43  124:ldc1            #88  <String "FEEDBACK_HAPTIC">
	//   44  126:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   45  129:pop             
					break;

	//*  46  130:goto            15
				case 16: // '\020'
					stringbuilder.append("FEEDBACK_GENERIC");
	//   47  133:aload_2         
	//   48  134:ldc1            #90  <String "FEEDBACK_GENERIC">
	//   49  136:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   50  139:pop             
					break;

	//*  51  140:goto            15
				case 8: // '\b'
					stringbuilder.append("FEEDBACK_VISUAL");
	//   52  143:aload_2         
	//   53  144:ldc1            #92  <String "FEEDBACK_VISUAL">
	//   54  146:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   55  149:pop             
					break;
				}
			} else
	//*  56  150:goto            15
			{
				stringbuilder.append("]");
	//   57  153:aload_2         
	//   58  154:ldc1            #94  <String "]">
	//   59  156:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   60  159:pop             
				return stringbuilder.toString();
	//   61  160:aload_2         
	//   62  161:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   63  164:areturn         
			}
		while(true);
	}

	public static String flagToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    6: default 60
	//	               1: 62
	//	               2: 65
	//	               4: 68
	//	               8: 71
	//	               16: 74
	//	               32: 77
		default:
			return null;
	//    2   60:aconst_null     
	//    3   61:areturn         

		case 1: // '\001'
			return "DEFAULT";
	//    4   62:ldc1            #100 <String "DEFAULT">
	//    5   64:areturn         

		case 2: // '\002'
			return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
	//    6   65:ldc1            #101 <String "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS">
	//    7   67:areturn         

		case 4: // '\004'
			return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
	//    8   68:ldc1            #102 <String "FLAG_REQUEST_TOUCH_EXPLORATION_MODE">
	//    9   70:areturn         

		case 8: // '\b'
			return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
	//   10   71:ldc1            #103 <String "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY">
	//   11   73:areturn         

		case 16: // '\020'
			return "FLAG_REPORT_VIEW_IDS";
	//   12   74:ldc1            #104 <String "FLAG_REPORT_VIEW_IDS">
	//   13   76:areturn         

		case 32: // ' '
			return "FLAG_REQUEST_FILTER_KEY_EVENTS";
	//   14   77:ldc1            #105 <String "FLAG_REQUEST_FILTER_KEY_EVENTS">
	//   15   79:areturn         
		}
	}

	public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getCanRetrieveWindowContent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method boolean AccessibilityServiceInfo.getCanRetrieveWindowContent()>
	//    2    4:ireturn         
	}

	public static int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return IMPL.getCapabilities(accessibilityserviceinfo);
	//    0    0:getstatic       #48  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #117 <Method int AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl.getCapabilities(AccessibilityServiceInfo)>
	//    3    7:ireturn         
	}

	public static String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getDescription();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method String AccessibilityServiceInfo.getDescription()>
	//    2    4:areturn         
	}

	public static String getId(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method String AccessibilityServiceInfo.getId()>
	//    2    4:areturn         
	}

	public static ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getResolveInfo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method ResolveInfo AccessibilityServiceInfo.getResolveInfo()>
	//    2    4:areturn         
	}

	public static String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getSettingsActivityName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method String AccessibilityServiceInfo.getSettingsActivityName()>
	//    2    4:areturn         
	}

	public static String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
	{
		return IMPL.loadDescription(accessibilityserviceinfo, packagemanager);
	//    0    0:getstatic       #48  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method String AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl.loadDescription(AccessibilityServiceInfo, PackageManager)>
	//    4    8:areturn         
	}

	public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
	public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
	public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
	public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
	public static final int DEFAULT = 1;
	public static final int FEEDBACK_ALL_MASK = -1;
	public static final int FEEDBACK_BRAILLE = 32;
	public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
	public static final int FLAG_REPORT_VIEW_IDS = 16;
	public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
	public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
	public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
	private static final AccessibilityServiceInfoBaseImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityServiceInfoBaseImpl) (new AccessibilityServiceInfoApi18Impl()));
	//    3    8:new             #9   <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi18Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #46  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi18Impl()>
	//    6   15:putstatic       #48  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   19:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          16
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityServiceInfoBaseImpl) (new AccessibilityServiceInfoApi16Impl()));
	//   11   27:new             #6   <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi16Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #49  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi16Impl()>
	//   14   34:putstatic       #48  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl IMPL>
	//   15   37:return          
		else
			IMPL = new AccessibilityServiceInfoBaseImpl();
	//   16   38:new             #12  <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #50  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl()>
	//   19   45:putstatic       #48  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl IMPL>
	//*  20   48:return          
	}
}
