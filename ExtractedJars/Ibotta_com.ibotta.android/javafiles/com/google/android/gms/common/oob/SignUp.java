// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.oob;

import android.accounts.*;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;

public class SignUp
{

	private SignUp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:return          
	}

	public static AccountManagerFuture checkSignUpState(Context context, String s, String as[], AccountManagerCallback accountmanagercallback, Handler handler)
	{
		Preconditions.checkArgument(TextUtils.isEmpty(((CharSequence) (s))) ^ true, "The accountName is required");
	//    0    0:aload_1         
	//    1    1:invokestatic    #61  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ldc1            #63  <String "The accountName is required">
	//    5    8:invokestatic    #69  <Method void Preconditions.checkArgument(boolean, Object)>
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore          5
		boolean flag1;
		if(as != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          24
			flag1 = true;
	//   10   18:iconst_1        
	//   11   19:istore          8
		else
	//*  12   21:goto            27
			flag1 = false;
	//   13   24:iconst_0        
	//   14   25:istore          8
		Preconditions.checkArgument(flag1, "The requiredFeatures parameter is required");
	//   15   27:iload           8
	//   16   29:ldc1            #71  <String "The requiredFeatures parameter is required">
	//   17   31:invokestatic    #69  <Method void Preconditions.checkArgument(boolean, Object)>
		context = ((Context) (AccountManager.get(context)));
	//   18   34:aload_0         
	//   19   35:invokestatic    #77  <Method AccountManager AccountManager.get(Context)>
	//   20   38:astore_0        
		Account aaccount[] = ((AccountManager) (context)).getAccountsByType("com.google");
	//   21   39:aload_0         
	//   22   40:ldc1            #79  <String "com.google">
	//   23   42:invokevirtual   #83  <Method Account[] AccountManager.getAccountsByType(String)>
	//   24   45:astore          9
		int j = aaccount.length;
	//   25   47:aload           9
	//   26   49:arraylength     
	//   27   50:istore          7
		boolean flag = false;
	//   28   52:iconst_0        
	//   29   53:istore          6
		for(; i < j; i++)
	//*  30   55:iload           5
	//*  31   57:iload           7
	//*  32   59:icmpge          89
			if(s.equals(((Object) (aaccount[i].name))))
	//*  33   62:aload_1         
	//*  34   63:aload           9
	//*  35   65:iload           5
	//*  36   67:aaload          
	//*  37   68:getfield        #88  <Field String Account.name>
	//*  38   71:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*  39   74:ifeq            80
				flag = true;
	//   40   77:iconst_1        
	//   41   78:istore          6

	//   42   80:iload           5
	//   43   82:iconst_1        
	//   44   83:iadd            
	//   45   84:istore          5
	//*  46   86:goto            55
		if(flag)
	//*  47   89:iload           6
	//*  48   91:ifeq            113
			return ((AccountManager) (context)).hasFeatures(new Account(s, "com.google"), as, accountmanagercallback, handler);
	//   49   94:aload_0         
	//   50   95:new             #85  <Class Account>
	//   51   98:dup             
	//   52   99:aload_1         
	//   53  100:ldc1            #79  <String "com.google">
	//   54  102:invokespecial   #97  <Method void Account(String, String)>
	//   55  105:aload_2         
	//   56  106:aload_3         
	//   57  107:aload           4
	//   58  109:invokevirtual   #101 <Method AccountManagerFuture AccountManager.hasFeatures(Account, String[], AccountManagerCallback, Handler)>
	//   59  112:areturn         
		else
			throw new IllegalStateException("Given account does not exist on the device");
	//   60  113:new             #103 <Class IllegalStateException>
	//   61  116:dup             
	//   62  117:ldc1            #105 <String "Given account does not exist on the device">
	//   63  119:invokespecial   #108 <Method void IllegalStateException(String)>
	//   64  122:athrow          
	}

	public static boolean isSignedUpBlocking(Context context, String s, String as[])
		throws AuthenticatorException, OperationCanceledException, IOException
	{
		return ((Boolean)checkSignUpState(context, s, as, ((AccountManagerCallback) (null)), ((Handler) (null))).getResult()).booleanValue();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokestatic    #120 <Method AccountManagerFuture checkSignUpState(Context, String, String[], AccountManagerCallback, Handler)>
	//    6    8:invokeinterface #126 <Method Object AccountManagerFuture.getResult()>
	//    7   13:checkcast       #128 <Class Boolean>
	//    8   16:invokevirtual   #132 <Method boolean Boolean.booleanValue()>
	//    9   19:ireturn         
	}

	public static Intent newSignUpIntent(String s)
	{
		return newSignUpIntent(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #138 <Method Intent newSignUpIntent(String, String)>
	//    3    5:areturn         
	}

	public static Intent newSignUpIntent(String s, String s1)
	{
		Intent intent = new Intent();
	//    0    0:new             #140 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void Intent()>
	//    3    7:astore_2        
		intent.setPackage("com.google.android.gms");
	//    4    8:aload_2         
	//    5    9:ldc1            #143 <String "com.google.android.gms">
	//    6   11:invokevirtual   #146 <Method Intent Intent.setPackage(String)>
	//    7   14:pop             
		intent.setAction("com.google.android.gms.common.oob.OOB_SIGN_UP");
	//    8   15:aload_2         
	//    9   16:ldc1            #9   <String "com.google.android.gms.common.oob.OOB_SIGN_UP">
	//   10   18:invokevirtual   #149 <Method Intent Intent.setAction(String)>
	//   11   21:pop             
		intent.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", s);
	//   12   22:aload_2         
	//   13   23:ldc1            #24  <String "com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME">
	//   14   25:aload_0         
	//   15   26:invokevirtual   #152 <Method Intent Intent.putExtra(String, String)>
	//   16   29:pop             
		intent.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", s1);
	//   17   30:aload_2         
	//   18   31:ldc1            #27  <String "com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME">
	//   19   33:aload_1         
	//   20   34:invokevirtual   #152 <Method Intent Intent.putExtra(String, String)>
	//   21   37:pop             
		return intent;
	//   22   38:aload_2         
	//   23   39:areturn         
	}

	public static Intent newSignUpIntent(String s, String s1, String s2, String s3)
	{
		Intent intent = new Intent();
	//    0    0:new             #140 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void Intent()>
	//    3    7:astore          4
		intent.setPackage("com.google.android.gms");
	//    4    9:aload           4
	//    5   11:ldc1            #143 <String "com.google.android.gms">
	//    6   13:invokevirtual   #146 <Method Intent Intent.setPackage(String)>
	//    7   16:pop             
		intent.setAction("com.google.android.gms.common.oob.OOB_SIGN_UP");
	//    8   17:aload           4
	//    9   19:ldc1            #9   <String "com.google.android.gms.common.oob.OOB_SIGN_UP">
	//   10   21:invokevirtual   #149 <Method Intent Intent.setAction(String)>
	//   11   24:pop             
		intent.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", s);
	//   12   25:aload           4
	//   13   27:ldc1            #24  <String "com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME">
	//   14   29:aload_0         
	//   15   30:invokevirtual   #152 <Method Intent Intent.putExtra(String, String)>
	//   16   33:pop             
		intent.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", s1);
	//   17   34:aload           4
	//   18   36:ldc1            #27  <String "com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME">
	//   19   38:aload_1         
	//   20   39:invokevirtual   #152 <Method Intent Intent.putExtra(String, String)>
	//   21   42:pop             
		intent.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE", s2);
	//   22   43:aload           4
	//   23   45:ldc1            #18  <String "com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE">
	//   24   47:aload_2         
	//   25   48:invokevirtual   #152 <Method Intent Intent.putExtra(String, String)>
	//   26   51:pop             
		intent.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT", s3);
	//   27   52:aload           4
	//   28   54:ldc1            #21  <String "com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT">
	//   29   56:aload_3         
	//   30   57:invokevirtual   #152 <Method Intent Intent.putExtra(String, String)>
	//   31   60:pop             
		return intent;
	//   32   61:aload           4
	//   33   63:areturn         
	}

	public static final String ACTION_OOB_SIGN_UP = "com.google.android.gms.common.oob.OOB_SIGN_UP";
	public static final String EXTRAS_CALLING_APP_DESCRIPTION = "com.google.android.gms.common.oob.EXTRAS_APP_DESCRIPTION";
	public static final String EXTRAS_CLIENT_CALLING_APP_PACKAGE = "com.google.android.gms.common.oob.EXTRAS_CLIENT_CALLING_APP_PACKAGE";
	public static final String EXTRAS_PROMO_APP_PACKAGE = "com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE";
	public static final String EXTRAS_PROMO_APP_TEXT = "com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT";
	public static final String EXTRA_ACCOUNT_NAME = "com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME";
	public static final String EXTRA_BACK_BUTTON_NAME = "com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME";
	public static final String EXTRA_GPSRC = "com.google.android.gms.plus.GPSRC";
	public static final String EXTRA_OVERRIDE_THEME = "com.google.android.gms.plus.OVERRIDE_THEME";
	public static final String GOOGLE_PLUS_REQUIRED_FEATURES[];
	public static final int THEME_DEFAULT = 0;
	public static final int THEME_FULL = 1;
	public static final int THEME_SETUP_WIZARD = 2;

	static 
	{
		GOOGLE_PLUS_REQUIRED_FEATURES = BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES;
	//    0    0:getstatic       #48  <Field String[] BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES>
	//    1    3:putstatic       #49  <Field String[] GOOGLE_PLUS_REQUIRED_FEATURES>
	//*   2    6:return          
	}
}
