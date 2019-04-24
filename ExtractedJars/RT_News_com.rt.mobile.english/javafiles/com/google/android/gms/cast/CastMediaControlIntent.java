// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.cast.zzcu;
import java.util.*;

public final class CastMediaControlIntent
{

	private CastMediaControlIntent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	public static String categoryForCast(String s)
		throws IllegalArgumentException
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("applicationId cannot be null");
	//    2    4:new             #48  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #50  <String "applicationId cannot be null">
	//    5   10:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return zza("com.google.android.gms.cast.CATEGORY_CAST", s, ((Collection) (null)), false);
	//    7   14:ldc1            #55  <String "com.google.android.gms.cast.CATEGORY_CAST">
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:iconst_0        
	//   11   19:invokestatic    #59  <Method String zza(String, String, Collection, boolean)>
	//   12   22:areturn         
	}

	public static String categoryForCast(String s, Collection collection)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("applicationId cannot be null");
	//    2    4:new             #48  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #50  <String "applicationId cannot be null">
	//    5   10:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(collection == null)
	//*   7   14:aload_1         
	//*   8   15:ifnonnull       28
			throw new IllegalArgumentException("namespaces cannot be null");
	//    9   18:new             #48  <Class IllegalArgumentException>
	//   10   21:dup             
	//   11   22:ldc1            #63  <String "namespaces cannot be null">
	//   12   24:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		else
			return zza("com.google.android.gms.cast.CATEGORY_CAST", s, collection, false);
	//   14   28:ldc1            #55  <String "com.google.android.gms.cast.CATEGORY_CAST">
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:iconst_0        
	//   18   33:invokestatic    #59  <Method String zza(String, String, Collection, boolean)>
	//   19   36:areturn         
	}

	public static String categoryForCast(Collection collection)
		throws IllegalArgumentException
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("namespaces cannot be null");
	//    2    4:new             #48  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #63  <String "namespaces cannot be null">
	//    5   10:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return zza("com.google.android.gms.cast.CATEGORY_CAST", ((String) (null)), collection, false);
	//    7   14:ldc1            #55  <String "com.google.android.gms.cast.CATEGORY_CAST">
	//    8   16:aconst_null     
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokestatic    #59  <Method String zza(String, String, Collection, boolean)>
	//   12   22:areturn         
	}

	public static String categoryForRemotePlayback()
	{
		return zza("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", ((String) (null)), ((Collection) (null)), false);
	//    0    0:ldc1            #71  <String "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK">
	//    1    2:aconst_null     
	//    2    3:aconst_null     
	//    3    4:iconst_0        
	//    4    5:invokestatic    #59  <Method String zza(String, String, Collection, boolean)>
	//    5    8:areturn         
	}

	public static String categoryForRemotePlayback(String s)
		throws IllegalArgumentException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #77  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("applicationId cannot be null or empty");
	//    3    7:new             #48  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #79  <String "applicationId cannot be null or empty">
	//    6   13:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return zza("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", s, ((Collection) (null)), false);
	//    8   17:ldc1            #71  <String "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK">
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:iconst_0        
	//   12   22:invokestatic    #59  <Method String zza(String, String, Collection, boolean)>
	//   13   25:areturn         
	}

	public static String languageTagForLocale(Locale locale)
	{
		return zzcu.zza(locale);
	//    0    0:aload_0         
	//    1    1:invokestatic    #85  <Method String zzcu.zza(Locale)>
	//    2    4:areturn         
	}

	private static String zza(String s, String s1, Collection collection, boolean flag)
		throws IllegalArgumentException
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #88  <Method void StringBuilder(String)>
	//    4    8:astore_0        
		if(s1 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          84
		{
			String s2 = s1.toUpperCase();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #93  <Method String String.toUpperCase()>
	//    9   17:astore          5
			if(!s2.matches("[A-F0-9]+"))
	//*  10   19:aload           5
	//*  11   21:ldc1            #95  <String "[A-F0-9]+">
	//*  12   23:invokevirtual   #99  <Method boolean String.matches(String)>
	//*  13   26:ifne            70
			{
				s = String.valueOf(((Object) (s1)));
	//   14   29:aload_1         
	//   15   30:invokestatic    #103 <Method String String.valueOf(Object)>
	//   16   33:astore_0        
				if(s.length() != 0)
	//*  17   34:aload_0         
	//*  18   35:invokevirtual   #107 <Method int String.length()>
	//*  19   38:ifeq            51
					s = "Invalid application ID: ".concat(s);
	//   20   41:ldc1            #109 <String "Invalid application ID: ">
	//   21   43:aload_0         
	//   22   44:invokevirtual   #112 <Method String String.concat(String)>
	//   23   47:astore_0        
				else
	//*  24   48:goto            61
					s = new String("Invalid application ID: ");
	//   25   51:new             #90  <Class String>
	//   26   54:dup             
	//   27   55:ldc1            #109 <String "Invalid application ID: ">
	//   28   57:invokespecial   #113 <Method void String(String)>
	//   29   60:astore_0        
				throw new IllegalArgumentException(s);
	//   30   61:new             #48  <Class IllegalArgumentException>
	//   31   64:dup             
	//   32   65:aload_0         
	//   33   66:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   34   69:athrow          
			}
			((StringBuilder) (s)).append("/");
	//   35   70:aload_0         
	//   36   71:ldc1            #115 <String "/">
	//   37   73:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   38   76:pop             
			((StringBuilder) (s)).append(s2);
	//   39   77:aload_0         
	//   40   78:aload           5
	//   41   80:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   42   83:pop             
		}
		if(collection != null)
	//*  43   84:aload_2         
	//*  44   85:ifnull          188
		{
			if(collection.isEmpty())
	//*  45   88:aload_2         
	//*  46   89:invokeinterface #124 <Method boolean Collection.isEmpty()>
	//*  47   94:ifeq            107
				throw new IllegalArgumentException("Must specify at least one namespace");
	//   48   97:new             #48  <Class IllegalArgumentException>
	//   49  100:dup             
	//   50  101:ldc1            #126 <String "Must specify at least one namespace">
	//   51  103:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   52  106:athrow          
			if(s1 == null)
	//*  53  107:aload_1         
	//*  54  108:ifnonnull       118
				((StringBuilder) (s)).append("/");
	//   55  111:aload_0         
	//   56  112:ldc1            #115 <String "/">
	//   57  114:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   58  117:pop             
			((StringBuilder) (s)).append("/");
	//   59  118:aload_0         
	//   60  119:ldc1            #115 <String "/">
	//   61  121:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   62  124:pop             
			boolean flag1 = true;
	//   63  125:iconst_1        
	//   64  126:istore          4
			for(s1 = ((String) (collection.iterator())); ((Iterator) (s1)).hasNext(); ((StringBuilder) (s)).append(zzcu.zzq(((String) (collection)))))
	//*  65  128:aload_2         
	//*  66  129:invokeinterface #130 <Method Iterator Collection.iterator()>
	//*  67  134:astore_1        
	//*  68  135:aload_1         
	//*  69  136:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//*  70  141:ifeq            188
			{
				collection = ((Collection) ((String)((Iterator) (s1)).next()));
	//   71  144:aload_1         
	//   72  145:invokeinterface #139 <Method Object Iterator.next()>
	//   73  150:checkcast       #90  <Class String>
	//   74  153:astore_2        
				zzcu.zzo(((String) (collection)));
	//   75  154:aload_2         
	//   76  155:invokestatic    #142 <Method void zzcu.zzo(String)>
				if(flag1)
	//*  77  158:iload           4
	//*  78  160:ifeq            169
					flag1 = false;
	//   79  163:iconst_0        
	//   80  164:istore          4
				else
	//*  81  166:goto            176
					((StringBuilder) (s)).append(",");
	//   82  169:aload_0         
	//   83  170:ldc1            #144 <String ",">
	//   84  172:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   85  175:pop             
			}

	//   86  176:aload_0         
	//   87  177:aload_2         
	//   88  178:invokestatic    #147 <Method String zzcu.zzq(String)>
	//   89  181:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   90  184:pop             
		}
	//*  91  185:goto            135
		return ((StringBuilder) (s)).toString();
	//   92  188:aload_0         
	//   93  189:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   94  192:areturn         
	}

	public static final String ACTION_SYNC_STATUS = "com.google.android.gms.cast.ACTION_SYNC_STATUS";
	public static final String DEFAULT_MEDIA_RECEIVER_APPLICATION_ID = "CC1AD845";
	public static final int ERROR_CODE_REQUEST_FAILED = 1;
	public static final int ERROR_CODE_SESSION_START_FAILED = 2;
	public static final int ERROR_CODE_TEMPORARILY_DISCONNECTED = 3;
	public static final String EXTRA_CAST_APPLICATION_ID = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";
	public static final String EXTRA_CAST_LANGUAGE_CODE = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";
	public static final String EXTRA_CAST_RELAUNCH_APPLICATION = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";
	public static final String EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";
	public static final String EXTRA_CUSTOM_DATA = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";
	public static final String EXTRA_DEBUG_LOGGING_ENABLED = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";
	public static final String EXTRA_ERROR_CODE = "com.google.android.gms.cast.EXTRA_ERROR_CODE";
}
