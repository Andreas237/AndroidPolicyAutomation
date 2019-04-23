// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.api:
//			RadarResponse

public final class Error extends RadarResponse
{

	public Error(io.radar.sdk.Radar.RadarStatus radarstatus)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarstatus)), "status");
	//    0    0:aload_1         
	//    1    1:ldc1            #33  <String "status">
	//    2    3:invokestatic    #39  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:invokespecial   #42  <Method void RadarResponse(kotlin.jvm.internal.DefaultConstructorMarker)>
		status = radarstatus;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #44  <Field io.radar.sdk.Radar$RadarStatus status>
	//    9   16:return          
	}

	public static Error copy$default(Error error, io.radar.sdk.Radar.RadarStatus radarstatus, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			radarstatus = error.status;
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field io.radar.sdk.Radar$RadarStatus status>
	//    6   10:astore_1        
		return error.copy(radarstatus);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #51  <Method Error copy(io.radar.sdk.Radar$RadarStatus)>
	//   10   16:areturn         
	}

	public final io.radar.sdk.Radar.RadarStatus component1()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field io.radar.sdk.Radar$RadarStatus status>
	//    2    4:areturn         
	}

	public final Error copy(io.radar.sdk.Radar.RadarStatus radarstatus)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarstatus)), "status");
	//    0    0:aload_1         
	//    1    1:ldc1            #33  <String "status">
	//    2    3:invokestatic    #39  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return new Error(radarstatus);
	//    3    6:new             #2   <Class Error>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:invokespecial   #54  <Method void Error(io.radar.sdk.Radar$RadarStatus)>
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
			if(obj instanceof Error)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #2   <Class Error>
	//*   5    9:ifeq            34
			{
				obj = ((Object) ((Error)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class Error>
	//    8   16:astore_1        
				if(Intrinsics.areEqual(((Object) (status)), ((Object) (((Error) (obj)).status))))
	//*   9   17:aload_0         
	//*  10   18:getfield        #44  <Field io.radar.sdk.Radar$RadarStatus status>
	//*  11   21:aload_1         
	//*  12   22:getfield        #44  <Field io.radar.sdk.Radar$RadarStatus status>
	//*  13   25:invokestatic    #60  <Method boolean Intrinsics.areEqual(Object, Object)>
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

	public final io.radar.sdk.Radar.RadarStatus getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field io.radar.sdk.Radar$RadarStatus status>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		io.radar.sdk.Radar.RadarStatus radarstatus = status;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field io.radar.sdk.Radar$RadarStatus status>
	//    2    4:astore_1        
		if(radarstatus != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return ((Object) (radarstatus)).hashCode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #65  <Method int Object.hashCode()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Error(status=");
	//    4    8:aload_1         
	//    5    9:ldc1            #73  <String "Error(status=">
	//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (status)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #44  <Field io.radar.sdk.Radar$RadarStatus status>
	//   11   20:invokevirtual   #80  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(")");
	//   13   24:aload_1         
	//   14   25:ldc1            #82  <String ")">
	//   15   27:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private final io.radar.sdk.Radar.RadarStatus status;
}
