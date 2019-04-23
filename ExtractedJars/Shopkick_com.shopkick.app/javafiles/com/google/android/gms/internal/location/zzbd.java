// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzbe

public final class zzbd extends AbstractSafeParcelable
{

	zzbd(LocationRequest locationrequest, List list, String s, boolean flag, boolean flag1, boolean flag2, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void AbstractSafeParcelable()>
		zzdk = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #70  <Field boolean zzdk>
		zzdg = locationrequest;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #72  <Field LocationRequest zzdg>
		zzm = list;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #74  <Field List zzm>
		tag = s;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #76  <Field String tag>
		zzdh = flag;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #78  <Field boolean zzdh>
		zzdi = flag1;
	//   17   30:aload_0         
	//   18   31:iload           5
	//   19   33:putfield        #80  <Field boolean zzdi>
		zzdj = flag2;
	//   20   36:aload_0         
	//   21   37:iload           6
	//   22   39:putfield        #82  <Field boolean zzdj>
		moduleId = s1;
	//   23   42:aload_0         
	//   24   43:aload           7
	//   25   45:putfield        #84  <Field String moduleId>
	//   26   48:return          
	}

	public static zzbd zza(LocationRequest locationrequest)
	{
		return new zzbd(locationrequest, zzcd, ((String) (null)), false, false, false, ((String) (null)));
	//    0    0:new             #2   <Class zzbd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #56  <Field List zzcd>
	//    4    8:aconst_null     
	//    5    9:iconst_0        
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:aconst_null     
	//    9   13:invokespecial   #93  <Method void zzbd(LocationRequest, List, String, boolean, boolean, boolean, String)>
	//   10   16:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof zzbd))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzbd>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((zzbd)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class zzbd>
	//    7   13:astore_1        
		return Objects.equal(((Object) (zzdg)), ((Object) (((zzbd) (obj)).zzdg))) && Objects.equal(((Object) (zzm)), ((Object) (((zzbd) (obj)).zzm))) && Objects.equal(((Object) (tag)), ((Object) (((zzbd) (obj)).tag))) && zzdh == ((zzbd) (obj)).zzdh && zzdi == ((zzbd) (obj)).zzdi && zzdj == ((zzbd) (obj)).zzdj && Objects.equal(((Object) (moduleId)), ((Object) (((zzbd) (obj)).moduleId)));
	//    8   14:aload_0         
	//    9   15:getfield        #72  <Field LocationRequest zzdg>
	//   10   18:aload_1         
	//   11   19:getfield        #72  <Field LocationRequest zzdg>
	//   12   22:invokestatic    #102 <Method boolean Objects.equal(Object, Object)>
	//   13   25:ifeq            105
	//   14   28:aload_0         
	//   15   29:getfield        #74  <Field List zzm>
	//   16   32:aload_1         
	//   17   33:getfield        #74  <Field List zzm>
	//   18   36:invokestatic    #102 <Method boolean Objects.equal(Object, Object)>
	//   19   39:ifeq            105
	//   20   42:aload_0         
	//   21   43:getfield        #76  <Field String tag>
	//   22   46:aload_1         
	//   23   47:getfield        #76  <Field String tag>
	//   24   50:invokestatic    #102 <Method boolean Objects.equal(Object, Object)>
	//   25   53:ifeq            105
	//   26   56:aload_0         
	//   27   57:getfield        #78  <Field boolean zzdh>
	//   28   60:aload_1         
	//   29   61:getfield        #78  <Field boolean zzdh>
	//   30   64:icmpne          105
	//   31   67:aload_0         
	//   32   68:getfield        #80  <Field boolean zzdi>
	//   33   71:aload_1         
	//   34   72:getfield        #80  <Field boolean zzdi>
	//   35   75:icmpne          105
	//   36   78:aload_0         
	//   37   79:getfield        #82  <Field boolean zzdj>
	//   38   82:aload_1         
	//   39   83:getfield        #82  <Field boolean zzdj>
	//   40   86:icmpne          105
	//   41   89:aload_0         
	//   42   90:getfield        #84  <Field String moduleId>
	//   43   93:aload_1         
	//   44   94:getfield        #84  <Field String moduleId>
	//   45   97:invokestatic    #102 <Method boolean Objects.equal(Object, Object)>
	//   46  100:ifeq            105
	//   47  103:iconst_1        
	//   48  104:ireturn         
	//   49  105:iconst_0        
	//   50  106:ireturn         
	}

