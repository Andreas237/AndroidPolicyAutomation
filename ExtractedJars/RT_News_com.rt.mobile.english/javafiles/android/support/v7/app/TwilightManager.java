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
	//*  34   68:goto            77
			flag = false;
	//   35   71:iconst_0        
	//   36   72:istore          13
	//*  37   74:goto            68
		long l2 = twilightcalculator.sunrise;
	//   38   77:aload           15
	//   39   79:getfield        #150 <Field long TwilightCalculator.sunrise>
	//   40   82:lstore          7
		long l3 = twilightcalculator.sunset;
	//   41   84:aload           15
	//   42   86:getfield        #144 <Field long TwilightCalculator.sunset>
	//   43   89:lstore          9
		twilightcalculator.calculateTwilight(l + 0x5265c00L, location.getLatitude(), location.getLongitude());
	//   44   91:aload           15
	//   45   93:lload_3         
	//   46   94:ldc2w           #129 <Long 0x5265c00L>
	//   47   97:ladd            
	//   48   98:aload_1         
	//   49   99:invokevirtual   #134 <Method double Location.getLatitude()>
	//   50  102:aload_1         
	//   51  103:invokevirtual   #137 <Method double Location.getLongitude()>
	//   52  106:invokevirtual   #141 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		long l4 = twilightcalculator.sunrise;
	//   53  109:aload           15
	//   54  111:getfield        #150 <Field long TwilightCalculator.sunrise>
	//   55  114:lstore          11
		if(l2 != -1L && l3 != -1L)
	//*  56  116:lload           7
	//*  57  118:ldc2w           #151 <Long -1L>
	//*  58  121:lcmp            
	//*  59  122:ifeq            181
	//*  60  125:lload           9
	//*  61  127:ldc2w           #151 <Long -1L>
	//*  62  130:lcmp            
	//*  63  131:ifne            137
	//*  64  134:goto            181
		{
			if(l > l3)
	//*  65  137:lload_3         
	//*  66  138:lload           9
	//*  67  140:lcmp            
	//*  68  141:ifle            152
				l = 0L + l4;
	//   69  144:lconst_0        
	//   70  145:lload           11
	//   71  147:ladd            
	//   72  148:lstore_3        
			else
	//*  73  149:goto            172
			if(l > l2)
	//*  74  152:lload_3         
	//*  75  153:lload           7
	//*  76  155:lcmp            
	//*  77  156:ifle            167
				l = 0L + l3;
	//   78  159:lconst_0        
	//   79  160:lload           9
	//   80  162:ladd            
	//   81  163:lstore_3        
			else
	//*  82  164:goto            172
				l = 0L + l2;
	//   83  167:lconst_0        
	//   84  168:lload           7
	//   85  170:ladd            
	//   86  171:lstore_3        
			l += 60000L;
	//   87  172:lload_3         
	//   88  173:ldc2w           #153 <Long 60000L>
	//   89  176:ladd            
	//   90  177:lstore_3        
		} else
	//*  91  178:goto            187
		{
			l += 0x2932e00L;
	//   92  181:lload_3         
	//   93  182:ldc2w           #155 <Long 0x2932e00L>
	//   94  185:ladd            
	//   95  186:lstore_3        
		}
		twilightstate.isNight = flag;
	//   96  187:aload           14
	//   97  189:iload           13
	//   98  191:putfield        #160 <Field boolean TwilightManager$TwilightState.isNight>
		twilightstate.yesterdaySunset = l1;
	//   99  194:aload           14
	//  100  196:lload           5
	//  101  198:putfield        #163 <Field long TwilightManager$TwilightState.yesterdaySunset>
		twilightstate.todaySunrise = l2;
	//  102  201:aload           14
	//  103  203:lload           7
	//  104  205:putfield        #166 <Field long TwilightManager$TwilightState.todaySunrise>
		twilightstate.todaySunset = l3;
	//  105  208:aload           14
	//  106  210:lload           9
	//  107  212:putfield        #169 <Field long TwilightManager$TwilightState.todaySunset>
		twilightstate.tomorrowSunrise = l4;
	//  108  215:aload           14
	//  109  217:lload           11
	//  110  219:putfield        #172 <Field long TwilightManager$TwilightState.tomorrowSunrise>
		twilightstate.nextUpdate = l;
	//  111  222:aload           14
	//  112  224:lload_3         
	//  113  225:putfield        #114 <Field long TwilightManager$TwilightState.nextUpdate>
	//  114  228:return          
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
