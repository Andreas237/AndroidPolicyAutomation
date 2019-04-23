// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

public class UserDataStore
{

	public UserDataStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	private static String encryptData(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          35
		{
			if(s.isEmpty())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #89  <Method boolean String.isEmpty()>
	//*   4    8:ifeq            13
				return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
			MessageDigest messagedigest;
			try
			{
				messagedigest = MessageDigest.getInstance("SHA-256");
	//    7   13:ldc1            #91  <String "SHA-256">
	//    8   15:invokestatic    #97  <Method MessageDigest MessageDigest.getInstance(String)>
	//    9   18:astore_1        
			}
	//*  10   19:aload_1         
	//*  11   20:aload_0         
	//*  12   21:invokevirtual   #101 <Method byte[] String.getBytes()>
	//*  13   24:invokevirtual   #105 <Method void MessageDigest.update(byte[])>
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #108 <Method byte[] MessageDigest.digest()>
	//*  16   31:invokestatic    #114 <Method String AppEventUtility.bytesToHex(byte[])>
	//*  17   34:areturn         
	//*  18   35:aconst_null     
	//*  19   36:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  20   37:astore_0        
			{
				return null;
	//   21   38:aconst_null     
	//   22   39:areturn         
			}
			messagedigest.update(s.getBytes());
			return AppEventUtility.bytesToHex(messagedigest.digest());
		} else
		{
			return null;
		}
	}

	public static String getHashedUserData()
	{
		if(!initialized)
	//*   0    0:getstatic       #61  <Field boolean initialized>
	//*   1    3:ifne            18
		{
			Log.w(TAG, "initStore should have been called before calling setUserID");
	//    2    6:getstatic       #117 <Field String TAG>
	//    3    9:ldc1            #119 <String "initStore should have been called before calling setUserID">
	//    4   11:invokestatic    #125 <Method int Log.w(String, String)>
	//    5   14:pop             
			initAndWait();
	//    6   15:invokestatic    #67  <Method void initAndWait()>
		}
		lock.readLock().lock();
	//    7   18:getstatic       #59  <Field ReentrantReadWriteLock lock>
	//    8   21:invokevirtual   #129 <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//    9   24:invokevirtual   #133 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.lock()>
		String s = hashedUserData;
	//   10   27:getstatic       #73  <Field String hashedUserData>
	//   11   30:astore_0        
		lock.readLock().unlock();
	//   12   31:getstatic       #59  <Field ReentrantReadWriteLock lock>
	//   13   34:invokevirtual   #129 <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//   14   37:invokevirtual   #136 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()>
		return s;
	//   15   40:aload_0         
	//   16   41:areturn         
		Exception exception;
		exception;
	//   17   42:astore_0        
		lock.readLock().unlock();
	//   18   43:getstatic       #59  <Field ReentrantReadWriteLock lock>
	//   19   46:invokevirtual   #129 <Method java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock ReentrantReadWriteLock.readLock()>
	//   20   49:invokevirtual   #136 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock.unlock()>
		throw exception;
	//   21   52:aload_0         
	//   22   53:athrow          
	}