	public final int hashCode()
	{
		return zzdg.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field LocationRequest zzdg>
	//    2    4:invokevirtual   #108 <Method int LocationRequest.hashCode()>
	//    3    7:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #112 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #113 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object) (zzdg)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field LocationRequest zzdg>
	//    7   13:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		if(tag != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #76  <Field String tag>
	//*  11   21:ifnull          40
		{
			stringbuilder.append(" tag=");
	//   12   24:aload_1         
	//   13   25:ldc1            #119 <String " tag=">
	//   14   27:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(tag);
	//   16   31:aload_1         
	//   17   32:aload_0         
	//   18   33:getfield        #76  <Field String tag>
	//   19   36:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		}
		if(moduleId != null)
	//*  21   40:aload_0         
	//*  22   41:getfield        #84  <Field String moduleId>
	//*  23   44:ifnull          63
		{
			stringbuilder.append(" moduleId=");
	//   24   47:aload_1         
	//   25   48:ldc1            #124 <String " moduleId=">
	//   26   50:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			stringbuilder.append(moduleId);
	//   28   54:aload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #84  <Field String moduleId>
	//   31   59:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
		}
		stringbuilder.append(" hideAppOps=");
	//   33   63:aload_1         
	//   34   64:ldc1            #126 <String " hideAppOps=">
	//   35   66:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
		stringbuilder.append(zzdh);
	//   37   70:aload_1         
	//   38   71:aload_0         
	//   39   72:getfield        #78  <Field boolean zzdh>
	//   40   75:invokevirtual   #129 <Method StringBuilder StringBuilder.append(boolean)>
	//   41   78:pop             
		stringbuilder.append(" clients=");
	//   42   79:aload_1         
	//   43   80:ldc1            #131 <String " clients=">
	//   44   82:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   45   85:pop             
		stringbuilder.append(((Object) (zzm)));
	//   46   86:aload_1         
	//   47   87:aload_0         
	//   48   88:getfield        #74  <Field List zzm>
	//   49   91:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   50   94:pop             
		stringbuilder.append(" forceCoarseLocation=");
	//   51   95:aload_1         
	//   52   96:ldc1            #133 <String " forceCoarseLocation=">
	//   53   98:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   54  101:pop             
		stringbuilder.append(zzdi);
	//   55  102:aload_1         
	//   56  103:aload_0         
	//   57  104:getfield        #80  <Field boolean zzdi>
	//   58  107:invokevirtual   #129 <Method StringBuilder StringBuilder.append(boolean)>
	//   59  110:pop             
		if(zzdj)
	//*  60  111:aload_0         
	//*  61  112:getfield        #82  <Field boolean zzdj>
	//*  62  115:ifeq            125
			stringbuilder.append(" exemptFromBackgroundThrottle");
	//   63  118:aload_1         
	//   64  119:ldc1            #135 <String " exemptFromBackgroundThrottle">
	//   65  121:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   66  124:pop             
		return stringbuilder.toString();
	//   67  125:aload_1         
	//   68  126:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   69  129:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #145 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 1, ((android.os.Parcelable) (zzdg)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #72  <Field LocationRequest zzdg>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #149 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 5, zzm, false);
	//   10   16:aload_1         
	//   11   17:iconst_5        
	//   12   18:aload_0         
	//   13   19:getfield        #74  <Field List zzm>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #153 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 6, tag, false);
	//   16   26:aload_1         
	//   17   27:bipush          6
	//   18   29:aload_0         
	//   19   30:getfield        #76  <Field String tag>
	//   20   33:iconst_0        
	//   21   34:invokestatic    #157 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 7, zzdh);
	//   22   37:aload_1         
	//   23   38:bipush          7
	//   24   40:aload_0         
	//   25   41:getfield        #78  <Field boolean zzdh>
	//   26   44:invokestatic    #161 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 8, zzdi);
	//   27   47:aload_1         
	//   28   48:bipush          8
	//   29   50:aload_0         
	//   30   51:getfield        #80  <Field boolean zzdi>
	//   31   54:invokestatic    #161 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 9, zzdj);
	//   32   57:aload_1         
	//   33   58:bipush          9
	//   34   60:aload_0         
	//   35   61:getfield        #82  <Field boolean zzdj>
	//   36   64:invokestatic    #161 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 10, moduleId, false);
	//   37   67:aload_1         
	//   38   68:bipush          10
	//   39   70:aload_0         
	//   40   71:getfield        #84  <Field String moduleId>
	//   41   74:iconst_0        
	//   42   75:invokestatic    #157 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   43   78:aload_1         
	//   44   79:iload_3         
	//   45   80:invokestatic    #164 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   46   83:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbe();
	static final List zzcd = Collections.emptyList();
	private String moduleId;
	private String tag;
	private LocationRequest zzdg;
	private boolean zzdh;
	private boolean zzdi;
	private boolean zzdj;
	private boolean zzdk;
	private List zzm;

	static 
	{
	//    0    0:invokestatic    #54  <Method List Collections.emptyList()>
	//    1    3:putstatic       #56  <Field List zzcd>
	//    2    6:new             #58  <Class zzbe>
	//    3    9:dup             
	//    4   10:invokespecial   #61  <Method void zzbe()>
	//    5   13:putstatic       #63  <Field android.os.Parcelable$Creator CREATOR>
	//*   6   16:return          
	}
}
