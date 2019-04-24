// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import android.content.Context;
import android.os.Build;
import com.huawei.openalliance.ad.utils.*;
import java.util.Locale;

public class Device
{

	public Device()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		type__ = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #41  <Field int type__>
		os__ = "android";
	//    5    9:aload_0         
	//    6   10:ldc1            #43  <String "android">
	//    7   12:putfield        #45  <Field String os__>
	//    8   15:return          
	}

	public Device(Context context, int i, int j, int k, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		type__ = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #41  <Field int type__>
		os__ = "android";
	//    5    9:aload_0         
	//    6   10:ldc1            #43  <String "android">
	//    7   12:putfield        #45  <Field String os__>
		version__ = android.os.Build.VERSION.RELEASE;
	//    8   15:aload_0         
	//    9   16:getstatic       #52  <Field String android.os.Build$VERSION.RELEASE>
	//   10   19:putfield        #54  <Field String version__>
		maker__ = Build.MANUFACTURER.toUpperCase(Locale.US);
	//   11   22:aload_0         
	//   12   23:getstatic       #59  <Field String Build.MANUFACTURER>
	//   13   26:getstatic       #65  <Field Locale Locale.US>
	//   14   29:invokevirtual   #71  <Method String String.toUpperCase(Locale)>
	//   15   32:putfield        #73  <Field String maker__>
		model__ = Build.MODEL.toUpperCase(Locale.US);
	//   16   35:aload_0         
	//   17   36:getstatic       #76  <Field String Build.MODEL>
	//   18   39:getstatic       #65  <Field Locale Locale.US>
	//   19   42:invokevirtual   #71  <Method String String.toUpperCase(Locale)>
	//   20   45:putfield        #78  <Field String model__>
		buildVersion__ = Build.DISPLAY;
	//   21   48:aload_0         
	//   22   49:getstatic       #81  <Field String Build.DISPLAY>
	//   23   52:putfield        #83  <Field String buildVersion__>
		width__ = i;
	//   24   55:aload_0         
	//   25   56:iload_2         
	//   26   57:putfield        #85  <Field int width__>
		height__ = j;
	//   27   60:aload_0         
	//   28   61:iload_3         
	//   29   62:putfield        #87  <Field int height__>
		language__ = a.b();
	//   30   65:aload_0         
	//   31   66:invokestatic    #93  <Method String a.b()>
	//   32   69:putfield        #95  <Field String language__>
		type__ = k;
	//   33   72:aload_0         
	//   34   73:iload           4
	//   35   75:putfield        #41  <Field int type__>
		dpi = a.e(context);
	//   36   78:aload_0         
	//   37   79:aload_1         
	//   38   80:invokestatic    #99  <Method int a.e(Context)>
	//   39   83:putfield        #101 <Field int dpi>
		pxratio = a.f(context);
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:invokestatic    #105 <Method float a.f(Context)>
	//   43   91:putfield        #107 <Field float pxratio>
		useragent = a.g(context);
	//   44   94:aload_0         
	//   45   95:aload_1         
	//   46   96:invokestatic    #111 <Method String a.g(Context)>
	//   47   99:putfield        #113 <Field String useragent>
		verCodeOfHiFolder = a.h(context);
	//   48  102:aload_0         
	//   49  103:aload_1         
	//   50  104:invokestatic    #116 <Method String a.h(Context)>
	//   51  107:putfield        #118 <Field String verCodeOfHiFolder>
		verCodeOfHsf = a.i(context);
	//   52  110:aload_0         
	//   53  111:aload_1         
	//   54  112:invokestatic    #121 <Method String a.i(Context)>
	//   55  115:putfield        #123 <Field String verCodeOfHsf>
		emuiVer = m.d();
	//   56  118:aload_0         
	//   57  119:invokestatic    #128 <Method String m.d()>
	//   58  122:putfield        #130 <Field String emuiVer>
		if(flag)
	//*  59  125:iload           5
	//*  60  127:ifeq            177
		{
			androidid__ = a.c(context);
	//   61  130:aload_0         
	//   62  131:aload_1         
	//   63  132:invokestatic    #133 <Method String a.c(Context)>
	//   64  135:putfield        #135 <Field String androidid__>
			if(a.a())
	//*  65  138:invokestatic    #139 <Method boolean a.a()>
	//*  66  141:ifeq            162
			{
				udid = a.c();
	//   67  144:aload_0         
	//   68  145:invokestatic    #141 <Method String a.c()>
	//   69  148:putfield        #143 <Field String udid>
				imei__ = a.d(context);
	//   70  151:aload_0         
	//   71  152:aload_1         
	//   72  153:invokestatic    #145 <Method String a.d(Context)>
	//   73  156:putfield        #147 <Field String imei__>
			} else
	//*  74  159:goto            169
			{
				sn = a.d();
	//   75  162:aload_0         
	//   76  163:invokestatic    #148 <Method String a.d()>
	//   77  166:putfield        #150 <Field String sn>
			}
			mac__ = w.a(context);
	//   78  169:aload_0         
	//   79  170:aload_1         
	//   80  171:invokestatic    #154 <Method String w.a(Context)>
	//   81  174:putfield        #156 <Field String mac__>
		}
	//   82  177:return          
	}

	public String getAndroidid__()
	{
		return androidid__;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field String androidid__>
	//    2    4:areturn         
	}

	public String getBuildVersion__()
	{
		return buildVersion__;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String buildVersion__>
	//    2    4:areturn         
	}

	public int getDpi()
	{
		return dpi;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int dpi>
	//    2    4:ireturn         
	}

	public String getEmuiVer()
	{
		return emuiVer;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field String emuiVer>
	//    2    4:areturn         
	}

	public int getHeight__()
	{
		return height__;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int height__>
	//    2    4:ireturn         
	}

	public String getImei__()
	{
		return imei__;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field String imei__>
	//    2    4:areturn         
	}

	public String getIsTrackingEnabled()
	{
		return isTrackingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field String isTrackingEnabled>
	//    2    4:areturn         
	}

	public String getLanguage__()
	{
		return language__;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field String language__>
	//    2    4:areturn         
	}

	public String getMac__()
	{
		return mac__;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field String mac__>
	//    2    4:areturn         
	}

	public String getMaker__()
	{
		return maker__;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String maker__>
	//    2    4:areturn         
	}

	public String getModel__()
	{
		return model__;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String model__>
	//    2    4:areturn         
	}

	public String getOaid()
	{
		return oaid;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field String oaid>
	//    2    4:areturn         
	}

	public String getOs__()
	{
		return os__;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String os__>
	//    2    4:areturn         
	}

	public float getPxratio()
	{
		return pxratio;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field float pxratio>
	//    2    4:freturn         
	}

	public String getSn()
	{
		return sn;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field String sn>
	//    2    4:areturn         
	}

	public String getTvModel__()
	{
		return tvModel__;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field String tvModel__>
	//    2    4:areturn         
	}

	public int getType__()
	{
		return type__;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int type__>
	//    2    4:ireturn         
	}

	public String getUdid()
	{
		return udid;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field String udid>
	//    2    4:areturn         
	}

	public String getUserAccount__()
	{
		return userAccount__;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field String userAccount__>
	//    2    4:areturn         
	}

	public String getUseragent()
	{
		return useragent;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String useragent>
	//    2    4:areturn         
	}

	public String getVerCodeOfHiFolder()
	{
		return verCodeOfHiFolder;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field String verCodeOfHiFolder>
	//    2    4:areturn         
	}

	public String getVerCodeOfHsf()
	{
		return verCodeOfHsf;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field String verCodeOfHsf>
	//    2    4:areturn         
	}

	public String getVersion__()
	{
		return version__;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String version__>
	//    2    4:areturn         
	}

	public int getWidth__()
	{
		return width__;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int width__>
	//    2    4:ireturn         
	}

	public void setAndroidid__(String s)
	{
		androidid__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #135 <Field String androidid__>
	//    3    5:return          
	}

	public void setBuildVersion__(String s)
	{
		buildVersion__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field String buildVersion__>
	//    3    5:return          
	}

	public void setDpi(int i)
	{
		dpi = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field int dpi>
	//    3    5:return          
	}

	public void setEmuiVer(String s)
	{
		emuiVer = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field String emuiVer>
	//    3    5:return          
	}

	public void setHeight__(int i)
	{
		height__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field int height__>
	//    3    5:return          
	}

	public void setImei__(String s)
	{
		imei__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field String imei__>
	//    3    5:return          
	}

	public void setIsTrackingEnabled(String s)
	{
		isTrackingEnabled = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #166 <Field String isTrackingEnabled>
	//    3    5:return          
	}

	public void setLanguage__(String s)
	{
		language__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field String language__>
	//    3    5:return          
	}

	public void setMac__(String s)
	{
		mac__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field String mac__>
	//    3    5:return          
	}

	public void setMaker__(String s)
	{
		maker__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field String maker__>
	//    3    5:return          
	}

	public void setModel__(String s)
	{
		model__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field String model__>
	//    3    5:return          
	}

	public void setOaid(String s)
	{
		oaid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #173 <Field String oaid>
	//    3    5:return          
	}

	public void setOs__(String s)
	{
		os__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String os__>
	//    3    5:return          
	}

	public void setPxratio(float f)
	{
		pxratio = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #107 <Field float pxratio>
	//    3    5:return          
	}

	public void setSn(String s)
	{
		sn = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #150 <Field String sn>
	//    3    5:return          
	}

	public void setTvModel__(String s)
	{
		tvModel__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #180 <Field String tvModel__>
	//    3    5:return          
	}

	public void setType__(int i)
	{
		type__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int type__>
	//    3    5:return          
	}

	public void setUdid(String s)
	{
		udid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #143 <Field String udid>
	//    3    5:return          
	}

	public void setUserAccount__(String s)
	{
		userAccount__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #185 <Field String userAccount__>
	//    3    5:return          
	}

	public void setUseragent(String s)
	{
		useragent = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field String useragent>
	//    3    5:return          
	}

	public void setVerCodeOfHiFolder(String s)
	{
		verCodeOfHiFolder = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field String verCodeOfHiFolder>
	//    3    5:return          
	}

	public void setVerCodeOfHsf(String s)
	{
		verCodeOfHsf = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field String verCodeOfHsf>
	//    3    5:return          
	}

	public void setVersion__(String s)
	{
		version__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String version__>
	//    3    5:return          
	}

	public void setWidth__(int i)
	{
		width__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #85  <Field int width__>
	//    3    5:return          
	}

	private static final String TAG = "Device";
	private String androidid__;
	private String buildVersion__;
	private int dpi;
	private String emuiVer;
	private int height__;
	private String imei__;
	private String isTrackingEnabled;
	private String language__;
	private String mac__;
	private String maker__;
	private String model__;
	private String oaid;
	private String os__;
	private float pxratio;
	private String sn;
	private String tvModel__;
	private int type__;
	private String udid;
	private String userAccount__;
	private String useragent;
	private String verCodeOfHiFolder;
	private String verCodeOfHsf;
	private String version__;
	private int width__;
}
