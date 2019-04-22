// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			zzy, HashAccumulator

public final class SignInConfiguration extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public SignInConfiguration(String s, GoogleSignInOptions googlesigninoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		zzfe = Preconditions.checkNotEmpty(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #46  <Method String Preconditions.checkNotEmpty(String)>
	//    5    9:putfield        #48  <Field String zzfe>
		zzff = googlesigninoptions;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #50  <Field GoogleSignInOptions zzff>
	//    9   17:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		obj = ((Object) ((SignInConfiguration)obj));
	//    4    6:aload_1         
	//    5    7:checkcast       #2   <Class SignInConfiguration>
	//    6   10:astore_1        
		if(!zzfe.equals(((Object) (((SignInConfiguration) (obj)).zzfe))))
			break MISSING_BLOCK_LABEL_60;
	//    7   11:aload_0         
	//    8   12:getfield        #48  <Field String zzfe>
	//    9   15:aload_1         
	//   10   16:getfield        #48  <Field String zzfe>
	//   11   19:invokevirtual   #60  <Method boolean String.equals(Object)>
	//   12   22:ifeq            60
		if(zzff == null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #50  <Field GoogleSignInOptions zzff>
	//*  15   29:ifnonnull       42
		{
			if(((SignInConfiguration) (obj)).zzff != null)
	//*  16   32:aload_1         
	//*  17   33:getfield        #50  <Field GoogleSignInOptions zzff>
	//*  18   36:ifnonnull       60
				break MISSING_BLOCK_LABEL_60;
	//   19   39:goto            58
		} else
		{
			boolean flag;
			try
			{
				flag = zzff.equals(((Object) (((SignInConfiguration) (obj)).zzff)));
	//   20   42:aload_0         
	//   21   43:getfield        #50  <Field GoogleSignInOptions zzff>
	//   22   46:aload_1         
	//   23   47:getfield        #50  <Field GoogleSignInOptions zzff>
	//   24   50:invokevirtual   #63  <Method boolean GoogleSignInOptions.equals(Object)>
	//   25   53:istore_2        
			}
	//*  26   54:iload_2         
	//*  27   55:ifeq            60
	//*  28   58:iconst_1        
	//*  29   59:ireturn         
	//*  30   60:iconst_0        
	//*  31   61:ireturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  32   62:astore_1        
			{
				return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
			}
			if(!flag)
				break MISSING_BLOCK_LABEL_60;
		}
		return true;
		return false;
	}

	public final int hashCode()
	{
		return (new HashAccumulator()).addObject(((Object) (zzfe))).addObject(((Object) (zzff))).hash();
	//    0    0:new             #67  <Class HashAccumulator>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void HashAccumulator()>
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field String zzfe>
	//    5   11:invokevirtual   #72  <Method HashAccumulator HashAccumulator.addObject(Object)>
	//    6   14:aload_0         
	//    7   15:getfield        #50  <Field GoogleSignInOptions zzff>
	//    8   18:invokevirtual   #72  <Method HashAccumulator HashAccumulator.addObject(Object)>
	//    9   21:invokevirtual   #75  <Method int HashAccumulator.hash()>
	//   10   24:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #83  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeString(parcel, 2, zzfe, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field String zzfe>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #87  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 5, ((android.os.Parcelable) (zzff)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_5        
	//   11   17:aload_0         
	//   12   18:getfield        #50  <Field GoogleSignInOptions zzff>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #91  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   16   26:aload_1         
	//   17   27:iload_3         
	//   18   28:invokestatic    #94  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   19   31:return          
	}

	public final GoogleSignInOptions zzt()
	{
		return zzff;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleSignInOptions zzff>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzy();
	private final String zzfe;
	private GoogleSignInOptions zzff;

	static 
	{
	//    0    0:new             #30  <Class zzy>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzy()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
