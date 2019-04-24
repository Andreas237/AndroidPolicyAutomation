// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzac;
import java.util.ArrayList;

public final class AccountPicker
{

	private AccountPicker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Intent newChooseAccountIntent(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle)
	{
		return zza(account, arraylist, as, flag, s, s1, as1, bundle, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iconst_0        
	//    9   13:invokestatic    #15  <Method Intent zza(Account, ArrayList, String[], boolean, String, String, String[], Bundle, boolean)>
	//   10   16:areturn         
	}

	public static Intent zza(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
			boolean flag1)
	{
		return zza(account, arraylist, as, flag, s, s1, as1, bundle, flag1, 0, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iload           8
	//    9   14:iconst_0        
	//   10   15:iconst_0        
	//   11   16:invokestatic    #20  <Method Intent zza(Account, ArrayList, String[], boolean, String, String, String[], Bundle, boolean, int, int)>
	//   12   19:areturn         
	}

	public static Intent zza(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
			boolean flag1, int i, int j)
	{
		return zza(account, arraylist, as, flag, s, s1, as1, bundle, flag1, i, j, ((String) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iload           8
	//    9   14:iload           9
	//   10   16:iload           10
	//   11   18:aconst_null     
	//   12   19:iconst_0        
	//   13   20:invokestatic    #24  <Method Intent zza(Account, ArrayList, String[], boolean, String, String, String[], Bundle, boolean, int, int, String, boolean)>
	//   14   23:areturn         
	}

	public static Intent zza(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
			boolean flag1, int i, int j, String s2, boolean flag2)
	{
		Intent intent = new Intent();
	//    0    0:new             #27  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void Intent()>
	//    3    7:astore          15
		String s3;
		if(!flag2)
	//*   4    9:iload           12
	//*   5   11:ifne            29
		{
			boolean flag3;
			if(s2 == null)
	//*   6   14:aload           11
	//*   7   16:ifnonnull       173
				flag3 = true;
	//    8   19:iconst_1        
	//    9   20:istore          13
			else
	//*  10   22:iload           13
	//*  11   24:ldc1            #30  <String "We only support hostedDomain filter for account chip styled account picker">
	//*  12   26:invokestatic    #36  <Method void zzac.zzb(boolean, Object)>
	//*  13   29:iload           12
	//*  14   31:ifeq            179
	//*  15   34:ldc1            #38  <String "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE">
	//*  16   36:astore          14
	//*  17   38:aload           15
	//*  18   40:aload           14
	//*  19   42:invokevirtual   #42  <Method Intent Intent.setAction(String)>
	//*  20   45:pop             
	//*  21   46:aload           15
	//*  22   48:ldc1            #44  <String "com.google.android.gms">
	//*  23   50:invokevirtual   #47  <Method Intent Intent.setPackage(String)>
	//*  24   53:pop             
	//*  25   54:aload           15
	//*  26   56:ldc1            #49  <String "allowableAccounts">
	//*  27   58:aload_1         
	//*  28   59:invokevirtual   #53  <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//*  29   62:pop             
	//*  30   63:aload           15
	//*  31   65:ldc1            #55  <String "allowableAccountTypes">
	//*  32   67:aload_2         
	//*  33   68:invokevirtual   #58  <Method Intent Intent.putExtra(String, String[])>
	//*  34   71:pop             
	//*  35   72:aload           15
	//*  36   74:ldc1            #60  <String "addAccountOptions">
	//*  37   76:aload           7
	//*  38   78:invokevirtual   #63  <Method Intent Intent.putExtra(String, Bundle)>
	//*  39   81:pop             
	//*  40   82:aload           15
	//*  41   84:ldc1            #65  <String "selectedAccount">
	//*  42   86:aload_0         
	//*  43   87:invokevirtual   #68  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//*  44   90:pop             
	//*  45   91:aload           15
	//*  46   93:ldc1            #70  <String "alwaysPromptForAccount">
	//*  47   95:iload_3         
	//*  48   96:invokevirtual   #73  <Method Intent Intent.putExtra(String, boolean)>
	//*  49   99:pop             
	//*  50  100:aload           15
	//*  51  102:ldc1            #75  <String "descriptionTextOverride">
	//*  52  104:aload           4
	//*  53  106:invokevirtual   #78  <Method Intent Intent.putExtra(String, String)>
	//*  54  109:pop             
	//*  55  110:aload           15
	//*  56  112:ldc1            #80  <String "authTokenType">
	//*  57  114:aload           5
	//*  58  116:invokevirtual   #78  <Method Intent Intent.putExtra(String, String)>
	//*  59  119:pop             
	//*  60  120:aload           15
	//*  61  122:ldc1            #82  <String "addAccountRequiredFeatures">
	//*  62  124:aload           6
	//*  63  126:invokevirtual   #58  <Method Intent Intent.putExtra(String, String[])>
	//*  64  129:pop             
	//*  65  130:aload           15
	//*  66  132:ldc1            #84  <String "setGmsCoreAccount">
	//*  67  134:iload           8
	//*  68  136:invokevirtual   #73  <Method Intent Intent.putExtra(String, boolean)>
	//*  69  139:pop             
	//*  70  140:aload           15
	//*  71  142:ldc1            #86  <String "overrideTheme">
	//*  72  144:iload           9
	//*  73  146:invokevirtual   #89  <Method Intent Intent.putExtra(String, int)>
	//*  74  149:pop             
	//*  75  150:aload           15
	//*  76  152:ldc1            #91  <String "overrideCustomTheme">
	//*  77  154:iload           10
	//*  78  156:invokevirtual   #89  <Method Intent Intent.putExtra(String, int)>
	//*  79  159:pop             
	//*  80  160:aload           15
	//*  81  162:ldc1            #93  <String "hostedDomainFilter">
	//*  82  164:aload           11
	//*  83  166:invokevirtual   #78  <Method Intent Intent.putExtra(String, String)>
	//*  84  169:pop             
	//*  85  170:aload           15
	//*  86  172:areturn         
				flag3 = false;
	//   87  173:iconst_0        
	//   88  174:istore          13
			zzac.zzb(flag3, "We only support hostedDomain filter for account chip styled account picker");
		}
		if(flag2)
			s3 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE";
		else
	//*  89  176:goto            22
			s3 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT";
	//   90  179:ldc1            #95  <String "com.google.android.gms.common.account.CHOOSE_ACCOUNT">
	//   91  181:astore          14
		intent.setAction(s3);
		intent.setPackage("com.google.android.gms");
		intent.putExtra("allowableAccounts", ((java.io.Serializable) (arraylist)));
		intent.putExtra("allowableAccountTypes", as);
		intent.putExtra("addAccountOptions", bundle);
		intent.putExtra("selectedAccount", ((android.os.Parcelable) (account)));
		intent.putExtra("alwaysPromptForAccount", flag);
		intent.putExtra("descriptionTextOverride", s);
		intent.putExtra("authTokenType", s1);
		intent.putExtra("addAccountRequiredFeatures", as1);
		intent.putExtra("setGmsCoreAccount", flag1);
		intent.putExtra("overrideTheme", i);
		intent.putExtra("overrideCustomTheme", j);
		intent.putExtra("hostedDomainFilter", s2);
		return intent;
	//*  92  183:goto            38
	}
}
