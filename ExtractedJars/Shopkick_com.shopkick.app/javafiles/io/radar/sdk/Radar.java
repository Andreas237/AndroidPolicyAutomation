// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import android.content.*;
import android.content.pm.*;
import android.location.Location;
import android.support.v4.content.LocalBroadcastManager;
import io.radar.sdk.api.ApiClient;
import io.radar.sdk.internal.RadarLogger;
import io.radar.sdk.internal.repository.IdentityRepository;
import io.radar.sdk.internal.repository.OptionsRepository;
import io.radar.sdk.location.LocationManager;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import io.radar.sdk.state.StateManager;
import io.radar.sdk.util.DeviceHelper;
import io.radar.sdk.util.PermissionsHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk:
//			RadarReceiver, RadarTrackingOptions

public final class Radar
{
	public static interface RadarCallback
	{

		public abstract void onComplete(RadarStatus radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser);
	}

	public static final class RadarCallback.DefaultImpls
	{

		public static void onComplete$default(RadarCallback radarcallback, RadarStatus radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser, int i, Object obj)
		{
			if(obj == null)
		//*   0    0:aload           6
		//*   1    2:ifnonnull       55
			{
				if((i & 2) != 0)
		//*   2    5:iload           5
		//*   3    7:iconst_2        
		//*   4    8:iand            
		//*   5    9:ifeq            17
					location = (Location)null;
		//    6   12:aconst_null     
		//    7   13:checkcast       #22  <Class Location>
		//    8   16:astore_2        
				if((i & 4) != 0)
		//*   9   17:iload           5
		//*  10   19:iconst_4        
		//*  11   20:iand            
		//*  12   21:ifeq            29
					aradarevent = (RadarEvent[])null;
		//   13   24:aconst_null     
		//   14   25:checkcast       #24  <Class RadarEvent[]>
		//   15   28:astore_3        
				if((i & 8) != 0)
		//*  16   29:iload           5
		//*  17   31:bipush          8
		//*  18   33:iand            
		//*  19   34:ifeq            43
					radaruser = (RadarUser)null;
		//   20   37:aconst_null     
		//   21   38:checkcast       #26  <Class RadarUser>
		//   22   41:astore          4
				radarcallback.onComplete(radarstatus, location, aradarevent, radaruser);
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:aload_2         
		//   26   46:aload_3         
		//   27   47:aload           4
		//   28   49:invokeinterface #30  <Method void Radar$RadarCallback.onComplete(Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
				return;
		//   29   54:return          
			} else
			{
				throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
		//   30   55:new             #32  <Class UnsupportedOperationException>
		//   31   58:dup             
		//   32   59:ldc1            #34  <String "Super calls with default arguments not supported in this target, function: onComplete">
		//   33   61:invokespecial   #38  <Method void UnsupportedOperationException(String)>
		//   34   64:athrow          
			}
		}
	}

	public static final class RadarPlacesProvider extends Enum
	{

		public static RadarPlacesProvider valueOf(String s)
		{
			return (RadarPlacesProvider)Enum.valueOf(io/radar/sdk/Radar$RadarPlacesProvider, s);
		//    0    0:ldc1            #2   <Class Radar$RadarPlacesProvider>
		//    1    2:aload_0         
		//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Radar$RadarPlacesProvider>
		//    4    9:areturn         
		}

		public static RadarPlacesProvider[] values()
		{
			return (RadarPlacesProvider[])((RadarPlacesProvider []) ($VALUES)).clone();
		//    0    0:getstatic       #40  <Field Radar$RadarPlacesProvider[] $VALUES>
		//    1    3:invokevirtual   #55  <Method Object _5B_Lio.radar.sdk.Radar$RadarPlacesProvider_3B_.clone()>
		//    2    6:checkcast       #51  <Class Radar$RadarPlacesProvider[]>
		//    3    9:areturn         
		}

		private static final RadarPlacesProvider $VALUES[];
		public static final RadarPlacesProvider FACEBOOK;
		public static final RadarPlacesProvider NONE;

		static 
		{
			RadarPlacesProvider radarplacesprovider = new RadarPlacesProvider("NONE", 0);
		//    0    0:new             #2   <Class Radar$RadarPlacesProvider>
		//    1    3:dup             
		//    2    4:ldc1            #30  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #33  <Method void Radar$RadarPlacesProvider(String, int)>
		//    5   10:astore_0        
			NONE = radarplacesprovider;
		//    6   11:aload_0         
		//    7   12:putstatic       #35  <Field Radar$RadarPlacesProvider NONE>
			RadarPlacesProvider radarplacesprovider1 = new RadarPlacesProvider("FACEBOOK", 1);
		//    8   15:new             #2   <Class Radar$RadarPlacesProvider>
		//    9   18:dup             
		//   10   19:ldc1            #36  <String "FACEBOOK">
		//   11   21:iconst_1        
		//   12   22:invokespecial   #33  <Method void Radar$RadarPlacesProvider(String, int)>
		//   13   25:astore_1        
			FACEBOOK = radarplacesprovider1;
		//   14   26:aload_1         
		//   15   27:putstatic       #38  <Field Radar$RadarPlacesProvider FACEBOOK>
			$VALUES = (new RadarPlacesProvider[] {
				radarplacesprovider, radarplacesprovider1
			});
		//   16   30:iconst_2        
		//   17   31:anewarray       RadarPlacesProvider[]
		//   18   34:dup             
		//   19   35:iconst_0        
		//   20   36:aload_0         
		//   21   37:aastore         
		//   22   38:dup             
		//   23   39:iconst_1        
		//   24   40:aload_1         
		//   25   41:aastore         
		//   26   42:putstatic       #40  <Field Radar$RadarPlacesProvider[] $VALUES>
		//*  27   45:return          
		}

