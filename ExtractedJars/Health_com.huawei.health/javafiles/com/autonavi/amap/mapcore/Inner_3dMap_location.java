// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.location.Location;
import com.amap.api.mapcore.util.lh;
import com.amap.api.mapcore.util.lk;
import org.json.JSONObject;

public class Inner_3dMap_location extends Location
	implements Cloneable
{

	public Inner_3dMap_location(Location location)
	{
		super(location);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void Location(Location)>
		province = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #84  <String "">
	//    5    8:putfield        #86  <Field String province>
		city = "";
	//    6   11:aload_0         
	//    7   12:ldc1            #84  <String "">
	//    8   14:putfield        #88  <Field String city>
		district = "";
	//    9   17:aload_0         
	//   10   18:ldc1            #84  <String "">
	//   11   20:putfield        #90  <Field String district>
		cityCode = "";
	//   12   23:aload_0         
	//   13   24:ldc1            #84  <String "">
	//   14   26:putfield        #92  <Field String cityCode>
		adCode = "";
	//   15   29:aload_0         
	//   16   30:ldc1            #84  <String "">
	//   17   32:putfield        #94  <Field String adCode>
		address = "";
	//   18   35:aload_0         
	//   19   36:ldc1            #84  <String "">
	//   20   38:putfield        #96  <Field String address>
		poiName = "";
	//   21   41:aload_0         
	//   22   42:ldc1            #84  <String "">
	//   23   44:putfield        #98  <Field String poiName>
		country = "";
	//   24   47:aload_0         
	//   25   48:ldc1            #84  <String "">
	//   26   50:putfield        #100 <Field String country>
		road = "";
	//   27   53:aload_0         
	//   28   54:ldc1            #84  <String "">
	//   29   56:putfield        #102 <Field String road>
		street = "";
	//   30   59:aload_0         
	//   31   60:ldc1            #84  <String "">
	//   32   62:putfield        #104 <Field String street>
		number = "";
	//   33   65:aload_0         
	//   34   66:ldc1            #84  <String "">
	//   35   68:putfield        #106 <Field String number>
		isOffset = true;
	//   36   71:aload_0         
	//   37   72:iconst_1        
	//   38   73:putfield        #108 <Field boolean isOffset>
		errorCode = 0;
	//   39   76:aload_0         
	//   40   77:iconst_0        
	//   41   78:putfield        #110 <Field int errorCode>
		errorInfo = "success";
	//   42   81:aload_0         
	//   43   82:ldc1            #112 <String "success">
	//   44   84:putfield        #114 <Field String errorInfo>
		locationDetail = "";
	//   45   87:aload_0         
	//   46   88:ldc1            #84  <String "">
	//   47   90:putfield        #116 <Field String locationDetail>
		locationType = 0;
	//   48   93:aload_0         
	//   49   94:iconst_0        
	//   50   95:putfield        #118 <Field int locationType>
		latitude = 0.0D;
	//   51   98:aload_0         
	//   52   99:dconst_0        
	//   53  100:putfield        #120 <Field double latitude>
		longitude = 0.0D;
	//   54  103:aload_0         
	//   55  104:dconst_0        
	//   56  105:putfield        #122 <Field double longitude>
		satellites = 0;
	//   57  108:aload_0         
	//   58  109:iconst_0        
	//   59  110:putfield        #124 <Field int satellites>
		aoiName = "";
	//   60  113:aload_0         
	//   61  114:ldc1            #84  <String "">
	//   62  116:putfield        #126 <Field String aoiName>
		signalIntensity = -1;
	//   63  119:aload_0         
	//   64  120:iconst_m1       
	//   65  121:putfield        #128 <Field int signalIntensity>
		buildingId = "";
	//   66  124:aload_0         
	//   67  125:ldc1            #84  <String "">
	//   68  127:putfield        #130 <Field String buildingId>
		floor = "";
	//   69  130:aload_0         
	//   70  131:ldc1            #84  <String "">
	//   71  133:putfield        #132 <Field String floor>
		desc = "";
	//   72  136:aload_0         
	//   73  137:ldc1            #84  <String "">
	//   74  139:putfield        #134 <Field String desc>
		latitude = location.getLatitude();
	//   75  142:aload_0         
	//   76  143:aload_1         
	//   77  144:invokevirtual   #138 <Method double Location.getLatitude()>
	//   78  147:putfield        #120 <Field double latitude>
		longitude = location.getLongitude();
	//   79  150:aload_0         
	//   80  151:aload_1         
	//   81  152:invokevirtual   #141 <Method double Location.getLongitude()>
	//   82  155:putfield        #122 <Field double longitude>
	//   83  158:return          
	}

	public Inner_3dMap_location(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #145 <Method void Location(String)>
		province = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #84  <String "">
	//    5    8:putfield        #86  <Field String province>
		city = "";
	//    6   11:aload_0         
	//    7   12:ldc1            #84  <String "">
	//    8   14:putfield        #88  <Field String city>
		district = "";
	//    9   17:aload_0         
	//   10   18:ldc1            #84  <String "">
	//   11   20:putfield        #90  <Field String district>
		cityCode = "";
	//   12   23:aload_0         
	//   13   24:ldc1            #84  <String "">
	//   14   26:putfield        #92  <Field String cityCode>
		adCode = "";
	//   15   29:aload_0         
	//   16   30:ldc1            #84  <String "">
	//   17   32:putfield        #94  <Field String adCode>
		address = "";
	//   18   35:aload_0         
	//   19   36:ldc1            #84  <String "">
	//   20   38:putfield        #96  <Field String address>
		poiName = "";
	//   21   41:aload_0         
	//   22   42:ldc1            #84  <String "">
	//   23   44:putfield        #98  <Field String poiName>
		country = "";
	//   24   47:aload_0         
	//   25   48:ldc1            #84  <String "">
	//   26   50:putfield        #100 <Field String country>
		road = "";
	//   27   53:aload_0         
	//   28   54:ldc1            #84  <String "">
	//   29   56:putfield        #102 <Field String road>
		street = "";
	//   30   59:aload_0         
	//   31   60:ldc1            #84  <String "">
	//   32   62:putfield        #104 <Field String street>
		number = "";
	//   33   65:aload_0         
	//   34   66:ldc1            #84  <String "">
	//   35   68:putfield        #106 <Field String number>
		isOffset = true;
	//   36   71:aload_0         
	//   37   72:iconst_1        
	//   38   73:putfield        #108 <Field boolean isOffset>
		errorCode = 0;
	//   39   76:aload_0         
	//   40   77:iconst_0        
	//   41   78:putfield        #110 <Field int errorCode>
		errorInfo = "success";
	//   42   81:aload_0         
	//   43   82:ldc1            #112 <String "success">
	//   44   84:putfield        #114 <Field String errorInfo>
		locationDetail = "";
	//   45   87:aload_0         
	//   46   88:ldc1            #84  <String "">
	//   47   90:putfield        #116 <Field String locationDetail>
		locationType = 0;
	//   48   93:aload_0         
	//   49   94:iconst_0        
	//   50   95:putfield        #118 <Field int locationType>
		latitude = 0.0D;
	//   51   98:aload_0         
	//   52   99:dconst_0        
	//   53  100:putfield        #120 <Field double latitude>
		longitude = 0.0D;
	//   54  103:aload_0         
	//   55  104:dconst_0        
	//   56  105:putfield        #122 <Field double longitude>
		satellites = 0;
	//   57  108:aload_0         
	//   58  109:iconst_0        
	//   59  110:putfield        #124 <Field int satellites>
		aoiName = "";
	//   60  113:aload_0         
	//   61  114:ldc1            #84  <String "">
	//   62  116:putfield        #126 <Field String aoiName>
		signalIntensity = -1;
	//   63  119:aload_0         
	//   64  120:iconst_m1       
	//   65  121:putfield        #128 <Field int signalIntensity>
		buildingId = "";
	//   66  124:aload_0         
	//   67  125:ldc1            #84  <String "">
	//   68  127:putfield        #130 <Field String buildingId>
		floor = "";
	//   69  130:aload_0         
	//   70  131:ldc1            #84  <String "">
	//   71  133:putfield        #132 <Field String floor>
		desc = "";
	//   72  136:aload_0         
	//   73  137:ldc1            #84  <String "">
	//   74  139:putfield        #134 <Field String desc>
	//   75  142:return          
	}

	public Inner_3dMap_location clone()
	{
		Inner_3dMap_location inner_3dmap_location;
		try
		{
			((Object)this).clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method Object Object.clone()>
	//    2    4:pop             
		}
	//*   3    5:new             #2   <Class Inner_3dMap_location>
	//*   4    8:dup             
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #155 <Method void Inner_3dMap_location(Location)>
	//*   7   13:astore_1        
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #86  <Field String province>
	//*  11   19:invokevirtual   #158 <Method void setProvince(String)>
	//*  12   22:aload_1         
	//*  13   23:aload_0         
	//*  14   24:getfield        #88  <Field String city>
	//*  15   27:invokevirtual   #161 <Method void setCity(String)>
	//*  16   30:aload_1         
	//*  17   31:aload_0         
	//*  18   32:getfield        #90  <Field String district>
	//*  19   35:invokevirtual   #164 <Method void setDistrict(String)>
	//*  20   38:aload_1         
	//*  21   39:aload_0         
	//*  22   40:getfield        #92  <Field String cityCode>
	//*  23   43:invokevirtual   #167 <Method void setCityCode(String)>
	//*  24   46:aload_1         
	//*  25   47:aload_0         
	//*  26   48:getfield        #94  <Field String adCode>
	//*  27   51:invokevirtual   #170 <Method void setAdCode(String)>
	//*  28   54:aload_1         
	//*  29   55:aload_0         
	//*  30   56:getfield        #96  <Field String address>
	//*  31   59:invokevirtual   #173 <Method void setAddress(String)>
	//*  32   62:aload_1         
	//*  33   63:aload_0         
	//*  34   64:getfield        #98  <Field String poiName>
	//*  35   67:invokevirtual   #176 <Method void setPoiName(String)>
	//*  36   70:aload_1         
	//*  37   71:aload_0         
	//*  38   72:getfield        #100 <Field String country>
	//*  39   75:invokevirtual   #179 <Method void setCountry(String)>
	//*  40   78:aload_1         
	//*  41   79:aload_0         
	//*  42   80:getfield        #102 <Field String road>
	//*  43   83:invokevirtual   #182 <Method void setRoad(String)>
	//*  44   86:aload_1         
	//*  45   87:aload_0         
	//*  46   88:getfield        #104 <Field String street>
	//*  47   91:invokevirtual   #185 <Method void setStreet(String)>
	//*  48   94:aload_1         
	//*  49   95:aload_0         
	//*  50   96:getfield        #106 <Field String number>
	//*  51   99:invokevirtual   #188 <Method void setNumber(String)>
	//*  52  102:aload_1         
	//*  53  103:aload_0         
	//*  54  104:getfield        #108 <Field boolean isOffset>
	//*  55  107:invokevirtual   #192 <Method void setOffset(boolean)>
	//*  56  110:aload_1         
	//*  57  111:aload_0         
	//*  58  112:getfield        #110 <Field int errorCode>
	//*  59  115:invokevirtual   #196 <Method void setErrorCode(int)>
	//*  60  118:aload_1         
	//*  61  119:aload_0         
	//*  62  120:getfield        #114 <Field String errorInfo>
	//*  63  123:invokevirtual   #199 <Method void setErrorInfo(String)>
	//*  64  126:aload_1         
	//*  65  127:aload_0         
	//*  66  128:getfield        #116 <Field String locationDetail>
	//*  67  131:invokevirtual   #202 <Method void setLocationDetail(String)>
	//*  68  134:aload_1         
	//*  69  135:aload_0         
	//*  70  136:getfield        #118 <Field int locationType>
	//*  71  139:invokevirtual   #205 <Method void setLocationType(int)>
	//*  72  142:aload_1         
	//*  73  143:aload_0         
	//*  74  144:getfield        #120 <Field double latitude>
	//*  75  147:invokevirtual   #209 <Method void setLatitude(double)>
	//*  76  150:aload_1         
	//*  77  151:aload_0         
	//*  78  152:getfield        #122 <Field double longitude>
	//*  79  155:invokevirtual   #212 <Method void setLongitude(double)>
	//*  80  158:aload_1         
	//*  81  159:aload_0         
	//*  82  160:getfield        #124 <Field int satellites>
	//*  83  163:invokevirtual   #215 <Method void setSatellites(int)>
	//*  84  166:aload_1         
	//*  85  167:aload_0         
	//*  86  168:getfield        #126 <Field String aoiName>
	//*  87  171:invokevirtual   #218 <Method void setAoiName(String)>
	//*  88  174:aload_1         
	//*  89  175:aload_0         
	//*  90  176:getfield        #130 <Field String buildingId>
	//*  91  179:invokevirtual   #221 <Method void setBuildingId(String)>
	//*  92  182:aload_1         
	//*  93  183:aload_0         
	//*  94  184:getfield        #132 <Field String floor>
	//*  95  187:invokevirtual   #224 <Method void setFloor(String)>
	//*  96  190:aload_1         
	//*  97  191:aload_0         
	//*  98  192:getfield        #128 <Field int signalIntensity>
	//*  99  195:invokevirtual   #227 <Method void setGpsAccuracyStatus(int)>
	//* 100  198:aload_1         
	//* 101  199:aload_0         
	//* 102  200:invokevirtual   #231 <Method android.os.Bundle getExtras()>
	//* 103  203:invokevirtual   #235 <Method void setExtras(android.os.Bundle)>
	//* 104  206:aload_1         
	//* 105  207:areturn         
		catch(Throwable throwable) { }
	//  106  208:astore_1        
		inner_3dmap_location = new Inner_3dMap_location(((Location) (this)));
		inner_3dmap_location.setProvince(province);
		inner_3dmap_location.setCity(city);
		inner_3dmap_location.setDistrict(district);
		inner_3dmap_location.setCityCode(cityCode);
		inner_3dmap_location.setAdCode(adCode);
		inner_3dmap_location.setAddress(address);
		inner_3dmap_location.setPoiName(poiName);
		inner_3dmap_location.setCountry(country);
		inner_3dmap_location.setRoad(road);
		inner_3dmap_location.setStreet(street);
		inner_3dmap_location.setNumber(number);
		inner_3dmap_location.setOffset(isOffset);
		inner_3dmap_location.setErrorCode(errorCode);
		inner_3dmap_location.setErrorInfo(errorInfo);
		inner_3dmap_location.setLocationDetail(locationDetail);
		inner_3dmap_location.setLocationType(locationType);
		inner_3dmap_location.setLatitude(latitude);
		inner_3dmap_location.setLongitude(longitude);
		inner_3dmap_location.setSatellites(satellites);
		inner_3dmap_location.setAoiName(aoiName);
		inner_3dmap_location.setBuildingId(buildingId);
		inner_3dmap_location.setFloor(floor);
		inner_3dmap_location.setGpsAccuracyStatus(signalIntensity);
		inner_3dmap_location.setExtras(getExtras());
		return inner_3dmap_location;
	//* 107  209:goto            5
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method Inner_3dMap_location clone()>
	//    2    4:areturn         
	}

	public float getAccuracy()
	{
		return super.getAccuracy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #244 <Method float Location.getAccuracy()>
	//    2    4:freturn         
	}

	public String getAdCode()
	{
		return adCode;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field String adCode>
	//    2    4:areturn         
	}

	public String getAddress()
	{
		return address;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String address>
	//    2    4:areturn         
	}

	public double getAltitude()
	{
		return super.getAltitude();
	//    0    0:aload_0         
	//    1    1:invokespecial   #250 <Method double Location.getAltitude()>
	//    2    4:dreturn         
	}

	public String getAoiName()
	{
		return aoiName;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field String aoiName>
	//    2    4:areturn         
	}

	public float getBearing()
	{
		return super.getBearing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #254 <Method float Location.getBearing()>
	//    2    4:freturn         
	}

	public String getBuildingId()
	{
		return buildingId;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field String buildingId>
	//    2    4:areturn         
	}

	public String getCity()
	{
		return city;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String city>
	//    2    4:areturn         
	}

	public String getCityCode()
	{
		return cityCode;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String cityCode>
	//    2    4:areturn         
	}

	public String getCountry()
	{
		return country;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String country>
	//    2    4:areturn         
	}

	public String getDistrict()
	{
		return district;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String district>
	//    2    4:areturn         
	}

	public int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field int errorCode>
	//    2    4:ireturn         
	}

	public String getErrorInfo()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #264 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #267 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(errorInfo);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #114 <Field String errorInfo>
	//    7   13:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		if(errorCode != 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #110 <Field int errorCode>
	//*  11   21:ifeq            57
		{
			stringbuilder.append(" \u8BF7\u5230http://lbs.amap.com/api/android-location-sdk/guide/utilities/errorcode/\u67E5\u770B\u9519\u8BEF\u7801\u8BF4\u660E");
	//   12   24:aload_1         
	//   13   25:ldc2            #273 <String " \u8BF7\u5230http://lbs.amap.com/api/android-location-sdk/guide/utilities/errorcode/\u67E5\u770B\u9519\u8BEF\u7801\u8BF4\u660E">
	//   14   28:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			stringbuilder.append((new StringBuilder(",\u9519\u8BEF\u8BE6\u7EC6\u4FE1\u606F:")).append(locationDetail).toString());
	//   16   32:aload_1         
	//   17   33:new             #264 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:ldc2            #275 <String ",\u9519\u8BEF\u8BE6\u7EC6\u4FE1\u606F:">
	//   20   40:invokespecial   #276 <Method void StringBuilder(String)>
	//   21   43:aload_0         
	//   22   44:getfield        #116 <Field String locationDetail>
	//   23   47:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   25   53:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
		}
		errorInfo = stringbuilder.toString();
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   30   62:putfield        #114 <Field String errorInfo>
		return errorInfo;
	//   31   65:aload_0         
	//   32   66:getfield        #114 <Field String errorInfo>
	//   33   69:areturn         
	}

	public String getFloor()
	{
		return floor;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field String floor>
	//    2    4:areturn         
	}

	public int getGpsAccuracyStatus()
	{
		return signalIntensity;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int signalIntensity>
	//    2    4:ireturn         
	}

	public double getLatitude()
	{
		return latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field double latitude>
	//    2    4:dreturn         
	}

	public String getLocationDetail()
	{
		return locationDetail;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field String locationDetail>
	//    2    4:areturn         
	}

	public int getLocationType()
	{
		return locationType;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int locationType>
	//    2    4:ireturn         
	}

	public double getLongitude()
	{
		return longitude;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field double longitude>
	//    2    4:dreturn         
	}

	public String getPoiName()
	{
		return poiName;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String poiName>
	//    2    4:areturn         
	}

	public String getProvider()
	{
		return super.getProvider();
	//    0    0:aload_0         
	//    1    1:invokespecial   #287 <Method String Location.getProvider()>
	//    2    4:areturn         
	}

	public String getProvince()
	{
		return province;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String province>
	//    2    4:areturn         
	}

	public String getRoad()
	{
		return road;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String road>
	//    2    4:areturn         
	}

	public int getSatellites()
	{
		return satellites;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int satellites>
	//    2    4:ireturn         
	}

	public float getSpeed()
	{
		return super.getSpeed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method float Location.getSpeed()>
	//    2    4:freturn         
	}

	public String getStreet()
	{
		return street;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String street>
	//    2    4:areturn         
	}

	public String getStreetNum()
	{
		return number;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field String number>
	//    2    4:areturn         
	}

	public boolean isOffset()
	{
		return isOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field boolean isOffset>
	//    2    4:ireturn         
	}

	public void setAdCode(String s)
	{
		adCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field String adCode>
	//    3    5:return          
	}

	public void setAddress(String s)
	{
		address = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field String address>
	//    3    5:return          
	}

	public void setAoiName(String s)
	{
		aoiName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #126 <Field String aoiName>
	//    3    5:return          
	}

	public void setBuildingId(String s)
	{
		buildingId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field String buildingId>
	//    3    5:return          
	}

	public void setCity(String s)
	{
		city = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field String city>
	//    3    5:return          
	}

	public void setCityCode(String s)
	{
		cityCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field String cityCode>
	//    3    5:return          
	}

	public void setCountry(String s)
	{
		country = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field String country>
	//    3    5:return          
	}

	public void setDistrict(String s)
	{
		district = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field String district>
	//    3    5:return          
	}

	public void setErrorCode(int i)
	{
		if(errorCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field int errorCode>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			errorInfo = lk.b(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokestatic    #302 <Method String lk.b(int)>
	//    7   13:putfield        #114 <Field String errorInfo>
			errorCode = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #110 <Field int errorCode>
			return;
	//   11   21:return          
		}
	}

	public void setErrorInfo(String s)
	{
		errorInfo = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #114 <Field String errorInfo>
	//    3    5:return          
	}

	public void setFloor(String s)
	{
		floor = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field String floor>
	//    3    5:return          
	}

	public void setGpsAccuracyStatus(int i)
	{
		signalIntensity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field int signalIntensity>
	//    3    5:return          
	}

	public void setLatitude(double d)
	{
		latitude = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #120 <Field double latitude>
	//    3    5:return          
	}

	public void setLocationDetail(String s)
	{
		locationDetail = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field String locationDetail>
	//    3    5:return          
	}

	public void setLocationType(int i)
	{
		locationType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #118 <Field int locationType>
	//    3    5:return          
	}

	public void setLongitude(double d)
	{
		longitude = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #122 <Field double longitude>
	//    3    5:return          
	}

	public void setNumber(String s)
	{
		number = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field String number>
	//    3    5:return          
	}

	public void setOffset(boolean flag)
	{
		isOffset = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #108 <Field boolean isOffset>
	//    3    5:return          
	}

	public void setPoiName(String s)
	{
		poiName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field String poiName>
	//    3    5:return          
	}

	public void setProvince(String s)
	{
		province = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field String province>
	//    3    5:return          
	}

	public void setRoad(String s)
	{
		road = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field String road>
	//    3    5:return          
	}

	public void setSatellites(int i)
	{
		satellites = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field int satellites>
	//    3    5:return          
	}

	public void setStreet(String s)
	{
		street = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field String street>
	//    3    5:return          
	}

	protected JSONObject toJson(int i)
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #306 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #307 <Method void JSONObject()>
	//    3    7:astore_2        
		}
	//*   4    8:iload_1         
	//*   5    9:tableswitch     1 3: default 36
	//	               1 39
	//	               2 305
	//	               3 317
	//*   6   36:goto            378
	//*   7   39:aload_2         
	//*   8   40:ldc2            #309 <String "altitude">
	//*   9   43:aload_0         
	//*  10   44:invokevirtual   #310 <Method double getAltitude()>
	//*  11   47:invokevirtual   #314 <Method JSONObject JSONObject.put(String, double)>
	//*  12   50:pop             
	//*  13   51:aload_2         
	//*  14   52:ldc2            #316 <String "speed">
	//*  15   55:aload_0         
	//*  16   56:invokevirtual   #317 <Method float getSpeed()>
	//*  17   59:f2d             
	//*  18   60:invokevirtual   #314 <Method JSONObject JSONObject.put(String, double)>
	//*  19   63:pop             
	//*  20   64:aload_2         
	//*  21   65:ldc2            #319 <String "bearing">
	//*  22   68:aload_0         
	//*  23   69:invokevirtual   #320 <Method float getBearing()>
	//*  24   72:f2d             
	//*  25   73:invokevirtual   #314 <Method JSONObject JSONObject.put(String, double)>
	//*  26   76:pop             
	//*  27   77:aload_2         
	//*  28   78:ldc2            #322 <String "citycode">
	//*  29   81:aload_0         
	//*  30   82:getfield        #92  <Field String cityCode>
	//*  31   85:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  32   88:pop             
	//*  33   89:aload_2         
	//*  34   90:ldc2            #326 <String "desc">
	//*  35   93:aload_0         
	//*  36   94:getfield        #134 <Field String desc>
	//*  37   97:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  38  100:pop             
	//*  39  101:aload_2         
	//*  40  102:ldc2            #328 <String "adcode">
	//*  41  105:aload_0         
	//*  42  106:getfield        #94  <Field String adCode>
	//*  43  109:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  44  112:pop             
	//*  45  113:aload_2         
	//*  46  114:ldc2            #329 <String "country">
	//*  47  117:aload_0         
	//*  48  118:getfield        #100 <Field String country>
	//*  49  121:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  50  124:pop             
	//*  51  125:aload_2         
	//*  52  126:ldc2            #330 <String "province">
	//*  53  129:aload_0         
	//*  54  130:getfield        #86  <Field String province>
	//*  55  133:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  56  136:pop             
	//*  57  137:aload_2         
	//*  58  138:ldc2            #331 <String "city">
	//*  59  141:aload_0         
	//*  60  142:getfield        #88  <Field String city>
	//*  61  145:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  62  148:pop             
	//*  63  149:aload_2         
	//*  64  150:ldc2            #332 <String "district">
	//*  65  153:aload_0         
	//*  66  154:getfield        #90  <Field String district>
	//*  67  157:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  68  160:pop             
	//*  69  161:aload_2         
	//*  70  162:ldc2            #333 <String "road">
	//*  71  165:aload_0         
	//*  72  166:getfield        #102 <Field String road>
	//*  73  169:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  74  172:pop             
	//*  75  173:aload_2         
	//*  76  174:ldc2            #334 <String "street">
	//*  77  177:aload_0         
	//*  78  178:getfield        #104 <Field String street>
	//*  79  181:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  80  184:pop             
	//*  81  185:aload_2         
	//*  82  186:ldc2            #335 <String "number">
	//*  83  189:aload_0         
	//*  84  190:getfield        #106 <Field String number>
	//*  85  193:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  86  196:pop             
	//*  87  197:aload_2         
	//*  88  198:ldc2            #337 <String "poiname">
	//*  89  201:aload_0         
	//*  90  202:getfield        #98  <Field String poiName>
	//*  91  205:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//*  92  208:pop             
	//*  93  209:aload_2         
	//*  94  210:ldc2            #338 <String "errorCode">
	//*  95  213:aload_0         
	//*  96  214:getfield        #110 <Field int errorCode>
	//*  97  217:invokevirtual   #341 <Method JSONObject JSONObject.put(String, int)>
	//*  98  220:pop             
	//*  99  221:aload_2         
	//* 100  222:ldc2            #342 <String "errorInfo">
	//* 101  225:aload_0         
	//* 102  226:getfield        #114 <Field String errorInfo>
	//* 103  229:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//* 104  232:pop             
	//* 105  233:aload_2         
	//* 106  234:ldc2            #343 <String "locationType">
	//* 107  237:aload_0         
	//* 108  238:getfield        #118 <Field int locationType>
	//* 109  241:invokevirtual   #341 <Method JSONObject JSONObject.put(String, int)>
	//* 110  244:pop             
	//* 111  245:aload_2         
	//* 112  246:ldc2            #344 <String "locationDetail">
	//* 113  249:aload_0         
	//* 114  250:getfield        #116 <Field String locationDetail>
	//* 115  253:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//* 116  256:pop             
	//* 117  257:aload_2         
	//* 118  258:ldc2            #346 <String "aoiname">
	//* 119  261:aload_0         
	//* 120  262:getfield        #126 <Field String aoiName>
	//* 121  265:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//* 122  268:pop             
	//* 123  269:aload_2         
	//* 124  270:ldc2            #347 <String "address">
	//* 125  273:aload_0         
	//* 126  274:getfield        #96  <Field String address>
	//* 127  277:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//* 128  280:pop             
	//* 129  281:aload_2         
	//* 130  282:ldc2            #349 <String "poiid">
	//* 131  285:aload_0         
	//* 132  286:getfield        #130 <Field String buildingId>
	//* 133  289:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//* 134  292:pop             
	//* 135  293:aload_2         
	//* 136  294:ldc2            #350 <String "floor">
	//* 137  297:aload_0         
	//* 138  298:getfield        #132 <Field String floor>
	//* 139  301:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//* 140  304:pop             
	//* 141  305:aload_2         
	//* 142  306:ldc2            #352 <String "time">
	//* 143  309:aload_0         
	//* 144  310:invokevirtual   #356 <Method long getTime()>
	//* 145  313:invokevirtual   #359 <Method JSONObject JSONObject.put(String, long)>
	//* 146  316:pop             
	//* 147  317:aload_2         
	//* 148  318:ldc2            #361 <String "provider">
	//* 149  321:aload_0         
	//* 150  322:invokevirtual   #362 <Method String getProvider()>
	//* 151  325:invokevirtual   #325 <Method JSONObject JSONObject.put(String, Object)>
	//* 152  328:pop             
	//* 153  329:aload_2         
	//* 154  330:ldc2            #364 <String "lon">
	//* 155  333:aload_0         
	//* 156  334:invokevirtual   #365 <Method double getLongitude()>
	//* 157  337:invokevirtual   #314 <Method JSONObject JSONObject.put(String, double)>
	//* 158  340:pop             
	//* 159  341:aload_2         
	//* 160  342:ldc2            #367 <String "lat">
	//* 161  345:aload_0         
	//* 162  346:invokevirtual   #368 <Method double getLatitude()>
	//* 163  349:invokevirtual   #314 <Method JSONObject JSONObject.put(String, double)>
	//* 164  352:pop             
	//* 165  353:aload_2         
	//* 166  354:ldc2            #370 <String "accuracy">
	//* 167  357:aload_0         
	//* 168  358:invokevirtual   #371 <Method float getAccuracy()>
	//* 169  361:f2d             
	//* 170  362:invokevirtual   #314 <Method JSONObject JSONObject.put(String, double)>
	//* 171  365:pop             
	//* 172  366:aload_2         
	//* 173  367:ldc2            #372 <String "isOffset">
	//* 174  370:aload_0         
	//* 175  371:getfield        #108 <Field boolean isOffset>
	//* 176  374:invokevirtual   #375 <Method JSONObject JSONObject.put(String, boolean)>
	//* 177  377:pop             
	//* 178  378:aload_2         
	//* 179  379:areturn         
		catch(Throwable throwable)
	//* 180  380:astore_2        
		{
			lh.a(throwable, "AmapLoc", "toStr");
	//  181  381:aload_2         
	//  182  382:ldc2            #377 <String "AmapLoc">
	//  183  385:ldc2            #379 <String "toStr">
	//  184  388:invokestatic    #385 <Method void lh.a(Throwable, String, String)>
			return null;
	//  185  391:aconst_null     
	//  186  392:areturn         
		}
		i;
		JVM INSTR tableswitch 1 3: default 36
	//	               1 39
	//	               2 305
	//	               3 317;
		   goto _L1 _L2 _L3 _L4
