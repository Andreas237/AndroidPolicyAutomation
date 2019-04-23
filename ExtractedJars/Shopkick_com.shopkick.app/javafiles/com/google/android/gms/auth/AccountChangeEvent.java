// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth:
//			zza

public class AccountChangeEvent extends AbstractSafeParcelable
{

	AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zze = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #44  <Field int zze>
		zzf = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #46  <Field long zzf>
		zzg = (String)Preconditions.checkNotNull(((Object) (s)));
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:invokestatic    #52  <Method Object Preconditions.checkNotNull(Object)>
	//   11   20:checkcast       #54  <Class String>
	//   12   23:putfield        #56  <Field String zzg>
		zzh = j;
	//   13   26:aload_0         
	//   14   27:iload           5
	//   15   29:putfield        #58  <Field int zzh>
		zzi = k;
	//   16   32:aload_0         
	//   17   33:iload           6
	//   18   35:putfield        #60  <Field int zzi>
		zzj = s1;
	//   19   38:aload_0         
	//   20   39:aload           7
	//   21   41:putfield        #62  <Field String zzj>
	//   22   44:return          
	}

	public AccountChangeEvent(long l, String s, int i, int j, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zze = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #44  <Field int zze>
		zzf = l;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #46  <Field long zzf>
		zzg = (String)Preconditions.checkNotNull(((Object) (s)));
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #52  <Method Object Preconditions.checkNotNull(Object)>
	//   11   19:checkcast       #54  <Class String>
	//   12   22:putfield        #56  <Field String zzg>
		zzh = i;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #58  <Field int zzh>
		zzi = j;
	//   16   31:aload_0         
	//   17   32:iload           5
	//   18   34:putfield        #60  <Field int zzi>
		zzj = s1;
	//   19   37:aload_0         
	//   20   38:aload           6
	//   21   40:putfield        #62  <Field String zzj>
	//   22   43:return          
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
		if(obj instanceof AccountChangeEvent)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AccountChangeEvent>
	//*   7   11:ifeq            96
		{
			obj = ((Object) ((AccountChangeEvent)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class AccountChangeEvent>
	//   10   18:astore_1        
			return zze == ((AccountChangeEvent) (obj)).zze && zzf == ((AccountChangeEvent) (obj)).zzf && Objects.equal(((Object) (zzg)), ((Object) (((AccountChangeEvent) (obj)).zzg))) && zzh == ((AccountChangeEvent) (obj)).zzh && zzi == ((AccountChangeEvent) (obj)).zzi && Objects.equal(((Object) (zzj)), ((Object) (((AccountChangeEvent) (obj)).zzj)));
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field int zze>
	//   13   23:aload_1         
	//   14   24:getfield        #44  <Field int zze>
	//   15   27:icmpne          94
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field long zzf>
	//   18   34:aload_1         
	//   19   35:getfield        #46  <Field long zzf>
	//   20   38:lcmp            
	//   21   39:ifne            94
	//   22   42:aload_0         
	//   23   43:getfield        #56  <Field String zzg>
	//   24   46:aload_1         
	//   25   47:getfield        #56  <Field String zzg>
	//   26   50:invokestatic    #73  <Method boolean Objects.equal(Object, Object)>
	//   27   53:ifeq            94
	//   28   56:aload_0         
	//   29   57:getfield        #58  <Field int zzh>
	//   30   60:aload_1         
	//   31   61:getfield        #58  <Field int zzh>
	//   32   64:icmpne          94
	//   33   67:aload_0         
	//   34   68:getfield        #60  <Field int zzi>
	//   35   71:aload_1         
	//   36   72:getfield        #60  <Field int zzi>
	//   37   75:icmpne          94
	//   38   78:aload_0         
	//   39   79:getfield        #62  <Field String zzj>
	//   40   82:aload_1         
	//   41   83:getfield        #62  <Field String zzj>
	//   42   86:invokestatic    #73  <Method boolean Objects.equal(Object, Object)>
	//   43   89:ifeq            94
	//   44   92:iconst_1        
	//   45   93:ireturn         
	//   46   94:iconst_0        
	//   47   95:ireturn         
		} else
		{
			return false;
	//   48   96:iconst_0        
	//   49   97:ireturn         
		}
	}

	public String getAccountName()
	{
		return zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String zzg>
	//    2    4:areturn         
	}

	public String getChangeData()
	{
		return zzj;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String zzj>
	//    2    4:areturn         
	}

	public int getChangeType()
	{
		return zzh;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int zzh>
	//    2    4:ireturn         
	}

	public int getEventIndex()
	{
		return zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int zzi>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zze), Long.valueOf(zzf), zzg, Integer.valueOf(zzh), Integer.valueOf(zzi), zzj
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #44  <Field int zze>
	//    6   11:invokestatic    #88  <Method Integer Integer.valueOf(int)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #46  <Field long zzf>
	//   12   21:invokestatic    #93  <Method Long Long.valueOf(long)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #56  <Field String zzg>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #58  <Field int zzh>
	//   23   38:invokestatic    #88  <Method Integer Integer.valueOf(int)>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:aload_0         
	//   28   45:getfield        #60  <Field int zzi>
	//   29   48:invokestatic    #88  <Method Integer Integer.valueOf(int)>
	//   30   51:aastore         
	//   31   52:dup             
	//   32   53:iconst_5        
	//   33   54:aload_0         
	//   34   55:getfield        #62  <Field String zzj>
	//   35   58:aastore         
	//   36   59:invokestatic    #96  <Method int Objects.hashCode(Object[])>
	//   37   62:ireturn         
	}

	public String toString()
	{
		String s = "UNKNOWN";
	//    0    0:ldc1            #99  <String "UNKNOWN">
	//    1    2:astore_2        
		switch(zzh)
	//*   2    3:aload_0         
	//*   3    4:getfield        #58  <Field int zzh>
		{
	//*   4    7:tableswitch     1 4: default 36
	//	               1 57
	//	               2 51
	//	               3 45
	//	               4 39
	//*   5   36:goto            60
		case 4: // '\004'
			s = "RENAMED_TO";
	//    6   39:ldc1            #101 <String "RENAMED_TO">
	//    7   41:astore_2        
			break;

	//*   8   42:goto            60
		case 3: // '\003'
			s = "RENAMED_FROM";
	//    9   45:ldc1            #103 <String "RENAMED_FROM">
	//   10   47:astore_2        
			break;

	//*  11   48:goto            60
		case 2: // '\002'
			s = "REMOVED";
	//   12   51:ldc1            #105 <String "REMOVED">
	//   13   53:astore_2        
			break;

	//*  14   54:goto            60
		case 1: // '\001'
			s = "ADDED";
	//   15   57:ldc1            #107 <String "ADDED">
	//   16   59:astore_2        
			break;
		}
		String s1 = zzg;
	//   17   60:aload_0         
	//   18   61:getfield        #56  <Field String zzg>
	//   19   64:astore_3        
		String s2 = zzj;
	//   20   65:aload_0         
	//   21   66:getfield        #62  <Field String zzj>
	//   22   69:astore          4
		int i = zzi;
	//   23   71:aload_0         
	//   24   72:getfield        #60  <Field int zzi>
	//   25   75:istore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 91 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s2))).length());
	//   26   76:new             #109 <Class StringBuilder>
	//   27   79:dup             
	//   28   80:aload_3         
	//   29   81:invokestatic    #112 <Method String String.valueOf(Object)>
	//   30   84:invokevirtual   #115 <Method int String.length()>
	//   31   87:bipush          91
	//   32   89:iadd            
	//   33   90:aload_2         
	//   34   91:invokestatic    #112 <Method String String.valueOf(Object)>
	//   35   94:invokevirtual   #115 <Method int String.length()>
	//   36   97:iadd            
	//   37   98:aload           4
	//   38  100:invokestatic    #112 <Method String String.valueOf(Object)>
	//   39  103:invokevirtual   #115 <Method int String.length()>
	//   40  106:iadd            
	//   41  107:invokespecial   #118 <Method void StringBuilder(int)>
	//   42  110:astore          5
		stringbuilder.append("AccountChangeEvent {accountName = ");
	//   43  112:aload           5
	//   44  114:ldc1            #120 <String "AccountChangeEvent {accountName = ">
	//   45  116:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   46  119:pop             
		stringbuilder.append(s1);
	//   47  120:aload           5
	//   48  122:aload_3         
	//   49  123:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   50  126:pop             
		stringbuilder.append(", changeType = ");
	//   51  127:aload           5
	//   52  129:ldc1            #126 <String ", changeType = ">
	//   53  131:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   54  134:pop             
		stringbuilder.append(s);
	//   55  135:aload           5
	//   56  137:aload_2         
	//   57  138:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   58  141:pop             
		stringbuilder.append(", changeData = ");
	//   59  142:aload           5
	//   60  144:ldc1            #128 <String ", changeData = ">
	//   61  146:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   62  149:pop             
		stringbuilder.append(s2);
	//   63  150:aload           5
	//   64  152:aload           4
	//   65  154:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   66  157:pop             
		stringbuilder.append(", eventIndex = ");
	//   67  158:aload           5
	//   68  160:ldc1            #130 <String ", eventIndex = ">
	//   69  162:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   70  165:pop             
		stringbuilder.append(i);
	//   71  166:aload           5
	//   72  168:iload_1         
	//   73  169:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   74  172:pop             
		stringbuilder.append("}");
	//   75  173:aload           5
	//   76  175:ldc1            #135 <String "}">
	//   77  177:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   78  180:pop             
		return stringbuilder.toString();
	//   79  181:aload           5
	//   80  183:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   81  186:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #145 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zze);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field int zze>
	//    7   11:invokestatic    #149 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 2, zzf);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #46  <Field long zzf>
	//   12   20:invokestatic    #153 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 3, zzg, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #56  <Field String zzg>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #157 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 4, zzh);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #58  <Field int zzh>
	//   23   39:invokestatic    #149 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 5, zzi);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #60  <Field int zzi>
	//   28   48:invokestatic    #149 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 6, zzj, false);
	//   29   51:aload_1         
	//   30   52:bipush          6
	//   31   54:aload_0         
	//   32   55:getfield        #62  <Field String zzj>
	//   33   58:iconst_0        
	//   34   59:invokestatic    #157 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   35   62:aload_1         
	//   36   63:iload_2         
	//   37   64:invokestatic    #160 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   38   67:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	private final int zze;
	private final long zzf;
	private final String zzg;
	private final int zzh;
	private final int zzi;
	private final String zzj;

	static 
	{
	//    0    0:new             #32  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void zza()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