		protected RadarPlacesProvider(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class RadarStatus extends Enum
	{

		public static RadarStatus valueOf(String s)
		{
			return (RadarStatus)Enum.valueOf(io/radar/sdk/Radar$RadarStatus, s);
		//    0    0:ldc1            #2   <Class Radar$RadarStatus>
		//    1    2:aload_0         
		//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Radar$RadarStatus>
		//    4    9:areturn         
		}

		public static RadarStatus[] values()
		{
			return (RadarStatus[])((RadarStatus []) ($VALUES)).clone();
		//    0    0:getstatic       #72  <Field Radar$RadarStatus[] $VALUES>
		//    1    3:invokevirtual   #87  <Method Object _5B_Lio.radar.sdk.Radar$RadarStatus_3B_.clone()>
		//    2    6:checkcast       #83  <Class Radar$RadarStatus[]>
		//    3    9:areturn         
		}

		private static final RadarStatus $VALUES[];
		public static final RadarStatus ERROR_LOCATION;
		public static final RadarStatus ERROR_NETWORK;
		public static final RadarStatus ERROR_PERMISSIONS;
		public static final RadarStatus ERROR_PUBLISHABLE_KEY;
		public static final RadarStatus ERROR_RATE_LIMIT;
		public static final RadarStatus ERROR_SERVER;
		public static final RadarStatus ERROR_UNAUTHORIZED;
		public static final RadarStatus ERROR_UNKNOWN;
		public static final RadarStatus SUCCESS;
		public static final RadarStatus UNKNOWN;

		static 
		{
			RadarStatus radarstatus = new RadarStatus("SUCCESS", 0);
		//    0    0:new             #2   <Class Radar$RadarStatus>
		//    1    3:dup             
		//    2    4:ldc1            #38  <String "SUCCESS">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//    5   10:astore_0        
			SUCCESS = radarstatus;
		//    6   11:aload_0         
		//    7   12:putstatic       #43  <Field Radar$RadarStatus SUCCESS>
			RadarStatus radarstatus1 = new RadarStatus("ERROR_PUBLISHABLE_KEY", 1);
		//    8   15:new             #2   <Class Radar$RadarStatus>
		//    9   18:dup             
		//   10   19:ldc1            #44  <String "ERROR_PUBLISHABLE_KEY">
		//   11   21:iconst_1        
		//   12   22:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   13   25:astore_1        
			ERROR_PUBLISHABLE_KEY = radarstatus1;
		//   14   26:aload_1         
		//   15   27:putstatic       #46  <Field Radar$RadarStatus ERROR_PUBLISHABLE_KEY>
			RadarStatus radarstatus2 = new RadarStatus("ERROR_PERMISSIONS", 2);
		//   16   30:new             #2   <Class Radar$RadarStatus>
		//   17   33:dup             
		//   18   34:ldc1            #47  <String "ERROR_PERMISSIONS">
		//   19   36:iconst_2        
		//   20   37:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   21   40:astore_2        
			ERROR_PERMISSIONS = radarstatus2;
		//   22   41:aload_2         
		//   23   42:putstatic       #49  <Field Radar$RadarStatus ERROR_PERMISSIONS>
			RadarStatus radarstatus3 = new RadarStatus("ERROR_LOCATION", 3);
		//   24   45:new             #2   <Class Radar$RadarStatus>
		//   25   48:dup             
		//   26   49:ldc1            #50  <String "ERROR_LOCATION">
		//   27   51:iconst_3        
		//   28   52:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   29   55:astore_3        
			ERROR_LOCATION = radarstatus3;
		//   30   56:aload_3         
		//   31   57:putstatic       #52  <Field Radar$RadarStatus ERROR_LOCATION>
			RadarStatus radarstatus4 = new RadarStatus("ERROR_NETWORK", 4);
		//   32   60:new             #2   <Class Radar$RadarStatus>
		//   33   63:dup             
		//   34   64:ldc1            #53  <String "ERROR_NETWORK">
		//   35   66:iconst_4        
		//   36   67:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   37   70:astore          4
			ERROR_NETWORK = radarstatus4;
		//   38   72:aload           4
		//   39   74:putstatic       #55  <Field Radar$RadarStatus ERROR_NETWORK>
			RadarStatus radarstatus5 = new RadarStatus("ERROR_UNAUTHORIZED", 5);
		//   40   77:new             #2   <Class Radar$RadarStatus>
		//   41   80:dup             
		//   42   81:ldc1            #56  <String "ERROR_UNAUTHORIZED">
		//   43   83:iconst_5        
		//   44   84:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   45   87:astore          5
			ERROR_UNAUTHORIZED = radarstatus5;
		//   46   89:aload           5
		//   47   91:putstatic       #58  <Field Radar$RadarStatus ERROR_UNAUTHORIZED>
			RadarStatus radarstatus6 = new RadarStatus("ERROR_SERVER", 6);
		//   48   94:new             #2   <Class Radar$RadarStatus>
		//   49   97:dup             
		//   50   98:ldc1            #59  <String "ERROR_SERVER">
		//   51  100:bipush          6
		//   52  102:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   53  105:astore          6
			ERROR_SERVER = radarstatus6;
		//   54  107:aload           6
		//   55  109:putstatic       #61  <Field Radar$RadarStatus ERROR_SERVER>
			RadarStatus radarstatus7 = new RadarStatus("ERROR_RATE_LIMIT", 7);
		//   56  112:new             #2   <Class Radar$RadarStatus>
		//   57  115:dup             
		//   58  116:ldc1            #62  <String "ERROR_RATE_LIMIT">
		//   59  118:bipush          7
		//   60  120:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   61  123:astore          7
			ERROR_RATE_LIMIT = radarstatus7;
		//   62  125:aload           7
		//   63  127:putstatic       #64  <Field Radar$RadarStatus ERROR_RATE_LIMIT>
			RadarStatus radarstatus8 = new RadarStatus("ERROR_UNKNOWN", 8);
		//   64  130:new             #2   <Class Radar$RadarStatus>
		//   65  133:dup             
		//   66  134:ldc1            #65  <String "ERROR_UNKNOWN">
		//   67  136:bipush          8
		//   68  138:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   69  141:astore          8
			ERROR_UNKNOWN = radarstatus8;
		//   70  143:aload           8
		//   71  145:putstatic       #67  <Field Radar$RadarStatus ERROR_UNKNOWN>
			RadarStatus radarstatus9 = new RadarStatus("UNKNOWN", 9);
		//   72  148:new             #2   <Class Radar$RadarStatus>
		//   73  151:dup             
		//   74  152:ldc1            #68  <String "UNKNOWN">
		//   75  154:bipush          9
		//   76  156:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
		//   77  159:astore          9
			UNKNOWN = radarstatus9;
		//   78  161:aload           9
		//   79  163:putstatic       #70  <Field Radar$RadarStatus UNKNOWN>
			$VALUES = (new RadarStatus[] {
				radarstatus, radarstatus1, radarstatus2, radarstatus3, radarstatus4, radarstatus5, radarstatus6, radarstatus7, radarstatus8, radarstatus9
			});
		//   80  166:bipush          10
		//   81  168:anewarray       RadarStatus[]
		//   82  171:dup             
		//   83  172:iconst_0        
		//   84  173:aload_0         
		//   85  174:aastore         
		//   86  175:dup             
		//   87  176:iconst_1        
		//   88  177:aload_1         
		//   89  178:aastore         
		//   90  179:dup             
		//   91  180:iconst_2        
		//   92  181:aload_2         
		//   93  182:aastore         
		//   94  183:dup             
		//   95  184:iconst_3        
		//   96  185:aload_3         
		//   97  186:aastore         
		//   98  187:dup             
		//   99  188:iconst_4        
		//  100  189:aload           4
		//  101  191:aastore         
		//  102  192:dup             
		//  103  193:iconst_5        
		//  104  194:aload           5
		//  105  196:aastore         
		//  106  197:dup             
		//  107  198:bipush          6
		//  108  200:aload           6
		//  109  202:aastore         
		//  110  203:dup             
		//  111  204:bipush          7
		//  112  206:aload           7
		//  113  208:aastore         
		//  114  209:dup             
		//  115  210:bipush          8
		//  116  212:aload           8
		//  117  214:aastore         
		//  118  215:dup             
		//  119  216:bipush          9
		//  120  218:aload           9
		//  121  220:aastore         
		//  122  221:putstatic       #72  <Field Radar$RadarStatus[] $VALUES>
		//* 123  224:return          
		}

		protected RadarStatus(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #74  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class RadarTrackingOffline extends Enum
	{

		public static RadarTrackingOffline valueOf(String s)
		{
			return (RadarTrackingOffline)Enum.valueOf(io/radar/sdk/Radar$RadarTrackingOffline, s);
		//    0    0:ldc1            #2   <Class Radar$RadarTrackingOffline>
		//    1    2:aload_0         
		//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Radar$RadarTrackingOffline>
		//    4    9:areturn         
		}

		public static RadarTrackingOffline[] values()
		{
			return (RadarTrackingOffline[])((RadarTrackingOffline []) ($VALUES)).clone();
		//    0    0:getstatic       #48  <Field Radar$RadarTrackingOffline[] $VALUES>
		//    1    3:invokevirtual   #73  <Method Object _5B_Lio.radar.sdk.Radar$RadarTrackingOffline_3B_.clone()>
		//    2    6:checkcast       #69  <Class Radar$RadarTrackingOffline[]>
		//    3    9:areturn         
		}

		public final int getMode$sdk_release()
		{
			return mode;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field int mode>
		//    2    4:ireturn         
		}

		private static final RadarTrackingOffline $VALUES[];
		public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
		public static final RadarTrackingOffline REPLAY_OFF;
		public static final RadarTrackingOffline REPLAY_STOPPED;
		private final int mode;

		static 
		{
			RadarTrackingOffline radartrackingoffline = new RadarTrackingOffline("REPLAY_STOPPED", 0, 1);
		//    0    0:new             #2   <Class Radar$RadarTrackingOffline>
		//    1    3:dup             
		//    2    4:ldc1            #38  <String "REPLAY_STOPPED">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #41  <Method void Radar$RadarTrackingOffline(String, int, int)>
		//    6   11:astore_0        
			REPLAY_STOPPED = radartrackingoffline;
		//    7   12:aload_0         
		//    8   13:putstatic       #43  <Field Radar$RadarTrackingOffline REPLAY_STOPPED>
			RadarTrackingOffline radartrackingoffline1 = new RadarTrackingOffline("REPLAY_OFF", 1, -1);
		//    9   16:new             #2   <Class Radar$RadarTrackingOffline>
		//   10   19:dup             
		//   11   20:ldc1            #44  <String "REPLAY_OFF">
		//   12   22:iconst_1        
		//   13   23:iconst_m1       
		//   14   24:invokespecial   #41  <Method void Radar$RadarTrackingOffline(String, int, int)>
		//   15   27:astore_1        
			REPLAY_OFF = radartrackingoffline1;
		//   16   28:aload_1         
		//   17   29:putstatic       #46  <Field Radar$RadarTrackingOffline REPLAY_OFF>
			$VALUES = (new RadarTrackingOffline[] {
				radartrackingoffline, radartrackingoffline1
			});
		//   18   32:iconst_2        
		//   19   33:anewarray       RadarTrackingOffline[]
		//   20   36:dup             
		//   21   37:iconst_0        
		//   22   38:aload_0         
		//   23   39:aastore         
		//   24   40:dup             
		//   25   41:iconst_1        
		//   26   42:aload_1         
		//   27   43:aastore         
		//   28   44:putstatic       #48  <Field Radar$RadarTrackingOffline[] $VALUES>
		//   29   47:new             #10  <Class Radar$RadarTrackingOffline$Companion>
		//   30   50:dup             
		//   31   51:aconst_null     
		//   32   52:invokespecial   #51  <Method void Radar$RadarTrackingOffline$Companion(DefaultConstructorMarker)>
		//   33   55:putstatic       #53  <Field Radar$RadarTrackingOffline$Companion Companion>
		//*  34   58:return          
		}

		protected RadarTrackingOffline(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #57  <Method void Enum(String, int)>
			mode = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #59  <Field int mode>
		//    7   11:return          
		}
	}

	public static final class RadarTrackingOffline.Companion
	{

		public final RadarTrackingOffline fromInt(int i)
		{
			RadarTrackingOffline aradartrackingoffline[] = RadarTrackingOffline.values();
		//    0    0:invokestatic    #40  <Method Radar$RadarTrackingOffline[] Radar$RadarTrackingOffline.values()>
		//    1    3:astore          4
			int k = aradartrackingoffline.length;
		//    2    5:aload           4
		//    3    7:arraylength     
		//    4    8:istore_3        
			for(int j = 0; j < k; j++)
		//*   5    9:iconst_0        
		//*   6   10:istore_2        
		//*   7   11:iload_2         
		//*   8   12:iload_3         
		//*   9   13:icmpge          41
			{
				RadarTrackingOffline radartrackingoffline = aradartrackingoffline[j];
		//   10   16:aload           4
		//   11   18:iload_2         
		//   12   19:aaload          
		//   13   20:astore          5
				if(radartrackingoffline.sdk_release() == i)
		//*  14   22:aload           5
		//*  15   24:invokevirtual   #44  <Method int Radar$RadarTrackingOffline.getMode$sdk_release()>
		//*  16   27:iload_1         
		//*  17   28:icmpne          34
					return radartrackingoffline;
		//   18   31:aload           5
		//   19   33:areturn         
			}

		//   20   34:iload_2         
		//   21   35:iconst_1        
		//   22   36:iadd            
		//   23   37:istore_2        
		//*  24   38:goto            11
			return RadarTrackingOffline.REPLAY_STOPPED;
		//   25   41:getstatic       #47  <Field Radar$RadarTrackingOffline Radar$RadarTrackingOffline.REPLAY_STOPPED>
		//   26   44:areturn         
		}

		private RadarTrackingOffline.Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
		//    2    4:return          
		}

		public RadarTrackingOffline.Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Radar$RadarTrackingOffline$Companion()>
		//    2    4:return          
		}
	}

	public static final class RadarTrackingPriority extends Enum
	{

		public static RadarTrackingPriority valueOf(String s)
		{
			return (RadarTrackingPriority)Enum.valueOf(io/radar/sdk/Radar$RadarTrackingPriority, s);
		//    0    0:ldc1            #2   <Class Radar$RadarTrackingPriority>
		//    1    2:aload_0         
		//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Radar$RadarTrackingPriority>
		//    4    9:areturn         
		}

		public static RadarTrackingPriority[] values()
		{
			return (RadarTrackingPriority[])((RadarTrackingPriority []) ($VALUES)).clone();
		//    0    0:getstatic       #40  <Field Radar$RadarTrackingPriority[] $VALUES>
		//    1    3:invokevirtual   #55  <Method Object _5B_Lio.radar.sdk.Radar$RadarTrackingPriority_3B_.clone()>
		//    2    6:checkcast       #51  <Class Radar$RadarTrackingPriority[]>
		//    3    9:areturn         
		}

		private static final RadarTrackingPriority $VALUES[];
		public static final RadarTrackingPriority EFFICIENCY;
		public static final RadarTrackingPriority RESPONSIVENESS;

		static 
		{
			RadarTrackingPriority radartrackingpriority = new RadarTrackingPriority("RESPONSIVENESS", 0);
		//    0    0:new             #2   <Class Radar$RadarTrackingPriority>
		//    1    3:dup             
		//    2    4:ldc1            #30  <String "RESPONSIVENESS">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #33  <Method void Radar$RadarTrackingPriority(String, int)>
		//    5   10:astore_0        
			RESPONSIVENESS = radartrackingpriority;
		//    6   11:aload_0         
		//    7   12:putstatic       #35  <Field Radar$RadarTrackingPriority RESPONSIVENESS>
			RadarTrackingPriority radartrackingpriority1 = new RadarTrackingPriority("EFFICIENCY", 1);
		//    8   15:new             #2   <Class Radar$RadarTrackingPriority>
		//    9   18:dup             
		//   10   19:ldc1            #36  <String "EFFICIENCY">
		//   11   21:iconst_1        
		//   12   22:invokespecial   #33  <Method void Radar$RadarTrackingPriority(String, int)>
		//   13   25:astore_1        
			EFFICIENCY = radartrackingpriority1;
		//   14   26:aload_1         
		//   15   27:putstatic       #38  <Field Radar$RadarTrackingPriority EFFICIENCY>
			$VALUES = (new RadarTrackingPriority[] {
				radartrackingpriority, radartrackingpriority1
			});
		//   16   30:iconst_2        
		//   17   31:anewarray       RadarTrackingPriority[]
		//   18   34:dup             
		//   19   35:iconst_0        
		//   20   36:aload_0         
		//   21   37:aastore         
		//   22   38:dup             
		//   23   39:iconst_1        
		//   24   40:aload_1         
		//   25   41:aastore         
		//   26   42:putstatic       #40  <Field Radar$RadarTrackingPriority[] $VALUES>
		//*  27   45:return          
		}

		protected RadarTrackingPriority(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class RadarTrackingSync extends Enum
	{

		public static RadarTrackingSync valueOf(String s)
		{
			return (RadarTrackingSync)Enum.valueOf(io/radar/sdk/Radar$RadarTrackingSync, s);
		//    0    0:ldc1            #2   <Class Radar$RadarTrackingSync>
		//    1    2:aload_0         
		//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Radar$RadarTrackingSync>
		//    4    9:areturn         
		}

		public static RadarTrackingSync[] values()
		{
			return (RadarTrackingSync[])((RadarTrackingSync []) ($VALUES)).clone();
		//    0    0:getstatic       #48  <Field Radar$RadarTrackingSync[] $VALUES>
		//    1    3:invokevirtual   #73  <Method Object _5B_Lio.radar.sdk.Radar$RadarTrackingSync_3B_.clone()>
		//    2    6:checkcast       #69  <Class Radar$RadarTrackingSync[]>
		//    3    9:areturn         
		}

		public final int getMode$sdk_release()
		{
			return mode;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field int mode>
		//    2    4:ireturn         
		}

		private static final RadarTrackingSync $VALUES[];
		public static final RadarTrackingSync ALL;
		public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
		public static final RadarTrackingSync POSSIBLE_STATE_CHANGES;
		private final int mode;

		static 
		{
			RadarTrackingSync radartrackingsync = new RadarTrackingSync("POSSIBLE_STATE_CHANGES", 0, 1);
		//    0    0:new             #2   <Class Radar$RadarTrackingSync>
		//    1    3:dup             
		//    2    4:ldc1            #38  <String "POSSIBLE_STATE_CHANGES">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #41  <Method void Radar$RadarTrackingSync(String, int, int)>
		//    6   11:astore_0        
			POSSIBLE_STATE_CHANGES = radartrackingsync;
		//    7   12:aload_0         
		//    8   13:putstatic       #43  <Field Radar$RadarTrackingSync POSSIBLE_STATE_CHANGES>
			RadarTrackingSync radartrackingsync1 = new RadarTrackingSync("ALL", 1, -1);
		//    9   16:new             #2   <Class Radar$RadarTrackingSync>
		//   10   19:dup             
		//   11   20:ldc1            #44  <String "ALL">
		//   12   22:iconst_1        
		//   13   23:iconst_m1       
		//   14   24:invokespecial   #41  <Method void Radar$RadarTrackingSync(String, int, int)>
		//   15   27:astore_1        
			ALL = radartrackingsync1;
		//   16   28:aload_1         
		//   17   29:putstatic       #46  <Field Radar$RadarTrackingSync ALL>
			$VALUES = (new RadarTrackingSync[] {
				radartrackingsync, radartrackingsync1
			});
		//   18   32:iconst_2        
		//   19   33:anewarray       RadarTrackingSync[]
		//   20   36:dup             
		//   21   37:iconst_0        
		//   22   38:aload_0         
		//   23   39:aastore         
		//   24   40:dup             
		//   25   41:iconst_1        
		//   26   42:aload_1         
		//   27   43:aastore         
		//   28   44:putstatic       #48  <Field Radar$RadarTrackingSync[] $VALUES>
		//   29   47:new             #10  <Class Radar$RadarTrackingSync$Companion>
		//   30   50:dup             
		//   31   51:aconst_null     
		//   32   52:invokespecial   #51  <Method void Radar$RadarTrackingSync$Companion(DefaultConstructorMarker)>
		//   33   55:putstatic       #53  <Field Radar$RadarTrackingSync$Companion Companion>
		//*  34   58:return          
		}

		protected RadarTrackingSync(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #57  <Method void Enum(String, int)>
			mode = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #59  <Field int mode>
		//    7   11:return          
		}
	}

	public static final class RadarTrackingSync.Companion
	{

		public final RadarTrackingSync fromInt(int i)
		{
			RadarTrackingSync aradartrackingsync[] = RadarTrackingSync.values();
		//    0    0:invokestatic    #40  <Method Radar$RadarTrackingSync[] Radar$RadarTrackingSync.values()>
		//    1    3:astore          4
			int k = aradartrackingsync.length;
		//    2    5:aload           4
		//    3    7:arraylength     
		//    4    8:istore_3        
			for(int j = 0; j < k; j++)
		//*   5    9:iconst_0        
		//*   6   10:istore_2        
		//*   7   11:iload_2         
		//*   8   12:iload_3         
		//*   9   13:icmpge          41
			{
				RadarTrackingSync radartrackingsync = aradartrackingsync[j];
		//   10   16:aload           4
		//   11   18:iload_2         
		//   12   19:aaload          
		//   13   20:astore          5
				if(radartrackingsync.sdk_release() == i)
		//*  14   22:aload           5
		//*  15   24:invokevirtual   #44  <Method int Radar$RadarTrackingSync.getMode$sdk_release()>
		//*  16   27:iload_1         
		//*  17   28:icmpne          34
					return radartrackingsync;
		//   18   31:aload           5
		//   19   33:areturn         
			}

		//   20   34:iload_2         
		//   21   35:iconst_1        
		//   22   36:iadd            
		//   23   37:istore_2        
		//*  24   38:goto            11
			return RadarTrackingSync.POSSIBLE_STATE_CHANGES;
		//   25   41:getstatic       #47  <Field Radar$RadarTrackingSync Radar$RadarTrackingSync.POSSIBLE_STATE_CHANGES>
		//   26   44:areturn         
		}

		private RadarTrackingSync.Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
		//    2    4:return          
		}

		public RadarTrackingSync.Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Radar$RadarTrackingSync$Companion()>
		//    2    4:return          
		}
	}


	private Radar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method void Object()>
	//    2    4:return          
	}

