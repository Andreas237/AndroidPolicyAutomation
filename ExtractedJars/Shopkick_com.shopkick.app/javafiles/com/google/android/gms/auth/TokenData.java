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
//			zzk

public class TokenData extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	TokenData(int i, String s, Long long1, boolean flag, boolean flag1, List list, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void AbstractSafeParcelable()>
		zzv = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #58  <Field int zzv>
		zzw = Preconditions.checkNotEmpty(s);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #64  <Method String Preconditions.checkNotEmpty(String)>
	//    8   14:putfield        #66  <Field String zzw>
		zzx = long1;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #68  <Field Long zzx>
		zzy = flag;
	//   12   22:aload_0         
	//   13   23:iload           4
	//   14   25:putfield        #70  <Field boolean zzy>
		zzz = flag1;
	//   15   28:aload_0         
	//   16   29:iload           5
	//   17   31:putfield        #72  <Field boolean zzz>
		zzaa = list;
	//   18   34:aload_0         
	//   19   35:aload           6
	//   20   37:putfield        #74  <Field List zzaa>
		zzab = s1;
	//   21   40:aload_0         
	//   22   41:aload           7
	//   23   43:putfield        #76  <Field String zzab>
	//   24   46:return          
	}

	public static TokenData zza(Bundle bundle, String s)
	{
		bundle.setClassLoader(((Class) (com/google/android/gms/auth/TokenData)).getClassLoader());
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class TokenData>
	//    2    3:invokevirtual   #89  <Method ClassLoader Class.getClassLoader()>
	//    3    6:invokevirtual   #95  <Method void Bundle.setClassLoader(ClassLoader)>
		bundle = bundle.getBundle(s);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #99  <Method Bundle Bundle.getBundle(String)>
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
	//   14   24:invokevirtual   #89  <Method ClassLoader Class.getClassLoader()>
	//   15   27:invokevirtual   #95  <Method void Bundle.setClassLoader(ClassLoader)>
			return (TokenData)bundle.getParcelable("TokenData");
	//   16   30:aload_0         
	//   17   31:ldc1            #101 <String "TokenData">
	//   18   33:invokevirtual   #105 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		return TextUtils.equals(((CharSequence) (zzw)), ((CharSequence) (((TokenData) (obj)).zzw))) && Objects.equal(((Object) (zzx)), ((Object) (((TokenData) (obj)).zzx))) && zzy == ((TokenData) (obj)).zzy && zzz == ((TokenData) (obj)).zzz && Objects.equal(((Object) (zzaa)), ((Object) (((TokenData) (obj)).zzaa))) && Objects.equal(((Object) (zzab)), ((Object) (((TokenData) (obj)).zzab)));
	//    8   14:aload_0         
	//    9   15:getfield        #66  <Field String zzw>
	//   10   18:aload_1         
	//   11   19:getfield        #66  <Field String zzw>
	//   12   22:invokestatic    #112 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   13   25:ifeq            94
	//   14   28:aload_0         
	//   15   29:getfield        #68  <Field Long zzx>
	//   16   32:aload_1         
	//   17   33:getfield        #68  <Field Long zzx>
	//   18   36:invokestatic    #118 <Method boolean Objects.equal(Object, Object)>
	//   19   39:ifeq            94
	//   20   42:aload_0         
	//   21   43:getfield        #70  <Field boolean zzy>
	//   22   46:aload_1         
	//   23   47:getfield        #70  <Field boolean zzy>
	//   24   50:icmpne          94
	//   25   53:aload_0         
	//   26   54:getfield        #72  <Field boolean zzz>
	//   27   57:aload_1         
	//   28   58:getfield        #72  <Field boolean zzz>
	//   29   61:icmpne          94
	//   30   64:aload_0         
	//   31   65:getfield        #74  <Field List zzaa>
	//   32   68:aload_1         
	//   33   69:getfield        #74  <Field List zzaa>
	//   34   72:invokestatic    #118 <Method boolean Objects.equal(Object, Object)>
	//   35   75:ifeq            94
	//   36   78:aload_0         
	//   37   79:getfield        #76  <Field String zzab>
	//   38   82:aload_1         
	//   39   83:getfield        #76  <Field String zzab>
	//   40   86:invokestatic    #118 <Method boolean Objects.equal(Object, Object)>
	//   41   89:ifeq            94
	//   42   92:iconst_1        
	//   43   93:ireturn         
	//   44   94:iconst_0        
	//   45   95:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzw, zzx, Boolean.valueOf(zzy), Boolean.valueOf(zzz), zzaa, zzab
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #66  <Field String zzw>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #68  <Field Long zzx>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #70  <Field boolean zzy>
	//   16   25:invokestatic    #128 <Method Boolean Boolean.valueOf(boolean)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #72  <Field boolean zzz>
	//   22   35:invokestatic    #128 <Method Boolean Boolean.valueOf(boolean)>
	//   23   38:aastore         
	//   24   39:dup             
	//   25   40:iconst_4        
	//   26   41:aload_0         
	//   27   42:getfield        #74  <Field List zzaa>
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_5        
	//   31   48:aload_0         
	//   32   49:getfield        #76  <Field String zzab>
	//   33   52:aastore         
	//   34   53:invokestatic    #131 <Method int Objects.hashCode(Object[])>
	//   35   56:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #139 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzv);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #58  <Field int zzv>
	//    7   11:invokestatic    #143 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, zzw, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #66  <Field String zzw>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #147 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLongObject(parcel, 3, zzx, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #68  <Field Long zzx>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #151 <Method void SafeParcelWriter.writeLongObject(Parcel, int, Long, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 4, zzy);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #70  <Field boolean zzy>
	//   24   40:invokestatic    #155 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 5, zzz);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #72  <Field boolean zzz>
	//   29   49:invokestatic    #155 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringList(parcel, 6, zzaa, false);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #74  <Field List zzaa>
	//   34   59:iconst_0        
	//   35   60:invokestatic    #159 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 7, zzab, false);
	//   36   63:aload_1         
	//   37   64:bipush          7
	//   38   66:aload_0         
	//   39   67:getfield        #76  <Field String zzab>
	//   40   70:iconst_0        
	//   41   71:invokestatic    #147 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   42   74:aload_1         
	//   43   75:iload_2         
	//   44   76:invokestatic    #162 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   45   79:return          
	}

	public final String zzb()
	{
		return zzw;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String zzw>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzk();
	private final List zzaa;
	private final String zzab;
	private final int zzv;
	private final String zzw;
	private final Long zzx;
	private final boolean zzy;
	private final boolean zzz;

	static 
	{
	//    0    0:new             #46  <Class zzk>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void zzk()>
	//    3    7:putstatic       #51  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
