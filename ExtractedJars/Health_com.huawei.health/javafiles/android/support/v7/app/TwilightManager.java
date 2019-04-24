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
	static class TwilightState
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
		Location location = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		Location location1 = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		if(PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0)
	//*   4    4:aload_0         
	//*   5    5:getfield        #36  <Field Context mContext>
	//*   6    8:ldc1            #65  <String "android.permission.ACCESS_COARSE_LOCATION">
	//*   7   10:invokestatic    #71  <Method int PermissionChecker.checkSelfPermission(Context, String)>
	//*   8   13:ifne            23
			location = getLastKnownLocationForProvider("network");
	//    9   16:aload_0         
	//   10   17:ldc1            #73  <String "network">
	//   11   19:invokespecial   #77  <Method Location getLastKnownLocationForProvider(String)>
	//   12   22:astore_1        
		if(PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_FINE_LOCATION") == 0)
	//*  13   23:aload_0         
	//*  14   24:getfield        #36  <Field Context mContext>
	//*  15   27:ldc1            #79  <String "android.permission.ACCESS_FINE_LOCATION">
	//*  16   29:invokestatic    #71  <Method int PermissionChecker.checkSelfPermission(Context, String)>
	//*  17   32:ifne            42
			location1 = getLastKnownLocationForProvider("gps");
	//   18   35:aload_0         
	//   19   36:ldc1            #81  <String "gps">
	//   20   38:invokespecial   #77  <Method Location getLastKnownLocationForProvider(String)>
	//   21   41:astore_2        
		if(location1 != null && location != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          66
	//*  24   46:aload_1         
	//*  25   47:ifnull          66
			if(location1.getTime() > location.getTime())
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #87  <Method long Location.getTime()>
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #87  <Method long Location.getTime()>
	//*  30   58:lcmp            
	//*  31   59:ifle            64
				return location1;
	//   32   62:aload_2         
	//   33   63:areturn         
			else
				return location;
	//   34   64:aload_1         
	//   35   65:areturn         
		if(location1 != null)
	//*  36   66:aload_2         
	//*  37   67:ifnull          72
			return location1;
	//   38   70:aload_2         
	//   39   71:areturn         
		else
			return location;
	//   40   72:aload_1         
	//   41   73:areturn         
	}

	private Location getLastKnownLocationForProvider(String s)
	{
		if(mLocationManager == null)
			break MISSING_BLOCK_LABEL_42;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field LocationManager mLocationManager>
	//    2    4:ifnull          42
		if(!mLocationManager.isProviderEnabled(s))
			break MISSING_BLOCK_LABEL_42;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field LocationManager mLocationManager>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #93  <Method boolean LocationManager.isProviderEnabled(String)>
	//    7   15:ifeq            29
		s = ((String) (mLocationManager.getLastKnownLocation(s)));
	//    8   18:aload_0         
	//    9   19:getfield        #38  <Field LocationManager mLocationManager>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #95  <Method Location LocationManager.getLastKnownLocation(String)>
	//   12   26:astore_1        
		return ((Location) (s));
	//   13   27:aload_1         
	//   14   28:areturn         
	//*  15   29:goto            42
		s;
	//   16   32:astore_1        
		Log.d("TwilightManager", "Failed to get last known location", ((Throwable) (s)));
	//   17   33:ldc1            #16  <String "TwilightManager">
	//   18   35:ldc1            #97  <String "Failed to get last known location">
	//   19   37:aload_1         
	//   20   38:invokestatic    #103 <Method int Log.d(String, String, Throwable)>
	//   21   41:pop             
		return null;
	//   22   42:aconst_null     
	//   23   43:areturn         
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
		TwilightState twilightstate = mTwilightState;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TwilightManager$TwilightState mTwilightState>
	//    2    4:astore          13
		long l = System.currentTimeMillis();
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
	//   36   74:getfield        #145 <Field long TwilightCalculator.sunrise>
	//   37   77:lstore          6
		long l3 = twilightcalculator.sunset;
	//   38   79:aload           14
	//   39   81:getfield        #139 <Field long TwilightCalculator.sunset>
	//   40   84:lstore          8
		twilightcalculator.calculateTwilight(0x5265c00L + l, location.getLatitude(), location.getLongitude());
	//   41   86:aload           14
	//   42   88:ldc2w           #124 <Long 0x5265c00L>
	//   43   91:lload_2         
	//   44   92:ladd            
	//   45   93:aload_1         
	//   46   94:invokevirtual   #129 <Method double Location.getLatitude()>
	//   47   97:aload_1         
	//   48   98:invokevirtual   #132 <Method double Location.getLongitude()>
	//   49  101:invokevirtual   #136 <Method void TwilightCalculator.calculateTwilight(long, double, double)>
		long l4 = twilightcalculator.sunrise;
	//   50  104:aload           14
	//   51  106:getfield        #145 <Field long TwilightCalculator.sunrise>
	//   52  109:lstore          10
		if(l2 == -1L || l3 == -1L)
	//*  53  111:lload           6
	//*  54  113:ldc2w           #146 <Long -1L>
	//*  55  116:lcmp            
	//*  56  117:ifeq            129
	//*  57  120:lload           8
	//*  58  122:ldc2w           #146 <Long -1L>
	//*  59  125:lcmp            
	//*  60  126:ifne            138
		{
			l += 0x2932e00L;
	//   61  129:lload_2         
	//   62  130:ldc2w           #148 <Long 0x2932e00L>
	//   63  133:ladd            
	//   64  134:lstore_2        
		} else
	//*  65  135:goto            179
		{
			if(l > l3)
	//*  66  138:lload_2         
	//*  67  139:lload           8
	//*  68  141:lcmp            
	//*  69  142:ifle            153
				l = 0L + l4;
	//   70  145:lconst_0        
	//   71  146:lload           10
	//   72  148:ladd            
	//   73  149:lstore_2        
			else
	//*  74  150:goto            173
			if(l > l2)
	//*  75  153:lload_2         
	//*  76  154:lload           6
	//*  77  156:lcmp            
	//*  78  157:ifle            168
				l = 0L + l3;
	//   79  160:lconst_0        
	//   80  161:lload           8
	//   81  163:ladd            
	//   82  164:lstore_2        
			else
	//*  83  165:goto            173
				l = 0L + l2;
	//   84  168:lconst_0        
	//   85  169:lload           6
	//   86  171:ladd            
	//   87  172:lstore_2        
			l += 60000L;
	//   88  173:lload_2         
	//   89  174:ldc2w           #150 <Long 60000L>
	//   90  177:ladd            
	//   91  178:lstore_2        
		}
		twilightstate.isNight = flag;
	//   92  179:aload           13
	//   93  181:iload           12
	//   94  183:putfield        #155 <Field boolean TwilightManager$TwilightState.isNight>
		twilightstate.yesterdaySunset = l1;
	//   95  186:aload           13
	//   96  188:lload           4
	//   97  190:putfield        #158 <Field long TwilightManager$TwilightState.yesterdaySunset>
		twilightstate.todaySunrise = l2;
	//   98  193:aload           13
	//   99  195:lload           6
	//  100  197:putfield        #161 <Field long TwilightManager$TwilightState.todaySunrise>
		twilightstate.todaySunset = l3;
	//  101  200:aload           13
	//  102  202:lload           8
	//  103  204:putfield        #164 <Field long TwilightManager$TwilightState.todaySunset>
		twilightstate.tomorrowSunrise = l4;
	//  104  207:aload           13
	//  105  209:lload           10
	//  106  211:putfield        #167 <Field long TwilightManager$TwilightState.tomorrowSunrise>
		twilightstate.nextUpdate = l;
	//  107  214:aload           13
	//  108  216:lload_2         
	//  109  217:putfield        #109 <Field long TwilightManager$TwilightState.nextUpdate>
	//  110  220:return          
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
	//    7   13:getfield        #155 <Field boolean TwilightManager$TwilightState.isNight>
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
	//   18   32:getfield        #155 <Field boolean TwilightManager$TwilightState.isNight>
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
