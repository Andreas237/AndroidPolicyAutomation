// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.location.Location;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.api:
//			RadarResponse

public final class Success extends RadarResponse
{

	public Success(JSONObject jsonobject, Location location1, RadarEvent aradarevent[], RadarUser radaruser)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "payload");
	//    0    0:aload_1         
	//    1    1:ldc1            #50  <String "payload">
	//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
	//    3    6:aload_2         
	//    4    7:ldc1            #57  <String "location">
	//    5    9:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (aradarevent)), "events");
	//    6   12:aload_3         
	//    7   13:ldc1            #58  <String "events">
	//    8   15:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (radaruser)), "user");
	//    9   18:aload           4
	//   10   20:ldc1            #59  <String "user">
	//   11   22:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//   12   25:aload_0         
	//   13   26:aconst_null     
	//   14   27:invokespecial   #62  <Method void RadarResponse(kotlin.jvm.internal.DefaultConstructorMarker)>
		payload = jsonobject;
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:putfield        #64  <Field JSONObject payload>
		location = location1;
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:putfield        #66  <Field Location location>
		events = aradarevent;
	//   21   40:aload_0         
	//   22   41:aload_3         
	//   23   42:putfield        #68  <Field RadarEvent[] events>
		user = radaruser;
	//   24   45:aload_0         
	//   25   46:aload           4
	//   26   48:putfield        #70  <Field RadarUser user>
	//   27   51:return          
	}

	public static Success copy$default(Success success, JSONObject jsonobject, Location location1, RadarEvent aradarevent[], RadarUser radaruser, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload           5
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            12
			jsonobject = success.payload;
	//    4    7:aload_0         
	//    5    8:getfield        #64  <Field JSONObject payload>
	//    6   11:astore_1        
		if((i & 2) != 0)
	//*   7   12:iload           5
	//*   8   14:iconst_2        
	//*   9   15:iand            
	//*  10   16:ifeq            24
			location1 = success.location;
	//   11   19:aload_0         
	//   12   20:getfield        #66  <Field Location location>
	//   13   23:astore_2        
		if((i & 4) != 0)
	//*  14   24:iload           5
	//*  15   26:iconst_4        
	//*  16   27:iand            
	//*  17   28:ifeq            36
			aradarevent = success.events;
	//   18   31:aload_0         
	//   19   32:getfield        #68  <Field RadarEvent[] events>
	//   20   35:astore_3        
		if((i & 8) != 0)
	//*  21   36:iload           5
	//*  22   38:bipush          8
	//*  23   40:iand            
	//*  24   41:ifeq            50
			radaruser = success.user;
	//   25   44:aload_0         
	//   26   45:getfield        #70  <Field RadarUser user>
	//   27   48:astore          4
		return success.copy(jsonobject, location1, aradarevent, radaruser);
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:aload_2         
	//   31   53:aload_3         
	//   32   54:aload           4
	//   33   56:invokevirtual   #76  <Method Success copy(JSONObject, Location, RadarEvent[], RadarUser)>
	//   34   59:areturn         
	}

	public final JSONObject component1()
	{
		return payload;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONObject payload>
	//    2    4:areturn         
	}

	public final Location component2()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Location location>
	//    2    4:areturn         
	}

	public final RadarEvent[] component3()
	{
		return events;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field RadarEvent[] events>
	//    2    4:areturn         
	}

	public final RadarUser component4()
	{
		return user;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field RadarUser user>
	//    2    4:areturn         
	}

	public final Success copy(JSONObject jsonobject, Location location1, RadarEvent aradarevent[], RadarUser radaruser)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "payload");
	//    0    0:aload_1         
	//    1    1:ldc1            #50  <String "payload">
	//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
	//    3    6:aload_2         
	//    4    7:ldc1            #57  <String "location">
	//    5    9:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (aradarevent)), "events");
	//    6   12:aload_3         
	//    7   13:ldc1            #58  <String "events">
	//    8   15:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (radaruser)), "user");
	//    9   18:aload           4
	//   10   20:ldc1            #59  <String "user">
	//   11   22:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return new Success(jsonobject, location1, aradarevent, radaruser);
	//   12   25:new             #2   <Class Success>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:aload_3         
	//   17   32:aload           4
	//   18   34:invokespecial   #79  <Method void Success(JSONObject, Location, RadarEvent[], RadarUser)>
	//   19   37:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			if(this == obj)
				break label0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       78
			if(obj instanceof Success)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #2   <Class Success>
	//*   5    9:ifeq            76
			{
				obj = ((Object) ((Success)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class Success>
	//    8   16:astore_1        
				if(Intrinsics.areEqual(((Object) (payload)), ((Object) (((Success) (obj)).payload))) && Intrinsics.areEqual(((Object) (location)), ((Object) (((Success) (obj)).location))) && Intrinsics.areEqual(((Object) (events)), ((Object) (((Success) (obj)).events))) && Intrinsics.areEqual(((Object) (user)), ((Object) (((Success) (obj)).user))))
	//*   9   17:aload_0         
	//*  10   18:getfield        #64  <Field JSONObject payload>
	//*  11   21:aload_1         
	//*  12   22:getfield        #64  <Field JSONObject payload>
	//*  13   25:invokestatic    #85  <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  14   28:ifeq            76
	//*  15   31:aload_0         
	//*  16   32:getfield        #66  <Field Location location>
	//*  17   35:aload_1         
	//*  18   36:getfield        #66  <Field Location location>
	//*  19   39:invokestatic    #85  <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  20   42:ifeq            76
	//*  21   45:aload_0         
	//*  22   46:getfield        #68  <Field RadarEvent[] events>
	//*  23   49:aload_1         
	//*  24   50:getfield        #68  <Field RadarEvent[] events>
	//*  25   53:invokestatic    #85  <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  26   56:ifeq            76
	//*  27   59:aload_0         
	//*  28   60:getfield        #70  <Field RadarUser user>
	//*  29   63:aload_1         
	//*  30   64:getfield        #70  <Field RadarUser user>
	//*  31   67:invokestatic    #85  <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  32   70:ifeq            76
					break label0;
	//   33   73:goto            78
			}
			return false;
	//   34   76:iconst_0        
	//   35   77:ireturn         
		}
		return true;
	//   36   78:iconst_1        
	//   37   79:ireturn         
	}

	public final RadarEvent[] getEvents()
	{
		return events;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field RadarEvent[] events>
	//    2    4:areturn         
	}

	public final Location getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Location location>
	//    2    4:areturn         
	}

	public final JSONObject getPayload()
	{
		return payload;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONObject payload>
	//    2    4:areturn         
	}

	public final RadarUser getUser()
	{
		return user;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field RadarUser user>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Object obj = ((Object) (payload));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONObject payload>
	//    2    4:astore          5
		int l = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int i;
		if(obj != null)
	//*   5    9:aload           5
	//*   6   11:ifnull          23
			i = obj.hashCode();
	//    7   14:aload           5
	//    8   16:invokevirtual   #90  <Method int Object.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		obj = ((Object) (location));
	//   13   25:aload_0         
	//   14   26:getfield        #66  <Field Location location>
	//   15   29:astore          5
		int j;
		if(obj != null)
	//*  16   31:aload           5
	//*  17   33:ifnull          45
			j = obj.hashCode();
	//   18   36:aload           5
	//   19   38:invokevirtual   #90  <Method int Object.hashCode()>
	//   20   41:istore_2        
		else
	//*  21   42:goto            47
			j = 0;
	//   22   45:iconst_0        
	//   23   46:istore_2        
		RadarEvent aradarevent[] = events;
	//   24   47:aload_0         
	//   25   48:getfield        #68  <Field RadarEvent[] events>
	//   26   51:astore          5
		int k;
		if(aradarevent != null)
	//*  27   53:aload           5
	//*  28   55:ifnull          67
			k = Arrays.hashCode(((Object []) (aradarevent)));
	//   29   58:aload           5
	//   30   60:invokestatic    #95  <Method int Arrays.hashCode(Object[])>
	//   31   63:istore_3        
		else
	//*  32   64:goto            69
			k = 0;
	//   33   67:iconst_0        
	//   34   68:istore_3        
		aradarevent = ((RadarEvent []) (user));
	//   35   69:aload_0         
	//   36   70:getfield        #70  <Field RadarUser user>
	//   37   73:astore          5
		if(aradarevent != null)
	//*  38   75:aload           5
	//*  39   77:ifnull          87
			l = ((Object) (aradarevent)).hashCode();
	//   40   80:aload           5
	//   41   82:invokevirtual   #90  <Method int Object.hashCode()>
	//   42   85:istore          4
		return ((i * 31 + j) * 31 + k) * 31 + l;
	//   43   87:iload_1         
	//   44   88:bipush          31
	//   45   90:imul            
	//   46   91:iload_2         
	//   47   92:iadd            
	//   48   93:bipush          31
	//   49   95:imul            
	//   50   96:iload_3         
	//   51   97:iadd            
	//   52   98:bipush          31
	//   53  100:imul            
	//   54  101:iload           4
	//   55  103:iadd            
	//   56  104:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #98  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #101 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Success(payload=");
	//    4    8:aload_1         
	//    5    9:ldc1            #103 <String "Success(payload=">
	//    6   11:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (payload)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #64  <Field JSONObject payload>
	//   11   20:invokevirtual   #110 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", location=");
	//   13   24:aload_1         
	//   14   25:ldc1            #112 <String ", location=">
	//   15   27:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (location)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #66  <Field Location location>
	//   20   36:invokevirtual   #110 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", events=");
	//   22   40:aload_1         
	//   23   41:ldc1            #114 <String ", events=">
	//   24   43:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(Arrays.toString(((Object []) (events))));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #68  <Field RadarEvent[] events>
	//   29   52:invokestatic    #117 <Method String Arrays.toString(Object[])>
	//   30   55:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
		stringbuilder.append(", user=");
	//   32   59:aload_1         
	//   33   60:ldc1            #119 <String ", user=">
	//   34   62:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
		stringbuilder.append(((Object) (user)));
	//   36   66:aload_1         
	//   37   67:aload_0         
	//   38   68:getfield        #70  <Field RadarUser user>
	//   39   71:invokevirtual   #110 <Method StringBuilder StringBuilder.append(Object)>
	//   40   74:pop             
		stringbuilder.append(")");
	//   41   75:aload_1         
	//   42   76:ldc1            #121 <String ")">
	//   43   78:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
		return stringbuilder.toString();
	//   45   82:aload_1         
	//   46   83:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   47   86:areturn         
	}

	private final RadarEvent events[];
	private final Location location;
	private final JSONObject payload;
	private final RadarUser user;
}
