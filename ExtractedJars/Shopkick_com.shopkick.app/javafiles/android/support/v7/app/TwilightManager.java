// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.PermissionChecker;
import android.util.Log;
import java.util.Calendar;

// Referenced classes of package android.support.v7.app:
//			TwilightCalculator

class TwilightManager
{
	private static class TwilightState
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
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	TwilightManager(Context context, LocationManager locationmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class TwilightManager$TwilightState>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void TwilightManager$TwilightState()>
	//    6   12:putfield        #34  <Field TwilightManager$TwilightState mTwilightState>
		mContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #36  <Field Context mContext>
		mLocationManager = locationmanager;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #38  <Field LocationManager mLocationManager>
	//   13   25:return          
	}

	static TwilightManager getInstance(Context context)
	{
		if(sInstance == null)
	//*   0    0:getstatic       #45  <Field TwilightManager sInstance>
	//*   1    3:ifnonnull       31
		{
			context = context.getApplicationContext();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//    4   10:astore_0        
			sInstance = new TwilightManager(context, (LocationManager)context.getSystemService("location"));
	//    5   11:new             #2   <Class TwilightManager>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:ldc1            #53  <String "location">
	//   10   19:invokevirtual   #57  <Method Object Context.getSystemService(String)>
	//   11   22:checkcast       #59  <Class LocationManager>
	//   12   25:invokespecial   #61  <Method void TwilightManager(Context, LocationManager)>
	//   13   28:putstatic       #45  <Field TwilightManager sInstance>
		}
		return sInstance;
	//   14   31:getstatic       #45  <Field TwilightManager sInstance>
	//   15   34:areturn         
	}

