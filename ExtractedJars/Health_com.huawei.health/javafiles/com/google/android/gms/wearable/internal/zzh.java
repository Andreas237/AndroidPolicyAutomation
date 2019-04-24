// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzi

public class zzh extends zza
	implements zzb
{

	public zzh(byte byte0, byte byte1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zza()>
		zzbTB = byte0;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field byte zzbTB>
		zzbTC = byte1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field byte zzbTC>
		mValue = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field String mValue>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #40  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #40  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((zzh)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzh>
	//   16   28:astore_1        
		if(zzbTB != ((zzh) (obj)).zzbTB)
	//*  17   29:aload_0         
	//*  18   30:getfield        #28  <Field byte zzbTB>
	//*  19   33:aload_1         
	//*  20   34:getfield        #28  <Field byte zzbTB>
	//*  21   37:icmpeq          42
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		if(zzbTC != ((zzh) (obj)).zzbTC)
	//*  24   42:aload_0         
	//*  25   43:getfield        #30  <Field byte zzbTC>
	//*  26   46:aload_1         
	//*  27   47:getfield        #30  <Field byte zzbTC>
	//*  28   50:icmpeq          55
			return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
		return mValue.equals(((Object) (((zzh) (obj)).mValue)));
	//   31   55:aload_0         
	//   32   56:getfield        #32  <Field String mValue>
	//   33   59:aload_1         
	//   34   60:getfield        #32  <Field String mValue>
	//   35   63:invokevirtual   #44  <Method boolean String.equals(Object)>
	//   36   66:ifne            71
	//   37   69:iconst_0        
	//   38   70:ireturn         
	//   39   71:iconst_1        
	//   40   72:ireturn         
	}

	public String getValue()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String mValue>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((zzbTB + 31) * 31 + zzbTC) * 31 + mValue.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field byte zzbTB>
	//    2    4:bipush          31
	//    3    6:iadd            
	//    4    7:bipush          31
	//    5    9:imul            
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field byte zzbTC>
	//    8   14:iadd            
	//    9   15:bipush          31
	//   10   17:imul            
	//   11   18:aload_0         
	//   12   19:getfield        #32  <Field String mValue>
	//   13   22:invokevirtual   #50  <Method int String.hashCode()>
	//   14   25:iadd            
	//   15   26:ireturn         
	}

	public String toString()
	{
		byte byte0 = zzbTB;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field byte zzbTB>
	//    2    4:istore_1        
		byte byte1 = zzbTC;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field byte zzbTC>
	//    5    9:istore_2        
		String s = mValue;
	//    6   10:aload_0         
	//    7   11:getfield        #32  <Field String mValue>
	//    8   14:astore_3        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 73)).append("AmsEntityUpdateParcelable{, mEntityId=").append(((int) (byte0))).append(", mAttributeId=").append(((int) (byte1))).append(", mValue='").append(s).append("'").append("}").toString();
	//    9   15:new             #53  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:aload_3         
	//   12   20:invokestatic    #57  <Method String String.valueOf(Object)>
	//   13   23:invokevirtual   #60  <Method int String.length()>
	//   14   26:bipush          73
	//   15   28:iadd            
	//   16   29:invokespecial   #63  <Method void StringBuilder(int)>
	//   17   32:ldc1            #65  <String "AmsEntityUpdateParcelable{, mEntityId=">
	//   18   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:iload_1         
	//   20   38:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   21   41:ldc1            #74  <String ", mAttributeId=">
	//   22   43:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:iload_2         
	//   24   47:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   25   50:ldc1            #76  <String ", mValue='">
	//   26   52:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:aload_3         
	//   28   56:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:ldc1            #78  <String "'">
	//   30   61:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:ldc1            #80  <String "}">
	//   32   66:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   33   69:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   34   72:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzi.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #88  <Method void com.google.android.gms.wearable.internal.zzi.zza(zzh, Parcel, int)>
	//    4    6:return          
	}

	public byte zzUk()
	{
		return zzbTB;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field byte zzbTB>
	//    2    4:ireturn         
	}

	public byte zzUl()
	{
		return zzbTC;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field byte zzbTC>
	//    2    4:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzi();
	private final String mValue;
	private byte zzbTB;
	private final byte zzbTC;

	static 
	{
	//    0    0:new             #18  <Class zzi>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzi()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
