// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.location.zzbh;

// Referenced classes of package com.google.android.gms.location:
//			Geofence

public static final class Geofence$Builder
{

	public final Geofence build()
	{
		if(zzad != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field String zzad>
	//*   2    4:ifnull          147
		{
			int i = zzae;
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field int zzae>
	//    5   11:istore_1        
			if(i != 0)
	//*   6   12:iload_1         
	//*   7   13:ifeq            137
			{
				if((i & 4) != 0 && zzal < 0)
	//*   8   16:iload_1         
	//*   9   17:iconst_4        
	//*  10   18:iand            
	//*  11   19:ifeq            42
	//*  12   22:aload_0         
	//*  13   23:getfield        #41  <Field int zzal>
	//*  14   26:iflt            32
	//*  15   29:goto            42
					throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
	//   16   32:new             #46  <Class IllegalArgumentException>
	//   17   35:dup             
	//   18   36:ldc1            #48  <String "Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.">
	//   19   38:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   20   41:athrow          
				long l = zzaf;
	//   21   42:aload_0         
	//   22   43:getfield        #35  <Field long zzaf>
	//   23   46:lstore_2        
				if(l != 0x0L)
	//*  24   47:lload_2         
	//*  25   48:ldc2w           #32  <Long 0x0L>
	//*  26   51:lcmp            
	//*  27   52:ifeq            127
				{
					if(zzag != -1)
	//*  28   55:aload_0         
	//*  29   56:getfield        #37  <Field short zzag>
	//*  30   59:iconst_m1       
	//*  31   60:icmpeq          117
					{
						int j = zzak;
	//   32   63:aload_0         
	//   33   64:getfield        #39  <Field int zzak>
	//   34   67:istore_1        
						if(j >= 0)
	//*  35   68:iload_1         
	//*  36   69:iflt            107
							return ((Geofence) (new zzbh(zzad, zzae, (short)1, zzah, zzai, zzaj, l, j, zzal)));
	//   37   72:new             #53  <Class zzbh>
	//   38   75:dup             
	//   39   76:aload_0         
	//   40   77:getfield        #29  <Field String zzad>
	//   41   80:aload_0         
	//   42   81:getfield        #31  <Field int zzae>
	//   43   84:iconst_1        
	//   44   85:aload_0         
	//   45   86:getfield        #55  <Field double zzah>
	//   46   89:aload_0         
	//   47   90:getfield        #57  <Field double zzai>
	//   48   93:aload_0         
	//   49   94:getfield        #59  <Field float zzaj>
	//   50   97:lload_2         
	//   51   98:iload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #41  <Field int zzal>
	//   54  103:invokespecial   #62  <Method void zzbh(String, int, short, double, double, float, long, int, int)>
	//   55  106:areturn         
						else
							throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
	//   56  107:new             #46  <Class IllegalArgumentException>
	//   57  110:dup             
	//   58  111:ldc1            #64  <String "Notification responsiveness should be nonnegative.">
	//   59  113:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   60  116:athrow          
					} else
					{
						throw new IllegalArgumentException("Geofence region not set.");
	//   61  117:new             #46  <Class IllegalArgumentException>
	//   62  120:dup             
	//   63  121:ldc1            #66  <String "Geofence region not set.">
	//   64  123:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   65  126:athrow          
					}
				} else
				{
					throw new IllegalArgumentException("Expiration not set.");
	//   66  127:new             #46  <Class IllegalArgumentException>
	//   67  130:dup             
	//   68  131:ldc1            #68  <String "Expiration not set.">
	//   69  133:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   70  136:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("Transitions types not set.");
	//   71  137:new             #46  <Class IllegalArgumentException>
	//   72  140:dup             
	//   73  141:ldc1            #70  <String "Transitions types not set.">
	//   74  143:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   75  146:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Request ID not set.");
	//   76  147:new             #46  <Class IllegalArgumentException>
	//   77  150:dup             
	//   78  151:ldc1            #72  <String "Request ID not set.">
	//   79  153:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   80  156:athrow          
		}
	}

	public final Geofence$Builder setCircularRegion(double d, double d1, float f)
	{
		zzag = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #37  <Field short zzag>
		zzah = d;
	//    3    5:aload_0         
	//    4    6:dload_1         
	//    5    7:putfield        #55  <Field double zzah>
		zzai = d1;
	//    6   10:aload_0         
	//    7   11:dload_3         
	//    8   12:putfield        #57  <Field double zzai>
		zzaj = f;
	//    9   15:aload_0         
	//   10   16:fload           5
	//   11   18:putfield        #59  <Field float zzaj>
		return this;
	//   12   21:aload_0         
	//   13   22:areturn         
	}

	public final Geofence$Builder setExpirationDuration(long l)
	{
		if(l < 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            15
		{
			zzaf = -1L;
	//    4    6:aload_0         
	//    5    7:ldc2w           #77  <Long -1L>
	//    6   10:putfield        #35  <Field long zzaf>
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		} else
		{
			zzaf = SystemClock.elapsedRealtime() + l;
	//    9   15:aload_0         
	//   10   16:invokestatic    #84  <Method long SystemClock.elapsedRealtime()>
	//   11   19:lload_1         
	//   12   20:ladd            
	//   13   21:putfield        #35  <Field long zzaf>
			return this;
	//   14   24:aload_0         
	//   15   25:areturn         
		}
	}

	public final Geofence$Builder setLoiteringDelay(int i)
	{
		zzal = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int zzal>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final Geofence$Builder setNotificationResponsiveness(int i)
	{
		zzak = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field int zzak>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final Geofence$Builder setRequestId(String s)
	{
		zzad = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String zzad>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final Geofence$Builder setTransitionTypes(int i)
	{
		zzae = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int zzae>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String zzad;
	private int zzae;
	private long zzaf;
	private short zzag;
	private double zzah;
	private double zzai;
	private float zzaj;
	private int zzak;
	private int zzal;

	public Geofence$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		zzad = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field String zzad>
		zzae = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #31  <Field int zzae>
		zzaf = 0x0L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #32  <Long 0x0L>
	//   10   18:putfield        #35  <Field long zzaf>
		zzag = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #37  <Field short zzag>
		zzak = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #39  <Field int zzak>
		zzal = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #41  <Field int zzal>
	//   20   36:return          
	}
}
