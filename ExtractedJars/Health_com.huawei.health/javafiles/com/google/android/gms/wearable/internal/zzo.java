// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzp

public class zzo extends zza
	implements CapabilityInfo
{

	public zzo(String s, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zza()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void Object()>
	//    6   12:putfield        #36  <Field Object zzrJ>
		mName = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #38  <Field String mName>
		zzbTQ = list;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #40  <Field List zzbTQ>
		zzbTN = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #42  <Field Set zzbTN>
		zzUs();
	//   16   30:aload_0         
	//   17   31:invokespecial   #45  <Method void zzUs()>
	//   18   34:return          
	}

	private void zzUs()
	{
		zzac.zzw(((Object) (mName)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String mName>
	//    2    4:invokestatic    #53  <Method Object zzac.zzw(Object)>
	//    3    7:pop             
		zzac.zzw(((Object) (zzbTQ)));
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field List zzbTQ>
	//    6   12:invokestatic    #53  <Method Object zzac.zzw(Object)>
	//    7   15:pop             
	//    8   16:return          
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
	//*   8   12:invokevirtual   #59  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #59  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((zzo)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzo>
	//   16   28:astore_1        
		if(mName == null ? ((zzo) (obj)).mName != null : !mName.equals(((Object) (((zzo) (obj)).mName))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #38  <Field String mName>
	//*  19   33:ifnull          53
	//*  20   36:aload_0         
	//*  21   37:getfield        #38  <Field String mName>
	//*  22   40:aload_1         
	//*  23   41:getfield        #38  <Field String mName>
	//*  24   44:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  25   47:ifne            62
	//*  26   50:goto            60
	//*  27   53:aload_1         
	//*  28   54:getfield        #38  <Field String mName>
	//*  29   57:ifnull          62
			return false;
	//   30   60:iconst_0        
	//   31   61:ireturn         
		return zzbTQ == null ? ((zzo) (obj)).zzbTQ == null : zzbTQ.equals(((Object) (((zzo) (obj)).zzbTQ)));
	//   32   62:aload_0         
	//   33   63:getfield        #40  <Field List zzbTQ>
	//   34   66:ifnull          88
	//   35   69:aload_0         
	//   36   70:getfield        #40  <Field List zzbTQ>
	//   37   73:aload_1         
	//   38   74:getfield        #40  <Field List zzbTQ>
	//   39   77:invokeinterface #66  <Method boolean List.equals(Object)>
	//   40   82:ifne            97
	//   41   85:goto            95
	//   42   88:aload_1         
	//   43   89:getfield        #40  <Field List zzbTQ>
	//   44   92:ifnull          97
	//   45   95:iconst_0        
	//   46   96:ireturn         
	//   47   97:iconst_1        
	//   48   98:ireturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String mName>
	//    2    4:areturn         
	}

	public Set getNodes()
	{
		Object obj = zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object zzrJ>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Set set;
		if(zzbTN == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #42  <Field Set zzbTN>
	//*   7   11:ifnonnull       29
			zzbTN = ((Set) (new HashSet(((java.util.Collection) (zzbTQ)))));
	//    8   14:aload_0         
	//    9   15:new             #72  <Class HashSet>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #40  <Field List zzbTQ>
	//   13   23:invokespecial   #75  <Method void HashSet(java.util.Collection)>
	//   14   26:putfield        #42  <Field Set zzbTN>
		set = zzbTN;
	//   15   29:aload_0         
	//   16   30:getfield        #42  <Field Set zzbTN>
	//   17   33:astore_2        
		obj;
	//   18   34:aload_1         
		JVM INSTR monitorexit ;
	//   19   35:monitorexit     
		return set;
	//   20   36:aload_2         
	//   21   37:areturn         
		Exception exception;
		exception;
	//   22   38:astore_2        
	//*  23   39:aload_1         
		throw exception;
	//   24   40:monitorexit     
	//   25   41:aload_2         
	//   26   42:athrow          
	}

	public int hashCode()
	{
		int i;
		if(mName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field String mName>
	//*   2    4:ifnull          18
			i = mName.hashCode();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field String mName>
	//    5   11:invokevirtual   #80  <Method int String.hashCode()>
	//    6   14:istore_1        
		else
	//*   7   15:goto            20
			i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_1        
		int j;
		if(zzbTQ != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #40  <Field List zzbTQ>
	//*  12   24:ifnull          40
			j = zzbTQ.hashCode();
	//   13   27:aload_0         
	//   14   28:getfield        #40  <Field List zzbTQ>
	//   15   31:invokeinterface #81  <Method int List.hashCode()>
	//   16   36:istore_2        
		else
	//*  17   37:goto            42
			j = 0;
	//   18   40:iconst_0        
	//   19   41:istore_2        
		return (i + 31) * 31 + j;
	//   20   42:iload_1         
	//   21   43:bipush          31
	//   22   45:iadd            
	//   23   46:bipush          31
	//   24   48:imul            
	//   25   49:iload_2         
	//   26   50:iadd            
	//   27   51:ireturn         
	}

	public String toString()
	{
		String s = mName;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String mName>
	//    2    4:astore_2        
		String s1 = String.valueOf(((Object) (zzbTQ)));
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field List zzbTQ>
	//    5    9:invokestatic    #86  <Method String String.valueOf(Object)>
	//    6   12:astore_3        
		int i = String.valueOf(((Object) (s))).length();
	//    7   13:aload_2         
	//    8   14:invokestatic    #86  <Method String String.valueOf(Object)>
	//    9   17:invokevirtual   #89  <Method int String.length()>
	//   10   20:istore_1        
		return (new StringBuilder(String.valueOf(((Object) (s1))).length() + (i + 18))).append("CapabilityInfo{").append(s).append(", ").append(s1).append("}").toString();
	//   11   21:new             #91  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:aload_3         
	//   14   26:invokestatic    #86  <Method String String.valueOf(Object)>
	//   15   29:invokevirtual   #89  <Method int String.length()>
	//   16   32:iload_1         
	//   17   33:bipush          18
	//   18   35:iadd            
	//   19   36:iadd            
	//   20   37:invokespecial   #94  <Method void StringBuilder(int)>
	//   21   40:ldc1            #96  <String "CapabilityInfo{">
	//   22   42:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:ldc1            #102 <String ", ">
	//   26   51:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:aload_3         
	//   28   55:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:ldc1            #104 <String "}">
	//   30   60:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   32   66:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzp.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #112 <Method void com.google.android.gms.wearable.internal.zzp.zza(zzo, Parcel, int)>
	//    4    6:return          
	}

	public List zzUt()
	{
		return zzbTQ;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List zzbTQ>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzp();
	private final String mName;
	private Set zzbTN;
	private final List zzbTQ;
	private final Object zzrJ = new Object();

	static 
	{
	//    0    0:new             #23  <Class zzp>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzp()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
