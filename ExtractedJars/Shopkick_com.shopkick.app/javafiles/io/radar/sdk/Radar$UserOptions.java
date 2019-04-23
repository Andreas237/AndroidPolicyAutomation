// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import io.radar.sdk.internal.repository.IdentityRepository;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk:
//			Radar

private static final class Radar$UserOptions
{

	public final String getDescription()
	{
		return Radar.access$getIdentityRepository$p(Radar.INSTANCE).getUserDescription$sdk_release();
	//    0    0:getstatic       #46  <Field Radar Radar.INSTANCE>
	//    1    3:invokestatic    #50  <Method IdentityRepository Radar.access$getIdentityRepository$p(Radar)>
	//    2    6:invokevirtual   #55  <Method String IdentityRepository.getUserDescription$sdk_release()>
	//    3    9:areturn         
	}

	public final JSONObject getMetadata()
	{
		return new JSONObject(Radar.access$getIdentityRepository$p(Radar.INSTANCE).getUserMetadata$sdk_release());
	//    0    0:new             #58  <Class JSONObject>
	//    1    3:dup             
	//    2    4:getstatic       #46  <Field Radar Radar.INSTANCE>
	//    3    7:invokestatic    #50  <Method IdentityRepository Radar.access$getIdentityRepository$p(Radar)>
	//    4   10:invokevirtual   #61  <Method String IdentityRepository.getUserMetadata$sdk_release()>
	//    5   13:invokespecial   #63  <Method void JSONObject(String)>
	//    6   16:areturn         
	}

	public final String getUserId()
	{
		return Radar.access$getIdentityRepository$p(Radar.INSTANCE).getUserId$sdk_release();
	//    0    0:getstatic       #46  <Field Radar Radar.INSTANCE>
	//    1    3:invokestatic    #50  <Method IdentityRepository Radar.access$getIdentityRepository$p(Radar)>
	//    2    6:invokevirtual   #66  <Method String IdentityRepository.getUserId$sdk_release()>
	//    3    9:areturn         
	}

	public final void setDescription(String s)
	{
		Radar.access$getIdentityRepository$p(Radar.INSTANCE).setUserDescription$sdk_release(s);
	//    0    0:getstatic       #46  <Field Radar Radar.INSTANCE>
	//    1    3:invokestatic    #50  <Method IdentityRepository Radar.access$getIdentityRepository$p(Radar)>
	//    2    6:aload_1         
	//    3    7:invokevirtual   #69  <Method void IdentityRepository.setUserDescription$sdk_release(String)>
	//    4   10:return          
	}

	public final void setMetadata(JSONObject jsonobject)
	{
		Radar.access$getIdentityRepository$p(Radar.INSTANCE).setUserMetadata$sdk_release(String.valueOf(((Object) (jsonobject))));
	//    0    0:getstatic       #46  <Field Radar Radar.INSTANCE>
	//    1    3:invokestatic    #50  <Method IdentityRepository Radar.access$getIdentityRepository$p(Radar)>
	//    2    6:aload_1         
	//    3    7:invokestatic    #76  <Method String String.valueOf(Object)>
	//    4   10:invokevirtual   #79  <Method void IdentityRepository.setUserMetadata$sdk_release(String)>
	//    5   13:return          
	}

	public final void setUserId(String s)
	{
		String s1 = Radar.access$getIdentityRepository$p(Radar.INSTANCE).getUserId$sdk_release();
	//    0    0:getstatic       #46  <Field Radar Radar.INSTANCE>
	//    1    3:invokestatic    #50  <Method IdentityRepository Radar.access$getIdentityRepository$p(Radar)>
	//    2    6:invokevirtual   #66  <Method String IdentityRepository.getUserId$sdk_release()>
	//    3    9:astore_2        
		if(s1 == null || Intrinsics.areEqual(((Object) (s1)), ((Object) (s))) ^ true)
	//*   4   10:aload_2         
	//*   5   11:ifnull          24
	//*   6   14:aload_2         
	//*   7   15:aload_1         
	//*   8   16:invokestatic    #85  <Method boolean Intrinsics.areEqual(Object, Object)>
	//*   9   19:iconst_1        
	//*  10   20:ixor            
	//*  11   21:ifeq            37
			Radar.access$getIdentityRepository$p(Radar.INSTANCE).setRadarId$sdk_release((String)null);
	//   12   24:getstatic       #46  <Field Radar Radar.INSTANCE>
	//   13   27:invokestatic    #50  <Method IdentityRepository Radar.access$getIdentityRepository$p(Radar)>
	//   14   30:aconst_null     
	//   15   31:checkcast       #72  <Class String>
	//   16   34:invokevirtual   #88  <Method void IdentityRepository.setRadarId$sdk_release(String)>
		Radar.access$getIdentityRepository$p(Radar.INSTANCE).setUserId$sdk_release(s);
	//   17   37:getstatic       #46  <Field Radar Radar.INSTANCE>
	//   18   40:invokestatic    #50  <Method IdentityRepository Radar.access$getIdentityRepository$p(Radar)>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #91  <Method void IdentityRepository.setUserId$sdk_release(String)>
	//   21   47:return          
	}

	public Radar$UserOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}
}
