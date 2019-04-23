// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.auth.api.signin.internal.zzp;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInAccount, GoogleSignInOptionsExtension, GoogleSignInClient, GoogleSignInOptions, 
//			GoogleSignInResult

public final class GoogleSignIn
{

	private GoogleSignIn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static GoogleSignInAccount getAccountForExtension(Context context, GoogleSignInOptionsExtension googlesigninoptionsextension)
	{
		Preconditions.checkNotNull(((Object) (context)), "please provide a valid Context object");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "please provide a valid Context object">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (googlesigninoptionsextension)), "please provide valid GoogleSignInOptionsExtension");
	//    4    7:aload_1         
	//    5    8:ldc1            #22  <String "please provide valid GoogleSignInOptionsExtension">
	//    6   10:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		GoogleSignInAccount googlesigninaccount = getLastSignedInAccount(context);
	//    8   14:aload_0         
	//    9   15:invokestatic    #26  <Method GoogleSignInAccount getLastSignedInAccount(Context)>
	//   10   18:astore_2        
		context = ((Context) (googlesigninaccount));
	//   11   19:aload_2         
	//   12   20:astore_0        
		if(googlesigninaccount == null)
	//*  13   21:aload_2         
	//*  14   22:ifnonnull       29
			context = ((Context) (GoogleSignInAccount.createDefault()));
	//   15   25:invokestatic    #32  <Method GoogleSignInAccount GoogleSignInAccount.createDefault()>
	//   16   28:astore_0        
		return ((GoogleSignInAccount) (context)).requestExtraScopes(zzc(googlesigninoptionsextension.getImpliedScopes()));
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:invokeinterface #38  <Method List GoogleSignInOptionsExtension.getImpliedScopes()>
	//   20   36:invokestatic    #42  <Method Scope[] zzc(List)>
	//   21   39:invokevirtual   #46  <Method GoogleSignInAccount GoogleSignInAccount.requestExtraScopes(Scope[])>
	//   22   42:areturn         
	}

	public static transient GoogleSignInAccount getAccountForScopes(Context context, Scope scope, Scope ascope[])
	{
		Preconditions.checkNotNull(((Object) (context)), "please provide a valid Context object");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "please provide a valid Context object">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (scope)), "please provide at least one valid scope");
	//    4    7:aload_1         
	//    5    8:ldc1            #52  <String "please provide at least one valid scope">
	//    6   10:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		GoogleSignInAccount googlesigninaccount = getLastSignedInAccount(context);
	//    8   14:aload_0         
	//    9   15:invokestatic    #26  <Method GoogleSignInAccount getLastSignedInAccount(Context)>
	//   10   18:astore_3        
		context = ((Context) (googlesigninaccount));
	//   11   19:aload_3         
	//   12   20:astore_0        
		if(googlesigninaccount == null)
	//*  13   21:aload_3         
	//*  14   22:ifnonnull       29
			context = ((Context) (GoogleSignInAccount.createDefault()));
	//   15   25:invokestatic    #32  <Method GoogleSignInAccount GoogleSignInAccount.createDefault()>
	//   16   28:astore_0        
		((GoogleSignInAccount) (context)).requestExtraScopes(new Scope[] {
			scope
		});
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:anewarray       Scope[]
	//   20   34:dup             
	//   21   35:iconst_0        
	//   22   36:aload_1         
	//   23   37:aastore         
	//   24   38:invokevirtual   #46  <Method GoogleSignInAccount GoogleSignInAccount.requestExtraScopes(Scope[])>
	//   25   41:pop             
		((GoogleSignInAccount) (context)).requestExtraScopes(ascope);
	//   26   42:aload_0         
	//   27   43:aload_2         
	//   28   44:invokevirtual   #46  <Method GoogleSignInAccount GoogleSignInAccount.requestExtraScopes(Scope[])>
	//   29   47:pop             
		return ((GoogleSignInAccount) (context));
	//   30   48:aload_0         
	//   31   49:areturn         
	}

	public static GoogleSignInClient getClient(Activity activity, GoogleSignInOptions googlesigninoptions)
	{
		return new GoogleSignInClient(activity, (GoogleSignInOptions)Preconditions.checkNotNull(((Object) (googlesigninoptions))));
	//    0    0:new             #58  <Class GoogleSignInClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #61  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #63  <Class GoogleSignInOptions>
	//    6   12:invokespecial   #66  <Method void GoogleSignInClient(Activity, GoogleSignInOptions)>
	//    7   15:areturn         
	}

	public static GoogleSignInClient getClient(Context context, GoogleSignInOptions googlesigninoptions)
	{
		return new GoogleSignInClient(context, (GoogleSignInOptions)Preconditions.checkNotNull(((Object) (googlesigninoptions))));
	//    0    0:new             #58  <Class GoogleSignInClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #61  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #63  <Class GoogleSignInOptions>
	//    6   12:invokespecial   #70  <Method void GoogleSignInClient(Context, GoogleSignInOptions)>
	//    7   15:areturn         
	}

	public static GoogleSignInAccount getLastSignedInAccount(Context context)
	{
		return zzp.zzd(context).zzh();
	//    0    0:aload_0         
	//    1    1:invokestatic    #77  <Method zzp zzp.zzd(Context)>
	//    2    4:invokevirtual   #80  <Method GoogleSignInAccount zzp.zzh()>
	//    3    7:areturn         
	}

	public static Task getSignedInAccountFromIntent(Intent intent)
	{
		intent = ((Intent) (zzh.getSignInResultFromIntent(intent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #88  <Method GoogleSignInResult zzh.getSignInResultFromIntent(Intent)>
	//    2    4:astore_0        
		if(intent == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       19
			return Tasks.forException(((Exception) (ApiExceptionUtil.fromStatus(Status.RESULT_INTERNAL_ERROR))));
	//    5    9:getstatic       #94  <Field Status Status.RESULT_INTERNAL_ERROR>
	//    6   12:invokestatic    #100 <Method com.google.android.gms.common.api.ApiException ApiExceptionUtil.fromStatus(Status)>
	//    7   15:invokestatic    #106 <Method Task Tasks.forException(Exception)>
	//    8   18:areturn         
		if(((GoogleSignInResult) (intent)).getStatus().isSuccess() && ((GoogleSignInResult) (intent)).getSignInAccount() != null)
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #112 <Method Status GoogleSignInResult.getStatus()>
	//*  11   23:invokevirtual   #116 <Method boolean Status.isSuccess()>
	//*  12   26:ifeq            47
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #119 <Method GoogleSignInAccount GoogleSignInResult.getSignInAccount()>
	//*  15   33:ifnonnull       39
	//*  16   36:goto            47
			return Tasks.forResult(((Object) (((GoogleSignInResult) (intent)).getSignInAccount())));
	//   17   39:aload_0         
	//   18   40:invokevirtual   #119 <Method GoogleSignInAccount GoogleSignInResult.getSignInAccount()>
	//   19   43:invokestatic    #123 <Method Task Tasks.forResult(Object)>
	//   20   46:areturn         
		else
			return Tasks.forException(((Exception) (ApiExceptionUtil.fromStatus(((GoogleSignInResult) (intent)).getStatus()))));
	//   21   47:aload_0         
	//   22   48:invokevirtual   #112 <Method Status GoogleSignInResult.getStatus()>
	//   23   51:invokestatic    #100 <Method com.google.android.gms.common.api.ApiException ApiExceptionUtil.fromStatus(Status)>
	//   24   54:invokestatic    #106 <Method Task Tasks.forException(Exception)>
	//   25   57:areturn         
	}

	public static boolean hasPermissions(GoogleSignInAccount googlesigninaccount, GoogleSignInOptionsExtension googlesigninoptionsextension)
	{
		Preconditions.checkNotNull(((Object) (googlesigninoptionsextension)), "Please provide a non-null GoogleSignInOptionsExtension");
	//    0    0:aload_1         
	//    1    1:ldc1            #129 <String "Please provide a non-null GoogleSignInOptionsExtension">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		return hasPermissions(googlesigninaccount, zzc(googlesigninoptionsextension.getImpliedScopes()));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokeinterface #38  <Method List GoogleSignInOptionsExtension.getImpliedScopes()>
	//    7   14:invokestatic    #42  <Method Scope[] zzc(List)>
	//    8   17:invokestatic    #132 <Method boolean hasPermissions(GoogleSignInAccount, Scope[])>
	//    9   20:ireturn         
	}

	public static transient boolean hasPermissions(GoogleSignInAccount googlesigninaccount, Scope ascope[])
	{
		if(googlesigninaccount == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		} else
		{
			HashSet hashset = new HashSet();
	//    4    6:new             #134 <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #135 <Method void HashSet()>
	//    7   13:astore_2        
			Collections.addAll(((java.util.Collection) (hashset)), ((Object []) (ascope)));
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokestatic    #141 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   11   19:pop             
			return googlesigninaccount.getGrantedScopes().containsAll(((java.util.Collection) (hashset)));
	//   12   20:aload_0         
	//   13   21:invokevirtual   #145 <Method Set GoogleSignInAccount.getGrantedScopes()>
	//   14   24:aload_2         
	//   15   25:invokeinterface #151 <Method boolean Set.containsAll(java.util.Collection)>
	//   16   30:ireturn         
		}
	}

	public static void requestPermissions(Activity activity, int i, GoogleSignInAccount googlesigninaccount, GoogleSignInOptionsExtension googlesigninoptionsextension)
	{
		Preconditions.checkNotNull(((Object) (activity)), "Please provide a non-null Activity");
	//    0    0:aload_0         
	//    1    1:ldc1            #155 <String "Please provide a non-null Activity">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (googlesigninoptionsextension)), "Please provide a non-null GoogleSignInOptionsExtension");
	//    4    7:aload_3         
	//    5    8:ldc1            #129 <String "Please provide a non-null GoogleSignInOptionsExtension">
	//    6   10:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		requestPermissions(activity, i, googlesigninaccount, zzc(googlesigninoptionsextension.getImpliedScopes()));
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokeinterface #38  <Method List GoogleSignInOptionsExtension.getImpliedScopes()>
	//   13   23:invokestatic    #42  <Method Scope[] zzc(List)>
	//   14   26:invokestatic    #158 <Method void requestPermissions(Activity, int, GoogleSignInAccount, Scope[])>
	//   15   29:return          
	}

	public static transient void requestPermissions(Activity activity, int i, GoogleSignInAccount googlesigninaccount, Scope ascope[])
	{
		Preconditions.checkNotNull(((Object) (activity)), "Please provide a non-null Activity");
	//    0    0:aload_0         
	//    1    1:ldc1            #155 <String "Please provide a non-null Activity">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (ascope)), "Please provide at least one scope");
	//    4    7:aload_3         
	//    5    8:ldc1            #160 <String "Please provide at least one scope">
	//    6   10:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		activity.startActivityForResult(zzc(activity, googlesigninaccount, ascope), i);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokestatic    #163 <Method Intent zzc(Activity, GoogleSignInAccount, Scope[])>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #169 <Method void Activity.startActivityForResult(Intent, int)>
	//   15   25:return          
	}

	public static void requestPermissions(Fragment fragment, int i, GoogleSignInAccount googlesigninaccount, GoogleSignInOptionsExtension googlesigninoptionsextension)
	{
		Preconditions.checkNotNull(((Object) (fragment)), "Please provide a non-null Fragment");
	//    0    0:aload_0         
	//    1    1:ldc1            #172 <String "Please provide a non-null Fragment">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (googlesigninoptionsextension)), "Please provide a non-null GoogleSignInOptionsExtension");
	//    4    7:aload_3         
	//    5    8:ldc1            #129 <String "Please provide a non-null GoogleSignInOptionsExtension">
	//    6   10:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		requestPermissions(fragment, i, googlesigninaccount, zzc(googlesigninoptionsextension.getImpliedScopes()));
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokeinterface #38  <Method List GoogleSignInOptionsExtension.getImpliedScopes()>
	//   13   23:invokestatic    #42  <Method Scope[] zzc(List)>
	//   14   26:invokestatic    #175 <Method void requestPermissions(Fragment, int, GoogleSignInAccount, Scope[])>
	//   15   29:return          
	}

	public static transient void requestPermissions(Fragment fragment, int i, GoogleSignInAccount googlesigninaccount, Scope ascope[])
	{
		Preconditions.checkNotNull(((Object) (fragment)), "Please provide a non-null Fragment");
	//    0    0:aload_0         
	//    1    1:ldc1            #172 <String "Please provide a non-null Fragment">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (ascope)), "Please provide at least one scope");
	//    4    7:aload_3         
	//    5    8:ldc1            #160 <String "Please provide at least one scope">
	//    6   10:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		fragment.startActivityForResult(zzc(((Activity) (fragment.getActivity())), googlesigninaccount, ascope), i);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #181 <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:invokestatic    #163 <Method Intent zzc(Activity, GoogleSignInAccount, Scope[])>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #182 <Method void Fragment.startActivityForResult(Intent, int)>
	//   16   28:return          
	}

	private static transient Intent zzc(Activity activity, GoogleSignInAccount googlesigninaccount, Scope ascope[])
	{
		GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder();
	//    0    0:new             #184 <Class GoogleSignInOptions$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #185 <Method void GoogleSignInOptions$Builder()>
	//    3    7:astore_3        
		if(ascope.length > 0)
	//*   4    8:aload_2         
	//*   5    9:arraylength     
	//*   6   10:ifle            22
			builder.requestScopes(ascope[0], ascope);
	//    7   13:aload_3         
	//    8   14:aload_2         
	//    9   15:iconst_0        
	//   10   16:aaload          
	//   11   17:aload_2         
	//   12   18:invokevirtual   #189 <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestScopes(Scope, Scope[])>
	//   13   21:pop             
		if(googlesigninaccount != null && !TextUtils.isEmpty(((CharSequence) (googlesigninaccount.getEmail()))))
	//*  14   22:aload_1         
	//*  15   23:ifnull          45
	//*  16   26:aload_1         
	//*  17   27:invokevirtual   #193 <Method String GoogleSignInAccount.getEmail()>
	//*  18   30:invokestatic    #199 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   33:ifne            45
			builder.setAccountName(googlesigninaccount.getEmail());
	//   20   36:aload_3         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #193 <Method String GoogleSignInAccount.getEmail()>
	//   23   41:invokevirtual   #203 <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.setAccountName(String)>
	//   24   44:pop             
		return (new GoogleSignInClient(activity, builder.build())).getSignInIntent();
	//   25   45:new             #58  <Class GoogleSignInClient>
	//   26   48:dup             
	//   27   49:aload_0         
	//   28   50:aload_3         
	//   29   51:invokevirtual   #207 <Method GoogleSignInOptions GoogleSignInOptions$Builder.build()>
	//   30   54:invokespecial   #66  <Method void GoogleSignInClient(Activity, GoogleSignInOptions)>
	//   31   57:invokevirtual   #211 <Method Intent GoogleSignInClient.getSignInIntent()>
	//   32   60:areturn         
	}

	private static Scope[] zzc(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			return new Scope[0];
	//    2    4:iconst_0        
	//    3    5:anewarray       Scope[]
	//    4    8:areturn         
		else
			return (Scope[])list.toArray(((Object []) (new Scope[list.size()])));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokeinterface #217 <Method int List.size()>
	//    8   16:anewarray       Scope[]
	//    9   19:invokeinterface #221 <Method Object[] List.toArray(Object[])>
	//   10   24:checkcast       #223 <Class Scope[]>
	//   11   27:areturn         
	}
}
