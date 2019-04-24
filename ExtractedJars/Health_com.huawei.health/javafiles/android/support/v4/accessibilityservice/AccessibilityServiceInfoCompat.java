// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

// Referenced classes of package android.support.v4.accessibilityservice:
//			AccessibilityServiceInfoCompatIcs, AccessibilityServiceInfoCompatJellyBean, AccessibilityServiceInfoCompatJellyBeanMr2

public final class AccessibilityServiceInfoCompat
{
	static class AccessibilityServiceInfoIcsImpl extends AccessibilityServiceInfoStubImpl
	{

		public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(accessibilityserviceinfo);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method boolean AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(AccessibilityServiceInfo)>
		//    2    4:ireturn         
		}

		public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return !getCanRetrieveWindowContent(accessibilityserviceinfo) ? 0 : 1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method boolean getCanRetrieveWindowContent(AccessibilityServiceInfo)>
		//    3    5:ifeq            10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return AccessibilityServiceInfoCompatIcs.getDescription(accessibilityserviceinfo);
		//    0    0:aload_1         
		//    1    1:invokestatic    #25  <Method String AccessibilityServiceInfoCompatIcs.getDescription(AccessibilityServiceInfo)>
		//    2    4:areturn         
		}

		public String getId(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return AccessibilityServiceInfoCompatIcs.getId(accessibilityserviceinfo);
		//    0    0:aload_1         
		//    1    1:invokestatic    #28  <Method String AccessibilityServiceInfoCompatIcs.getId(AccessibilityServiceInfo)>
		//    2    4:areturn         
		}

		public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return AccessibilityServiceInfoCompatIcs.getResolveInfo(accessibilityserviceinfo);
		//    0    0:aload_1         
		//    1    1:invokestatic    #32  <Method ResolveInfo AccessibilityServiceInfoCompatIcs.getResolveInfo(AccessibilityServiceInfo)>
		//    2    4:areturn         
		}

		public String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return AccessibilityServiceInfoCompatIcs.getSettingsActivityName(accessibilityserviceinfo);
		//    0    0:aload_1         
		//    1    1:invokestatic    #35  <Method String AccessibilityServiceInfoCompatIcs.getSettingsActivityName(AccessibilityServiceInfo)>
		//    2    4:areturn         
		}

		AccessibilityServiceInfoIcsImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityServiceInfoJellyBeanImpl extends AccessibilityServiceInfoIcsImpl
	{

		public String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
		{
			return AccessibilityServiceInfoCompatJellyBean.loadDescription(accessibilityserviceinfo, packagemanager);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #18  <Method String AccessibilityServiceInfoCompatJellyBean.loadDescription(AccessibilityServiceInfo, PackageManager)>
		//    3    5:areturn         
		}

		AccessibilityServiceInfoJellyBeanImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityServiceInfoJellyBeanMr2Impl extends AccessibilityServiceInfoJellyBeanImpl
	{

		public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return AccessibilityServiceInfoCompatJellyBeanMr2.getCapabilities(accessibilityserviceinfo);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method int AccessibilityServiceInfoCompatJellyBeanMr2.getCapabilities(AccessibilityServiceInfo)>
		//    2    4:ireturn         
		}

		AccessibilityServiceInfoJellyBeanMr2Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityServiceInfoStubImpl
		implements AccessibilityServiceInfoVersionImpl
	{

		public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public String getId(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		AccessibilityServiceInfoStubImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface AccessibilityServiceInfoVersionImpl
	{

		public abstract boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo);

		public abstract int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo);

		public abstract String getDescription(AccessibilityServiceInfo accessibilityserviceinfo);

		public abstract String getId(AccessibilityServiceInfo accessibilityserviceinfo);

		public abstract ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo);

		public abstract String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo);

		public abstract String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager);
	}


	private AccessibilityServiceInfoCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
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
	//	               3 63
	//	               4 57
	//	               5 63
	//	               6 63
	//	               7 63
	//	               8 60
	//*   2   48:goto            63
		case 1: // '\001'
			return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
	//    3   51:ldc1            #61  <String "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT">
	//    4   53:areturn         

		case 2: // '\002'
			return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
	//    5   54:ldc1            #62  <String "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION">
	//    6   56:areturn         

		case 4: // '\004'
			return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
	//    7   57:ldc1            #63  <String "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY">
	//    8   59:areturn         

		case 8: // '\b'
			return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
	//    9   60:ldc1            #64  <String "CAPABILITY_CAN_FILTER_KEY_EVENTS">
	//   10   62:areturn         
		}
		return "UNKNOWN";
	//   11   63:ldc1            #66  <String "UNKNOWN">
	//   12   65:areturn         
	}

	public static String feedbackTypeToString(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #69  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[");
	//    4    8:aload_2         
	//    5    9:ldc1            #72  <String "[">
	//    6   11:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		do
			if(i > 0)
	//*   8   15:iload_0         
	//*   9   16:ifle            153
			{
				int j = 1 << Integer.numberOfTrailingZeros(i);
	//   10   19:iconst_1        
	//   11   20:iload_0         
	//   12   21:invokestatic    #82  <Method int Integer.numberOfTrailingZeros(int)>
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
	//*  22   33:invokevirtual   #86  <Method int StringBuilder.length()>
	//*  23   36:iconst_1        
	//*  24   37:icmple          47
					stringbuilder.append(", ");
	//   25   40:aload_2         
	//   26   41:ldc1            #88  <String ", ">
	//   27   43:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   28   46:pop             
				switch(j)
	//*  29   47:iload_1         
				{
	//*  30   48:lookupswitch    5: default 100
	//	               1: 133
	//	               2: 113
	//	               4: 103
	//	               8: 143
	//	               16: 123
	//*  31  100:goto            150
				case 4: // '\004'
					stringbuilder.append("FEEDBACK_AUDIBLE");
	//   32  103:aload_2         
	//   33  104:ldc1            #90  <String "FEEDBACK_AUDIBLE">
	//   34  106:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   35  109:pop             
					break;

	//*  36  110:goto            150
				case 2: // '\002'
					stringbuilder.append("FEEDBACK_HAPTIC");
	//   37  113:aload_2         
	//   38  114:ldc1            #92  <String "FEEDBACK_HAPTIC">
	//   39  116:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   40  119:pop             
					break;

	//*  41  120:goto            150
				case 16: // '\020'
					stringbuilder.append("FEEDBACK_GENERIC");
	//   42  123:aload_2         
	//   43  124:ldc1            #94  <String "FEEDBACK_GENERIC">
	//   44  126:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   45  129:pop             
					break;

	//*  46  130:goto            150
				case 1: // '\001'
					stringbuilder.append("FEEDBACK_SPOKEN");
	//   47  133:aload_2         
	//   48  134:ldc1            #96  <String "FEEDBACK_SPOKEN">
	//   49  136:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   50  139:pop             
					break;

	//*  51  140:goto            150
				case 8: // '\b'
					stringbuilder.append("FEEDBACK_VISUAL");
	//   52  143:aload_2         
	//   53  144:ldc1            #98  <String "FEEDBACK_VISUAL">
	//   54  146:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   55  149:pop             
					break;
				}
			} else
	//*  56  150:goto            15
			{
				stringbuilder.append("]");
	//   57  153:aload_2         
	//   58  154:ldc1            #100 <String "]">
	//   59  156:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   60  159:pop             
				return stringbuilder.toString();
	//   61  160:aload_2         
	//   62  161:invokevirtual   #104 <Method String StringBuilder.toString()>
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
	//	               1: 63
	//	               2: 66
	//	               4: 69
	//	               8: 72
	//	               16: 75
	//	               32: 78
	//*   2   60:goto            81
		case 1: // '\001'
			return "DEFAULT";
	//    3   63:ldc1            #106 <String "DEFAULT">
	//    4   65:areturn         

		case 2: // '\002'
			return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
	//    5   66:ldc1            #107 <String "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS">
	//    6   68:areturn         

		case 4: // '\004'
			return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
	//    7   69:ldc1            #108 <String "FLAG_REQUEST_TOUCH_EXPLORATION_MODE">
	//    8   71:areturn         

		case 8: // '\b'
			return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
	//    9   72:ldc1            #109 <String "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY">
	//   10   74:areturn         

		case 16: // '\020'
			return "FLAG_REPORT_VIEW_IDS";
	//   11   75:ldc1            #110 <String "FLAG_REPORT_VIEW_IDS">
	//   12   77:areturn         

		case 32: // ' '
			return "FLAG_REQUEST_FILTER_KEY_EVENTS";
	//   13   78:ldc1            #111 <String "FLAG_REQUEST_FILTER_KEY_EVENTS">
	//   14   80:areturn         
		}
		return null;
	//   15   81:aconst_null     
	//   16   82:areturn         
	}

	public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return IMPL.getCanRetrieveWindowContent(accessibilityserviceinfo);
	//    0    0:getstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #115 <Method boolean AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getCanRetrieveWindowContent(AccessibilityServiceInfo)>
	//    3    9:ireturn         
	}

	public static int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return IMPL.getCapabilities(accessibilityserviceinfo);
	//    0    0:getstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #119 <Method int AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getCapabilities(AccessibilityServiceInfo)>
	//    3    9:ireturn         
	}

	public static String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return IMPL.getDescription(accessibilityserviceinfo);
	//    0    0:getstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #123 <Method String AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getDescription(AccessibilityServiceInfo)>
	//    3    9:areturn         
	}

	public static String getId(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return IMPL.getId(accessibilityserviceinfo);
	//    0    0:getstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #126 <Method String AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getId(AccessibilityServiceInfo)>
	//    3    9:areturn         
	}

	public static ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return IMPL.getResolveInfo(accessibilityserviceinfo);
	//    0    0:getstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #130 <Method ResolveInfo AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getResolveInfo(AccessibilityServiceInfo)>
	//    3    9:areturn         
	}

	public static String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return IMPL.getSettingsActivityName(accessibilityserviceinfo);
	//    0    0:getstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #133 <Method String AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getSettingsActivityName(AccessibilityServiceInfo)>
	//    3    9:areturn         
	}

	public static String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
	{
		return IMPL.loadDescription(accessibilityserviceinfo, packagemanager);
	//    0    0:getstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #137 <Method String AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.loadDescription(AccessibilityServiceInfo, PackageManager)>
	//    4   10:areturn         
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
	private static final AccessibilityServiceInfoVersionImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityServiceInfoVersionImpl) (new AccessibilityServiceInfoJellyBeanMr2Impl()));
	//    3    8:new             #12  <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanMr2Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #51  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanMr2Impl()>
	//    6   15:putstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   19:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          16
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityServiceInfoVersionImpl) (new AccessibilityServiceInfoJellyBeanImpl()));
	//   11   27:new             #9   <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanImpl>
	//   12   30:dup             
	//   13   31:invokespecial   #54  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanImpl()>
	//   14   34:putstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//   15   37:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  16   38:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   41:bipush          14
	//*  18   43:icmplt          57
			IMPL = ((AccessibilityServiceInfoVersionImpl) (new AccessibilityServiceInfoIcsImpl()));
	//   19   46:new             #6   <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl>
	//   20   49:dup             
	//   21   50:invokespecial   #55  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl()>
	//   22   53:putstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//   23   56:return          
		else
			IMPL = ((AccessibilityServiceInfoVersionImpl) (new AccessibilityServiceInfoStubImpl()));
	//   24   57:new             #15  <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl>
	//   25   60:dup             
	//   26   61:invokespecial   #56  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl()>
	//   27   64:putstatic       #53  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
	//*  28   67:return          
	}
}
