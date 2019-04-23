// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;

import android.location.Location;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.internal:
//			RadarState

public final class Moving extends RadarState
{

	public Moving(Location location1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
	//    0    0:aload_1         
	//    1    1:ldc1            #33  <String "location">
	//    2    3:invokestatic    #39  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:invokespecial   #42  <Method void RadarState(kotlin.jvm.internal.DefaultConstructorMarker)>
		location = location1;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #44  <Field Location location>
	//    9   16:return          
	}

	public static Moving copy$default(Moving moving, Location location1, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			location1 = moving.getLocation();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #50  <Method Location getLocation()>
	//    6   10:astore_1        
		return moving.copy(location1);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #53  <Method Moving copy(Location)>
	//   10   16:areturn         
	}

	public final Location component1()
	{
		return getLocation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method Location getLocation()>
	//    2    4:areturn         
	}

	public final Moving copy(Location location1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
	//    0    0:aload_1         
	//    1    1:ldc1            #33  <String "location">
	//    2    3:invokestatic    #39  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return new Moving(location1);
	//    3    6:new             #2   <Class Moving>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:invokespecial   #56  <Method void Moving(Location)>
	//    7   14:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			if(this == obj)
				break label0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       36
			if(obj instanceof Moving)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #2   <Class Moving>
	//*   5    9:ifeq            34
			{
				obj = ((Object) ((Moving)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class Moving>
	//    8   16:astore_1        
				if(Intrinsics.areEqual(((Object) (getLocation())), ((Object) (((Moving) (obj)).getLocation()))))
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #50  <Method Location getLocation()>
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #50  <Method Location getLocation()>
	//*  13   25:invokestatic    #62  <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  14   28:ifeq            34
					break label0;
	//   15   31:goto            36
			}
			return false;
	//   16   34:iconst_0        
	//   17   35:ireturn         
		}
		return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
	}

	public Location getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Location location>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Location location1 = getLocation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method Location getLocation()>
	//    2    4:astore_1        
		if(location1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return ((Object) (location1)).hashCode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #67  <Method int Object.hashCode()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #70  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Moving(location=");
	//    4    8:aload_1         
	//    5    9:ldc1            #75  <String "Moving(location=">
	//    6   11:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (getLocation())));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #50  <Method Location getLocation()>
	//   11   20:invokevirtual   #82  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(")");
	//   13   24:aload_1         
	//   14   25:ldc1            #84  <String ")">
	//   15   27:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private final Location location;
}
