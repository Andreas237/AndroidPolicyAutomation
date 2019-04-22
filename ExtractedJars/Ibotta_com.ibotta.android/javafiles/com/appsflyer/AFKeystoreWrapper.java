// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.appsflyer:
//			AFLogger

class AFKeystoreWrapper
{

	public AFKeystoreWrapper(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void Object()>
	//    6   12:putfield        #29  <Field Object _fld02CB>
		_fld0971 = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #31  <Field Context _fld0971>
		_fld02CA = "";
	//   10   20:aload_0         
	//   11   21:ldc1            #33  <String "">
	//   12   23:putfield        #35  <Field String _fld02CA>
		_fld02CE = 0;
	//   13   26:aload_0         
	//   14   27:iconst_0        
	//   15   28:putfield        #37  <Field int _fld02CE>
		AFLogger.afInfoLog("Initialising KeyStore..");
	//   16   31:ldc1            #39  <String "Initialising KeyStore..">
	//   17   33:invokestatic    #45  <Method void AFLogger.afInfoLog(String)>
		try
		{
			_fld02CF = KeyStore.getInstance("AndroidKeyStore");
	//   18   36:aload_0         
	//   19   37:ldc1            #47  <String "AndroidKeyStore">
	//   20   39:invokestatic    #53  <Method KeyStore KeyStore.getInstance(String)>
	//   21   42:putfield        #55  <Field KeyStore _fld02CF>
			_fld02CF.load(((java.security.KeyStore.LoadStoreParameter) (null)));
	//   22   45:aload_0         
	//   23   46:getfield        #55  <Field KeyStore _fld02CF>
	//   24   49:aconst_null     
	//   25   50:invokevirtual   #59  <Method void KeyStore.load(java.security.KeyStore$LoadStoreParameter)>
			return;
	//   26   53:return          
		}
	//*  27   54:astore_1        
	//*  28   55:goto            67
	//*  29   58:astore_1        
	//*  30   59:goto            67
	//*  31   62:astore_1        
	//*  32   63:goto            67
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   33   66:astore_1        
		// Misplaced declaration of an exception variable
		catch(Context context) { }
		// Misplaced declaration of an exception variable
		catch(Context context) { }
		// Misplaced declaration of an exception variable
		catch(Context context) { }
		AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", ((Throwable) (context)));
	//   34   67:ldc1            #61  <String "Couldn't load keystore instance of type: AndroidKeyStore">
	//   35   69:aload_1         
	//   36   70:invokestatic    #65  <Method void AFLogger.afErrorLog(String, Throwable)>
	//   37   73:return          
	}