_L2:
		try
		{
			jsonobject.put("altitude", getAltitude());
			jsonobject.put("speed", getSpeed());
			jsonobject.put("bearing", getBearing());
		}
		catch(Throwable throwable1) { }
	//  187  393:astore_3        
		jsonobject.put("citycode", ((Object) (cityCode)));
		jsonobject.put("desc", ((Object) (desc)));
		jsonobject.put("adcode", ((Object) (adCode)));
		jsonobject.put("country", ((Object) (country)));
		jsonobject.put("province", ((Object) (province)));
		jsonobject.put("city", ((Object) (city)));
		jsonobject.put("district", ((Object) (district)));
		jsonobject.put("road", ((Object) (road)));
		jsonobject.put("street", ((Object) (street)));
		jsonobject.put("number", ((Object) (number)));
		jsonobject.put("poiname", ((Object) (poiName)));
		jsonobject.put("errorCode", errorCode);
		jsonobject.put("errorInfo", ((Object) (errorInfo)));
		jsonobject.put("locationType", locationType);
		jsonobject.put("locationDetail", ((Object) (locationDetail)));
		jsonobject.put("aoiname", ((Object) (aoiName)));
		jsonobject.put("address", ((Object) (address)));
		jsonobject.put("poiid", ((Object) (buildingId)));
		jsonobject.put("floor", ((Object) (floor)));
