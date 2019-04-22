// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//			zzn

public class TokenData extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	TokenData(int i, String s, Long long1, boolean flag, boolean flag1, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void AbstractSafeParcelable()>
		zzy = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #55  <Field int zzy>
		zzz = Preconditions.checkNotEmpty(s);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #61  <Method String Preconditions.checkNotEmpty(String)>
	//    8   14:putfield        #63  <Field String zzz>
		zzaa = long1;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #65  <Field Long zzaa>
		zzab = flag;
	//   12   22:aload_0         
	//   13   23:iload           4
	//   14   25:putfield        #67  <Field boolean zzab>
		zzac = flag1;
	//   15   28:aload_0         
	//   16   29:iload           5
	//   17   31:putfield        #69  <Field boolean zzac>
		zzad = list;
	//   18   34:aload_0         
	//   19   35:aload           6
	//   20   37:putfield        #71  <Field List zzad>
	//   21   40:return          
	}

	public static TokenData zzd(Bundle bundle, String s)
	{
		bundle.setClassLoader(((Class) (com/google/android/gms/auth/TokenData)).getClassLoader());
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class TokenData>
	//    2    3:invokevirtual   #84  <Method ClassLoader Class.getClassLoader()>
	//    3    6:invokevirtual   #90  <Method void Bundle.setClassLoader(ClassLoader)>
		bundle = bundle.getBundle(s);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #94  <Method Bundle Bundle.getBundle(String)>
	//    7   14:astore_0        
		if(bundle == null)
	//*   8   15:aload_0         
	//*   9   16:ifnonnull       21
		{
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		} else
		{
			bundle.setClassLoader(((Class) (com/google/android/gms/auth/TokenData)).getClassLoader());
	//   12   21:aload_0         
	//   13   22:ldc1            #2   <Class TokenData>
	//   14   24:invokevirtual   #84  <Method ClassLoader Class.getClassLoader()>
	//   15   27:invokevirtual   #90  <Method void Bundle.setClassLoader(ClassLoader)>
			return (TokenData)bundle.getParcelable("TokenData");
	//   16   30:aload_0         
	//   17   31:ldc1            #96  <String "TokenData">
	//   18   33:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   19   36:checkcast       #2   <Class TokenData>
	//   20   39:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof TokenData))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class TokenData>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((TokenData)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class TokenData>
	//    7   13:astore_1        
		return TextUtils.equals(((CharSequence) (zzz)), ((CharSequence) (((TokenData) (obj)).zzz))) && Objects.equal(((Object) (zzaa)), ((Object) (((TokenData) (obj)).zzaa))) && zzab == ((TokenData) (obj)).zzab && zzac == ((TokenData) (obj)).zzac && Objects.equal(((Object) (zzad)), ((Object) (((TokenData) (obj)).zzad)));
	//    8   14:aload_0         
	//    9   15:getfield        #63  <Field String zzz>
	//   10   18:aload_1         
	//   11   19:getfield        #63  <Field String zzz>
	//   12   22:invokestatic    #107 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   13   25:ifeq            80
	//   14   28:aload_0         
	//   15   29:getfield        #65  <Field Long zzaa>
	//   16   32:aload_1         
	//   17   33:getfield        #65  <Field Long zzaa>
	//   18   36:invokestatic    #113 <Method boolean Objects.equal(Object, Object)>
	//   19   39:ifeq            80
	//   20   42:aload_0         
	//   21   43:getfield        #67  <Field boolean zzab>
	//   22   46:aload_1         
	//   23   47:getfield        #67  <Field boolean zzab>
	//   24   50:icmpne          80
	//   25   53:aload_0         
	//   26   54:getfield        #69  <Field boolean zzac>
	//   27   57:aload_1         
	//   28   58:getfield        #69  <Field boolean zzac>
	//   29   61:icmpne          80
	//   30   64:aload_0         
	//   31   65:getfield        #71  <Field List zzad>
	//   32   68:aload_1         
	//   33   69:getfield        #71  <Field List zzad>
	//   34   72:invokestatic    #113 <Method boolean Objects.equal(Object, Object)>
	//   35   75:ifeq            80
	//   36   78:iconst_1        
	//   37   79:ireturn         
	//   38   80:iconst_0        
	//   39   81:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzz, zzaa, Boolean.valueOf(zzab), Boolean.valueOf(zzac), zzad
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #63  <Field String zzz>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #65  <Field Long zzaa>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #67  <Field boolean zzab>
	//   16   24:invokestatic    #123 <Method Boolean Boolean.valueOf(boolean)>
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_3        
	//   20   30:aload_0         
	//   21   31:getfield        #69  <Field boolean zzac>
	//   22   34:invokestatic    #123 <Method Boolean Boolean.valueOf(boolean)>
	//   23   37:aastore         
	//   24   38:dup             
	//   25   39:iconst_4        
	//   26   40:aload_0         
	//   27   41:getfield        #71  <Field List zzad>
	//   28   44:aastore         
	//   29   45:invokestatic    #126 <Method int Objects.hashCode(Object[])>
	//   30   48:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #134 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzy);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #55  <Field int zzy>
	//    7   11:invokestatic    #138 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, zzz, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #63  <Field String zzz>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #142 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLongObject(parcel, 3, zzaa, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #65  <Field Long zzaa>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #146 <Method void SafeParcelWriter.writeLongObject(Parcel, int, Long, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 4, zzab);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #67  <Field boolean zzab>
	//   24   40:invokestatic    #150 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 5, zzac);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #69  <Field boolean zzac>
	//   29   49:invokestatic    #150 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringList(parcel, 6, zzad, false);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #71  <Field List zzad>
	//   34   59:iconst_0        
	//   35   60:invokestatic    #154 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   36   63:aload_1         
	//   37   64:iload_2         
	//   38   65:invokestatic    #157 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   39   68:return          
	}

	public final String zze()
	{
		return zzz;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String zzz>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzn();
	private final Long zzaa;
	private final boolean zzab;
	private final boolean zzac;
	private final List zzad;
	private final int zzy;
	private final String zzz;

	static 
	{
	//    0    0:new             #43  <Class zzn>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void zzn()>
	//    3    7:putstatic       #48  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