	public static final void acceptEvent(String s)
	{
		acceptEvent$default(s, ((String) (null)), 2, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_2        
	//    3    3:aconst_null     
	//    4    4:invokestatic    #211 <Method void acceptEvent$default(String, String, int, Object)>
	//    5    7:return          
	}

	public static final void acceptEvent(String s, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "eventId");
	//    0    0:aload_0         
	//    1    1:ldc1            #217 <String "eventId">
	//    2    3:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!INSTANCE.getSdkInitialized())
	//*   3    6:getstatic       #189 <Field Radar INSTANCE>
	//*   4    9:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   5   12:ifne            16
			return;
	//    6   15:return          
		ApiClient apiclient = apiClient;
	//    7   16:getstatic       #227 <Field ApiClient apiClient>
	//    8   19:astore_2        
		if(apiclient == null)
	//*   9   20:aload_2         
	//*  10   21:ifnonnull       29
			Intrinsics.throwUninitializedPropertyAccessException("apiClient");
	//   11   24:ldc1            #228 <String "apiClient">
	//   12   26:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		apiclient.verifyEvent$sdk_release(s, io.radar.sdk.model.RadarEvent.RadarEventVerification.ACCEPT, s1);
	//   13   29:aload_2         
	//   14   30:aload_0         
	//   15   31:getstatic       #237 <Field io.radar.sdk.model.RadarEvent$RadarEventVerification io.radar.sdk.model.RadarEvent$RadarEventVerification.ACCEPT>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #243 <Method void ApiClient.verifyEvent$sdk_release(String, io.radar.sdk.model.RadarEvent$RadarEventVerification, String)>
	//   18   38:return          
	}

	public static void acceptEvent$default(String s, String s1, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			s1 = (String)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #245 <Class String>
	//    6   10:astore_1        
		acceptEvent(s, s1);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #247 <Method void acceptEvent(String, String)>
	//   10   16:return          
	}

	private final void broadcastError(RadarStatus radarstatus)
	{
		radarstatus = ((RadarStatus) (RadarReceiver.Companion.createErrorIntent$sdk_release(radarstatus)));
	//    0    0:getstatic       #296 <Field RadarReceiver$Companion RadarReceiver.Companion>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #302 <Method Intent RadarReceiver$Companion.createErrorIntent$sdk_release(Radar$RadarStatus)>
	//    3    7:astore_1        
		Object obj = ((Object) (context));
	//    4    8:getstatic       #258 <Field Context context>
	//    5   11:astore_2        
		if(obj == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       22
			Intrinsics.throwUninitializedPropertyAccessException("context");
	//    8   16:ldc2            #259 <String "context">
	//    9   19:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		LocalBroadcastManager.getInstance(((Context) (obj))).sendBroadcast(((Intent) (radarstatus)));
	//   10   22:aload_2         
	//   11   23:invokestatic    #308 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #312 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   14   30:pop             
		obj = ((Object) (context));
	//   15   31:getstatic       #258 <Field Context context>
	//   16   34:astore_2        
		if(obj == null)
	//*  17   35:aload_2         
	//*  18   36:ifnonnull       45
			Intrinsics.throwUninitializedPropertyAccessException("context");
	//   19   39:ldc2            #259 <String "context">
	//   20   42:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		obj = ((Object) (((Context) (obj)).getPackageManager().queryBroadcastReceivers(((Intent) (radarstatus)), 0)));
	//   21   45:aload_2         
	//   22   46:invokevirtual   #318 <Method PackageManager Context.getPackageManager()>
	//   23   49:aload_1         
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #324 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//   26   54:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(obj, "matches");
	//   27   55:aload_2         
	//   28   56:ldc2            #326 <String "matches">
	//   29   59:invokestatic    #329 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		obj = ((Object) (((Iterable)obj).iterator()));
	//   30   62:aload_2         
	//   31   63:checkcast       #331 <Class Iterable>
	//   32   66:invokeinterface #335 <Method Iterator Iterable.iterator()>
	//   33   71:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   34   72:aload_2         
	//   35   73:invokeinterface #340 <Method boolean Iterator.hasNext()>
	//   36   78:ifeq            192
			Object obj1 = ((Object) ((ResolveInfo)((Iterator) (obj)).next()));
	//   37   81:aload_2         
	//   38   82:invokeinterface #344 <Method Object Iterator.next()>
	//   39   87:checkcast       #346 <Class ResolveInfo>
	//   40   90:astore          4
			Intent intent = new Intent(((Intent) (radarstatus)));
	//   41   92:new             #348 <Class Intent>
	//   42   95:dup             
	//   43   96:aload_1         
	//   44   97:invokespecial   #351 <Method void Intent(Intent)>
	//   45  100:astore_3        
			Context context1 = context;
	//   46  101:getstatic       #258 <Field Context context>
	//   47  104:astore          5
			if(context1 == null)
	//*  48  106:aload           5
	//*  49  108:ifnonnull       117
				Intrinsics.throwUninitializedPropertyAccessException("context");
	//   50  111:ldc2            #259 <String "context">
	//   51  114:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			if(Intrinsics.areEqual(((Object) (context1.getPackageName())), ((Object) (((ResolveInfo) (obj1)).activityInfo.packageName))))
	//*  52  117:aload           5
	//*  53  119:invokevirtual   #354 <Method String Context.getPackageName()>
	//*  54  122:aload           4
	//*  55  124:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  56  127:getfield        #364 <Field String ActivityInfo.packageName>
	//*  57  130:invokestatic    #368 <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  58  133:ifeq            72
			{
				intent.setComponent(new ComponentName(((ResolveInfo) (obj1)).activityInfo.applicationInfo.packageName, ((ResolveInfo) (obj1)).activityInfo.name));
	//   59  136:aload_3         
	//   60  137:new             #370 <Class ComponentName>
	//   61  140:dup             
	//   62  141:aload           4
	//   63  143:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   64  146:getfield        #374 <Field ApplicationInfo ActivityInfo.applicationInfo>
	//   65  149:getfield        #377 <Field String ApplicationInfo.packageName>
	//   66  152:aload           4
	//   67  154:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   68  157:getfield        #379 <Field String ActivityInfo.name>
	//   69  160:invokespecial   #381 <Method void ComponentName(String, String)>
	//   70  163:invokevirtual   #385 <Method Intent Intent.setComponent(ComponentName)>
	//   71  166:pop             
				obj1 = ((Object) (context));
	//   72  167:getstatic       #258 <Field Context context>
	//   73  170:astore          4
				if(obj1 == null)
	//*  74  172:aload           4
	//*  75  174:ifnonnull       183
					Intrinsics.throwUninitializedPropertyAccessException("context");
	//   76  177:ldc2            #259 <String "context">
	//   77  180:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
				((Context) (obj1)).sendBroadcast(intent);
	//   78  183:aload           4
	//   79  185:aload_3         
	//   80  186:invokevirtual   #387 <Method void Context.sendBroadcast(Intent)>
			}
		} while(true);
	//   81  189:goto            72
	//   82  192:return          
	}

	public static void description$annotations()
	{
	//    0    0:return          
	}