_L3:
		jsonobject.put("time", getTime());
_L4:
		jsonobject.put("provider", ((Object) (getProvider())));
		jsonobject.put("lon", getLongitude());
		jsonobject.put("lat", getLatitude());
		jsonobject.put("accuracy", getAccuracy());
		jsonobject.put("isOffset", isOffset);
_L1:
		return jsonobject;
	//* 188  394:goto            77
	}

	public String toStr()
	{
		return toStr(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #387 <Method String toStr(int)>
	//    3    5:areturn         
	}

	public String toStr(int i)
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = toJson(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #389 <Method JSONObject toJson(int)>
	//    3    5:astore_2        
		}
	//*   4    6:goto            22
		catch(Throwable throwable)
	//*   5    9:astore_3        
		{
			jsonobject = null;
	//    6   10:aconst_null     
	//    7   11:astore_2        
			lh.a(throwable, "AMapLocation", "toStr part2");
	//    8   12:aload_3         
	//    9   13:ldc2            #391 <String "AMapLocation">
	//   10   16:ldc2            #393 <String "toStr part2">
	//   11   19:invokestatic    #385 <Method void lh.a(Throwable, String, String)>
		}
		if(jsonobject == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       28
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		else
			return jsonobject.toString();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #394 <Method String JSONObject.toString()>
	//   18   32:areturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #396 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #397 <Method void StringBuffer()>
	//    3    7:astore_1        
		try
		{
			stringbuffer.append((new StringBuilder("latitude=")).append(latitude).append("#").toString());
	//    4    8:aload_1         
	//    5    9:new             #264 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:ldc2            #399 <String "latitude=">
	//    8   16:invokespecial   #276 <Method void StringBuilder(String)>
	//    9   19:aload_0         
	//   10   20:getfield        #120 <Field double latitude>
	//   11   23:invokevirtual   #402 <Method StringBuilder StringBuilder.append(double)>
	//   12   26:ldc2            #404 <String "#">
	//   13   29:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   15   35:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//   16   38:pop             
			stringbuffer.append((new StringBuilder("longitude=")).append(longitude).append("#").toString());
	//   17   39:aload_1         
	//   18   40:new             #264 <Class StringBuilder>
	//   19   43:dup             
	//   20   44:ldc2            #409 <String "longitude=">
	//   21   47:invokespecial   #276 <Method void StringBuilder(String)>
	//   22   50:aload_0         
	//   23   51:getfield        #122 <Field double longitude>
	//   24   54:invokevirtual   #402 <Method StringBuilder StringBuilder.append(double)>
	//   25   57:ldc2            #404 <String "#">
	//   26   60:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   27   63:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   28   66:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//   29   69:pop             
			stringbuffer.append((new StringBuilder("province=")).append(province).append("#").toString());
	//   30   70:aload_1         
	//   31   71:new             #264 <Class StringBuilder>
	//   32   74:dup             
	//   33   75:ldc2            #411 <String "province=">
	//   34   78:invokespecial   #276 <Method void StringBuilder(String)>
	//   35   81:aload_0         
	//   36   82:getfield        #86  <Field String province>
	//   37   85:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   38   88:ldc2            #404 <String "#">
	//   39   91:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   40   94:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   41   97:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//   42  100:pop             
			stringbuffer.append((new StringBuilder("city=")).append(city).append("#").toString());
	//   43  101:aload_1         
	//   44  102:new             #264 <Class StringBuilder>
	//   45  105:dup             
	//   46  106:ldc2            #413 <String "city=">
	//   47  109:invokespecial   #276 <Method void StringBuilder(String)>
	//   48  112:aload_0         
	//   49  113:getfield        #88  <Field String city>
	//   50  116:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   51  119:ldc2            #404 <String "#">
	//   52  122:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   53  125:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   54  128:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//   55  131:pop             
			stringbuffer.append((new StringBuilder("district=")).append(district).append("#").toString());
	//   56  132:aload_1         
	//   57  133:new             #264 <Class StringBuilder>
	//   58  136:dup             
	//   59  137:ldc2            #415 <String "district=">
	//   60  140:invokespecial   #276 <Method void StringBuilder(String)>
	//   61  143:aload_0         
	//   62  144:getfield        #90  <Field String district>
	//   63  147:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   64  150:ldc2            #404 <String "#">
	//   65  153:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   66  156:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   67  159:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//   68  162:pop             
			stringbuffer.append((new StringBuilder("cityCode=")).append(cityCode).append("#").toString());
	//   69  163:aload_1         
	//   70  164:new             #264 <Class StringBuilder>
	//   71  167:dup             
	//   72  168:ldc2            #417 <String "cityCode=">
	//   73  171:invokespecial   #276 <Method void StringBuilder(String)>
	//   74  174:aload_0         
	//   75  175:getfield        #92  <Field String cityCode>
	//   76  178:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   77  181:ldc2            #404 <String "#">
	//   78  184:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   79  187:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   80  190:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//   81  193:pop             
			stringbuffer.append((new StringBuilder("adCode=")).append(adCode).append("#").toString());
	//   82  194:aload_1         
	//   83  195:new             #264 <Class StringBuilder>
	//   84  198:dup             
	//   85  199:ldc2            #419 <String "adCode=">
	//   86  202:invokespecial   #276 <Method void StringBuilder(String)>
	//   87  205:aload_0         
	//   88  206:getfield        #94  <Field String adCode>
	//   89  209:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   90  212:ldc2            #404 <String "#">
	//   91  215:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   92  218:invokevirtual   #279 <Method String StringBuilder.toString()>
	//   93  221:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//   94  224:pop             
			stringbuffer.append((new StringBuilder("address=")).append(address).append("#").toString());
	//   95  225:aload_1         
	//   96  226:new             #264 <Class StringBuilder>
	//   97  229:dup             
	//   98  230:ldc2            #421 <String "address=">
	//   99  233:invokespecial   #276 <Method void StringBuilder(String)>
	//  100  236:aload_0         
	//  101  237:getfield        #96  <Field String address>
	//  102  240:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  103  243:ldc2            #404 <String "#">
	//  104  246:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  105  249:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  106  252:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  107  255:pop             
			stringbuffer.append((new StringBuilder("country=")).append(country).append("#").toString());
	//  108  256:aload_1         
	//  109  257:new             #264 <Class StringBuilder>
	//  110  260:dup             
	//  111  261:ldc2            #423 <String "country=">
	//  112  264:invokespecial   #276 <Method void StringBuilder(String)>
	//  113  267:aload_0         
	//  114  268:getfield        #100 <Field String country>
	//  115  271:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  116  274:ldc2            #404 <String "#">
	//  117  277:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  118  280:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  119  283:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  120  286:pop             
			stringbuffer.append((new StringBuilder("road=")).append(road).append("#").toString());
	//  121  287:aload_1         
	//  122  288:new             #264 <Class StringBuilder>
	//  123  291:dup             
	//  124  292:ldc2            #425 <String "road=">
	//  125  295:invokespecial   #276 <Method void StringBuilder(String)>
	//  126  298:aload_0         
	//  127  299:getfield        #102 <Field String road>
	//  128  302:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  129  305:ldc2            #404 <String "#">
	//  130  308:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  131  311:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  132  314:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  133  317:pop             
			stringbuffer.append((new StringBuilder("poiName=")).append(poiName).append("#").toString());
	//  134  318:aload_1         
	//  135  319:new             #264 <Class StringBuilder>
	//  136  322:dup             
	//  137  323:ldc2            #427 <String "poiName=">
	//  138  326:invokespecial   #276 <Method void StringBuilder(String)>
	//  139  329:aload_0         
	//  140  330:getfield        #98  <Field String poiName>
	//  141  333:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  142  336:ldc2            #404 <String "#">
	//  143  339:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  144  342:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  145  345:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  146  348:pop             
			stringbuffer.append((new StringBuilder("street=")).append(street).append("#").toString());
	//  147  349:aload_1         
	//  148  350:new             #264 <Class StringBuilder>
	//  149  353:dup             
	//  150  354:ldc2            #429 <String "street=">
	//  151  357:invokespecial   #276 <Method void StringBuilder(String)>
	//  152  360:aload_0         
	//  153  361:getfield        #104 <Field String street>
	//  154  364:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  155  367:ldc2            #404 <String "#">
	//  156  370:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  157  373:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  158  376:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  159  379:pop             
			stringbuffer.append((new StringBuilder("streetNum=")).append(number).append("#").toString());
	//  160  380:aload_1         
	//  161  381:new             #264 <Class StringBuilder>
	//  162  384:dup             
	//  163  385:ldc2            #431 <String "streetNum=">
	//  164  388:invokespecial   #276 <Method void StringBuilder(String)>
	//  165  391:aload_0         
	//  166  392:getfield        #106 <Field String number>
	//  167  395:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  168  398:ldc2            #404 <String "#">
	//  169  401:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  170  404:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  171  407:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  172  410:pop             
			stringbuffer.append((new StringBuilder("aoiName=")).append(aoiName).append("#").toString());
	//  173  411:aload_1         
	//  174  412:new             #264 <Class StringBuilder>
	//  175  415:dup             
	//  176  416:ldc2            #433 <String "aoiName=">
	//  177  419:invokespecial   #276 <Method void StringBuilder(String)>
	//  178  422:aload_0         
	//  179  423:getfield        #126 <Field String aoiName>
	//  180  426:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  181  429:ldc2            #404 <String "#">
	//  182  432:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  183  435:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  184  438:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  185  441:pop             
			stringbuffer.append((new StringBuilder("poiid=")).append(buildingId).append("#").toString());
	//  186  442:aload_1         
	//  187  443:new             #264 <Class StringBuilder>
	//  188  446:dup             
	//  189  447:ldc2            #435 <String "poiid=">
	//  190  450:invokespecial   #276 <Method void StringBuilder(String)>
	//  191  453:aload_0         
	//  192  454:getfield        #130 <Field String buildingId>
	//  193  457:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  194  460:ldc2            #404 <String "#">
	//  195  463:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  196  466:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  197  469:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  198  472:pop             
			stringbuffer.append((new StringBuilder("floor=")).append(floor).append("#").toString());
	//  199  473:aload_1         
	//  200  474:new             #264 <Class StringBuilder>
	//  201  477:dup             
	//  202  478:ldc2            #437 <String "floor=">
	//  203  481:invokespecial   #276 <Method void StringBuilder(String)>
	//  204  484:aload_0         
	//  205  485:getfield        #132 <Field String floor>
	//  206  488:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  207  491:ldc2            #404 <String "#">
	//  208  494:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  209  497:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  210  500:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  211  503:pop             
			stringbuffer.append((new StringBuilder("errorCode=")).append(errorCode).append("#").toString());
	//  212  504:aload_1         
	//  213  505:new             #264 <Class StringBuilder>
	//  214  508:dup             
	//  215  509:ldc2            #439 <String "errorCode=">
	//  216  512:invokespecial   #276 <Method void StringBuilder(String)>
	//  217  515:aload_0         
	//  218  516:getfield        #110 <Field int errorCode>
	//  219  519:invokevirtual   #442 <Method StringBuilder StringBuilder.append(int)>
	//  220  522:ldc2            #404 <String "#">
	//  221  525:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  222  528:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  223  531:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  224  534:pop             
			stringbuffer.append((new StringBuilder("errorInfo=")).append(errorInfo).append("#").toString());
	//  225  535:aload_1         
	//  226  536:new             #264 <Class StringBuilder>
	//  227  539:dup             
	//  228  540:ldc2            #444 <String "errorInfo=">
	//  229  543:invokespecial   #276 <Method void StringBuilder(String)>
	//  230  546:aload_0         
	//  231  547:getfield        #114 <Field String errorInfo>
	//  232  550:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  233  553:ldc2            #404 <String "#">
	//  234  556:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  235  559:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  236  562:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  237  565:pop             
			stringbuffer.append((new StringBuilder("locationDetail=")).append(locationDetail).append("#").toString());
	//  238  566:aload_1         
	//  239  567:new             #264 <Class StringBuilder>
	//  240  570:dup             
	//  241  571:ldc2            #446 <String "locationDetail=">
	//  242  574:invokespecial   #276 <Method void StringBuilder(String)>
	//  243  577:aload_0         
	//  244  578:getfield        #116 <Field String locationDetail>
	//  245  581:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  246  584:ldc2            #404 <String "#">
	//  247  587:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  248  590:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  249  593:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  250  596:pop             
			stringbuffer.append((new StringBuilder("locationType=")).append(locationType).toString());
	//  251  597:aload_1         
	//  252  598:new             #264 <Class StringBuilder>
	//  253  601:dup             
	//  254  602:ldc2            #448 <String "locationType=">
	//  255  605:invokespecial   #276 <Method void StringBuilder(String)>
	//  256  608:aload_0         
	//  257  609:getfield        #118 <Field int locationType>
	//  258  612:invokevirtual   #442 <Method StringBuilder StringBuilder.append(int)>
	//  259  615:invokevirtual   #279 <Method String StringBuilder.toString()>
	//  260  618:invokevirtual   #407 <Method StringBuffer StringBuffer.append(String)>
	//  261  621:pop             
		}
	//* 262  622:aload_1         
	//* 263  623:invokevirtual   #449 <Method String StringBuffer.toString()>
	//* 264  626:areturn         
		catch(Throwable throwable) { }
	//  265  627:astore_2        
		return stringbuffer.toString();
	//* 266  628:goto            622
	}

	public static final int ERROR_CODE_FAILURE_AUTH = 7;
	public static final int ERROR_CODE_FAILURE_CELL = 11;
	public static final int ERROR_CODE_FAILURE_CONNECTION = 4;
	public static final int ERROR_CODE_FAILURE_INIT = 9;
	public static final int ERROR_CODE_FAILURE_LOCATION = 6;
	public static final int ERROR_CODE_FAILURE_LOCATION_PARAMETER = 3;
	public static final int ERROR_CODE_FAILURE_LOCATION_PERMISSION = 12;
	public static final int ERROR_CODE_FAILURE_NOENOUGHSATELLITES = 14;
	public static final int ERROR_CODE_FAILURE_NOWIFIANDAP = 13;
	public static final int ERROR_CODE_FAILURE_PARSER = 5;
	public static final int ERROR_CODE_FAILURE_SIMULATION_LOCATION = 15;
	public static final int ERROR_CODE_FAILURE_WIFI_INFO = 2;
	public static final int ERROR_CODE_INVALID_PARAMETER = 1;
	public static final int ERROR_CODE_SERVICE_FAIL = 10;
	public static final int ERROR_CODE_UNKNOWN = 8;
	public static final int GPS_ACCURACY_BAD = 0;
	public static final int GPS_ACCURACY_GOOD = 1;
	public static final int GPS_ACCURACY_UNKNOWN = -1;
	public static final int LOCATION_SUCCESS = 0;
	public static final int LOCATION_TYPE_AMAP = 7;
	public static final int LOCATION_TYPE_CELL = 6;
	public static final int LOCATION_TYPE_FAST = 3;
	public static final int LOCATION_TYPE_FIX_CACHE = 4;
	public static final int LOCATION_TYPE_GPS = 1;
	public static final int LOCATION_TYPE_OFFLINE = 8;
	public static final int LOCATION_TYPE_SAME_REQ = 2;
	public static final int LOCATION_TYPE_WIFI = 5;
	private String adCode;
	private String address;
	private String aoiName;
	protected String buildingId;
	private String city;
	private String cityCode;
	private String country;
	protected String desc;
	private String district;
	private int errorCode;
	private String errorInfo;
	protected String floor;
	private boolean isOffset;
	private double latitude;
	private String locationDetail;
	private int locationType;
	private double longitude;
	private String number;
	private String poiName;
	private String province;
	private String road;
	private int satellites;
	private int signalIntensity;
	private String street;
}
