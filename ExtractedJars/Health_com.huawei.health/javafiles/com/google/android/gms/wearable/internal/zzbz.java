// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzca

public class zzbz extends zza
	implements MessageEvent
{

	public zzbz(int i, String s, byte abyte0[], String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzaKE = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int zzaKE>
		mPath = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field String mPath>
		zzbeL = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field byte[] zzbeL>
		zzacO = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field String zzacO>
	//   14   25:return          
	}

	public byte[] getData()
	{
		return zzbeL;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field byte[] zzbeL>
	//    2    4:areturn         
	}

	public String getPath()
	{
		return mPath;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String mPath>
	//    2    4:areturn         
	}

	public int getRequestId()
	{
		return zzaKE;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int zzaKE>
	//    2    4:ireturn         
	}

	public String getSourceNodeId()
	{
		return zzacO;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String zzacO>
	//    2    4:areturn         
	}

	public String toString()
	{
		int i = zzaKE;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int zzaKE>
	//    2    4:istore_1        
		String s = mPath;
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field String mPath>
	//    5    9:astore          4
		Object obj;
		if(zzbeL == null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #34  <Field byte[] zzbeL>
	//*   8   15:ifnonnull       24
			obj = "null";
	//    9   18:ldc1            #46  <String "null">
	//   10   20:astore_3        
		else
	//*  11   21:goto            33
			obj = ((Object) (Integer.valueOf(zzbeL.length)));
	//   12   24:aload_0         
	//   13   25:getfield        #34  <Field byte[] zzbeL>
	//   14   28:arraylength     
	//   15   29:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   16   32:astore_3        
		obj = ((Object) (String.valueOf(obj)));
	//   17   33:aload_3         
	//   18   34:invokestatic    #57  <Method String String.valueOf(Object)>
	//   19   37:astore_3        
		int j = String.valueOf(((Object) (s))).length();
	//   20   38:aload           4
	//   21   40:invokestatic    #57  <Method String String.valueOf(Object)>
	//   22   43:invokevirtual   #60  <Method int String.length()>
	//   23   46:istore_2        
		return (new StringBuilder(String.valueOf(obj).length() + (j + 43))).append("MessageEventParcelable[").append(i).append(",").append(s).append(", size=").append(((String) (obj))).append("]").toString();
	//   24   47:new             #62  <Class StringBuilder>
	//   25   50:dup             
	//   26   51:aload_3         
	//   27   52:invokestatic    #57  <Method String String.valueOf(Object)>
	//   28   55:invokevirtual   #60  <Method int String.length()>
	//   29   58:iload_2         
	//   30   59:bipush          43
	//   31   61:iadd            
	//   32   62:iadd            
	//   33   63:invokespecial   #65  <Method void StringBuilder(int)>
	//   34   66:ldc1            #67  <String "MessageEventParcelable[">
	//   35   68:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:iload_1         
	//   37   72:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   38   75:ldc1            #76  <String ",">
	//   39   77:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   40   80:aload           4
	//   41   82:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   42   85:ldc1            #78  <String ", size=">
	//   43   87:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   44   90:aload_3         
	//   45   91:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   46   94:ldc1            #80  <String "]">
	//   47   96:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   48   99:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   49  102:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzca.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #88  <Method void com.google.android.gms.wearable.internal.zzca.zza(zzbz, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzca();
	private final String mPath;
	private final int zzaKE;
	private final String zzacO;
	private final byte zzbeL[];

	static 
	{
	//    0    0:new             #20  <Class zzca>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzca()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
