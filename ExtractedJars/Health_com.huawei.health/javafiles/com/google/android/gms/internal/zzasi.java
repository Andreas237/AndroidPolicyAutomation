// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//			zzasj

public class zzasi extends zza
{

	zzasi(LocationRequest locationrequest, List list, String s, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void zza()>
		zzbjl = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #42  <Field boolean zzbjl>
		zzaWw = locationrequest;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #44  <Field LocationRequest zzaWw>
		zzbjx = list;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #46  <Field List zzbjx>
		mTag = s;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #48  <Field String mTag>
		zzbkN = flag;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #50  <Field boolean zzbkN>
		zzbkO = flag1;
	//   17   30:aload_0         
	//   18   31:iload           5
	//   19   33:putfield        #52  <Field boolean zzbkO>
	//   20   36:return          
	}

	public static zzasi zza(String s, LocationRequest locationrequest)
	{
		return new zzasi(locationrequest, zzbkM, s, false, false);
	//    0    0:new             #2   <Class zzasi>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getstatic       #30  <Field List zzbkM>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:iconst_0        
	//    7   11:invokespecial   #59  <Method void zzasi(LocationRequest, List, String, boolean, boolean)>
	//    8   14:areturn         
	}

	public static zzasi zzb(LocationRequest locationrequest)
	{
		return zza(((String) (null)), locationrequest);
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:invokestatic    #64  <Method zzasi zza(String, LocationRequest)>
	//    3    5:areturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof zzasi))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzasi>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((zzasi)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class zzasi>
	//    7   13:astore_1        
		return zzaa.equal(((Object) (zzaWw)), ((Object) (((zzasi) (obj)).zzaWw))) && zzaa.equal(((Object) (zzbjx)), ((Object) (((zzasi) (obj)).zzbjx))) && zzaa.equal(((Object) (mTag)), ((Object) (((zzasi) (obj)).mTag))) && zzbkN == ((zzasi) (obj)).zzbkN && zzbkO == ((zzasi) (obj)).zzbkO;
	//    8   14:aload_0         
	//    9   15:getfield        #44  <Field LocationRequest zzaWw>
	//   10   18:aload_1         
	//   11   19:getfield        #44  <Field LocationRequest zzaWw>
	//   12   22:invokestatic    #73  <Method boolean zzaa.equal(Object, Object)>
	//   13   25:ifeq            80
	//   14   28:aload_0         
	//   15   29:getfield        #46  <Field List zzbjx>
	//   16   32:aload_1         
	//   17   33:getfield        #46  <Field List zzbjx>
	//   18   36:invokestatic    #73  <Method boolean zzaa.equal(Object, Object)>
	//   19   39:ifeq            80
	//   20   42:aload_0         
	//   21   43:getfield        #48  <Field String mTag>
	//   22   46:aload_1         
	//   23   47:getfield        #48  <Field String mTag>
	//   24   50:invokestatic    #73  <Method boolean zzaa.equal(Object, Object)>
	//   25   53:ifeq            80
	//   26   56:aload_0         
	//   27   57:getfield        #50  <Field boolean zzbkN>
	//   28   60:aload_1         
	//   29   61:getfield        #50  <Field boolean zzbkN>
	//   30   64:icmpne          80
	//   31   67:aload_0         
	//   32   68:getfield        #52  <Field boolean zzbkO>
	//   33   71:aload_1         
	//   34   72:getfield        #52  <Field boolean zzbkO>
	//   35   75:icmpne          80
	//   36   78:iconst_1        
	//   37   79:ireturn         
	//   38   80:iconst_0        
	//   39   81:ireturn         
	}

	public int hashCode()
	{
		return zzaWw.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field LocationRequest zzaWw>
	//    2    4:invokevirtual   #79  <Method int LocationRequest.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #83  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(zzaWw.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field LocationRequest zzaWw>
	//    7   13:invokevirtual   #86  <Method String LocationRequest.toString()>
	//    8   16:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		if(mTag != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #48  <Field String mTag>
	//*  12   24:ifnull          41
			stringbuilder.append(" tag=").append(mTag);
	//   13   27:aload_1         
	//   14   28:ldc1            #92  <String " tag=">
	//   15   30:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:aload_0         
	//   17   34:getfield        #48  <Field String mTag>
	//   18   37:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append(" hideAppOps=").append(zzbkN);
	//   20   41:aload_1         
	//   21   42:ldc1            #94  <String " hideAppOps=">
	//   22   44:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:aload_0         
	//   24   48:getfield        #50  <Field boolean zzbkN>
	//   25   51:invokevirtual   #97  <Method StringBuilder StringBuilder.append(boolean)>
	//   26   54:pop             
		stringbuilder.append(" clients=").append(((Object) (zzbjx)));
	//   27   55:aload_1         
	//   28   56:ldc1            #99  <String " clients=">
	//   29   58:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:aload_0         
	//   31   62:getfield        #46  <Field List zzbjx>
	//   32   65:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   33   68:pop             
		stringbuilder.append(" forceCoarseLocation=").append(zzbkO);
	//   34   69:aload_1         
	//   35   70:ldc1            #104 <String " forceCoarseLocation=">
	//   36   72:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:aload_0         
	//   38   76:getfield        #52  <Field boolean zzbkO>
	//   39   79:invokevirtual   #97  <Method StringBuilder StringBuilder.append(boolean)>
	//   40   82:pop             
		return stringbuilder.toString();
	//   41   83:aload_1         
	//   42   84:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   43   87:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzasj.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #110 <Method void com.google.android.gms.internal.zzasj.zza(zzasi, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzasj();
	static final List zzbkM = Collections.emptyList();
	String mTag;
	LocationRequest zzaWw;
	boolean zzbjl;
	List zzbjx;
	boolean zzbkN;
	boolean zzbkO;

	static 
	{
	//    0    0:invokestatic    #28  <Method List Collections.emptyList()>
	//    1    3:putstatic       #30  <Field List zzbkM>
	//    2    6:new             #32  <Class zzasj>
	//    3    9:dup             
	//    4   10:invokespecial   #35  <Method void zzasj()>
	//    5   13:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   6   16:return          
	}
}
