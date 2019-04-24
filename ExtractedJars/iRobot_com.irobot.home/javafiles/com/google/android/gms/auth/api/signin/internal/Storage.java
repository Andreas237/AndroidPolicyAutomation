// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class Storage
{

	private Storage(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ReentrantLock>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ReentrantLock()>
	//    6   12:putfield        #30  <Field Lock zaal>
		zaam = context.getSharedPreferences("com.google.android.gms.signin", 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:ldc1            #32  <String "com.google.android.gms.signin">
	//   10   19:iconst_0        
	//   11   20:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   23:putfield        #40  <Field SharedPreferences zaam>
	//   13   26:return          
	}

	public static Storage getInstance(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		zaaj.lock();
	//    3    5:getstatic       #24  <Field Lock zaaj>
	//    4    8:invokeinterface #55  <Method void Lock.lock()>
		if(zaak == null)
	//*   5   13:getstatic       #57  <Field Storage zaak>
	//*   6   16:ifnonnull       33
			zaak = new Storage(context.getApplicationContext());
	//    7   19:new             #2   <Class Storage>
	//    8   22:dup             
	//    9   23:aload_0         
	//   10   24:invokevirtual   #61  <Method Context Context.getApplicationContext()>
	//   11   27:invokespecial   #63  <Method void Storage(Context)>
	//   12   30:putstatic       #57  <Field Storage zaak>
		context = ((Context) (zaak));
	//   13   33:getstatic       #57  <Field Storage zaak>
	//   14   36:astore_0        
		zaaj.unlock();
	//   15   37:getstatic       #24  <Field Lock zaaj>
	//   16   40:invokeinterface #66  <Method void Lock.unlock()>
		return ((Storage) (context));
	//   17   45:aload_0         
	//   18   46:areturn         
		context;
	//   19   47:astore_0        
		zaaj.unlock();
	//   20   48:getstatic       #24  <Field Lock zaaj>
	//   21   51:invokeinterface #66  <Method void Lock.unlock()>
		throw context;
	//   22   56:aload_0         
	//   23   57:athrow          
	}

	private final void zaa(String s, String s1)
	{
		zaal.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Lock zaal>
	//    2    4:invokeinterface #55  <Method void Lock.lock()>
		zaam.edit().putString(s, s1).apply();
	//    3    9:aload_0         
	//    4   10:getfield        #40  <Field SharedPreferences zaam>
	//    5   13:invokeinterface #74  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   18:aload_1         
	//    7   19:aload_2         
	//    8   20:invokeinterface #80  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    9   25:invokeinterface #83  <Method void android.content.SharedPreferences$Editor.apply()>
		zaal.unlock();
	//   10   30:aload_0         
	//   11   31:getfield        #30  <Field Lock zaal>
	//   12   34:invokeinterface #66  <Method void Lock.unlock()>
		return;
	//   13   39:return          
		s;
	//   14   40:astore_1        
		zaal.unlock();
	//   15   41:aload_0         
	//   16   42:getfield        #30  <Field Lock zaal>
	//   17   45:invokeinterface #66  <Method void Lock.unlock()>
		throw s;
	//   18   50:aload_1         
	//   19   51:athrow          
	}

	private static String zab(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(((Object) (s1))).length());
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #93  <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #97  <Method int String.length()>
	//    5   11:iconst_1        
	//    6   12:iadd            
	//    7   13:aload_1         
	//    8   14:invokestatic    #93  <Method String String.valueOf(Object)>
	//    9   17:invokevirtual   #97  <Method int String.length()>
	//   10   20:iadd            
	//   11   21:invokespecial   #100 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append(s);
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(":");
	//   17   31:aload_2         
	//   18   32:ldc1            #106 <String ":">
	//   19   34:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(s1);
	//   21   38:aload_2         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
		return stringbuilder.toString();
	//   25   44:aload_2         
	//   26   45:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   27   48:areturn         
	}

	private final GoogleSignInAccount zad(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #121 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		s = zaf(zab("googleSignInAccount", s));
	//    5    9:aload_0         
	//    6   10:ldc1            #123 <String "googleSignInAccount">
	//    7   12:aload_1         
	//    8   13:invokestatic    #125 <Method String zab(String, String)>
	//    9   16:invokespecial   #129 <Method String zaf(String)>
	//   10   19:astore_1        
		if(s != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          31
		{
			try
			{
				s = ((String) (GoogleSignInAccount.zaa(s)));
	//   13   24:aload_1         
	//   14   25:invokestatic    #133 <Method GoogleSignInAccount GoogleSignInAccount.zaa(String)>
	//   15   28:astore_1        
			}
	//*  16   29:aload_1         
	//*  17   30:areturn         
	//*  18   31:aconst_null     
	//*  19   32:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  20   33:astore_1        
			{
				return null;
	//   21   34:aconst_null     
	//   22   35:areturn         
			}
			return ((GoogleSignInAccount) (s));
		} else
		{
			return null;
		}
	}

	private final GoogleSignInOptions zae(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #121 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		s = zaf(zab("googleSignInOptions", s));
	//    5    9:aload_0         
	//    6   10:ldc1            #138 <String "googleSignInOptions">
	//    7   12:aload_1         
	//    8   13:invokestatic    #125 <Method String zab(String, String)>
	//    9   16:invokespecial   #129 <Method String zaf(String)>
	//   10   19:astore_1        
		if(s != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          31
		{
			try
			{
				s = ((String) (GoogleSignInOptions.zab(s)));
	//   13   24:aload_1         
	//   14   25:invokestatic    #142 <Method GoogleSignInOptions GoogleSignInOptions.zab(String)>
	//   15   28:astore_1        
			}
	//*  16   29:aload_1         
	//*  17   30:areturn         
	//*  18   31:aconst_null     
	//*  19   32:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  20   33:astore_1        
			{
				return null;
	//   21   34:aconst_null     
	//   22   35:areturn         
			}
			return ((GoogleSignInOptions) (s));
		} else
		{
			return null;
		}
	}

	private final String zaf(String s)
	{
		zaal.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Lock zaal>
	//    2    4:invokeinterface #55  <Method void Lock.lock()>
		s = zaam.getString(s, ((String) (null)));
	//    3    9:aload_0         
	//    4   10:getfield        #40  <Field SharedPreferences zaam>
	//    5   13:aload_1         
	//    6   14:aconst_null     
	//    7   15:invokeinterface #145 <Method String SharedPreferences.getString(String, String)>
	//    8   20:astore_1        
		zaal.unlock();
	//    9   21:aload_0         
	//   10   22:getfield        #30  <Field Lock zaal>
	//   11   25:invokeinterface #66  <Method void Lock.unlock()>
		return s;
	//   12   30:aload_1         
	//   13   31:areturn         
		s;
	//   14   32:astore_1        
		zaal.unlock();
	//   15   33:aload_0         
	//   16   34:getfield        #30  <Field Lock zaal>
	//   17   37:invokeinterface #66  <Method void Lock.unlock()>
		throw s;
	//   18   42:aload_1         
	//   19   43:athrow          
	}

	private final void zag(String s)
	{
		zaal.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Lock zaal>
	//    2    4:invokeinterface #55  <Method void Lock.lock()>
		zaam.edit().remove(s).apply();
	//    3    9:aload_0         
	//    4   10:getfield        #40  <Field SharedPreferences zaam>
	//    5   13:invokeinterface #74  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   18:aload_1         
	//    7   19:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    8   24:invokeinterface #83  <Method void android.content.SharedPreferences$Editor.apply()>
		zaal.unlock();
	//    9   29:aload_0         
	//   10   30:getfield        #30  <Field Lock zaal>
	//   11   33:invokeinterface #66  <Method void Lock.unlock()>
		return;
	//   12   38:return          
		s;
	//   13   39:astore_1        
		zaal.unlock();
	//   14   40:aload_0         
	//   15   41:getfield        #30  <Field Lock zaal>
	//   16   44:invokeinterface #66  <Method void Lock.unlock()>
		throw s;
	//   17   49:aload_1         
	//   18   50:athrow          
	}

	public void clear()
	{
		zaal.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Lock zaal>
	//    2    4:invokeinterface #55  <Method void Lock.lock()>
		zaam.edit().clear().apply();
	//    3    9:aload_0         
	//    4   10:getfield        #40  <Field SharedPreferences zaam>
	//    5   13:invokeinterface #74  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   18:invokeinterface #154 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    7   23:invokeinterface #83  <Method void android.content.SharedPreferences$Editor.apply()>
		zaal.unlock();
	//    8   28:aload_0         
	//    9   29:getfield        #30  <Field Lock zaal>
	//   10   32:invokeinterface #66  <Method void Lock.unlock()>
		return;
	//   11   37:return          
		Exception exception;
		exception;
	//   12   38:astore_1        
		zaal.unlock();
	//   13   39:aload_0         
	//   14   40:getfield        #30  <Field Lock zaal>
	//   15   43:invokeinterface #66  <Method void Lock.unlock()>
		throw exception;
	//   16   48:aload_1         
	//   17   49:athrow          
	}

	public GoogleSignInAccount getSavedDefaultGoogleSignInAccount()
	{
		return zad(zaf("defaultGoogleSignInAccount"));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #158 <String "defaultGoogleSignInAccount">
	//    3    4:invokespecial   #129 <Method String zaf(String)>
	//    4    7:invokespecial   #160 <Method GoogleSignInAccount zad(String)>
	//    5   10:areturn         
	}

	public GoogleSignInOptions getSavedDefaultGoogleSignInOptions()
	{
		return zae(zaf("defaultGoogleSignInAccount"));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #158 <String "defaultGoogleSignInAccount">
	//    3    4:invokespecial   #129 <Method String zaf(String)>
	//    4    7:invokespecial   #164 <Method GoogleSignInOptions zae(String)>
	//    5   10:areturn         
	}

	public String getSavedRefreshToken()
	{
		return zaf("refreshToken");
	//    0    0:aload_0         
	//    1    1:ldc1            #167 <String "refreshToken">
	//    2    3:invokespecial   #129 <Method String zaf(String)>
	//    3    6:areturn         
	}

	public void saveDefaultGoogleSignInAccount(GoogleSignInAccount googlesigninaccount, GoogleSignInOptions googlesigninoptions)
	{
		Preconditions.checkNotNull(((Object) (googlesigninaccount)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (googlesigninoptions)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		zaa("defaultGoogleSignInAccount", googlesigninaccount.zab());
	//    6   10:aload_0         
	//    7   11:ldc1            #158 <String "defaultGoogleSignInAccount">
	//    8   13:aload_1         
	//    9   14:invokevirtual   #171 <Method String GoogleSignInAccount.zab()>
	//   10   17:invokespecial   #173 <Method void zaa(String, String)>
		Preconditions.checkNotNull(((Object) (googlesigninaccount)));
	//   11   20:aload_1         
	//   12   21:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object)>
	//   13   24:pop             
		Preconditions.checkNotNull(((Object) (googlesigninoptions)));
	//   14   25:aload_2         
	//   15   26:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object)>
	//   16   29:pop             
		String s = googlesigninaccount.zab();
	//   17   30:aload_1         
	//   18   31:invokevirtual   #171 <Method String GoogleSignInAccount.zab()>
	//   19   34:astore_3        
		zaa(zab("googleSignInAccount", s), googlesigninaccount.zac());
	//   20   35:aload_0         
	//   21   36:ldc1            #123 <String "googleSignInAccount">
	//   22   38:aload_3         
	//   23   39:invokestatic    #125 <Method String zab(String, String)>
	//   24   42:aload_1         
	//   25   43:invokevirtual   #176 <Method String GoogleSignInAccount.zac()>
	//   26   46:invokespecial   #173 <Method void zaa(String, String)>
		zaa(zab("googleSignInOptions", s), googlesigninoptions.zae());
	//   27   49:aload_0         
	//   28   50:ldc1            #138 <String "googleSignInOptions">
	//   29   52:aload_3         
	//   30   53:invokestatic    #125 <Method String zab(String, String)>
	//   31   56:aload_2         
	//   32   57:invokevirtual   #178 <Method String GoogleSignInOptions.zae()>
	//   33   60:invokespecial   #173 <Method void zaa(String, String)>
	//   34   63:return          
	}

	public final void zaf()
	{
		String s = zaf("defaultGoogleSignInAccount");
	//    0    0:aload_0         
	//    1    1:ldc1            #158 <String "defaultGoogleSignInAccount">
	//    2    3:invokespecial   #129 <Method String zaf(String)>
	//    3    6:astore_1        
		zag("defaultGoogleSignInAccount");
	//    4    7:aload_0         
	//    5    8:ldc1            #158 <String "defaultGoogleSignInAccount">
	//    6   10:invokespecial   #180 <Method void zag(String)>
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #121 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   17:ifne            40
		{
			zag(zab("googleSignInAccount", s));
	//   10   20:aload_0         
	//   11   21:ldc1            #123 <String "googleSignInAccount">
	//   12   23:aload_1         
	//   13   24:invokestatic    #125 <Method String zab(String, String)>
	//   14   27:invokespecial   #180 <Method void zag(String)>
			zag(zab("googleSignInOptions", s));
	//   15   30:aload_0         
	//   16   31:ldc1            #138 <String "googleSignInOptions">
	//   17   33:aload_1         
	//   18   34:invokestatic    #125 <Method String zab(String, String)>
	//   19   37:invokespecial   #180 <Method void zag(String)>
		}
	//   20   40:return          
	}

	private static final Lock zaaj = new ReentrantLock();
	private static Storage zaak;
	private final Lock zaal = new ReentrantLock();
	private final SharedPreferences zaam;

	static 
	{
	//    0    0:new             #19  <Class ReentrantLock>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ReentrantLock()>
	//    3    7:putstatic       #24  <Field Lock zaaj>
	//*   4   10:return          
	}
}
