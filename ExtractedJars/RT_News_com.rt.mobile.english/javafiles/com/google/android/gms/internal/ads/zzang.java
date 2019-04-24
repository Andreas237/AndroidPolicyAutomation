// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanh

public final class zzang extends AbstractSafeParcelable
{

	public zzang(int i, int j, boolean flag)
	{
		this(i, j, flag, false, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:invokespecial   #43  <Method void zzang(int, int, boolean, boolean, boolean)>
	//    7    9:return          
	}

	public zzang(int i, int j, boolean flag, boolean flag1)
	{
		this(0xbdfcb8, j, true, false, flag1);
	//    0    0:aload_0         
	//    1    1:ldc1            #45  <Int 0xbdfcb8>
	//    2    3:iload_2         
	//    3    4:iconst_1        
	//    4    5:iconst_0        
	//    5    6:iload           4
	//    6    8:invokespecial   #43  <Method void zzang(int, int, boolean, boolean, boolean)>
	//    7   11:return          
	}

	private zzang(int i, int j, boolean flag, boolean flag1, boolean flag2)
	{
		String s;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            11
			s = "0";
	//    2    4:ldc1            #47  <String "0">
	//    3    6:astore          6
		else
	//*   4    8:goto            15
			s = "1";
	//    5   11:ldc1            #49  <String "1">
	//    6   13:astore          6
		StringBuilder stringbuilder = new StringBuilder(36 + String.valueOf(((Object) (s))).length());
	//    7   15:new             #51  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:bipush          36
	//   10   21:aload           6
	//   11   23:invokestatic    #57  <Method String String.valueOf(Object)>
	//   12   26:invokevirtual   #61  <Method int String.length()>
	//   13   29:iadd            
	//   14   30:invokespecial   #64  <Method void StringBuilder(int)>
	//   15   33:astore          7
		stringbuilder.append("afma-sdk-a-v");
	//   16   35:aload           7
	//   17   37:ldc1            #66  <String "afma-sdk-a-v">
	//   18   39:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:pop             
		stringbuilder.append(i);
	//   20   43:aload           7
	//   21   45:iload_1         
	//   22   46:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   23   49:pop             
		stringbuilder.append(".");
	//   24   50:aload           7
	//   25   52:ldc1            #75  <String ".">
	//   26   54:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		stringbuilder.append(j);
	//   28   58:aload           7
	//   29   60:iload_2         
	//   30   61:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   31   64:pop             
		stringbuilder.append(".");
	//   32   65:aload           7
	//   33   67:ldc1            #75  <String ".">
	//   34   69:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
		stringbuilder.append(s);
	//   36   73:aload           7
	//   37   75:aload           6
	//   38   77:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
		this(stringbuilder.toString(), i, j, flag, flag2);
	//   40   81:aload_0         
	//   41   82:aload           7
	//   42   84:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   43   87:iload_1         
	//   44   88:iload_2         
	//   45   89:iload_3         
	//   46   90:iload           5
	//   47   92:invokespecial   #82  <Method void zzang(String, int, int, boolean, boolean)>
	//   48   95:return          
	}

	zzang(String s, int i, int j, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void AbstractSafeParcelable()>
		zzcw = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #87  <Field String zzcw>
		zzcve = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #89  <Field int zzcve>
		zzcvf = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #91  <Field int zzcvf>
		zzcvg = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #93  <Field boolean zzcvg>
		zzcvh = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #95  <Field boolean zzcvh>
	//   17   31:return          
	}

	public static zzang zzsl()
	{
		return new zzang(0xbdfcc1, 0xbdfcc1, true);
	//    0    0:new             #2   <Class zzang>
	//    1    3:dup             
	//    2    4:ldc1            #100 <Int 0xbdfcc1>
	//    3    6:ldc1            #100 <Int 0xbdfcc1>
	//    4    8:iconst_1        
	//    5    9:invokespecial   #102 <Method void zzang(int, int, boolean)>
	//    6   12:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #110 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, zzcw, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #87  <Field String zzcw>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #114 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, zzcve);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #89  <Field int zzcve>
	//   13   21:invokestatic    #118 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 4, zzcvf);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #91  <Field int zzcvf>
	//   18   30:invokestatic    #118 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 5, zzcvg);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #93  <Field boolean zzcvg>
	//   23   39:invokestatic    #122 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 6, zzcvh);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #95  <Field boolean zzcvh>
	//   28   49:invokestatic    #122 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   29   52:aload_1         
	//   30   53:iload_2         
	//   31   54:invokestatic    #125 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   32   57:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzanh();
	public int zzcve;
	public int zzcvf;
	public boolean zzcvg;
	public boolean zzcvh;
	public String zzcw;

	static 
	{
	//    0    0:new             #33  <Class zzanh>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void zzanh()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
