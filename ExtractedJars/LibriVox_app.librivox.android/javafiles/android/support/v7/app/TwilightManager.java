// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.a.t;
import android.util.Log;
import java.util.Calendar;

// Referenced classes of package android.support.v7.app:
//			TwilightCalculator

class TwilightManager
{

	TwilightManager(Context context, LocationManager locationmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class TwilightManager$TwilightState>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void TwilightManager$TwilightState()>
	//    6   12:putfield        #31  <Field TwilightManager$TwilightState mTwilightState>
		mContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #33  <Field Context mContext>
		mLocationManager = locationmanager;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #35  <Field LocationManager mLocationManager>
	//   13   25:return          
	}

	static TwilightManager getInstance(Context context)
	{
		if(sInstance == null)
	//*   0    0:getstatic       #40  <Field TwilightManager sInstance>
	//*   1    3:ifnonnull       31
		{
			context = context.getApplicationContext();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #46  <Method Context Context.getApplicationContext()>
	//    4   10:astore_0        
			sInstance = new TwilightManager(context, (LocationManager)context.getSystemService("location"));
	//    5   11:new             #2   <Class TwilightManager>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:ldc1            #48  <String "location">
	//   10   19:invokevirtual   #52  <Method Object Context.getSystemService(String)>
	//   11   22:checkcast       #54  <Class LocationManager>
	//   12   25:invokespecial   #56  <Method void TwilightManager(Context, LocationManager)>
	//   13   28:putstatic       #40  <Field TwilightManager sInstance>
		}
		return sInstance;
	//   14   31:getstatic       #40  <Field TwilightManager sInstance>
	//   15   34:areturn         
	}

	private Location getLastKnownLocation()
	{
		int i = t.a(mContext, "android.permission.ACCESS_COARSE_LOCATION");
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Context mContext>
	//    2    4:ldc1            #63  <String "android.permission.ACCESS_COARSE_LOCATION">
	//    3    6:invokestatic    #69  <Method int t.a(Context, String)>
	//    4    9:istore_1        
		Location location1 = null;
	//    5   10:aconst_null     
	//    6   11:astore_3        
		Location location;
		if(i == 0)
	//*   7   12:iload_1         
	//*   8   13:ifne            26
			location = getLastKnownLocationForProvider("network");
	//    9   16:aload_0         
	//   10   17:ldc1            #71  <String "network">
	//   11   19:invokespecial   #75  <Method Location getLastKnownLocationForProvider(String)>
	//   12   22:astore_2        
		else
	//*  13   23:goto            28
			location = null;
	//   14   26:aconst_null     
	//   15   27:astore_2        
		if(t.a(mContext, "android.permission.ACCESS_FINE_LOCATION") == 0)
	//*  16   28:aload_0         
	//*  17   29:getfield        #33  <Field Context mContext>
	//*  18   32:ldc1            #77  <String "android.permission.ACCESS_FINE_LOCATION">
	//*  19   34:invokestatic    #69  <Method int t.a(Context, String)>
	//*  20   37:ifne            47
			location1 = getLastKnownLocationForProvider("gps");
	//   21   40:aload_0         
	//   22   41:ldc1            #79  <String "gps">
	//   23   43:invokespecial   #75  <Method Location getLastKnownLocationForProvider(String)>
	//   24   46:astore_3        
		if(location1 != null && location != null)
	//*  25   47:aload_3         
	//*  26   48:ifnull          76
	//*  27   51:aload_2         
	//*  28   52:ifnull          76
		{
			Location location2 = location;
	//   29   55:aload_2         
	//   30   56:astore          4
			if(location1.getTime() > location.getTime())
	//*  31   58:aload_3         
	//*  32   59:invokevirtual   #85  <Method long Location.getTime()>
	//*  33   62:aload_2         
	//*  34   63:invokevirtual   #85  <Method long Location.getTime()>
	//*  35   66:lcmp            
	//*  36   67:ifle            73
				location2 = location1;
	//   37   70:aload_3         
	//   38   71:astore          4
			return location2;
	//   39   73:aload           4
	//   40   75:areturn         
		}
		if(location1 != null)
	//*  41   76:aload_3         
	//*  42   77:ifnull          82
			location = location1;
	//   43   80:aload_3         
	//   44   81:astore_2        
		return location;
	//   45   82:aload_2         
	//   46   83:areturn         
	}

