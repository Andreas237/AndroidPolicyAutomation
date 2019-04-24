// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwCloudJs.service.locationapi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.location.LocationManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.Poi;
import com.huawei.hwCloudJs.api.ILocDialog;
import com.huawei.hwCloudJs.core.JSRequest;
import com.huawei.hwCloudJs.core.JsCallback;
import com.huawei.hwCloudJs.service.locationapi.a.a;
import com.huawei.hwCloudJs.service.locationapi.bean.Address;
import com.huawei.hwCloudJs.service.locationapi.bean.Coordinates;
import com.huawei.hwCloudJs.service.locationapi.bean.LocOption;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.huawei.hwCloudJs.service.locationapi:
//			a, b

public class GetLocationApi extends JSRequest
{

	public GetLocationApi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void JSRequest()>
		b = 0.0D;
	//    2    4:aload_0         
	//    3    5:dconst_0        
	//    4    6:putfield        #24  <Field double b>
		c = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #26  <Field double c>
	//    8   14:return          
	}

	static double a(GetLocationApi getlocationapi)
	{
		return getlocationapi.b;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field double b>
	//    2    4:dreturn         
	}

	static double a(GetLocationApi getlocationapi, double d1)
	{
		getlocationapi.b = d1;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #24  <Field double b>
		return d1;
	//    3    5:dload_1         
	//    4    6:dreturn         
	}

	static long a(String s)
	{
		return c(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method long c(String)>
	//    2    4:lreturn         
	}

	static Dialog a(GetLocationApi getlocationapi, Dialog dialog)
	{
		getlocationapi.f = dialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Dialog f>
		return dialog;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a()
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field LocationClient d>
	//*   2    4:ifnull          33
		{
			Log.i("GetLocationApi", "stopGps");
	//    3    7:ldc1            #9   <String "GetLocationApi">
	//    4    9:ldc1            #39  <String "stopGps">
	//    5   11:invokestatic    #45  <Method int Log.i(String, String)>
	//    6   14:pop             
			d.unRegisterLocationListener(((com.baidu.location.BDLocationListener) (e)));
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field LocationClient d>
	//    9   19:aload_0         
	//   10   20:getfield        #47  <Field b e>
	//   11   23:invokevirtual   #53  <Method void LocationClient.unRegisterLocationListener(com.baidu.location.BDLocationListener)>
			d.stop();
	//   12   26:aload_0         
	//   13   27:getfield        #37  <Field LocationClient d>
	//   14   30:invokevirtual   #56  <Method void LocationClient.stop()>
		}
	//   15   33:return          
	}

	private void a(Context context, LocOption locoption, JsCallback jscallback)
	{
		locoption = ((LocOption) (b(context, locoption, jscallback)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #62  <Method Dialog b(Context, LocOption, JsCallback)>
	//    5    7:astore_2        
		context = ((Context) ((Activity)(new WeakReference(((Object) ((Activity)context)))).get()));
	//    6    8:new             #64  <Class WeakReference>
	//    7   11:dup             
	//    8   12:aload_1         
	//    9   13:checkcast       #66  <Class Activity>
	//   10   16:invokespecial   #69  <Method void WeakReference(Object)>
	//   11   19:invokevirtual   #73  <Method Object WeakReference.get()>
	//   12   22:checkcast       #66  <Class Activity>
	//   13   25:astore_1        
		if(locoption != null && !((Dialog) (locoption)).isShowing() && context != null && !((Activity) (context)).isFinishing())
	//*  14   26:aload_2         
	//*  15   27:ifnull          62
	//*  16   30:aload_2         
	//*  17   31:invokevirtual   #79  <Method boolean Dialog.isShowing()>
	//*  18   34:ifne            62
	//*  19   37:aload_1         
	//*  20   38:ifnull          62
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #82  <Method boolean Activity.isFinishing()>
	//*  23   45:ifne            62
			try
			{
				((Dialog) (locoption)).show();
	//   24   48:aload_2         
	//   25   49:invokevirtual   #85  <Method void Dialog.show()>
				return;
	//   26   52:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  27   53:astore_1        
			{
				Log.e("GetLocationApi", "openGpsDialog is show failed");
	//   28   54:ldc1            #9   <String "GetLocationApi">
	//   29   56:ldc1            #87  <String "openGpsDialog is show failed">
	//   30   58:invokestatic    #89  <Method int Log.e(String, String)>
	//   31   61:pop             
			}
	//   32   62:return          
	}

	static void a(GetLocationApi getlocationapi, Context context, LocOption locoption, JsCallback jscallback)
	{
		getlocationapi.d(context, locoption, jscallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #92  <Method void d(Context, LocOption, JsCallback)>
	//    5    7:return          
	}

	static void a(GetLocationApi getlocationapi, Address address, BDLocation bdlocation)
	{
		getlocationapi.a(address, bdlocation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #96  <Method void a(Address, BDLocation)>
	//    4    6:return          
	}

	static void a(GetLocationApi getlocationapi, Coordinates coordinates, BDLocation bdlocation)
	{
		getlocationapi.a(coordinates, bdlocation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #100 <Method void a(Coordinates, BDLocation)>
	//    4    6:return          
	}

	static void a(GetLocationApi getlocationapi, String s, boolean flag)
	{
		getlocationapi.a(s, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #104 <Method void a(String, boolean)>
	//    4    6:return          
	}

	private void a(Address address, BDLocation bdlocation)
	{
		address.setCountry(bdlocation.getCountry());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #110 <Method String BDLocation.getCountry()>
	//    3    5:invokevirtual   #116 <Method void Address.setCountry(String)>
		address.setCity(bdlocation.getCity());
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #119 <Method String BDLocation.getCity()>
	//    7   13:invokevirtual   #122 <Method void Address.setCity(String)>
		address.setCityCode(bdlocation.getCityCode());
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #125 <Method String BDLocation.getCityCode()>
	//   11   21:invokevirtual   #128 <Method void Address.setCityCode(String)>
		address.setDistrict(bdlocation.getDistrict());
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #131 <Method String BDLocation.getDistrict()>
	//   15   29:invokevirtual   #134 <Method void Address.setDistrict(String)>
		if(bdlocation.getPoiList() != null && bdlocation.getPoiList().size() > 0)
	//*  16   32:aload_2         
	//*  17   33:invokevirtual   #138 <Method List BDLocation.getPoiList()>
	//*  18   36:ifnull          71
	//*  19   39:aload_2         
	//*  20   40:invokevirtual   #138 <Method List BDLocation.getPoiList()>
	//*  21   43:invokeinterface #144 <Method int List.size()>
	//*  22   48:ifle            71
			address.setPoiName(((Poi)bdlocation.getPoiList().get(0)).getName());
	//   23   51:aload_1         
	//   24   52:aload_2         
	//   25   53:invokevirtual   #138 <Method List BDLocation.getPoiList()>
	//   26   56:iconst_0        
	//   27   57:invokeinterface #147 <Method Object List.get(int)>
	//   28   62:checkcast       #149 <Class Poi>
	//   29   65:invokevirtual   #152 <Method String Poi.getName()>
	//   30   68:invokevirtual   #155 <Method void Address.setPoiName(String)>
		address.setProvince(bdlocation.getProvince());
	//   31   71:aload_1         
	//   32   72:aload_2         
	//   33   73:invokevirtual   #158 <Method String BDLocation.getProvince()>
	//   34   76:invokevirtual   #161 <Method void Address.setProvince(String)>
		address.setStreet(bdlocation.getStreet());
	//   35   79:aload_1         
	//   36   80:aload_2         
	//   37   81:invokevirtual   #164 <Method String BDLocation.getStreet()>
	//   38   84:invokevirtual   #167 <Method void Address.setStreet(String)>
		address.setStreetNum(bdlocation.getStreetNumber());
	//   39   87:aload_1         
	//   40   88:aload_2         
	//   41   89:invokevirtual   #170 <Method String BDLocation.getStreetNumber()>
	//   42   92:invokevirtual   #173 <Method void Address.setStreetNum(String)>
	//   43   95:return          
	}

	private void a(Coordinates coordinates, BDLocation bdlocation)
	{
		coordinates.setLongitude(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field double b>
	//    3    5:invokevirtual   #179 <Method void Coordinates.setLongitude(double)>
		coordinates.setLatitude(c);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field double c>
	//    7   13:invokevirtual   #182 <Method void Coordinates.setLatitude(double)>
		coordinates.setAccuracy(bdlocation.getRadius());
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #186 <Method float BDLocation.getRadius()>
	//   11   21:invokevirtual   #190 <Method void Coordinates.setAccuracy(float)>
		coordinates.setAltitude(bdlocation.getAltitude());
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #194 <Method double BDLocation.getAltitude()>
	//   15   29:invokevirtual   #197 <Method void Coordinates.setAltitude(double)>
		coordinates.setHeading(bdlocation.getDirection());
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #200 <Method float BDLocation.getDirection()>
	//   19   37:invokevirtual   #203 <Method void Coordinates.setHeading(float)>
		coordinates.setSpeed((1000F * bdlocation.getSpeed()) / 3600F);
	//   20   40:aload_1         
	//   21   41:ldc1            #204 <Float 1000F>
	//   22   43:aload_2         
	//   23   44:invokevirtual   #207 <Method float BDLocation.getSpeed()>
	//   24   47:fmul            
	//   25   48:ldc1            #208 <Float 3600F>
	//   26   50:fdiv            
	//   27   51:invokevirtual   #211 <Method void Coordinates.setSpeed(float)>
	//   28   54:return          
	}

	private void a(LocOption locoption)
	{
		if(d == null || locoption == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field LocationClient d>
	//*   2    4:ifnull          11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		LocationClientOption locationclientoption = new LocationClientOption();
	//    6   12:new             #214 <Class LocationClientOption>
	//    7   15:dup             
	//    8   16:invokespecial   #215 <Method void LocationClientOption()>
	//    9   19:astore_2        
		if(locoption.getEnableHighAccuracy())
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #220 <Method boolean LocOption.getEnableHighAccuracy()>
	//*  12   24:ifeq            37
			locationclientoption.setLocationMode(com.baidu.location.LocationClientOption.LocationMode.Hight_Accuracy);
	//   13   27:aload_2         
	//   14   28:getstatic       #226 <Field com.baidu.location.LocationClientOption$LocationMode com.baidu.location.LocationClientOption$LocationMode.Hight_Accuracy>
	//   15   31:invokevirtual   #230 <Method void LocationClientOption.setLocationMode(com.baidu.location.LocationClientOption$LocationMode)>
		else
	//*  16   34:goto            44
			locationclientoption.setLocationMode(com.baidu.location.LocationClientOption.LocationMode.Battery_Saving);
	//   17   37:aload_2         
	//   18   38:getstatic       #233 <Field com.baidu.location.LocationClientOption$LocationMode com.baidu.location.LocationClientOption$LocationMode.Battery_Saving>
	//   19   41:invokevirtual   #230 <Method void LocationClientOption.setLocationMode(com.baidu.location.LocationClientOption$LocationMode)>
		locationclientoption.setCoorType(locoption.getCoordsType());
	//   20   44:aload_2         
	//   21   45:aload_1         
	//   22   46:invokevirtual   #236 <Method String LocOption.getCoordsType()>
	//   23   49:invokevirtual   #239 <Method void LocationClientOption.setCoorType(String)>
		Log.i("GetLocationApi", (new StringBuilder()).append("getGeocode").append(locoption.getGeocode()).toString());
	//   24   52:ldc1            #9   <String "GetLocationApi">
	//   25   54:new             #241 <Class StringBuilder>
	//   26   57:dup             
	//   27   58:invokespecial   #242 <Method void StringBuilder()>
	//   28   61:ldc1            #244 <String "getGeocode">
	//   29   63:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:aload_1         
	//   31   67:invokevirtual   #250 <Method boolean LocOption.getGeocode()>
	//   32   70:invokevirtual   #253 <Method StringBuilder StringBuilder.append(boolean)>
	//   33   73:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   34   76:invokestatic    #45  <Method int Log.i(String, String)>
	//   35   79:pop             
		locationclientoption.setIsNeedAddress(locoption.getGeocode());
	//   36   80:aload_2         
	//   37   81:aload_1         
	//   38   82:invokevirtual   #250 <Method boolean LocOption.getGeocode()>
	//   39   85:invokevirtual   #260 <Method void LocationClientOption.setIsNeedAddress(boolean)>
		locationclientoption.setTimeOut(locoption.getTimeout());
	//   40   88:aload_2         
	//   41   89:aload_1         
	//   42   90:invokevirtual   #263 <Method int LocOption.getTimeout()>
	//   43   93:invokevirtual   #267 <Method void LocationClientOption.setTimeOut(int)>
		d.setLocOption(locationclientoption);
	//   44   96:aload_0         
	//   45   97:getfield        #37  <Field LocationClient d>
	//   46  100:aload_2         
	//   47  101:invokevirtual   #271 <Method void LocationClient.setLocOption(LocationClientOption)>
	//   48  104:return          
	}

	private void a(String s, boolean flag)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #277 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            41
		{
			Log.i("GetLocationApi", (new StringBuilder()).append("setappid").append(s).toString());
	//    3    7:ldc1            #9   <String "GetLocationApi">
	//    4    9:new             #241 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #242 <Method void StringBuilder()>
	//    7   16:ldc2            #279 <String "setappid">
	//    8   19:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_1         
	//   10   23:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   12   29:invokestatic    #45  <Method int Log.i(String, String)>
	//   13   32:pop             
			com.huawei.hwCloudJs.service.locationapi.a.a.a().a(s, flag);
	//   14   33:invokestatic    #284 <Method a a.a()>
	//   15   36:aload_1         
	//   16   37:iload_2         
	//   17   38:invokevirtual   #285 <Method void a.a(String, boolean)>
		}
	//   18   41:return          
	}

	private boolean a(Context context)
	{
		return android.os.Build.VERSION.SDK_INT <= 22 || b(context);
	//    0    0:getstatic       #292 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          22
	//    2    5:icmple          16
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #294 <Method boolean b(Context)>
	//    6   13:ifeq            18
	//    7   16:iconst_1        
	//    8   17:ireturn         
	//    9   18:iconst_0        
	//   10   19:ireturn         
	}

	static boolean a(GetLocationApi getlocationapi, int ai[])
	{
		return getlocationapi.a(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #298 <Method boolean a(int[])>
	//    3    5:ireturn         
	}

	private boolean a(int ai[])
	{
		return ai != null && ai.length >= 1 && ai[0] == 0;
	//    0    0:aload_1         
	//    1    1:ifnull          18
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:iconst_1        
	//    5    7:icmplt          18
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:iaload          
	//    9   13:ifne            18
	//   10   16:iconst_1        
	//   11   17:ireturn         
	//   12   18:iconst_0        
	//   13   19:ireturn         
	}

	static double b(GetLocationApi getlocationapi)
	{
		return getlocationapi.c;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field double c>
	//    2    4:dreturn         
	}

	static double b(GetLocationApi getlocationapi, double d1)
	{
		getlocationapi.c = d1;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #26  <Field double c>
		return d1;
	//    3    5:dload_1         
	//    4    6:dreturn         
	}

	private Dialog b(Context context, LocOption locoption, JsCallback jscallback)
	{
		ILocDialog ilocdialog = (ILocDialog)com.huawei.hwCloudJs.core.extKit.a.b("loc_dlg", com/huawei/hwCloudJs/api/ILocDialog);
	//    0    0:ldc2            #300 <String "loc_dlg">
	//    1    3:ldc2            #302 <Class ILocDialog>
	//    2    6:invokestatic    #307 <Method Object com.huawei.hwCloudJs.core.extKit.a.b(String, Class)>
	//    3    9:checkcast       #302 <Class ILocDialog>
	//    4   12:astore          4
		if(ilocdialog != null)
	//*   5   14:aload           4
	//*   6   16:ifnull          46
			f = ilocdialog.genDialog(context, locoption.getWebUrl(), ((com.huawei.hwCloudJs.api.ILocDialog.DialogResult) (new _cls2(locoption, context, jscallback))));
	//    7   19:aload_0         
	//    8   20:aload           4
	//    9   22:aload_1         
	//   10   23:aload_2         
	//   11   24:invokevirtual   #310 <Method String LocOption.getWebUrl()>
	//   12   27:new             #312 <Class GetLocationApi$2>
	//   13   30:dup             
	//   14   31:aload_0         
	//   15   32:aload_2         
	//   16   33:aload_1         
	//   17   34:aload_3         
	//   18   35:invokespecial   #315 <Method void GetLocationApi$2(GetLocationApi, LocOption, Context, JsCallback)>
	//   19   38:invokeinterface #319 <Method Dialog ILocDialog.genDialog(Context, String, com.huawei.hwCloudJs.api.ILocDialog$DialogResult)>
	//   20   43:putfield        #35  <Field Dialog f>
		return f;
	//   21   46:aload_0         
	//   22   47:getfield        #35  <Field Dialog f>
	//   23   50:areturn         
	}

	static void b(GetLocationApi getlocationapi, Context context, LocOption locoption, JsCallback jscallback)
	{
		getlocationapi.c(context, locoption, jscallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #321 <Method void c(Context, LocOption, JsCallback)>
	//    5    7:return          
	}

	private boolean b(Context context)
	{
		context = ((Context) ((LocationManager)context.getSystemService("location")));
	//    0    0:aload_1         
	//    1    1:ldc2            #323 <String "location">
	//    2    4:invokevirtual   #329 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #331 <Class LocationManager>
	//    4   10:astore_1        
		if(context == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		boolean flag = ((LocationManager) (context)).isProviderEnabled("gps");
	//    9   17:aload_1         
	//   10   18:ldc2            #333 <String "gps">
	//   11   21:invokevirtual   #337 <Method boolean LocationManager.isProviderEnabled(String)>
	//   12   24:istore_2        
		boolean flag1 = ((LocationManager) (context)).isProviderEnabled("network");
	//   13   25:aload_1         
	//   14   26:ldc2            #339 <String "network">
	//   15   29:invokevirtual   #337 <Method boolean LocationManager.isProviderEnabled(String)>
	//   16   32:istore_3        
		return flag || flag1;
	//   17   33:iload_2         
	//   18   34:ifne            41
	//   19   37:iload_3         
	//   20   38:ifeq            43
	//   21   41:iconst_1        
	//   22   42:ireturn         
	//   23   43:iconst_0        
	//   24   44:ireturn         
	}

	private boolean b(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #277 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            15
			return com.huawei.hwCloudJs.service.locationapi.a.a.a().a(s);
	//    3    7:invokestatic    #284 <Method a a.a()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #341 <Method boolean a.a(String)>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private static long c(String s)
	{
		long l = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(s).getTime();
	//    0    0:new             #345 <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc2            #347 <String "yyyy-MM-dd HH:mm:ss">
	//    3    7:invokespecial   #349 <Method void SimpleDateFormat(String)>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #353 <Method Date SimpleDateFormat.parse(String)>
	//    6   14:invokevirtual   #359 <Method long Date.getTime()>
	//    7   17:lstore_1        
		return l;
	//    8   18:lload_1         
	//    9   19:lreturn         
		s;
	//   10   20:astore_0        
		Log.e("GetLocationApi", "date2TimeStamp Exception!");
	//   11   21:ldc1            #9   <String "GetLocationApi">
	//   12   23:ldc2            #361 <String "date2TimeStamp Exception!">
	//   13   26:invokestatic    #89  <Method int Log.e(String, String)>
	//   14   29:pop             
		break MISSING_BLOCK_LABEL_43;
	//   15   30:goto            43
		s;
	//   16   33:astore_0        
		Log.e("GetLocationApi", "date2TimeStamp Exception!");
	//   17   34:ldc1            #9   <String "GetLocationApi">
	//   18   36:ldc2            #361 <String "date2TimeStamp Exception!">
	//   19   39:invokestatic    #89  <Method int Log.e(String, String)>
	//   20   42:pop             
		return 0L;
	//   21   43:lconst_0        
	//   22   44:lreturn         
	}

	private List c(Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #364 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #365 <Method void ArrayList()>
	//    3    7:astore_3        
		if(android.os.Build.VERSION.SDK_INT <= 22)
	//*   4    8:getstatic       #292 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          22
	//*   6   13:icmpgt          18
			return ((List) (arraylist));
	//    7   16:aload_3         
	//    8   17:areturn         
		String as[] = new String[2];
	//    9   18:iconst_2        
	//   10   19:anewarray       String[]
	//   11   22:astore          4
		as[0] = "android.permission.ACCESS_FINE_LOCATION";
	//   12   24:aload           4
	//   13   26:iconst_0        
	//   14   27:ldc2            #369 <String "android.permission.ACCESS_FINE_LOCATION">
	//   15   30:aastore         
		as[1] = "android.permission.ACCESS_COARSE_LOCATION";
	//   16   31:aload           4
	//   17   33:iconst_1        
	//   18   34:ldc2            #371 <String "android.permission.ACCESS_COARSE_LOCATION">
	//   19   37:aastore         
		int i = as.length;
	//   20   38:aload           4
	//   21   40:arraylength     
	//   22   41:istore_2        
		for(int j = 0; j < 2; j++)
	//*  23   42:iconst_0        
	//*  24   43:istore_2        
	//*  25   44:iload_2         
	//*  26   45:iconst_2        
	//*  27   46:icmpge          78
		{
			String s = as[j];
	//   28   49:aload           4
	//   29   51:iload_2         
	//   30   52:aaload          
	//   31   53:astore          5
			if(context.checkSelfPermission(s) != 0)
	//*  32   55:aload_1         
	//*  33   56:aload           5
	//*  34   58:invokevirtual   #375 <Method int Context.checkSelfPermission(String)>
	//*  35   61:ifeq            71
				arraylist.add(((Object) (s)));
	//   36   64:aload_3         
	//   37   65:aload           5
	//   38   67:invokevirtual   #379 <Method boolean ArrayList.add(Object)>
	//   39   70:pop             
		}

	//   40   71:iload_2         
	//   41   72:iconst_1        
	//   42   73:iadd            
	//   43   74:istore_2        
	//*  44   75:goto            44
		return ((List) (arraylist));
	//   45   78:aload_3         
	//   46   79:areturn         
	}

	private void c(Context context, LocOption locoption, JsCallback jscallback)
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field LocationClient d>
	//*   2    4:ifnonnull       19
			d = new LocationClient(context);
	//    3    7:aload_0         
	//    4    8:new             #49  <Class LocationClient>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #384 <Method void LocationClient(Context)>
	//    8   16:putfield        #37  <Field LocationClient d>
		a(locoption);
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokespecial   #386 <Method void a(LocOption)>
		d.registerLocationListener(((com.baidu.location.BDLocationListener) (e)));
	//   12   24:aload_0         
	//   13   25:getfield        #37  <Field LocationClient d>
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field b e>
	//   16   32:invokevirtual   #389 <Method void LocationClient.registerLocationListener(com.baidu.location.BDLocationListener)>
		d.start();
	//   17   35:aload_0         
	//   18   36:getfield        #37  <Field LocationClient d>
	//   19   39:invokevirtual   #392 <Method void LocationClient.start()>
	//   20   42:return          
	}

	static void c(GetLocationApi getlocationapi)
	{
		getlocationapi.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #395 <Method void a()>
	//    2    4:return          
	}

	static Dialog d(GetLocationApi getlocationapi)
	{
		return getlocationapi.f;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Dialog f>
	//    2    4:areturn         
	}

	private void d(Context context, LocOption locoption, JsCallback jscallback)
	{
		boolean flag = a(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #401 <Method boolean a(Context)>
	//    3    5:istore          4
		List list = c(context);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokespecial   #403 <Method List c(Context)>
	//    7   12:astore          5
		if(!flag)
	//*   8   14:iload           4
	//*   9   16:ifne            37
		{
			Log.e("GetLocationApi", "sysLocateEnabled false!");
	//   10   19:ldc1            #9   <String "GetLocationApi">
	//   11   21:ldc2            #405 <String "sysLocateEnabled false!">
	//   12   24:invokestatic    #89  <Method int Log.e(String, String)>
	//   13   27:pop             
			jscallback.failure(1, "sysLocateEnabled false!");
	//   14   28:aload_3         
	//   15   29:iconst_1        
	//   16   30:ldc2            #405 <String "sysLocateEnabled false!">
	//   17   33:invokevirtual   #411 <Method void JsCallback.failure(int, String)>
			return;
	//   18   36:return          
		}
		if(!list.isEmpty())
	//*  19   37:aload           5
	//*  20   39:invokeinterface #413 <Method boolean List.isEmpty()>
	//*  21   44:ifne            126
		{
			Activity activity = (Activity)(new WeakReference(((Object) ((Activity)context)))).get();
	//   22   47:new             #64  <Class WeakReference>
	//   23   50:dup             
	//   24   51:aload_1         
	//   25   52:checkcast       #66  <Class Activity>
	//   26   55:invokespecial   #69  <Method void WeakReference(Object)>
	//   27   58:invokevirtual   #73  <Method Object WeakReference.get()>
	//   28   61:checkcast       #66  <Class Activity>
	//   29   64:astore          6
			if(activity == null)
	//*  30   66:aload           6
	//*  31   68:ifnonnull       80
			{
				jscallback.failure(1, "locationPermissionCheck false!");
	//   32   71:aload_3         
	//   33   72:iconst_1        
	//   34   73:ldc2            #415 <String "locationPermissionCheck false!">
	//   35   76:invokevirtual   #411 <Method void JsCallback.failure(int, String)>
				return;
	//   36   79:return          
			} else
			{
				a().(((com.huawei.hwCloudJs.support.b.b) (new _cls3(context, locoption, jscallback))));
	//   37   80:invokestatic    #420 <Method com.huawei.hwCloudJs.service.locationapi.a a()>
	//   38   83:new             #422 <Class GetLocationApi$3>
	//   39   86:dup             
	//   40   87:aload_0         
	//   41   88:aload_1         
	//   42   89:aload_2         
	//   43   90:aload_3         
	//   44   91:invokespecial   #424 <Method void GetLocationApi$3(GetLocationApi, Context, LocOption, JsCallback)>
	//   45   94:invokevirtual   #427 <Method void a(com.huawei.hwCloudJs.support.b.b)>
				activity.requestPermissions((String[])list.toArray(((Object []) (new String[list.size()]))), 9006);
	//   46   97:aload           6
	//   47   99:aload           5
	//   48  101:aload           5
	//   49  103:invokeinterface #144 <Method int List.size()>
	//   50  108:anewarray       String[]
	//   51  111:invokeinterface #431 <Method Object[] List.toArray(Object[])>
	//   52  116:checkcast       #433 <Class String[]>
	//   53  119:sipush          9006
	//   54  122:invokevirtual   #437 <Method void Activity.requestPermissions(String[], int)>
				return;
	//   55  125:return          
			}
		} else
		{
			c(context, locoption, jscallback);
	//   56  126:aload_0         
	//   57  127:aload_1         
	//   58  128:aload_2         
	//   59  129:aload_3         
	//   60  130:invokespecial   #321 <Method void c(Context, LocOption, JsCallback)>
			return;
	//   61  133:return          
		}
	}

	public void getCurrentPosition(LocOption locoption, JsCallback jscallback)
	{
		Log.e("GetLocationApi", "getCurrentPosition done");
	//    0    0:ldc1            #9   <String "GetLocationApi">
	//    1    2:ldc2            #447 <String "getCurrentPosition done">
	//    2    5:invokestatic    #89  <Method int Log.e(String, String)>
	//    3    8:pop             
		Object obj = ((Object) (jscallback.getWebView()));
	//    4    9:aload_2         
	//    5   10:invokevirtual   #451 <Method WebView JsCallback.getWebView()>
	//    6   13:astore_3        
		if(obj == null || locoption == null)
	//*   7   14:aload_3         
	//*   8   15:ifnull          22
	//*   9   18:aload_1         
	//*  10   19:ifnonnull       31
		{
			jscallback.failure(4, "webView == null ||null == locOption!");
	//   11   22:aload_2         
	//   12   23:iconst_4        
	//   13   24:ldc2            #453 <String "webView == null ||null == locOption!">
	//   14   27:invokevirtual   #411 <Method void JsCallback.failure(int, String)>
			return;
	//   15   30:return          
		}
		obj = ((Object) (((WebView) (obj)).getContext()));
	//   16   31:aload_3         
	//   17   32:invokevirtual   #459 <Method Context WebView.getContext()>
	//   18   35:astore_3        
		e = new b(((b.a) (new _cls1(jscallback, locoption))));
	//   19   36:aload_0         
	//   20   37:new             #461 <Class b>
	//   21   40:dup             
	//   22   41:new             #463 <Class GetLocationApi$1>
	//   23   44:dup             
	//   24   45:aload_0         
	//   25   46:aload_2         
	//   26   47:aload_1         
	//   27   48:invokespecial   #466 <Method void GetLocationApi$1(GetLocationApi, JsCallback, LocOption)>
	//   28   51:invokespecial   #469 <Method void b(b$a)>
	//   29   54:putfield        #47  <Field b e>
		if(com.huawei.hwCloudJs.b.a.b() && !b(locoption.getAppId()))
	//*  30   57:invokestatic    #473 <Method boolean com.huawei.hwCloudJs.b.a.b()>
	//*  31   60:ifeq            82
	//*  32   63:aload_0         
	//*  33   64:aload_1         
	//*  34   65:invokevirtual   #476 <Method String LocOption.getAppId()>
	//*  35   68:invokespecial   #478 <Method boolean b(String)>
	//*  36   71:ifne            82
		{
			a(((Context) (obj)), locoption, jscallback);
	//   37   74:aload_0         
	//   38   75:aload_3         
	//   39   76:aload_1         
	//   40   77:aload_2         
	//   41   78:invokespecial   #480 <Method void a(Context, LocOption, JsCallback)>
			return;
	//   42   81:return          
		} else
		{
			d(((Context) (obj)), locoption, jscallback);
	//   43   82:aload_0         
	//   44   83:aload_3         
	//   45   84:aload_1         
	//   46   85:aload_2         
	//   47   86:invokespecial   #92  <Method void d(Context, LocOption, JsCallback)>
			return;
	//   48   89:return          
		}
	}

	private static final String a = "GetLocationApi";
	private double b;
	private double c;
	private LocationClient d;
	private b e;
	private Dialog f;

	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls1 {}

}
