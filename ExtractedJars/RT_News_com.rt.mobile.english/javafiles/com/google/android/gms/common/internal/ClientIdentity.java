// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//			ClientIdentityCreator, Objects

public class ClientIdentity extends AbstractSafeParcelable
{

	public ClientIdentity(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractSafeParcelable()>
		uid = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #41  <Field int uid>
		packageName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #43  <Field String packageName>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          52
		{
			if(!(obj instanceof ClientIdentity))
	//*   7   11:aload_1         
	//*   8   12:instanceof      #2   <Class ClientIdentity>
	//*   9   15:ifne            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			obj = ((Object) ((ClientIdentity)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class ClientIdentity>
	//   14   24:astore_1        
			if(((ClientIdentity) (obj)).uid == uid && Objects.equal(((Object) (((ClientIdentity) (obj)).packageName)), ((Object) (packageName))))
	//*  15   25:aload_1         
	//*  16   26:getfield        #41  <Field int uid>
	//*  17   29:aload_0         
	//*  18   30:getfield        #41  <Field int uid>
	//*  19   33:icmpne          52
	//*  20   36:aload_1         
	//*  21   37:getfield        #43  <Field String packageName>
	//*  22   40:aload_0         
	//*  23   41:getfield        #43  <Field String packageName>
	//*  24   44:invokestatic    #53  <Method boolean Objects.equal(Object, Object)>
	//*  25   47:ifeq            52
				return true;
	//   26   50:iconst_1        
	//   27   51:ireturn         
		}
		return false;
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	public int hashCode()
	{
		return uid;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int uid>
	//    2    4:ireturn         
	}

	public String toString()
	{
		int i = uid;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int uid>
	//    2    4:istore_1        
		String s = packageName;
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field String packageName>
	//    5    9:astore_2        
		StringBuilder stringbuilder = new StringBuilder(12 + String.valueOf(((Object) (s))).length());
	//    6   10:new             #59  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          12
	//    9   16:aload_2         
	//   10   17:invokestatic    #65  <Method String String.valueOf(Object)>
	//   11   20:invokevirtual   #68  <Method int String.length()>
	//   12   23:iadd            
	//   13   24:invokespecial   #71  <Method void StringBuilder(int)>
	//   14   27:astore_3        
		stringbuilder.append(i);
	//   15   28:aload_3         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
		stringbuilder.append(":");
	//   19   34:aload_3         
	//   20   35:ldc1            #77  <String ":">
	//   21   37:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		stringbuilder.append(s);
	//   23   41:aload_3         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
		return stringbuilder.toString();
	//   27   47:aload_3         
	//   28   48:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   29   51:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #90  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, uid);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field int uid>
	//    7   11:invokestatic    #94  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, packageName, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #43  <Field String packageName>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #98  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #101 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ClientIdentityCreator();
	public final String packageName;
	public final int uid;

	static 
	{
	//    0    0:new             #29  <Class ClientIdentityCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void ClientIdentityCreator()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
