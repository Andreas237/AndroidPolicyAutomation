// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.gigya.socialize.android.log.GigyaLog;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.Certificate;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.gigya.socialize.android.utils:
//			SessionEncryption, Utils

public class SessionEncryptLPMR2Impl extends SessionEncryption
{

	SessionEncryptLPMR2Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void SessionEncryption()>
	//    2    4:aload_0         
	//    3    5:ldc1            #23  <String "RSA/ECB/PKCS1Padding">
	//    4    7:putfield        #25  <Field String RSA_CIPHER>
		loadKeyStore();
	//    5   10:aload_0         
	//    6   11:invokespecial   #28  <Method void loadKeyStore()>
	//    7   14:return          
	}

	private void loadKeyStore()
	{
		try
		{
			keyStore = KeyStore.getInstance("AndroidKeyStore");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "AndroidKeyStore">
	//    2    3:invokestatic    #37  <Method KeyStore KeyStore.getInstance(String)>
	//    3    6:putfield        #39  <Field KeyStore keyStore>
			keyStore.load(((java.security.KeyStore.LoadStoreParameter) (null)));
	//    4    9:aload_0         
	//    5   10:getfield        #39  <Field KeyStore keyStore>
	//    6   13:aconst_null     
	//    7   14:invokevirtual   #43  <Method void KeyStore.load(java.security.KeyStore$LoadStoreParameter)>
			return;
	//    8   17:return          
		}
		catch(Exception exception)
	//*   9   18:astore_1        
		{
			exception.printStackTrace();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #46  <Method void Exception.printStackTrace()>
			throw new SessionEncryption.SessionEncryptionException("Session encryption exception | exception loading keystore", exception.getCause());
	//   12   23:new             #48  <Class SessionEncryption$SessionEncryptionException>
	//   13   26:dup             
	//   14   27:ldc1            #50  <String "Session encryption exception | exception loading keystore">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #54  <Method Throwable Exception.getCause()>
	//   17   33:invokespecial   #57  <Method void SessionEncryption$SessionEncryptionException(String, Throwable)>
	//   18   36:athrow          
		}
	}

	private void setFakeEnglishLocale(Context context)
	{
		setLocale(context, Locale.ENGLISH);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #65  <Field Locale Locale.ENGLISH>
	//    3    5:invokespecial   #69  <Method void setLocale(Context, Locale)>
	//    4    8:return          
	}

	private void setLocale(Context context, Locale locale)
	{
		if(android.os.Build.VERSION.SDK_INT >= 25)
	//*   0    0:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmplt          15
		{
			updateResources(context, locale);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokespecial   #78  <Method void updateResources(Context, Locale)>
			return;
	//    7   14:return          
		} else
		{
			updateResourcesLegacy(context, locale);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:invokespecial   #81  <Method void updateResourcesLegacy(Context, Locale)>
			return;
	//   12   21:return          
		}
	}

	private void updateResources(Context context, Locale locale)
	{
		Locale.setDefault(locale);
	//    0    0:aload_2         
	//    1    1:invokestatic    #88  <Method void Locale.setDefault(Locale)>
		Configuration configuration = context.getResources().getConfiguration();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method Resources Context.getResources()>
	//    4    8:invokevirtual   #100 <Method Configuration Resources.getConfiguration()>
	//    5   11:astore_3        
		configuration.setLocale(locale);
	//    6   12:aload_3         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #104 <Method void Configuration.setLocale(Locale)>
		configuration.setLayoutDirection(locale);
	//    9   17:aload_3         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #107 <Method void Configuration.setLayoutDirection(Locale)>
		context.createConfigurationContext(configuration);
	//   12   22:aload_1         
	//   13   23:aload_3         
	//   14   24:invokevirtual   #111 <Method Context Context.createConfigurationContext(Configuration)>
	//   15   27:pop             
	//   16   28:return          
	}

	private void updateResourcesLegacy(Context context, Locale locale)
	{
		Locale.setDefault(locale);
	//    0    0:aload_2         
	//    1    1:invokestatic    #88  <Method void Locale.setDefault(Locale)>
		context = ((Context) (context.getResources()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method Resources Context.getResources()>
	//    4    8:astore_1        
		Configuration configuration = ((Resources) (context)).getConfiguration();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #100 <Method Configuration Resources.getConfiguration()>
	//    7   13:astore_3        
		configuration.locale = locale;
	//    8   14:aload_3         
	//    9   15:aload_2         
	//   10   16:putfield        #115 <Field Locale Configuration.locale>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  11   19:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   22:bipush          17
	//*  13   24:icmplt          32
			configuration.setLayoutDirection(locale);
	//   14   27:aload_3         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #107 <Method void Configuration.setLayoutDirection(Locale)>
		((Resources) (context)).updateConfiguration(configuration, ((Resources) (context)).getDisplayMetrics());
	//   17   32:aload_1         
	//   18   33:aload_3         
	//   19   34:aload_1         
	//   20   35:invokevirtual   #119 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   21   38:invokevirtual   #123 <Method void Resources.updateConfiguration(Configuration, android.util.DisplayMetrics)>
	//   22   41:return          
	}

	public SecretKey init(Context context, SharedPreferences sharedpreferences)
	{
		if(keyStore.containsAlias("GS_ALIAS")) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field KeyStore keyStore>
	//    2    4:ldc1            #11  <String "GS_ALIAS">
	//    3    6:invokevirtual   #132 <Method boolean KeyStore.containsAlias(String)>
	//    4    9:ifne            379
_L1:
		int i;
		Object obj;
		Object obj2;
		Locale locale;
		KeyPairGenerator keypairgenerator;
		GigyaLog.i("SessionEncryptLPMR2Impl", "Generate keystore instance & secret key");
	//    5   12:ldc1            #14  <String "SessionEncryptLPMR2Impl">
	//    6   14:ldc1            #134 <String "Generate keystore instance & secret key">
	//    7   16:invokestatic    #140 <Method void GigyaLog.i(String, String)>
		locale = Locale.getDefault();
	//    8   19:invokestatic    #144 <Method Locale Locale.getDefault()>
	//    9   22:astore          7
		setFakeEnglishLocale(context);
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokespecial   #146 <Method void setFakeEnglishLocale(Context)>
		keypairgenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
	//   13   29:ldc1            #148 <String "RSA">
	//   14   31:ldc1            #8   <String "AndroidKeyStore">
	//   15   33:invokestatic    #153 <Method KeyPairGenerator KeyPairGenerator.getInstance(String, String)>
	//   16   36:astore          8
		obj = ((Object) (Calendar.getInstance()));
	//   17   38:invokestatic    #158 <Method Calendar Calendar.getInstance()>
	//   18   41:astore          4
		obj2 = ((Object) (Calendar.getInstance()));
	//   19   43:invokestatic    #158 <Method Calendar Calendar.getInstance()>
	//   20   46:astore          6
		((Calendar) (obj2)).add(1, 25);
	//   21   48:aload           6
	//   22   50:iconst_1        
	//   23   51:bipush          25
	//   24   53:invokevirtual   #162 <Method void Calendar.add(int, int)>
		i = android.os.Build.VERSION.SDK_INT;
	//   25   56:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//   26   59:istore_3        
		Object obj1 = null;
	//   27   60:aconst_null     
	//   28   61:astore          5
		if(i < 23) goto _L4; else goto _L3
	//   29   63:iload_3         
	//   30   64:bipush          23
	//   31   66:icmplt          131
_L3:
		try
		{
			obj1 = ((Object) ((new android.security.keystore.KeyGenParameterSpec.Builder("GS_ALIAS", 3)).setDigests(new String[] {
				"SHA-256", "SHA-512"
			}).setBlockModes(new String[] {
				"ECB"
			}).setEncryptionPaddings(new String[] {
				"PKCS1Padding"
			}).build()));
	//   32   69:new             #164 <Class android.security.keystore.KeyGenParameterSpec$Builder>
	//   33   72:dup             
	//   34   73:ldc1            #11  <String "GS_ALIAS">
	//   35   75:iconst_3        
	//   36   76:invokespecial   #167 <Method void android.security.keystore.KeyGenParameterSpec$Builder(String, int)>
	//   37   79:iconst_2        
	//   38   80:anewarray       String[]
	//   39   83:dup             
	//   40   84:iconst_0        
	//   41   85:ldc1            #171 <String "SHA-256">
	//   42   87:aastore         
	//   43   88:dup             
	//   44   89:iconst_1        
	//   45   90:ldc1            #173 <String "SHA-512">
	//   46   92:aastore         
	//   47   93:invokevirtual   #177 <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setDigests(String[])>
	//   48   96:iconst_1        
	//   49   97:anewarray       String[]
	//   50  100:dup             
	//   51  101:iconst_0        
	//   52  102:ldc1            #179 <String "ECB">
	//   53  104:aastore         
	//   54  105:invokevirtual   #182 <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setBlockModes(String[])>
	//   55  108:iconst_1        
	//   56  109:anewarray       String[]
	//   57  112:dup             
	//   58  113:iconst_0        
	//   59  114:ldc1            #184 <String "PKCS1Padding">
	//   60  116:aastore         
	//   61  117:invokevirtual   #187 <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setEncryptionPaddings(String[])>
	//   62  120:invokevirtual   #191 <Method android.security.keystore.KeyGenParameterSpec android.security.keystore.KeyGenParameterSpec$Builder.build()>
	//   63  123:astore          5
		}
	//*  64  125:aconst_null     
	//*  65  126:astore          4
	//*  66  128:goto            438
	//*  67  131:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//*  68  134:bipush          19
	//*  69  136:icmplt          209
	//*  70  139:new             #193 <Class android.security.KeyPairGeneratorSpec$Builder>
	//*  71  142:dup             
	//*  72  143:aload_1         
	//*  73  144:invokespecial   #195 <Method void android.security.KeyPairGeneratorSpec$Builder(Context)>
	//*  74  147:ldc1            #11  <String "GS_ALIAS">
	//*  75  149:invokevirtual   #199 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setAlias(String)>
	//*  76  152:sipush          2048
	//*  77  155:invokevirtual   #203 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setKeySize(int)>
	//*  78  158:ldc1            #148 <String "RSA">
	//*  79  160:invokevirtual   #206 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setKeyType(String)>
	//*  80  163:aload           6
	//*  81  165:invokevirtual   #210 <Method java.util.Date Calendar.getTime()>
	//*  82  168:invokevirtual   #214 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setEndDate(java.util.Date)>
	//*  83  171:aload           4
	//*  84  173:invokevirtual   #210 <Method java.util.Date Calendar.getTime()>
	//*  85  176:invokevirtual   #217 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setStartDate(java.util.Date)>
	//*  86  179:getstatic       #223 <Field BigInteger BigInteger.ONE>
	//*  87  182:invokevirtual   #227 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setSerialNumber(BigInteger)>
	//*  88  185:new             #229 <Class X500Principal>
	//*  89  188:dup             
	//*  90  189:ldc1            #231 <String "CN = Secured Preference Store, O = Devliving Online">
	//*  91  191:invokespecial   #234 <Method void X500Principal(String)>
	//*  92  194:invokevirtual   #238 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setSubject(X500Principal)>
	//*  93  197:astore          4
	//*  94  199:aload           4
	//*  95  201:invokevirtual   #241 <Method android.security.KeyPairGeneratorSpec android.security.KeyPairGeneratorSpec$Builder.build()>
	//*  96  204:astore          4
	//*  97  206:goto            438
	//*  98  209:new             #193 <Class android.security.KeyPairGeneratorSpec$Builder>
	//*  99  212:dup             
	//* 100  213:aload_1         
	//* 101  214:invokespecial   #195 <Method void android.security.KeyPairGeneratorSpec$Builder(Context)>
	//* 102  217:ldc1            #11  <String "GS_ALIAS">
	//* 103  219:invokevirtual   #199 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setAlias(String)>
	//* 104  222:aload           6
	//* 105  224:invokevirtual   #210 <Method java.util.Date Calendar.getTime()>
	//* 106  227:invokevirtual   #214 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setEndDate(java.util.Date)>
	//* 107  230:aload           4
	//* 108  232:invokevirtual   #210 <Method java.util.Date Calendar.getTime()>
	//* 109  235:invokevirtual   #217 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setStartDate(java.util.Date)>
	//* 110  238:getstatic       #223 <Field BigInteger BigInteger.ONE>
	//* 111  241:invokevirtual   #227 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setSerialNumber(BigInteger)>
	//* 112  244:new             #229 <Class X500Principal>
	//* 113  247:dup             
	//* 114  248:ldc1            #231 <String "CN = Secured Preference Store, O = Devliving Online">
	//* 115  250:invokespecial   #234 <Method void X500Principal(String)>
	//* 116  253:invokevirtual   #238 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setSubject(X500Principal)>
	//* 117  256:astore          4
	//* 118  258:goto            199
	//* 119  261:aload           8
	//* 120  263:aload           6
	//* 121  265:invokevirtual   #245 <Method void KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec)>
	//* 122  268:aload           8
	//* 123  270:invokevirtual   #249 <Method java.security.KeyPair KeyPairGenerator.generateKeyPair()>
	//* 124  273:pop             
	//* 125  274:aload_0         
	//* 126  275:getfield        #39  <Field KeyStore keyStore>
	//* 127  278:ldc1            #11  <String "GS_ALIAS">
	//* 128  280:invokevirtual   #253 <Method Certificate KeyStore.getCertificate(String)>
	//* 129  283:invokevirtual   #259 <Method java.security.PublicKey Certificate.getPublicKey()>
	//* 130  286:astore          5
	//* 131  288:ldc2            #261 <String "AES">
	//* 132  291:invokestatic    #266 <Method KeyGenerator KeyGenerator.getInstance(String)>
	//* 133  294:astore          4
	//* 134  296:aload           4
	//* 135  298:sipush          128
	//* 136  301:invokevirtual   #269 <Method void KeyGenerator.init(int)>
	//* 137  304:aload           4
	//* 138  306:invokevirtual   #273 <Method SecretKey KeyGenerator.generateKey()>
	//* 139  309:astore          4
	//* 140  311:ldc1            #23  <String "RSA/ECB/PKCS1Padding">
	//* 141  313:invokestatic    #278 <Method Cipher Cipher.getInstance(String)>
	//* 142  316:astore          6
	//* 143  318:aload           6
	//* 144  320:iconst_1        
	//* 145  321:aload           5
	//* 146  323:invokevirtual   #281 <Method void Cipher.init(int, java.security.Key)>
	//* 147  326:aload           6
	//* 148  328:aload           4
	//* 149  330:invokeinterface #287 <Method byte[] SecretKey.getEncoded()>
	//* 150  335:invokevirtual   #291 <Method byte[] Cipher.doFinal(byte[])>
	//* 151  338:invokestatic    #297 <Method String Utils.bytesToString(byte[])>
	//* 152  341:astore          5
	//* 153  343:aload_2         
	//* 154  344:invokeinterface #303 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 155  349:astore_2        
	//* 156  350:aload_2         
	//* 157  351:ldc2            #305 <String "GS_PREFA">
	//* 158  354:aload           5
	//* 159  356:invokeinterface #311 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 160  361:pop             
	//* 161  362:aload_2         
	//* 162  363:invokeinterface #315 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//* 163  368:pop             
	//* 164  369:aload_0         
	//* 165  370:aload_1         
	//* 166  371:aload           7
	//* 167  373:invokespecial   #69  <Method void setLocale(Context, Locale)>
	//* 168  376:aload           4
	//* 169  378:areturn         
	//* 170  379:aload_0         
	//* 171  380:getfield        #39  <Field KeyStore keyStore>
	//* 172  383:ldc1            #11  <String "GS_ALIAS">
	//* 173  385:ldc2            #317 <Class java.security.KeyStore$PrivateKeyEntry>
	//* 174  388:invokevirtual   #321 <Method boolean KeyStore.entryInstanceOf(String, Class)>
	//* 175  391:ifne            410
	//* 176  394:aload_0         
	//* 177  395:getfield        #39  <Field KeyStore keyStore>
	//* 178  398:ldc1            #11  <String "GS_ALIAS">
	//* 179  400:invokevirtual   #324 <Method void KeyStore.deleteEntry(String)>
	//* 180  403:aload_0         
	//* 181  404:aload_1         
	//* 182  405:aload_2         
	//* 183  406:invokevirtual   #326 <Method SecretKey init(Context, SharedPreferences)>
	//* 184  409:areturn         
	//* 185  410:aload_0         
	//* 186  411:aload_2         
	//* 187  412:invokevirtual   #330 <Method SecretKey loadSecret(SharedPreferences)>
	//* 188  415:astore_1        
	//* 189  416:aload_1         
	//* 190  417:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 191  418:astore_1        
		{
			((Exception) (context)).printStackTrace();
	//  192  419:aload_1         
	//  193  420:invokevirtual   #46  <Method void Exception.printStackTrace()>
			throw new SessionEncryption.SessionEncryptionException("Session encryption exception | exception while generating secret key", ((Exception) (context)).getCause());
	//  194  423:new             #48  <Class SessionEncryption$SessionEncryptionException>
	//  195  426:dup             
	//  196  427:ldc2            #332 <String "Session encryption exception | exception while generating secret key">
	//  197  430:aload_1         
	//  198  431:invokevirtual   #54  <Method Throwable Exception.getCause()>
	//  199  434:invokespecial   #57  <Method void SessionEncryption$SessionEncryptionException(String, Throwable)>
	//  200  437:athrow          
		}
		obj = null;
		  goto _L5
_L4:
		if(android.os.Build.VERSION.SDK_INT < 19) goto _L7; else goto _L6
_L6:
		obj = ((Object) ((new android.security.KeyPairGeneratorSpec.Builder(context)).setAlias("GS_ALIAS").setKeySize(2048).setKeyType("RSA").setEndDate(((Calendar) (obj2)).getTime()).setStartDate(((Calendar) (obj)).getTime()).setSerialNumber(BigInteger.ONE).setSubject(new X500Principal("CN = Secured Preference Store, O = Devliving Online"))));
_L8:
		obj = ((Object) (((android.security.KeyPairGeneratorSpec.Builder) (obj)).build()));
		  goto _L5
_L7:
		obj = ((Object) ((new android.security.KeyPairGeneratorSpec.Builder(context)).setAlias("GS_ALIAS").setEndDate(((Calendar) (obj2)).getTime()).setStartDate(((Calendar) (obj)).getTime()).setSerialNumber(BigInteger.ONE).setSubject(new X500Principal("CN = Secured Preference Store, O = Devliving Online"))));
		  goto _L8
_L10:
		keypairgenerator.initialize(((java.security.spec.AlgorithmParameterSpec) (obj2)));
		keypairgenerator.generateKeyPair();
		obj1 = ((Object) (keyStore.getCertificate("GS_ALIAS").getPublicKey()));
		obj = ((Object) (KeyGenerator.getInstance("AES")));
		((KeyGenerator) (obj)).init(128);
		obj = ((Object) (((KeyGenerator) (obj)).generateKey()));
		obj2 = ((Object) (Cipher.getInstance("RSA/ECB/PKCS1Padding")));
		((Cipher) (obj2)).init(1, ((java.security.Key) (obj1)));
		obj1 = ((Object) (Utils.bytesToString(((Cipher) (obj2)).doFinal(((SecretKey) (obj)).getEncoded()))));
		sharedpreferences = ((SharedPreferences) (sharedpreferences.edit()));
		((android.content.SharedPreferences.Editor) (sharedpreferences)).putString("GS_PREFA", ((String) (obj1)));
		((android.content.SharedPreferences.Editor) (sharedpreferences)).commit();
		setLocale(context, locale);
		return ((SecretKey) (obj));
_L2:
		if(!keyStore.entryInstanceOf("GS_ALIAS", java/security/KeyStore$PrivateKeyEntry))
		{
			keyStore.deleteEntry("GS_ALIAS");
			return init(context, sharedpreferences);
		}
		context = ((Context) (loadSecret(sharedpreferences)));
		return ((SecretKey) (context));
_L5:
		obj2 = obj;
	//  201  438:aload           4
	//  202  440:astore          6
		if(obj == null)
	//* 203  442:aload           4
	//* 204  444:ifnonnull       261
			obj2 = obj1;
	//  205  447:aload           5
	//  206  449:astore          6
		if(true) goto _L10; else goto _L9
	//  207  451:goto            261
_L9:
	}

	public SecretKey loadSecret(SharedPreferences sharedpreferences)
	{
		PrivateKey privatekey;
		Cipher cipher;
		try
		{
			sharedpreferences = ((SharedPreferences) (sharedpreferences.getString("GS_PREFA", ((String) (null)))));
	//    0    0:aload_1         
	//    1    1:ldc2            #305 <String "GS_PREFA">
	//    2    4:aconst_null     
	//    3    5:invokeinterface #336 <Method String SharedPreferences.getString(String, String)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnull          94
	//*   7   15:aload_0         
	//*   8   16:getfield        #39  <Field KeyStore keyStore>
	//*   9   19:ldc1            #11  <String "GS_ALIAS">
	//*  10   21:invokevirtual   #132 <Method boolean KeyStore.containsAlias(String)>
	//*  11   24:ifeq            94
	//*  12   27:aload_0         
	//*  13   28:getfield        #39  <Field KeyStore keyStore>
	//*  14   31:ldc1            #11  <String "GS_ALIAS">
	//*  15   33:ldc2            #317 <Class java.security.KeyStore$PrivateKeyEntry>
	//*  16   36:invokevirtual   #321 <Method boolean KeyStore.entryInstanceOf(String, Class)>
	//*  17   39:ifeq            94
	//*  18   42:aload_0         
	//*  19   43:getfield        #39  <Field KeyStore keyStore>
	//*  20   46:ldc1            #11  <String "GS_ALIAS">
	//*  21   48:aconst_null     
	//*  22   49:invokevirtual   #340 <Method java.security.Key KeyStore.getKey(String, char[])>
	//*  23   52:checkcast       #342 <Class PrivateKey>
	//*  24   55:astore_2        
	//*  25   56:ldc1            #23  <String "RSA/ECB/PKCS1Padding">
	//*  26   58:invokestatic    #278 <Method Cipher Cipher.getInstance(String)>
	//*  27   61:astore_3        
	//*  28   62:aload_3         
	//*  29   63:iconst_2        
	//*  30   64:aload_2         
	//*  31   65:invokevirtual   #281 <Method void Cipher.init(int, java.security.Key)>
	//*  32   68:aload_3         
	//*  33   69:aload_1         
	//*  34   70:invokestatic    #346 <Method byte[] Utils.stringToBytes(String)>
	//*  35   73:invokevirtual   #291 <Method byte[] Cipher.doFinal(byte[])>
	//*  36   76:astore_1        
	//*  37   77:new             #348 <Class SecretKeySpec>
	//*  38   80:dup             
	//*  39   81:aload_1         
	//*  40   82:iconst_0        
	//*  41   83:aload_1         
	//*  42   84:arraylength     
	//*  43   85:ldc2            #261 <String "AES">
	//*  44   88:invokespecial   #351 <Method void SecretKeySpec(byte[], int, int, String)>
	//*  45   91:astore_1        
	//*  46   92:aload_1         
	//*  47   93:areturn         
	//*  48   94:aconst_null     
	//*  49   95:areturn         
		// Misplaced declaration of an exception variable
		catch(SharedPreferences sharedpreferences)
	//*  50   96:astore_1        
		{
			((Exception) (sharedpreferences)).printStackTrace();
	//   51   97:aload_1         
	//   52   98:invokevirtual   #46  <Method void Exception.printStackTrace()>
			throw new SessionEncryption.SessionEncryptionException("Session encryption exception | exception while loading secret key", ((Exception) (sharedpreferences)).getCause());
	//   53  101:new             #48  <Class SessionEncryption$SessionEncryptionException>
	//   54  104:dup             
	//   55  105:ldc2            #353 <String "Session encryption exception | exception while loading secret key">
	//   56  108:aload_1         
	//   57  109:invokevirtual   #54  <Method Throwable Exception.getCause()>
	//   58  112:invokespecial   #57  <Method void SessionEncryption$SessionEncryptionException(String, Throwable)>
	//   59  115:athrow          
		}
		if(sharedpreferences == null)
			break MISSING_BLOCK_LABEL_94;
		if(!keyStore.containsAlias("GS_ALIAS") || !keyStore.entryInstanceOf("GS_ALIAS", java/security/KeyStore$PrivateKeyEntry))
			break MISSING_BLOCK_LABEL_94;
		privatekey = (PrivateKey)keyStore.getKey("GS_ALIAS", ((char []) (null)));
		cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(2, ((java.security.Key) (privatekey)));
		sharedpreferences = ((SharedPreferences) (cipher.doFinal(Utils.stringToBytes(((String) (sharedpreferences))))));
		sharedpreferences = ((SharedPreferences) (new SecretKeySpec(((byte []) (sharedpreferences)), 0, sharedpreferences.length, "AES")));
		return ((SecretKey) (sharedpreferences));
		return null;
	}

	private static final String ANDROID_KEY_STORE = "AndroidKeyStore";
	private static final String GS_KEYSTORE_ALIAS = "GS_ALIAS";
	private static final String TAG = "SessionEncryptLPMR2Impl";
	private final String RSA_CIPHER = "RSA/ECB/PKCS1Padding";
	private KeyStore keyStore;
}
