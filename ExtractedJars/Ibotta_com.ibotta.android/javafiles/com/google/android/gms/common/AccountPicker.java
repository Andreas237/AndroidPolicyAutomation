// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class AccountPicker
{

	private AccountPicker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
	//    2    4:return          
	}

	public static Intent newChooseAccountIntent(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle)
	{
		return newChooseAccountIntent(account, arraylist, as, flag, s, s1, as1, bundle, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iconst_0        
	//    9   13:invokestatic    #66  <Method Intent newChooseAccountIntent(Account, ArrayList, String[], boolean, String, String, String[], Bundle, boolean)>
	//   10   16:areturn         
	}

	public static Intent newChooseAccountIntent(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
			boolean flag1)
	{
		return newChooseAccountIntent(account, arraylist, as, flag, s, s1, as1, bundle, flag1, 0, 0);
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
	//   11   16:invokestatic    #71  <Method Intent newChooseAccountIntent(Account, ArrayList, String[], boolean, String, String, String[], Bundle, boolean, int, int)>
	//   12   19:areturn         
	}

	public static Intent newChooseAccountIntent(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
			boolean flag1, int i, int j)
	{
		return newChooseAccountIntent(account, arraylist, as, flag, s, s1, as1, bundle, flag1, i, j, ((String) (null)), false);
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
	//   13   20:invokestatic    #75  <Method Intent newChooseAccountIntent(Account, ArrayList, String[], boolean, String, String, String[], Bundle, boolean, int, int, String, boolean)>
	//   14   23:areturn         
	}

	public static Intent newChooseAccountIntent(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
			boolean flag1, int i, int j, String s2, boolean flag2)
	{
		Intent intent = new Intent();
	//    0    0:new             #78  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void Intent()>
	//    3    7:astore          15
		if(!flag2)
	//*   4    9:iload           12
	//*   5   11:ifne            35
		{
			boolean flag3;
			if(s2 == null)
	//*   6   14:aload           11
	//*   7   16:ifnonnull       25
				flag3 = true;
	//    8   19:iconst_1        
	//    9   20:istore          13
			else
	//*  10   22:goto            28
				flag3 = false;
	//   11   25:iconst_0        
	//   12   26:istore          13
			Preconditions.checkArgument(flag3, "We only support hostedDomain filter for account chip styled account picker");
	//   13   28:iload           13
	//   14   30:ldc1            #81  <String "We only support hostedDomain filter for account chip styled account picker">
	//   15   32:invokestatic    #87  <Method void Preconditions.checkArgument(boolean, Object)>
		}
		String s3;
		if(flag2)
	//*  16   35:iload           12
	//*  17   37:ifeq            47
			s3 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE";
	//   18   40:ldc1            #89  <String "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE">
	//   19   42:astore          14
		else
	//*  20   44:goto            51
			s3 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT";
	//   21   47:ldc1            #91  <String "com.google.android.gms.common.account.CHOOSE_ACCOUNT">
	//   22   49:astore          14
		intent.setAction(s3);
	//   23   51:aload           15
	//   24   53:aload           14
	//   25   55:invokevirtual   #95  <Method Intent Intent.setAction(String)>
	//   26   58:pop             
		intent.setPackage("com.google.android.gms");
	//   27   59:aload           15
	//   28   61:ldc1            #97  <String "com.google.android.gms">
	//   29   63:invokevirtual   #100 <Method Intent Intent.setPackage(String)>
	//   30   66:pop             
		intent.putExtra("allowableAccounts", ((java.io.Serializable) (arraylist)));
	//   31   67:aload           15
	//   32   69:ldc1            #24  <String "allowableAccounts">
	//   33   71:aload_1         
	//   34   72:invokevirtual   #104 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   35   75:pop             
		intent.putExtra("allowableAccountTypes", as);
	//   36   76:aload           15
	//   37   78:ldc1            #27  <String "allowableAccountTypes">
	//   38   80:aload_2         
	//   39   81:invokevirtual   #107 <Method Intent Intent.putExtra(String, String[])>
	//   40   84:pop             
		intent.putExtra("addAccountOptions", bundle);
	//   41   85:aload           15
	//   42   87:ldc1            #18  <String "addAccountOptions">
	//   43   89:aload           7
	//   44   91:invokevirtual   #110 <Method Intent Intent.putExtra(String, Bundle)>
	//   45   94:pop             
		intent.putExtra("selectedAccount", ((android.os.Parcelable) (account)));
	//   46   95:aload           15
	//   47   97:ldc1            #51  <String "selectedAccount">
	//   48   99:aload_0         
	//   49  100:invokevirtual   #113 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   50  103:pop             
		intent.putExtra("alwaysPromptForAccount", flag);
	//   51  104:aload           15
	//   52  106:ldc1            #30  <String "alwaysPromptForAccount">
	//   53  108:iload_3         
	//   54  109:invokevirtual   #116 <Method Intent Intent.putExtra(String, boolean)>
	//   55  112:pop             
		intent.putExtra("descriptionTextOverride", s);
	//   56  113:aload           15
	//   57  115:ldc1            #33  <String "descriptionTextOverride">
	//   58  117:aload           4
	//   59  119:invokevirtual   #119 <Method Intent Intent.putExtra(String, String)>
	//   60  122:pop             
		intent.putExtra("authTokenType", s1);
	//   61  123:aload           15
	//   62  125:ldc1            #15  <String "authTokenType">
	//   63  127:aload           5
	//   64  129:invokevirtual   #119 <Method Intent Intent.putExtra(String, String)>
	//   65  132:pop             
		intent.putExtra("addAccountRequiredFeatures", as1);
	//   66  133:aload           15
	//   67  135:ldc1            #21  <String "addAccountRequiredFeatures">
	//   68  137:aload           6
	//   69  139:invokevirtual   #107 <Method Intent Intent.putExtra(String, String[])>
	//   70  142:pop             
		intent.putExtra("setGmsCoreAccount", flag1);
	//   71  143:aload           15
	//   72  145:ldc1            #54  <String "setGmsCoreAccount">
	//   73  147:iload           8
	//   74  149:invokevirtual   #116 <Method Intent Intent.putExtra(String, boolean)>
	//   75  152:pop             
		intent.putExtra("overrideTheme", i);
	//   76  153:aload           15
	//   77  155:ldc1            #45  <String "overrideTheme">
	//   78  157:iload           9
	//   79  159:invokevirtual   #122 <Method Intent Intent.putExtra(String, int)>
	//   80  162:pop             
		intent.putExtra("overrideCustomTheme", j);
	//   81  163:aload           15
	//   82  165:ldc1            #42  <String "overrideCustomTheme">
	//   83  167:iload           10
	//   84  169:invokevirtual   #122 <Method Intent Intent.putExtra(String, int)>
	//   85  172:pop             
		intent.putExtra("hostedDomainFilter", s2);
	//   86  173:aload           15
	//   87  175:ldc1            #36  <String "hostedDomainFilter">
	//   88  177:aload           11
	//   89  179:invokevirtual   #119 <Method Intent Intent.putExtra(String, String)>
	//   90  182:pop             
		return intent;
	//   91  183:aload           15
	//   92  185:areturn         
	}

	public static final int CUSTOM_THEME_ACCOUNT_CHIPS = 2;
	public static final int CUSTOM_THEME_GAMES = 1;
	public static final int CUSTOM_THEME_NONE = 0;
	public static final String EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING = "authTokenType";
	public static final String EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE = "addAccountOptions";
	public static final String EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY = "addAccountRequiredFeatures";
	public static final String EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST = "allowableAccounts";
	public static final String EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY = "allowableAccountTypes";
	public static final String EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT = "alwaysPromptForAccount";
	public static final String EXTRA_DESCRIPTION_TEXT_OVERRIDE = "descriptionTextOverride";
	public static final String EXTRA_HOSTED_DOMAIN_FILTER = "hostedDomainFilter";
	public static final String EXTRA_IS_ACCOUNT_CHIPS_ACCOUNT_PICKER = "pickedFromAccountChips";
	public static final String EXTRA_OVERRIDE_CUSTOM_THEME = "overrideCustomTheme";
	public static final String EXTRA_OVERRIDE_THEME = "overrideTheme";
	public static final String EXTRA_REAL_CLIENT_PACKAGE = "realClientPackage";
	public static final String EXTRA_SELECTED_ACCOUNT = "selectedAccount";
	public static final String EXTRA_SET_GMS_CORE_ACCOUNT = "setGmsCoreAccount";
	public static final int THEME_DEFAULT = 0;
	public static final int THEME_LIGHT = 1;
}
