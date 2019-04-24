// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzn

public final class LocationResult extends zza
	implements ReflectedParcelable
{

	LocationResult(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zza()>
		zzbka = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field List zzbka>
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
			list1 = zzbjZ;
	//    4    6:getstatic       #23  <Field List zzbjZ>
	//    5    9:astore_1        
		return new LocationResult(list1);
	//    6   10:new             #2   <Class LocationResult>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #41  <Method void LocationResult(List)>
	//   10   18:areturn         
	}

	public static LocationResult extractResult(Intent intent)
	{
		if(!hasResult(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #48  <Method boolean hasResult(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (LocationResult)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
	//    5    9:aload_0         
	//    6   10:invokevirtual   #54  <Method Bundle Intent.getExtras()>
	//    7   13:ldc1            #56  <String "com.google.android.gms.location.EXTRA_LOCATION_RESULT">
	//    8   15:invokevirtual   #62  <Method android.os.Parcelable Bundle.getParcelable(String)>
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
	//    5    7:ldc1            #56  <String "com.google.android.gms.location.EXTRA_LOCATION_RESULT">
	//    6    9:invokevirtual   #66  <Method boolean Intent.hasExtra(String)>
	//    7   12:ireturn         
	}

	public boolean equals(Object obj)
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
		if(((LocationResult) (obj)).zzbka.size() != zzbka.size())
	//*   8   14:aload_1         
	//*   9   15:getfield        #35  <Field List zzbka>
	//*  10   18:invokeinterface #74  <Method int List.size()>
	//*  11   23:aload_0         
	//*  12   24:getfield        #35  <Field List zzbka>
	//*  13   27:invokeinterface #74  <Method int List.size()>
	//*  14   32:icmpeq          37
			return false;
	//   15   35:iconst_0        
	//   16   36:ireturn         
		obj = ((Object) (((LocationResult) (obj)).zzbka.iterator()));
	//   17   37:aload_1         
	//   18   38:getfield        #35  <Field List zzbka>
	//   19   41:invokeinterface #78  <Method Iterator List.iterator()>
	//   20   46:astore_1        
		Iterator iterator = zzbka.iterator();
	//   21   47:aload_0         
	//   22   48:getfield        #35  <Field List zzbka>
	//   23   51:invokeinterface #78  <Method Iterator List.iterator()>
	//   24   56:astore_2        
		while(((Iterator) (obj)).hasNext()) 
	//*  25   57:aload_1         
	//*  26   58:invokeinterface #84  <Method boolean Iterator.hasNext()>
	//*  27   63:ifeq            105
		{
			Location location = (Location)iterator.next();
	//   28   66:aload_2         
	//   29   67:invokeinterface #88  <Method Object Iterator.next()>
	//   30   72:checkcast       #90  <Class Location>
	//   31   75:astore_3        
			Location location1 = (Location)((Iterator) (obj)).next();
	//   32   76:aload_1         
	//   33   77:invokeinterface #88  <Method Object Iterator.next()>
	//   34   82:checkcast       #90  <Class Location>
	//   35   85:astore          4
			if(location.getTime() != location1.getTime())
	//*  36   87:aload_3         
	//*  37   88:invokevirtual   #94  <Method long Location.getTime()>
	//*  38   91:aload           4
	//*  39   93:invokevirtual   #94  <Method long Location.getTime()>
	//*  40   96:lcmp            
	//*  41   97:ifeq            102
				return false;
	//   42  100:iconst_0        
	//   43  101:ireturn         
		}
	//*  44  102:goto            57
		return true;
	//   45  105:iconst_1        
	//   46  106:ireturn         
	}

	public Location getLastLocation()
	{
		int i = zzbka.size();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzbka>
	//    2    4:invokeinterface #74  <Method int List.size()>
	//    3    9:istore_1        
		if(i == 0)
	//*   4   10:iload_1         
	//*   5   11:ifne            16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		else
			return (Location)zzbka.get(i - 1);
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field List zzbka>
	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:invokeinterface #100 <Method Object List.get(int)>
	//   14   28:checkcast       #90  <Class Location>
	//   15   31:areturn         
	}

	public List getLocations()
	{
		return zzbka;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzbka>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int i = 17;
	//    0    0:bipush          17
	//    1    2:istore_1        
		for(Iterator iterator = zzbka.iterator(); iterator.hasNext();)
	//*   2    3:aload_0         
	//*   3    4:getfield        #35  <Field List zzbka>
	//*   4    7:invokeinterface #78  <Method Iterator List.iterator()>
	//*   5   12:astore          4
	//*   6   14:aload           4
	//*   7   16:invokeinterface #84  <Method boolean Iterator.hasNext()>
	//*   8   21:ifeq            54
		{
			long l = ((Location)iterator.next()).getTime();
	//    9   24:aload           4
	//   10   26:invokeinterface #88  <Method Object Iterator.next()>
	//   11   31:checkcast       #90  <Class Location>
	//   12   34:invokevirtual   #94  <Method long Location.getTime()>
	//   13   37:lstore_2        
			i = i * 31 + (int)(l >>> 32 ^ l);
	//   14   38:iload_1         
	//   15   39:bipush          31
	//   16   41:imul            
	//   17   42:lload_2         
	//   18   43:bipush          32
	//   19   45:lushr           
	//   20   46:lload_2         
	//   21   47:lxor            
	//   22   48:l2i             
	//   23   49:iadd            
	//   24   50:istore_1        
		}

	//*  25   51:goto            14
		return i;
	//   26   54:iload_1         
	//   27   55:ireturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (zzbka)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzbka>
	//    2    4:invokestatic    #113 <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 27)).append("LocationResult[locations: ").append(s).append("]").toString();
	//    4    8:new             #115 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #113 <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #118 <Method int String.length()>
	//    9   19:bipush          27
	//   10   21:iadd            
	//   11   22:invokespecial   #121 <Method void StringBuilder(int)>
	//   12   25:ldc1            #123 <String "LocationResult[locations: ">
	//   13   27:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:ldc1            #129 <String "]">
	//   17   36:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   18   39:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   19   42:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzn.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #137 <Method void com.google.android.gms.location.zzn.zza(LocationResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzn();
	static final List zzbjZ = Collections.emptyList();
	private final List zzbka;

	static 
	{
	//    0    0:invokestatic    #21  <Method List Collections.emptyList()>
	//    1    3:putstatic       #23  <Field List zzbjZ>
	//    2    6:new             #25  <Class zzn>
	//    3    9:dup             
	//    4   10:invokespecial   #28  <Method void zzn()>
	//    5   13:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   6   16:return          
	}
}
