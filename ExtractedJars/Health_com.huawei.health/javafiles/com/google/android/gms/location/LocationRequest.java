// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.location:
//			zzm

public final class LocationRequest extends zza
	implements ReflectedParcelable
{

	public LocationRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void zza()>
		mPriority = 102;
	//    2    4:aload_0         
	//    3    5:bipush          102
	//    4    7:putfield        #42  <Field int mPriority>
		zzbjU = 0x36ee80L;
	//    5   10:aload_0         
	//    6   11:ldc2w           #43  <Long 0x36ee80L>
	//    7   14:putfield        #46  <Field long zzbjU>
		zzbjV = 0x927c0L;
	//    8   17:aload_0         
	//    9   18:ldc2w           #47  <Long 0x927c0L>
	//   10   21:putfield        #50  <Field long zzbjV>
		zzaWy = false;
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:putfield        #52  <Field boolean zzaWy>
		zzbjE = 0xffffffffL;
	//   14   29:aload_0         
	//   15   30:ldc2w           #53  <Long 0xffffffffL>
	//   16   33:putfield        #56  <Field long zzbjE>
		zzbjW = 0x7fffffff;
	//   17   36:aload_0         
	//   18   37:ldc1            #57  <Int 0x7fffffff>
	//   19   39:putfield        #59  <Field int zzbjW>
		zzbjX = 0.0F;
	//   20   42:aload_0         
	//   21   43:fconst_0        
	//   22   44:putfield        #61  <Field float zzbjX>
		zzbjY = 0L;
	//   23   47:aload_0         
	//   24   48:lconst_0        
	//   25   49:putfield        #63  <Field long zzbjY>
	//   26   52:return          
	}

	LocationRequest(int i, long l, long l1, boolean flag, long l2, int j, float f, long l3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void zza()>
		mPriority = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int mPriority>
		zzbjU = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #46  <Field long zzbjU>
		zzbjV = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #50  <Field long zzbjV>
		zzaWy = flag;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #52  <Field boolean zzaWy>
		zzbjE = l2;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #56  <Field long zzbjE>
		zzbjW = j;
	//   17   32:aload_0         
	//   18   33:iload           9
	//   19   35:putfield        #59  <Field int zzbjW>
		zzbjX = f;
	//   20   38:aload_0         
	//   21   39:fload           10
	//   22   41:putfield        #61  <Field float zzbjX>
		zzbjY = l3;
	//   23   44:aload_0         
	//   24   45:lload           11
	//   25   47:putfield        #63  <Field long zzbjY>
	//   26   50:return          
	}

	public static LocationRequest create()
	{
		return new LocationRequest();
	//    0    0:new             #2   <Class LocationRequest>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void LocationRequest()>
	//    3    7:areturn         
	}

	private static void zzV(long l)
	{
		if(l < 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            35
			throw new IllegalArgumentException((new StringBuilder(38)).append("invalid interval: ").append(l).toString());
	//    4    6:new             #71  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:new             #73  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          38
	//    9   16:invokespecial   #76  <Method void StringBuilder(int)>
	//   10   19:ldc1            #78  <String "invalid interval: ">
	//   11   21:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:lload_0         
	//   13   25:invokevirtual   #85  <Method StringBuilder StringBuilder.append(long)>
	//   14   28:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   15   31:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
		else
			return;
	//   17   35:return          
	}

	private static void zze(float f)
	{
		if(f < 0.0F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            35
			throw new IllegalArgumentException((new StringBuilder(37)).append("invalid displacement: ").append(f).toString());
	//    4    6:new             #71  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:new             #73  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          37
	//    9   16:invokespecial   #76  <Method void StringBuilder(int)>
	//   10   19:ldc1            #96  <String "invalid displacement: ">
	//   11   21:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:fload_0         
	//   13   25:invokevirtual   #99  <Method StringBuilder StringBuilder.append(float)>
	//   14   28:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   15   31:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
		else
			return;
	//   17   35:return          
	}

	private static void zzkk(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     100 105: default 40
	//	               100 43
	//	               101 44
	//	               102 43
	//	               103 44
	//	               104 43
	//	               105 43
	//*   2   40:goto            44
		case 100: // 'd'
		case 102: // 'f'
		case 104: // 'h'
		case 105: // 'i'
			return;
	//    3   43:return          
		}
		throw new IllegalArgumentException((new StringBuilder(28)).append("invalid quality: ").append(i).toString());
	//    4   44:new             #71  <Class IllegalArgumentException>
	//    5   47:dup             
	//    6   48:new             #73  <Class StringBuilder>
	//    7   51:dup             
	//    8   52:bipush          28
	//    9   54:invokespecial   #76  <Method void StringBuilder(int)>
	//   10   57:ldc1            #102 <String "invalid quality: ">
	//   11   59:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   12   62:iload_0         
	//   13   63:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
	//   14   66:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   15   69:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   16   72:athrow          
	}

	public static String zzkl(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     100 105: default 40
	//	               100 43
	//	               101 55
	//	               102 46
	//	               103 55
	//	               104 49
	//	               105 52
	//*   2   40:goto            55
		case 100: // 'd'
			return "PRIORITY_HIGH_ACCURACY";
	//    3   43:ldc1            #108 <String "PRIORITY_HIGH_ACCURACY">
	//    4   45:areturn         

		case 102: // 'f'
			return "PRIORITY_BALANCED_POWER_ACCURACY";
	//    5   46:ldc1            #109 <String "PRIORITY_BALANCED_POWER_ACCURACY">
	//    6   48:areturn         

		case 104: // 'h'
			return "PRIORITY_LOW_POWER";
	//    7   49:ldc1            #110 <String "PRIORITY_LOW_POWER">
	//    8   51:areturn         

		case 105: // 'i'
			return "PRIORITY_NO_POWER";
	//    9   52:ldc1            #111 <String "PRIORITY_NO_POWER">
	//   10   54:areturn         
		}
		return "???";
	//   11   55:ldc1            #113 <String "???">
	//   12   57:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof LocationRequest))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LocationRequest>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((LocationRequest)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class LocationRequest>
	//   12   20:astore_1        
		return mPriority == ((LocationRequest) (obj)).mPriority && zzbjU == ((LocationRequest) (obj)).zzbjU && zzbjV == ((LocationRequest) (obj)).zzbjV && zzaWy == ((LocationRequest) (obj)).zzaWy && zzbjE == ((LocationRequest) (obj)).zzbjE && zzbjW == ((LocationRequest) (obj)).zzbjW && zzbjX == ((LocationRequest) (obj)).zzbjX && getMaxWaitTime() == ((LocationRequest) (obj)).getMaxWaitTime();
	//   13   21:aload_0         
	//   14   22:getfield        #42  <Field int mPriority>
	//   15   25:aload_1         
	//   16   26:getfield        #42  <Field int mPriority>
	//   17   29:icmpne          116
	//   18   32:aload_0         
	//   19   33:getfield        #46  <Field long zzbjU>
	//   20   36:aload_1         
	//   21   37:getfield        #46  <Field long zzbjU>
	//   22   40:lcmp            
	//   23   41:ifne            116
	//   24   44:aload_0         
	//   25   45:getfield        #50  <Field long zzbjV>
	//   26   48:aload_1         
	//   27   49:getfield        #50  <Field long zzbjV>
	//   28   52:lcmp            
	//   29   53:ifne            116
	//   30   56:aload_0         
	//   31   57:getfield        #52  <Field boolean zzaWy>
	//   32   60:aload_1         
	//   33   61:getfield        #52  <Field boolean zzaWy>
	//   34   64:icmpne          116
	//   35   67:aload_0         
	//   36   68:getfield        #56  <Field long zzbjE>
	//   37   71:aload_1         
	//   38   72:getfield        #56  <Field long zzbjE>
	//   39   75:lcmp            
	//   40   76:ifne            116
	//   41   79:aload_0         
	//   42   80:getfield        #59  <Field int zzbjW>
	//   43   83:aload_1         
	//   44   84:getfield        #59  <Field int zzbjW>
	//   45   87:icmpne          116
	//   46   90:aload_0         
	//   47   91:getfield        #61  <Field float zzbjX>
	//   48   94:aload_1         
	//   49   95:getfield        #61  <Field float zzbjX>
	//   50   98:fcmpl           
	//   51   99:ifne            116
	//   52  102:aload_0         
	//   53  103:invokevirtual   #119 <Method long getMaxWaitTime()>
	//   54  106:aload_1         
	//   55  107:invokevirtual   #119 <Method long getMaxWaitTime()>
	//   56  110:lcmp            
	//   57  111:ifne            116
	//   58  114:iconst_1        
	//   59  115:ireturn         
	//   60  116:iconst_0        
	//   61  117:ireturn         
	}

	public long getExpirationTime()
	{
		return zzbjE;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field long zzbjE>
	//    2    4:lreturn         
	}

	public long getFastestInterval()
	{
		return zzbjV;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long zzbjV>
	//    2    4:lreturn         
	}

	public long getInterval()
	{
		return zzbjU;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long zzbjU>
	//    2    4:lreturn         
	}

	public long getMaxWaitTime()
	{
		long l1 = zzbjY;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field long zzbjY>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 < zzbjU)
	//*   5    7:lload_3         
	//*   6    8:aload_0         
	//*   7    9:getfield        #46  <Field long zzbjU>
	//*   8   12:lcmp            
	//*   9   13:ifge            21
			l = zzbjU;
	//   10   16:aload_0         
	//   11   17:getfield        #46  <Field long zzbjU>
	//   12   20:lstore_1        
		return l;
	//   13   21:lload_1         
	//   14   22:lreturn         
	}

	public int getNumUpdates()
	{
		return zzbjW;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int zzbjW>
	//    2    4:ireturn         
	}

	public int getPriority()
	{
		return mPriority;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mPriority>
	//    2    4:ireturn         
	}

	public float getSmallestDisplacement()
	{
		return zzbjX;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field float zzbjX>
	//    2    4:freturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(mPriority), Long.valueOf(zzbjU), Float.valueOf(zzbjX), Long.valueOf(zzbjY)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field int mPriority>
	//    6   10:invokestatic    #136 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #46  <Field long zzbjU>
	//   12   20:invokestatic    #141 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #61  <Field float zzbjX>
	//   18   30:invokestatic    #146 <Method Float Float.valueOf(float)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #63  <Field long zzbjY>
	//   24   40:invokestatic    #141 <Method Long Long.valueOf(long)>
	//   25   43:aastore         
	//   26   44:invokestatic    #151 <Method int zzaa.hashCode(Object[])>
	//   27   47:ireturn         
	}

	public LocationRequest setExpirationDuration(long l)
	{
		long l1 = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #158 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_3        
		if(l > 0xffffffffL - l1)
	//*   2    4:lload_1         
	//*   3    5:ldc2w           #53  <Long 0xffffffffL>
	//*   4    8:lload_3         
	//*   5    9:lsub            
	//*   6   10:lcmp            
	//*   7   11:ifle            24
			zzbjE = 0xffffffffL;
	//    8   14:aload_0         
	//    9   15:ldc2w           #53  <Long 0xffffffffL>
	//   10   18:putfield        #56  <Field long zzbjE>
		else
	//*  11   21:goto            31
			zzbjE = l + l1;
	//   12   24:aload_0         
	//   13   25:lload_1         
	//   14   26:lload_3         
	//   15   27:ladd            
	//   16   28:putfield        #56  <Field long zzbjE>
		if(zzbjE < 0L)
	//*  17   31:aload_0         
	//*  18   32:getfield        #56  <Field long zzbjE>
	//*  19   35:lconst_0        
	//*  20   36:lcmp            
	//*  21   37:ifge            45
			zzbjE = 0L;
	//   22   40:aload_0         
	//   23   41:lconst_0        
	//   24   42:putfield        #56  <Field long zzbjE>
		return this;
	//   25   45:aload_0         
	//   26   46:areturn         
	}

	public LocationRequest setExpirationTime(long l)
	{
		zzbjE = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #56  <Field long zzbjE>
		if(zzbjE < 0L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #56  <Field long zzbjE>
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifge            19
			zzbjE = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #56  <Field long zzbjE>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public LocationRequest setFastestInterval(long l)
	{
		zzV(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #162 <Method void zzV(long)>
		zzaWy = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #52  <Field boolean zzaWy>
		zzbjV = l;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #50  <Field long zzbjV>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public LocationRequest setInterval(long l)
	{
		zzV(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #162 <Method void zzV(long)>
		zzbjU = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #46  <Field long zzbjU>
		if(!zzaWy)
	//*   5    9:aload_0         
	//*   6   10:getfield        #52  <Field boolean zzaWy>
	//*   7   13:ifne            30
			zzbjV = (long)((double)zzbjU / 6D);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #46  <Field long zzbjU>
	//   11   21:l2d             
	//   12   22:ldc2w           #164 <Double 6D>
	//   13   25:ddiv            
	//   14   26:d2l             
	//   15   27:putfield        #50  <Field long zzbjV>
		return this;
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public LocationRequest setMaxWaitTime(long l)
	{
		zzV(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #162 <Method void zzV(long)>
		zzbjY = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #63  <Field long zzbjY>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public LocationRequest setNumUpdates(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            33
		{
			throw new IllegalArgumentException((new StringBuilder(31)).append("invalid numUpdates: ").append(i).toString());
	//    2    4:new             #71  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:new             #73  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:bipush          31
	//    7   14:invokespecial   #76  <Method void StringBuilder(int)>
	//    8   17:ldc1            #170 <String "invalid numUpdates: ">
	//    9   19:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
	//   12   26:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   13   29:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   14   32:athrow          
		} else
		{
			zzbjW = i;
	//   15   33:aload_0         
	//   16   34:iload_1         
	//   17   35:putfield        #59  <Field int zzbjW>
			return this;
	//   18   38:aload_0         
	//   19   39:areturn         
		}
	}

	public LocationRequest setPriority(int i)
	{
		zzkk(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #173 <Method void zzkk(int)>
		mPriority = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int mPriority>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public LocationRequest setSmallestDisplacement(float f)
	{
		zze(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #177 <Method void zze(float)>
		zzbjX = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #61  <Field float zzbjX>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #178 <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("Request[").append(zzkl(mPriority));
	//    4    9:aload           5
	//    5   11:ldc1            #180 <String "Request[">
	//    6   13:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:getfield        #42  <Field int mPriority>
	//    9   20:invokestatic    #182 <Method String zzkl(int)>
	//   10   23:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:pop             
		if(mPriority != 105)
	//*  12   27:aload_0         
	//*  13   28:getfield        #42  <Field int mPriority>
	//*  14   31:bipush          105
	//*  15   33:icmpeq          59
		{
			stringbuilder.append(" requested=");
	//   16   36:aload           5
	//   17   38:ldc1            #184 <String " requested=">
	//   18   40:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   19   43:pop             
			stringbuilder.append(zzbjU).append("ms");
	//   20   44:aload           5
	//   21   46:aload_0         
	//   22   47:getfield        #46  <Field long zzbjU>
	//   23   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(long)>
	//   24   53:ldc1            #186 <String "ms">
	//   25   55:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   26   58:pop             
		}
		stringbuilder.append(" fastest=");
	//   27   59:aload           5
	//   28   61:ldc1            #188 <String " fastest=">
	//   29   63:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
		stringbuilder.append(zzbjV).append("ms");
	//   31   67:aload           5
	//   32   69:aload_0         
	//   33   70:getfield        #50  <Field long zzbjV>
	//   34   73:invokevirtual   #85  <Method StringBuilder StringBuilder.append(long)>
	//   35   76:ldc1            #186 <String "ms">
	//   36   78:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   37   81:pop             
		if(zzbjY > zzbjU)
	//*  38   82:aload_0         
	//*  39   83:getfield        #63  <Field long zzbjY>
	//*  40   86:aload_0         
	//*  41   87:getfield        #46  <Field long zzbjU>
	//*  42   90:lcmp            
	//*  43   91:ifle            117
		{
			stringbuilder.append(" maxWait=");
	//   44   94:aload           5
	//   45   96:ldc1            #190 <String " maxWait=">
	//   46   98:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   47  101:pop             
			stringbuilder.append(zzbjY).append("ms");
	//   48  102:aload           5
	//   49  104:aload_0         
	//   50  105:getfield        #63  <Field long zzbjY>
	//   51  108:invokevirtual   #85  <Method StringBuilder StringBuilder.append(long)>
	//   52  111:ldc1            #186 <String "ms">
	//   53  113:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   54  116:pop             
		}
		if(zzbjX > 0.0F)
	//*  55  117:aload_0         
	//*  56  118:getfield        #61  <Field float zzbjX>
	//*  57  121:fconst_0        
	//*  58  122:fcmpl           
	//*  59  123:ifle            149
		{
			stringbuilder.append(" smallestDisplacement=");
	//   60  126:aload           5
	//   61  128:ldc1            #192 <String " smallestDisplacement=">
	//   62  130:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   63  133:pop             
			stringbuilder.append(zzbjX).append("m");
	//   64  134:aload           5
	//   65  136:aload_0         
	//   66  137:getfield        #61  <Field float zzbjX>
	//   67  140:invokevirtual   #99  <Method StringBuilder StringBuilder.append(float)>
	//   68  143:ldc1            #194 <String "m">
	//   69  145:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   70  148:pop             
		}
		if(zzbjE != 0xffffffffL)
	//*  71  149:aload_0         
	//*  72  150:getfield        #56  <Field long zzbjE>
	//*  73  153:ldc2w           #53  <Long 0xffffffffL>
	//*  74  156:lcmp            
	//*  75  157:ifeq            191
		{
			long l = zzbjE;
	//   76  160:aload_0         
	//   77  161:getfield        #56  <Field long zzbjE>
	//   78  164:lstore_1        
			long l1 = SystemClock.elapsedRealtime();
	//   79  165:invokestatic    #158 <Method long SystemClock.elapsedRealtime()>
	//   80  168:lstore_3        
			stringbuilder.append(" expireIn=");
	//   81  169:aload           5
	//   82  171:ldc1            #196 <String " expireIn=">
	//   83  173:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   84  176:pop             
			stringbuilder.append(l - l1).append("ms");
	//   85  177:aload           5
	//   86  179:lload_1         
	//   87  180:lload_3         
	//   88  181:lsub            
	//   89  182:invokevirtual   #85  <Method StringBuilder StringBuilder.append(long)>
	//   90  185:ldc1            #186 <String "ms">
	//   91  187:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   92  190:pop             
		}
		if(zzbjW != 0x7fffffff)
	//*  93  191:aload_0         
	//*  94  192:getfield        #59  <Field int zzbjW>
	//*  95  195:ldc1            #57  <Int 0x7fffffff>
	//*  96  197:icmpeq          215
			stringbuilder.append(" num=").append(zzbjW);
	//   97  200:aload           5
	//   98  202:ldc1            #198 <String " num=">
	//   99  204:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  100  207:aload_0         
	//  101  208:getfield        #59  <Field int zzbjW>
	//  102  211:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
	//  103  214:pop             
		stringbuilder.append(']');
	//  104  215:aload           5
	//  105  217:bipush          93
	//  106  219:invokevirtual   #201 <Method StringBuilder StringBuilder.append(char)>
	//  107  222:pop             
		return stringbuilder.toString();
	//  108  223:aload           5
	//  109  225:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  110  228:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzm.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #207 <Method void com.google.android.gms.location.zzm.zza(LocationRequest, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzm();
	public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
	public static final int PRIORITY_HIGH_ACCURACY = 100;
	public static final int PRIORITY_LOW_POWER = 104;
	public static final int PRIORITY_NO_POWER = 105;
	int mPriority;
	boolean zzaWy;
	long zzbjE;
	long zzbjU;
	long zzbjV;
	int zzbjW;
	float zzbjX;
	long zzbjY;

	static 
	{
	//    0    0:new             #33  <Class zzm>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void zzm()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