	private void _mth02CA(String s)
	{
		AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(((Object) (s)))));
	//    0    0:ldc1            #70  <String "Creating a new key with alias: ">
	//    1    2:aload_1         
	//    2    3:invokestatic    #76  <Method String String.valueOf(Object)>
	//    3    6:invokevirtual   #80  <Method String String.concat(String)>
	//    4    9:invokestatic    #45  <Method void AFLogger.afInfoLog(String)>
		Object obj;
		Object obj1;
		Object obj2;
		Calendar calendar;
		Calendar calendar1;
		try
		{
			calendar = Calendar.getInstance();
	//    5   12:invokestatic    #85  <Method Calendar Calendar.getInstance()>
	//    6   15:astore          5
			calendar1 = Calendar.getInstance();
	//    7   17:invokestatic    #85  <Method Calendar Calendar.getInstance()>
	//    8   20:astore          6
			calendar1.add(1, 5);
	//    9   22:aload           6
	//   10   24:iconst_1        
	//   11   25:iconst_5        
	//   12   26:invokevirtual   #89  <Method void Calendar.add(int, int)>
		}
	//*  13   29:aconst_null     
	//*  14   30:astore_3        
	//*  15   31:aload_0         
	//*  16   32:getfield        #29  <Field Object _fld02CB>
	//*  17   35:astore          4
	//*  18   37:aload           4
	//*  19   39:monitorenter    
	//*  20   40:aload_0         
	//*  21   41:getfield        #55  <Field KeyStore _fld02CF>
	//*  22   44:aload_1         
	//*  23   45:invokevirtual   #93  <Method boolean KeyStore.containsAlias(String)>
	//*  24   48:ifne            206
	//*  25   51:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   54:bipush          23
	//*  27   56:icmplt          109
	//*  28   59:new             #100 <Class android.security.keystore.KeyGenParameterSpec$Builder>
	//*  29   62:dup             
	//*  30   63:aload_1         
	//*  31   64:iconst_3        
	//*  32   65:invokespecial   #103 <Method void android.security.keystore.KeyGenParameterSpec$Builder(String, int)>
	//*  33   68:new             #105 <Class X500Principal>
	//*  34   71:dup             
	//*  35   72:ldc1            #107 <String "CN=AndroidSDK, O=AppsFlyer">
	//*  36   74:invokespecial   #109 <Method void X500Principal(String)>
	//*  37   77:invokevirtual   #113 <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setCertificateSubject(X500Principal)>
	//*  38   80:getstatic       #119 <Field BigInteger BigInteger.ONE>
	//*  39   83:invokevirtual   #123 <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setCertificateSerialNumber(BigInteger)>
	//*  40   86:aload           5
	//*  41   88:invokevirtual   #127 <Method java.util.Date Calendar.getTime()>
	//*  42   91:invokevirtual   #131 <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setCertificateNotBefore(java.util.Date)>
	//*  43   94:aload           6
	//*  44   96:invokevirtual   #127 <Method java.util.Date Calendar.getTime()>
	//*  45   99:invokevirtual   #134 <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setCertificateNotAfter(java.util.Date)>
	//*  46  102:invokevirtual   #138 <Method android.security.keystore.KeyGenParameterSpec android.security.keystore.KeyGenParameterSpec$Builder.build()>
	//*  47  105:astore_2        
	//*  48  106:goto            185
	//*  49  109:aload_3         
	//*  50  110:astore_2        
	//*  51  111:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  114:bipush          18
	//*  53  116:icmplt          185
	//*  54  119:aload_3         
	//*  55  120:astore_2        
	//*  56  121:ldc1            #140 <String "OPPO">
	//*  57  123:getstatic       #145 <Field String Build.BRAND>
	//*  58  126:invokevirtual   #149 <Method boolean Object.equals(Object)>
	//*  59  129:ifne            185
	//*  60  132:new             #151 <Class android.security.KeyPairGeneratorSpec$Builder>
	//*  61  135:dup             
	//*  62  136:aload_0         
	//*  63  137:getfield        #31  <Field Context _fld0971>
	//*  64  140:invokespecial   #153 <Method void android.security.KeyPairGeneratorSpec$Builder(Context)>
	//*  65  143:aload_1         
	//*  66  144:invokevirtual   #157 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setAlias(String)>
	//*  67  147:new             #105 <Class X500Principal>
	//*  68  150:dup             
	//*  69  151:ldc1            #107 <String "CN=AndroidSDK, O=AppsFlyer">
	//*  70  153:invokespecial   #109 <Method void X500Principal(String)>
	//*  71  156:invokevirtual   #161 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setSubject(X500Principal)>
	//*  72  159:getstatic       #119 <Field BigInteger BigInteger.ONE>
	//*  73  162:invokevirtual   #165 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setSerialNumber(BigInteger)>
	//*  74  165:aload           5
	//*  75  167:invokevirtual   #127 <Method java.util.Date Calendar.getTime()>
	//*  76  170:invokevirtual   #169 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setStartDate(java.util.Date)>
	//*  77  173:aload           6
	//*  78  175:invokevirtual   #127 <Method java.util.Date Calendar.getTime()>
	//*  79  178:invokevirtual   #172 <Method android.security.KeyPairGeneratorSpec$Builder android.security.KeyPairGeneratorSpec$Builder.setEndDate(java.util.Date)>
	//*  80  181:invokevirtual   #175 <Method android.security.KeyPairGeneratorSpec android.security.KeyPairGeneratorSpec$Builder.build()>
	//*  81  184:astore_2        
	//*  82  185:ldc1            #177 <String "RSA">
	//*  83  187:ldc1            #47  <String "AndroidKeyStore">
	//*  84  189:invokestatic    #182 <Method KeyPairGenerator KeyPairGenerator.getInstance(String, String)>
	//*  85  192:astore_1        
	//*  86  193:aload_1         
	//*  87  194:aload_2         
	//*  88  195:invokevirtual   #186 <Method void KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec)>
	//*  89  198:aload_1         
	//*  90  199:invokevirtual   #192 <Method java.security.KeyPair KeyPairGeneratorSpi.generateKeyPair()>
	//*  91  202:pop             
	//*  92  203:goto            218
	//*  93  206:ldc1            #194 <String "Alias already exists: ">
	//*  94  208:aload_1         
	//*  95  209:invokestatic    #76  <Method String String.valueOf(Object)>
	//*  96  212:invokevirtual   #80  <Method String String.concat(String)>
	//*  97  215:invokestatic    #45  <Method void AFLogger.afInfoLog(String)>
	//*  98  218:aload           4
	//*  99  220:monitorexit     
	//* 100  221:return          
	//* 101  222:astore_1        
	//* 102  223:aload           4
	//* 103  225:monitorexit     
	//* 104  226:aload_1         
	//* 105  227:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 106  228:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder("Exception ");
	//  107  229:new             #196 <Class StringBuilder>
	//  108  232:dup             
	//  109  233:ldc1            #198 <String "Exception ">
	//  110  235:invokespecial   #199 <Method void StringBuilder(String)>
	//  111  238:astore_2        
			stringbuilder.append(((Throwable) (s)).getMessage());
	//  112  239:aload_2         
	//  113  240:aload_1         
	//  114  241:invokevirtual   #203 <Method String Throwable.getMessage()>
	//  115  244:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//  116  247:pop             
			stringbuilder.append(" occurred");
	//  117  248:aload_2         
	//  118  249:ldc1            #209 <String " occurred">
	//  119  251:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//  120  254:pop             
			AFLogger.afErrorLog(((Object) (stringbuilder)).toString(), ((Throwable) (s)));
	//  121  255:aload_2         
	//  122  256:invokevirtual   #212 <Method String Object.toString()>
	//  123  259:aload_1         
	//  124  260:invokestatic    #65  <Method void AFLogger.afErrorLog(String, Throwable)>
			return;
	//  125  263:return          
		}
		obj1 = null;
		obj2 = _fld02CB;
		obj2;
		JVM INSTR monitorenter ;
		if(_fld02CF.containsAlias(s))
			break MISSING_BLOCK_LABEL_206;
		if(android.os.Build.VERSION.SDK_INT >= 23)
		{
			obj = ((Object) ((new android.security.keystore.KeyGenParameterSpec.Builder(s, 3)).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar1.getTime()).build()));
			break MISSING_BLOCK_LABEL_185;
		}
		obj = ((Object) (obj1));
		if(android.os.Build.VERSION.SDK_INT < 18)
			break MISSING_BLOCK_LABEL_185;
		obj = ((Object) (obj1));
		if(!((Object) ("OPPO")).equals(((Object) (Build.BRAND))))
			obj = ((Object) ((new android.security.KeyPairGeneratorSpec.Builder(_fld0971)).setAlias(s).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar1.getTime()).build()));
		s = ((String) (KeyPairGenerator.getInstance("RSA", "AndroidKeyStore")));
		((KeyPairGenerator) (s)).initialize(((java.security.spec.AlgorithmParameterSpec) (obj)));
		((KeyPairGeneratorSpi) (s)).generateKeyPair();
		break MISSING_BLOCK_LABEL_218;
		AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(((Object) (s)))));
		obj2;
		JVM INSTR monitorexit ;
		return;
		s;
		obj2;
		JVM INSTR monitorexit ;
		throw s;
	}

	private String _mth02CF()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #213 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("com.appsflyer,");
	//    4    8:aload_2         
	//    5    9:ldc1            #215 <String "com.appsflyer,">
	//    6   11:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		synchronized(_fld02CB)
	//*   8   15:aload_0         
	//*   9   16:getfield        #29  <Field Object _fld02CB>
	//*  10   19:astore_1        
	//*  11   20:aload_1         
	//*  12   21:monitorenter    
		{
			stringbuilder.append("KSAppsFlyerId=");
	//   13   22:aload_2         
	//   14   23:ldc1            #217 <String "KSAppsFlyerId=">
	//   15   25:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   16   28:pop             
			stringbuilder.append(_fld02CA);
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #35  <Field String _fld02CA>
	//   20   34:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
			stringbuilder.append(",");
	//   22   38:aload_2         
	//   23   39:ldc1            #219 <String ",">
	//   24   41:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   25   44:pop             
			stringbuilder.append("KSAppsFlyerRICounter=");
	//   26   45:aload_2         
	//   27   46:ldc1            #221 <String "KSAppsFlyerRICounter=">
	//   28   48:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   29   51:pop             
			stringbuilder.append(_fld02CE);
	//   30   52:aload_2         
	//   31   53:aload_0         
	//   32   54:getfield        #37  <Field int _fld02CE>
	//   33   57:invokevirtual   #224 <Method StringBuilder StringBuilder.append(int)>
	//   34   60:pop             
		}
	//   35   61:aload_1         
	//   36   62:monitorexit     
	//   37   63:aload_2         
	//   38   64:invokevirtual   #212 <Method String Object.toString()>
	//   39   67:areturn         
	//   40   68:astore_2        
	//   41   69:aload_1         
	//   42   70:monitorexit     
	//   43   71:aload_2         
	//   44   72:athrow          
		return ((Object) (stringbuilder)).toString();
	}

	final void _mth02CA()
	{
		String s = _mth02CF();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method String _mth02CF()>
	//    2    4:astore_3        
		Object obj = _fld02CB;
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field Object _fld02CB>
	//    5    9:astore_1        
		obj;
	//    6   10:aload_1         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		_fld02CE = _fld02CE + 1;
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #37  <Field int _fld02CE>
	//   11   17:iconst_1        
	//   12   18:iadd            
	//   13   19:putfield        #37  <Field int _fld02CE>
		AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(((Object) (s)))));
	//   14   22:ldc1            #228 <String "Deleting key with alias: ">
	//   15   24:aload_3         
	//   16   25:invokestatic    #76  <Method String String.valueOf(Object)>
	//   17   28:invokevirtual   #80  <Method String String.concat(String)>
	//   18   31:invokestatic    #45  <Method void AFLogger.afInfoLog(String)>
		synchronized(_fld02CB)
	//*  19   34:aload_0         
	//*  20   35:getfield        #29  <Field Object _fld02CB>
	//*  21   38:astore_2        
	//*  22   39:aload_2         
	//*  23   40:monitorenter    
		{
			_fld02CF.deleteEntry(s);
	//   24   41:aload_0         
	//   25   42:getfield        #55  <Field KeyStore _fld02CF>
	//   26   45:aload_3         
	//   27   46:invokevirtual   #231 <Method void KeyStore.deleteEntry(String)>
		}
	//   28   49:aload_2         
	//   29   50:monitorexit     
		break MISSING_BLOCK_LABEL_94;
	//   30   51:goto            94
		exception;
	//   31   54:astore_3        
		obj1;
	//   32   55:aload_2         
		JVM INSTR monitorexit ;
	//   33   56:monitorexit     
		throw exception;
	//   34   57:aload_3         
	//   35   58:athrow          
		Object obj2;
		obj2;
	//   36   59:astore_2        
		StringBuilder stringbuilder = new StringBuilder("Exception ");
	//   37   60:new             #196 <Class StringBuilder>
	//   38   63:dup             
	//   39   64:ldc1            #198 <String "Exception ">
	//   40   66:invokespecial   #199 <Method void StringBuilder(String)>
	//   41   69:astore_3        
		stringbuilder.append(((Throwable) (obj2)).getMessage());
	//   42   70:aload_3         
	//   43   71:aload_2         
	//   44   72:invokevirtual   #203 <Method String Throwable.getMessage()>
	//   45   75:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   46   78:pop             
		stringbuilder.append(" occurred");
	//   47   79:aload_3         
	//   48   80:ldc1            #209 <String " occurred">
	//   49   82:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   50   85:pop             
		AFLogger.afErrorLog(((Object) (stringbuilder)).toString(), ((Throwable) (obj2)));
	//   51   86:aload_3         
	//   52   87:invokevirtual   #212 <Method String Object.toString()>
	//   53   90:aload_2         
	//   54   91:invokestatic    #65  <Method void AFLogger.afErrorLog(String, Throwable)>
		obj;
	//   55   94:aload_1         
		JVM INSTR monitorexit ;
	//   56   95:monitorexit     
		_mth02CA(_mth02CF());
	//   57   96:aload_0         
	//   58   97:aload_0         
	//   59   98:invokespecial   #226 <Method String _mth02CF()>
	//   60  101:invokespecial   #233 <Method void _mth02CA(String)>
		return;
	//   61  104:return          
		obj2;
	//   62  105:astore_2        
	//*  63  106:aload_1         
		throw obj2;
	//   64  107:monitorexit     
	//   65  108:aload_2         
	//   66  109:athrow          
	}

	final int _mth02CB()
	{
		int i;
		synchronized(_fld02CB)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Object _fld02CB>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = _fld02CE;
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int _fld02CE>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
	//   10   14:iload_1         
	//   11   15:ireturn         
	//   12   16:astore_3        
	//   13   17:aload_2         
	//   14   18:monitorexit     
	//   15   19:aload_3         
	//   16   20:athrow          
		return i;
	}

	final boolean _mth02CE()
	{
		Object obj2 = _fld02CB;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object _fld02CB>
	//    2    4:astore          5
		obj2;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj = ((Object) (_fld02CF));
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field KeyStore _fld02CF>
	//    7   13:astore          4
		boolean flag1;
		boolean flag2;
		flag2 = true;
	//    8   15:iconst_1        
	//    9   16:istore_3        
		flag1 = true;
	//   10   17:iconst_1        
	//   11   18:istore_2        
		if(obj == null) goto _L2; else goto _L1
	//   12   19:aload           4
	//   13   21:ifnull          241
_L1:
		Enumeration enumeration = _fld02CF.aliases();
	//   14   24:aload_0         
	//   15   25:getfield        #55  <Field KeyStore _fld02CF>
	//   16   28:invokevirtual   #239 <Method Enumeration KeyStore.aliases()>
	//   17   31:astore          6
_L5:
		if(!enumeration.hasMoreElements()) goto _L2; else goto _L3
	//   18   33:aload           6
	//   19   35:invokeinterface #244 <Method boolean Enumeration.hasMoreElements()>
	//   20   40:ifeq            241
_L3:
		obj = ((Object) ((String)enumeration.nextElement()));
	//   21   43:aload           6
	//   22   45:invokeinterface #248 <Method Object Enumeration.nextElement()>
	//   23   50:checkcast       #72  <Class String>
	//   24   53:astore          4
		if(obj == null) goto _L5; else goto _L4
	//   25   55:aload           4
	//   26   57:ifnull          33
_L4:
		if(!((String) (obj)).startsWith("com.appsflyer")) goto _L5; else goto _L6
	//   27   60:aload           4
	//   28   62:ldc1            #250 <String "com.appsflyer">
	//   29   64:invokevirtual   #253 <Method boolean String.startsWith(String)>
	//   30   67:ifeq            33
_L6:
		String as1[] = ((String) (obj)).split(",");
	//   31   70:aload           4
	//   32   72:ldc1            #219 <String ",">
	//   33   74:invokevirtual   #257 <Method String[] String.split(String)>
	//   34   77:astore          6
		if(as1.length != 3) goto _L2; else goto _L7
	//   35   79:aload           6
	//   36   81:arraylength     
	//   37   82:iconst_3        
	//   38   83:icmpne          241
_L7:
		AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(String.valueOf(obj)));
	//   39   86:ldc2            #259 <String "Found a matching AF key with alias:\n">
	//   40   89:aload           4
	//   41   91:invokestatic    #76  <Method String String.valueOf(Object)>
	//   42   94:invokevirtual   #80  <Method String String.concat(String)>
	//   43   97:invokestatic    #45  <Method void AFLogger.afInfoLog(String)>
		String as[];
		as = as1[1].trim().split("=");
	//   44  100:aload           6
	//   45  102:iconst_1        
	//   46  103:aaload          
	//   47  104:invokevirtual   #262 <Method String String.trim()>
	//   48  107:ldc2            #264 <String "=">
	//   49  110:invokevirtual   #257 <Method String[] String.split(String)>
	//   50  113:astore          4
		as1 = as1[2].trim().split("=");
	//   51  115:aload           6
	//   52  117:iconst_2        
	//   53  118:aaload          
	//   54  119:invokevirtual   #262 <Method String String.trim()>
	//   55  122:ldc2            #264 <String "=">
	//   56  125:invokevirtual   #257 <Method String[] String.split(String)>
	//   57  128:astore          6
		boolean flag = flag2;
	//   58  130:iload_3         
	//   59  131:istore_1        
		if(as.length != 2)
			break MISSING_BLOCK_LABEL_228;
	//   60  132:aload           4
	//   61  134:arraylength     
	//   62  135:iconst_2        
	//   63  136:icmpne          228
		flag = flag2;
	//   64  139:iload_3         
	//   65  140:istore_1        
		if(as1.length != 2)
			break MISSING_BLOCK_LABEL_228;
	//   66  141:aload           6
	//   67  143:arraylength     
	//   68  144:iconst_2        
	//   69  145:icmpne          228
		_fld02CA = as[1].trim();
	//   70  148:aload_0         
	//   71  149:aload           4
	//   72  151:iconst_1        
	//   73  152:aaload          
	//   74  153:invokevirtual   #262 <Method String String.trim()>
	//   75  156:putfield        #35  <Field String _fld02CA>
		_fld02CE = Integer.parseInt(as1[1].trim());
	//   76  159:aload_0         
	//   77  160:aload           6
	//   78  162:iconst_1        
	//   79  163:aaload          
	//   80  164:invokevirtual   #262 <Method String String.trim()>
	//   81  167:invokestatic    #270 <Method int Integer.parseInt(String)>
	//   82  170:putfield        #37  <Field int _fld02CE>
		flag = flag2;
	//   83  173:iload_3         
	//   84  174:istore_1        
		break MISSING_BLOCK_LABEL_228;
	//   85  175:goto            228
		Object obj1;
		obj1;
	//   86  178:astore          4
		flag = flag1;
	//   87  180:iload_2         
	//   88  181:istore_1        
		break MISSING_BLOCK_LABEL_189;
	//   89  182:goto            189
		obj1;
	//   90  185:astore          4
		flag = false;
	//   91  187:iconst_0        
	//   92  188:istore_1        
		StringBuilder stringbuilder = new StringBuilder("Couldn't list KeyStore Aliases: ");
	//   93  189:new             #196 <Class StringBuilder>
	//   94  192:dup             
	//   95  193:ldc2            #272 <String "Couldn't list KeyStore Aliases: ">
	//   96  196:invokespecial   #199 <Method void StringBuilder(String)>
	//   97  199:astore          6
		stringbuilder.append(obj1.getClass().getName());
	//   98  201:aload           6
	//   99  203:aload           4
	//  100  205:invokevirtual   #276 <Method Class Object.getClass()>
	//  101  208:invokevirtual   #281 <Method String Class.getName()>
	//  102  211:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//  103  214:pop             
		AFLogger.afErrorLog(((Object) (stringbuilder)).toString(), ((Throwable) (obj1)));
	//  104  215:aload           6
	//  105  217:invokevirtual   #212 <Method String Object.toString()>
	//  106  220:aload           4
	//  107  222:invokestatic    #65  <Method void AFLogger.afErrorLog(String, Throwable)>
	//* 108  225:goto            228