	private final void forceTrack(Location location, RadarCallback radarcallback)
	{
		PermissionsHelper permissionshelper = PermissionsHelper.INSTANCE;
	//    0    0:getstatic       #393 <Field PermissionsHelper PermissionsHelper.INSTANCE>
	//    1    3:astore_3        
		Context context1 = context;
	//    2    4:getstatic       #258 <Field Context context>
	//    3    7:astore          4
		if(context1 == null)
	//*   4    9:aload           4
	//*   5   11:ifnonnull       20
			Intrinsics.throwUninitializedPropertyAccessException("context");
	//    6   14:ldc2            #259 <String "context">
	//    7   17:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		if(permissionshelper.check(context1))
	//*   8   20:aload_3         
	//*   9   21:aload           4
	//*  10   23:invokevirtual   #397 <Method boolean PermissionsHelper.check(Context)>
	//*  11   26:ifeq            149
		{
			Object obj = ((Object) (DeviceHelper.INSTANCE));
	//   12   29:getstatic       #402 <Field DeviceHelper DeviceHelper.INSTANCE>
	//   13   32:astore_3        
			Context context2 = context;
	//   14   33:getstatic       #258 <Field Context context>
	//   15   36:astore          4
			if(context2 == null)
	//*  16   38:aload           4
	//*  17   40:ifnonnull       49
				Intrinsics.throwUninitializedPropertyAccessException("context");
	//   18   43:ldc2            #259 <String "context">
	//   19   46:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			if(!((DeviceHelper) (obj)).isLocationOn$sdk_release(context2))
	//*  20   49:aload_3         
	//*  21   50:aload           4
	//*  22   52:invokevirtual   #405 <Method boolean DeviceHelper.isLocationOn$sdk_release(Context)>
	//*  23   55:ifne            83
			{
				if(radarcallback != null)
	//*  24   58:aload_2         
	//*  25   59:ifnull          75
					RadarCallback.DefaultImpls.onComplete._mthdefault(radarcallback, RadarStatus.ERROR_LOCATION, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)), 14, ((Object) (null)));
	//   26   62:aload_2         
	//   27   63:getstatic       #408 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_LOCATION>
	//   28   66:aconst_null     
	//   29   67:aconst_null     
	//   30   68:aconst_null     
	//   31   69:bipush          14
	//   32   71:aconst_null     
	//   33   72:invokestatic    #412 <Method void Radar$RadarCallback$DefaultImpls.onComplete$default(Radar$RadarCallback, Radar$RadarStatus, Location, RadarEvent[], RadarUser, int, Object)>
				broadcastError(RadarStatus.ERROR_LOCATION);
	//   34   75:aload_0         
	//   35   76:getstatic       #408 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_LOCATION>
	//   36   79:invokespecial   #252 <Method void broadcastError(Radar$RadarStatus)>
				return;
	//   37   82:return          
			}
			obj = ((Object) (apiClient));
	//   38   83:getstatic       #227 <Field ApiClient apiClient>
	//   39   86:astore_3        
			if(obj == null)
	//*  40   87:aload_3         
	//*  41   88:ifnonnull       96
				Intrinsics.throwUninitializedPropertyAccessException("apiClient");
	//   42   91:ldc1            #228 <String "apiClient">
	//   43   93:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			((ApiClient) (obj)).setSendNextState$sdk_release(true);
	//   44   96:aload_3         
	//   45   97:iconst_1        
	//   46   98:invokevirtual   #415 <Method void ApiClient.setSendNextState$sdk_release(boolean)>
			if(radarcallback != null)
	//*  47  101:aload_2         
	//*  48  102:ifnull          123
			{
				ApiClient apiclient = apiClient;
	//   49  105:getstatic       #227 <Field ApiClient apiClient>
	//   50  108:astore_3        
				if(apiclient == null)
	//*  51  109:aload_3         
	//*  52  110:ifnonnull       118
					Intrinsics.throwUninitializedPropertyAccessException("apiClient");
	//   53  113:ldc1            #228 <String "apiClient">
	//   54  115:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
				apiclient.addCallback$sdk_release(radarcallback);
	//   55  118:aload_3         
	//   56  119:aload_2         
	//   57  120:invokevirtual   #419 <Method void ApiClient.addCallback$sdk_release(Radar$RadarCallback)>
			}
			if(location != null)
	//*  58  123:aload_1         
	//*  59  124:ifnull          133
			{
				handleLocation$sdk_release(location);
	//   60  127:aload_0         
	//   61  128:aload_1         
	//   62  129:invokevirtual   #422 <Method void handleLocation$sdk_release(Location)>
				return;
	//   63  132:return          
			} else
			{
				getLocation((Function1)new Function1(radarcallback) {

					public volatile Object invoke(Object obj1)
					{
						invoke((Location)obj1);
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #41  <Class Location>
					//    3    5:invokevirtual   #44  <Method void invoke(Location)>
						return ((Object) (Unit.INSTANCE));
					//    4    8:getstatic       #50  <Field Unit Unit.INSTANCE>
					//    5   11:areturn         
					}

					public final void invoke(Location location1)
					{
						if(location1 != null)
					//*   0    0:aload_1         
					//*   1    1:ifnull          12
						{
							Radar.INSTANCE.handleLocation$sdk_release(location1);
					//    2    4:getstatic       #54  <Field Radar Radar.INSTANCE>
					//    3    7:aload_1         
					//    4    8:invokevirtual   #57  <Method void Radar.handleLocation$sdk_release(Location)>
							return;
					//    5   11:return          
						}
						location1 = ((Location) ($callback));
					//    6   12:aload_0         
					//    7   13:getfield        #34  <Field Radar$RadarCallback $callback>
					//    8   16:astore_1        
						if(location1 != null)
					//*   9   17:aload_1         
					//*  10   18:ifnull          34
							RadarCallback.DefaultImpls.onComplete._mthdefault(((RadarCallback) (location1)), RadarStatus.ERROR_LOCATION, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)), 14, ((Object) (null)));
					//   11   21:aload_1         
					//   12   22:getstatic       #63  <Field Radar$RadarStatus Radar$RadarStatus.ERROR_LOCATION>
					//   13   25:aconst_null     
					//   14   26:aconst_null     
					//   15   27:aconst_null     
					//   16   28:bipush          14
					//   17   30:aconst_null     
					//   18   31:invokestatic    #69  <Method void Radar$RadarCallback$DefaultImpls.onComplete$default(Radar$RadarCallback, Radar$RadarStatus, Location, RadarEvent[], RadarUser, int, Object)>
						Radar.INSTANCE.broadcastError(RadarStatus.ERROR_LOCATION);
					//   19   34:getstatic       #54  <Field Radar Radar.INSTANCE>
					//   20   37:getstatic       #63  <Field Radar$RadarStatus Radar$RadarStatus.ERROR_LOCATION>
					//   21   40:invokestatic    #73  <Method void Radar.access$broadcastError(Radar, Radar$RadarStatus)>
					//   22   43:return          
					}

					final RadarCallback $callback;

			
			{
				$callback = radarcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field Radar$RadarCallback $callback>
				super(1);
			//    3    5:aload_0         
			//    4    6:iconst_1        
			//    5    7:invokespecial   #37  <Method void Lambda(int)>
			//    6   10:return          
			}
				}
);
	//   64  133:aload_0         
	//   65  134:new             #35  <Class Radar$forceTrack$2>
	//   66  137:dup             
	//   67  138:aload_2         
	//   68  139:invokespecial   #424 <Method void Radar$forceTrack$2(Radar$RadarCallback)>
	//   69  142:checkcast       #426 <Class Function1>
	//   70  145:invokespecial   #429 <Method void getLocation(Function1)>
				return;
	//   71  148:return          
			}
		}
		if(radarcallback != null)
	//*  72  149:aload_2         
	//*  73  150:ifnull          166
			RadarCallback.DefaultImpls.onComplete._mthdefault(radarcallback, RadarStatus.ERROR_PERMISSIONS, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)), 14, ((Object) (null)));
	//   74  153:aload_2         
	//   75  154:getstatic       #432 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PERMISSIONS>
	//   76  157:aconst_null     
	//   77  158:aconst_null     
	//   78  159:aconst_null     
	//   79  160:bipush          14
	//   80  162:aconst_null     
	//   81  163:invokestatic    #412 <Method void Radar$RadarCallback$DefaultImpls.onComplete$default(Radar$RadarCallback, Radar$RadarStatus, Location, RadarEvent[], RadarUser, int, Object)>
		broadcastError(RadarStatus.ERROR_PERMISSIONS);
	//   82  166:aload_0         
	//   83  167:getstatic       #432 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PERMISSIONS>
	//   84  170:invokespecial   #252 <Method void broadcastError(Radar$RadarStatus)>
	//   85  173:return          
	}

	static void forceTrack$default(Radar radar, Location location, RadarCallback radarcallback, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			location = (Location)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #436 <Class Location>
	//    6   10:astore_1        
		if((i & 2) != 0)
	//*   7   11:iload_3         
	//*   8   12:iconst_2        
	//*   9   13:iand            
	//*  10   14:ifeq            22
			radarcallback = (RadarCallback)null;
	//   11   17:aconst_null     
	//   12   18:checkcast       #6   <Class Radar$RadarCallback>
	//   13   21:astore_2        
		radar.forceTrack(location, radarcallback);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:aload_2         
	//   17   25:invokespecial   #438 <Method void forceTrack(Location, Radar$RadarCallback)>
	//   18   28:return          
	}

	private final boolean getDebug()
	{
		OptionsRepository optionsrepository = optionsRepository;
	//    0    0:getstatic       #273 <Field OptionsRepository optionsRepository>
	//    1    3:astore_1        
		if(optionsrepository == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//    4    8:ldc2            #274 <String "optionsRepository">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		return optionsrepository.getDebug$sdk_release();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #443 <Method boolean OptionsRepository.getDebug$sdk_release()>
	//    8   18:ireturn         
	}

	public static final String getDescription()
	{
		if(INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifeq            19
			return INSTANCE.getUserOptions().getDescription();
	//    3    9:getstatic       #189 <Field Radar INSTANCE>
	//    4   12:invokespecial   #445 <Method Radar$UserOptions getUserOptions()>
	//    5   15:invokevirtual   #447 <Method String Radar$UserOptions.getDescription()>
	//    6   18:areturn         
		else
			return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
	}

	private final void getLocation(Function1 function1)
	{
		LocationManager locationmanager = locationManager;
	//    0    0:getstatic       #268 <Field LocationManager locationManager>
	//    1    3:astore_2        
		if(locationmanager == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("locationManager");
	//    4    8:ldc2            #269 <String "locationManager">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		locationmanager.getLocation$sdk_release(function1);
	//    6   14:aload_2         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #452 <Method void LocationManager.getLocation$sdk_release(Function1)>
	//    9   19:return          
	}

	public static final JSONObject getMetadata()
	{
		if(INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifeq            19
			return INSTANCE.getUserOptions().getMetadata();
	//    3    9:getstatic       #189 <Field Radar INSTANCE>
	//    4   12:invokespecial   #445 <Method Radar$UserOptions getUserOptions()>
	//    5   15:invokevirtual   #456 <Method JSONObject Radar$UserOptions.getMetadata()>
	//    6   18:areturn         
		else
			return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
	}

	public static final RadarPlacesProvider getPlacesProvider()
	{
		if(INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifeq            28
		{
			OptionsRepository optionsrepository = optionsRepository;
	//    3    9:getstatic       #273 <Field OptionsRepository optionsRepository>
	//    4   12:astore_0        
			if(optionsrepository == null)
	//*   5   13:aload_0         
	//*   6   14:ifnonnull       23
				Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//    7   17:ldc2            #274 <String "optionsRepository">
	//    8   20:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			return optionsrepository.getPlacesProvider$sdk_release();
	//    9   23:aload_0         
	//   10   24:invokevirtual   #459 <Method Radar$RadarPlacesProvider OptionsRepository.getPlacesProvider$sdk_release()>
	//   11   27:areturn         
		} else
		{
			return RadarPlacesProvider.NONE;
	//   12   28:getstatic       #462 <Field Radar$RadarPlacesProvider Radar$RadarPlacesProvider.NONE>
	//   13   31:areturn         
		}
	}

	private final boolean getSdkInitialized()
	{
		return context != null && optionsRepository != null && identityRepository != null && stateManager != null && locationManager != null && apiClient != null;
	//    0    0:getstatic       #258 <Field Context context>
	//    1    3:ifnull          38
	//    2    6:getstatic       #273 <Field OptionsRepository optionsRepository>
	//    3    9:ifnull          38
	//    4   12:getstatic       #263 <Field IdentityRepository identityRepository>
	//    5   15:ifnull          38
	//    6   18:getstatic       #278 <Field StateManager stateManager>
	//    7   21:ifnull          38
	//    8   24:getstatic       #268 <Field LocationManager locationManager>
	//    9   27:ifnull          38
	//   10   30:getstatic       #227 <Field ApiClient apiClient>
	//   11   33:ifnull          38
	//   12   36:iconst_1        
	//   13   37:ireturn         
	//   14   38:iconst_0        
	//   15   39:ireturn         
	}

	public static final String getUserId()
	{
		if(INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifeq            19
			return INSTANCE.getUserOptions().getUserId();
	//    3    9:getstatic       #189 <Field Radar INSTANCE>
	//    4   12:invokespecial   #445 <Method Radar$UserOptions getUserOptions()>
	//    5   15:invokevirtual   #464 <Method String Radar$UserOptions.getUserId()>
	//    6   18:areturn         
		else
			return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
	}

	private final UserOptions getUserOptions()
	{
		Lazy lazy = userOptions$delegate;
	//    0    0:getstatic       #202 <Field Lazy userOptions$delegate>
	//    1    3:astore_1        
		KProperty kproperty = $$delegatedProperties[0];
	//    2    4:getstatic       #185 <Field KProperty[] $$delegatedProperties>
	//    3    7:iconst_0        
	//    4    8:aaload          
	//    5    9:astore_2        
		return (UserOptions)lazy.getValue();
	//    6   10:aload_1         
	//    7   11:invokeinterface #469 <Method Object Lazy.getValue()>
	//    8   16:checkcast       #32  <Class Radar$UserOptions>
	//    9   19:areturn         
	}

	public static final void initialize()
	{
		initialize$default(((String) (null)), 1, ((Object) (null)));
	//    0    0:aconst_null     
	//    1    1:iconst_1        
	//    2    2:aconst_null     
	//    3    3:invokestatic    #473 <Method void initialize$default(String, int, Object)>
	//    4    6:return          
	}

	public static final void initialize(String s)
	{
		if(!INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifne            10
		{
			return;
	//    3    9:return          
		} else
		{
			INSTANCE.setPublishableKey$sdk_release(s);
	//    4   10:getstatic       #189 <Field Radar INSTANCE>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #475 <Method void setPublishableKey$sdk_release(String)>
			return;
	//    7   17:return          
		}
	}

	public static void initialize$default(String s, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			s = (String)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #245 <Class String>
	//    6   10:astore_0        
		initialize(s);
	//    7   11:aload_0         
	//    8   12:invokestatic    #477 <Method void initialize(String)>
	//    9   15:return          
	}

	public static final boolean isTracking()
	{
		if(INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifeq            28
		{
			OptionsRepository optionsrepository = optionsRepository;
	//    3    9:getstatic       #273 <Field OptionsRepository optionsRepository>
	//    4   12:astore_0        
			if(optionsrepository == null)
	//*   5   13:aload_0         
	//*   6   14:ifnonnull       23
				Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//    7   17:ldc2            #274 <String "optionsRepository">
	//    8   20:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			return optionsrepository.getBackgroundTracking$sdk_release();
	//    9   23:aload_0         
	//   10   24:invokevirtual   #480 <Method boolean OptionsRepository.getBackgroundTracking$sdk_release()>
	//   11   27:ireturn         
		} else
		{
			return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
		}
	}

	public static void metadata$annotations()
	{
	//    0    0:return          
	}

	public static void placesProvider$annotations()
	{
	//    0    0:return          
	}

	public static final void rejectEvent(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "eventId");
	//    0    0:aload_0         
	//    1    1:ldc1            #217 <String "eventId">
	//    2    3:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!INSTANCE.getSdkInitialized())
	//*   3    6:getstatic       #189 <Field Radar INSTANCE>
	//*   4    9:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   5   12:ifne            16
			return;
	//    6   15:return          
		ApiClient apiclient = apiClient;
	//    7   16:getstatic       #227 <Field ApiClient apiClient>
	//    8   19:astore_1        
		if(apiclient == null)
	//*   9   20:aload_1         
	//*  10   21:ifnonnull       29
			Intrinsics.throwUninitializedPropertyAccessException("apiClient");
	//   11   24:ldc1            #228 <String "apiClient">
	//   12   26:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		ApiClient.verifyEvent$sdk_release$default(apiclient, s, io.radar.sdk.model.RadarEvent.RadarEventVerification.REJECT, ((String) (null)), 4, ((Object) (null)));
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getstatic       #483 <Field io.radar.sdk.model.RadarEvent$RadarEventVerification io.radar.sdk.model.RadarEvent$RadarEventVerification.REJECT>
	//   16   34:aconst_null     
	//   17   35:iconst_4        
	//   18   36:aconst_null     
	//   19   37:invokestatic    #487 <Method void ApiClient.verifyEvent$sdk_release$default(ApiClient, String, io.radar.sdk.model.RadarEvent$RadarEventVerification, String, int, Object)>
	//   20   40:return          
	}

	public static void requestLocation$sdk_release$default(Radar radar, boolean flag, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		radar.requestLocation$sdk_release(flag);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:invokevirtual   #491 <Method void requestLocation$sdk_release(boolean)>
	//    9   13:return          
	}

	private final void setDebug(boolean flag)
	{
		RadarLogger.INSTANCE.setDEBUG(flag);
	//    0    0:getstatic       #496 <Field RadarLogger RadarLogger.INSTANCE>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #499 <Method void RadarLogger.setDEBUG(boolean)>
		OptionsRepository optionsrepository = optionsRepository;
	//    3    7:getstatic       #273 <Field OptionsRepository optionsRepository>
	//    4   10:astore_2        
		if(optionsrepository == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       21
			Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//    7   15:ldc2            #274 <String "optionsRepository">
	//    8   18:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		optionsrepository.setDebug$sdk_release(flag);
	//    9   21:aload_2         
	//   10   22:iload_1         
	//   11   23:invokevirtual   #502 <Method void OptionsRepository.setDebug$sdk_release(boolean)>
	//   12   26:return          
	}

	public static final void setDescription(String s)
	{
		if(INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifeq            19
			INSTANCE.getUserOptions().setDescription(s);
	//    3    9:getstatic       #189 <Field Radar INSTANCE>
	//    4   12:invokespecial   #445 <Method Radar$UserOptions getUserOptions()>
	//    5   15:aload_0         
	//    6   16:invokevirtual   #504 <Method void Radar$UserOptions.setDescription(String)>
	//    7   19:return          
	}

	public static final void setMetadata(JSONObject jsonobject)
	{
		if(INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifeq            19
			INSTANCE.getUserOptions().setMetadata(jsonobject);
	//    3    9:getstatic       #189 <Field Radar INSTANCE>
	//    4   12:invokespecial   #445 <Method Radar$UserOptions getUserOptions()>
	//    5   15:aload_0         
	//    6   16:invokevirtual   #506 <Method void Radar$UserOptions.setMetadata(JSONObject)>
	//    7   19:return          
	}

	public static final void setPlacesProvider(RadarPlacesProvider radarplacesprovider)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarplacesprovider)), "value");
	//    0    0:aload_0         
	//    1    1:ldc2            #507 <String "value">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(INSTANCE.getSdkInitialized())
	//*   3    7:getstatic       #189 <Field Radar INSTANCE>
	//*   4   10:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   5   13:ifeq            35
		{
			OptionsRepository optionsrepository = optionsRepository;
	//    6   16:getstatic       #273 <Field OptionsRepository optionsRepository>
	//    7   19:astore_1        
			if(optionsrepository == null)
	//*   8   20:aload_1         
	//*   9   21:ifnonnull       30
				Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//   10   24:ldc2            #274 <String "optionsRepository">
	//   11   27:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			optionsrepository.setPlacesProvider$sdk_release(radarplacesprovider);
	//   12   30:aload_1         
	//   13   31:aload_0         
	//   14   32:invokevirtual   #510 <Method void OptionsRepository.setPlacesProvider$sdk_release(Radar$RadarPlacesProvider)>
		}
	//   15   35:return          
	}

	private final void setTrackingOptions(RadarTrackingOptions radartrackingoptions)
	{
		Object obj = ((Object) (radartrackingoptions.getPriority()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #517 <Method Radar$RadarTrackingPriority RadarTrackingOptions.getPriority()>
	//    2    4:astore          5
		switch(WhenMappings..EnumSwitchMapping._fld0[((RadarTrackingPriority) (obj)).ordinal()])
	//*   3    6:getstatic       #523 <Field int[] Radar$WhenMappings.$EnumSwitchMapping$0>
	//*   4    9:aload           5
	//*   5   11:invokevirtual   #527 <Method int Radar$RadarTrackingPriority.ordinal()>
	//*   6   14:iaload          
		{
	//*   7   15:tableswitch     1 2: default 36
	//	               1 65
	//	               2 44
		default:
			throw new NoWhenBranchMatchedException();
	//    8   36:new             #529 <Class NoWhenBranchMatchedException>
	//    9   39:dup             
	//   10   40:invokespecial   #530 <Method void NoWhenBranchMatchedException()>
	//   11   43:athrow          

		case 2: // '\002'
			obj = ((Object) (TuplesKt.to(((Object) (Long.valueOf(0xdbba0L))), ((Object) (Integer.valueOf((int)0xdbba0L))))));
	//   12   44:ldc2w           #531 <Long 0xdbba0L>
	//   13   47:invokestatic    #538 <Method Long Long.valueOf(long)>
	//   14   50:ldc2w           #531 <Long 0xdbba0L>
	//   15   53:l2i             
	//   16   54:invokestatic    #543 <Method Integer Integer.valueOf(int)>
	//   17   57:invokestatic    #549 <Method Pair TuplesKt.to(Object, Object)>
	//   18   60:astore          5
			break;

	//*  19   62:goto            82
		case 1: // '\001'
			obj = ((Object) (TuplesKt.to(((Object) (Long.valueOf(0x57e40L))), ((Object) (Integer.valueOf(0x249f0))))));
	//   20   65:ldc2w           #550 <Long 0x57e40L>
	//   21   68:invokestatic    #538 <Method Long Long.valueOf(long)>
	//   22   71:ldc2            #552 <Int 0x249f0>
	//   23   74:invokestatic    #543 <Method Integer Integer.valueOf(int)>
	//   24   77:invokestatic    #549 <Method Pair TuplesKt.to(Object, Object)>
	//   25   80:astore          5
			break;
		}
		long l = ((Number)((Pair) (obj)).component1()).longValue();
	//   26   82:aload           5
	//   27   84:invokevirtual   #557 <Method Object Pair.component1()>
	//   28   87:checkcast       #559 <Class Number>
	//   29   90:invokevirtual   #563 <Method long Number.longValue()>
	//   30   93:lstore_3        
		int i = ((Number)((Pair) (obj)).component2()).intValue();
	//   31   94:aload           5
	//   32   96:invokevirtual   #566 <Method Object Pair.component2()>
	//   33   99:checkcast       #559 <Class Number>
	//   34  102:invokevirtual   #569 <Method int Number.intValue()>
	//   35  105:istore_2        
		obj = ((Object) (optionsRepository));
	//   36  106:getstatic       #273 <Field OptionsRepository optionsRepository>
	//   37  109:astore          5
		if(obj == null)
	//*  38  111:aload           5
	//*  39  113:ifnonnull       122
			Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//   40  116:ldc2            #274 <String "optionsRepository">
	//   41  119:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((OptionsRepository) (obj)).setUpdateInterval$sdk_release(l);
	//   42  122:aload           5
	//   43  124:lload_3         
	//   44  125:invokevirtual   #573 <Method void OptionsRepository.setUpdateInterval$sdk_release(long)>
		obj = ((Object) (optionsRepository));
	//   45  128:getstatic       #273 <Field OptionsRepository optionsRepository>
	//   46  131:astore          5
		if(obj == null)
	//*  47  133:aload           5
	//*  48  135:ifnonnull       144
			Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//   49  138:ldc2            #274 <String "optionsRepository">
	//   50  141:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((OptionsRepository) (obj)).setDwellDelay$sdk_release(i);
	//   51  144:aload           5
	//   52  146:iload_2         
	//   53  147:invokevirtual   #577 <Method void OptionsRepository.setDwellDelay$sdk_release(int)>
		obj = ((Object) (optionsRepository));
	//   54  150:getstatic       #273 <Field OptionsRepository optionsRepository>
	//   55  153:astore          5
		if(obj == null)
	//*  56  155:aload           5
	//*  57  157:ifnonnull       166
			Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//   58  160:ldc2            #274 <String "optionsRepository">
	//   59  163:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((OptionsRepository) (obj)).setOfflineMode$sdk_release(radartrackingoptions.getOffline());
	//   60  166:aload           5
	//   61  168:aload_1         
	//   62  169:invokevirtual   #581 <Method Radar$RadarTrackingOffline RadarTrackingOptions.getOffline()>
	//   63  172:invokevirtual   #585 <Method void OptionsRepository.setOfflineMode$sdk_release(Radar$RadarTrackingOffline)>
		obj = ((Object) (optionsRepository));
	//   64  175:getstatic       #273 <Field OptionsRepository optionsRepository>
	//   65  178:astore          5
		if(obj == null)
	//*  66  180:aload           5
	//*  67  182:ifnonnull       191
			Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//   68  185:ldc2            #274 <String "optionsRepository">
	//   69  188:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((OptionsRepository) (obj)).setSyncMode$sdk_release(radartrackingoptions.getSync());
	//   70  191:aload           5
	//   71  193:aload_1         
	//   72  194:invokevirtual   #589 <Method Radar$RadarTrackingSync RadarTrackingOptions.getSync()>
	//   73  197:invokevirtual   #593 <Method void OptionsRepository.setSyncMode$sdk_release(Radar$RadarTrackingSync)>
	//   74  200:return          
	}

	public static final void setUserId(String s)
	{
		if(INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifeq            19
			INSTANCE.getUserOptions().setUserId(s);
	//    3    9:getstatic       #189 <Field Radar INSTANCE>
	//    4   12:invokespecial   #445 <Method Radar$UserOptions getUserOptions()>
	//    5   15:aload_0         
	//    6   16:invokevirtual   #595 <Method void Radar$UserOptions.setUserId(String)>
	//    7   19:return          
	}

	public static final void startTracking()
	{
		startTracking(RadarTrackingOptions.Companion.getDEFAULT());
	//    0    0:getstatic       #598 <Field RadarTrackingOptions$Companion RadarTrackingOptions.Companion>
	//    1    3:invokevirtual   #604 <Method RadarTrackingOptions RadarTrackingOptions$Companion.getDEFAULT()>
	//    2    6:invokestatic    #606 <Method void startTracking(RadarTrackingOptions)>
	//    3    9:return          
	}

	public static final void startTracking(RadarTrackingOptions radartrackingoptions)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radartrackingoptions)), "trackingOptions");
	//    0    0:aload_0         
	//    1    1:ldc2            #607 <String "trackingOptions">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!INSTANCE.getSdkInitialized())
	//*   3    7:getstatic       #189 <Field Radar INSTANCE>
	//*   4   10:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   5   13:ifne            17
			return;
	//    6   16:return          
		INSTANCE.setTrackingOptions(radartrackingoptions);
	//    7   17:getstatic       #189 <Field Radar INSTANCE>
	//    8   20:aload_0         
	//    9   21:invokespecial   #609 <Method void setTrackingOptions(RadarTrackingOptions)>
		if(INSTANCE.getPublishableKey$sdk_release() != null)
	//*  10   24:getstatic       #189 <Field Radar INSTANCE>
	//*  11   27:invokevirtual   #611 <Method String getPublishableKey$sdk_release()>
	//*  12   30:ifnull          142
		{
			radartrackingoptions = ((RadarTrackingOptions) (INSTANCE.getPublishableKey$sdk_release()));
	//   13   33:getstatic       #189 <Field Radar INSTANCE>
	//   14   36:invokevirtual   #611 <Method String getPublishableKey$sdk_release()>
	//   15   39:astore_0        
			if(radartrackingoptions == null || ((String) (radartrackingoptions)).length() != 0)
	//*  16   40:aload_0         
	//*  17   41:ifnull          54
	//*  18   44:aload_0         
	//*  19   45:invokevirtual   #614 <Method int String.length()>
	//*  20   48:ifne            54
	//*  21   51:goto            142
			{
				radartrackingoptions = ((RadarTrackingOptions) (PermissionsHelper.INSTANCE));
	//   22   54:getstatic       #393 <Field PermissionsHelper PermissionsHelper.INSTANCE>
	//   23   57:astore_0        
				Context context1 = context;
	//   24   58:getstatic       #258 <Field Context context>
	//   25   61:astore_2        
				if(context1 == null)
	//*  26   62:aload_2         
	//*  27   63:ifnonnull       72
					Intrinsics.throwUninitializedPropertyAccessException("context");
	//   28   66:ldc2            #259 <String "context">
	//   29   69:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
				if(!((PermissionsHelper) (radartrackingoptions)).check(context1))
	//*  30   72:aload_0         
	//*  31   73:aload_2         
	//*  32   74:invokevirtual   #397 <Method boolean PermissionsHelper.check(Context)>
	//*  33   77:ifne            90
				{
					INSTANCE.broadcastError(RadarStatus.ERROR_PERMISSIONS);
	//   34   80:getstatic       #189 <Field Radar INSTANCE>
	//   35   83:getstatic       #432 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PERMISSIONS>
	//   36   86:invokespecial   #252 <Method void broadcastError(Radar$RadarStatus)>
					return;
	//   37   89:return          
				}
				radartrackingoptions = ((RadarTrackingOptions) (optionsRepository));
	//   38   90:getstatic       #273 <Field OptionsRepository optionsRepository>
	//   39   93:astore_0        
				if(radartrackingoptions == null)
	//*  40   94:aload_0         
	//*  41   95:ifnonnull       104
					Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//   42   98:ldc2            #274 <String "optionsRepository">
	//   43  101:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
				boolean flag = ((OptionsRepository) (radartrackingoptions)).getBackgroundTracking$sdk_release();
	//   44  104:aload_0         
	//   45  105:invokevirtual   #480 <Method boolean OptionsRepository.getBackgroundTracking$sdk_release()>
	//   46  108:istore_1        
				radartrackingoptions = ((RadarTrackingOptions) (optionsRepository));
	//   47  109:getstatic       #273 <Field OptionsRepository optionsRepository>
	//   48  112:astore_0        
				if(radartrackingoptions == null)
	//*  49  113:aload_0         
	//*  50  114:ifnonnull       123
					Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//   51  117:ldc2            #274 <String "optionsRepository">
	//   52  120:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
				((OptionsRepository) (radartrackingoptions)).setBackgroundTracking$sdk_release(true);
	//   53  123:aload_0         
	//   54  124:iconst_1        
	//   55  125:invokevirtual   #617 <Method void OptionsRepository.setBackgroundTracking$sdk_release(boolean)>
				if(!flag)
	//*  56  128:iload_1         
	//*  57  129:ifne            141
					requestLocation$sdk_release$default(INSTANCE, false, 1, ((Object) (null)));
	//   58  132:getstatic       #189 <Field Radar INSTANCE>
	//   59  135:iconst_0        
	//   60  136:iconst_1        
	//   61  137:aconst_null     
	//   62  138:invokestatic    #619 <Method void requestLocation$sdk_release$default(Radar, boolean, int, Object)>
				return;
	//   63  141:return          
			}
		}
		INSTANCE.broadcastError(RadarStatus.ERROR_PUBLISHABLE_KEY);
	//   64  142:getstatic       #189 <Field Radar INSTANCE>
	//   65  145:getstatic       #622 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   66  148:invokespecial   #252 <Method void broadcastError(Radar$RadarStatus)>
	//   67  151:return          
	}

	public static final void stopTracking()
	{
		if(!INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifne            10
			return;
	//    3    9:return          
		PermissionsHelper permissionshelper = PermissionsHelper.INSTANCE;
	//    4   10:getstatic       #393 <Field PermissionsHelper PermissionsHelper.INSTANCE>
	//    5   13:astore_0        
		Context context1 = context;
	//    6   14:getstatic       #258 <Field Context context>
	//    7   17:astore_1        
		if(context1 == null)
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       28
			Intrinsics.throwUninitializedPropertyAccessException("context");
	//   10   22:ldc2            #259 <String "context">
	//   11   25:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		if(permissionshelper.check(context1))
	//*  12   28:aload_0         
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #397 <Method boolean PermissionsHelper.check(Context)>
	//*  15   33:ifeq            76
		{
			Object obj = ((Object) (optionsRepository));
	//   16   36:getstatic       #273 <Field OptionsRepository optionsRepository>
	//   17   39:astore_0        
			if(obj == null)
	//*  18   40:aload_0         
	//*  19   41:ifnonnull       50
				Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//   20   44:ldc2            #274 <String "optionsRepository">
	//   21   47:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			((OptionsRepository) (obj)).setBackgroundTracking$sdk_release(false);
	//   22   50:aload_0         
	//   23   51:iconst_0        
	//   24   52:invokevirtual   #617 <Method void OptionsRepository.setBackgroundTracking$sdk_release(boolean)>
			obj = ((Object) (locationManager));
	//   25   55:getstatic       #268 <Field LocationManager locationManager>
	//   26   58:astore_0        
			if(obj == null)
	//*  27   59:aload_0         
	//*  28   60:ifnonnull       69
				Intrinsics.throwUninitializedPropertyAccessException("locationManager");
	//   29   63:ldc2            #269 <String "locationManager">
	//   30   66:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			LocationManager.requestLocation$sdk_release$default(((LocationManager) (obj)), false, 1, ((Object) (null)));
	//   31   69:aload_0         
	//   32   70:iconst_0        
	//   33   71:iconst_1        
	//   34   72:aconst_null     
	//   35   73:invokestatic    #625 <Method void LocationManager.requestLocation$sdk_release$default(LocationManager, boolean, int, Object)>
		}
	//   36   76:return          
	}

	public static void track$sdk_release$default(Radar radar, Location location, RadarCallback radarcallback, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			location = (Location)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #436 <Class Location>
	//    6   10:astore_1        
		if((i & 2) != 0)
	//*   7   11:iload_3         
	//*   8   12:iconst_2        
	//*   9   13:iand            
	//*  10   14:ifeq            22
			radarcallback = (RadarCallback)null;
	//   11   17:aconst_null     
	//   12   18:checkcast       #6   <Class Radar$RadarCallback>
	//   13   21:astore_2        
		radar.track$sdk_release(location, radarcallback);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:aload_2         
	//   17   25:invokevirtual   #628 <Method void track$sdk_release(Location, Radar$RadarCallback)>
	//   18   28:return          
	}

	public static final void trackOnce(RadarCallback radarcallback)
	{
		if(!INSTANCE.getSdkInitialized())
	//*   0    0:getstatic       #189 <Field Radar INSTANCE>
	//*   1    3:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   2    6:ifne            26
		{
			if(radarcallback != null)
	//*   3    9:aload_0         
	//*   4   10:ifnull          25
				radarcallback.onComplete(RadarStatus.ERROR_UNKNOWN, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)));
	//    5   13:aload_0         
	//    6   14:getstatic       #631 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_UNKNOWN>
	//    7   17:aconst_null     
	//    8   18:aconst_null     
	//    9   19:aconst_null     
	//   10   20:invokeinterface #635 <Method void Radar$RadarCallback.onComplete(Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
			return;
	//   11   25:return          
		}
		if(INSTANCE.getPublishableKey$sdk_release() != null)
	//*  12   26:getstatic       #189 <Field Radar INSTANCE>
	//*  13   29:invokevirtual   #611 <Method String getPublishableKey$sdk_release()>
	//*  14   32:ifnull          119
		{
			String s = INSTANCE.getPublishableKey$sdk_release();
	//   15   35:getstatic       #189 <Field Radar INSTANCE>
	//   16   38:invokevirtual   #611 <Method String getPublishableKey$sdk_release()>
	//   17   41:astore_1        
			if(s == null || s.length() != 0)
	//*  18   42:aload_1         
	//*  19   43:ifnull          56
	//*  20   46:aload_1         
	//*  21   47:invokevirtual   #614 <Method int String.length()>
	//*  22   50:ifne            56
	//*  23   53:goto            119
			{
				PermissionsHelper permissionshelper = PermissionsHelper.INSTANCE;
	//   24   56:getstatic       #393 <Field PermissionsHelper PermissionsHelper.INSTANCE>
	//   25   59:astore_1        
				Context context1 = context;
	//   26   60:getstatic       #258 <Field Context context>
	//   27   63:astore_2        
				if(context1 == null)
	//*  28   64:aload_2         
	//*  29   65:ifnonnull       74
					Intrinsics.throwUninitializedPropertyAccessException("context");
	//   30   68:ldc2            #259 <String "context">
	//   31   71:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
				if(!permissionshelper.check(context1))
	//*  32   74:aload_1         
	//*  33   75:aload_2         
	//*  34   76:invokevirtual   #397 <Method boolean PermissionsHelper.check(Context)>
	//*  35   79:ifne            108
				{
					if(radarcallback != null)
	//*  36   82:aload_0         
	//*  37   83:ifnull          98
						radarcallback.onComplete(RadarStatus.ERROR_PERMISSIONS, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)));
	//   38   86:aload_0         
	//   39   87:getstatic       #432 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PERMISSIONS>
	//   40   90:aconst_null     
	//   41   91:aconst_null     
	//   42   92:aconst_null     
	//   43   93:invokeinterface #635 <Method void Radar$RadarCallback.onComplete(Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
					INSTANCE.broadcastError(RadarStatus.ERROR_PERMISSIONS);
	//   44   98:getstatic       #189 <Field Radar INSTANCE>
	//   45  101:getstatic       #432 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PERMISSIONS>
	//   46  104:invokespecial   #252 <Method void broadcastError(Radar$RadarStatus)>
					return;
	//   47  107:return          
				} else
				{
					track$sdk_release$default(INSTANCE, ((Location) (null)), radarcallback, 1, ((Object) (null)));
	//   48  108:getstatic       #189 <Field Radar INSTANCE>
	//   49  111:aconst_null     
	//   50  112:aload_0         
	//   51  113:iconst_1        
	//   52  114:aconst_null     
	//   53  115:invokestatic    #637 <Method void track$sdk_release$default(Radar, Location, Radar$RadarCallback, int, Object)>
					return;
	//   54  118:return          
				}
			}
		}
		if(radarcallback != null)
	//*  55  119:aload_0         
	//*  56  120:ifnull          135
			radarcallback.onComplete(RadarStatus.ERROR_PUBLISHABLE_KEY, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)));
	//   57  123:aload_0         
	//   58  124:getstatic       #622 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   59  127:aconst_null     
	//   60  128:aconst_null     
	//   61  129:aconst_null     
	//   62  130:invokeinterface #635 <Method void Radar$RadarCallback.onComplete(Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
		INSTANCE.broadcastError(RadarStatus.ERROR_PUBLISHABLE_KEY);
	//   63  135:getstatic       #189 <Field Radar INSTANCE>
	//   64  138:getstatic       #622 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   65  141:invokespecial   #252 <Method void broadcastError(Radar$RadarStatus)>
	//   66  144:return          
	}

	public static void trackOnce$default(RadarCallback radarcallback, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			radarcallback = (RadarCallback)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #6   <Class Radar$RadarCallback>
	//    6   10:astore_0        
		trackOnce(radarcallback);
	//    7   11:aload_0         
	//    8   12:invokestatic    #641 <Method void trackOnce(Radar$RadarCallback)>
	//    9   15:return          
	}

	public static final void updateLocation(Location location, RadarCallback radarcallback)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    0    0:aload_0         
	//    1    1:ldc2            #642 <String "location">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!INSTANCE.getSdkInitialized())
	//*   3    7:getstatic       #189 <Field Radar INSTANCE>
	//*   4   10:invokespecial   #225 <Method boolean getSdkInitialized()>
	//*   5   13:ifne            33
		{
			if(radarcallback != null)
	//*   6   16:aload_1         
	//*   7   17:ifnull          32
				radarcallback.onComplete(RadarStatus.ERROR_UNKNOWN, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)));
	//    8   20:aload_1         
	//    9   21:getstatic       #631 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_UNKNOWN>
	//   10   24:aconst_null     
	//   11   25:aconst_null     
	//   12   26:aconst_null     
	//   13   27:invokeinterface #635 <Method void Radar$RadarCallback.onComplete(Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
			return;
	//   14   32:return          
		}
		if(INSTANCE.getPublishableKey$sdk_release() != null)
	//*  15   33:getstatic       #189 <Field Radar INSTANCE>
	//*  16   36:invokevirtual   #611 <Method String getPublishableKey$sdk_release()>
	//*  17   39:ifnull          72
		{
			String s = INSTANCE.getPublishableKey$sdk_release();
	//   18   42:getstatic       #189 <Field Radar INSTANCE>
	//   19   45:invokevirtual   #611 <Method String getPublishableKey$sdk_release()>
	//   20   48:astore_2        
			if(s == null || s.length() != 0)
	//*  21   49:aload_2         
	//*  22   50:ifnull          63
	//*  23   53:aload_2         
	//*  24   54:invokevirtual   #614 <Method int String.length()>
	//*  25   57:ifne            63
	//*  26   60:goto            72
			{
				INSTANCE.track$sdk_release(location, radarcallback);
	//   27   63:getstatic       #189 <Field Radar INSTANCE>
	//   28   66:aload_0         
	//   29   67:aload_1         
	//   30   68:invokevirtual   #628 <Method void track$sdk_release(Location, Radar$RadarCallback)>
				return;
	//   31   71:return          
			}
		}
		if(radarcallback != null)
	//*  32   72:aload_1         
	//*  33   73:ifnull          89
			RadarCallback.DefaultImpls.onComplete._mthdefault(radarcallback, RadarStatus.ERROR_PUBLISHABLE_KEY, ((Location) (null)), ((RadarEvent []) (null)), ((RadarUser) (null)), 14, ((Object) (null)));
	//   34   76:aload_1         
	//   35   77:getstatic       #622 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   36   80:aconst_null     
	//   37   81:aconst_null     
	//   38   82:aconst_null     
	//   39   83:bipush          14
	//   40   85:aconst_null     
	//   41   86:invokestatic    #412 <Method void Radar$RadarCallback$DefaultImpls.onComplete$default(Radar$RadarCallback, Radar$RadarStatus, Location, RadarEvent[], RadarUser, int, Object)>
		INSTANCE.broadcastError(RadarStatus.ERROR_PUBLISHABLE_KEY);
	//   42   89:getstatic       #189 <Field Radar INSTANCE>
	//   43   92:getstatic       #622 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_PUBLISHABLE_KEY>
	//   44   95:invokespecial   #252 <Method void broadcastError(Radar$RadarStatus)>
	//   45   98:return          
	}

	public static void updateLocation$default(Location location, RadarCallback radarcallback, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			radarcallback = (RadarCallback)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #6   <Class Radar$RadarCallback>
	//    6   10:astore_1        
		updateLocation(location, radarcallback);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #646 <Method void updateLocation(Location, Radar$RadarCallback)>
	//   10   16:return          
	}

	public static void userId$annotations()
	{
	//    0    0:return          
	}

	public final String getPublishableKey$sdk_release()
	{
		IdentityRepository identityrepository = identityRepository;
	//    0    0:getstatic       #263 <Field IdentityRepository identityRepository>
	//    1    3:astore_1        
		if(identityrepository == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("identityRepository");
	//    4    8:ldc2            #264 <String "identityRepository">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		return identityrepository.getPublishableKey$sdk_release();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #649 <Method String IdentityRepository.getPublishableKey$sdk_release()>
	//    8   18:areturn         
	}

	public final void handleLocation$sdk_release(Location location)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    0    0:aload_1         
	//    1    1:ldc2            #642 <String "location">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) (stateManager));
	//    3    7:getstatic       #278 <Field StateManager stateManager>
	//    4   10:astore_2        
		if(obj == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       21
			Intrinsics.throwUninitializedPropertyAccessException("stateManager");
	//    7   15:ldc2            #279 <String "stateManager">
	//    8   18:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		location = ((Location) (((StateManager) (obj)).updateState$sdk_release(location)));
	//    9   21:aload_2         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #655 <Method io.radar.sdk.internal.RadarState StateManager.updateState$sdk_release(Location)>
	//   12   26:astore_1        
		obj = ((Object) (locationManager));
	//   13   27:getstatic       #268 <Field LocationManager locationManager>
	//   14   30:astore_2        
		if(obj == null)
	//*  15   31:aload_2         
	//*  16   32:ifnonnull       41
			Intrinsics.throwUninitializedPropertyAccessException("locationManager");
	//   17   35:ldc2            #269 <String "locationManager">
	//   18   38:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((LocationManager) (obj)).handleState$sdk_release(((io.radar.sdk.internal.RadarState) (location)));
	//   19   41:aload_2         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #659 <Method void LocationManager.handleState$sdk_release(io.radar.sdk.internal.RadarState)>
		obj = ((Object) (apiClient));
	//   22   46:getstatic       #227 <Field ApiClient apiClient>
	//   23   49:astore_2        
		if(obj == null)
	//*  24   50:aload_2         
	//*  25   51:ifnonnull       59
			Intrinsics.throwUninitializedPropertyAccessException("apiClient");
	//   26   54:ldc1            #228 <String "apiClient">
	//   27   56:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((ApiClient) (obj)).handleState$sdk_release(((io.radar.sdk.internal.RadarState) (location)));
	//   28   59:aload_2         
	//   29   60:aload_1         
	//   30   61:invokevirtual   #660 <Method void ApiClient.handleState$sdk_release(io.radar.sdk.internal.RadarState)>
	//   31   64:return          
	}

	public final void handleLocations$sdk_release(List list)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "locations");
	//    0    0:aload_1         
	//    1    1:ldc2            #662 <String "locations">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) (stateManager));
	//    3    7:getstatic       #278 <Field StateManager stateManager>
	//    4   10:astore_2        
		if(obj == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       21
			Intrinsics.throwUninitializedPropertyAccessException("stateManager");
	//    7   15:ldc2            #279 <String "stateManager">
	//    8   18:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		list = ((List) (((StateManager) (obj)).updateState$sdk_release(list)));
	//    9   21:aload_2         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #665 <Method io.radar.sdk.internal.RadarState StateManager.updateState$sdk_release(List)>
	//   12   26:astore_1        
		obj = ((Object) (locationManager));
	//   13   27:getstatic       #268 <Field LocationManager locationManager>
	//   14   30:astore_2        
		if(obj == null)
	//*  15   31:aload_2         
	//*  16   32:ifnonnull       41
			Intrinsics.throwUninitializedPropertyAccessException("locationManager");
	//   17   35:ldc2            #269 <String "locationManager">
	//   18   38:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((LocationManager) (obj)).handleState$sdk_release(((io.radar.sdk.internal.RadarState) (list)));
	//   19   41:aload_2         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #659 <Method void LocationManager.handleState$sdk_release(io.radar.sdk.internal.RadarState)>
		obj = ((Object) (apiClient));
	//   22   46:getstatic       #227 <Field ApiClient apiClient>
	//   23   49:astore_2        
		if(obj == null)
	//*  24   50:aload_2         
	//*  25   51:ifnonnull       59
			Intrinsics.throwUninitializedPropertyAccessException("apiClient");
	//   26   54:ldc1            #228 <String "apiClient">
	//   27   56:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((ApiClient) (obj)).handleState$sdk_release(((io.radar.sdk.internal.RadarState) (list)));
	//   28   59:aload_2         
	//   29   60:aload_1         
	//   30   61:invokevirtual   #660 <Method void ApiClient.handleState$sdk_release(io.radar.sdk.internal.RadarState)>
	//   31   64:return          
	}

	public final void init$sdk_release(Context context1, OptionsRepository optionsrepository, IdentityRepository identityrepository, StateManager statemanager, LocationManager locationmanager, ApiClient apiclient)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context1)), "context");
	//    0    0:aload_1         
	//    1    1:ldc2            #259 <String "context">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (optionsrepository)), "optionsRepository");
	//    3    7:aload_2         
	//    4    8:ldc2            #274 <String "optionsRepository">
	//    5   11:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (identityrepository)), "identityRepository");
	//    6   14:aload_3         
	//    7   15:ldc2            #264 <String "identityRepository">
	//    8   18:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (statemanager)), "stateManager");
	//    9   21:aload           4
	//   10   23:ldc2            #279 <String "stateManager">
	//   11   26:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (locationmanager)), "locationManager");
	//   12   29:aload           5
	//   13   31:ldc2            #269 <String "locationManager">
	//   14   34:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (apiclient)), "apiClient");
	//   15   37:aload           6
	//   16   39:ldc1            #228 <String "apiClient">
	//   17   41:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		context = context1;
	//   18   44:aload_1         
	//   19   45:putstatic       #258 <Field Context context>
		RadarLogger.INSTANCE.setDEBUG(optionsrepository.getDebug$sdk_release());
	//   20   48:getstatic       #496 <Field RadarLogger RadarLogger.INSTANCE>
	//   21   51:aload_2         
	//   22   52:invokevirtual   #443 <Method boolean OptionsRepository.getDebug$sdk_release()>
	//   23   55:invokevirtual   #499 <Method void RadarLogger.setDEBUG(boolean)>
		optionsRepository = optionsrepository;
	//   24   58:aload_2         
	//   25   59:putstatic       #273 <Field OptionsRepository optionsRepository>
		identityRepository = identityrepository;
	//   26   62:aload_3         
	//   27   63:putstatic       #263 <Field IdentityRepository identityRepository>
		stateManager = statemanager;
	//   28   66:aload           4
	//   29   68:putstatic       #278 <Field StateManager stateManager>
		locationManager = locationmanager;
	//   30   71:aload           5
	//   31   73:putstatic       #268 <Field LocationManager locationManager>
		apiClient = apiclient;
	//   32   76:aload           6
	//   33   78:putstatic       #227 <Field ApiClient apiClient>
	//   34   81:return          
	}

	public final void requestLocation$sdk_release(boolean flag)
	{
		PermissionsHelper permissionshelper = PermissionsHelper.INSTANCE;
	//    0    0:getstatic       #393 <Field PermissionsHelper PermissionsHelper.INSTANCE>
	//    1    3:astore_2        
		Context context1 = context;
	//    2    4:getstatic       #258 <Field Context context>
	//    3    7:astore_3        
		if(context1 == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       18
			Intrinsics.throwUninitializedPropertyAccessException("context");
	//    6   12:ldc2            #259 <String "context">
	//    7   15:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		if(permissionshelper.check(context1))
	//*   8   18:aload_2         
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #397 <Method boolean PermissionsHelper.check(Context)>
	//*  11   23:ifeq            45
		{
			LocationManager locationmanager = locationManager;
	//   12   26:getstatic       #268 <Field LocationManager locationManager>
	//   13   29:astore_2        
			if(locationmanager == null)
	//*  14   30:aload_2         
	//*  15   31:ifnonnull       40
				Intrinsics.throwUninitializedPropertyAccessException("locationManager");
	//   16   34:ldc2            #269 <String "locationManager">
	//   17   37:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			locationmanager.requestLocation$sdk_release(flag);
	//   18   40:aload_2         
	//   19   41:iload_1         
	//   20   42:invokevirtual   #669 <Method void LocationManager.requestLocation$sdk_release(boolean)>
		}
	//   21   45:return          
	}

	public final void retryFailedStop$sdk_release(Function0 function0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function0)), "completionCallback");
	//    0    0:aload_1         
	//    1    1:ldc2            #671 <String "completionCallback">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		ApiClient apiclient = apiClient;
	//    3    7:getstatic       #227 <Field ApiClient apiClient>
	//    4   10:astore_2        
		if(apiclient == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       20
			Intrinsics.throwUninitializedPropertyAccessException("apiClient");
	//    7   15:ldc1            #228 <String "apiClient">
	//    8   17:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		apiclient.retryFailedStop$sdk_release(function0);
	//    9   20:aload_2         
	//   10   21:aload_1         
	//   11   22:invokevirtual   #673 <Method void ApiClient.retryFailedStop$sdk_release(Function0)>
	//   12   25:return          
	}

	public final void setPublishableKey$sdk_release(String s)
	{
		Object obj = ((Object) (identityRepository));
	//    0    0:getstatic       #263 <Field IdentityRepository identityRepository>
	//    1    3:astore_2        
		if(obj == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("identityRepository");
	//    4    8:ldc2            #264 <String "identityRepository">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		obj = ((Object) (((IdentityRepository) (obj)).getPublishableKey$sdk_release()));
	//    6   14:aload_2         
	//    7   15:invokevirtual   #649 <Method String IdentityRepository.getPublishableKey$sdk_release()>
	//    8   18:astore_2        
		if(obj == null || Intrinsics.areEqual(obj, ((Object) (s))) ^ true)
	//*   9   19:aload_2         
	//*  10   20:ifnull          33
	//*  11   23:aload_2         
	//*  12   24:aload_1         
	//*  13   25:invokestatic    #368 <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  14   28:iconst_1        
	//*  15   29:ixor            
	//*  16   30:ifeq            55
		{
			obj = ((Object) (identityRepository));
	//   17   33:getstatic       #263 <Field IdentityRepository identityRepository>
	//   18   36:astore_2        
			if(obj == null)
	//*  19   37:aload_2         
	//*  20   38:ifnonnull       47
				Intrinsics.throwUninitializedPropertyAccessException("identityRepository");
	//   21   41:ldc2            #264 <String "identityRepository">
	//   22   44:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
			((IdentityRepository) (obj)).setRadarId$sdk_release((String)null);
	//   23   47:aload_2         
	//   24   48:aconst_null     
	//   25   49:checkcast       #245 <Class String>
	//   26   52:invokevirtual   #677 <Method void IdentityRepository.setRadarId$sdk_release(String)>
		}
		obj = ((Object) (identityRepository));
	//   27   55:getstatic       #263 <Field IdentityRepository identityRepository>
	//   28   58:astore_2        
		if(obj == null)
	//*  29   59:aload_2         
	//*  30   60:ifnonnull       69
			Intrinsics.throwUninitializedPropertyAccessException("identityRepository");
	//   31   63:ldc2            #264 <String "identityRepository">
	//   32   66:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		((IdentityRepository) (obj)).setPublishableKey$sdk_release(s);
	//   33   69:aload_2         
	//   34   70:aload_1         
	//   35   71:invokevirtual   #678 <Method void IdentityRepository.setPublishableKey$sdk_release(String)>
	//   36   74:return          
	}

	public final void track$sdk_release(Location location, RadarCallback radarcallback)
	{
		forceTrack(location, radarcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #438 <Method void forceTrack(Location, Radar$RadarCallback)>
	//    4    6:return          
	}

	public final void trackOnce(Function4 function4)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function4)), "block");
	//    0    0:aload_1         
	//    1    1:ldc2            #680 <String "block">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		trackOnce((RadarCallback)new RadarCallback(function4) {

			public void onComplete(RadarStatus radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser)
			{
				Intrinsics.checkParameterIsNotNull(((Object) (radarstatus)), "status");
			//    0    0:aload_1         
			//    1    1:ldc1            #47  <String "status">
			//    2    3:invokestatic    #53  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
				$block.invoke(((Object) (radarstatus)), ((Object) (location)), ((Object) (aradarevent)), ((Object) (radaruser)));
			//    3    6:aload_0         
			//    4    7:getfield        #40  <Field Function4 $block>
			//    5   10:aload_1         
			//    6   11:aload_2         
			//    7   12:aload_3         
			//    8   13:aload           4
			//    9   15:invokeinterface #59  <Method Object Function4.invoke(Object, Object, Object, Object)>
			//   10   20:pop             
			//   11   21:return          
			}

			final Function4 $block;

			
			{
				$block = function4;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #40  <Field Function4 $block>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #43  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    7:new             #37  <Class Radar$trackOnce$1>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #682 <Method void Radar$trackOnce$1(Function4)>
	//    7   15:checkcast       #6   <Class Radar$RadarCallback>
	//    8   18:invokestatic    #641 <Method void trackOnce(Radar$RadarCallback)>
	//    9   21:return          
	}

	public final void updateLocation(Location location, Function4 function4)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    0    0:aload_1         
	//    1    1:ldc2            #642 <String "location">
	//    2    4:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function4)), "block");
	//    3    7:aload_2         
	//    4    8:ldc2            #680 <String "block">
	//    5   11:invokestatic    #223 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		updateLocation(location, (RadarCallback)new RadarCallback(function4) {

			public void onComplete(RadarStatus radarstatus, Location location1, RadarEvent aradarevent[], RadarUser radaruser)
			{
				Intrinsics.checkParameterIsNotNull(((Object) (radarstatus)), "status");
			//    0    0:aload_1         
			//    1    1:ldc1            #48  <String "status">
			//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
				$block.invoke(((Object) (radarstatus)), ((Object) (location1)), ((Object) (aradarevent)), ((Object) (radaruser)));
			//    3    6:aload_0         
			//    4    7:getfield        #41  <Field Function4 $block>
			//    5   10:aload_1         
			//    6   11:aload_2         
			//    7   12:aload_3         
			//    8   13:aload           4
			//    9   15:invokeinterface #60  <Method Object Function4.invoke(Object, Object, Object, Object)>
			//   10   20:pop             
			//   11   21:return          
			}

			final Function4 $block;

			
			{
				$block = function4;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #41  <Field Function4 $block>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #44  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    6   14:aload_1         
	//    7   15:new             #39  <Class Radar$updateLocation$1>
	//    8   18:dup             
	//    9   19:aload_2         
	//   10   20:invokespecial   #685 <Method void Radar$updateLocation$1(Function4)>
	//   11   23:checkcast       #6   <Class Radar$RadarCallback>
	//   12   26:invokestatic    #646 <Method void updateLocation(Location, Radar$RadarCallback)>
	//   13   29:return          
	}

	static final KProperty $$delegatedProperties[] = {
		(KProperty)Reflection.property1(((kotlin.jvm.internal.PropertyReference1) (new PropertyReference1Impl(((kotlin.reflect.KDeclarationContainer) (Reflection.getOrCreateKotlinClass(io/radar/sdk/Radar))), "userOptions", "getUserOptions()Lio/radar/sdk/Radar$UserOptions;"))))
	};
	public static final Radar INSTANCE = new Radar();
	private static ApiClient apiClient;
	private static Context context;
	private static IdentityRepository identityRepository;
	private static LocationManager locationManager;
	private static OptionsRepository optionsRepository;
	private static StateManager stateManager;
	private static final Lazy userOptions$delegate;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       KProperty[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #166 <Class PropertyReference1Impl>
	//    5    9:dup             
	//    6   10:ldc1            #2   <Class Radar>
	//    7   12:invokestatic    #172 <Method kotlin.reflect.KClass Reflection.getOrCreateKotlinClass(Class)>
	//    8   15:ldc1            #173 <String "userOptions">
	//    9   17:ldc1            #175 <String "getUserOptions()Lio/radar/sdk/Radar$UserOptions;">
	//   10   19:invokespecial   #179 <Method void PropertyReference1Impl(kotlin.reflect.KDeclarationContainer, String, String)>
	//   11   22:invokestatic    #183 <Method kotlin.reflect.KProperty1 Reflection.property1(kotlin.jvm.internal.PropertyReference1)>
	//   12   25:checkcast       #164 <Class KProperty>
	//   13   28:aastore         
	//   14   29:putstatic       #185 <Field KProperty[] $$delegatedProperties>
	//   15   32:new             #2   <Class Radar>
	//   16   35:dup             
	//   17   36:invokespecial   #187 <Method void Radar()>
	//   18   39:putstatic       #189 <Field Radar INSTANCE>
		static final class userOptions._cls2 extends Lambda
			implements Function0
		{

			public final UserOptions invoke()
			{
				return new UserOptions();
			//    0    0:new             #40  <Class Radar$UserOptions>
			//    1    3:dup             
			//    2    4:invokespecial   #41  <Method void Radar$UserOptions()>
			//    3    7:areturn         
			}

			public volatile Object invoke()
			{
				return ((Object) (invoke()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #45  <Method Radar$UserOptions invoke()>
			//    2    4:areturn         
			}

			public static final userOptions._cls2 INSTANCE = new userOptions._cls2();

			static 
			{
			//    0    0:new             #2   <Class Radar$userOptions$2>
			//    1    3:dup             
			//    2    4:invokespecial   #30  <Method void Radar$userOptions$2()>
			//    3    7:putstatic       #32  <Field Radar$userOptions$2 INSTANCE>
			//*   4   10:return          
			}

		}

		userOptions$delegate = LazyKt.lazy((Function0)userOptions._cls2.INSTANCE);
	//   19   42:getstatic       #192 <Field Radar$userOptions$2 Radar$userOptions$2.INSTANCE>
	//   20   45:checkcast       #194 <Class Function0>
	//   21   48:invokestatic    #200 <Method Lazy LazyKt.lazy(Function0)>
	//   22   51:putstatic       #202 <Field Lazy userOptions$delegate>
	//*  23   54:return          
	}


/*
	public static final void access$broadcastError(Radar radar, RadarStatus radarstatus)
	{
		radar.broadcastError(radarstatus);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #252 <Method void broadcastError(Radar$RadarStatus)>
		return;
	//    3    5:return          
	}

*/


/*
	public static final ApiClient access$getApiClient$p(Radar radar)
	{
		radar = ((Radar) (apiClient));
	//    0    0:getstatic       #227 <Field ApiClient apiClient>
	//    1    3:astore_0        
		if(radar == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       13
			Intrinsics.throwUninitializedPropertyAccessException("apiClient");
	//    4    8:ldc1            #228 <String "apiClient">
	//    5   10:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		return ((ApiClient) (radar));
	//    6   13:aload_0         
	//    7   14:areturn         
	}

*/


/*
	public static final Context access$getContext$p(Radar radar)
	{
		radar = ((Radar) (context));
	//    0    0:getstatic       #258 <Field Context context>
	//    1    3:astore_0        
		if(radar == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("context");
	//    4    8:ldc2            #259 <String "context">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		return ((Context) (radar));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

*/


/*
	public static final IdentityRepository access$getIdentityRepository$p(Radar radar)
	{
		radar = ((Radar) (identityRepository));
	//    0    0:getstatic       #263 <Field IdentityRepository identityRepository>
	//    1    3:astore_0        
		if(radar == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("identityRepository");
	//    4    8:ldc2            #264 <String "identityRepository">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		return ((IdentityRepository) (radar));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

*/


/*
	public static final LocationManager access$getLocationManager$p(Radar radar)
	{
		radar = ((Radar) (locationManager));
	//    0    0:getstatic       #268 <Field LocationManager locationManager>
	//    1    3:astore_0        
		if(radar == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("locationManager");
	//    4    8:ldc2            #269 <String "locationManager">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		return ((LocationManager) (radar));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

*/


/*
	public static final OptionsRepository access$getOptionsRepository$p(Radar radar)
	{
		radar = ((Radar) (optionsRepository));
	//    0    0:getstatic       #273 <Field OptionsRepository optionsRepository>
	//    1    3:astore_0        
		if(radar == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("optionsRepository");
	//    4    8:ldc2            #274 <String "optionsRepository">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		return ((OptionsRepository) (radar));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

*/


/*
	public static final StateManager access$getStateManager$p(Radar radar)
	{
		radar = ((Radar) (stateManager));
	//    0    0:getstatic       #278 <Field StateManager stateManager>
	//    1    3:astore_0        
		if(radar == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       14
			Intrinsics.throwUninitializedPropertyAccessException("stateManager");
	//    4    8:ldc2            #279 <String "stateManager">
	//    5   11:invokestatic    #231 <Method void Intrinsics.throwUninitializedPropertyAccessException(String)>
		return ((StateManager) (radar));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

*/


/*
	public static final void access$setApiClient$p(Radar radar, ApiClient apiclient)
	{
		apiClient = apiclient;
	//    0    0:aload_1         
	//    1    1:putstatic       #227 <Field ApiClient apiClient>
		return;
	//    2    4:return          
	}

*/


/*
	public static final void access$setContext$p(Radar radar, Context context1)
	{
		context = context1;
	//    0    0:aload_1         
	//    1    1:putstatic       #258 <Field Context context>
		return;
	//    2    4:return          
	}

*/


/*
	public static final void access$setIdentityRepository$p(Radar radar, IdentityRepository identityrepository)
	{
		identityRepository = identityrepository;
	//    0    0:aload_1         
	//    1    1:putstatic       #263 <Field IdentityRepository identityRepository>
		return;
	//    2    4:return          
	}

*/


/*
	public static final void access$setLocationManager$p(Radar radar, LocationManager locationmanager)
	{
		locationManager = locationmanager;
	//    0    0:aload_1         
	//    1    1:putstatic       #268 <Field LocationManager locationManager>
		return;
	//    2    4:return          
	}

*/


/*
	public static final void access$setOptionsRepository$p(Radar radar, OptionsRepository optionsrepository)
	{
		optionsRepository = optionsrepository;
	//    0    0:aload_1         
	//    1    1:putstatic       #273 <Field OptionsRepository optionsRepository>
		return;
	//    2    4:return          
	}

*/


/*
	public static final void access$setStateManager$p(Radar radar, StateManager statemanager)
	{
		stateManager = statemanager;
	//    0    0:aload_1         
	//    1    1:putstatic       #278 <Field StateManager stateManager>
		return;
	//    2    4:return          
	}

*/

	private class WhenMappings
	{

		public static final int $EnumSwitchMapping$0[];

		static 
		{
			$EnumSwitchMapping$0 = new int[RadarTrackingPriority.values().length];
		//    0    0:invokestatic    #22  <Method Radar$RadarTrackingPriority[] Radar$RadarTrackingPriority.values()>
		//    1    3:arraylength     
		//    2    4:newarray        int[]
		//    3    6:putstatic       #24  <Field int[] $EnumSwitchMapping$0>
			$EnumSwitchMapping$0[RadarTrackingPriority.RESPONSIVENESS.ordinal()] = 1;
		//    4    9:getstatic       #24  <Field int[] $EnumSwitchMapping$0>
		//    5   12:getstatic       #28  <Field Radar$RadarTrackingPriority Radar$RadarTrackingPriority.RESPONSIVENESS>
		//    6   15:invokevirtual   #32  <Method int Radar$RadarTrackingPriority.ordinal()>
		//    7   18:iconst_1        
		//    8   19:iastore         
			$EnumSwitchMapping$0[RadarTrackingPriority.EFFICIENCY.ordinal()] = 2;
		//    9   20:getstatic       #24  <Field int[] $EnumSwitchMapping$0>
		//   10   23:getstatic       #35  <Field Radar$RadarTrackingPriority Radar$RadarTrackingPriority.EFFICIENCY>
		//   11   26:invokevirtual   #32  <Method int Radar$RadarTrackingPriority.ordinal()>
		//   12   29:iconst_2        
		//   13   30:iastore         
		//*  14   31:return          
		}
	}

}
