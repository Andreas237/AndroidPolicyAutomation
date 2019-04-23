// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.devicerequests.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.FacebookSdk;
import com.facebook.internal.*;
import com.google.zxing.*;
import com.google.zxing.common.BitMatrix;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceRequestsHelper
{

	public DeviceRequestsHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:return          
	}

	public static void cleanUpAdvertisementService(String s)
	{
		cleanUpAdvertisementServiceImpl(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #56  <Method void cleanUpAdvertisementServiceImpl(String)>
	//    2    4:return          
	}

	private static void cleanUpAdvertisementServiceImpl(String s)
	{
		android.net.nsd.NsdManager.RegistrationListener registrationlistener = (android.net.nsd.NsdManager.RegistrationListener)deviceRequestsListeners.get(((Object) (s)));
	//    0    0:getstatic       #49  <Field HashMap deviceRequestsListeners>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #65  <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #67  <Class android.net.nsd.NsdManager$RegistrationListener>
	//    4   10:astore_1        
		if(registrationlistener != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          51
		{
			NsdManager nsdmanager = (NsdManager)FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
	//    7   15:invokestatic    #73  <Method Context FacebookSdk.getApplicationContext()>
	//    8   18:ldc1            #75  <String "servicediscovery">
	//    9   20:invokevirtual   #81  <Method Object Context.getSystemService(String)>
	//   10   23:checkcast       #83  <Class NsdManager>
	//   11   26:astore_2        
			try
			{
				nsdmanager.unregisterService(registrationlistener);
	//   12   27:aload_2         
	//   13   28:aload_1         
	//   14   29:invokevirtual   #87  <Method void NsdManager.unregisterService(android.net.nsd.NsdManager$RegistrationListener)>
			}
	//*  15   32:goto            43
			catch(IllegalArgumentException illegalargumentexception)
	//*  16   35:astore_1        
			{
				Utility.logd(TAG, ((Exception) (illegalargumentexception)));
	//   17   36:getstatic       #42  <Field String TAG>
	//   18   39:aload_1         
	//   19   40:invokestatic    #93  <Method void Utility.logd(String, Exception)>
			}
			deviceRequestsListeners.remove(((Object) (s)));
	//   20   43:getstatic       #49  <Field HashMap deviceRequestsListeners>
	//   21   46:aload_0         
	//   22   47:invokevirtual   #96  <Method Object HashMap.remove(Object)>
	//   23   50:pop             
		}
	//   24   51:return          
	}

	public static Bitmap generateQRCode(String s)
	{
		int i;
		int j;
		int l;
		int i1;
		Object obj = ((Object) (new EnumMap(com/google/zxing/EncodeHintType)));
	//    0    0:new             #103 <Class EnumMap>
	//    1    3:dup             
	//    2    4:ldc1            #105 <Class EncodeHintType>
	//    3    6:invokespecial   #108 <Method void EnumMap(Class)>
	//    4    9:astore          6
		((Map) (obj)).put(((Object) (EncodeHintType.MARGIN)), ((Object) (Integer.valueOf(2))));
	//    5   11:aload           6
	//    6   13:getstatic       #112 <Field EncodeHintType EncodeHintType.MARGIN>
	//    7   16:iconst_2        
	//    8   17:invokestatic    #118 <Method Integer Integer.valueOf(int)>
	//    9   20:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//   10   25:pop             
		try
		{
			obj = ((Object) ((new MultiFormatWriter()).encode(s, BarcodeFormat.QR_CODE, 200, 200, ((Map) (obj)))));
	//   11   26:new             #126 <Class MultiFormatWriter>
	//   12   29:dup             
	//   13   30:invokespecial   #127 <Method void MultiFormatWriter()>
	//   14   33:aload_0         
	//   15   34:getstatic       #133 <Field BarcodeFormat BarcodeFormat.QR_CODE>
	//   16   37:sipush          200
	//   17   40:sipush          200
	//   18   43:aload           6
	//   19   45:invokevirtual   #137 <Method BitMatrix MultiFormatWriter.encode(String, BarcodeFormat, int, int, Map)>
	//   20   48:astore          6
			l = ((BitMatrix) (obj)).getHeight();
	//   21   50:aload           6
	//   22   52:invokevirtual   #143 <Method int BitMatrix.getHeight()>
	//   23   55:istore          4
			i1 = ((BitMatrix) (obj)).getWidth();
	//   24   57:aload           6
	//   25   59:invokevirtual   #146 <Method int BitMatrix.getWidth()>
	//   26   62:istore          5
			s = ((String) (new int[l * i1]));
	//   27   64:iload           4
	//   28   66:iload           5
	//   29   68:imul            
	//   30   69:newarray        int[]
	//   31   71:astore_0        
		}
	//*  32   72:iconst_0        
	//*  33   73:istore_1        
	//*  34   74:goto            139
	//*  35   77:iload_2         
	//*  36   78:iload           5
	//*  37   80:icmpge          168
	//*  38   83:aload           6
	//*  39   85:iload_2         
	//*  40   86:iload_1         
	//*  41   87:invokevirtual   #149 <Method boolean BitMatrix.get(int, int)>
	//*  42   90:ifeq            150
	//*  43   93:ldc1            #150 <Int 0xff000000>
	//*  44   95:istore_3        
	//*  45   96:goto            152
	//*  46   99:iload           5
	//*  47  101:iload           4
	//*  48  103:getstatic       #156 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//*  49  106:invokestatic    #162 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//*  50  109:astore          6
	//*  51  111:aload           6
	//*  52  113:aload_0         
	//*  53  114:iconst_0        
	//*  54  115:iload           5
	//*  55  117:iconst_0        
	//*  56  118:iconst_0        
	//*  57  119:iload           5
	//*  58  121:iload           4
	//*  59  123:invokevirtual   #166 <Method void Bitmap.setPixels(int[], int, int, int, int, int, int)>
	//*  60  126:aload           6
	//*  61  128:areturn         
	//*  62  129:aconst_null     
	//*  63  130:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		i = 0;
		  goto _L1
_L6:
		if(j >= i1)
			break MISSING_BLOCK_LABEL_168;
		  goto _L2
_L4:
		bitmap = Bitmap.createBitmap(i1, l, android.graphics.Bitmap.Config.ARGB_8888);
		try
		{
			bitmap.setPixels(((int []) (s)), 0, i1, 0, 0, i1, l);
		}
	//*  64  131:astore_0        
	//*  65  132:goto            129
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  66  135:astore_0        
		{
			return bitmap;
	//   67  136:aload           6
	//   68  138:areturn         
		}
		return bitmap;
_L1:
		if(i >= l) goto _L4; else goto _L3
	//   69  139:iload_1         
	//   70  140:iload           4
	//   71  142:icmpge          99
_L3:
		j = 0;
	//   72  145:iconst_0        
	//   73  146:istore_2        
		continue; /* Loop/switch isn't completed */
	//   74  147:goto            77
_L2:
		int k;
		Bitmap bitmap;
		if(((BitMatrix) (obj)).get(j, i))
			k = 0xff000000;
		else
			k = -1;
	//   75  150:iconst_m1       
	//   76  151:istore_3        
		s[i * i1 + j] = k;
	//   77  152:aload_0         
	//   78  153:iload_1         
	//   79  154:iload           5
	//   80  156:imul            
	//   81  157:iload_2         
	//   82  158:iadd            
	//   83  159:iload_3         
	//   84  160:iastore         
		j++;
	//   85  161:iload_2         
	//   86  162:iconst_1        
	//   87  163:iadd            
	//   88  164:istore_2        
		if(true) goto _L6; else goto _L5
	//   89  165:goto            77
_L5:
		i++;
	//   90  168:iload_1         
	//   91  169:iconst_1        
	//   92  170:iadd            
	//   93  171:istore_1        
		  goto _L1
	//*  94  172:goto            139
	}

	public static String getDeviceInfo()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #171 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void JSONObject()>
	//    3    7:astore_0        
		try
		{
			jsonobject.put("device", ((Object) (Build.DEVICE)));
	//    4    8:aload_0         
	//    5    9:ldc1            #10  <String "device">
	//    6   11:getstatic       #177 <Field String Build.DEVICE>
	//    7   14:invokevirtual   #180 <Method JSONObject JSONObject.put(String, Object)>
	//    8   17:pop             
			jsonobject.put("model", ((Object) (Build.MODEL)));
	//    9   18:aload_0         
	//   10   19:ldc1            #13  <String "model">
	//   11   21:getstatic       #183 <Field String Build.MODEL>
	//   12   24:invokevirtual   #180 <Method JSONObject JSONObject.put(String, Object)>
	//   13   27:pop             
		}
	//*  14   28:aload_0         
	//*  15   29:invokevirtual   #186 <Method String JSONObject.toString()>
	//*  16   32:areturn         
		catch(JSONException jsonexception) { }
	//   17   33:astore_1        
		return jsonobject.toString();
	//*  18   34:goto            28
	}

	public static boolean isAvailable()
	{
		return android.os.Build.VERSION.SDK_INT >= 16 && FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(((Object) (SmartLoginOption.Enabled)));
	//    0    0:getstatic       #194 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          16
	//    2    5:icmplt          28
	//    3    8:invokestatic    #197 <Method String FacebookSdk.getApplicationId()>
	//    4   11:invokestatic    #203 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    5   14:invokevirtual   #209 <Method EnumSet FetchedAppSettings.getSmartLoginOptions()>
	//    6   17:getstatic       #215 <Field SmartLoginOption SmartLoginOption.Enabled>
	//    7   20:invokevirtual   #221 <Method boolean EnumSet.contains(Object)>
	//    8   23:ifeq            28
	//    9   26:iconst_1        
	//   10   27:ireturn         
	//   11   28:iconst_0        
	//   12   29:ireturn         
	}

	public static boolean startAdvertisementService(String s)
	{
		if(isAvailable())
	//*   0    0:invokestatic    #225 <Method boolean isAvailable()>
	//*   1    3:ifeq            11
			return startAdvertisementServiceImpl(s);
	//    2    6:aload_0         
	//    3    7:invokestatic    #228 <Method boolean startAdvertisementServiceImpl(String)>
	//    4   10:ireturn         
		else
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	private static boolean startAdvertisementServiceImpl(String s)
	{
		if(deviceRequestsListeners.containsKey(((Object) (s))))
	//*   0    0:getstatic       #49  <Field HashMap deviceRequestsListeners>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #231 <Method boolean HashMap.containsKey(Object)>
	//*   3    7:ifeq            12
		{
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		} else
		{
			Object obj = ((Object) (String.format("%s_%s_%s", new Object[] {
				"fbsdk", String.format("%s-%s", new Object[] {
					"android", FacebookSdk.getSdkVersion().replace('.', '|')
				}), s
			})));
	//    6   12:ldc1            #233 <String "%s_%s_%s">
	//    7   14:iconst_3        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:ldc1            #25  <String "fbsdk">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_1        
	//   15   25:ldc1            #235 <String "%s-%s">
	//   16   27:iconst_2        
	//   17   28:anewarray       Object[]
	//   18   31:dup             
	//   19   32:iconst_0        
	//   20   33:ldc1            #22  <String "android">
	//   21   35:aastore         
	//   22   36:dup             
	//   23   37:iconst_1        
	//   24   38:invokestatic    #238 <Method String FacebookSdk.getSdkVersion()>
	//   25   41:bipush          46
	//   26   43:bipush          124
	//   27   45:invokevirtual   #244 <Method String String.replace(char, char)>
	//   28   48:aastore         
	//   29   49:invokestatic    #248 <Method String String.format(String, Object[])>
	//   30   52:aastore         
	//   31   53:dup             
	//   32   54:iconst_2        
	//   33   55:aload_0         
	//   34   56:aastore         
	//   35   57:invokestatic    #248 <Method String String.format(String, Object[])>
	//   36   60:astore_3        
			NsdServiceInfo nsdserviceinfo = new NsdServiceInfo();
	//   37   61:new             #250 <Class NsdServiceInfo>
	//   38   64:dup             
	//   39   65:invokespecial   #251 <Method void NsdServiceInfo()>
	//   40   68:astore_1        
			nsdserviceinfo.setServiceType("_fb._tcp.");
	//   41   69:aload_1         
	//   42   70:ldc1            #28  <String "_fb._tcp.">
	//   43   72:invokevirtual   #254 <Method void NsdServiceInfo.setServiceType(String)>
			nsdserviceinfo.setServiceName(((String) (obj)));
	//   44   75:aload_1         
	//   45   76:aload_3         
	//   46   77:invokevirtual   #257 <Method void NsdServiceInfo.setServiceName(String)>
			nsdserviceinfo.setPort(80);
	//   47   80:aload_1         
	//   48   81:bipush          80
	//   49   83:invokevirtual   #261 <Method void NsdServiceInfo.setPort(int)>
			NsdManager nsdmanager = (NsdManager)FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
	//   50   86:invokestatic    #73  <Method Context FacebookSdk.getApplicationContext()>
	//   51   89:ldc1            #75  <String "servicediscovery">
	//   52   91:invokevirtual   #81  <Method Object Context.getSystemService(String)>
	//   53   94:checkcast       #83  <Class NsdManager>
	//   54   97:astore_2        
			obj = ((Object) (new android.net.nsd.NsdManager.RegistrationListener(((String) (obj)), s) {

				public void onRegistrationFailed(NsdServiceInfo nsdserviceinfo1, int i)
				{
					DeviceRequestsHelper.cleanUpAdvertisementService(userCode);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field String val$userCode>
				//    2    4:invokestatic    #30  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
				//    3    7:return          
				}

				public void onServiceRegistered(NsdServiceInfo nsdserviceinfo1)
				{
					if(!nsdServiceName.equals(((Object) (nsdserviceinfo1.getServiceName()))))
				//*   0    0:aload_0         
				//*   1    1:getfield        #18  <Field String val$nsdServiceName>
				//*   2    4:aload_1         
				//*   3    5:invokevirtual   #38  <Method String NsdServiceInfo.getServiceName()>
				//*   4    8:invokevirtual   #44  <Method boolean String.equals(Object)>
				//*   5   11:ifne            21
						DeviceRequestsHelper.cleanUpAdvertisementService(userCode);
				//    6   14:aload_0         
				//    7   15:getfield        #20  <Field String val$userCode>
				//    8   18:invokestatic    #30  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
				//    9   21:return          
				}

				public void onServiceUnregistered(NsdServiceInfo nsdserviceinfo1)
				{
				//    0    0:return          
				}

				public void onUnregistrationFailed(NsdServiceInfo nsdserviceinfo1, int i)
				{
				//    0    0:return          
				}

				final String val$nsdServiceName;
				final String val$userCode;

			
			{
				nsdServiceName = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field String val$nsdServiceName>
				userCode = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String val$userCode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   55   98:new             #6   <Class DeviceRequestsHelper$1>
	//   56  101:dup             
	//   57  102:aload_3         
	//   58  103:aload_0         
	//   59  104:invokespecial   #264 <Method void DeviceRequestsHelper$1(String, String)>
	//   60  107:astore_3        
			deviceRequestsListeners.put(((Object) (s)), obj);
	//   61  108:getstatic       #49  <Field HashMap deviceRequestsListeners>
	//   62  111:aload_0         
	//   63  112:aload_3         
	//   64  113:invokevirtual   #265 <Method Object HashMap.put(Object, Object)>
	//   65  116:pop             
			nsdmanager.registerService(nsdserviceinfo, 1, ((android.net.nsd.NsdManager.RegistrationListener) (obj)));
	//   66  117:aload_2         
	//   67  118:aload_1         
	//   68  119:iconst_1        
	//   69  120:aload_3         
	//   70  121:invokevirtual   #269 <Method void NsdManager.registerService(NsdServiceInfo, int, android.net.nsd.NsdManager$RegistrationListener)>
			return true;
	//   71  124:iconst_1        
	//   72  125:ireturn         
		}
	}

	static final String DEVICE_INFO_DEVICE = "device";
	static final String DEVICE_INFO_MODEL = "model";
	public static final String DEVICE_INFO_PARAM = "device_info";
	public static final String DEVICE_TARGET_USER_ID = "target_user_id";
	static final String SDK_FLAVOR = "android";
	static final String SDK_HEADER = "fbsdk";
	static final String SERVICE_TYPE = "_fb._tcp.";
	private static final String TAG = ((Class) (com/facebook/devicerequests/internal/DeviceRequestsHelper)).getCanonicalName();
	private static HashMap deviceRequestsListeners = new HashMap();

	static 
	{
	//    0    0:ldc1            #2   <Class DeviceRequestsHelper>
	//    1    2:invokevirtual   #40  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #42  <Field String TAG>
	//    3    8:new             #44  <Class HashMap>
	//    4   11:dup             
	//    5   12:invokespecial   #47  <Method void HashMap()>
	//    6   15:putstatic       #49  <Field HashMap deviceRequestsListeners>
	//*   7   18:return          
	}
}
