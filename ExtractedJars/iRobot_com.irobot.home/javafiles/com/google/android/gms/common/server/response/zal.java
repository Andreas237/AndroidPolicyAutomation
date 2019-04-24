// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			zao, zam

public final class zal extends AbstractSafeParcelable
{

	zal(int i, String s, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #40  <Field int versionCode>
		className = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field String className>
		zaqx = arraylist;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #44  <Field ArrayList zaqx>
	//   11   19:return          
	}

	zal(String s, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		versionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #40  <Field int versionCode>
		className = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #42  <Field String className>
		if(map == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       23
		{
			s = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
		} else
	//*  12   20:goto            93
		{
			ArrayList arraylist = new ArrayList();
	//   13   23:new             #51  <Class ArrayList>
	//   14   26:dup             
	//   15   27:invokespecial   #52  <Method void ArrayList()>
	//   16   30:astore_3        
			Iterator iterator = map.keySet().iterator();
	//   17   31:aload_2         
	//   18   32:invokeinterface #58  <Method Set Map.keySet()>
	//   19   37:invokeinterface #64  <Method Iterator Set.iterator()>
	//   20   42:astore          4
			do
			{
				s = ((String) (arraylist));
	//   21   44:aload_3         
	//   22   45:astore_1        
				if(!iterator.hasNext())
					break;
	//   23   46:aload           4
	//   24   48:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            93
				s = (String)iterator.next();
	//   26   56:aload           4
	//   27   58:invokeinterface #74  <Method Object Iterator.next()>
	//   28   63:checkcast       #76  <Class String>
	//   29   66:astore_1        
				arraylist.add(((Object) (new zam(s, (FastJsonResponse.Field)map.get(((Object) (s)))))));
	//   30   67:aload_3         
	//   31   68:new             #78  <Class zam>
	//   32   71:dup             
	//   33   72:aload_1         
	//   34   73:aload_2         
	//   35   74:aload_1         
	//   36   75:invokeinterface #82  <Method Object Map.get(Object)>
	//   37   80:checkcast       #84  <Class FastJsonResponse$Field>
	//   38   83:invokespecial   #87  <Method void zam(String, FastJsonResponse$Field)>
	//   39   86:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
	//   40   89:pop             
			} while(true);
	//   41   90:goto            44
		}
		zaqx = ((ArrayList) (s));
	//   42   93:aload_0         
	//   43   94:aload_1         
	//   44   95:putfield        #44  <Field ArrayList zaqx>
	//   45   98:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #100 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field int versionCode>
	//    7   11:invokestatic    #104 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, className, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #42  <Field String className>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #108 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 3, ((java.util.List) (zaqx)), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #44  <Field ArrayList zaqx>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #112 <Method void SafeParcelWriter.writeTypedList(Parcel, int, java.util.List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #115 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zao();
	final String className;
	private final int versionCode;
	final ArrayList zaqx;

	static 
	{
	//    0    0:new             #28  <Class zao>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zao()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
