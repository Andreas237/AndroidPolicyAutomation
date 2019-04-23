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
		switch(i)
	//*   3    5:iload_1         
		{
	//*   4    6:tableswitch     1 3: default 32
	//	               1 55
	//	               2 47
	//	               3 39
		default:
			return ((Resources) (context)).getString(0x104000a);
	//    5   32:aload_0         
	//    6   33:ldc1            #87  <Int 0x104000a>
	//    7   35:invokevirtual   #83  <Method String Resources.getString(int)>
	//    8   38:areturn         

		case 3: // '\003'
			return ((Resources) (context)).getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
	//    9   39:aload_0         
	//   10   40:getstatic       #90  <Field int com.google.android.gms.base.R$string.common_google_play_services_enable_button>
	//   11   43:invokevirtual   #83  <Method String Resources.getString(int)>
	//   12   46:areturn         

		case 2: // '\002'
			return ((Resources) (context)).getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
	//   13   47:aload_0         
	//   14   48:getstatic       #93  <Field int com.google.android.gms.base.R$string.common_google_play_services_update_button>
	//   15   51:invokevirtual   #83  <Method String Resources.getString(int)>
	//   16   54:areturn         

		case 1: // '\001'
			return ((Resources) (context)).getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
	//   17   55:aload_0         
	//   18   56:getstatic       #96  <Field int com.google.android.gms.base.R$string.common_google_play_services_install_button>
	//   19   59:invokevirtual   #83  <Method String Resources.getString(int)>
	//   20   62:areturn         
		}
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
								return zaa(context, "common_google_play_services_sign_in_failed_text", s);
	//   42  120:aload_0         
	//   43  121:ldc1            #113 <String "common_google_play_services_sign_in_failed_text">
	//   44  123:aload_3         
	//   45  124:invokestatic    #117 <Method String zaa(Context, String, String)>
	//   46  127:areturn         

							case 16: // '\020'
								return zaa(context, "common_google_play_services_api_unavailable_text", s);
	//   47  128:aload_0         
	//   48  129:ldc1            #119 <String "common_google_play_services_api_unavailable_text">
	//   49  131:aload_3         
	//   50  132:invokestatic    #117 <Method String zaa(Context, String, String)>
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
						return zaa(context, "common_google_play_services_restricted_profile_text", s);
	//   89  199:aload_0         
	//   90  200:ldc1            #139 <String "common_google_play_services_restricted_profile_text">
	//   91  202:aload_3         
	//   92  203:invokestatic    #117 <Method String zaa(Context, String, String)>
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
				return zaa(context, "common_google_play_services_network_error_text", s);
	//  104  223:aload_0         
	//  105  224:ldc1            #144 <String "common_google_play_services_network_error_text">
	//  106  226:aload_3         
	//  107  227:invokestatic    #117 <Method String zaa(Context, String, String)>
	//  108  230:areturn         
			}
		} else
		{
			return zaa(context, "common_google_play_services_invalid_account_text", s);
	//  109  231:aload_0         
	//  110  232:ldc1            #146 <String "common_google_play_services_invalid_account_text">
	//  111  234:aload_3         
	//  112  235:invokestatic    #117 <Method String zaa(Context, String, String)>
	//  113  238:areturn         
		}
	}

	public static String getErrorNotificationMessage(Context context, int i)
	{
		if(i == 6)
	//*   0    0:iload_1         
	//*   1    1:bipush          6
	//*   2    3:icmpne          17
			return zaa(context, "common_google_play_services_resolution_required_text", getAppName(context));
	//    3    6:aload_0         
	//    4    7:ldc1            #149 <String "common_google_play_services_resolution_required_text">
	//    5    9:aload_0         
	//    6   10:invokestatic    #100 <Method String getAppName(Context)>
	//    7   13:invokestatic    #117 <Method String zaa(Context, String, String)>
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
			s = zaa(context, "common_google_play_services_resolution_required_title");
	//    3    6:aload_0         
	//    4    7:ldc1            #154 <String "common_google_play_services_resolution_required_title">
	//    5    9:invokestatic    #157 <Method String zaa(Context, String)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            22
			s = getErrorTitle(context, i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokestatic    #160 <Method String getErrorTitle(Context, int)>
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
	//   18   32:getstatic       #163 <Field int com.google.android.gms.base.R$string.common_google_play_services_notification_ticker>
	//   19   35:invokevirtual   #83  <Method String Resources.getString(int)>
	//   20   38:astore_3        
		return s1;
	//   21   39:aload_3         
	//   22   40:areturn         
	}

	public static String getErrorTitle(Context context, int i)
	{
		Resources resources = context.getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:astore_2        
		if(i != 20)
	//*   3    5:iload_1         
	//*   4    6:bipush          20
	//*   5    8:icmpeq          256
		{
			switch(i)
	//*   6   11:iload_1         
			{
	//*   7   12:tableswitch     1 11: default 72
	//	               1 248
	//	               2 240
	//	               3 232
	//	               4 230
	//	               5 215
	//	               6 230
	//	               7 200
	//	               8 190
	//	               9 180
	//	               10 170
	//	               11 160
	//*   8   72:iload_1         
	//*   9   73:tableswitch     16 18: default 100
	//	               16 150
	//	               17 135
	//	               18 230
	//*  10  100:new             #166 <Class StringBuilder>
	//*  11  103:dup             
	//*  12  104:bipush          33
	//*  13  106:invokespecial   #169 <Method void StringBuilder(int)>
	//*  14  109:astore_0        
	//*  15  110:aload_0         
	//*  16  111:ldc1            #171 <String "Unexpected error code ">
	//*  17  113:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//*  18  116:pop             
	//*  19  117:aload_0         
	//*  20  118:iload_1         
	//*  21  119:invokevirtual   #178 <Method StringBuilder StringBuilder.append(int)>
	//*  22  122:pop             
	//*  23  123:ldc1            #180 <String "GoogleApiAvailability">
	//*  24  125:aload_0         
	//*  25  126:invokevirtual   #181 <Method String StringBuilder.toString()>
	//*  26  129:invokestatic    #187 <Method int Log.e(String, String)>
	//*  27  132:pop             
	//*  28  133:aconst_null     
	//*  29  134:areturn         
	//*  30  135:ldc1            #180 <String "GoogleApiAvailability">
	//*  31  137:ldc1            #189 <String "The specified account could not be signed in.">
	//*  32  139:invokestatic    #187 <Method int Log.e(String, String)>
	//*  33  142:pop             
	//*  34  143:aload_0         
	//*  35  144:ldc1            #191 <String "common_google_play_services_sign_in_failed_title">
	//*  36  146:invokestatic    #157 <Method String zaa(Context, String)>
	//*  37  149:areturn         
	//*  38  150:ldc1            #180 <String "GoogleApiAvailability">
	//*  39  152:ldc1            #193 <String "One of the API components you attempted to connect to is not available.">
	//*  40  154:invokestatic    #187 <Method int Log.e(String, String)>
	//*  41  157:pop             
	//*  42  158:aconst_null     
	//*  43  159:areturn         
			case 11: // '\013'
				Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
	//   44  160:ldc1            #180 <String "GoogleApiAvailability">
	//   45  162:ldc1            #195 <String "The application is not licensed to the user.">
	//   46  164:invokestatic    #187 <Method int Log.e(String, String)>
	//   47  167:pop             
				return null;
	//   48  168:aconst_null     
	//   49  169:areturn         

			case 10: // '\n'
				Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
	//   50  170:ldc1            #180 <String "GoogleApiAvailability">
	//   51  172:ldc1            #197 <String "Developer error occurred. Please see logs for detailed information">
	//   52  174:invokestatic    #187 <Method int Log.e(String, String)>
	//   53  177:pop             
				return null;
	//   54  178:aconst_null     
	//   55  179:areturn         

			case 9: // '\t'
				Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
	//   56  180:ldc1            #180 <String "GoogleApiAvailability">
	//   57  182:ldc1            #199 <String "Google Play services is invalid. Cannot recover.">
	//   58  184:invokestatic    #187 <Method int Log.e(String, String)>
	//   59  187:pop             
				return null;
	//   60  188:aconst_null     
	//   61  189:areturn         

			case 8: // '\b'
				Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
	//   62  190:ldc1            #180 <String "GoogleApiAvailability">
	//   63  192:ldc1            #201 <String "Internal error occurred. Please see logs for detailed information">
	//   64  194:invokestatic    #187 <Method int Log.e(String, String)>
	//   65  197:pop             
				return null;
	//   66  198:aconst_null     
	//   67  199:areturn         

			case 7: // '\007'
				Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
	//   68  200:ldc1            #180 <String "GoogleApiAvailability">
	//   69  202:ldc1            #203 <String "Network error occurred. Please retry request later.">
	//   70  204:invokestatic    #187 <Method int Log.e(String, String)>
	//   71  207:pop             
				return zaa(context, "common_google_play_services_network_error_title");
	//   72  208:aload_0         
	//   73  209:ldc1            #205 <String "common_google_play_services_network_error_title">
	//   74  211:invokestatic    #157 <Method String zaa(Context, String)>
	//   75  214:areturn         

			case 5: // '\005'
				Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
	//   76  215:ldc1            #180 <String "GoogleApiAvailability">
	//   77  217:ldc1            #207 <String "An invalid account was specified when connecting. Please provide a valid account.">
	//   78  219:invokestatic    #187 <Method int Log.e(String, String)>
	//   79  222:pop             
				return zaa(context, "common_google_play_services_invalid_account_title");
	//   80  223:aload_0         
	//   81  224:ldc1            #209 <String "common_google_play_services_invalid_account_title">
	//   82  226:invokestatic    #157 <Method String zaa(Context, String)>
	//   83  229:areturn         

			default:
				switch(i)
				{
				default:
					context = ((Context) (new StringBuilder(33)));
					((StringBuilder) (context)).append("Unexpected error code ");
					((StringBuilder) (context)).append(i);
					Log.e("GoogleApiAvailability", ((StringBuilder) (context)).toString());
					return null;

				case 17: // '\021'
					Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
					return zaa(context, "common_google_play_services_sign_in_failed_title");

				case 16: // '\020'
					Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
					return null;

				case 18: // '\022'
					break;
				}
				// fall through

			case 4: // '\004'
			case 6: // '\006'
				return null;
	//   84  230:aconst_null     
	//   85  231:areturn         

			case 3: // '\003'
				return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
	//   86  232:aload_2         
	//   87  233:getstatic       #212 <Field int com.google.android.gms.base.R$string.common_google_play_services_enable_title>
	//   88  236:invokevirtual   #83  <Method String Resources.getString(int)>
	//   89  239:areturn         

			case 2: // '\002'
				return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
	//   90  240:aload_2         
	//   91  241:getstatic       #215 <Field int com.google.android.gms.base.R$string.common_google_play_services_update_title>
	//   92  244:invokevirtual   #83  <Method String Resources.getString(int)>
	//   93  247:areturn         

			case 1: // '\001'
				return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
	//   94  248:aload_2         
	//   95  249:getstatic       #218 <Field int com.google.android.gms.base.R$string.common_google_play_services_install_title>
	//   96  252:invokevirtual   #83  <Method String Resources.getString(int)>
	//   97  255:areturn         
			}
		} else
		{
			Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
	//   98  256:ldc1            #180 <String "GoogleApiAvailability">
	//   99  258:ldc1            #220 <String "The current user profile is restricted and could not use authenticated features.">
	//  100  260:invokestatic    #187 <Method int Log.e(String, String)>
	//  101  263:pop             
			return zaa(context, "common_google_play_services_restricted_profile_title");
	//  102  264:aload_0         
	//  103  265:ldc1            #222 <String "common_google_play_services_restricted_profile_title">
	//  104  267:invokestatic    #157 <Method String zaa(Context, String)>
	//  105  270:areturn         
		}
	}

	private static String zaa(Context context, String s)
	{
		SimpleArrayMap simplearraymap = zaof;
	//    0    0:getstatic       #19  <Field SimpleArrayMap zaof>
	//    1    3:astore_3        
		simplearraymap;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		String s1 = (String)zaof.get(((Object) (s)));
	//    4    6:getstatic       #19  <Field SimpleArrayMap zaof>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #226 <Method Object SimpleArrayMap.get(Object)>
	//    7   13:checkcast       #228 <Class String>
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
	//   16   29:invokestatic    #234 <Method Resources GooglePlayServicesUtil.getRemoteResource(Context)>
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
	//   26   43:ldc1            #236 <String "string">
	//   27   45:ldc1            #238 <String "com.google.android.gms">
	//   28   47:invokevirtual   #242 <Method int Resources.getIdentifier(String, String, String)>
	//   29   50:istore_2        
		if(i != 0)
			break MISSING_BLOCK_LABEL_98;
	//   30   51:iload_2         
	//   31   52:ifne            98
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   32   55:aload_1         
	//   33   56:invokestatic    #246 <Method String String.valueOf(Object)>
	//   34   59:astore_0        
		if(((String) (context)).length() != 0)
	//*  35   60:aload_0         
	//*  36   61:invokevirtual   #250 <Method int String.length()>
	//*  37   64:ifeq            77
		{
			context = ((Context) ("Missing resource: ".concat(((String) (context)))));
	//   38   67:ldc1            #252 <String "Missing resource: ">
	//   39   69:aload_0         
	//   40   70:invokevirtual   #256 <Method String String.concat(String)>
	//   41   73:astore_0        
			break MISSING_BLOCK_LABEL_87;
	//   42   74:goto            87
		}
		context = ((Context) (new String("Missing resource: ")));
	//   43   77:new             #228 <Class String>
	//   44   80:dup             
	//   45   81:ldc1            #252 <String "Missing resource: ">
	//   46   83:invokespecial   #259 <Method void String(String)>
	//   47   86:astore_0        
		Log.w("GoogleApiAvailability", ((String) (context)));
	//   48   87:ldc1            #180 <String "GoogleApiAvailability">
	//   49   89:aload_0         
	//   50   90:invokestatic    #262 <Method int Log.w(String, String)>
	//   51   93:pop             
		simplearraymap;
	//   52   94:aload_3         
		JVM INSTR monitorexit ;
	//   53   95:monitorexit     
		return null;
	//   54   96:aconst_null     
	//   55   97:areturn         
		context = ((Context) (((Resources) (context)).getString(i)));
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:invokevirtual   #83  <Method String Resources.getString(int)>
	//   59  103:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (context))))
			break MISSING_BLOCK_LABEL_156;
	//   60  104:aload_0         
	//   61  105:invokestatic    #66  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   62  108:ifeq            156
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   63  111:aload_1         
	//   64  112:invokestatic    #246 <Method String String.valueOf(Object)>
	//   65  115:astore_0        
		if(((String) (context)).length() != 0)
	//*  66  116:aload_0         
	//*  67  117:invokevirtual   #250 <Method int String.length()>
	//*  68  120:ifeq            134
		{
			context = ((Context) ("Got empty resource: ".concat(((String) (context)))));
	//   69  123:ldc2            #264 <String "Got empty resource: ">
	//   70  126:aload_0         
	//   71  127:invokevirtual   #256 <Method String String.concat(String)>
	//   72  130:astore_0        
			break MISSING_BLOCK_LABEL_145;
	//   73  131:goto            145
		}
		context = ((Context) (new String("Got empty resource: ")));
	//   74  134:new             #228 <Class String>
	//   75  137:dup             
	//   76  138:ldc2            #264 <String "Got empty resource: ">
	//   77  141:invokespecial   #259 <Method void String(String)>
	//   78  144:astore_0        
		Log.w("GoogleApiAvailability", ((String) (context)));
	//   79  145:ldc1            #180 <String "GoogleApiAvailability">
	//   80  147:aload_0         
	//   81  148:invokestatic    #262 <Method int Log.w(String, String)>
	//   82  151:pop             
		simplearraymap;
	//   83  152:aload_3         
		JVM INSTR monitorexit ;
	//   84  153:monitorexit     
		return null;
	//   85  154:aconst_null     
	//   86  155:areturn         
		zaof.put(((Object) (s)), ((Object) (context)));
	//   87  156:getstatic       #19  <Field SimpleArrayMap zaof>
	//   88  159:aload_1         
	//   89  160:aload_0         
	//   90  161:invokevirtual   #268 <Method Object SimpleArrayMap.put(Object, Object)>
	//   91  164:pop             
		simplearraymap;
	//   92  165:aload_3         
		JVM INSTR monitorexit ;
	//   93  166:monitorexit     
		return ((String) (context));
	//   94  167:aload_0         
	//   95  168:areturn         
		context;
	//   96  169:astore_0        
		simplearraymap;
	//   97  170:aload_3         
		JVM INSTR monitorexit ;
	//   98  171:monitorexit     
		throw context;
	//   99  172:aload_0         
	//  100  173:athrow          
	}

	private static String zaa(Context context, String s, String s1)
	{
		Resources resources = context.getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:astore_3        
		s = zaa(context, s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #157 <Method String zaa(Context, String)>
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
	//   16   26:invokevirtual   #272 <Method Configuration Resources.getConfiguration()>
	//   17   29:getfield        #278 <Field java.util.Locale Configuration.locale>
	//   18   32:aload_0         
	//   19   33:iconst_1        
	//   20   34:anewarray       Object[]
	//   21   37:dup             
	//   22   38:iconst_0        
	//   23   39:aload_2         
	//   24   40:aastore         
	//   25   41:invokestatic    #282 <Method String String.format(java.util.Locale, String, Object[])>
	//   26   44:areturn         
	}

	private static final SimpleArrayMap zaof = new SimpleArrayMap();

	static 
	{
	//    0    0:new             #14  <Class SimpleArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void SimpleArrayMap()>
	//    3    7:putstatic       #19  <Field SimpleArrayMap zaof>
	//*   4   10:return          
	}
}
