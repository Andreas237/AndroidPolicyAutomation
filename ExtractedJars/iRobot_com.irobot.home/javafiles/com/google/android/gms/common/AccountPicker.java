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
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Intent newChooseAccountIntent(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle)
	{
		Intent intent = new Intent();
	//    0    0:new             #13  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Intent()>
	//    3    7:astore          8
		Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
	//    4    9:iconst_1        
	//    5   10:ldc1            #16  <String "We only support hostedDomain filter for account chip styled account picker">
	//    6   12:invokestatic    #22  <Method void Preconditions.checkArgument(boolean, Object)>
		intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
	//    7   15:aload           8
	//    8   17:ldc1            #24  <String "com.google.android.gms.common.account.CHOOSE_ACCOUNT">
	//    9   19:invokevirtual   #28  <Method Intent Intent.setAction(String)>
	//   10   22:pop             
		intent.setPackage("com.google.android.gms");
	//   11   23:aload           8
	//   12   25:ldc1            #30  <String "com.google.android.gms">
	//   13   27:invokevirtual   #33  <Method Intent Intent.setPackage(String)>
	//   14   30:pop             
		intent.putExtra("allowableAccounts", ((java.io.Serializable) (arraylist)));
	//   15   31:aload           8
	//   16   33:ldc1            #35  <String "allowableAccounts">
	//   17   35:aload_1         
	//   18   36:invokevirtual   #39  <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   19   39:pop             
		intent.putExtra("allowableAccountTypes", as);
	//   20   40:aload           8
	//   21   42:ldc1            #41  <String "allowableAccountTypes">
	//   22   44:aload_2         
	//   23   45:invokevirtual   #44  <Method Intent Intent.putExtra(String, String[])>
	//   24   48:pop             
		intent.putExtra("addAccountOptions", bundle);
	//   25   49:aload           8
	//   26   51:ldc1            #46  <String "addAccountOptions">
	//   27   53:aload           7
	//   28   55:invokevirtual   #49  <Method Intent Intent.putExtra(String, Bundle)>
	//   29   58:pop             
		intent.putExtra("selectedAccount", ((android.os.Parcelable) (account)));
	//   30   59:aload           8
	//   31   61:ldc1            #51  <String "selectedAccount">
	//   32   63:aload_0         
	//   33   64:invokevirtual   #54  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   34   67:pop             
		intent.putExtra("alwaysPromptForAccount", flag);
	//   35   68:aload           8
	//   36   70:ldc1            #56  <String "alwaysPromptForAccount">
	//   37   72:iload_3         
	//   38   73:invokevirtual   #59  <Method Intent Intent.putExtra(String, boolean)>
	//   39   76:pop             
		intent.putExtra("descriptionTextOverride", s);
	//   40   77:aload           8
	//   41   79:ldc1            #61  <String "descriptionTextOverride">
	//   42   81:aload           4
	//   43   83:invokevirtual   #64  <Method Intent Intent.putExtra(String, String)>
	//   44   86:pop             
		intent.putExtra("authTokenType", s1);
	//   45   87:aload           8
	//   46   89:ldc1            #66  <String "authTokenType">
	//   47   91:aload           5
	//   48   93:invokevirtual   #64  <Method Intent Intent.putExtra(String, String)>
	//   49   96:pop             
		intent.putExtra("addAccountRequiredFeatures", as1);
	//   50   97:aload           8
	//   51   99:ldc1            #68  <String "addAccountRequiredFeatures">
	//   52  101:aload           6
	//   53  103:invokevirtual   #44  <Method Intent Intent.putExtra(String, String[])>
	//   54  106:pop             
		intent.putExtra("setGmsCoreAccount", false);
	//   55  107:aload           8
	//   56  109:ldc1            #70  <String "setGmsCoreAccount">
	//   57  111:iconst_0        
	//   58  112:invokevirtual   #59  <Method Intent Intent.putExtra(String, boolean)>
	//   59  115:pop             
		intent.putExtra("overrideTheme", 0);
	//   60  116:aload           8
	//   61  118:ldc1            #72  <String "overrideTheme">
	//   62  120:iconst_0        
	//   63  121:invokevirtual   #75  <Method Intent Intent.putExtra(String, int)>
	//   64  124:pop             
		intent.putExtra("overrideCustomTheme", 0);
	//   65  125:aload           8
	//   66  127:ldc1            #77  <String "overrideCustomTheme">
	//   67  129:iconst_0        
	//   68  130:invokevirtual   #75  <Method Intent Intent.putExtra(String, int)>
	//   69  133:pop             
		intent.putExtra("hostedDomainFilter", ((String) (null)));
	//   70  134:aload           8
	//   71  136:ldc1            #79  <String "hostedDomainFilter">
	//   72  138:aconst_null     
	//   73  139:invokevirtual   #64  <Method Intent Intent.putExtra(String, String)>
	//   74  142:pop             
		return intent;
	//   75  143:aload           8
	//   76  145:areturn         
	}
}