	private Location getLastKnownLocation()
	{
		int i = PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_COARSE_LOCATION");
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Context mContext>
	//    2    4:ldc1            #68  <String "android.permission.ACCESS_COARSE_LOCATION">
	//    3    6:invokestatic    #74  <Method int PermissionChecker.checkSelfPermission(Context, String)>
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
	//   10   17:ldc1            #76  <String "network">
	//   11   19:invokespecial   #80  <Method Location getLastKnownLocationForProvider(String)>
	//   12   22:astore_2        
		else
	//*  13   23:goto            28
			location = null;
	//   14   26:aconst_null     
	//   15   27:astore_2        
		if(PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_FINE_LOCATION") == 0)
	//*  16   28:aload_0         
	//*  17   29:getfield        #36  <Field Context mContext>
	//*  18   32:ldc1            #82  <String "android.permission.ACCESS_FINE_LOCATION">
	//*  19   34:invokestatic    #74  <Method int PermissionChecker.checkSelfPermission(Context, String)>
	//*  20   37:ifne            47
			location1 = getLastKnownLocationForProvider("gps");
	//   21   40:aload_0         
	//   22   41:ldc1            #84  <String "gps">
	//   23   43:invokespecial   #80  <Method Location getLastKnownLocationForProvider(String)>
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
	//*  32   59:invokevirtual   #90  <Method long Location.getTime()>
	//*  33   62:aload_2         
	//*  34   63:invokevirtual   #90  <Method long Location.getTime()>
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
	//    1    1:getfield        #38  <Field LocationManager mLocationManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #98  <Method boolean LocationManager.isProviderEnabled(String)>
	//    4    8:ifeq            32
		s = ((String) (mLocationManager.getLastKnownLocation(s)));
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field LocationManager mLocationManager>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #100 <Method Location LocationManager.getLastKnownLocation(String)>
	//    9   19:astore_1        
		return ((Location) (s));
	//   10   20:aload_1         
	//   11   21:areturn         
		s;
	//   12   22:astore_1        
		Log.d("TwilightManager", "Failed to get last known location", ((Throwable) (s)));
	//   13   23:ldc1            #16  <String "TwilightManager">
	//   14   25:ldc1            #102 <String "Failed to get last known location">
	//   15   27:aload_1         
	//   16   28:invokestatic    #108 <Method int Log.d(String, String, Throwable)>
	//   17   31:pop             
		return null;
	//   18   32:aconst_null     
	//   19   33:areturn         
	}

	private boolean isStateValid()
	{
		return mTwilightState.nextUpdate > System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:getfield        #114 <Field long TwilightManager$TwilightState.nextUpdate>
	//    3    7:invokestatic    #119 <Method long System.currentTimeMillis()>
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
	//    1    1:putstatic       #45  <Field TwilightManager sInstance>
	//    2    4:return          
	}

	private void updateState(Location location)
	{
		TwilightState twilightstate = mTwilightState;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:astore          14
		long l = System.currentTimeMillis();
	//    3    6:invokestatic    #119 <Method long System.currentTimeMillis()>
	//    4    9:lstore_3        
		TwilightCalculator twilightcalculator = TwilightCalculator.getInstance();
	//    5   10:invokestatic    #128 <Method TwilightCalculator TwilightCalculator.getInstance()>
	//    6   13:astore          15
		twilightcalculator.calculateTwilight(l - 0x5265c00L, location.getLatitude(), location.getLongitude());
	//    7   15:aload           15
	//    8   17:lload_3         
	//    9   18:ldc2w           #129 <Long 0x5265c00L>
	//   10   21:lsub            
	//   11   22:aload_1         
	//   12   23:invokevirtual   #134 <Method double Location.getLatitude()>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #137 <Method double Location.getLongitude()>
	//   15   30:invokevirtual   #141 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		long l1 = twilightcalculator.sunset;
	//   16   33:aload           15
	//   17   35:getfield        #144 <Field long TwilightCalculator.sunset>
	//   18   38:lstore          5
		twilightcalculator.calculateTwilight(l, location.getLatitude(), location.getLongitude());
	//   19   40:aload           15
	//   20   42:lload_3         
	//   21   43:aload_1         
	//   22   44:invokevirtual   #134 <Method double Location.getLatitude()>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #137 <Method double Location.getLongitude()>
	//   25   51:invokevirtual   #141 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		int i = twilightcalculator.state;
	//   26   54:aload           15
	//   27   56:getfield        #147 <Field int TwilightCalculator.state>
	//   28   59:istore_2        
		boolean flag = true;
	//   29   60:iconst_1        
	//   30   61:istore          13
		if(i != 1)
	//*  31   63:iload_2         
	//*  32   64:iconst_1        
	//*  33   65:icmpne          71
	//*  34   68:goto            74
			flag = false;
	//   35   71:iconst_0        
	//   36   72:istore          13
		long l2 = twilightcalculator.sunrise;
	//   37   74:aload           15
	//   38   76:getfield        #150 <Field long TwilightCalculator.sunrise>
	//   39   79:lstore          7
		long l3 = twilightcalculator.sunset;
	//   40   81:aload           15
	//   41   83:getfield        #144 <Field long TwilightCalculator.sunset>
	//   42   86:lstore          9
		twilightcalculator.calculateTwilight(0x5265c00L + l, location.getLatitude(), location.getLongitude());
	//   43   88:aload           15
	//   44   90:ldc2w           #129 <Long 0x5265c00L>
	//   45   93:lload_3         
	//   46   94:ladd            
	//   47   95:aload_1         
	//   48   96:invokevirtual   #134 <Method double Location.getLatitude()>
	//   49   99:aload_1         
	//   50  100:invokevirtual   #137 <Method double Location.getLongitude()>
	//   51  103:invokevirtual   #141 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		long l4 = twilightcalculator.sunrise;
	//   52  106:aload           15
	//   53  108:getfield        #150 <Field long TwilightCalculator.sunrise>
	//   54  111:lstore          11
		if(l2 != -1L && l3 != -1L)
	//*  55  113:lload           7
	//*  56  115:ldc2w           #151 <Long -1L>
	//*  57  118:lcmp            
	//*  58  119:ifeq            178
	//*  59  122:lload           9
	//*  60  124:ldc2w           #151 <Long -1L>
	//*  61  127:lcmp            
	//*  62  128:ifne            134
	//*  63  131:goto            178
		{
			if(l > l3)
	//*  64  134:lload_3         
	//*  65  135:lload           9
	//*  66  137:lcmp            
	//*  67  138:ifle            149
				l = 0L + l4;
	//   68  141:lconst_0        
	//   69  142:lload           11
	//   70  144:ladd            
	//   71  145:lstore_3        
			else
	//*  72  146:goto            169
			if(l > l2)
	//*  73  149:lload_3         
	//*  74  150:lload           7
	//*  75  152:lcmp            
	//*  76  153:ifle            164
				l = 0L + l3;
	//   77  156:lconst_0        
	//   78  157:lload           9
	//   79  159:ladd            
	//   80  160:lstore_3        
			else
	//*  81  161:goto            169
				l = 0L + l2;
	//   82  164:lconst_0        
	//   83  165:lload           7
	//   84  167:ladd            
	//   85  168:lstore_3        
			l += 60000L;
	//   86  169:lload_3         
	//   87  170:ldc2w           #153 <Long 60000L>
	//   88  173:ladd            
	//   89  174:lstore_3        
		} else
	//*  90  175:goto            184
		{
			l = 0x2932e00L + l;
	//   91  178:ldc2w           #155 <Long 0x2932e00L>
	//   92  181:lload_3         
	//   93  182:ladd            
	//   94  183:lstore_3        
		}
		twilightstate.isNight = flag;
	//   95  184:aload           14
	//   96  186:iload           13
	//   97  188:putfield        #160 <Field boolean TwilightManager$TwilightState.isNight>
		twilightstate.yesterdaySunset = l1;
	//   98  191:aload           14
	//   99  193:lload           5
	//  100  195:putfield        #163 <Field long TwilightManager$TwilightState.yesterdaySunset>
		twilightstate.todaySunrise = l2;
	//  101  198:aload           14
	//  102  200:lload           7
	//  103  202:putfield        #166 <Field long TwilightManager$TwilightState.todaySunrise>
		twilightstate.todaySunset = l3;
	//  104  205:aload           14
	//  105  207:lload           9
	//  106  209:putfield        #169 <Field long TwilightManager$TwilightState.todaySunset>
		twilightstate.tomorrowSunrise = l4;
	//  107  212:aload           14
	//  108  214:lload           11
	//  109  216:putfield        #172 <Field long TwilightManager$TwilightState.tomorrowSunrise>
		twilightstate.nextUpdate = l;
	//  110  219:aload           14
	//  111  221:lload_3         
	//  112  222:putfield        #114 <Field long TwilightManager$TwilightState.nextUpdate>
	//  113  225:return          
	}

	boolean isNight()
	{
		TwilightState twilightstate = mTwilightState;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:astore_2        
		if(isStateValid())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #174 <Method boolean isStateValid()>
	//*   5    9:ifeq            17
			return twilightstate.isNight;
	//    6   12:aload_2         
	//    7   13:getfield        #160 <Field boolean TwilightManager$TwilightState.isNight>
	//    8   16:ireturn         
		Location location = getLastKnownLocation();
	//    9   17:aload_0         
	//   10   18:invokespecial   #176 <Method Location getLastKnownLocation()>
	//   11   21:astore_3        
		if(location != null)
	//*  12   22:aload_3         
	//*  13   23:ifnull          36
		{
			updateState(location);
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokespecial   #178 <Method void updateState(Location)>
			return twilightstate.isNight;
	//   17   31:aload_2         
	//   18   32:getfield        #160 <Field boolean TwilightManager$TwilightState.isNight>
	//   19   35:ireturn         
		}
		Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
	//   20   36:ldc1            #16  <String "TwilightManager">
	//   21   38:ldc1            #180 <String "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.">
	//   22   40:invokestatic    #184 <Method int Log.i(String, String)>
	//   23   43:pop             
		int i = Calendar.getInstance().get(11);
	//   24   44:invokestatic    #189 <Method Calendar Calendar.getInstance()>
	//   25   47:bipush          11
	//   26   49:invokevirtual   #193 <Method int Calendar.get(int)>
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
}
