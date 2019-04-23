// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.*;

public interface DrmInitData
{
	public static final class Mapped
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
				obj = ((Object) ((Mapped)obj));
		//    9   17:aload_1         
		//   10   18:checkcast       #2   <Class DrmInitData$Mapped>
		//   11   21:astore_1        
				if(schemeData.size() != ((Mapped) (obj)).schemeData.size())
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
					if(!Util.areEqual(schemeData.get(((Object) (uuid))), ((Mapped) (obj)).schemeData.get(((Object) (uuid)))))
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

		public SchemeInitData get(UUID uuid)
		{
			return (SchemeInitData)schemeData.get(((Object) (uuid)));
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

		public void put(UUID uuid, SchemeInitData schemeinitdata)
		{
			schemeData.put(((Object) (uuid)), ((Object) (schemeinitdata)));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map schemeData>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #75  <Method Object Map.put(Object, Object)>
		//    5   11:pop             
		//    6   12:return          
		}

		private final Map schemeData = new HashMap();

		public Mapped()
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

	public static final class SchemeInitData
	{

		public boolean equals(Object obj)
		{
			if(!(obj instanceof SchemeInitData))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class DrmInitData$SchemeInitData>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			if(obj == this)
		//*   5    9:aload_1         
		//*   6   10:aload_0         
		//*   7   11:if_acmpne       16
				return true;
		//    8   14:iconst_1        
		//    9   15:ireturn         
			obj = ((Object) ((SchemeInitData)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class DrmInitData$SchemeInitData>
		//   12   20:astore_1        
			return mimeType.equals(((Object) (((SchemeInitData) (obj)).mimeType))) && Arrays.equals(data, ((SchemeInitData) (obj)).data);
		//   13   21:aload_0         
		//   14   22:getfield        #26  <Field String mimeType>
		//   15   25:aload_1         
		//   16   26:getfield        #26  <Field String mimeType>
		//   17   29:invokevirtual   #34  <Method boolean String.equals(Object)>
		//   18   32:ifeq            51
		//   19   35:aload_0         
		//   20   36:getfield        #29  <Field byte[] data>
		//   21   39:aload_1         
		//   22   40:getfield        #29  <Field byte[] data>
		//   23   43:invokestatic    #39  <Method boolean Arrays.equals(byte[], byte[])>
		//   24   46:ifeq            51
		//   25   49:iconst_1        
		//   26   50:ireturn         
		//   27   51:iconst_0        
		//   28   52:ireturn         
		}

		public int hashCode()
		{
			return mimeType.hashCode() + Arrays.hashCode(data) * 31;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field String mimeType>
		//    2    4:invokevirtual   #43  <Method int String.hashCode()>
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field byte[] data>
		//    5   11:invokestatic    #46  <Method int Arrays.hashCode(byte[])>
		//    6   14:bipush          31
		//    7   16:imul            
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		public final byte data[];
		public final String mimeType;

		public SchemeInitData(String s, byte abyte0[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mimeType = (String)Assertions.checkNotNull(((Object) (s)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #22  <Method Object Assertions.checkNotNull(Object)>
		//    5    9:checkcast       #24  <Class String>
		//    6   12:putfield        #26  <Field String mimeType>
			data = (byte[])Assertions.checkNotNull(((Object) (abyte0)));
		//    7   15:aload_0         
		//    8   16:aload_2         
		//    9   17:invokestatic    #22  <Method Object Assertions.checkNotNull(Object)>
		//   10   20:checkcast       #27  <Class byte[]>
		//   11   23:putfield        #29  <Field byte[] data>
		//   12   26:return          
		}
	}

	public static final class Universal
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
				return Util.areEqual(((Object) (data)), ((Object) (((Universal)obj).data)));
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

		public SchemeInitData get(UUID uuid)
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

		private SchemeInitData data;

		public Universal(SchemeInitData schemeinitdata)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			data = schemeinitdata;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field DrmInitData$SchemeInitData data>
		//    5    9:return          
		}
	}


	public abstract SchemeInitData get(UUID uuid);
}