	private static String hashUserData(Bundle bundle)
	{
		JSONObject jsonobject;
		Iterator iterator;
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		jsonobject = new JSONObject();
	//    4    6:new             #140 <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #141 <Method void JSONObject()>
	//    7   13:astore_1        
		iterator = bundle.keySet().iterator();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #147 <Method Set Bundle.keySet()>
	//   10   18:invokeinterface #153 <Method Iterator Set.iterator()>
	//   11   23:astore_2        
_L6:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   12   24:aload_2         
	//   13   25:invokeinterface #158 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            108
_L1:
		String s = (String)iterator.next();
	//   15   33:aload_2         
	//   16   34:invokeinterface #162 <Method Object Iterator.next()>
	//   17   39:checkcast       #85  <Class String>
	//   18   42:astore_3        
		String s1 = bundle.get(s).toString();
	//   19   43:aload_0         
	//   20   44:aload_3         
	//   21   45:invokevirtual   #166 <Method Object Bundle.get(String)>
	//   22   48:invokevirtual   #169 <Method String Object.toString()>
	//   23   51:astore          4
		if(!maybeSHA256Hashed(s1)) goto _L4; else goto _L3
	//   24   53:aload           4
	//   25   55:invokestatic    #173 <Method boolean maybeSHA256Hashed(String)>
	//   26   58:ifeq            75
_L3:
		jsonobject.put(s, ((Object) (s1.toLowerCase())));
	//   27   61:aload_1         
	//   28   62:aload_3         
	//   29   63:aload           4
	//   30   65:invokevirtual   #176 <Method String String.toLowerCase()>
	//   31   68:invokevirtual   #180 <Method JSONObject JSONObject.put(String, Object)>
	//   32   71:pop             
		  goto _L5
	//*  33   72:goto            24
_L4:
		s1 = encryptData(normalizeData(s, bundle.get(s).toString()));
	//   34   75:aload_3         
	//   35   76:aload_0         
	//   36   77:aload_3         
	//   37   78:invokevirtual   #166 <Method Object Bundle.get(String)>
	//   38   81:invokevirtual   #169 <Method String Object.toString()>
	//   39   84:invokestatic    #184 <Method String normalizeData(String, String)>
	//   40   87:invokestatic    #186 <Method String encryptData(String)>
	//   41   90:astore          4
		if(s1 != null)
	//*  42   92:aload           4
	//*  43   94:ifnull          24
			try
			{
				jsonobject.put(s, ((Object) (s1)));
	//   44   97:aload_1         
	//   45   98:aload_3         
	//   46   99:aload           4
	//   47  101:invokevirtual   #180 <Method JSONObject JSONObject.put(String, Object)>
	//   48  104:pop             
			}
	//*  49  105:goto            24
	//*  50  108:aload_1         
	//*  51  109:invokevirtual   #187 <Method String JSONObject.toString()>
	//*  52  112:areturn         
			catch(JSONException jsonexception) { }
	//   53  113:astore_3        
_L5:
		if(true) goto _L6; else goto _L2
	//   54  114:goto            24
_L2:
		return jsonobject.toString();
	}

	private static void initAndWait()
	{
		if(initialized)
	//*   0    0:getstatic       #61  <Field boolean initialized>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		lock.writeLock().lock();
	//    3    7:getstatic       #59  <Field ReentrantReadWriteLock lock>
	//    4   10:invokevirtual   #191 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//    5   13:invokevirtual   #194 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
		boolean flag = initialized;
	//    6   16:getstatic       #61  <Field boolean initialized>
	//    7   19:istore_0        
		if(flag)
	//*   8   20:iload_0         
	//*   9   21:ifeq            34
		{
			lock.writeLock().unlock();
	//   10   24:getstatic       #59  <Field ReentrantReadWriteLock lock>
	//   11   27:invokevirtual   #191 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   12   30:invokevirtual   #195 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
			return;
	//   13   33:return          
		}
		hashedUserData = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString("com.facebook.appevents.UserDataStore.userData", ((String) (null)));
	//   14   34:invokestatic    #201 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   15   37:invokestatic    #207 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//   16   40:ldc1            #42  <String "com.facebook.appevents.UserDataStore.userData">
	//   17   42:aconst_null     
	//   18   43:invokeinterface #212 <Method String SharedPreferences.getString(String, String)>
	//   19   48:putstatic       #73  <Field String hashedUserData>
		initialized = true;
	//   20   51:iconst_1        
	//   21   52:putstatic       #61  <Field boolean initialized>
		lock.writeLock().unlock();
	//   22   55:getstatic       #59  <Field ReentrantReadWriteLock lock>
	//   23   58:invokevirtual   #191 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   24   61:invokevirtual   #195 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		return;
	//   25   64:return          
		Exception exception;
		exception;
	//   26   65:astore_1        
		lock.writeLock().unlock();
	//   27   66:getstatic       #59  <Field ReentrantReadWriteLock lock>
	//   28   69:invokevirtual   #191 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//   29   72:invokevirtual   #195 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		throw exception;
	//   30   75:aload_1         
	//   31   76:athrow          
	}