_L9:
		obj2;
	//  109  228:aload           5
		JVM INSTR monitorexit ;
	//  110  230:monitorexit     
		return flag;
	//  111  231:iload_1         
	//  112  232:ireturn         
		obj1;
	//  113  233:astore          4
	//* 114  235:aload           5
		throw obj1;
	//  115  237:monitorexit     
	//  116  238:aload           4
	//  117  240:athrow          
_L2:
		flag = false;
	//  118  241:iconst_0        
	//  119  242:istore_1        
		if(true) goto _L9; else goto _L8
	//  120  243:goto            228
_L8:
	}

	final void _mth02CF(String s)
	{
		_fld02CA = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String _fld02CA>
		_fld02CE = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #37  <Field int _fld02CE>
		_mth02CA(_mth02CF());
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokespecial   #226 <Method String _mth02CF()>
	//    9   15:invokespecial   #233 <Method void _mth02CA(String)>
	//   10   18:return          
	}

	final String _mth0971()
	{
		String s;
		synchronized(_fld02CB)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Object _fld02CB>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			s = _fld02CA;
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field String _fld02CA>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
	//   10   14:aload_2         
	//   11   15:areturn         
	//   12   16:astore_2        
	//   13   17:aload_1         
	//   14   18:monitorexit     
	//   15   19:aload_2         
	//   16   20:athrow          
		return s;
	}

	private String _fld02CA;
	private final Object _fld02CB = new Object();
	private int _fld02CE;
	private KeyStore _fld02CF;
	private Context _fld0971;
}
