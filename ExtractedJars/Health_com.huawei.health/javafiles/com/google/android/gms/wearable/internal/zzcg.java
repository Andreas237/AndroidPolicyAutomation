// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzch

public class zzcg extends zza
{

	public zzcg(String s, String s1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zza()>
		packageName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String packageName>
		label = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String label>
		zzbUP = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #30  <Field long zzbUP>
	//   11   19:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzch.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #36  <Method void com.google.android.gms.wearable.internal.zzch.zza(zzcg, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzch();
	public final String label;
	public final String packageName;
	public final long zzbUP;

	static 
	{
	//    0    0:new             #16  <Class zzch>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void zzch()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
