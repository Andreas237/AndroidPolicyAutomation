// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import com.google.android.exoplayer.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.drm:
//			DrmInitData

public static final class DrmInitData$Mapped
	implements DrmInitData
{

	public boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          109
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #26  <Method Class Object.getClass()>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #26  <Method Class Object.getClass()>
	//*   6   12:if_acmpeq       17
				return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
			obj = ((Object) ((DrmInitData$Mapped)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #2   <Class DrmInitData$Mapped>
	//   11   21:astore_1        
			if(schemeData.size() != ((DrmInitData$Mapped) (obj)).schemeData.size())
	//*  12   22:aload_0         
	//*  13   23:getfield        #19  <Field Map schemeData>
	//*  14   26:invokeinterface #32  <Method int Map.size()>
	//*  15   31:aload_1         
	//*  16   32:getfield        #19  <Field Map schemeData>
	//*  17   35:invokeinterface #32  <Method int Map.size()>
	//*  18   40:icmpeq          45
				return false;
	//   19   43:iconst_0        
	//   20   44:ireturn         
			for(Iterator iterator = schemeData.keySet().iterator(); iterator.hasNext();)
	//*  21   45:aload_0         
	//*  22   46:getfield        #19  <Field Map schemeData>
	//*  23   49:invokeinterface #36  <Method Set Map.keySet()>
	//*  24   54:invokeinterface #42  <Method Iterator Set.iterator()>
	//*  25   59:astore_2        
	//*  26   60:aload_2         
	//*  27   61:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//*  28   66:ifeq            107
			{
				UUID uuid = (UUID)iterator.next();
	//   29   69:aload_2         
	//   30   70:invokeinterface #52  <Method Object Iterator.next()>
	//   31   75:checkcast       #54  <Class UUID>
	//   32   78:astore_3        
				if(!Util.areEqual(schemeData.get(((Object) (uuid))), ((DrmInitData$Mapped) (obj)).schemeData.get(((Object) (uuid)))))
	//*  33   79:aload_0         
	//*  34   80:getfield        #19  <Field Map schemeData>
	//*  35   83:aload_3         
	//*  36   84:invokeinterface #58  <Method Object Map.get(Object)>
	//*  37   89:aload_1         
	//*  38   90:getfield        #19  <Field Map schemeData>
	//*  39   93:aload_3         
	//*  40   94:invokeinterface #58  <Method Object Map.get(Object)>
	//*  41   99:invokestatic    #64  <Method boolean Util.areEqual(Object, Object)>
	//*  42  102:ifne            60
					return false;
	//   43  105:iconst_0        
	//   44  106:ireturn         
			}

			return true;
	//   45  107:iconst_1        
	//   46  108:ireturn         
		} else
		{
			return false;
	//   47  109:iconst_0        
	//   48  110:ireturn         
		}
	}

	public nitData get(UUID uuid)
	{
		return (nitData)schemeData.get(((Object) (uuid)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map schemeData>
	//    2    4:aload_1         
	//    3    5:invokeinterface #58  <Method Object Map.get(Object)>
	//    4   10:checkcast       #67  <Class DrmInitData$SchemeInitData>
	//    5   13:areturn         
	}

	public int hashCode()
	{
		return schemeData.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map schemeData>
	//    2    4:invokeinterface #70  <Method int Map.hashCode()>
	//    3    9:ireturn         
	}

	public void put(UUID uuid, nitData nitdata)
	{
		schemeData.put(((Object) (uuid)), ((Object) (nitdata)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map schemeData>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	private final Map schemeData = new HashMap();

	public DrmInitData$Mapped()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void HashMap()>
	//    6   12:putfield        #19  <Field Map schemeData>
	//    7   15:return          
	}
}
