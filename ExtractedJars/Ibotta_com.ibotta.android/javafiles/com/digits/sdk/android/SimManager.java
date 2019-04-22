// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.util.Locale;

class SimManager
{

	protected SimManager(TelephonyManager telephonymanager, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		telephonyManager = telephonymanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field TelephonyManager telephonyManager>
		canReadPhoneState = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field boolean canReadPhoneState>
	//    8   14:return          
	}

	public static SimManager createSimManager(Context context)
	{
		return new SimManager((TelephonyManager)context.getSystemService("phone"), CommonUtils.checkPermission(context, "android.permission.READ_PHONE_STATE"));
	//    0    0:new             #2   <Class SimManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #22  <String "phone">
	//    4    7:invokevirtual   #28  <Method Object Context.getSystemService(String)>
	//    5   10:checkcast       #30  <Class TelephonyManager>
	//    6   13:aload_0         
	//    7   14:ldc1            #32  <String "android.permission.READ_PHONE_STATE">
	//    8   16:invokestatic    #38  <Method boolean CommonUtils.checkPermission(Context, String)>
	//    9   19:invokespecial   #40  <Method void SimManager(TelephonyManager, boolean)>
	//   10   22:areturn         
	}

	private boolean isCdma()
	{
		return telephonyManager.getPhoneType() == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TelephonyManager telephonyManager>
	//    2    4:invokevirtual   #46  <Method int TelephonyManager.getPhoneType()>
	//    3    7:iconst_2        
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private boolean isIso2(String s)
	{
		return s != null && s.length() == 2;
	//    0    0:aload_1         
	//    1    1:ifnull          14
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method int String.length()>
	//    4    8:iconst_2        
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private String normalizeNumber(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #61  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            10
			return "";
	//    3    7:ldc1            #63  <String "">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #65  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #66  <Method void StringBuilder()>
	//    8   17:astore          6
		int j = s.length();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #53  <Method int String.length()>
	//   11   23:istore          4
		for(int i = 0; i < j; i++)
	//*  12   25:iconst_0        
	//*  13   26:istore_3        
	//*  14   27:iload_3         
	//*  15   28:iload           4
	//*  16   30:icmpge          124
		{
			char c = s.charAt(i);
	//   17   33:aload_1         
	//   18   34:iload_3         
	//   19   35:invokevirtual   #70  <Method char String.charAt(int)>
	//   20   38:istore_2        
			int k = Character.digit(c, 10);
	//   21   39:iload_2         
	//   22   40:bipush          10
	//   23   42:invokestatic    #76  <Method int Character.digit(char, int)>
	//   24   45:istore          5
			if(k != -1)
	//*  25   47:iload           5
	//*  26   49:iconst_m1       
	//*  27   50:icmpeq          64
			{
				stringbuilder.append(k);
	//   28   53:aload           6
	//   29   55:iload           5
	//   30   57:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   31   60:pop             
				continue;
	//   32   61:goto            117
			}
			if(i == 0 && c == '+')
	//*  33   64:iload_3         
	//*  34   65:ifne            84
	//*  35   68:iload_2         
	//*  36   69:bipush          43
	//*  37   71:icmpne          84
			{
				stringbuilder.append(c);
	//   38   74:aload           6
	//   39   76:iload_2         
	//   40   77:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   41   80:pop             
				continue;
	//   42   81:goto            117
			}
			if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
	//*  43   84:iload_2         
	//*  44   85:bipush          97
	//*  45   87:icmplt          96
	//*  46   90:iload_2         
	//*  47   91:bipush          122
	//*  48   93:icmple          108
	//*  49   96:iload_2         
	//*  50   97:bipush          65
	//*  51   99:icmplt          117
	//*  52  102:iload_2         
	//*  53  103:bipush          90
	//*  54  105:icmpgt          117
				return normalizeNumber(PhoneNumberUtils.convertKeypadLettersToDigits(s));
	//   55  108:aload_0         
	//   56  109:aload_1         
	//   57  110:invokestatic    #88  <Method String PhoneNumberUtils.convertKeypadLettersToDigits(String)>
	//   58  113:invokespecial   #90  <Method String normalizeNumber(String)>
	//   59  116:areturn         
		}

	//   60  117:iload_3         
	//   61  118:iconst_1        
	//   62  119:iadd            
	//   63  120:istore_3        
	//*  64  121:goto            27
		return stringbuilder.toString();
	//   65  124:aload           6
	//   66  126:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   67  129:areturn         
	}

	protected String getCountryIso()
	{
		Object obj = ((Object) (telephonyManager));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TelephonyManager telephonyManager>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          61
		{
			obj = ((Object) (((TelephonyManager) (obj)).getSimCountryIso()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #98  <Method String TelephonyManager.getSimCountryIso()>
	//    7   13:astore_1        
			if(isIso2(((String) (obj))))
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokespecial   #100 <Method boolean isIso2(String)>
	//*  11   19:ifeq            30
				return ((String) (obj)).toUpperCase(Locale.getDefault());
	//   12   22:aload_1         
	//   13   23:invokestatic    #106 <Method Locale Locale.getDefault()>
	//   14   26:invokevirtual   #110 <Method String String.toUpperCase(Locale)>
	//   15   29:areturn         
			if(!isCdma())
	//*  16   30:aload_0         
	//*  17   31:invokespecial   #112 <Method boolean isCdma()>
	//*  18   34:ifne            61
			{
				String s = telephonyManager.getNetworkCountryIso();
	//   19   37:aload_0         
	//   20   38:getfield        #15  <Field TelephonyManager telephonyManager>
	//   21   41:invokevirtual   #115 <Method String TelephonyManager.getNetworkCountryIso()>
	//   22   44:astore_1        
				if(isIso2(s))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:invokespecial   #100 <Method boolean isIso2(String)>
	//*  26   50:ifeq            61
					return s.toUpperCase(Locale.getDefault());
	//   27   53:aload_1         
	//   28   54:invokestatic    #106 <Method Locale Locale.getDefault()>
	//   29   57:invokevirtual   #110 <Method String String.toUpperCase(Locale)>
	//   30   60:areturn         
			}
		}
		return "";
	//   31   61:ldc1            #63  <String "">
	//   32   63:areturn         
	}

	protected String getRawPhoneNumber()
	{
		TelephonyManager telephonymanager = telephonyManager;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TelephonyManager telephonyManager>
	//    2    4:astore_1        
		if(telephonymanager != null && canReadPhoneState)
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
	//*   5    9:aload_0         
	//*   6   10:getfield        #17  <Field boolean canReadPhoneState>
	//*   7   13:ifne            19
	//*   8   16:goto            28
			return normalizeNumber(telephonymanager.getLine1Number());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #119 <Method String TelephonyManager.getLine1Number()>
	//   12   24:invokespecial   #90  <Method String normalizeNumber(String)>
	//   13   27:areturn         
		else
			return "";
	//   14   28:ldc1            #63  <String "">
	//   15   30:areturn         
	}

	private final boolean canReadPhoneState;
	private final TelephonyManager telephonyManager;
}
