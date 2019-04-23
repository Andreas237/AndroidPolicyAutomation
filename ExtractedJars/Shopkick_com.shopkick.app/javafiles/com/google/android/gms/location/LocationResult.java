// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzac

public final class LocationResult extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	LocationResult(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void AbstractSafeParcelable()>
		zzbc = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field List zzbc>
	//    5    9:return          
	}

	public static LocationResult create(List list)
	{
		List list1 = list;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(list == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       10
			list1 = zzbb;
	//    4    6:getstatic       #36  <Field List zzbb>
	//    5    9:astore_1        
		return new LocationResult(list1);
	//    6   10:new             #2   <Class LocationResult>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #58  <Method void LocationResult(List)>
	//   10   18:areturn         
	}

	public static LocationResult extractResult(Intent intent)
	{
		if(!hasResult(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #65  <Method boolean hasResult(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (LocationResult)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
	//    5    9:aload_0         
	//    6   10:invokevirtual   #71  <Method Bundle Intent.getExtras()>
	//    7   13:ldc1            #73  <String "com.google.android.gms.location.EXTRA_LOCATION_RESULT">
	//    8   15:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    9   18:checkcast       #2   <Class LocationResult>
	//   10   21:areturn         
	}

	public static boolean hasResult(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
	//    4    6:aload_0         
	//    5    7:ldc1            #73  <String "com.google.android.gms.location.EXTRA_LOCATION_RESULT">
	//    6    9:invokevirtual   #83  <Method boolean Intent.hasExtra(String)>
	//    7   12:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof LocationResult))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class LocationResult>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((LocationResult)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class LocationResult>
	//    7   13:astore_1        
		if(((LocationResult) (obj)).zzbc.size() != zzbc.size())
	//*   8   14:aload_1         
	//*   9   15:getfield        #50  <Field List zzbc>
	//*  10   18:invokeinterface #91  <Method int List.size()>
	//*  11   23:aload_0         
	//*  12   24:getfield        #50  <Field List zzbc>
	//*  13   27:invokeinterface #91  <Method int List.size()>
	//*  14   32:icmpeq          37
			return false;
	//   15   35:iconst_0        
	//   16   36:ireturn         
		obj = ((Object) (((LocationResult) (obj)).zzbc.iterator()));
	//   17   37:aload_1         
	//   18   38:getfield        #50  <Field List zzbc>
	//   19   41:invokeinterface #95  <Method Iterator List.iterator()>
	//   20   46:astore_1        
		Iterator iterator = zzbc.iterator();
	//   21   47:aload_0         
	//   22   48:getfield        #50  <Field List zzbc>
	//   23   51:invokeinterface #95  <Method Iterator List.iterator()>
	//   24   56:astore_2        
		while(((Iterator) (obj)).hasNext()) 
	//*  25   57:aload_1         
	//*  26   58:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  27   63:ifeq            102
		{
			Location location = (Location)iterator.next();
	//   28   66:aload_2         
	//   29   67:invokeinterface #105 <Method Object Iterator.next()>
	//   30   72:checkcast       #107 <Class Location>
	//   31   75:astore_3        
			Location location1 = (Location)((Iterator) (obj)).next();
	//   32   76:aload_1         
	//   33   77:invokeinterface #105 <Method Object Iterator.next()>
	//   34   82:checkcast       #107 <Class Location>
	//   35   85:astore          4
			if(location.getTime() != location1.getTime())
	//*  36   87:aload_3         
	//*  37   88:invokevirtual   #111 <Method long Location.getTime()>
	//*  38   91:aload           4
	//*  39   93:invokevirtual   #111 <Method long Location.getTime()>
	//*  40   96:lcmp            
	//*  41   97:ifeq            57
				return false;
	//   42  100:iconst_0        
	//   43  101:ireturn         
		}
		return true;
	//   44  102:iconst_1        
	//   45  103:ireturn         
	}

	public final Location getLastLocation()
	{
		int i = zzbc.size();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List zzbc>
	//    2    4:invokeinterface #91  <Method int List.size()>
	//    3    9:istore_1        
		if(i == 0)
	//*   4   10:iload_1         
	//*   5   11:ifne            16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		else
			return (Location)zzbc.get(i - 1);
	//    8   16:aload_0         
	//    9   17:getfield        #50  <Field List zzbc>
	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:invokeinterface #117 <Method Object List.get(int)>
	//   14   28:checkcast       #107 <Class Location>
	//   15   31:areturn         
	}

	public final List getLocations()
	{
		return zzbc;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List zzbc>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		Iterator iterator = zzbc.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List zzbc>
	//    2    4:invokeinterface #95  <Method Iterator List.iterator()>
	//    3    9:astore          4
		int i;
		long l;
		for(i = 17; iterator.hasNext(); i = i * 31 + (int)(l ^ l >>> 32))
	//*   4   11:bipush          17
	//*   5   13:istore_1        
	//*   6   14:aload           4
	//*   7   16:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*   8   21:ifeq            54
			l = ((Location)iterator.next()).getTime();
	//    9   24:aload           4
	//   10   26:invokeinterface #105 <Method Object Iterator.next()>
	//   11   31:checkcast       #107 <Class Location>
	//   12   34:invokevirtual   #111 <Method long Location.getTime()>
	//   13   37:lstore_2        

	//   14   38:iload_1         
	//   15   39:bipush          31
	//   16   41:imul            
	//   17   42:lload_2         
	//   18   43:lload_2         
	//   19   44:bipush          32
	//   20   46:lushr           
	//   21   47:lxor            
	//   22   48:l2i             
	//   23   49:iadd            
	//   24   50:istore_1        
	//*  25   51:goto            14
		return i;
	//   26   54:iload_1         
	//   27   55:ireturn         
	}

	public final String toString()
	{
		String s = String.valueOf(((Object) (zzbc)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List zzbc>
	//    2    4:invokestatic    #128 <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 27);
	//    4    8:new             #130 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #128 <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #133 <Method int String.length()>
	//    9   19:bipush          27
	//   10   21:iadd            
	//   11   22:invokespecial   #136 <Method void StringBuilder(int)>
	//   12   25:astore_2        
		stringbuilder.append("LocationResult[locations: ");
	//   13   26:aload_2         
	//   14   27:ldc1            #138 <String "LocationResult[locations: ">
	//   15   29:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(s);
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append("]");
	//   21   39:aload_2         
	//   22   40:ldc1            #144 <String "]">
	//   23   42:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		return stringbuilder.toString();
	//   25   46:aload_2         
	//   26   47:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   27   50:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeTypedList(parcel, 1, getLocations(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #156 <Method List getLocations()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #160 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #163 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzac();
	static final List zzbb = Collections.emptyList();
	private final List zzbc;

	static 
	{
	//    0    0:invokestatic    #34  <Method List Collections.emptyList()>
	//    1    3:putstatic       #36  <Field List zzbb>
	//    2    6:new             #38  <Class zzac>
	//    3    9:dup             
	//    4   10:invokespecial   #41  <Method void zzac()>
	//    5   13:putstatic       #43  <Field android.os.Parcelable$Creator CREATOR>
	//*   6   16:return          
	}
}
