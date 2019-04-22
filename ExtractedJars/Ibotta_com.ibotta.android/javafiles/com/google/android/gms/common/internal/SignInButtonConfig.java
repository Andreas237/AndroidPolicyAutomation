// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//			SignInButtonConfigCreator

public class SignInButtonConfig extends AbstractSafeParcelable
{

	SignInButtonConfig(int i, int j, int k, Scope ascope[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #44  <Field int zzal>
		zzux = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #46  <Field int zzux>
		zzuy = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #48  <Field int zzuy>
		zzqw = ascope;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #50  <Field Scope[] zzqw>
	//   14   25:return          
	}

	public SignInButtonConfig(int i, int j, Scope ascope[])
	{
		this(1, i, j, ((Scope []) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #55  <Method void SignInButtonConfig(int, int, int, Scope[])>
	//    6    8:return          
	}

	public int getButtonSize()
	{
		return zzux;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int zzux>
	//    2    4:ireturn         
	}

	public int getColorScheme()
	{
		return zzuy;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int zzuy>
	//    2    4:ireturn         
	}

	public Scope[] getScopes()
	{
		return zzqw;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Scope[] zzqw>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field int zzal>
	//    7   11:invokestatic    #70  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, getButtonSize());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #72  <Method int getButtonSize()>
	//   12   20:invokestatic    #70  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 3, getColorScheme());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #74  <Method int getColorScheme()>
	//   17   29:invokestatic    #70  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedArray(parcel, 4, ((android.os.Parcelable []) (getScopes())), i, false);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #76  <Method Scope[] getScopes()>
	//   22   38:iload_2         
	//   23   39:iconst_0        
	//   24   40:invokestatic    #80  <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:invokestatic    #83  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   28   48:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new SignInButtonConfigCreator();
	private final int zzal;
	private final Scope zzqw[];
	private final int zzux;
	private final int zzuy;

	static 
	{
	//    0    0:new             #32  <Class SignInButtonConfigCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void SignInButtonConfigCreator()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