	private Location getLastKnownLocationForProvider(String s)
	{
		if(!mLocationManager.isProviderEnabled(s))
			break MISSING_BLOCK_LABEL_32;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field LocationManager mLocationManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #92  <Method boolean LocationManager.isProviderEnabled(String)>
	//    4    8:ifeq            32
		s = ((String) (mLocationManager.getLastKnownLocation(s)));
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field LocationManager mLocationManager>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #94  <Method Location LocationManager.getLastKnownLocation(String)>
	//    9   19:astore_1        
		return ((Location) (s));
	//   10   20:aload_1         
	//   11   21:areturn         
		s;
	//   12   22:astore_1        
		Log.d("TwilightManager", "Failed to get last known location", ((Throwable) (s)));
	//   13   23:ldc1            #13  <String "TwilightManager">
	//   14   25:ldc1            #96  <String "Failed to get last known location">
	//   15   27:aload_1         
	//   16   28:invokestatic    #102 <Method int Log.d(String, String, Throwable)>
	//   17   31:pop             
		return null;
	//   18   32:aconst_null     
	//   19   33:areturn         
	}

	private boolean isStateValid()
	{
		return mTwilightState.nextUpdate > System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:getfield        #108 <Field long TwilightManager$TwilightState.nextUpdate>
	//    3    7:invokestatic    #113 <Method long System.currentTimeMillis()>
	//    4   10:lcmp            
	//    5   11:ifle            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	static void setInstance(TwilightManager twilightmanager)
	{
		sInstance = twilightmanager;
	//    0    0:aload_0         
	//    1    1:putstatic       #40  <Field TwilightManager sInstance>
	//    2    4:return          
	}

	private void updateState(Location location)
	{
		TwilightState twilightstate = mTwilightState;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:astore          13
		long l = System.currentTimeMillis();
	//    3    6:invokestatic    #113 <Method long System.currentTimeMillis()>
	//    4    9:lstore_2        
		TwilightCalculator twilightcalculator = TwilightCalculator.getInstance();
	//    5   10:invokestatic    #122 <Method TwilightCalculator TwilightCalculator.getInstance()>
	//    6   13:astore          14
		twilightcalculator.calculateTwilight(l - 0x5265c00L, location.getLatitude(), location.getLongitude());
	//    7   15:aload           14
	//    8   17:lload_2         
	//    9   18:ldc2w           #123 <Long 0x5265c00L>
	//   10   21:lsub            
	//   11   22:aload_1         
	//   12   23:invokevirtual   #128 <Method double Location.getLatitude()>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #131 <Method double Location.getLongitude()>
	//   15   30:invokevirtual   #135 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		long l1 = twilightcalculator.sunset;
	//   16   33:aload           14
	//   17   35:getfield        #138 <Field long TwilightCalculator.sunset>
	//   18   38:lstore          4
		twilightcalculator.calculateTwilight(l, location.getLatitude(), location.getLongitude());
	//   19   40:aload           14
	//   20   42:lload_2         
	//   21   43:aload_1         
	//   22   44:invokevirtual   #128 <Method double Location.getLatitude()>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #131 <Method double Location.getLongitude()>
	//   25   51:invokevirtual   #135 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		boolean flag;
		if(twilightcalculator.state == 1)
	//*  26   54:aload           14
	//*  27   56:getfield        #141 <Field int TwilightCalculator.state>
	//*  28   59:iconst_1        
	//*  29   60:icmpne          69
			flag = true;
	//   30   63:iconst_1        
	//   31   64:istore          12
		else
	//*  32   66:goto            72
			flag = false;
	//   33   69:iconst_0        
	//   34   70:istore          12
		long l2 = twilightcalculator.sunrise;
	//   35   72:aload           14
	//   36   74:getfield        #144 <Field long TwilightCalculator.sunrise>
	//   37   77:lstore          6
		long l3 = twilightcalculator.sunset;
	//   38   79:aload           14
	//   39   81:getfield        #138 <Field long TwilightCalculator.sunset>
	//   40   84:lstore          8
		twilightcalculator.calculateTwilight(0x5265c00L + l, location.getLatitude(), location.getLongitude());
	//   41   86:aload           14
	//   42   88:ldc2w           #123 <Long 0x5265c00L>
	//   43   91:lload_2         
	//   44   92:ladd            
	//   45   93:aload_1         
	//   46   94:invokevirtual   #128 <Method double Location.getLatitude()>
	//   47   97:aload_1         
	//   48   98:invokevirtual   #131 <Method double Location.getLongitude()>
	//   49  101:invokevirtual   #135 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		long l4 = twilightcalculator.sunrise;
	//   50  104:aload           14
	//   51  106:getfield        #144 <Field long TwilightCalculator.sunrise>
	//   52  109:lstore          10
		if(l2 != -1L && l3 != -1L)
	//*  53  111:lload           6
	//*  54  113:ldc2w           #145 <Long -1L>
	//*  55  116:lcmp            
	//*  56  117:ifeq            176
	//*  57  120:lload           8
	//*  58  122:ldc2w           #145 <Long -1L>
	//*  59  125:lcmp            
	//*  60  126:ifne            132
	//*  61  129:goto            176
		{
			if(l > l3)
	//*  62  132:lload_2         
	//*  63  133:lload           8
	//*  64  135:lcmp            
	//*  65  136:ifle            147
				l = 0L + l4;
	//   66  139:lconst_0        
	//   67  140:lload           10
	//   68  142:ladd            
	//   69  143:lstore_2        
			else
	//*  70  144:goto            167
			if(l > l2)
	//*  71  147:lload_2         
	//*  72  148:lload           6
	//*  73  150:lcmp            
	//*  74  151:ifle            162
				l = 0L + l3;
	//   75  154:lconst_0        
	//   76  155:lload           8
	//   77  157:ladd            
	//   78  158:lstore_2        
			else
	//*  79  159:goto            167
				l = 0L + l2;
	//   80  162:lconst_0        
	//   81  163:lload           6
	//   82  165:ladd            
	//   83  166:lstore_2        
			l += 60000L;
	//   84  167:lload_2         
	//   85  168:ldc2w           #147 <Long 60000L>
	//   86  171:ladd            
	//   87  172:lstore_2        
		} else
	//*  88  173:goto            182
		{
			l = 0x2932e00L + l;
	//   89  176:ldc2w           #149 <Long 0x2932e00L>
	//   90  179:lload_2         
	//   91  180:ladd            
	//   92  181:lstore_2        
		}
		twilightstate.isNight = flag;
	//   93  182:aload           13
	//   94  184:iload           12
	//   95  186:putfield        #154 <Field boolean TwilightManager$TwilightState.isNight>
		twilightstate.yesterdaySunset = l1;
	//   96  189:aload           13
	//   97  191:lload           4
	//   98  193:putfield        #157 <Field long TwilightManager$TwilightState.yesterdaySunset>
		twilightstate.todaySunrise = l2;
	//   99  196:aload           13
	//  100  198:lload           6
	//  101  200:putfield        #160 <Field long TwilightManager$TwilightState.todaySunrise>
		twilightstate.todaySunset = l3;
	//  102  203:aload           13
	//  103  205:lload           8
	//  104  207:putfield        #163 <Field long TwilightManager$TwilightState.todaySunset>
		twilightstate.tomorrowSunrise = l4;
	//  105  210:aload           13
	//  106  212:lload           10
	//  107  214:putfield        #166 <Field long TwilightManager$TwilightState.tomorrowSunrise>
		twilightstate.nextUpdate = l;
	//  108  217:aload           13
	//  109  219:lload_2         
	//  110  220:putfield        #108 <Field long TwilightManager$TwilightState.nextUpdate>
	//  111  223:return          
	}

	boolean isNight()
	{
		TwilightState twilightstate = mTwilightState;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:astore_2        
		if(isStateValid())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #168 <Method boolean isStateValid()>
	//*   5    9:ifeq            17
			return twilightstate.isNight;
	//    6   12:aload_2         
	//    7   13:getfield        #154 <Field boolean TwilightManager$TwilightState.isNight>
	//    8   16:ireturn         
		Location location = getLastKnownLocation();
	//    9   17:aload_0         
	//   10   18:invokespecial   #170 <Method Location getLastKnownLocation()>
	//   11   21:astore_3        
		if(location != null)
	//*  12   22:aload_3         
	//*  13   23:ifnull          36
		{
			updateState(location);
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokespecial   #172 <Method void updateState(Location)>
			return twilightstate.isNight;
	//   17   31:aload_2         
	//   18   32:getfield        #154 <Field boolean TwilightManager$TwilightState.isNight>
	//   19   35:ireturn         
		}
		Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
	//   20   36:ldc1            #13  <String "TwilightManager">
	//   21   38:ldc1            #174 <String "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.">
	//   22   40:invokestatic    #178 <Method int Log.i(String, String)>
	//   23   43:pop             
		int i = Calendar.getInstance().get(11);
	//   24   44:invokestatic    #183 <Method Calendar Calendar.getInstance()>
	//   25   47:bipush          11
	//   26   49:invokevirtual   #187 <Method int Calendar.get(int)>
	//   27   52:istore_1        
		return i < 6 || i >= 22;
	//   28   53:iload_1         
	//   29   54:bipush          6
	//   30   56:icmplt          70
	//   31   59:iload_1         
	//   32   60:bipush          22
	//   33   62:icmplt          68
	//   34   65:goto            70
	//   35   68:iconst_0        
	//   36   69:ireturn         
	//   37   70:iconst_1        
	//   38   71:ireturn         
	}

	private static final int SUNRISE = 6;
	private static final int SUNSET = 22;
	private static final String TAG = "TwilightManager";
	private static TwilightManager sInstance;
	private final Context mContext;
	private final LocationManager mLocationManager;
	private final TwilightState mTwilightState = new TwilightState();

	private class TwilightState
	{

		boolean isNight;
		long nextUpdate;
		long todaySunrise;
		long todaySunset;
		long tomorrowSunrise;
		long yesterdaySunset;

		TwilightState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

}
