// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import android.location.Location;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;

// Referenced classes of package io.radar.sdk:
//			Radar

public static interface Radar$RadarCallback
{
	public static final class DefaultImpls
	{

		public static void onComplete$default(Radar.RadarCallback radarcallback, Radar.RadarStatus radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser, int i, Object obj)
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


	public abstract void onComplete(Radar.RadarStatus radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser);
}
