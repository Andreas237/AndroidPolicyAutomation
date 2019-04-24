// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.updatesdk.framework.bean.startup;

import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.huawei.updatesdk.framework.bean.StoreRequestBean;
import com.huawei.updatesdk.sdk.a.b.a.a.a;
import com.huawei.updatesdk.service.a.b;
import com.huawei.updatesdk.support.f.c;

public final class StartupRequest extends StoreRequestBean
{

	private StartupRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void StoreRequestBean()>
		isSubUser_ = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #46  <Field int isSubUser_>
		rsaVer_ = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #48  <Field int rsaVer_>
		emuiVer_ = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #50  <Field String emuiVer_>
		emuiApiLevel_ = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #52  <Field int emuiApiLevel_>
		sysBits_ = 1;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #54  <Field int sysBits_>
		secretKey = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #56  <Field String secretKey>
		signSecretKey = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #58  <Field String signSecretKey>
	//   23   39:return          
	}

	private static int getSysteBit()
	{
		byte byte0 = 1;
	//    0    0:iconst_1        
	//    1    1:istore_0        
		if(SystemProperties.get("ro.product.cpu.abi", "").contains("arm64"))
	//*   2    2:ldc1            #63  <String "ro.product.cpu.abi">
	//*   3    4:ldc1            #65  <String "">
	//*   4    6:invokestatic    #71  <Method String SystemProperties.get(String, String)>
	//*   5    9:ldc1            #73  <String "arm64">
	//*   6   11:invokevirtual   #79  <Method boolean String.contains(CharSequence)>
	//*   7   14:ifeq            19
			byte0 = 2;
	//    8   17:iconst_2        
	//    9   18:istore_0        
		a.a("StartupRequest", (new StringBuilder()).append("systeAbi:").append(((int) (byte0))).toString());
	//   10   19:ldc1            #81  <String "StartupRequest">
	//   11   21:new             #83  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #84  <Method void StringBuilder()>
	//   14   28:ldc1            #86  <String "systeAbi:">
	//   15   30:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:iload_0         
	//   17   34:invokevirtual   #93  <Method StringBuilder StringBuilder.append(int)>
	//   18   37:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   19   40:invokestatic    #102 <Method void a.a(String, String)>
		return ((int) (byte0));
	//   20   43:iload_0         
	//   21   44:ireturn         
	}

	public static StartupRequest newInstance()
	{
		StartupRequest startuprequest = new StartupRequest();
	//    0    0:new             #2   <Class StartupRequest>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void StartupRequest()>
	//    3    7:astore_1        
		Context context = com.huawei.updatesdk.sdk.service.a.a.a().b();
	//    4    8:invokestatic    #110 <Method com.huawei.updatesdk.sdk.service.a.a com.huawei.updatesdk.sdk.service.a.a.a()>
	//    5   11:invokevirtual   #114 <Method Context com.huawei.updatesdk.sdk.service.a.a.b()>
	//    6   14:astore_2        
		startuprequest.setSerial(true);
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #118 <Method void setSerial(boolean)>
		startuprequest.setSign_(((String) (null)));
	//   10   20:aload_1         
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #122 <Method void setSign_(String)>
		if(TextUtils.isEmpty(((CharSequence) (startuprequest.getHcrId_()))))
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #125 <Method String getHcrId_()>
	//*  15   29:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   32:ifeq            40
			startuprequest.setHcrId_(((String) (null)));
	//   17   35:aload_1         
	//   18   36:aconst_null     
	//   19   37:invokevirtual   #133 <Method void setHcrId_(String)>
		startuprequest.setNeedSign(false);
	//   20   40:aload_1         
	//   21   41:iconst_0        
	//   22   42:invokevirtual   #136 <Method void setNeedSign(boolean)>
		startuprequest.setMethod_("client.front2");
	//   23   45:aload_1         
	//   24   46:ldc1            #8   <String "client.front2">
	//   25   48:invokevirtual   #139 <Method void setMethod_(String)>
		startuprequest.setFirmwareVersion_(com.huawei.updatesdk.sdk.a.c.b.a.j());
	//   26   51:aload_1         
	//   27   52:invokestatic    #144 <Method String com.huawei.updatesdk.sdk.a.c.b.a.j()>
	//   28   55:invokevirtual   #147 <Method void setFirmwareVersion_(String)>
		startuprequest.setLocale_(com.huawei.updatesdk.sdk.a.c.b.a.d());
	//   29   58:aload_1         
	//   30   59:invokestatic    #150 <Method String com.huawei.updatesdk.sdk.a.c.b.a.d()>
	//   31   62:invokevirtual   #153 <Method void setLocale_(String)>
		startuprequest.setZone_(1);
	//   32   65:aload_1         
	//   33   66:iconst_1        
	//   34   67:invokevirtual   #157 <Method void setZone_(int)>
		startuprequest.setVersion_(com.huawei.updatesdk.sdk.a.c.b.a.e(context));
	//   35   70:aload_1         
	//   36   71:aload_2         
	//   37   72:invokestatic    #161 <Method String com.huawei.updatesdk.sdk.a.c.b.a.e(Context)>
	//   38   75:invokevirtual   #164 <Method void setVersion_(String)>
		startuprequest.setBuildNumber_(com.huawei.updatesdk.sdk.a.c.b.a.b());
	//   39   78:aload_1         
	//   40   79:invokestatic    #166 <Method String com.huawei.updatesdk.sdk.a.c.b.a.b()>
	//   41   82:invokevirtual   #169 <Method void setBuildNumber_(String)>
		startuprequest.setPhoneType_(Build.MODEL);
	//   42   85:aload_1         
	//   43   86:getstatic       #174 <Field String Build.MODEL>
	//   44   89:invokevirtual   #177 <Method void setPhoneType_(String)>
		startuprequest.setDensity_(com.huawei.updatesdk.sdk.a.c.b.a.c());
	//   45   92:aload_1         
	//   46   93:invokestatic    #180 <Method String com.huawei.updatesdk.sdk.a.c.b.a.c()>
	//   47   96:invokevirtual   #183 <Method void setDensity_(String)>
		startuprequest.setScreen_(com.huawei.updatesdk.sdk.a.c.b.a.e());
	//   48   99:aload_1         
	//   49  100:invokestatic    #185 <Method String com.huawei.updatesdk.sdk.a.c.b.a.e()>
	//   50  103:invokevirtual   #188 <Method void setScreen_(String)>
		startuprequest.setVersionCode_(com.huawei.updatesdk.sdk.a.c.b.a.c(context));
	//   51  106:aload_1         
	//   52  107:aload_2         
	//   53  108:invokestatic    #191 <Method int com.huawei.updatesdk.sdk.a.c.b.a.c(Context)>
	//   54  111:invokevirtual   #194 <Method void setVersionCode_(int)>
		int i;
		if(com.huawei.updatesdk.sdk.a.c.b.a.g())
	//*  55  114:invokestatic    #198 <Method boolean com.huawei.updatesdk.sdk.a.c.b.a.g()>
	//*  56  117:ifeq            125
			i = 1;
	//   57  120:iconst_1        
	//   58  121:istore_0        
		else
	//*  59  122:goto            127
			i = 0;
	//   60  125:iconst_0        
	//   61  126:istore_0        
		startuprequest.setGmsSupport_(i);
	//   62  127:aload_1         
	//   63  128:iload_0         
	//   64  129:invokevirtual   #201 <Method void setGmsSupport_(int)>
		startuprequest.setTheme_("true");
	//   65  132:aload_1         
	//   66  133:ldc1            #203 <String "true">
	//   67  135:invokevirtual   #206 <Method void setTheme_(String)>
		startuprequest.setResolution_(com.huawei.updatesdk.sdk.a.c.b.a.e());
	//   68  138:aload_1         
	//   69  139:invokestatic    #185 <Method String com.huawei.updatesdk.sdk.a.c.b.a.e()>
	//   70  142:invokevirtual   #209 <Method void setResolution_(String)>
		startuprequest.setStoreApi("storeApi3");
	//   71  145:aload_1         
	//   72  146:ldc1            #211 <String "storeApi3">
	//   73  148:invokevirtual   #214 <Method void setStoreApi(String)>
		startuprequest.setPackageName_(com.huawei.updatesdk.sdk.service.a.a.a().b().getPackageName());
	//   74  151:aload_1         
	//   75  152:invokestatic    #110 <Method com.huawei.updatesdk.sdk.service.a.a com.huawei.updatesdk.sdk.service.a.a.a()>
	//   76  155:invokevirtual   #114 <Method Context com.huawei.updatesdk.sdk.service.a.a.b()>
	//   77  158:invokevirtual   #219 <Method String Context.getPackageName()>
	//   78  161:invokevirtual   #222 <Method void setPackageName_(String)>
		startuprequest.setSignSecretKey(b.a().g());
	//   79  164:aload_1         
	//   80  165:invokestatic    #227 <Method b b.a()>
	//   81  168:invokevirtual   #229 <Method String b.g()>
	//   82  171:invokevirtual   #232 <Method void setSignSecretKey(String)>
		startuprequest.setEncryptSignKey_(b.a().j());
	//   83  174:aload_1         
	//   84  175:invokestatic    #227 <Method b b.a()>
	//   85  178:invokevirtual   #233 <Method String b.j()>
	//   86  181:invokevirtual   #236 <Method void setEncryptSignKey_(String)>
		startuprequest.setSecretKey(b.a().h());
	//   87  184:aload_1         
	//   88  185:invokestatic    #227 <Method b b.a()>
	//   89  188:invokevirtual   #239 <Method String b.h()>
	//   90  191:invokevirtual   #242 <Method void setSecretKey(String)>
		startuprequest.setEncryptKey_(b.a().k());
	//   91  194:aload_1         
	//   92  195:invokestatic    #227 <Method b b.a()>
	//   93  198:invokevirtual   #245 <Method String b.k()>
	//   94  201:invokevirtual   #248 <Method void setEncryptKey_(String)>
		startuprequest.setEmuiVer_(c.a().c());
	//   95  204:aload_1         
	//   96  205:invokestatic    #253 <Method c c.a()>
	//   97  208:invokevirtual   #254 <Method String c.c()>
	//   98  211:invokevirtual   #257 <Method void setEmuiVer_(String)>
		startuprequest.setEmuiApiLevel_(c.a().b());
	//   99  214:aload_1         
	//  100  215:invokestatic    #253 <Method c c.a()>
	//  101  218:invokevirtual   #259 <Method int c.b()>
	//  102  221:invokevirtual   #262 <Method void setEmuiApiLevel_(int)>
		startuprequest.setRsaVer_(3);
	//  103  224:aload_1         
	//  104  225:iconst_3        
	//  105  226:invokevirtual   #265 <Method void setRsaVer_(int)>
		if(com.huawei.updatesdk.sdk.a.c.b.a.h() == 0)
	//* 106  229:invokestatic    #267 <Method int com.huawei.updatesdk.sdk.a.c.b.a.h()>
	//* 107  232:ifne            240
			i = 0;
	//  108  235:iconst_0        
	//  109  236:istore_0        
		else
	//* 110  237:goto            242
			i = 1;
	//  111  240:iconst_1        
	//  112  241:istore_0        
		startuprequest.setIsSubUser_(i);
	//  113  242:aload_1         
	//  114  243:iload_0         
	//  115  244:invokevirtual   #270 <Method void setIsSubUser_(int)>
		startuprequest.setSysBits_(getSysteBit());
	//  116  247:aload_1         
	//  117  248:invokestatic    #272 <Method int getSysteBit()>
	//  118  251:invokevirtual   #275 <Method void setSysBits_(int)>
		startuprequest.setSessionID((new StringBuilder()).append("client.front2").append(startuprequest.getVersion_()).append(startuprequest.getLocale_()).toString());
	//  119  254:aload_1         
	//  120  255:new             #83  <Class StringBuilder>
	//  121  258:dup             
	//  122  259:invokespecial   #84  <Method void StringBuilder()>
	//  123  262:ldc1            #8   <String "client.front2">
	//  124  264:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//  125  267:aload_1         
	//  126  268:invokevirtual   #278 <Method String getVersion_()>
	//  127  271:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//  128  274:aload_1         
	//  129  275:invokevirtual   #281 <Method String getLocale_()>
	//  130  278:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//  131  281:invokevirtual   #97  <Method String StringBuilder.toString()>
	//  132  284:invokevirtual   #284 <Method void setSessionID(String)>
		return startuprequest;
	//  133  287:aload_1         
	//  134  288:areturn         
	}

	public String getBuildNumber_()
	{
		return buildNumber_;
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field String buildNumber_>
	//    2    4:areturn         
	}

	public String getDensity_()
	{
		return density_;
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field String density_>
	//    2    4:areturn         
	}

	public int getEmuiApiLevel_()
	{
		return emuiApiLevel_;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int emuiApiLevel_>
	//    2    4:ireturn         
	}

	public String getEmuiVer_()
	{
		return emuiVer_;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String emuiVer_>
	//    2    4:areturn         
	}

	public String getEncryptKey_()
	{
		return encryptKey_;
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field String encryptKey_>
	//    2    4:areturn         
	}

	public String getEncryptSignKey_()
	{
		return encryptSignKey_;
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field String encryptSignKey_>
	//    2    4:areturn         
	}

	public String getFirmwareVersion_()
	{
		return firmwareVersion_;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field String firmwareVersion_>
	//    2    4:areturn         
	}

	public int getGmsSupport_()
	{
		return gmsSupport_;
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field int gmsSupport_>
	//    2    4:ireturn         
	}

	public int getIsSubUser_()
	{
		return isSubUser_;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int isSubUser_>
	//    2    4:ireturn         
	}

	public String getPackageName_()
	{
		return packageName_;
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field String packageName_>
	//    2    4:areturn         
	}

	public String getPhoneType_()
	{
		return phoneType_;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field String phoneType_>
	//    2    4:areturn         
	}

	public String getResolution_()
	{
		return resolution_;
	//    0    0:aload_0         
	//    1    1:getfield        #314 <Field String resolution_>
	//    2    4:areturn         
	}

	public int getRsaVer_()
	{
		return rsaVer_;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int rsaVer_>
	//    2    4:ireturn         
	}

	public String getScreen_()
	{
		return screen_;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field String screen_>
	//    2    4:areturn         
	}

	public String getSecretKey()
	{
		return secretKey;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String secretKey>
	//    2    4:areturn         
	}

	public String getSignSecretKey()
	{
		return signSecretKey;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String signSecretKey>
	//    2    4:areturn         
	}

	public int getSysBits_()
	{
		return sysBits_;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int sysBits_>
	//    2    4:ireturn         
	}

	public String getTheme_()
	{
		return theme_;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field String theme_>
	//    2    4:areturn         
	}

	public int getVersionCode_()
	{
		return versionCode_;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field int versionCode_>
	//    2    4:ireturn         
	}

	public String getVersion_()
	{
		return version_;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field String version_>
	//    2    4:areturn         
	}

	public int getZone_()
	{
		return zone_;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field int zone_>
	//    2    4:ireturn         
	}

	public void onSetValue()
	{
		super.onSetValue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #337 <Method void StoreRequestBean.onSetValue()>
		try
		{
			if(getSecretKey() != null)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #339 <Method String getSecretKey()>
	//*   4    8:ifnull          29
				setUserId_(com.huawei.updatesdk.sdk.a.c.a.a.a(com.huawei.updatesdk.sdk.a.c.b.a.a(), getSecretKey(), getIV()));
	//    5   11:aload_0         
	//    6   12:invokestatic    #341 <Method String com.huawei.updatesdk.sdk.a.c.b.a.a()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #339 <Method String getSecretKey()>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #345 <Method byte[] getIV()>
	//   11   23:invokestatic    #350 <Method String com.huawei.updatesdk.sdk.a.c.a.a.a(String, String, byte[])>
	//   12   26:invokevirtual   #353 <Method void setUserId_(String)>
			return;
	//   13   29:return          
		}
		catch(Exception exception)
	//*  14   30:astore_1        
		{
			a.d("StartupRequest", "setValue error");
	//   15   31:ldc1            #81  <String "StartupRequest">
	//   16   33:ldc2            #355 <String "setValue error">
	//   17   36:invokestatic    #357 <Method void a.d(String, String)>
		}
	//   18   39:return          
	}

	public void setBuildNumber_(String s)
	{
		buildNumber_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #287 <Field String buildNumber_>
	//    3    5:return          
	}

	public void setDensity_(String s)
	{
		density_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #290 <Field String density_>
	//    3    5:return          
	}

	public void setEmuiApiLevel_(int i)
	{
		emuiApiLevel_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int emuiApiLevel_>
	//    3    5:return          
	}

	public void setEmuiVer_(String s)
	{
		emuiVer_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String emuiVer_>
	//    3    5:return          
	}

	public void setEncryptKey_(String s)
	{
		encryptKey_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #295 <Field String encryptKey_>
	//    3    5:return          
	}

	public void setEncryptSignKey_(String s)
	{
		encryptSignKey_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #298 <Field String encryptSignKey_>
	//    3    5:return          
	}

	public void setFirmwareVersion_(String s)
	{
		firmwareVersion_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #301 <Field String firmwareVersion_>
	//    3    5:return          
	}

	public void setGmsSupport_(int i)
	{
		gmsSupport_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #304 <Field int gmsSupport_>
	//    3    5:return          
	}

	public void setIsSubUser_(int i)
	{
		isSubUser_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field int isSubUser_>
	//    3    5:return          
	}

	public void setPackageName_(String s)
	{
		packageName_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #308 <Field String packageName_>
	//    3    5:return          
	}

	public void setPhoneType_(String s)
	{
		phoneType_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #311 <Field String phoneType_>
	//    3    5:return          
	}

	public void setResolution_(String s)
	{
		resolution_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #314 <Field String resolution_>
	//    3    5:return          
	}

	public void setRsaVer_(int i)
	{
		rsaVer_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int rsaVer_>
	//    3    5:return          
	}

	public void setScreen_(String s)
	{
		screen_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #318 <Field String screen_>
	//    3    5:return          
	}

	public void setSecretKey(String s)
	{
		secretKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field String secretKey>
	//    3    5:return          
	}

	public void setSignSecretKey(String s)
	{
		signSecretKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String signSecretKey>
	//    3    5:return          
	}

	public void setSysBits_(int i)
	{
		sysBits_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field int sysBits_>
	//    3    5:return          
	}

	public void setTheme_(String s)
	{
		theme_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #324 <Field String theme_>
	//    3    5:return          
	}

	public void setVersionCode_(int i)
	{
		versionCode_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #327 <Field int versionCode_>
	//    3    5:return          
	}

	public void setVersion_(String s)
	{
		version_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #329 <Field String version_>
	//    3    5:return          
	}

	public void setZone_(int i)
	{
		zone_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #332 <Field int zone_>
	//    3    5:return          
	}

	public static final String APIMETHOD = "client.front2";
	private static final int RSA_VER_2048_OAEP = 3;
	public static final int SYSTEM_32 = 1;
	public static final int SYSTEM_64 = 2;
	private String buildNumber_;
	private String density_;
	private int emuiApiLevel_;
	private String emuiVer_;
	private String encryptKey_;
	private String encryptSignKey_;
	private String firmwareVersion_;
	private int gmsSupport_;
	private int isSubUser_;
	private String packageName_;
	private String phoneType_;
	private String resolution_;
	private int rsaVer_;
	private String screen_;
	private String secretKey;
	private String signSecretKey;
	private int sysBits_;
	private String theme_;
	private int versionCode_;
	private String version_;
	private int zone_;
}