	public static void initStore()
	{
		if(initialized)
	//*   0    0:getstatic       #61  <Field boolean initialized>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			AppEventsLogger.getAnalyticsExecutor().execute(new Runnable() {

				public void run()
				{
					UserDataStore.initAndWait();
				//    0    0:invokestatic    #19  <Method void UserDataStore.access$000()>
				//    1    3:return          
				}

			}
);
	//    3    7:invokestatic    #219 <Method Executor AppEventsLogger.getAnalyticsExecutor()>
	//    4   10:new             #6   <Class UserDataStore$1>
	//    5   13:dup             
	//    6   14:invokespecial   #220 <Method void UserDataStore$1()>
	//    7   17:invokeinterface #226 <Method void Executor.execute(Runnable)>
			return;
	//    8   22:return          
		}
	}

	private static boolean maybeSHA256Hashed(String s)
	{
		return s.matches("[A-Fa-f0-9]{64}");
	//    0    0:aload_0         
	//    1    1:ldc1            #228 <String "[A-Fa-f0-9]{64}">
	//    2    3:invokevirtual   #231 <Method boolean String.matches(String)>
	//    3    6:ireturn         
	}

	private static String normalizeData(String s, String s1)
	{
		int i;
label0:
		{
			i = s.hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method int String.hashCode()>
	//    2    4:istore_2        
			if(i != 3185)
	//*   3    5:iload_2         
	//*   4    6:sipush          3185
	//*   5    9:icmpeq          163
			{
				if(i != 3240)
	//*   6   12:iload_2         
	//*   7   13:sipush          3240
	//*   8   16:icmpeq          149
				{
					if(i != 3272)
	//*   9   19:iload_2         
	//*  10   20:sipush          3272
	//*  11   23:icmpeq          135
					{
						if(i != 3294)
	//*  12   26:iload_2         
	//*  13   27:sipush          3294
	//*  14   30:icmpeq          120
						{
							if(i != 3458)
	//*  15   33:iload_2         
	//*  16   34:sipush          3458
	//*  17   37:icmpeq          106
							{
								if(i != 3576)
	//*  18   40:iload_2         
	//*  19   41:sipush          3576
	//*  20   44:icmpeq          91
								{
									if(i != 3681)
	//*  21   47:iload_2         
	//*  22   48:sipush          3681
	//*  23   51:icmpeq          77
									{
										if(i == 0x39175796 && s.equals("country"))
	//*  24   54:iload_2         
	//*  25   55:ldc1            #236 <Int 0x39175796>
	//*  26   57:icmpeq          63
	//*  27   60:goto            177
	//*  28   63:aload_0         
	//*  29   64:ldc1            #15  <String "country">
	//*  30   66:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  31   69:ifeq            177
										{
											i = 5;
	//   32   72:iconst_5        
	//   33   73:istore_2        
											break label0;
	//   34   74:goto            179
										}
									} else
									if(s.equals("st"))
	//*  35   77:aload_0         
	//*  36   78:ldc1            #36  <String "st">
	//*  37   80:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  38   83:ifeq            177
									{
										i = 4;
	//   39   86:iconst_4        
	//   40   87:istore_2        
										break label0;
	//   41   88:goto            179
									}
								} else
								if(s.equals("ph"))
	//*  42   91:aload_0         
	//*  43   92:ldc1            #33  <String "ph">
	//*  44   94:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  45   97:ifeq            177
								{
									i = 6;
	//   46  100:bipush          6
	//   47  102:istore_2        
									break label0;
	//   48  103:goto            179
								}
							} else
							if(s.equals("ln"))
	//*  49  106:aload_0         
	//*  50  107:ldc1            #30  <String "ln">
	//*  51  109:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  52  112:ifeq            177
							{
								i = 2;
	//   53  115:iconst_2        
	//   54  116:istore_2        
								break label0;
	//   55  117:goto            179
							}
						} else
						if(s.equals("ge"))
	//*  56  120:aload_0         
	//*  57  121:ldc1            #27  <String "ge">
	//*  58  123:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  59  126:ifeq            177
						{
							i = 7;
	//   60  129:bipush          7
	//   61  131:istore_2        
							break label0;
	//   62  132:goto            179
						}
					} else
					if(s.equals("fn"))
	//*  63  135:aload_0         
	//*  64  136:ldc1            #24  <String "fn">
	//*  65  138:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  66  141:ifeq            177
					{
						i = 1;
	//   67  144:iconst_1        
	//   68  145:istore_2        
						break label0;
	//   69  146:goto            179
					}
				} else
				if(s.equals("em"))
	//*  70  149:aload_0         
	//*  71  150:ldc1            #21  <String "em">
	//*  72  152:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  73  155:ifeq            177
				{
					i = 0;
	//   74  158:iconst_0        
	//   75  159:istore_2        
					break label0;
	//   76  160:goto            179
				}
			} else
			if(s.equals("ct"))
	//*  77  163:aload_0         
	//*  78  164:ldc1            #12  <String "ct">
	//*  79  166:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  80  169:ifeq            177
			{
				i = 3;
	//   81  172:iconst_3        
	//   82  173:istore_2        
				break label0;
	//   83  174:goto            179
			}
			i = -1;
	//   84  177:iconst_m1       
	//   85  178:istore_2        
		}
		switch(i)
	//*  86  179:iload_2         
		{
	//*  87  180:tableswitch     0 7: default 228
	//	               0 273
	//	               1 273
	//	               2 273
	//	               3 273
	//	               4 273
	//	               5 273
	//	               6 261
	//	               7 231
		default:
			return "";
	//   88  228:ldc1            #242 <String "">
	//   89  230:areturn         

		case 7: // '\007'
			s = s1.trim().toLowerCase();
	//   90  231:aload_1         
	//   91  232:invokevirtual   #245 <Method String String.trim()>
	//   92  235:invokevirtual   #176 <Method String String.toLowerCase()>
	//   93  238:astore_0        
			if(s.length() > 0)
	//*  94  239:aload_0         
	//*  95  240:invokevirtual   #248 <Method int String.length()>
	//*  96  243:ifle            256
				s = s.substring(0, 1);
	//   97  246:aload_0         
	//   98  247:iconst_0        
	//   99  248:iconst_1        
	//  100  249:invokevirtual   #252 <Method String String.substring(int, int)>
	//  101  252:astore_0        
			else
	//* 102  253:goto            259
				s = "";
	//  103  256:ldc1            #242 <String "">
	//  104  258:astore_0        
			return s;
	//  105  259:aload_0         
	//  106  260:areturn         

		case 6: // '\006'
			return s1.trim().replaceAll("[^0-9]", "");
	//  107  261:aload_1         
	//  108  262:invokevirtual   #245 <Method String String.trim()>
	//  109  265:ldc1            #254 <String "[^0-9]">
	//  110  267:ldc1            #242 <String "">
	//  111  269:invokevirtual   #257 <Method String String.replaceAll(String, String)>
	//  112  272:areturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return s1.trim().toLowerCase();
	//  113  273:aload_1         
	//  114  274:invokevirtual   #245 <Method String String.trim()>
	//  115  277:invokevirtual   #176 <Method String String.toLowerCase()>
	//  116  280:areturn         
		}
	}

	public static void setUserDataAndHash(Bundle bundle)
	{
		if(!initialized)
	//*   0    0:getstatic       #61  <Field boolean initialized>
	//*   1    3:ifne            19
		{
			Log.w(TAG, "initStore should have been called before calling setUserData");
	//    2    6:getstatic       #117 <Field String TAG>
	//    3    9:ldc2            #261 <String "initStore should have been called before calling setUserData">
	//    4   12:invokestatic    #125 <Method int Log.w(String, String)>
	//    5   15:pop             
			initAndWait();
	//    6   16:invokestatic    #67  <Method void initAndWait()>
		}
		AppEventsLogger.getAnalyticsExecutor().execute(new Runnable(bundle) {

			public void run()
			{
				UserDataStore.lock.writeLock().lock();
			//    0    0:invokestatic    #25  <Method ReentrantReadWriteLock UserDataStore.access$100()>
			//    1    3:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
			//    2    6:invokevirtual   #36  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
				UserDataStore.hashedUserData = UserDataStore.hashUserData(ud);
			//    3    9:aload_0         
			//    4   10:getfield        #16  <Field Bundle val$ud>
			//    5   13:invokestatic    #40  <Method String UserDataStore.access$300(Bundle)>
			//    6   16:invokestatic    #44  <Method String UserDataStore.access$202(String)>
			//    7   19:pop             
				android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
			//    8   20:invokestatic    #50  <Method android.content.Context FacebookSdk.getApplicationContext()>
			//    9   23:invokestatic    #56  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
			//   10   26:invokeinterface #62  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
			//   11   31:astore_1        
				editor.putString("com.facebook.appevents.UserDataStore.userData", UserDataStore.hashedUserData);
			//   12   32:aload_1         
			//   13   33:ldc1            #64  <String "com.facebook.appevents.UserDataStore.userData">
			//   14   35:invokestatic    #68  <Method String UserDataStore.access$200()>
			//   15   38:invokeinterface #74  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
			//   16   43:pop             
				editor.apply();
			//   17   44:aload_1         
			//   18   45:invokeinterface #77  <Method void android.content.SharedPreferences$Editor.apply()>
				UserDataStore.lock.writeLock().unlock();
			//   19   50:invokestatic    #25  <Method ReentrantReadWriteLock UserDataStore.access$100()>
			//   20   53:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
			//   21   56:invokevirtual   #80  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
				return;
			//   22   59:return          
				Exception exception;
				exception;
			//   23   60:astore_1        
				UserDataStore.lock.writeLock().unlock();
			//   24   61:invokestatic    #25  <Method ReentrantReadWriteLock UserDataStore.access$100()>
			//   25   64:invokevirtual   #31  <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
			//   26   67:invokevirtual   #80  <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
				throw exception;
			//   27   70:aload_1         
			//   28   71:athrow          
			}

			final Bundle val$ud;

			
			{
				ud = bundle;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Bundle val$ud>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    7   19:invokestatic    #219 <Method Executor AppEventsLogger.getAnalyticsExecutor()>
	//    8   22:new             #8   <Class UserDataStore$2>
	//    9   25:dup             
	//   10   26:aload_0         
	//   11   27:invokespecial   #263 <Method void UserDataStore$2(Bundle)>
	//   12   30:invokeinterface #226 <Method void Executor.execute(Runnable)>
	//   13   35:return          
	}

	public static void setUserDataAndHash(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
			String s8, String s9)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #143 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #266 <Method void Bundle()>
	//    3    7:astore          10
		if(s != null)
	//*   4    9:aload_0         
	//*   5   10:ifnull          21
			bundle.putString("em", s);
	//    6   13:aload           10
	//    7   15:ldc1            #21  <String "em">
	//    8   17:aload_0         
	//    9   18:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s1 != null)
	//*  10   21:aload_1         
	//*  11   22:ifnull          33
			bundle.putString("fn", s1);
	//   12   25:aload           10
	//   13   27:ldc1            #24  <String "fn">
	//   14   29:aload_1         
	//   15   30:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s2 != null)
	//*  16   33:aload_2         
	//*  17   34:ifnull          45
			bundle.putString("ln", s2);
	//   18   37:aload           10
	//   19   39:ldc1            #30  <String "ln">
	//   20   41:aload_2         
	//   21   42:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s3 != null)
	//*  22   45:aload_3         
	//*  23   46:ifnull          57
			bundle.putString("ph", s3);
	//   24   49:aload           10
	//   25   51:ldc1            #33  <String "ph">
	//   26   53:aload_3         
	//   27   54:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s4 != null)
	//*  28   57:aload           4
	//*  29   59:ifnull          71
			bundle.putString("db", s4);
	//   30   62:aload           10
	//   31   64:ldc1            #18  <String "db">
	//   32   66:aload           4
	//   33   68:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s5 != null)
	//*  34   71:aload           5
	//*  35   73:ifnull          85
			bundle.putString("ge", s5);
	//   36   76:aload           10
	//   37   78:ldc1            #27  <String "ge">
	//   38   80:aload           5
	//   39   82:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s6 != null)
	//*  40   85:aload           6
	//*  41   87:ifnull          99
			bundle.putString("ct", s6);
	//   42   90:aload           10
	//   43   92:ldc1            #12  <String "ct">
	//   44   94:aload           6
	//   45   96:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s7 != null)
	//*  46   99:aload           7
	//*  47  101:ifnull          113
			bundle.putString("st", s7);
	//   48  104:aload           10
	//   49  106:ldc1            #36  <String "st">
	//   50  108:aload           7
	//   51  110:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s8 != null)
	//*  52  113:aload           8
	//*  53  115:ifnull          127
			bundle.putString("zp", s8);
	//   54  118:aload           10
	//   55  120:ldc1            #45  <String "zp">
	//   56  122:aload           8
	//   57  124:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		if(s9 != null)
	//*  58  127:aload           9
	//*  59  129:ifnull          141
			bundle.putString("country", s9);
	//   60  132:aload           10
	//   61  134:ldc1            #15  <String "country">
	//   62  136:aload           9
	//   63  138:invokevirtual   #270 <Method void Bundle.putString(String, String)>
		setUserDataAndHash(bundle);
	//   64  141:aload           10
	//   65  143:invokestatic    #272 <Method void setUserDataAndHash(Bundle)>
	//   66  146:return          
	}

	public static final String CITY = "ct";
	public static final String COUNTRY = "country";
	public static final String DATE_OF_BIRTH = "db";
	public static final String EMAIL = "em";
	public static final String FIRST_NAME = "fn";
	public static final String GENDER = "ge";
	public static final String LAST_NAME = "ln";
	public static final String PHONE = "ph";
	public static final String STATE = "st";
	private static final String TAG = "UserDataStore";
	private static final String USER_DATA_KEY = "com.facebook.appevents.UserDataStore.userData";
	public static final String ZIP = "zp";
	private static String hashedUserData;
	private static volatile boolean initialized = false;
	private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	static 
	{
	//    0    0:new             #54  <Class ReentrantReadWriteLock>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void ReentrantReadWriteLock()>
	//    3    7:putstatic       #59  <Field ReentrantReadWriteLock lock>
	//    4   10:iconst_0        
	//    5   11:putstatic       #61  <Field boolean initialized>
	//*   6   14:return          
	}


/*
	static void access$000()
	{
		initAndWait();
	//    0    0:invokestatic    #67  <Method void initAndWait()>
		return;
	//    1    3:return          
	}

*/


/*
	static ReentrantReadWriteLock access$100()
	{
		return lock;
	//    0    0:getstatic       #59  <Field ReentrantReadWriteLock lock>
	//    1    3:areturn         
	}

*/


/*
	static String access$200()
	{
		return hashedUserData;
	//    0    0:getstatic       #73  <Field String hashedUserData>
	//    1    3:areturn         
	}

*/


/*
	static String access$202(String s)
	{
		hashedUserData = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #73  <Field String hashedUserData>
		return s;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static String access$300(Bundle bundle)
	{
		return hashUserData(bundle);
	//    0    0:aload_0         
	//    1    1:invokestatic    #80  <Method String hashUserData(Bundle)>
	//    2    4:areturn         
	}

*/
}
