// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.zzasm;

// Referenced classes of package com.google.android.gms.location:
//			Geofence

public static final class Geofence$Builder
{

	public Geofence build()
	{
		if(zzOV == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field String zzOV>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("Request ID not set.");
	//    3    7:new             #45  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #47  <String "Request ID not set.">
	//    6   13:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(zzbjD == 0)
	//*   8   17:aload_0         
	//*   9   18:getfield        #30  <Field int zzbjD>
	//*  10   21:ifne            34
			throw new IllegalArgumentException("Transitions types not set.");
	//   11   24:new             #45  <Class IllegalArgumentException>
	//   12   27:dup             
	//   13   28:ldc1            #52  <String "Transitions types not set.">
	//   14   30:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   15   33:athrow          
		if((zzbjD & 4) != 0 && zzbjK < 0)
	//*  16   34:aload_0         
	//*  17   35:getfield        #30  <Field int zzbjD>
	//*  18   38:iconst_4        
	//*  19   39:iand            
	//*  20   40:ifeq            60
	//*  21   43:aload_0         
	//*  22   44:getfield        #40  <Field int zzbjK>
	//*  23   47:ifge            60
			throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
	//   24   50:new             #45  <Class IllegalArgumentException>
	//   25   53:dup             
	//   26   54:ldc1            #54  <String "Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.">
	//   27   56:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   28   59:athrow          
		if(zzbjE == 0x0L)
	//*  29   60:aload_0         
	//*  30   61:getfield        #34  <Field long zzbjE>
	//*  31   64:ldc2w           #31  <Long 0x0L>
	//*  32   67:lcmp            
	//*  33   68:ifne            81
			throw new IllegalArgumentException("Expiration not set.");
	//   34   71:new             #45  <Class IllegalArgumentException>
	//   35   74:dup             
	//   36   75:ldc1            #56  <String "Expiration not set.">
	//   37   77:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   38   80:athrow          
		if(zzbjF == -1)
	//*  39   81:aload_0         
	//*  40   82:getfield        #36  <Field short zzbjF>
	//*  41   85:iconst_m1       
	//*  42   86:icmpne          99
			throw new IllegalArgumentException("Geofence region not set.");
	//   43   89:new             #45  <Class IllegalArgumentException>
	//   44   92:dup             
	//   45   93:ldc1            #58  <String "Geofence region not set.">
	//   46   95:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   47   98:athrow          
		if(zzbjJ < 0)
	//*  48   99:aload_0         
	//*  49  100:getfield        #38  <Field int zzbjJ>
	//*  50  103:ifge            116
			throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
	//   51  106:new             #45  <Class IllegalArgumentException>
	//   52  109:dup             
	//   53  110:ldc1            #60  <String "Notification responsiveness should be nonnegative.">
	//   54  112:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   55  115:athrow          
		else
			return ((Geofence) (new zzasm(zzOV, zzbjD, (short)1, zzbjG, zzbjH, zzbjI, zzbjE, zzbjJ, zzbjK)));
	//   56  116:new             #62  <Class zzasm>
	//   57  119:dup             
	//   58  120:aload_0         
	//   59  121:getfield        #28  <Field String zzOV>
	//   60  124:aload_0         
	//   61  125:getfield        #30  <Field int zzbjD>
	//   62  128:iconst_1        
	//   63  129:aload_0         
	//   64  130:getfield        #64  <Field double zzbjG>
	//   65  133:aload_0         
	//   66  134:getfield        #66  <Field double zzbjH>
	//   67  137:aload_0         
	//   68  138:getfield        #68  <Field float zzbjI>
	//   69  141:aload_0         
	//   70  142:getfield        #34  <Field long zzbjE>
	//   71  145:aload_0         
	//   72  146:getfield        #38  <Field int zzbjJ>
	//   73  149:aload_0         
	//   74  150:getfield        #40  <Field int zzbjK>
	//   75  153:invokespecial   #71  <Method void zzasm(String, int, short, double, double, float, long, int, int)>
	//   76  156:areturn         
	}

	public Geofence$Builder setCircularRegion(double d, double d1, float f)
	{
		zzbjF = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #36  <Field short zzbjF>
		zzbjG = d;
	//    3    5:aload_0         
	//    4    6:dload_1         
	//    5    7:putfield        #64  <Field double zzbjG>
		zzbjH = d1;
	//    6   10:aload_0         
	//    7   11:dload_3         
	//    8   12:putfield        #66  <Field double zzbjH>
		zzbjI = f;
	//    9   15:aload_0         
	//   10   16:fload           5
	//   11   18:putfield        #68  <Field float zzbjI>
		return this;
	//   12   21:aload_0         
	//   13   22:areturn         
	}

	public Geofence$Builder setExpirationDuration(long l)
	{
		if(l < 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            15
		{
			zzbjE = -1L;
	//    4    6:aload_0         
	//    5    7:ldc2w           #76  <Long -1L>
	//    6   10:putfield        #34  <Field long zzbjE>
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		} else
		{
			zzbjE = SystemClock.elapsedRealtime() + l;
	//    9   15:aload_0         
	//   10   16:invokestatic    #83  <Method long SystemClock.elapsedRealtime()>
	//   11   19:lload_1         
	//   12   20:ladd            
	//   13   21:putfield        #34  <Field long zzbjE>
			return this;
	//   14   24:aload_0         
	//   15   25:areturn         
		}
	}

	public Geofence$Builder setLoiteringDelay(int i)
	{
		zzbjK = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field int zzbjK>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Geofence$Builder setNotificationResponsiveness(int i)
	{
		zzbjJ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int zzbjJ>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Geofence$Builder setRequestId(String s)
	{
		zzOV = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String zzOV>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Geofence$Builder setTransitionTypes(int i)
	{
		zzbjD = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int zzbjD>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String zzOV;
	private int zzbjD;
	private long zzbjE;
	private short zzbjF;
	private double zzbjG;
	private double zzbjH;
	private float zzbjI;
	private int zzbjJ;
	private int zzbjK;

	public Geofence$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzOV = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #28  <Field String zzOV>
		zzbjD = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #30  <Field int zzbjD>
		zzbjE = 0x0L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #31  <Long 0x0L>
	//   10   18:putfield        #34  <Field long zzbjE>
		zzbjF = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #36  <Field short zzbjF>
		zzbjJ = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #38  <Field int zzbjJ>
		zzbjK = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #40  <Field int zzbjK>
	//   20   36:return          
	}
}
