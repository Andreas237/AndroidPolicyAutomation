// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.util.Pair;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DrmSession

public final class WidevineUtil
{

	private WidevineUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static long getDurationRemainingSec(Map map, String s)
	{
		if(map == null)
			break MISSING_BLOCK_LABEL_26;
	//    0    0:aload_0         
	//    1    1:ifnull          26
		map = ((Map) ((String)map.get(((Object) (s)))));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #26  <Method Object Map.get(Object)>
	//    5   11:checkcast       #28  <Class String>
	//    6   14:astore_0        
		if(map == null)
			break MISSING_BLOCK_LABEL_26;
	//    7   15:aload_0         
	//    8   16:ifnull          26
		long l = Long.parseLong(((String) (map)));
	//    9   19:aload_0         
	//   10   20:invokestatic    #34  <Method long Long.parseLong(String)>
	//   11   23:lstore_2        
		return l;
	//   12   24:lload_2         
	//   13   25:lreturn         
_L2:
		return 0x1L;
	//   14   26:ldc2w           #35  <Long 0x1L>
	//   15   29:lreturn         
		map;
	//   16   30:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  17   31:goto            26
	}

	public static Pair getLicenseDurationRemainingSec(DrmSession drmsession)
	{
		drmsession = ((DrmSession) (drmsession.queryKeyStatus()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #46  <Method Map DrmSession.queryKeyStatus()>
	//    2    6:astore_0        
		if(drmsession == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		else
			return new Pair(((Object) (Long.valueOf(getDurationRemainingSec(((Map) (drmsession)), "LicenseDurationRemaining")))), ((Object) (Long.valueOf(getDurationRemainingSec(((Map) (drmsession)), "PlaybackDurationRemaining")))));
	//    7   13:new             #48  <Class Pair>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:ldc1            #8   <String "LicenseDurationRemaining">
	//   11   20:invokestatic    #50  <Method long getDurationRemainingSec(Map, String)>
	//   12   23:invokestatic    #54  <Method Long Long.valueOf(long)>
	//   13   26:aload_0         
	//   14   27:ldc1            #11  <String "PlaybackDurationRemaining">
	//   15   29:invokestatic    #50  <Method long getDurationRemainingSec(Map, String)>
	//   16   32:invokestatic    #54  <Method Long Long.valueOf(long)>
	//   17   35:invokespecial   #57  <Method void Pair(Object, Object)>
	//   18   38:areturn         
	}

	public static final String PROPERTY_LICENSE_DURATION_REMAINING = "LicenseDurationRemaining";
	public static final String PROPERTY_PLAYBACK_DURATION_REMAINING = "PlaybackDurationRemaining";
}
