// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class ConnectionErrorMessages
{

	private ConnectionErrorMessages()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static String getAppName(Context context)
	{
		String s = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method String Context.getPackageName()>
	//    2    4:astore_1        
		Object obj;
		String s1;
		try
		{
			s1 = Wrappers.packageManager(context).getApplicationLabel(s).toString();
	//    3    5:aload_0         
	//    4    6:invokestatic    #39  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #45  <Method CharSequence PackageManagerWrapper.getApplicationLabel(String)>
	//    7   13:invokeinterface #50  <Method String CharSequence.toString()>
	//    8   18:astore_2        
		}
	//*   9   19:aload_2         
	//*  10   20:areturn         
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #54  <Method ApplicationInfo Context.getApplicationInfo()>
	//*  13   25:getfield        #60  <Field String ApplicationInfo.name>
	//*  14   28:astore_0        
	//*  15   29:aload_0         
	//*  16   30:invokestatic    #66  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   33:ifeq            38
	//*  18   36:aload_1         
	//*  19   37:areturn         
	//*  20   38:aload_0         
	//*  21   39:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			context = ((Context) (context.getApplicationInfo().name));
			if(TextUtils.isEmpty(((CharSequence) (context))))
				return s;
			else
				return ((String) (context));
		}
		return s1;
	//*  22   40:astore_2        
	//*  23   41:goto            21
	}

	public static String getDefaultNotificationChannelName(Context context)
	{
		return context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:getstatic       #77  <Field int com.google.android.gms.base.R$string.common_google_play_services_notification_channel_name>
	//    3    7:invokevirtual   #83  <Method String Resources.getString(int)>
	//    4   10:areturn         
	}

	public static String getErrorDialogButtonMessage(Context context, int i)
	{
		context = ((Context) (context.getResources()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:astore_0        
		i;
	//    3    5:iload_1         
		JVM INSTR tableswitch 1 3: default 32
	//	               1 55
	//	               2 48
	//	               3 41;
	//    4    6:tableswitch     1 3: default 32
	//	               1 55
	//	               2 48
	//	               3 41
		   goto _L1 _L2 _L3 _L4
_L1:
		i = 0x104000a;
	//    5   32:ldc1            #87  <Int 0x104000a>
	//    6   34:istore_1        
_L6:
		return ((Resources) (context)).getString(i);
	//    7   35:aload_0         
	//    8   36:iload_1         
	//    9   37:invokevirtual   #83  <Method String Resources.getString(int)>
	//   10   40:areturn         
_L4:
		i = com.google.android.gms.base.R.string.common_google_play_services_enable_button;
	//   11   41:getstatic       #90  <Field int com.google.android.gms.base.R$string.common_google_play_services_enable_button>
	//   12   44:istore_1        
		continue; /* Loop/switch isn't completed */
	//   13   45:goto            35
_L3:
		i = com.google.android.gms.base.R.string.common_google_play_services_update_button;
	//   14   48:getstatic       #93  <Field int com.google.android.gms.base.R$string.common_google_play_services_update_button>
	//   15   51:istore_1        
		continue; /* Loop/switch isn't completed */
	//   16   52:goto            35
_L2:
		i = com.google.android.gms.base.R.string.common_google_play_services_install_button;
	//   17   55:getstatic       #96  <Field int com.google.android.gms.base.R$string.common_google_play_services_install_button>
	//   18   58:istore_1        
		if(true) goto _L6; else goto _L5
	//   19   59:goto            35
_L5:
	}

	public static String getErrorMessage(Context context, int i)
	{
		Resources resources = context.getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:astore_2        
		String s = getAppName(context);
	//    3    5:aload_0         
	//    4    6:invokestatic    #100 <Method String getAppName(Context)>
	//    5    9:astore_3        
		if(i != 5)
	//*   6   10:iload_1         
	//*   7   11:iconst_5        
	//*   8   12:icmpeq          231
		{
			if(i != 7)
	//*   9   15:iload_1         
	//*  10   16:bipush          7
	//*  11   18:icmpeq          223
			{
				if(i != 9)
	//*  12   21:iload_1         
	//*  13   22:bipush          9
	//*  14   24:icmpeq          207
				{
					if(i != 20)
	//*  15   27:iload_1         
	//*  16   28:bipush          20
	//*  17   30:icmpeq          199
						switch(i)
	//*  18   33:iload_1         
						{
	//*  19   34:tableswitch     1 3: default 60
	//	               1 183
	//	               2 152
	//	               3 136
						default:
							switch(i)
	//*  20   60:iload_1         
							{
	//*  21   61:tableswitch     16 18: default 88
	//	               16 128
	//	               17 120
	//	               18 104
							default:
								return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, new Object[] {
									s
								});
	//   22   88:aload_2         
	//   23   89:getstatic       #105 <Field int com.google.android.gms.common.R$string.common_google_play_services_unknown_issue>
	//   24   92:iconst_1        
	//   25   93:anewarray       Object[]
	//   26   96:dup             
	//   27   97:iconst_0        
	//   28   98:aload_3         
	//   29   99:aastore         
	//   30  100:invokevirtual   #108 <Method String Resources.getString(int, Object[])>
	//   31  103:areturn         

							case 18: // '\022'
								return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, new Object[] {
									s
								});
	//   32  104:aload_2         
	//   33  105:getstatic       #111 <Field int com.google.android.gms.base.R$string.common_google_play_services_updating_text>
	//   34  108:iconst_1        
	//   35  109:anewarray       Object[]
	//   36  112:dup             
	//   37  113:iconst_0        
	//   38  114:aload_3         
	//   39  115:aastore         
	//   40  116:invokevirtual   #108 <Method String Resources.getString(int, Object[])>
	//   41  119:areturn         

							case 17: // '\021'
								return zza(context, "common_google_play_services_sign_in_failed_text", s);
	//   42  120:aload_0         
	//   43  121:ldc1            #113 <String "common_google_play_services_sign_in_failed_text">
	//   44  123:aload_3         
	//   45  124:invokestatic    #117 <Method String zza(Context, String, String)>
	//   46  127:areturn         

							case 16: // '\020'
								return zza(context, "common_google_play_services_api_unavailable_text", s);
	//   47  128:aload_0         
	//   48  129:ldc1            #119 <String "common_google_play_services_api_unavailable_text">
	//   49  131:aload_3         
	//   50  132:invokestatic    #117 <Method String zza(Context, String, String)>
	//   51  135:areturn         
							}

						case 3: // '\003'
							return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, new Object[] {
								s
							});
	//   52  136:aload_2         
	//   53  137:getstatic       #122 <Field int com.google.android.gms.base.R$string.common_google_play_services_enable_text>
	//   54  140:iconst_1        
	//   55  141:anewarray       Object[]
	//   56  144:dup             
	//   57  145:iconst_0        
	//   58  146:aload_3         
	//   59  147:aastore         
	//   60  148:invokevirtual   #108 <Method String Resources.getString(int, Object[])>
	//   61  151:areturn         

						case 2: // '\002'
							if(DeviceProperties.isWearableWithoutPlayStore(context))
	//*  62  152:aload_0         
	//*  63  153:invokestatic    #128 <Method boolean DeviceProperties.isWearableWithoutPlayStore(Context)>
	//*  64  156:ifeq            167
								return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text);
	//   65  159:aload_2         
	//   66  160:getstatic       #131 <Field int com.google.android.gms.base.R$string.common_google_play_services_wear_update_text>
	//   67  163:invokevirtual   #83  <Method String Resources.getString(int)>
	//   68  166:areturn         
							else
								return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, new Object[] {
									s
								});
	//   69  167:aload_2         
	//   70  168:getstatic       #134 <Field int com.google.android.gms.base.R$string.common_google_play_services_update_text>
	//   71  171:iconst_1        
	//   72  172:anewarray       Object[]
	//   73  175:dup             
	//   74  176:iconst_0        
	//   75  177:aload_3         
	//   76  178:aastore         
	//   77  179:invokevirtual   #108 <Method String Resources.getString(int, Object[])>
	//   78  182:areturn         

						case 1: // '\001'
							return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, new Object[] {
								s
							});
	//   79  183:aload_2         
	//   80  184:getstatic       #137 <Field int com.google.android.gms.base.R$string.common_google_play_services_install_text>
	//   81  187:iconst_1        
	//   82  188:anewarray       Object[]
	//   83  191:dup             
	//   84  192:iconst_0        
	//   85  193:aload_3         
	//   86  194:aastore         
	//   87  195:invokevirtual   #108 <Method String Resources.getString(int, Object[])>
	//   88  198:areturn         
						}
					else
						return zza(context, "common_google_play_services_restricted_profile_text", s);
	//   89  199:aload_0         
	//   90  200:ldc1            #139 <String "common_google_play_services_restricted_profile_text">
	//   91  202:aload_3         
	//   92  203:invokestatic    #117 <Method String zza(Context, String, String)>
	//   93  206:areturn         
				} else
				{
					return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, new Object[] {
						s
					});
	//   94  207:aload_2         
	//   95  208:getstatic       #142 <Field int com.google.android.gms.base.R$string.common_google_play_services_unsupported_text>
	//   96  211:iconst_1        
	//   97  212:anewarray       Object[]
	//   98  215:dup             
	//   99  216:iconst_0        
	//  100  217:aload_3         
	//  101  218:aastore         
	//  102  219:invokevirtual   #108 <Method String Resources.getString(int, Object[])>
	//  103  222:areturn         
				}
			} else
			{
				return zza(context, "common_google_play_services_network_error_text", s);
	//  104  223:aload_0         
	//  105  224:ldc1            #144 <String "common_google_play_services_network_error_text">
	//  106  226:aload_3         
	//  107  227:invokestatic    #117 <Method String zza(Context, String, String)>
	//  108  230:areturn         
			}
		} else
		{
			return zza(context, "common_google_play_services_invalid_account_text", s);
	//  109  231:aload_0         
	//  110  232:ldc1            #146 <String "common_google_play_services_invalid_account_text">
	//  111  234:aload_3         
	//  112  235:invokestatic    #117 <Method String zza(Context, String, String)>
	//  113  238:areturn         
		}
	}

	public static String getErrorNotificationMessage(Context context, int i)
	{
		if(i == 6)
	//*   0    0:iload_1         
	//*   1    1:bipush          6
	//*   2    3:icmpne          17
			return zza(context, "common_google_play_services_resolution_required_text", getAppName(context));
	//    3    6:aload_0         
	//    4    7:ldc1            #149 <String "common_google_play_services_resolution_required_text">
	//    5    9:aload_0         
	//    6   10:invokestatic    #100 <Method String getAppName(Context)>
	//    7   13:invokestatic    #117 <Method String zza(Context, String, String)>
	//    8   16:areturn         
		else
			return getErrorMessage(context, i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokestatic    #151 <Method String getErrorMessage(Context, int)>
	//   12   22:areturn         
	}

	public static String getErrorNotificationTitle(Context context, int i)
	{
		String s;
		if(i == 6)
	//*   0    0:iload_1         
	//*   1    1:bipush          6
	//*   2    3:icmpne          16
			s = zzb(context, "common_google_play_services_resolution_required_title");
	//    3    6:aload_0         
	//    4    7:ldc1            #154 <String "common_google_play_services_resolution_required_title">
	//    5    9:invokestatic    #158 <Method String zzb(Context, String)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            22
			s = getErrorTitle(context, i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokestatic    #161 <Method String getErrorTitle(Context, int)>
	//   11   21:astore_2        
		String s1 = s;
	//   12   22:aload_2         
	//   13   23:astore_3        
		if(s == null)
	//*  14   24:aload_2         
	//*  15   25:ifnonnull       39
			s1 = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker);
	//   16   28:aload_0         
	//   17   29:invokevirtual   #71  <Method Resources Context.getResources()>
	//   18   32:getstatic       #164 <Field int com.google.android.gms.base.R$string.common_google_play_services_notification_ticker>
	//   19   35:invokevirtual   #83  <Method String Resources.getString(int)>
	//   20   38:astore_3        
		return s1;
	//   21   39:aload_3         
	//   22   40:areturn         
	}

	public static String getErrorTitle(Context context, int i)
	{
		Resources resources;
		resources = context.getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:astore_2        
		if(i == 20)
			break MISSING_BLOCK_LABEL_238;
	//    3    5:iload_1         
	//    4    6:bipush          20
	//    5    8:icmpeq          238
		i;
	//    6   11:iload_1         
		JVM INSTR tableswitch 1 11: default 72
	//	               1 230
	//	               2 222
	//	               3 214
	//	               4 212
	//	               5 197
	//	               6 212
	//	               7 182
	//	               8 176
	//	               9 170
	//	               10 164
	//	               11 158;
	//    7   12:tableswitch     1 11: default 72
	//	               1 230
	//	               2 222
	//	               3 214
	//	               4 212
	//	               5 197
	//	               6 212
	//	               7 182
	//	               8 176
	//	               9 170
	//	               10 164
	//	               11 158
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11
_L6:
		break MISSING_BLOCK_LABEL_197;
_L5:
		break MISSING_BLOCK_LABEL_212;
_L4:
		break MISSING_BLOCK_LABEL_214;
_L3:
		break MISSING_BLOCK_LABEL_222;
_L2:
		break MISSING_BLOCK_LABEL_230;
_L1:
		i;
	//    8   72:iload_1         
		JVM INSTR tableswitch 16 18: default 100
	//	               16 152
	//	               17 137
	//	               18 212;
	//    9   73:tableswitch     16 18: default 100
	//	               16 152
	//	               17 137
	//	               18 212
		   goto _L12 _L13 _L14 _L15
_L15:
		break MISSING_BLOCK_LABEL_212;
_L12:
		context = ((Context) (new StringBuilder(33)));
	//   10  100:new             #167 <Class StringBuilder>
	//   11  103:dup             
	//   12  104:bipush          33
	//   13  106:invokespecial   #170 <Method void StringBuilder(int)>
	//   14  109:astore_0        
		((StringBuilder) (context)).append("Unexpected error code ");
	//   15  110:aload_0         
	//   16  111:ldc1            #172 <String "Unexpected error code ">
	//   17  113:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   18  116:pop             
		((StringBuilder) (context)).append(i);
	//   19  117:aload_0         
	//   20  118:iload_1         
	//   21  119:invokevirtual   #179 <Method StringBuilder StringBuilder.append(int)>
	//   22  122:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   23  123:aload_0         
	//   24  124:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   25  127:astore_0        
_L16:
		Log.e("GoogleApiAvailability", ((String) (context)));
	//   26  128:ldc1            #182 <String "GoogleApiAvailability">
	//   27  130:aload_0         
	//   28  131:invokestatic    #188 <Method int Log.e(String, String)>
	//   29  134:pop             
		return null;
	//   30  135:aconst_null     
	//   31  136:areturn         
_L14:
		Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
	//   32  137:ldc1            #182 <String "GoogleApiAvailability">
	//   33  139:ldc1            #190 <String "The specified account could not be signed in.">
	//   34  141:invokestatic    #188 <Method int Log.e(String, String)>
	//   35  144:pop             
		return zzb(context, "common_google_play_services_sign_in_failed_title");
	//   36  145:aload_0         
	//   37  146:ldc1            #192 <String "common_google_play_services_sign_in_failed_title">
	//   38  148:invokestatic    #158 <Method String zzb(Context, String)>
	//   39  151:areturn         
_L13:
		context = "One of the API components you attempted to connect to is not available.";
	//   40  152:ldc1            #194 <String "One of the API components you attempted to connect to is not available.">
	//   41  154:astore_0        
		continue; /* Loop/switch isn't completed */
	//   42  155:goto            128
_L11:
		context = "The application is not licensed to the user.";
	//   43  158:ldc1            #196 <String "The application is not licensed to the user.">
	//   44  160:astore_0        
		continue; /* Loop/switch isn't completed */
	//   45  161:goto            128
_L10:
		context = "Developer error occurred. Please see logs for detailed information";
	//   46  164:ldc1            #198 <String "Developer error occurred. Please see logs for detailed information">
	//   47  166:astore_0        
		continue; /* Loop/switch isn't completed */
	//   48  167:goto            128
_L9:
		context = "Google Play services is invalid. Cannot recover.";
	//   49  170:ldc1            #200 <String "Google Play services is invalid. Cannot recover.">
	//   50  172:astore_0        
		continue; /* Loop/switch isn't completed */
	//   51  173:goto            128
_L8:
		context = "Internal error occurred. Please see logs for detailed information";
	//   52  176:ldc1            #202 <String "Internal error occurred. Please see logs for detailed information">
	//   53  178:astore_0        
		if(true) goto _L16; else goto _L7
	//   54  179:goto            128
_L7:
		Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
	//   55  182:ldc1            #182 <String "GoogleApiAvailability">
	//   56  184:ldc1            #204 <String "Network error occurred. Please retry request later.">
	//   57  186:invokestatic    #188 <Method int Log.e(String, String)>
	//   58  189:pop             
		return zzb(context, "common_google_play_services_network_error_title");
	//   59  190:aload_0         
	//   60  191:ldc1            #206 <String "common_google_play_services_network_error_title">
	//   61  193:invokestatic    #158 <Method String zzb(Context, String)>
	//   62  196:areturn         
		Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
	//   63  197:ldc1            #182 <String "GoogleApiAvailability">
	//   64  199:ldc1            #208 <String "An invalid account was specified when connecting. Please provide a valid account.">
	//   65  201:invokestatic    #188 <Method int Log.e(String, String)>
	//   66  204:pop             
		return zzb(context, "common_google_play_services_invalid_account_title");
	//   67  205:aload_0         
	//   68  206:ldc1            #210 <String "common_google_play_services_invalid_account_title">
	//   69  208:invokestatic    #158 <Method String zzb(Context, String)>
	//   70  211:areturn         
		return null;
	//   71  212:aconst_null     
	//   72  213:areturn         
		return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
	//   73  214:aload_2         
	//   74  215:getstatic       #213 <Field int com.google.android.gms.base.R$string.common_google_play_services_enable_title>
	//   75  218:invokevirtual   #83  <Method String Resources.getString(int)>
	//   76  221:areturn         
		return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
	//   77  222:aload_2         
	//   78  223:getstatic       #216 <Field int com.google.android.gms.base.R$string.common_google_play_services_update_title>
	//   79  226:invokevirtual   #83  <Method String Resources.getString(int)>
	//   80  229:areturn         
		return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
	//   81  230:aload_2         
	//   82  231:getstatic       #219 <Field int com.google.android.gms.base.R$string.common_google_play_services_install_title>
	//   83  234:invokevirtual   #83  <Method String Resources.getString(int)>
	//   84  237:areturn         
		Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
	//   85  238:ldc1            #182 <String "GoogleApiAvailability">
	//   86  240:ldc1            #221 <String "The current user profile is restricted and could not use authenticated features.">
	//   87  242:invokestatic    #188 <Method int Log.e(String, String)>
	//   88  245:pop             
		return zzb(context, "common_google_play_services_restricted_profile_title");
	//   89  246:aload_0         
	//   90  247:ldc1            #223 <String "common_google_play_services_restricted_profile_title">
	//   91  249:invokestatic    #158 <Method String zzb(Context, String)>
	//   92  252:areturn         
	}

	private static String zza(Context context, String s, String s1)
	{
		Resources resources = context.getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:astore_3        
		s = zzb(context, s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #158 <Method String zzb(Context, String)>
	//    6   10:astore_1        
		context = ((Context) (s));
	//    7   11:aload_1         
	//    8   12:astore_0        
		if(s == null)
	//*   9   13:aload_1         
	//*  10   14:ifnonnull       25
			context = ((Context) (resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue)));
	//   11   17:aload_3         
	//   12   18:getstatic       #105 <Field int com.google.android.gms.common.R$string.common_google_play_services_unknown_issue>
	//   13   21:invokevirtual   #83  <Method String Resources.getString(int)>
	//   14   24:astore_0        
		return String.format(resources.getConfiguration().locale, ((String) (context)), new Object[] {
			s1
		});
	//   15   25:aload_3         
	//   16   26:invokevirtual   #227 <Method Configuration Resources.getConfiguration()>
	//   17   29:getfield        #233 <Field java.util.Locale Configuration.locale>
	//   18   32:aload_0         
	//   19   33:iconst_1        
	//   20   34:anewarray       Object[]
	//   21   37:dup             
	//   22   38:iconst_0        
	//   23   39:aload_2         
	//   24   40:aastore         
	//   25   41:invokestatic    #239 <Method String String.format(java.util.Locale, String, Object[])>
	//   26   44:areturn         
	}

	private static String zzb(Context context, String s)
	{
		SimpleArrayMap simplearraymap = zzse;
	//    0    0:getstatic       #19  <Field SimpleArrayMap zzse>
	//    1    3:astore_3        
		simplearraymap;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		String s1 = (String)zzse.get(((Object) (s)));
	//    4    6:getstatic       #19  <Field SimpleArrayMap zzse>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #243 <Method Object SimpleArrayMap.get(Object)>
	//    7   13:checkcast       #235 <Class String>
	//    8   16:astore          4
		if(s1 == null)
			break MISSING_BLOCK_LABEL_28;
	//    9   18:aload           4
	//   10   20:ifnull          28
		simplearraymap;
	//   11   23:aload_3         
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		return s1;
	//   13   25:aload           4
	//   14   27:areturn         
		context = ((Context) (GooglePlayServicesUtil.getRemoteResource(context)));
	//   15   28:aload_0         
	//   16   29:invokestatic    #249 <Method Resources GooglePlayServicesUtil.getRemoteResource(Context)>
	//   17   32:astore_0        
		if(context != null)
			break MISSING_BLOCK_LABEL_41;
	//   18   33:aload_0         
	//   19   34:ifnonnull       41
		simplearraymap;
	//   20   37:aload_3         
		JVM INSTR monitorexit ;
	//   21   38:monitorexit     
		return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		int i = ((Resources) (context)).getIdentifier(s, "string", "com.google.android.gms");
	//   24   41:aload_0         
	//   25   42:aload_1         
	//   26   43:ldc1            #251 <String "string">
	//   27   45:ldc1            #253 <String "com.google.android.gms">
	//   28   47:invokevirtual   #257 <Method int Resources.getIdentifier(String, String, String)>
	//   29   50:istore_2        
		if(i != 0)
			break MISSING_BLOCK_LABEL_100;
	//   30   51:iload_2         
	//   31   52:ifne            100
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   32   55:aload_1         
	//   33   56:invokestatic    #261 <Method String String.valueOf(Object)>
	//   34   59:astore_0        
		if(((String) (context)).length() != 0)
	//*  35   60:aload_0         
	//*  36   61:invokevirtual   #265 <Method int String.length()>
	//*  37   64:ifeq            78
		{
			context = ((Context) ("Missing resource: ".concat(((String) (context)))));
	//   38   67:ldc2            #267 <String "Missing resource: ">
	//   39   70:aload_0         
	//   40   71:invokevirtual   #271 <Method String String.concat(String)>
	//   41   74:astore_0        
			break MISSING_BLOCK_LABEL_89;
	//   42   75:goto            89
		}
		context = ((Context) (new String("Missing resource: ")));
	//   43   78:new             #235 <Class String>
	//   44   81:dup             
	//   45   82:ldc2            #267 <String "Missing resource: ">
	//   46   85:invokespecial   #274 <Method void String(String)>
	//   47   88:astore_0        
		Log.w("GoogleApiAvailability", ((String) (context)));
	//   48   89:ldc1            #182 <String "GoogleApiAvailability">
	//   49   91:aload_0         
	//   50   92:invokestatic    #277 <Method int Log.w(String, String)>
	//   51   95:pop             
		simplearraymap;
	//   52   96:aload_3         
		JVM INSTR monitorexit ;
	//   53   97:monitorexit     
		return null;
	//   54   98:aconst_null     
	//   55   99:areturn         
		context = ((Context) (((Resources) (context)).getString(i)));
	//   56  100:aload_0         
	//   57  101:iload_2         
	//   58  102:invokevirtual   #83  <Method String Resources.getString(int)>
	//   59  105:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (context))))
			break MISSING_BLOCK_LABEL_158;
	//   60  106:aload_0         
	//   61  107:invokestatic    #66  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   62  110:ifeq            158
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   63  113:aload_1         
	//   64  114:invokestatic    #261 <Method String String.valueOf(Object)>
	//   65  117:astore_0        
		if(((String) (context)).length() != 0)
	//*  66  118:aload_0         
	//*  67  119:invokevirtual   #265 <Method int String.length()>
	//*  68  122:ifeq            136
		{
			context = ((Context) ("Got empty resource: ".concat(((String) (context)))));
	//   69  125:ldc2            #279 <String "Got empty resource: ">
	//   70  128:aload_0         
	//   71  129:invokevirtual   #271 <Method String String.concat(String)>
	//   72  132:astore_0        
			break MISSING_BLOCK_LABEL_147;
	//   73  133:goto            147
		}
		context = ((Context) (new String("Got empty resource: ")));
	//   74  136:new             #235 <Class String>
	//   75  139:dup             
	//   76  140:ldc2            #279 <String "Got empty resource: ">
	//   77  143:invokespecial   #274 <Method void String(String)>
	//   78  146:astore_0        
		Log.w("GoogleApiAvailability", ((String) (context)));
	//   79  147:ldc1            #182 <String "GoogleApiAvailability">
	//   80  149:aload_0         
	//   81  150:invokestatic    #277 <Method int Log.w(String, String)>
	//   82  153:pop             
		simplearraymap;
	//   83  154:aload_3         
		JVM INSTR monitorexit ;
	//   84  155:monitorexit     
		return null;
	//   85  156:aconst_null     
	//   86  157:areturn         
		zzse.put(((Object) (s)), ((Object) (context)));
	//   87  158:getstatic       #19  <Field SimpleArrayMap zzse>
	//   88  161:aload_1         
	//   89  162:aload_0         
	//   90  163:invokevirtual   #283 <Method Object SimpleArrayMap.put(Object, Object)>
	//   91  166:pop             
		simplearraymap;
	//   92  167:aload_3         
		JVM INSTR monitorexit ;
	//   93  168:monitorexit     
		return ((String) (context));
	//   94  169:aload_0         
	//   95  170:areturn         
		context;
	//   96  171:astore_0        
		simplearraymap;
	//   97  172:aload_3         
		JVM INSTR monitorexit ;
	//   98  173:monitorexit     
		throw context;
	//   99  174:aload_0         
	//  100  175:athrow          
	}

	private static final SimpleArrayMap zzse = new SimpleArrayMap();

	static 
	{
	//    0    0:new             #14  <Class SimpleArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void SimpleArrayMap()>
	//    3    7:putstatic       #19  <Field SimpleArrayMap zzse>
	//*   4   10:return          
	}
}
