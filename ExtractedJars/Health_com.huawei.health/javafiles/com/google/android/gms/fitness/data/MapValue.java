// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzt

public class MapValue extends zza
	implements ReflectedParcelable
{

	public MapValue(int i, float f)
	{
		this(1, i, f);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:fload_2         
	//    4    4:invokespecial   #28  <Method void MapValue(int, int, float)>
	//    5    7:return          
	}

	MapValue(int i, int j, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int zzaiI>
		zzaTY = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #33  <Field int zzaTY>
		zzaTZ = f;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #35  <Field float zzaTZ>
	//   11   19:return          
	}

	private boolean zza(MapValue mapvalue)
	{
		if(zzaTY == mapvalue.zzaTY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int zzaTY>
	//*   2    4:aload_1         
	//*   3    5:getfield        #33  <Field int zzaTY>
	//*   4    8:icmpne          67
		{
			switch(zzaTY)
	//*   5   11:aload_0         
	//*   6   12:getfield        #33  <Field int zzaTY>
			{
	//*   7   15:lookupswitch    1: default 32
	//	               2: 35
	//*   8   32:goto            51
			case 2: // '\002'
				return asFloat() == mapvalue.asFloat();
	//    9   35:aload_0         
	//   10   36:invokevirtual   #41  <Method float asFloat()>
	//   11   39:aload_1         
	//   12   40:invokevirtual   #41  <Method float asFloat()>
	//   13   43:fcmpl           
	//   14   44:ifne            49
	//   15   47:iconst_1        
	//   16   48:ireturn         
	//   17   49:iconst_0        
	//   18   50:ireturn         
			}
			return zzaTZ == mapvalue.zzaTZ;
	//   19   51:aload_0         
	//   20   52:getfield        #35  <Field float zzaTZ>
	//   21   55:aload_1         
	//   22   56:getfield        #35  <Field float zzaTZ>
	//   23   59:fcmpl           
	//   24   60:ifne            65
	//   25   63:iconst_1        
	//   26   64:ireturn         
	//   27   65:iconst_0        
	//   28   66:ireturn         
		} else
		{
			return false;
	//   29   67:iconst_0        
	//   30   68:ireturn         
		}
	}

	public static MapValue zzd(float f)
	{
		return new MapValue(2, f);
	//    0    0:new             #2   <Class MapValue>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:fload_0         
	//    4    6:invokespecial   #45  <Method void MapValue(int, float)>
	//    5    9:areturn         
	}

	public float asFloat()
	{
		boolean flag;
		if(zzaTY == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int zzaTY>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		zzac.zza(flag, "Value is not in float format");
	//    9   15:iload_1         
	//   10   16:ldc1            #47  <String "Value is not in float format">
	//   11   18:invokestatic    #52  <Method void zzac.zza(boolean, Object)>
		return zzaTZ;
	//   12   21:aload_0         
	//   13   22:getfield        #35  <Field float zzaTZ>
	//   14   25:freturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof MapValue) && zza((MapValue)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class MapValue>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class MapValue>
	//    9   17:invokespecial   #56  <Method boolean zza(MapValue)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	int getFormat()
	{
		return zzaTY;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzaTY>
	//    2    4:ireturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return (int)zzaTZ;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float zzaTZ>
	//    2    4:f2i             
	//    3    5:ireturn         
	}

	public String toString()
	{
		switch(zzaTY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int zzaTY>
		{
	//*   2    4:lookupswitch    1: default 24
	//	               2: 27
	//*   3   24:goto            35
		case 2: // '\002'
			return Float.toString(asFloat());
	//    4   27:aload_0         
	//    5   28:invokevirtual   #41  <Method float asFloat()>
	//    6   31:invokestatic    #67  <Method String Float.toString(float)>
	//    7   34:areturn         
		}
		return "unknown";
	//    8   35:ldc1            #69  <String "unknown">
	//    9   37:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzt.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #74  <Method void com.google.android.gms.fitness.data.zzt.zza(MapValue, Parcel, int)>
	//    4    6:return          
	}

	float zzCx()
	{
		return zzaTZ;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float zzaTZ>
	//    2    4:freturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzt();
	private final int zzaTY;
	private final float zzaTZ;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #18  <Class zzt>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzt()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
