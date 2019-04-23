// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.*;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//			zzg, ActivityTransitionEvent

public class ActivityTransitionResult extends AbstractSafeParcelable
{

	public ActivityTransitionResult(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		Preconditions.checkNotNull(((Object) (list)), "transitionEvents list can't be null.");
	//    2    4:aload_1         
	//    3    5:ldc1            #37  <String "transitionEvents list can't be null.">
	//    4    7:invokestatic    #43  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		if(!list.isEmpty())
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #49  <Method boolean List.isEmpty()>
	//*   8   17:ifne            82
		{
			for(int i = 1; i < list.size(); i++)
	//*   9   20:iconst_1        
	//*  10   21:istore_2        
	//*  11   22:iload_2         
	//*  12   23:aload_1         
	//*  13   24:invokeinterface #53  <Method int List.size()>
	//*  14   29:icmpge          82
			{
				boolean flag;
				if(((ActivityTransitionEvent)list.get(i)).getElapsedRealTimeNanos() >= ((ActivityTransitionEvent)list.get(i - 1)).getElapsedRealTimeNanos())
	//*  15   32:aload_1         
	//*  16   33:iload_2         
	//*  17   34:invokeinterface #57  <Method Object List.get(int)>
	//*  18   39:checkcast       #59  <Class ActivityTransitionEvent>
	//*  19   42:invokevirtual   #63  <Method long ActivityTransitionEvent.getElapsedRealTimeNanos()>
	//*  20   45:aload_1         
	//*  21   46:iload_2         
	//*  22   47:iconst_1        
	//*  23   48:isub            
	//*  24   49:invokeinterface #57  <Method Object List.get(int)>
	//*  25   54:checkcast       #59  <Class ActivityTransitionEvent>
	//*  26   57:invokevirtual   #63  <Method long ActivityTransitionEvent.getElapsedRealTimeNanos()>
	//*  27   60:lcmp            
	//*  28   61:iflt            69
					flag = true;
	//   29   64:iconst_1        
	//   30   65:istore_3        
				else
	//*  31   66:goto            71
					flag = false;
	//   32   69:iconst_0        
	//   33   70:istore_3        
				Preconditions.checkArgument(flag);
	//   34   71:iload_3         
	//   35   72:invokestatic    #67  <Method void Preconditions.checkArgument(boolean)>
			}

	//   36   75:iload_2         
	//   37   76:iconst_1        
	//   38   77:iadd            
	//   39   78:istore_2        
		}
	//*  40   79:goto            22
		zzn = Collections.unmodifiableList(list);
	//   41   82:aload_0         
	//   42   83:aload_1         
	//   43   84:invokestatic    #73  <Method List Collections.unmodifiableList(List)>
	//   44   87:putfield        #75  <Field List zzn>
	//   45   90:return          
	}

	public static ActivityTransitionResult extractResult(Intent intent)
	{
		if(!hasResult(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #86  <Method boolean hasResult(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (ActivityTransitionResult)SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
	//    5    9:aload_0         
	//    6   10:ldc1            #88  <String "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT">
	//    7   12:getstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//    8   15:invokestatic    #94  <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable SafeParcelableSerializer.deserializeFromIntentExtra(Intent, String, android.os.Parcelable$Creator)>
	//    9   18:checkcast       #2   <Class ActivityTransitionResult>
	//   10   21:areturn         
	}

	public static boolean hasResult(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
	//    4    6:aload_0         
	//    5    7:ldc1            #88  <String "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT">
	//    6    9:invokevirtual   #100 <Method boolean Intent.hasExtra(String)>
	//    7   12:ireturn         
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
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #108 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #108 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
			return zzn.equals(((Object) (((ActivityTransitionResult)obj).zzn)));
	//   13   25:aload_0         
	//   14   26:getfield        #75  <Field List zzn>
	//   15   29:aload_1         
	//   16   30:checkcast       #2   <Class ActivityTransitionResult>
	//   17   33:getfield        #75  <Field List zzn>
	//   18   36:invokeinterface #110 <Method boolean List.equals(Object)>
	//   19   41:ireturn         
		else
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
	}

	public List getTransitionEvents()
	{
		return zzn;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field List zzn>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return zzn.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field List zzn>
	//    2    4:invokeinterface #115 <Method int List.hashCode()>
	//    3    9:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #123 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeTypedList(parcel, 1, getTransitionEvents(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #125 <Method List getTransitionEvents()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #129 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #132 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzg();
	private final List zzn;

	static 
	{
	//    0    0:new             #25  <Class zzg>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzg()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
