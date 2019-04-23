// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzf, zze, ActivityTransition

public class ActivityTransitionRequest extends AbstractSafeParcelable
{

	public ActivityTransitionRequest(List list)
	{
		this(list, ((String) (null)), ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #52  <Method void ActivityTransitionRequest(List, String, List)>
	//    5    7:return          
	}

	public ActivityTransitionRequest(List list, String s, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void AbstractSafeParcelable()>
		Preconditions.checkNotNull(((Object) (list)), "transitions can't be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #59  <String "transitions can't be null">
	//    4    7:invokestatic    #65  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		boolean flag;
		if(list.size() > 0)
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #71  <Method int List.size()>
	//*   8   17:ifle            26
			flag = true;
	//    9   20:iconst_1        
	//   10   21:istore          4
		else
	//*  11   23:goto            29
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore          4
		Preconditions.checkArgument(flag, "transitions can't be empty.");
	//   14   29:iload           4
	//   15   31:ldc1            #73  <String "transitions can't be empty.">
	//   16   33:invokestatic    #77  <Method void Preconditions.checkArgument(boolean, Object)>
		TreeSet treeset = new TreeSet(IS_SAME_TRANSITION);
	//   17   36:new             #79  <Class TreeSet>
	//   18   39:dup             
	//   19   40:getstatic       #47  <Field Comparator IS_SAME_TRANSITION>
	//   20   43:invokespecial   #82  <Method void TreeSet(Comparator)>
	//   21   46:astore          5
		ActivityTransition activitytransition;
		for(Iterator iterator = list.iterator(); iterator.hasNext(); Preconditions.checkArgument(treeset.add(((Object) (activitytransition))), ((Object) (String.format("Found duplicated transition: %s.", new Object[] {
	activitytransition
})))))
	//*  22   48:aload_1         
	//*  23   49:invokeinterface #86  <Method Iterator List.iterator()>
	//*  24   54:astore          6
	//*  25   56:aload           6
	//*  26   58:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//*  27   63:ifeq            105
			activitytransition = (ActivityTransition)iterator.next();
	//   28   66:aload           6
	//   29   68:invokeinterface #96  <Method Object Iterator.next()>
	//   30   73:checkcast       #98  <Class ActivityTransition>
	//   31   76:astore          7

	//   32   78:aload           5
	//   33   80:aload           7
	//   34   82:invokevirtual   #102 <Method boolean TreeSet.add(Object)>
	//   35   85:ldc1            #104 <String "Found duplicated transition: %s.">
	//   36   87:iconst_1        
	//   37   88:anewarray       Object[]
	//   38   91:dup             
	//   39   92:iconst_0        
	//   40   93:aload           7
	//   41   95:aastore         
	//   42   96:invokestatic    #112 <Method String String.format(String, Object[])>
	//   43   99:invokestatic    #77  <Method void Preconditions.checkArgument(boolean, Object)>
	//*  44  102:goto            56
		zzl = Collections.unmodifiableList(list);
	//   45  105:aload_0         
	//   46  106:aload_1         
	//   47  107:invokestatic    #118 <Method List Collections.unmodifiableList(List)>
	//   48  110:putfield        #120 <Field List zzl>
		tag = s;
	//   49  113:aload_0         
	//   50  114:aload_2         
	//   51  115:putfield        #122 <Field String tag>
		if(list1 == null)
	//*  52  118:aload_3         
	//*  53  119:ifnonnull       129
			list = Collections.emptyList();
	//   54  122:invokestatic    #126 <Method List Collections.emptyList()>
	//   55  125:astore_1        
		else
	//*  56  126:goto            134
			list = Collections.unmodifiableList(list1);
	//   57  129:aload_3         
	//   58  130:invokestatic    #118 <Method List Collections.unmodifiableList(List)>
	//   59  133:astore_1        
		zzm = list;
	//   60  134:aload_0         
	//   61  135:aload_1         
	//   62  136:putfield        #128 <Field List zzm>
	//   63  139:return          
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          73
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #136 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #136 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((ActivityTransitionRequest)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ActivityTransitionRequest>
	//   16   28:astore_1        
			if(Objects.equal(((Object) (zzl)), ((Object) (((ActivityTransitionRequest) (obj)).zzl))) && Objects.equal(((Object) (tag)), ((Object) (((ActivityTransitionRequest) (obj)).tag))) && Objects.equal(((Object) (zzm)), ((Object) (((ActivityTransitionRequest) (obj)).zzm))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #120 <Field List zzl>
	//*  19   33:aload_1         
	//*  20   34:getfield        #120 <Field List zzl>
	//*  21   37:invokestatic    #142 <Method boolean Objects.equal(Object, Object)>
	//*  22   40:ifeq            73
	//*  23   43:aload_0         
	//*  24   44:getfield        #122 <Field String tag>
	//*  25   47:aload_1         
	//*  26   48:getfield        #122 <Field String tag>
	//*  27   51:invokestatic    #142 <Method boolean Objects.equal(Object, Object)>
	//*  28   54:ifeq            73
	//*  29   57:aload_0         
	//*  30   58:getfield        #128 <Field List zzm>
	//*  31   61:aload_1         
	//*  32   62:getfield        #128 <Field List zzm>
	//*  33   65:invokestatic    #142 <Method boolean Objects.equal(Object, Object)>
	//*  34   68:ifeq            73
				return true;
	//   35   71:iconst_1        
	//   36   72:ireturn         
		}
		return false;
	//   37   73:iconst_0        
	//   38   74:ireturn         
	}

	public int hashCode()
	{
		int k = zzl.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List zzl>
	//    2    4:invokeinterface #145 <Method int List.hashCode()>
	//    3    9:istore_3        
		Object obj = ((Object) (tag));
	//    4   10:aload_0         
	//    5   11:getfield        #122 <Field String tag>
	//    6   14:astore          4
		int j = 0;
	//    7   16:iconst_0        
	//    8   17:istore_2        
		int i;
		if(obj != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          32
			i = ((String) (obj)).hashCode();
	//   11   23:aload           4
	//   12   25:invokevirtual   #146 <Method int String.hashCode()>
	//   13   28:istore_1        
		else
	//*  14   29:goto            34
			i = 0;
	//   15   32:iconst_0        
	//   16   33:istore_1        
		obj = ((Object) (zzm));
	//   17   34:aload_0         
	//   18   35:getfield        #128 <Field List zzm>
	//   19   38:astore          4
		if(obj != null)
	//*  20   40:aload           4
	//*  21   42:ifnull          53
			j = ((List) (obj)).hashCode();
	//   22   45:aload           4
	//   23   47:invokeinterface #145 <Method int List.hashCode()>
	//   24   52:istore_2        
		return (k * 31 + i) * 31 + j;
	//   25   53:iload_3         
	//   26   54:bipush          31
	//   27   56:imul            
	//   28   57:iload_1         
	//   29   58:iadd            
	//   30   59:bipush          31
	//   31   61:imul            
	//   32   62:iload_2         
	//   33   63:iadd            
	//   34   64:ireturn         
	}

	public void serializeToIntentExtra(Intent intent)
	{
		SafeParcelableSerializer.serializeToIntentExtra(((com.google.android.gms.common.internal.safeparcel.SafeParcelable) (this)), intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #150 <String "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST">
	//    3    4:invokestatic    #155 <Method void SafeParcelableSerializer.serializeToIntentExtra(com.google.android.gms.common.internal.safeparcel.SafeParcelable, Intent, String)>
	//    4    7:return          
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (zzl)));
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List zzl>
	//    2    4:invokestatic    #161 <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		String s1 = tag;
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field String tag>
	//    6   12:astore_2        
		String s2 = String.valueOf(((Object) (zzm)));
	//    7   13:aload_0         
	//    8   14:getfield        #128 <Field List zzm>
	//    9   17:invokestatic    #161 <Method String String.valueOf(Object)>
	//   10   20:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 61 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   11   21:new             #163 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokestatic    #161 <Method String String.valueOf(Object)>
	//   15   29:invokevirtual   #166 <Method int String.length()>
	//   16   32:bipush          61
	//   17   34:iadd            
	//   18   35:aload_2         
	//   19   36:invokestatic    #161 <Method String String.valueOf(Object)>
	//   20   39:invokevirtual   #166 <Method int String.length()>
	//   21   42:iadd            
	//   22   43:aload_3         
	//   23   44:invokestatic    #161 <Method String String.valueOf(Object)>
	//   24   47:invokevirtual   #166 <Method int String.length()>
	//   25   50:iadd            
	//   26   51:invokespecial   #169 <Method void StringBuilder(int)>
	//   27   54:astore          4
		stringbuilder.append("ActivityTransitionRequest [mTransitions=");
	//   28   56:aload           4
	//   29   58:ldc1            #171 <String "ActivityTransitionRequest [mTransitions=">
	//   30   60:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
		stringbuilder.append(s);
	//   32   64:aload           4
	//   33   66:aload_1         
	//   34   67:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
		stringbuilder.append(", mTag='");
	//   36   71:aload           4
	//   37   73:ldc1            #177 <String ", mTag='">
	//   38   75:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		stringbuilder.append(s1);
	//   40   79:aload           4
	//   41   81:aload_2         
	//   42   82:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
		stringbuilder.append('\'');
	//   44   86:aload           4
	//   45   88:bipush          39
	//   46   90:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   47   93:pop             
		stringbuilder.append(", mClients=");
	//   48   94:aload           4
	//   49   96:ldc1            #182 <String ", mClients=">
	//   50   98:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   51  101:pop             
		stringbuilder.append(s2);
	//   52  102:aload           4
	//   53  104:aload_3         
	//   54  105:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
		stringbuilder.append(']');
	//   56  109:aload           4
	//   57  111:bipush          93
	//   58  113:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   59  116:pop             
		return stringbuilder.toString();
	//   60  117:aload           4
	//   61  119:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   62  122:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #192 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeTypedList(parcel, 1, zzl, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #120 <Field List zzl>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #196 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 2, tag, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #122 <Field String tag>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #200 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 3, zzm, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #128 <Field List zzm>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #196 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   21   35:aload_1         
	//   22   36:iload_2         
	//   23   37:invokestatic    #203 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   24   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzf();
	public static final Comparator IS_SAME_TRANSITION = new zze();
	private final String tag;
	private final List zzl;
	private final List zzm;

	static 
	{
	//    0    0:new             #37  <Class zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void zzf()>
	//    3    7:putstatic       #42  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #44  <Class zze>
	//    5   13:dup             
	//    6   14:invokespecial   #45  <Method void zze()>
	//    7   17:putstatic       #47  <Field Comparator IS_SAME_TRANSITION>
	//*   8   20:return          
	}
}
