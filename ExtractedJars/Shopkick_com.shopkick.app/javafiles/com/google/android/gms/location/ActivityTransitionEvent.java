// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//			zzd, DetectedActivity, ActivityTransition

public class ActivityTransitionEvent extends AbstractSafeParcelable
{

	public ActivityTransitionEvent(int i, int j, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void AbstractSafeParcelable()>
		DetectedActivity.zzb(i);
	//    2    4:iload_1         
	//    3    5:invokestatic    #47  <Method void DetectedActivity.zzb(int)>
		ActivityTransition.zza(j);
	//    4    8:iload_2         
	//    5    9:invokestatic    #52  <Method void ActivityTransition.zza(int)>
		zzi = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #54  <Field int zzi>
		zzj = j;
	//    9   17:aload_0         
	//   10   18:iload_2         
	//   11   19:putfield        #56  <Field int zzj>
		zzk = l;
	//   12   22:aload_0         
	//   13   23:lload_3         
	//   14   24:putfield        #58  <Field long zzk>
	//   15   27:return          
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
		if(!(obj instanceof ActivityTransitionEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ActivityTransitionEvent>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ActivityTransitionEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ActivityTransitionEvent>
	//   12   20:astore_1        
		return zzi == ((ActivityTransitionEvent) (obj)).zzi && zzj == ((ActivityTransitionEvent) (obj)).zzj && zzk == ((ActivityTransitionEvent) (obj)).zzk;
	//   13   21:aload_0         
	//   14   22:getfield        #54  <Field int zzi>
	//   15   25:aload_1         
	//   16   26:getfield        #54  <Field int zzi>
	//   17   29:icmpne          57
	//   18   32:aload_0         
	//   19   33:getfield        #56  <Field int zzj>
	//   20   36:aload_1         
	//   21   37:getfield        #56  <Field int zzj>
	//   22   40:icmpne          57
	//   23   43:aload_0         
	//   24   44:getfield        #58  <Field long zzk>
	//   25   47:aload_1         
	//   26   48:getfield        #58  <Field long zzk>
	//   27   51:lcmp            
	//   28   52:ifne            57
	//   29   55:iconst_1        
	//   30   56:ireturn         
	//   31   57:iconst_0        
	//   32   58:ireturn         
	}

	public int getActivityType()
	{
		return zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int zzi>
	//    2    4:ireturn         
	}

	public long getElapsedRealTimeNanos()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field long zzk>
	//    2    4:lreturn         
	}

	public int getTransitionType()
	{
		return zzj;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int zzj>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzi), Integer.valueOf(zzj), Long.valueOf(zzk)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #54  <Field int zzi>
	//    6   10:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #56  <Field int zzj>
	//   12   20:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #58  <Field long zzk>
	//   18   30:invokestatic    #78  <Method Long Long.valueOf(long)>
	//   19   33:aastore         
	//   20   34:invokestatic    #83  <Method int Objects.hashCode(Object[])>
	//   21   37:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          4
		int i = zzi;
	//    4    9:aload_0         
	//    5   10:getfield        #54  <Field int zzi>
	//    6   13:istore_1        
		StringBuilder stringbuilder1 = new StringBuilder(24);
	//    7   14:new             #87  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:bipush          24
	//   10   20:invokespecial   #90  <Method void StringBuilder(int)>
	//   11   23:astore          5
		stringbuilder1.append("ActivityType ");
	//   12   25:aload           5
	//   13   27:ldc1            #92  <String "ActivityType ">
	//   14   29:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder1.append(i);
	//   16   33:aload           5
	//   17   35:iload_1         
	//   18   36:invokevirtual   #99  <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   20   40:aload           4
	//   21   42:aload           5
	//   22   44:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   23   47:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		stringbuilder.append(" ");
	//   25   51:aload           4
	//   26   53:ldc1            #103 <String " ">
	//   27   55:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
		i = zzj;
	//   29   59:aload_0         
	//   30   60:getfield        #56  <Field int zzj>
	//   31   63:istore_1        
		stringbuilder1 = new StringBuilder(26);
	//   32   64:new             #87  <Class StringBuilder>
	//   33   67:dup             
	//   34   68:bipush          26
	//   35   70:invokespecial   #90  <Method void StringBuilder(int)>
	//   36   73:astore          5
		stringbuilder1.append("TransitionType ");
	//   37   75:aload           5
	//   38   77:ldc1            #105 <String "TransitionType ">
	//   39   79:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
		stringbuilder1.append(i);
	//   41   83:aload           5
	//   42   85:iload_1         
	//   43   86:invokevirtual   #99  <Method StringBuilder StringBuilder.append(int)>
	//   44   89:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   45   90:aload           4
	//   46   92:aload           5
	//   47   94:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   48   97:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   49  100:pop             
		stringbuilder.append(" ");
	//   50  101:aload           4
	//   51  103:ldc1            #103 <String " ">
	//   52  105:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   53  108:pop             
		long l = zzk;
	//   54  109:aload_0         
	//   55  110:getfield        #58  <Field long zzk>
	//   56  113:lstore_2        
		stringbuilder1 = new StringBuilder(41);
	//   57  114:new             #87  <Class StringBuilder>
	//   58  117:dup             
	//   59  118:bipush          41
	//   60  120:invokespecial   #90  <Method void StringBuilder(int)>
	//   61  123:astore          5
		stringbuilder1.append("ElapsedRealTimeNanos ");
	//   62  125:aload           5
	//   63  127:ldc1            #107 <String "ElapsedRealTimeNanos ">
	//   64  129:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   65  132:pop             
		stringbuilder1.append(l);
	//   66  133:aload           5
	//   67  135:lload_2         
	//   68  136:invokevirtual   #110 <Method StringBuilder StringBuilder.append(long)>
	//   69  139:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   70  140:aload           4
	//   71  142:aload           5
	//   72  144:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   73  147:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   74  150:pop             
		return stringbuilder.toString();
	//   75  151:aload           4
	//   76  153:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   77  156:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #118 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, getActivityType());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #120 <Method int getActivityType()>
	//    7   11:invokestatic    #124 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #126 <Method int getTransitionType()>
	//   12   20:invokestatic    #124 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 3, getElapsedRealTimeNanos());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #128 <Method long getElapsedRealTimeNanos()>
	//   17   29:invokestatic    #132 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #135 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	private final int zzi;
	private final int zzj;
	private final long zzk;

	static 
	{
	//    0    0:new             #31  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzd()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
