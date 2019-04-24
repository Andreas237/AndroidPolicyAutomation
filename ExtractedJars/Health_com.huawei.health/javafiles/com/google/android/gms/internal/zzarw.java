// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.internal:
//			zzarx

public class zzarw extends zza
{

	public zzarw(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		uid = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int uid>
		packageName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String packageName>
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
		if(obj == null || !(obj instanceof zzarw))
	//*   5    7:aload_1         
	//*   6    8:ifnull          18
	//*   7   11:aload_1         
	//*   8   12:instanceof      #2   <Class zzarw>
	//*   9   15:ifne            20
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		obj = ((Object) ((zzarw)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzarw>
	//   14   24:astore_1        
		return ((zzarw) (obj)).uid == uid && zzaa.equal(((Object) (((zzarw) (obj)).packageName)), ((Object) (packageName)));
	//   15   25:aload_1         
	//   16   26:getfield        #25  <Field int uid>
	//   17   29:aload_0         
	//   18   30:getfield        #25  <Field int uid>
	//   19   33:icmpne          52
	//   20   36:aload_1         
	//   21   37:getfield        #27  <Field String packageName>
	//   22   40:aload_0         
	//   23   41:getfield        #27  <Field String packageName>
	//   24   44:invokestatic    #35  <Method boolean zzaa.equal(Object, Object)>
	//   25   47:ifeq            52
	//   26   50:iconst_1        
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	public int hashCode()
	{
		return uid;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int uid>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return String.format("%d:%s", new Object[] {
			Integer.valueOf(uid), packageName
		});
	//    0    0:ldc1            #41  <String "%d:%s">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #25  <Field int uid>
	//    7   12:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #27  <Field String packageName>
	//   13   22:aastore         
	//   14   23:invokestatic    #55  <Method String String.format(String, Object[])>
	//   15   26:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzarx.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #61  <Method void com.google.android.gms.internal.zzarx.zza(zzarw, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzarx();
	public final String packageName;
	public final int uid;

	static 
	{
	//    0    0:new             #15  <Class zzarx>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzarx()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
