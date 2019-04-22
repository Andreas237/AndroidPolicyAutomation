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
	//    6   12:putfield        #30  <Field Lock zzah>
		zzai = context.getSharedPreferences("com.google.android.gms.signin", 0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:ldc1            #32  <String "com.google.android.gms.signin">
	//   10   19:iconst_0        
	//   11   20:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   23:putfield        #40  <Field SharedPreferences zzai>
	//   13   26:return          
	}

	public static Storage getInstance(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		zzaf.lock();
	//    3    5:getstatic       #24  <Field Lock zzaf>
	//    4    8:invokeinterface #54  <Method void Lock.lock()>
		if(zzag == null)
	//*   5   13:getstatic       #56  <Field Storage zzag>
	//*   6   16:ifnonnull       33
			zzag = new Storage(context.getApplicationContext());
	//    7   19:new             #2   <Class Storage>
	//    8   22:dup             
	//    9   23:aload_0         
	//   10   24:invokevirtual   #60  <Method Context Context.getApplicationContext()>
	//   11   27:invokespecial   #62  <Method void Storage(Context)>
	//   12   30:putstatic       #56  <Field Storage zzag>
		context = ((Context) (zzag));
	//   13   33:getstatic       #56  <Field Storage zzag>
	//   14   36:astore_0        
		zzaf.unlock();
	//   15   37:getstatic       #24  <Field Lock zzaf>
	//   16   40:invokeinterface #65  <Method void Lock.unlock()>
		return ((Storage) (context));
	//   17   45:aload_0         
	//   18   46:areturn         
		context;
	//   19   47:astore_0        
		zzaf.unlock();
	//   20   48:getstatic       #24  <Field Lock zzaf>
	//   21   51:invokeinterface #65  <Method void Lock.unlock()>
		throw context;
	//   22   56:aload_0         
	//   23   57:athrow          
	}

	public static void setInstance(Storage storage)
	{
		zzaf.lock();
	//    0    0:getstatic       #24  <Field Lock zzaf>
	//    1    3:invokeinterface #54  <Method void Lock.lock()>
		zzag = storage;
	//    2    8:aload_0         
	//    3    9:putstatic       #56  <Field Storage zzag>
		zzaf.unlock();
	//    4   12:getstatic       #24  <Field Lock zzaf>
	//    5   15:invokeinterface #65  <Method void Lock.unlock()>
		return;
	//    6   20:return          
		storage;
	//    7   21:astore_0        
		zzaf.unlock();
	//    8   22:getstatic       #24  <Field Lock zzaf>
	//    9   25:invokeinterface #65  <Method void Lock.unlock()>
		throw storage;
	//   10   30:aload_0         
	//   11   31:athrow          
	}

	private static String zza(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(((Object) (s1))).length());
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #79  <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #83  <Method int String.length()>
	//    5   11:iconst_1        
	//    6   12:iadd            
	//    7   13:aload_1         
	//    8   14:invokestatic    #79  <Method String String.valueOf(Object)>
	//    9   17:invokevirtual   #83  <Method int String.length()>
	//   10   20:iadd            
	//   11   21:invokespecial   #86  <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append(s);
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(":");
	//   17   31:aload_2         
	//   18   32:ldc1            #92  <String ":">
	//   19   34:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(s1);
	//   21   38:aload_2         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
		return stringbuilder.toString();
	//   25   44:aload_2         
	//   26   45:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   27   48:areturn         
	}

	private final GoogleSignInAccount zzb(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #106 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		s = getFromStore(zza("googleSignInAccount", s));
	//    5    9:aload_0         
	//    6   10:ldc1            #108 <String "googleSignInAccount">
	//    7   12:aload_1         
	//    8   13:invokestatic    #110 <Method String zza(String, String)>
	//    9   16:invokevirtual   #114 <Method String getFromStore(String)>
	//   10   19:astore_1        
		if(s != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          31
		{
			try
			{
				s = ((String) (GoogleSignInAccount.fromJsonString(s)));
	//   13   24:aload_1         
	//   14   25:invokestatic    #119 <Method GoogleSignInAccount GoogleSignInAccount.fromJsonString(String)>
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

	private final GoogleSignInOptions zzc(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #106 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		s = getFromStore(zza("googleSignInOptions", s));
	//    5    9:aload_0         
	//    6   10:ldc1            #124 <String "googleSignInOptions">
	//    7   12:aload_1         
	//    8   13:invokestatic    #110 <Method String zza(String, String)>
	//    9   16:invokevirtual   #114 <Method String getFromStore(String)>
	//   10   19:astore_1        
		if(s != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          31
		{
			try
			{
				s = ((String) (GoogleSignInOptions.fromJsonString(s)));
	//   13   24:aload_1         
	//   14   25:invokestatic    #128 <Method GoogleSignInOptions GoogleSignInOptions.fromJsonString(String)>
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

	public void clear()
	{
		zzah.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Lock zzah>
	//    2    4:invokeinterface #54  <Method void Lock.lock()>
		zzai.edit().clear().apply();
	//    3    9:aload_0         
	//    4   10:getfield        #40  <Field SharedPreferences zzai>
	//    5   13:invokeinterface #135 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   18:invokeinterface #139 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    7   23:invokeinterface #142 <Method void android.content.SharedPreferences$Editor.apply()>
		zzah.unlock();
	//    8   28:aload_0         
	//    9   29:getfield        #30  <Field Lock zzah>
	//   10   32:invokeinterface #65  <Method void Lock.unlock()>
		return;
	//   11   37:return          
		Exception exception;
		exception;
	//   12   38:astore_1        
		zzah.unlock();
	//   13   39:aload_0         
	//   14   40:getfield        #30  <Field Lock zzah>
	//   15   43:invokeinterface #65  <Method void Lock.unlock()>
		throw exception;
	//   16   48:aload_1         
	//   17   49:athrow          
	}

	protected String getFromStore(String s)
	{
		zzah.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Lock zzah>
	//    2    4:invokeinterface #54  <Method void Lock.lock()>
		s = zzai.getString(s, ((String) (null)));
	//    3    9:aload_0         
	//    4   10:getfield        #40  <Field SharedPreferences zzai>
	//    5   13:aload_1         
	//    6   14:aconst_null     
	//    7   15:invokeinterface #145 <Method String SharedPreferences.getString(String, String)>
	//    8   20:astore_1        
		zzah.unlock();
	//    9   21:aload_0         
	//   10   22:getfield        #30  <Field Lock zzah>
	//   11   25:invokeinterface #65  <Method void Lock.unlock()>
		return s;
	//   12   30:aload_1         
	//   13   31:areturn         
		s;
	//   14   32:astore_1        
		zzah.unlock();
	//   15   33:aload_0         
	//   16   34:getfield        #30  <Field Lock zzah>
	//   17   37:invokeinterface #65  <Method void Lock.unlock()>
		throw s;
	//   18   42:aload_1         
	//   19   43:athrow          
	}

	public GoogleSignInAccount getSavedDefaultGoogleSignInAccount()
	{
		return zzb(getFromStore("defaultGoogleSignInAccount"));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #149 <String "defaultGoogleSignInAccount">
	//    3    4:invokevirtual   #114 <Method String getFromStore(String)>
	//    4    7:invokespecial   #151 <Method GoogleSignInAccount zzb(String)>
	//    5   10:areturn         
	}

	public GoogleSignInOptions getSavedDefaultGoogleSignInOptions()
	{
		return zzc(getFromStore("defaultGoogleSignInAccount"));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #149 <String "defaultGoogleSignInAccount">
	//    3    4:invokevirtual   #114 <Method String getFromStore(String)>
	//    4    7:invokespecial   #155 <Method GoogleSignInOptions zzc(String)>
	//    5   10:areturn         
	}

	public String getSavedRefreshToken()
	{
		return getFromStore("refreshToken");
	//    0    0:aload_0         
	//    1    1:ldc1            #158 <String "refreshToken">
	//    2    3:invokevirtual   #114 <Method String getFromStore(String)>
	//    3    6:areturn         
	}

	protected void removeFromStore(String s)
	{
		zzah.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Lock zzah>
	//    2    4:invokeinterface #54  <Method void Lock.lock()>
		zzai.edit().remove(s).apply();
	//    3    9:aload_0         
	//    4   10:getfield        #40  <Field SharedPreferences zzai>
	//    5   13:invokeinterface #135 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   18:aload_1         
	//    7   19:invokeinterface #164 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    8   24:invokeinterface #142 <Method void android.content.SharedPreferences$Editor.apply()>
		zzah.unlock();
	//    9   29:aload_0         
	//   10   30:getfield        #30  <Field Lock zzah>
	//   11   33:invokeinterface #65  <Method void Lock.unlock()>
		return;
	//   12   38:return          
		s;
	//   13   39:astore_1        
		zzah.unlock();
	//   14   40:aload_0         
	//   15   41:getfield        #30  <Field Lock zzah>
	//   16   44:invokeinterface #65  <Method void Lock.unlock()>
		throw s;
	//   17   49:aload_1         
	//   18   50:athrow          
	}

	public void removeSavedDefaultGoogleSignInAccount()
	{
		String s = getFromStore("defaultGoogleSignInAccount");
	//    0    0:aload_0         
	//    1    1:ldc1            #149 <String "defaultGoogleSignInAccount">
	//    2    3:invokevirtual   #114 <Method String getFromStore(String)>
	//    3    6:astore_1        
		removeFromStore("defaultGoogleSignInAccount");
	//    4    7:aload_0         
	//    5    8:ldc1            #149 <String "defaultGoogleSignInAccount">
	//    6   10:invokevirtual   #167 <Method void removeFromStore(String)>
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #106 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   17:ifne            40
		{
			removeFromStore(zza("googleSignInAccount", s));
	//   10   20:aload_0         
	//   11   21:ldc1            #108 <String "googleSignInAccount">
	//   12   23:aload_1         
	//   13   24:invokestatic    #110 <Method String zza(String, String)>
	//   14   27:invokevirtual   #167 <Method void removeFromStore(String)>
			removeFromStore(zza("googleSignInOptions", s));
	//   15   30:aload_0         
	//   16   31:ldc1            #124 <String "googleSignInOptions">
	//   17   33:aload_1         
	//   18   34:invokestatic    #110 <Method String zza(String, String)>
	//   19   37:invokevirtual   #167 <Method void removeFromStore(String)>
		}
	//   20   40:return          
	}

	public void saveDefaultGoogleSignInAccount(GoogleSignInAccount googlesigninaccount, GoogleSignInOptions googlesigninoptions)
	{
		Preconditions.checkNotNull(((Object) (googlesigninaccount)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (googlesigninoptions)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		saveToStore("defaultGoogleSignInAccount", googlesigninaccount.getObfuscatedIdentifier());
	//    6   10:aload_0         
	//    7   11:ldc1            #149 <String "defaultGoogleSignInAccount">
	//    8   13:aload_1         
	//    9   14:invokevirtual   #172 <Method String GoogleSignInAccount.getObfuscatedIdentifier()>
	//   10   17:invokevirtual   #176 <Method void saveToStore(String, String)>
		Preconditions.checkNotNull(((Object) (googlesigninaccount)));
	//   11   20:aload_1         
	//   12   21:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object)>
	//   13   24:pop             
		Preconditions.checkNotNull(((Object) (googlesigninoptions)));
	//   14   25:aload_2         
	//   15   26:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object)>
	//   16   29:pop             
		String s = googlesigninaccount.getObfuscatedIdentifier();
	//   17   30:aload_1         
	//   18   31:invokevirtual   #172 <Method String GoogleSignInAccount.getObfuscatedIdentifier()>
	//   19   34:astore_3        
		saveToStore(zza("googleSignInAccount", s), googlesigninaccount.toJsonForStorage());
	//   20   35:aload_0         
	//   21   36:ldc1            #108 <String "googleSignInAccount">
	//   22   38:aload_3         
	//   23   39:invokestatic    #110 <Method String zza(String, String)>
	//   24   42:aload_1         
	//   25   43:invokevirtual   #179 <Method String GoogleSignInAccount.toJsonForStorage()>
	//   26   46:invokevirtual   #176 <Method void saveToStore(String, String)>
		saveToStore(zza("googleSignInOptions", s), googlesigninoptions.toJson());
	//   27   49:aload_0         
	//   28   50:ldc1            #124 <String "googleSignInOptions">
	//   29   52:aload_3         
	//   30   53:invokestatic    #110 <Method String zza(String, String)>
	//   31   56:aload_2         
	//   32   57:invokevirtual   #182 <Method String GoogleSignInOptions.toJson()>
	//   33   60:invokevirtual   #176 <Method void saveToStore(String, String)>
	//   34   63:return          
	}

	public void saveRefreshToken(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #106 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            14
			saveToStore("refreshToken", s);
	//    3    7:aload_0         
	//    4    8:ldc1            #158 <String "refreshToken">
	//    5   10:aload_1         
	//    6   11:invokevirtual   #176 <Method void saveToStore(String, String)>
	//    7   14:return          
	}

	protected void saveToStore(String s, String s1)
	{
		zzah.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Lock zzah>
	//    2    4:invokeinterface #54  <Method void Lock.lock()>
		zzai.edit().putString(s, s1).apply();
	//    3    9:aload_0         
	//    4   10:getfield        #40  <Field SharedPreferences zzai>
	//    5   13:invokeinterface #135 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   18:aload_1         
	//    7   19:aload_2         
	//    8   20:invokeinterface #187 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    9   25:invokeinterface #142 <Method void android.content.SharedPreferences$Editor.apply()>
		zzah.unlock();
	//   10   30:aload_0         
	//   11   31:getfield        #30  <Field Lock zzah>
	//   12   34:invokeinterface #65  <Method void Lock.unlock()>
		return;
	//   13   39:return          
		s;
	//   14   40:astore_1        
		zzah.unlock();
	//   15   41:aload_0         
	//   16   42:getfield        #30  <Field Lock zzah>
	//   17   45:invokeinterface #65  <Method void Lock.unlock()>
		throw s;
	//   18   50:aload_1         
	//   19   51:athrow          
	}

	private static final Lock zzaf = new ReentrantLock();
	private static Storage zzag;
	private final Lock zzah = new ReentrantLock();
	private final SharedPreferences zzai;

	static 
	{
	//    0    0:new             #19  <Class ReentrantLock>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ReentrantLock()>
	//    3    7:putstatic       #24  <Field Lock zzaf>
	//*   4   10:return          
	}
}
