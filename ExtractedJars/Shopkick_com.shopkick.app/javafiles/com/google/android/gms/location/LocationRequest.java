// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//			zzab

public final class LocationRequest extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public LocationRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void AbstractSafeParcelable()>
		priority = 102;
	//    2    4:aload_0         
	//    3    5:bipush          102
	//    4    7:putfield        #67  <Field int priority>
		zzaw = 0x36ee80L;
	//    5   10:aload_0         
	//    6   11:ldc2w           #68  <Long 0x36ee80L>
	//    7   14:putfield        #71  <Field long zzaw>
		zzax = 0x927c0L;
	//    8   17:aload_0         
	//    9   18:ldc2w           #72  <Long 0x927c0L>
	//   10   21:putfield        #75  <Field long zzax>
		zzay = false;
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:putfield        #77  <Field boolean zzay>
		zzaf = 0xffffffffL;
	//   14   29:aload_0         
	//   15   30:ldc2w           #78  <Long 0xffffffffL>
	//   16   33:putfield        #81  <Field long zzaf>
		zzx = 0x7fffffff;
	//   17   36:aload_0         
	//   18   37:ldc1            #82  <Int 0x7fffffff>
	//   19   39:putfield        #84  <Field int zzx>
		zzaz = 0.0F;
	//   20   42:aload_0         
	//   21   43:fconst_0        
	//   22   44:putfield        #86  <Field float zzaz>
		zzba = 0L;
	//   23   47:aload_0         
	//   24   48:lconst_0        
	//   25   49:putfield        #88  <Field long zzba>
	//   26   52:return          
	}

	LocationRequest(int i, long l, long l1, boolean flag, long l2, int j, float f, long l3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void AbstractSafeParcelable()>
		priority = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #67  <Field int priority>
		zzaw = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #71  <Field long zzaw>
		zzax = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #75  <Field long zzax>
		zzay = flag;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #77  <Field boolean zzay>
		zzaf = l2;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #81  <Field long zzaf>
		zzx = j;
	//   17   32:aload_0         
	//   18   33:iload           9
	//   19   35:putfield        #84  <Field int zzx>
		zzaz = f;
	//   20   38:aload_0         
	//   21   39:fload           10
	//   22   41:putfield        #86  <Field float zzaz>
		zzba = l3;
	//   23   44:aload_0         
	//   24   45:lload           11
	//   25   47:putfield        #88  <Field long zzba>
	//   26   50:return          
	}

	public static LocationRequest create()
	{
		return new LocationRequest();
	//    0    0:new             #2   <Class LocationRequest>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void LocationRequest()>
	//    3    7:areturn         
	}

	private static void zza(long l)
	{
		if(l >= 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:iflt            7
		{
			return;
	//    4    6:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(38);
	//    5    7:new             #101 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:bipush          38
	//    8   13:invokespecial   #104 <Method void StringBuilder(int)>
	//    9   16:astore_2        
			stringbuilder.append("invalid interval: ");
	//   10   17:aload_2         
	//   11   18:ldc1            #106 <String "invalid interval: ">
	//   12   20:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   13   23:pop             
			stringbuilder.append(l);
	//   14   24:aload_2         
	//   15   25:lload_0         
	//   16   26:invokevirtual   #113 <Method StringBuilder StringBuilder.append(long)>
	//   17   29:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   30:new             #115 <Class IllegalArgumentException>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   22   38:invokespecial   #122 <Method void IllegalArgumentException(String)>
	//   23   41:athrow          
		}
	}

	public final boolean equals(Object obj)
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
		return priority == ((LocationRequest) (obj)).priority && zzaw == ((LocationRequest) (obj)).zzaw && zzax == ((LocationRequest) (obj)).zzax && zzay == ((LocationRequest) (obj)).zzay && zzaf == ((LocationRequest) (obj)).zzaf && zzx == ((LocationRequest) (obj)).zzx && zzaz == ((LocationRequest) (obj)).zzaz && getMaxWaitTime() == ((LocationRequest) (obj)).getMaxWaitTime();
	//   13   21:aload_0         
	//   14   22:getfield        #67  <Field int priority>
	//   15   25:aload_1         
	//   16   26:getfield        #67  <Field int priority>
	//   17   29:icmpne          116
	//   18   32:aload_0         
	//   19   33:getfield        #71  <Field long zzaw>
	//   20   36:aload_1         
	//   21   37:getfield        #71  <Field long zzaw>
	//   22   40:lcmp            
	//   23   41:ifne            116
	//   24   44:aload_0         
	//   25   45:getfield        #75  <Field long zzax>
	//   26   48:aload_1         
	//   27   49:getfield        #75  <Field long zzax>
	//   28   52:lcmp            
	//   29   53:ifne            116
	//   30   56:aload_0         
	//   31   57:getfield        #77  <Field boolean zzay>
	//   32   60:aload_1         
	//   33   61:getfield        #77  <Field boolean zzay>
	//   34   64:icmpne          116
	//   35   67:aload_0         
	//   36   68:getfield        #81  <Field long zzaf>
	//   37   71:aload_1         
	//   38   72:getfield        #81  <Field long zzaf>
	//   39   75:lcmp            
	//   40   76:ifne            116
	//   41   79:aload_0         
	//   42   80:getfield        #84  <Field int zzx>
	//   43   83:aload_1         
	//   44   84:getfield        #84  <Field int zzx>
	//   45   87:icmpne          116
	//   46   90:aload_0         
	//   47   91:getfield        #86  <Field float zzaz>
	//   48   94:aload_1         
	//   49   95:getfield        #86  <Field float zzaz>
	//   50   98:fcmpl           
	//   51   99:ifne            116
	//   52  102:aload_0         
	//   53  103:invokevirtual   #128 <Method long getMaxWaitTime()>
	//   54  106:aload_1         
	//   55  107:invokevirtual   #128 <Method long getMaxWaitTime()>
	//   56  110:lcmp            
	//   57  111:ifne            116
	//   58  114:iconst_1        
	//   59  115:ireturn         
	//   60  116:iconst_0        
	//   61  117:ireturn         
	}

	public final long getExpirationTime()
	{
		return zzaf;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field long zzaf>
	//    2    4:lreturn         
	}

	public final long getFastestInterval()
	{
		return zzax;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field long zzax>
	//    2    4:lreturn         
	}

	public final long getInterval()
	{
		return zzaw;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field long zzaw>
	//    2    4:lreturn         
	}

	public final long getMaxWaitTime()
	{
		long l1 = zzba;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field long zzba>
	//    2    4:lstore_3        
		long l2 = zzaw;
	//    3    5:aload_0         
	//    4    6:getfield        #71  <Field long zzaw>
	//    5    9:lstore          5
		long l = l1;
	//    6   11:lload_3         
	//    7   12:lstore_1        
		if(l1 < l2)
	//*   8   13:lload_3         
	//*   9   14:lload           5
	//*  10   16:lcmp            
	//*  11   17:ifge            23
			l = l2;
	//   12   20:lload           5
	//   13   22:lstore_1        
		return l;
	//   14   23:lload_1         
	//   15   24:lreturn         
	}

	public final int getNumUpdates()
	{
		return zzx;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int zzx>
	//    2    4:ireturn         
	}

	public final int getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int priority>
	//    2    4:ireturn         
	}

	public final float getSmallestDisplacement()
	{
		return zzaz;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field float zzaz>
	//    2    4:freturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(priority), Long.valueOf(zzaw), Float.valueOf(zzaz), Long.valueOf(zzba)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #67  <Field int priority>
	//    6   10:invokestatic    #145 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #71  <Field long zzaw>
	//   12   20:invokestatic    #150 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #86  <Field float zzaz>
	//   18   30:invokestatic    #155 <Method Float Float.valueOf(float)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #88  <Field long zzba>
	//   24   40:invokestatic    #150 <Method Long Long.valueOf(long)>
	//   25   43:aastore         
	//   26   44:invokestatic    #160 <Method int Objects.hashCode(Object[])>
	//   27   47:ireturn         
	}

	public final boolean isFastestIntervalExplicitlySet()
	{
		return zzay;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean zzay>
	//    2    4:ireturn         
	}

	public final LocationRequest setExpirationDuration(long l)
	{
		long l1 = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #169 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_3        
		if(l > 0xffffffffL - l1)
	//*   2    4:lload_1         
	//*   3    5:ldc2w           #78  <Long 0xffffffffL>
	//*   4    8:lload_3         
	//*   5    9:lsub            
	//*   6   10:lcmp            
	//*   7   11:ifle            24
			zzaf = 0xffffffffL;
	//    8   14:aload_0         
	//    9   15:ldc2w           #78  <Long 0xffffffffL>
	//   10   18:putfield        #81  <Field long zzaf>
		else
	//*  11   21:goto            31
			zzaf = l + l1;
	//   12   24:aload_0         
	//   13   25:lload_1         
	//   14   26:lload_3         
	//   15   27:ladd            
	//   16   28:putfield        #81  <Field long zzaf>
		if(zzaf < 0L)
	//*  17   31:aload_0         
	//*  18   32:getfield        #81  <Field long zzaf>
	//*  19   35:lconst_0        
	//*  20   36:lcmp            
	//*  21   37:ifge            45
			zzaf = 0L;
	//   22   40:aload_0         
	//   23   41:lconst_0        
	//   24   42:putfield        #81  <Field long zzaf>
		return this;
	//   25   45:aload_0         
	//   26   46:areturn         
	}

	public final LocationRequest setExpirationTime(long l)
	{
		zzaf = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #81  <Field long zzaf>
		if(zzaf < 0L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #81  <Field long zzaf>
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifge            19
			zzaf = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #81  <Field long zzaf>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public final LocationRequest setFastestInterval(long l)
	{
		zza(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #173 <Method void zza(long)>
		zzay = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #77  <Field boolean zzay>
		zzax = l;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #75  <Field long zzax>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public final LocationRequest setInterval(long l)
	{
		zza(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #173 <Method void zza(long)>
		zzaw = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #71  <Field long zzaw>
		if(!zzay)
	//*   5    9:aload_0         
	//*   6   10:getfield        #77  <Field boolean zzay>
	//*   7   13:ifne            30
			zzax = (long)((double)zzaw / 6D);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #71  <Field long zzaw>
	//   11   21:l2d             
	//   12   22:ldc2w           #175 <Double 6D>
	//   13   25:ddiv            
	//   14   26:d2l             
	//   15   27:putfield        #75  <Field long zzax>
		return this;
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public final LocationRequest setMaxWaitTime(long l)
	{
		zza(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #173 <Method void zza(long)>
		zzba = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #88  <Field long zzba>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public final LocationRequest setNumUpdates(int i)
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            11
		{
			zzx = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #84  <Field int zzx>
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(31);
	//    7   11:new             #101 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:bipush          31
	//   10   17:invokespecial   #104 <Method void StringBuilder(int)>
	//   11   20:astore_2        
			stringbuilder.append("invalid numUpdates: ");
	//   12   21:aload_2         
	//   13   22:ldc1            #181 <String "invalid numUpdates: ">
	//   14   24:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
			stringbuilder.append(i);
	//   16   28:aload_2         
	//   17   29:iload_1         
	//   18   30:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
	//   19   33:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   34:new             #115 <Class IllegalArgumentException>
	//   21   37:dup             
	//   22   38:aload_2         
	//   23   39:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #122 <Method void IllegalArgumentException(String)>
	//   25   45:athrow          
		}
	}

	public final LocationRequest setPriority(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     100 105: default 40
	//	               100 75
	//	               101 40
	//	               102 75
	//	               103 40
	//	               104 75
	//	               105 75
		case 101: // 'e'
		case 103: // 'g'
		default:
			StringBuilder stringbuilder = new StringBuilder(28);
	//    2   40:new             #101 <Class StringBuilder>
	//    3   43:dup             
	//    4   44:bipush          28
	//    5   46:invokespecial   #104 <Method void StringBuilder(int)>
	//    6   49:astore_2        
			stringbuilder.append("invalid quality: ");
	//    7   50:aload_2         
	//    8   51:ldc1            #187 <String "invalid quality: ">
	//    9   53:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   10   56:pop             
			stringbuilder.append(i);
	//   11   57:aload_2         
	//   12   58:iload_1         
	//   13   59:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
	//   14   62:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   15   63:new             #115 <Class IllegalArgumentException>
	//   16   66:dup             
	//   17   67:aload_2         
	//   18   68:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   19   71:invokespecial   #122 <Method void IllegalArgumentException(String)>
	//   20   74:athrow          

		case 100: // 'd'
		case 102: // 'f'
		case 104: // 'h'
		case 105: // 'i'
			priority = i;
	//   21   75:aload_0         
	//   22   76:iload_1         
	//   23   77:putfield        #67  <Field int priority>
			break;
		}
		return this;
	//   24   80:aload_0         
	//   25   81:areturn         
	}

	public final LocationRequest setSmallestDisplacement(float f)
	{
		if(f >= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            13
		{
			zzaz = f;
	//    4    6:aload_0         
	//    5    7:fload_1         
	//    6    8:putfield        #86  <Field float zzaz>
			return this;
	//    7   11:aload_0         
	//    8   12:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(37);
	//    9   13:new             #101 <Class StringBuilder>
	//   10   16:dup             
	//   11   17:bipush          37
	//   12   19:invokespecial   #104 <Method void StringBuilder(int)>
	//   13   22:astore_2        
			stringbuilder.append("invalid displacement: ");
	//   14   23:aload_2         
	//   15   24:ldc1            #191 <String "invalid displacement: ">
	//   16   26:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   17   29:pop             
			stringbuilder.append(f);
	//   18   30:aload_2         
	//   19   31:fload_1         
	//   20   32:invokevirtual   #194 <Method StringBuilder StringBuilder.append(float)>
	//   21   35:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   22   36:new             #115 <Class IllegalArgumentException>
	//   23   39:dup             
	//   24   40:aload_2         
	//   25   41:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   26   44:invokespecial   #122 <Method void IllegalArgumentException(String)>
	//   27   47:athrow          
		}
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #101 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #195 <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("Request[");
	//    4    9:aload           6
	//    5   11:ldc1            #197 <String "Request[">
	//    6   13:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		String s;
		switch(priority)
	//*   8   17:aload_0         
	//*   9   18:getfield        #67  <Field int priority>
		{
	//*  10   21:tableswitch     100 105: default 60
	//	               100 88
	//	               101 60
	//	               102 81
	//	               103 60
	//	               104 74
	//	               105 67
		case 101: // 'e'
		case 103: // 'g'
		default:
			s = "???";
	//   11   60:ldc1            #199 <String "???">
	//   12   62:astore          5
			break;

	//*  13   64:goto            92
		case 105: // 'i'
			s = "PRIORITY_NO_POWER";
	//   14   67:ldc1            #200 <String "PRIORITY_NO_POWER">
	//   15   69:astore          5
			break;

	//*  16   71:goto            92
		case 104: // 'h'
			s = "PRIORITY_LOW_POWER";
	//   17   74:ldc1            #201 <String "PRIORITY_LOW_POWER">
	//   18   76:astore          5
			break;

	//*  19   78:goto            92
		case 102: // 'f'
			s = "PRIORITY_BALANCED_POWER_ACCURACY";
	//   20   81:ldc1            #202 <String "PRIORITY_BALANCED_POWER_ACCURACY">
	//   21   83:astore          5
			break;

	//*  22   85:goto            92
		case 100: // 'd'
			s = "PRIORITY_HIGH_ACCURACY";
	//   23   88:ldc1            #203 <String "PRIORITY_HIGH_ACCURACY">
	//   24   90:astore          5
			break;
		}
		stringbuilder.append(s);
	//   25   92:aload           6
	//   26   94:aload           5
	//   27   96:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   28   99:pop             
		if(priority != 105)
	//*  29  100:aload_0         
	//*  30  101:getfield        #67  <Field int priority>
	//*  31  104:bipush          105
	//*  32  106:icmpeq          135
		{
			stringbuilder.append(" requested=");
	//   33  109:aload           6
	//   34  111:ldc1            #205 <String " requested=">
	//   35  113:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   36  116:pop             
			stringbuilder.append(zzaw);
	//   37  117:aload           6
	//   38  119:aload_0         
	//   39  120:getfield        #71  <Field long zzaw>
	//   40  123:invokevirtual   #113 <Method StringBuilder StringBuilder.append(long)>
	//   41  126:pop             
			stringbuilder.append("ms");
	//   42  127:aload           6
	//   43  129:ldc1            #207 <String "ms">
	//   44  131:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   45  134:pop             
		}
		stringbuilder.append(" fastest=");
	//   46  135:aload           6
	//   47  137:ldc1            #209 <String " fastest=">
	//   48  139:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   49  142:pop             
		stringbuilder.append(zzax);
	//   50  143:aload           6
	//   51  145:aload_0         
	//   52  146:getfield        #75  <Field long zzax>
	//   53  149:invokevirtual   #113 <Method StringBuilder StringBuilder.append(long)>
	//   54  152:pop             
		stringbuilder.append("ms");
	//   55  153:aload           6
	//   56  155:ldc1            #207 <String "ms">
	//   57  157:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   58  160:pop             
		if(zzba > zzaw)
	//*  59  161:aload_0         
	//*  60  162:getfield        #88  <Field long zzba>
	//*  61  165:aload_0         
	//*  62  166:getfield        #71  <Field long zzaw>
	//*  63  169:lcmp            
	//*  64  170:ifle            199
		{
			stringbuilder.append(" maxWait=");
	//   65  173:aload           6
	//   66  175:ldc1            #211 <String " maxWait=">
	//   67  177:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   68  180:pop             
			stringbuilder.append(zzba);
	//   69  181:aload           6
	//   70  183:aload_0         
	//   71  184:getfield        #88  <Field long zzba>
	//   72  187:invokevirtual   #113 <Method StringBuilder StringBuilder.append(long)>
	//   73  190:pop             
			stringbuilder.append("ms");
	//   74  191:aload           6
	//   75  193:ldc1            #207 <String "ms">
	//   76  195:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   77  198:pop             
		}
		if(zzaz > 0.0F)
	//*  78  199:aload_0         
	//*  79  200:getfield        #86  <Field float zzaz>
	//*  80  203:fconst_0        
	//*  81  204:fcmpl           
	//*  82  205:ifle            234
		{
			stringbuilder.append(" smallestDisplacement=");
	//   83  208:aload           6
	//   84  210:ldc1            #213 <String " smallestDisplacement=">
	//   85  212:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   86  215:pop             
			stringbuilder.append(zzaz);
	//   87  216:aload           6
	//   88  218:aload_0         
	//   89  219:getfield        #86  <Field float zzaz>
	//   90  222:invokevirtual   #194 <Method StringBuilder StringBuilder.append(float)>
	//   91  225:pop             
			stringbuilder.append("m");
	//   92  226:aload           6
	//   93  228:ldc1            #215 <String "m">
	//   94  230:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   95  233:pop             
		}
		long l = zzaf;
	//   96  234:aload_0         
	//   97  235:getfield        #81  <Field long zzaf>
	//   98  238:lstore_1        
		if(l != 0xffffffffL)
	//*  99  239:lload_1         
	//* 100  240:ldc2w           #78  <Long 0xffffffffL>
	//* 101  243:lcmp            
	//* 102  244:ifeq            276
		{
			long l1 = SystemClock.elapsedRealtime();
	//  103  247:invokestatic    #169 <Method long SystemClock.elapsedRealtime()>
	//  104  250:lstore_3        
			stringbuilder.append(" expireIn=");
	//  105  251:aload           6
	//  106  253:ldc1            #217 <String " expireIn=">
	//  107  255:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  108  258:pop             
			stringbuilder.append(l - l1);
	//  109  259:aload           6
	//  110  261:lload_1         
	//  111  262:lload_3         
	//  112  263:lsub            
	//  113  264:invokevirtual   #113 <Method StringBuilder StringBuilder.append(long)>
	//  114  267:pop             
			stringbuilder.append("ms");
	//  115  268:aload           6
	//  116  270:ldc1            #207 <String "ms">
	//  117  272:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  118  275:pop             
		}
		if(zzx != 0x7fffffff)
	//* 119  276:aload_0         
	//* 120  277:getfield        #84  <Field int zzx>
	//* 121  280:ldc1            #82  <Int 0x7fffffff>
	//* 122  282:icmpeq          303
		{
			stringbuilder.append(" num=");
	//  123  285:aload           6
	//  124  287:ldc1            #219 <String " num=">
	//  125  289:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  126  292:pop             
			stringbuilder.append(zzx);
	//  127  293:aload           6
	//  128  295:aload_0         
	//  129  296:getfield        #84  <Field int zzx>
	//  130  299:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
	//  131  302:pop             
		}
		stringbuilder.append(']');
	//  132  303:aload           6
	//  133  305:bipush          93
	//  134  307:invokevirtual   #222 <Method StringBuilder StringBuilder.append(char)>
	//  135  310:pop             
		return stringbuilder.toString();
	//  136  311:aload           6
	//  137  313:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  138  316:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #230 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, priority);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #67  <Field int priority>
	//    7   11:invokestatic    #234 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 2, zzaw);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #71  <Field long zzaw>
	//   12   20:invokestatic    #238 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeLong(parcel, 3, zzax);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #75  <Field long zzax>
	//   17   29:invokestatic    #238 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeBoolean(parcel, 4, zzay);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #77  <Field boolean zzay>
	//   22   38:invokestatic    #242 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeLong(parcel, 5, zzaf);
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:getfield        #81  <Field long zzaf>
	//   27   47:invokestatic    #238 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeInt(parcel, 6, zzx);
	//   28   50:aload_1         
	//   29   51:bipush          6
	//   30   53:aload_0         
	//   31   54:getfield        #84  <Field int zzx>
	//   32   57:invokestatic    #234 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeFloat(parcel, 7, zzaz);
	//   33   60:aload_1         
	//   34   61:bipush          7
	//   35   63:aload_0         
	//   36   64:getfield        #86  <Field float zzaz>
	//   37   67:invokestatic    #246 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeLong(parcel, 8, zzba);
	//   38   70:aload_1         
	//   39   71:bipush          8
	//   40   73:aload_0         
	//   41   74:getfield        #88  <Field long zzba>
	//   42   77:invokestatic    #238 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   43   80:aload_1         
	//   44   81:iload_2         
	//   45   82:invokestatic    #249 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   46   85:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzab();
	public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
	public static final int PRIORITY_HIGH_ACCURACY = 100;
	public static final int PRIORITY_LOW_POWER = 104;
	public static final int PRIORITY_NO_POWER = 105;
	private int priority;
	private long zzaf;
	private long zzaw;
	private long zzax;
	private boolean zzay;
	private float zzaz;
	private long zzba;
	private int zzx;

	static 
	{
	//    0    0:new             #58  <Class zzab>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void zzab()>
	//    3    7:putstatic       #63  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
