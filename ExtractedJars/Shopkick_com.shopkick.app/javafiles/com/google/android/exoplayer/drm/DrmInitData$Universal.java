// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import com.google.android.exoplayer.util.Util;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer.drm:
//			DrmInitData

public static final class DrmInitData$Universal
	implements DrmInitData
{

	public boolean equals(Object obj)
	{
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #23  <Method Class Object.getClass()>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #23  <Method Class Object.getClass()>
	//*   6   12:if_acmpeq       18
	//*   7   15:goto            33
			return Util.areEqual(((Object) (data)), ((Object) (((DrmInitData$Universal)obj).data)));
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field DrmInitData$SchemeInitData data>
	//   10   22:aload_1         
	//   11   23:checkcast       #2   <Class DrmInitData$Universal>
	//   12   26:getfield        #16  <Field DrmInitData$SchemeInitData data>
	//   13   29:invokestatic    #29  <Method boolean Util.areEqual(Object, Object)>
	//   14   32:ireturn         
		else
			return false;
	//   15   33:iconst_0        
	//   16   34:ireturn         
	}

	public Data get(UUID uuid)
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DrmInitData$SchemeInitData data>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return data.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DrmInitData$SchemeInitData data>
	//    2    4:invokevirtual   #37  <Method int DrmInitData$SchemeInitData.hashCode()>
	//    3    7:ireturn         
	}

	private Data data;

	public DrmInitData$Universal(Data data1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		data = data1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field DrmInitData$SchemeInitData data>
	//    5    9:return          
	}
}
