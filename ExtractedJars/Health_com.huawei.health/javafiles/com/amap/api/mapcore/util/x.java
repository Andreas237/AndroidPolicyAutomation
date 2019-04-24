// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.*;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;
import com.amap.api.maps.*;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

// Referenced classes of package com.amap.api.mapcore.util:
//			l, d, e, c

public class x
	implements IMapFragmentDelegate
{

	public x(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		b = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field int b>
		d = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field int d>
		d = i % 3;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:iconst_3        
	//   11   17:irem            
	//   12   18:putfield        #24  <Field int d>
	//   13   21:return          
	}

	private static void a(Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
			a = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//    4    8:putstatic       #34  <Field Context a>
	//    5   11:return          
	}

	void a(AMapOptions amapoptions)
		throws RemoteException
	{
		if(amapoptions != null && c != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          133
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field IAMap c>
	//*   4    8:ifnull          133
		{
			Object obj = ((Object) (amapoptions.getCamera()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #45  <Method com.amap.api.maps.model.CameraPosition AMapOptions.getCamera()>
	//    7   15:astore_2        
			if(obj != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          33
				c.moveCamera(CameraUpdateFactory.newCameraPosition(((com.amap.api.maps.model.CameraPosition) (obj))));
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field IAMap c>
	//   12   24:aload_2         
	//   13   25:invokestatic    #51  <Method com.amap.api.maps.CameraUpdate CameraUpdateFactory.newCameraPosition(com.amap.api.maps.model.CameraPosition)>
	//   14   28:invokeinterface #57  <Method void IAMap.moveCamera(com.amap.api.maps.CameraUpdate)>
			obj = ((Object) (c.getAMapUiSettings()));
	//   15   33:aload_0         
	//   16   34:getfield        #39  <Field IAMap c>
	//   17   37:invokeinterface #61  <Method UiSettings IAMap.getAMapUiSettings()>
	//   18   42:astore_2        
			((UiSettings) (obj)).setRotateGesturesEnabled(amapoptions.getRotateGesturesEnabled());
	//   19   43:aload_2         
	//   20   44:aload_1         
	//   21   45:invokevirtual   #65  <Method boolean AMapOptions.getRotateGesturesEnabled()>
	//   22   48:invokevirtual   #71  <Method void UiSettings.setRotateGesturesEnabled(boolean)>
			((UiSettings) (obj)).setScrollGesturesEnabled(amapoptions.getScrollGesturesEnabled());
	//   23   51:aload_2         
	//   24   52:aload_1         
	//   25   53:invokevirtual   #74  <Method boolean AMapOptions.getScrollGesturesEnabled()>
	//   26   56:invokevirtual   #77  <Method void UiSettings.setScrollGesturesEnabled(boolean)>
			((UiSettings) (obj)).setTiltGesturesEnabled(amapoptions.getTiltGesturesEnabled());
	//   27   59:aload_2         
	//   28   60:aload_1         
	//   29   61:invokevirtual   #80  <Method boolean AMapOptions.getTiltGesturesEnabled()>
	//   30   64:invokevirtual   #83  <Method void UiSettings.setTiltGesturesEnabled(boolean)>
			((UiSettings) (obj)).setZoomControlsEnabled(amapoptions.getZoomControlsEnabled());
	//   31   67:aload_2         
	//   32   68:aload_1         
	//   33   69:invokevirtual   #86  <Method boolean AMapOptions.getZoomControlsEnabled()>
	//   34   72:invokevirtual   #89  <Method void UiSettings.setZoomControlsEnabled(boolean)>
			((UiSettings) (obj)).setZoomGesturesEnabled(amapoptions.getZoomGesturesEnabled());
	//   35   75:aload_2         
	//   36   76:aload_1         
	//   37   77:invokevirtual   #92  <Method boolean AMapOptions.getZoomGesturesEnabled()>
	//   38   80:invokevirtual   #95  <Method void UiSettings.setZoomGesturesEnabled(boolean)>
			((UiSettings) (obj)).setCompassEnabled(amapoptions.getCompassEnabled());
	//   39   83:aload_2         
	//   40   84:aload_1         
	//   41   85:invokevirtual   #98  <Method boolean AMapOptions.getCompassEnabled()>
	//   42   88:invokevirtual   #101 <Method void UiSettings.setCompassEnabled(boolean)>
			((UiSettings) (obj)).setScaleControlsEnabled(amapoptions.getScaleControlsEnabled());
	//   43   91:aload_2         
	//   44   92:aload_1         
	//   45   93:invokevirtual   #104 <Method boolean AMapOptions.getScaleControlsEnabled()>
	//   46   96:invokevirtual   #107 <Method void UiSettings.setScaleControlsEnabled(boolean)>
			((UiSettings) (obj)).setLogoPosition(amapoptions.getLogoPosition());
	//   47   99:aload_2         
	//   48  100:aload_1         
	//   49  101:invokevirtual   #111 <Method int AMapOptions.getLogoPosition()>
	//   50  104:invokevirtual   #114 <Method void UiSettings.setLogoPosition(int)>
			c.setMapType(amapoptions.getMapType());
	//   51  107:aload_0         
	//   52  108:getfield        #39  <Field IAMap c>
	//   53  111:aload_1         
	//   54  112:invokevirtual   #117 <Method int AMapOptions.getMapType()>
	//   55  115:invokeinterface #120 <Method void IAMap.setMapType(int)>
			c.setZOrderOnTop(amapoptions.getZOrderOnTop());
	//   56  120:aload_0         
	//   57  121:getfield        #39  <Field IAMap c>
	//   58  124:aload_1         
	//   59  125:invokevirtual   #123 <Method boolean AMapOptions.getZOrderOnTop()>
	//   60  128:invokeinterface #126 <Method void IAMap.setZOrderOnTop(boolean)>
		}
	//   61  133:return          
	}

	public IAMap getMap()
		throws RemoteException
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field IAMap c>
	//*   2    4:ifnonnull       201
		{
			if(a == null)
	//*   3    7:getstatic       #34  <Field Context a>
	//*   4   10:ifnonnull       23
			{
				Log.w("MapFragmentDelegateImp", "Context \u4E3A null \u8BF7\u5728\u5730\u56FE\u8C03\u7528\u4E4B\u524D \u4F7F\u7528 MapsInitializer.initialize(Context paramContext) \u6765\u8BBE\u7F6EContext");
	//    5   13:ldc1            #131 <String "MapFragmentDelegateImp">
	//    6   15:ldc1            #133 <String "Context \u4E3A null \u8BF7\u5728\u5730\u56FE\u8C03\u7528\u4E4B\u524D \u4F7F\u7528 MapsInitializer.initialize(Context paramContext) \u6765\u8BBE\u7F6EContext">
	//    7   17:invokestatic    #139 <Method int Log.w(String, String)>
	//    8   20:pop             
				return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
			}
			int i = a.getResources().getDisplayMetrics().densityDpi;
	//   11   23:getstatic       #34  <Field Context a>
	//   12   26:invokevirtual   #143 <Method Resources Context.getResources()>
	//   13   29:invokevirtual   #149 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   14   32:getfield        #154 <Field int DisplayMetrics.densityDpi>
	//   15   35:istore_1        
			if(i <= 120)
	//*  16   36:iload_1         
	//*  17   37:bipush          120
	//*  18   39:icmpgt          50
				l.a = 0.5F;
	//   19   42:ldc1            #155 <Float 0.5F>
	//   20   44:putstatic       #160 <Field float l.a>
			else
	//*  21   47:goto            129
			if(i <= 160)
	//*  22   50:iload_1         
	//*  23   51:sipush          160
	//*  24   54:icmpgt          65
				l.a = 0.8F;
	//   25   57:ldc1            #161 <Float 0.8F>
	//   26   59:putstatic       #160 <Field float l.a>
			else
	//*  27   62:goto            129
			if(i <= 240)
	//*  28   65:iload_1         
	//*  29   66:sipush          240
	//*  30   69:icmpgt          80
				l.a = 0.87F;
	//   31   72:ldc1            #162 <Float 0.87F>
	//   32   74:putstatic       #160 <Field float l.a>
			else
	//*  33   77:goto            129
			if(i <= 320)
	//*  34   80:iload_1         
	//*  35   81:sipush          320
	//*  36   84:icmpgt          94
				l.a = 1.0F;
	//   37   87:fconst_1        
	//   38   88:putstatic       #160 <Field float l.a>
			else
	//*  39   91:goto            129
			if(i <= 480)
	//*  40   94:iload_1         
	//*  41   95:sipush          480
	//*  42   98:icmpgt          109
				l.a = 1.5F;
	//   43  101:ldc1            #163 <Float 1.5F>
	//   44  103:putstatic       #160 <Field float l.a>
			else
	//*  45  106:goto            129
			if(i <= 640)
	//*  46  109:iload_1         
	//*  47  110:sipush          640
	//*  48  113:icmpgt          124
				l.a = 1.8F;
	//   49  116:ldc1            #164 <Float 1.8F>
	//   50  118:putstatic       #160 <Field float l.a>
			else
	//*  51  121:goto            129
				l.a = 0.9F;
	//   52  124:ldc1            #165 <Float 0.9F>
	//   53  126:putstatic       #160 <Field float l.a>
			if(d == 0)
	//*  54  129:aload_0         
	//*  55  130:getfield        #24  <Field int d>
	//*  56  133:ifne            156
				c = ((IAMap) ((new d(a)).a()));
	//   57  136:aload_0         
	//   58  137:new             #167 <Class d>
	//   59  140:dup             
	//   60  141:getstatic       #34  <Field Context a>
	//   61  144:invokespecial   #169 <Method void d(Context)>
	//   62  147:invokevirtual   #172 <Method s d.a()>
	//   63  150:putfield        #39  <Field IAMap c>
			else
	//*  64  153:goto            201
			if(d == 1)
	//*  65  156:aload_0         
	//*  66  157:getfield        #24  <Field int d>
	//*  67  160:iconst_1        
	//*  68  161:icmpne          184
				c = ((IAMap) ((new e(a)).a()));
	//   69  164:aload_0         
	//   70  165:new             #174 <Class e>
	//   71  168:dup             
	//   72  169:getstatic       #34  <Field Context a>
	//   73  172:invokespecial   #175 <Method void e(Context)>
	//   74  175:invokevirtual   #176 <Method s e.a()>
	//   75  178:putfield        #39  <Field IAMap c>
			else
	//*  76  181:goto            201
				c = ((IAMap) ((new c(a)).a()));
	//   77  184:aload_0         
	//   78  185:new             #178 <Class c>
	//   79  188:dup             
	//   80  189:getstatic       #34  <Field Context a>
	//   81  192:invokespecial   #179 <Method void c(Context)>
	//   82  195:invokevirtual   #180 <Method s c.a()>
	//   83  198:putfield        #39  <Field IAMap c>
		}
		return c;
	//   84  201:aload_0         
	//   85  202:getfield        #39  <Field IAMap c>
	//   86  205:areturn         
	}

	public boolean isReady()
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onCreate(Bundle bundle)
		throws RemoteException
	{
	//    0    0:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
		throws RemoteException
	{
		if(a == null && layoutinflater != null)
	//*   0    0:getstatic       #34  <Field Context a>
	//*   1    3:ifnonnull       21
	//*   2    6:aload_1         
	//*   3    7:ifnull          21
			setContext(layoutinflater.getContext().getApplicationContext());
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #192 <Method Context LayoutInflater.getContext()>
	//    7   15:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//    8   18:invokevirtual   #195 <Method void setContext(Context)>
		c = getMap();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #197 <Method IAMap getMap()>
	//   12   26:putfield        #39  <Field IAMap c>
		c.setVisibilityEx(b);
	//   13   29:aload_0         
	//   14   30:getfield        #39  <Field IAMap c>
	//   15   33:aload_0         
	//   16   34:getfield        #22  <Field int b>
	//   17   37:invokeinterface #200 <Method void IAMap.setVisibilityEx(int)>
		if(e != null || bundle == null)
			break MISSING_BLOCK_LABEL_92;
	//   18   42:aload_0         
	//   19   43:getfield        #202 <Field AMapOptions e>
	//   20   46:ifnonnull       92
	//   21   49:aload_3         
	//   22   50:ifnull          92
		layoutinflater = ((LayoutInflater) (bundle.getByteArray("MAP_OPTIONS")));
	//   23   53:aload_3         
	//   24   54:ldc1            #204 <String "MAP_OPTIONS">
	//   25   56:invokevirtual   #210 <Method byte[] Bundle.getByteArray(String)>
	//   26   59:astore_1        
		if(layoutinflater == null)
			break MISSING_BLOCK_LABEL_92;
	//   27   60:aload_1         
	//   28   61:ifnull          92
		viewgroup = ((ViewGroup) (Parcel.obtain()));
	//   29   64:invokestatic    #216 <Method Parcel Parcel.obtain()>
	//   30   67:astore_2        
		((Parcel) (viewgroup)).unmarshall(((byte []) (layoutinflater)), 0, layoutinflater.length);
	//   31   68:aload_2         
	//   32   69:aload_1         
	//   33   70:iconst_0        
	//   34   71:aload_1         
	//   35   72:arraylength     
	//   36   73:invokevirtual   #220 <Method void Parcel.unmarshall(byte[], int, int)>
		((Parcel) (viewgroup)).setDataPosition(0);
	//   37   76:aload_2         
	//   38   77:iconst_0        
	//   39   78:invokevirtual   #223 <Method void Parcel.setDataPosition(int)>
		e = AMapOptions.CREATOR.createFromParcel(((Parcel) (viewgroup)));
	//   40   81:aload_0         
	//   41   82:getstatic       #227 <Field AMapOptionsCreator AMapOptions.CREATOR>
	//   42   85:aload_2         
	//   43   86:invokevirtual   #233 <Method AMapOptions AMapOptionsCreator.createFromParcel(Parcel)>
	//   44   89:putfield        #202 <Field AMapOptions e>
		a(e);
	//   45   92:aload_0         
	//   46   93:aload_0         
	//   47   94:getfield        #202 <Field AMapOptions e>
	//   48   97:invokevirtual   #235 <Method void a(AMapOptions)>
		break MISSING_BLOCK_LABEL_108;
	//   49  100:goto            108
		layoutinflater;
	//   50  103:astore_1        
		((Throwable) (layoutinflater)).printStackTrace();
	//   51  104:aload_1         
	//   52  105:invokevirtual   #238 <Method void Throwable.printStackTrace()>
		return c.getView();
	//   53  108:aload_0         
	//   54  109:getfield        #39  <Field IAMap c>
	//   55  112:invokeinterface #242 <Method View IAMap.getView()>
	//   56  117:areturn         
	}

	public void onDestroy()
		throws RemoteException
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field IAMap c>
	//*   2    4:ifnull          30
		{
			c.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field IAMap c>
	//    5   11:invokeinterface #246 <Method void IAMap.clear()>
			c.destroy();
	//    6   16:aload_0         
	//    7   17:getfield        #39  <Field IAMap c>
	//    8   20:invokeinterface #249 <Method void IAMap.destroy()>
			c = null;
	//    9   25:aload_0         
	//   10   26:aconst_null     
	//   11   27:putfield        #39  <Field IAMap c>
		}
	//   12   30:return          
	}

	public void onDestroyView()
		throws RemoteException
	{
	//    0    0:return          
	}

	public void onInflate(Activity activity, AMapOptions amapoptions, Bundle bundle)
		throws RemoteException
	{
		setContext(activity.getApplicationContext());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #255 <Method Context Activity.getApplicationContext()>
	//    3    5:invokevirtual   #195 <Method void setContext(Context)>
		e = amapoptions;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #202 <Field AMapOptions e>
	//    7   13:return          
	}

	public void onLowMemory()
		throws RemoteException
	{
		Log.d("onLowMemory", "onLowMemory run");
	//    0    0:ldc2            #257 <String "onLowMemory">
	//    1    3:ldc2            #259 <String "onLowMemory run">
	//    2    6:invokestatic    #261 <Method int Log.d(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void onPause()
		throws RemoteException
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field IAMap c>
	//*   2    4:ifnull          16
			c.onActivityPause();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field IAMap c>
	//    5   11:invokeinterface #265 <Method void IAMap.onActivityPause()>
	//    6   16:return          
	}

	public void onResume()
		throws RemoteException
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field IAMap c>
	//*   2    4:ifnull          16
			c.onActivityResume();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field IAMap c>
	//    5   11:invokeinterface #269 <Method void IAMap.onActivityResume()>
	//    6   16:return          
	}

	public void onSaveInstanceState(Bundle bundle)
		throws RemoteException
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field IAMap c>
	//*   2    4:ifnull          70
		{
			if(e == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #202 <Field AMapOptions e>
	//*   5   11:ifnonnull       25
				e = new AMapOptions();
	//    6   14:aload_0         
	//    7   15:new             #41  <Class AMapOptions>
	//    8   18:dup             
	//    9   19:invokespecial   #271 <Method void AMapOptions()>
	//   10   22:putfield        #202 <Field AMapOptions e>
			try
			{
				Parcel parcel = Parcel.obtain();
	//   11   25:invokestatic    #216 <Method Parcel Parcel.obtain()>
	//   12   28:astore_2        
				e = e.camera(getMap().getCameraPosition());
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #202 <Field AMapOptions e>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #197 <Method IAMap getMap()>
	//   18   38:invokeinterface #274 <Method com.amap.api.maps.model.CameraPosition IAMap.getCameraPosition()>
	//   19   43:invokevirtual   #278 <Method AMapOptions AMapOptions.camera(com.amap.api.maps.model.CameraPosition)>
	//   20   46:putfield        #202 <Field AMapOptions e>
				e.writeToParcel(parcel, 0);
	//   21   49:aload_0         
	//   22   50:getfield        #202 <Field AMapOptions e>
	//   23   53:aload_2         
	//   24   54:iconst_0        
	//   25   55:invokevirtual   #282 <Method void AMapOptions.writeToParcel(Parcel, int)>
				bundle.putByteArray("MAP_OPTIONS", parcel.marshall());
	//   26   58:aload_1         
	//   27   59:ldc1            #204 <String "MAP_OPTIONS">
	//   28   61:aload_2         
	//   29   62:invokevirtual   #286 <Method byte[] Parcel.marshall()>
	//   30   65:invokevirtual   #290 <Method void Bundle.putByteArray(String, byte[])>
				return;
	//   31   68:return          
			}
			// Misplaced declaration of an exception variable
			catch(Bundle bundle) { }
	//   32   69:astore_1        
		}
	//   33   70:return          
	}

	public void setContext(Context context)
	{
		a(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #292 <Method void a(Context)>
	//    2    4:return          
	}

	public void setOptions(AMapOptions amapoptions)
	{
		e = amapoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #202 <Field AMapOptions e>
	//    3    5:return          
	}

	public void setVisibility(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int b>
		if(c != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #39  <Field IAMap c>
	//*   5    9:ifnull          22
			c.setVisibilityEx(i);
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field IAMap c>
	//    8   16:iload_1         
	//    9   17:invokeinterface #200 <Method void IAMap.setVisibilityEx(int)>
	//   10   22:return          
	}

	public static volatile Context a;
	public int b;
	private IAMap c;
	private int d;
	private AMapOptions e;
}
