// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common:
//			FeatureCreator

public class Feature extends AbstractSafeParcelable
{

	public Feature(String s, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field String name>
		zzaq = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #46  <Field int zzaq>
		zzar = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #48  <Field long zzar>
	//   11   19:return          
	}

	public Feature(String s, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field String name>
		zzar = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #48  <Field long zzar>
		zzaq = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #46  <Field int zzaq>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Feature)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Feature>
	//*   2    4:ifeq            61
		{
			obj = ((Object) ((Feature)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class Feature>
	//    5   11:astore_1        
			if((getName() != null && getName().equals(((Object) (((Feature) (obj)).getName()))) || getName() == null && ((Feature) (obj)).getName() == null) && getVersion() == ((Feature) (obj)).getVersion())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #57  <Method String getName()>
	//*   8   16:ifnull          33
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #57  <Method String getName()>
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #57  <Method String getName()>
	//*  13   27:invokevirtual   #61  <Method boolean String.equals(Object)>
	//*  14   30:ifne            47
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #57  <Method String getName()>
	//*  17   37:ifnonnull       61
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #57  <Method String getName()>
	//*  20   44:ifnonnull       61
	//*  21   47:aload_0         
	//*  22   48:invokevirtual   #64  <Method long getVersion()>
	//*  23   51:aload_1         
	//*  24   52:invokevirtual   #64  <Method long getVersion()>
	//*  25   55:lcmp            
	//*  26   56:ifne            61
				return true;
	//   27   59:iconst_1        
	//   28   60:ireturn         
		}
		return false;
	//   29   61:iconst_0        
	//   30   62:ireturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String name>
	//    2    4:areturn         
	}

	public long getVersion()
	{
		long l1 = zzar;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long zzar>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #65  <Long -1L>
	//*   7   11:lcmp            
	//*   8   12:ifne            21
			l = zzaq;
	//    9   15:aload_0         
	//   10   16:getfield        #46  <Field int zzaq>
	//   11   19:i2l             
	//   12   20:lstore_1        
		return l;
	//   13   21:lload_1         
	//   14   22:lreturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			getName(), Long.valueOf(getVersion())
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:invokevirtual   #57  <Method String getName()>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:invokevirtual   #64  <Method long getVersion()>
	//   11   17:invokestatic    #76  <Method Long Long.valueOf(long)>
	//   12   20:aastore         
	//   13   21:invokestatic    #81  <Method int Objects.hashCode(Object[])>
	//   14   24:ireturn         
	}

	public String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("name", ((Object) (getName()))).add("version", ((Object) (Long.valueOf(getVersion())))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #86  <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #87  <String "name">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #57  <Method String getName()>
	//    5   10:invokevirtual   #93  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #95  <String "version">
	//    7   15:aload_0         
	//    8   16:invokevirtual   #64  <Method long getVersion()>
	//    9   19:invokestatic    #76  <Method Long Long.valueOf(long)>
	//   10   22:invokevirtual   #93  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   11   25:invokevirtual   #97  <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   12   28:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #105 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 1, getName(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #57  <Method String getName()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #109 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 2, zzaq);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #46  <Field int zzaq>
	//   13   21:invokestatic    #113 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 3, getVersion());
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #64  <Method long getVersion()>
	//   18   30:invokestatic    #117 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #120 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   22   38:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new FeatureCreator();
	private final String name;
	private final int zzaq;
	private final long zzar;

	static 
	{
	//    0    0:new             #32  <Class FeatureCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void FeatureCreator()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
