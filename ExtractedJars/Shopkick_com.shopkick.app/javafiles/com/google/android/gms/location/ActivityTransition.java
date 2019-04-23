// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.location:
//			zzc, DetectedActivity

public class ActivityTransition extends AbstractSafeParcelable
{
	public static class Builder
	{

		public ActivityTransition build()
		{
			int i = zzi;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int zzi>
		//    2    4:istore_1        
			boolean flag1 = true;
		//    3    5:iconst_1        
		//    4    6:istore_3        
			boolean flag;
			if(i != -1)
		//*   5    7:iload_1         
		//*   6    8:iconst_m1       
		//*   7    9:icmpeq          17
				flag = true;
		//    8   12:iconst_1        
		//    9   13:istore_2        
			else
		//*  10   14:goto            19
				flag = false;
		//   11   17:iconst_0        
		//   12   18:istore_2        
			Preconditions.checkState(flag, "Activity type not set.");
		//   13   19:iload_2         
		//   14   20:ldc1            #23  <String "Activity type not set.">
		//   15   22:invokestatic    #29  <Method void Preconditions.checkState(boolean, Object)>
			if(zzj != -1)
		//*  16   25:aload_0         
		//*  17   26:getfield        #18  <Field int zzj>
		//*  18   29:iconst_m1       
		//*  19   30:icmpeq          38
				flag = flag1;
		//   20   33:iload_3         
		//   21   34:istore_2        
			else
		//*  22   35:goto            40
				flag = false;
		//   23   38:iconst_0        
		//   24   39:istore_2        
			Preconditions.checkState(flag, "Activity transition type not set.");
		//   25   40:iload_2         
		//   26   41:ldc1            #31  <String "Activity transition type not set.">
		//   27   43:invokestatic    #29  <Method void Preconditions.checkState(boolean, Object)>
			return new ActivityTransition(zzi, zzj);
		//   28   46:new             #6   <Class ActivityTransition>
		//   29   49:dup             
		//   30   50:aload_0         
		//   31   51:getfield        #16  <Field int zzi>
		//   32   54:aload_0         
		//   33   55:getfield        #18  <Field int zzj>
		//   34   58:invokespecial   #34  <Method void ActivityTransition(int, int)>
		//   35   61:areturn         
		}

		public Builder setActivityTransition(int i)
		{
			ActivityTransition.zza(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #40  <Method void ActivityTransition.zza(int)>
			zzj = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int zzj>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setActivityType(int i)
		{
			DetectedActivity.zzb(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #46  <Method void DetectedActivity.zzb(int)>
			zzi = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field int zzi>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		private int zzi;
		private int zzj;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			zzi = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #16  <Field int zzi>
			zzj = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #18  <Field int zzj>
		//    8   14:return          
		}
	}

	public static interface SupportedActivityTransition
		extends Annotation
	{
	}


	ActivityTransition(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void AbstractSafeParcelable()>
		zzi = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #48  <Field int zzi>
		zzj = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #50  <Field int zzj>
	//    8   14:return          
	}

	public static void zza(int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(i < 0 || i > 1)
	//*   2    2:iload_0         
	//*   3    3:iflt            14
	//*   4    6:iload_0         
	//*   5    7:iconst_1        
	//*   6    8:icmpgt          14
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_1        
		StringBuilder stringbuilder = new StringBuilder(41);
	//   10   16:new             #56  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:bipush          41
	//   13   22:invokespecial   #58  <Method void StringBuilder(int)>
	//   14   25:astore_2        
		stringbuilder.append("Transition type ");
	//   15   26:aload_2         
	//   16   27:ldc1            #60  <String "Transition type ">
	//   17   29:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		stringbuilder.append(i);
	//   19   33:aload_2         
	//   20   34:iload_0         
	//   21   35:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   22   38:pop             
		stringbuilder.append(" is not valid.");
	//   23   39:aload_2         
	//   24   40:ldc1            #69  <String " is not valid.">
	//   25   42:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   26   45:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   27   46:iload_1         
	//   28   47:aload_2         
	//   29   48:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   30   51:invokestatic    #79  <Method void Preconditions.checkArgument(boolean, Object)>
	//   31   54:return          
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
		if(!(obj instanceof ActivityTransition))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ActivityTransition>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ActivityTransition)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ActivityTransition>
	//   12   20:astore_1        
		return zzi == ((ActivityTransition) (obj)).zzi && zzj == ((ActivityTransition) (obj)).zzj;
	//   13   21:aload_0         
	//   14   22:getfield        #48  <Field int zzi>
	//   15   25:aload_1         
	//   16   26:getfield        #48  <Field int zzi>
	//   17   29:icmpne          45
	//   18   32:aload_0         
	//   19   33:getfield        #50  <Field int zzj>
	//   20   36:aload_1         
	//   21   37:getfield        #50  <Field int zzj>
	//   22   40:icmpne          45
	//   23   43:iconst_1        
	//   24   44:ireturn         
	//   25   45:iconst_0        
	//   26   46:ireturn         
	}

	public int getActivityType()
	{
		return zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int zzi>
	//    2    4:ireturn         
	}

	public int getTransitionType()
	{
		return zzj;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int zzj>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzi), Integer.valueOf(zzj)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field int zzi>
	//    6   10:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #50  <Field int zzj>
	//   12   20:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:invokestatic    #96  <Method int Objects.hashCode(Object[])>
	//   15   27:ireturn         
	}

	public String toString()
	{
		int i = zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int zzi>
	//    2    4:istore_1        
		int j = zzj;
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field int zzj>
	//    5    9:istore_2        
		StringBuilder stringbuilder = new StringBuilder(75);
	//    6   10:new             #56  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          75
	//    9   16:invokespecial   #58  <Method void StringBuilder(int)>
	//   10   19:astore_3        
		stringbuilder.append("ActivityTransition [mActivityType=");
	//   11   20:aload_3         
	//   12   21:ldc1            #98  <String "ActivityTransition [mActivityType=">
	//   13   23:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		stringbuilder.append(i);
	//   15   27:aload_3         
	//   16   28:iload_1         
	//   17   29:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   18   32:pop             
		stringbuilder.append(", mTransitionType=");
	//   19   33:aload_3         
	//   20   34:ldc1            #100 <String ", mTransitionType=">
	//   21   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
		stringbuilder.append(j);
	//   23   40:aload_3         
	//   24   41:iload_2         
	//   25   42:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   26   45:pop             
		stringbuilder.append(']');
	//   27   46:aload_3         
	//   28   47:bipush          93
	//   29   49:invokevirtual   #103 <Method StringBuilder StringBuilder.append(char)>
	//   30   52:pop             
		return stringbuilder.toString();
	//   31   53:aload_3         
	//   32   54:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   33   57:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #111 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, getActivityType());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #113 <Method int getActivityType()>
	//    7   11:invokestatic    #117 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #119 <Method int getTransitionType()>
	//   12   20:invokestatic    #117 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokestatic    #122 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   16   28:return          
	}

	public static final int ACTIVITY_TRANSITION_ENTER = 0;
	public static final int ACTIVITY_TRANSITION_EXIT = 1;
	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	private final int zzi;
	private final int zzj;

	static 
	{
	//    0    0:new             #36  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zzc()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
