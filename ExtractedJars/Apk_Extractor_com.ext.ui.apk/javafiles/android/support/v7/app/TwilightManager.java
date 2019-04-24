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
		Location location1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Location location;
		if(PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #36  <Field Context mContext>
	//*   4    6:ldc1            #65  <String "android.permission.ACCESS_COARSE_LOCATION">
	//*   5    8:invokestatic    #71  <Method int PermissionChecker.checkSelfPermission(Context, String)>
	//*   6   11:ifne            77
			location = getLastKnownLocationForProvider("network");
	//    7   14:aload_0         
	//    8   15:ldc1            #73  <String "network">
	//    9   17:invokespecial   #77  <Method Location getLastKnownLocationForProvider(String)>
	//   10   20:astore_1        
		else
	//*  11   21:aload_0         
	//*  12   22:getfield        #36  <Field Context mContext>
	//*  13   25:ldc1            #79  <String "android.permission.ACCESS_FINE_LOCATION">
	//*  14   27:invokestatic    #71  <Method int PermissionChecker.checkSelfPermission(Context, String)>
	//*  15   30:ifne            40
	//*  16   33:aload_0         
	//*  17   34:ldc1            #81  <String "gps">
	//*  18   36:invokespecial   #77  <Method Location getLastKnownLocationForProvider(String)>
	//*  19   39:astore_2        
	//*  20   40:aload_2         
	//*  21   41:ifnull          66
	//*  22   44:aload_1         
	//*  23   45:ifnull          66
	//*  24   48:aload_1         
	//*  25   49:astore_3        
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #87  <Method long Location.getTime()>
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #87  <Method long Location.getTime()>
	//*  30   58:lcmp            
	//*  31   59:ifle            64
	//*  32   62:aload_2         
	//*  33   63:astore_3        
	//*  34   64:aload_3         
	//*  35   65:areturn         
	//*  36   66:aload_2         
	//*  37   67:ifnull          72
	//*  38   70:aload_2         
	//*  39   71:areturn         
	//*  40   72:aload_1         
	//*  41   73:astore_2        
	//*  42   74:goto            70
			location = null;
	//   43   77:aconst_null     
	//   44   78:astore_1        
		if(PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_FINE_LOCATION") == 0)
			location1 = getLastKnownLocationForProvider("gps");
		if(location1 != null && location != null)
		{
			Location location2 = location;
			if(location1.getTime() > location.getTime())
				location2 = location1;
			return location2;
		}
		if(location1 == null)
			location1 = location;
		return location1;
	//*  45   79:goto            21
	}

	private Location getLastKnownLocationForProvider(String s)
	{
		if(mLocationManager == null)
			break MISSING_BLOCK_LABEL_39;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field LocationManager mLocationManager>
	//    2    4:ifnull          39
		if(!mLocationManager.isProviderEnabled(s))
			break MISSING_BLOCK_LABEL_39;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field LocationManager mLocationManager>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #93  <Method boolean LocationManager.isProviderEnabled(String)>
	//    7   15:ifeq            39
		s = ((String) (mLocationManager.getLastKnownLocation(s)));
	//    8   18:aload_0         
	//    9   19:getfield        #38  <Field LocationManager mLocationManager>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #95  <Method Location LocationManager.getLastKnownLocation(String)>
	//   12   26:astore_1        
		return ((Location) (s));
	//   13   27:aload_1         
	//   14   28:areturn         
		s;
	//   15   29:astore_1        
		Log.d("TwilightManager", "Failed to get last known location", ((Throwable) (s)));
	//   16   30:ldc1            #16  <String "TwilightManager">
	//   17   32:ldc1            #97  <String "Failed to get last known location">
	//   18   34:aload_1         
	//   19   35:invokestatic    #103 <Method int Log.d(String, String, Throwable)>
	//   20   38:pop             
		return null;
	//   21   39:aconst_null     
	//   22   40:areturn         
	}

	private boolean isStateValid()
	{
		return mTwilightState != null && mTwilightState.nextUpdate > System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:ifnull          23
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field TwilightManager$TwilightState mTwilightState>
	//    5   11:getfield        #109 <Field long TwilightManager$TwilightState.nextUpdate>
	//    6   14:invokestatic    #114 <Method long System.currentTimeMillis()>
	//    7   17:lcmp            
	//    8   18:ifle            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
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
		long l;
		long l2;
		long l3;
		long l4;
		TwilightState twilightstate = mTwilightState;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:astore          13
		l = System.currentTimeMillis();
	//    3    6:invokestatic    #114 <Method long System.currentTimeMillis()>
	//    4    9:lstore_2        
		TwilightCalculator twilightcalculator = TwilightCalculator.getInstance();
	//    5   10:invokestatic    #123 <Method TwilightCalculator TwilightCalculator.getInstance()>
	//    6   13:astore          14
		twilightcalculator.calculateTwilight(l - 0x5265c00L, location.getLatitude(), location.getLongitude());
	//    7   15:aload           14
	//    8   17:lload_2         
	//    9   18:ldc2w           #124 <Long 0x5265c00L>
	//   10   21:lsub            
	//   11   22:aload_1         
	//   12   23:invokevirtual   #129 <Method double Location.getLatitude()>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #132 <Method double Location.getLongitude()>
	//   15   30:invokevirtual   #136 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		long l1 = twilightcalculator.sunset;
	//   16   33:aload           14
	//   17   35:getfield        #139 <Field long TwilightCalculator.sunset>
	//   18   38:lstore          4
		twilightcalculator.calculateTwilight(l, location.getLatitude(), location.getLongitude());
	//   19   40:aload           14
	//   20   42:lload_2         
	//   21   43:aload_1         
	//   22   44:invokevirtual   #129 <Method double Location.getLatitude()>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #132 <Method double Location.getLongitude()>
	//   25   51:invokevirtual   #136 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		boolean flag;
		if(twilightcalculator.state == 1)
	//*  26   54:aload           14
	//*  27   56:getfield        #142 <Field int TwilightCalculator.state>
	//*  28   59:iconst_1        
	//*  29   60:icmpne          171
			flag = true;
	//   30   63:iconst_1        
	//   31   64:istore          12
		else
	//*  32   66:aload           14
	//*  33   68:getfield        #145 <Field long TwilightCalculator.sunrise>
	//*  34   71:lstore          6
	//*  35   73:aload           14
	//*  36   75:getfield        #139 <Field long TwilightCalculator.sunset>
	//*  37   78:lstore          8
	//*  38   80:aload           14
	//*  39   82:ldc2w           #124 <Long 0x5265c00L>
	//*  40   85:lload_2         
	//*  41   86:ladd            
	//*  42   87:aload_1         
	//*  43   88:invokevirtual   #129 <Method double Location.getLatitude()>
	//*  44   91:aload_1         
	//*  45   92:invokevirtual   #132 <Method double Location.getLongitude()>
	//*  46   95:invokevirtual   #136 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
	//*  47   98:aload           14
	//*  48  100:getfield        #145 <Field long TwilightCalculator.sunrise>
	//*  49  103:lstore          10
	//*  50  105:lload           6
	//*  51  107:ldc2w           #146 <Long -1L>
	//*  52  110:lcmp            
	//*  53  111:ifeq            123
	//*  54  114:lload           8
	//*  55  116:ldc2w           #146 <Long -1L>
	//*  56  119:lcmp            
	//*  57  120:ifne            177
	//*  58  123:ldc2w           #148 <Long 0x2932e00L>
	//*  59  126:lload_2         
	//*  60  127:ladd            
	//*  61  128:lstore_2        
	//*  62  129:aload           13
	//*  63  131:iload           12
	//*  64  133:putfield        #153 <Field boolean TwilightManager$TwilightState.isNight>
	//*  65  136:aload           13
	//*  66  138:lload           4
	//*  67  140:putfield        #156 <Field long TwilightManager$TwilightState.yesterdaySunset>
	//*  68  143:aload           13
	//*  69  145:lload           6
	//*  70  147:putfield        #159 <Field long TwilightManager$TwilightState.todaySunrise>
	//*  71  150:aload           13
	//*  72  152:lload           8
	//*  73  154:putfield        #162 <Field long TwilightManager$TwilightState.todaySunset>
	//*  74  157:aload           13
	//*  75  159:lload           10
	//*  76  161:putfield        #165 <Field long TwilightManager$TwilightState.tomorrowSunrise>
	//*  77  164:aload           13
	//*  78  166:lload_2         
	//*  79  167:putfield        #109 <Field long TwilightManager$TwilightState.nextUpdate>
	//*  80  170:return          
			flag = false;
	//   81  171:iconst_0        
	//   82  172:istore          12
		l2 = twilightcalculator.sunrise;
		l3 = twilightcalculator.sunset;
		twilightcalculator.calculateTwilight(0x5265c00L + l, location.getLatitude(), location.getLongitude());
		l4 = twilightcalculator.sunrise;
		if(l2 != -1L && l3 != -1L) goto _L2; else goto _L1
_L1:
		l = 0x2932e00L + l;
_L4:
		twilightstate.isNight = flag;
		twilightstate.yesterdaySunset = l1;
		twilightstate.todaySunrise = l2;
		twilightstate.todaySunset = l3;
		twilightstate.tomorrowSunrise = l4;
		twilightstate.nextUpdate = l;
		return;
	//*  83  174:goto            66
_L2:
		if(l <= l3)
			break; /* Loop/switch isn't completed */
	//   84  177:lload_2         
	//   85  178:lload           8
	//   86  180:lcmp            
	//   87  181:ifle            198
		l = 0L + l4;
	//   88  184:lconst_0        
	//   89  185:lload           10
	//   90  187:ladd            
	//   91  188:lstore_2        
_L5:
		l += 60000L;
	//   92  189:lload_2         
	//   93  190:ldc2w           #166 <Long 60000L>
	//   94  193:ladd            
	//   95  194:lstore_2        
		if(true) goto _L4; else goto _L3
	//   96  195:goto            129
_L3:
		if(l > l2)
	//*  97  198:lload_2         
	//*  98  199:lload           6
	//*  99  201:lcmp            
	//* 100  202:ifle            213
			l = 0L + l3;
	//  101  205:lconst_0        
	//  102  206:lload           8
	//  103  208:ladd            
	//  104  209:lstore_2        
		else
	//* 105  210:goto            189
			l = 0L + l2;
	//  106  213:lconst_0        
	//  107  214:lload           6
	//  108  216:ladd            
	//  109  217:lstore_2        
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//* 110  218:goto            189
	}

	boolean isNight()
	{
		TwilightState twilightstate = mTwilightState;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:astore_2        
		if(isStateValid())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #169 <Method boolean isStateValid()>
	//*   5    9:ifeq            17
			return twilightstate.isNight;
	//    6   12:aload_2         
	//    7   13:getfield        #153 <Field boolean TwilightManager$TwilightState.isNight>
	//    8   16:ireturn         
		Location location = getLastKnownLocation();
	//    9   17:aload_0         
	//   10   18:invokespecial   #171 <Method Location getLastKnownLocation()>
	//   11   21:astore_3        
		if(location != null)
	//*  12   22:aload_3         
	//*  13   23:ifnull          36
		{
			updateState(location);
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokespecial   #173 <Method void updateState(Location)>
			return twilightstate.isNight;
	//   17   31:aload_2         
	//   18   32:getfield        #153 <Field boolean TwilightManager$TwilightState.isNight>
	//   19   35:ireturn         
		}
		Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
	//   20   36:ldc1            #16  <String "TwilightManager">
	//   21   38:ldc1            #175 <String "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.">
	//   22   40:invokestatic    #179 <Method int Log.i(String, String)>
	//   23   43:pop             
		int i = Calendar.getInstance().get(11);
	//   24   44:invokestatic    #184 <Method Calendar Calendar.getInstance()>
	//   25   47:bipush          11
	//   26   49:invokevirtual   #188 <Method int Calendar.get(int)>
	//   27   52:istore_1        
		return i < 6 || i >= 22;
	//   28   53:iload_1         
	//   29   54:bipush          6
	//   30   56:icmplt          65
	//   31   59:iload_1         
	//   32   60:bipush          22
	//   33   62:icmplt          67
	//   34   65:iconst_1        
	//   35   66:ireturn         
	//   36   67:iconst_0        
	//   37   68:ireturn         
	}

	private static final int SUNRISE = 6;
	private static final int SUNSET = 22;
	private static final String TAG = "TwilightManager";
	private static TwilightManager sInstance;
	private final Context mContext;
	private final LocationManager mLocationManager;
	private final TwilightState mTwilightState = new TwilightState();
}
