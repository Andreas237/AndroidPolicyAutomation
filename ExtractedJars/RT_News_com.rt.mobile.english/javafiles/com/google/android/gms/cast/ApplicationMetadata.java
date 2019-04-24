// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.cast.zzcu;
import java.util.*;

// Referenced classes of package com.google.android.gms.cast:
//			zzd

public class ApplicationMetadata extends AbstractSafeParcelable
{

	private ApplicationMetadata()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void AbstractSafeParcelable()>
		zzz = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #52  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #53  <Method void ArrayList()>
	//    6   12:putfield        #55  <Field List zzz>
		zzaa = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #52  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #53  <Method void ArrayList()>
	//   11   23:putfield        #57  <Field List zzaa>
	//   12   26:return          
	}

	ApplicationMetadata(String s, String s1, List list, List list1, String s2, Uri uri)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void AbstractSafeParcelable()>
		zzy = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #62  <Field String zzy>
		name = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #64  <Field String name>
		zzz = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #55  <Field List zzz>
		zzaa = list1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #57  <Field List zzaa>
		zzab = s2;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #66  <Field String zzab>
		zzac = uri;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #68  <Field Uri zzac>
	//   20   37:return          
	}

	public boolean areNamespacesSupported(List list)
	{
		return zzaa != null && zzaa.containsAll(((java.util.Collection) (list)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List zzaa>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field List zzaa>
	//    5   11:aload_1         
	//    6   12:invokeinterface #80  <Method boolean List.containsAll(java.util.Collection)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
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
		if(!(obj instanceof ApplicationMetadata))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ApplicationMetadata>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ApplicationMetadata)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ApplicationMetadata>
	//   12   20:astore_1        
		return zzcu.zza(((Object) (zzy)), ((Object) (((ApplicationMetadata) (obj)).zzy))) && zzcu.zza(((Object) (zzz)), ((Object) (((ApplicationMetadata) (obj)).zzz))) && zzcu.zza(((Object) (name)), ((Object) (((ApplicationMetadata) (obj)).name))) && zzcu.zza(((Object) (zzaa)), ((Object) (((ApplicationMetadata) (obj)).zzaa))) && zzcu.zza(((Object) (zzab)), ((Object) (((ApplicationMetadata) (obj)).zzab))) && zzcu.zza(((Object) (zzac)), ((Object) (((ApplicationMetadata) (obj)).zzac)));
	//   13   21:aload_0         
	//   14   22:getfield        #62  <Field String zzy>
	//   15   25:aload_1         
	//   16   26:getfield        #62  <Field String zzy>
	//   17   29:invokestatic    #89  <Method boolean zzcu.zza(Object, Object)>
	//   18   32:ifeq            107
	//   19   35:aload_0         
	//   20   36:getfield        #55  <Field List zzz>
	//   21   39:aload_1         
	//   22   40:getfield        #55  <Field List zzz>
	//   23   43:invokestatic    #89  <Method boolean zzcu.zza(Object, Object)>
	//   24   46:ifeq            107
	//   25   49:aload_0         
	//   26   50:getfield        #64  <Field String name>
	//   27   53:aload_1         
	//   28   54:getfield        #64  <Field String name>
	//   29   57:invokestatic    #89  <Method boolean zzcu.zza(Object, Object)>
	//   30   60:ifeq            107
	//   31   63:aload_0         
	//   32   64:getfield        #57  <Field List zzaa>
	//   33   67:aload_1         
	//   34   68:getfield        #57  <Field List zzaa>
	//   35   71:invokestatic    #89  <Method boolean zzcu.zza(Object, Object)>
	//   36   74:ifeq            107
	//   37   77:aload_0         
	//   38   78:getfield        #66  <Field String zzab>
	//   39   81:aload_1         
	//   40   82:getfield        #66  <Field String zzab>
	//   41   85:invokestatic    #89  <Method boolean zzcu.zza(Object, Object)>
	//   42   88:ifeq            107
	//   43   91:aload_0         
	//   44   92:getfield        #68  <Field Uri zzac>
	//   45   95:aload_1         
	//   46   96:getfield        #68  <Field Uri zzac>
	//   47   99:invokestatic    #89  <Method boolean zzcu.zza(Object, Object)>
	//   48  102:ifeq            107
	//   49  105:iconst_1        
	//   50  106:ireturn         
	//   51  107:iconst_0        
	//   52  108:ireturn         
	}

	public String getApplicationId()
	{
		return zzy;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String zzy>
	//    2    4:areturn         
	}

	public List getImages()
	{
		return zzz;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List zzz>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String name>
	//    2    4:areturn         
	}

	public String getSenderAppIdentifier()
	{
		return zzab;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String zzab>
	//    2    4:areturn         
	}

	public List getSupportedNamespaces()
	{
		return Collections.unmodifiableList(zzaa);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List zzaa>
	//    2    4:invokestatic    #98  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzy, name, zzz, zzaa, zzab, zzac
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #62  <Field String zzy>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #64  <Field String name>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #55  <Field List zzz>
	//   16   25:aastore         
	//   17   26:dup             
	//   18   27:iconst_3        
	//   19   28:aload_0         
	//   20   29:getfield        #57  <Field List zzaa>
	//   21   32:aastore         
	//   22   33:dup             
	//   23   34:iconst_4        
	//   24   35:aload_0         
	//   25   36:getfield        #66  <Field String zzab>
	//   26   39:aastore         
	//   27   40:dup             
	//   28   41:iconst_5        
	//   29   42:aload_0         
	//   30   43:getfield        #68  <Field Uri zzac>
	//   31   46:aastore         
	//   32   47:invokestatic    #108 <Method int Objects.hashCode(Object[])>
	//   33   50:ireturn         
	}

	public boolean isNamespaceSupported(String s)
	{
		return zzaa != null && zzaa.contains(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List zzaa>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field List zzaa>
	//    5   11:aload_1         
	//    6   12:invokeinterface #113 <Method boolean List.contains(Object)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("applicationId: ");
	//    0    0:new             #116 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #118 <String "applicationId: ">
	//    3    6:invokespecial   #121 <Method void StringBuilder(String)>
	//    4    9:astore_3        
		stringbuilder.append(zzy);
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:getfield        #62  <Field String zzy>
	//    8   15:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(", name: ");
	//   10   19:aload_3         
	//   11   20:ldc1            #127 <String ", name: ">
	//   12   22:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(name);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #64  <Field String name>
	//   17   31:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(", images.count: ");
	//   19   35:aload_3         
	//   20   36:ldc1            #129 <String ", images.count: ">
	//   21   38:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		List list = zzz;
	//   23   42:aload_0         
	//   24   43:getfield        #55  <Field List zzz>
	//   25   46:astore          4
		boolean flag = false;
	//   26   48:iconst_0        
	//   27   49:istore_2        
		int i;
		if(list == null)
	//*  28   50:aload           4
	//*  29   52:ifnonnull       60
			i = 0;
	//   30   55:iconst_0        
	//   31   56:istore_1        
		else
	//*  32   57:goto            70
			i = zzz.size();
	//   33   60:aload_0         
	//   34   61:getfield        #55  <Field List zzz>
	//   35   64:invokeinterface #132 <Method int List.size()>
	//   36   69:istore_1        
		stringbuilder.append(i);
	//   37   70:aload_3         
	//   38   71:iload_1         
	//   39   72:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   40   75:pop             
		stringbuilder.append(", namespaces.count: ");
	//   41   76:aload_3         
	//   42   77:ldc1            #137 <String ", namespaces.count: ">
	//   43   79:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
		if(zzaa == null)
	//*  45   83:aload_0         
	//*  46   84:getfield        #57  <Field List zzaa>
	//*  47   87:ifnonnull       95
			i = ((int) (flag));
	//   48   90:iload_2         
	//   49   91:istore_1        
		else
	//*  50   92:goto            105
			i = zzaa.size();
	//   51   95:aload_0         
	//   52   96:getfield        #57  <Field List zzaa>
	//   53   99:invokeinterface #132 <Method int List.size()>
	//   54  104:istore_1        
		stringbuilder.append(i);
	//   55  105:aload_3         
	//   56  106:iload_1         
	//   57  107:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   58  110:pop             
		stringbuilder.append(", senderAppIdentifier: ");
	//   59  111:aload_3         
	//   60  112:ldc1            #139 <String ", senderAppIdentifier: ">
	//   61  114:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   62  117:pop             
		stringbuilder.append(zzab);
	//   63  118:aload_3         
	//   64  119:aload_0         
	//   65  120:getfield        #66  <Field String zzab>
	//   66  123:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   67  126:pop             
		stringbuilder.append(", senderAppLaunchUrl: ");
	//   68  127:aload_3         
	//   69  128:ldc1            #141 <String ", senderAppLaunchUrl: ">
	//   70  130:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   71  133:pop             
		stringbuilder.append(((Object) (zzac)));
	//   72  134:aload_3         
	//   73  135:aload_0         
	//   74  136:getfield        #68  <Field Uri zzac>
	//   75  139:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   76  142:pop             
		return stringbuilder.toString();
	//   77  143:aload_3         
	//   78  144:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   79  147:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeString(parcel, 2, getApplicationId(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #156 <Method String getApplicationId()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #160 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getName(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #162 <Method String getName()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #160 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 4, getImages(), false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #164 <Method List getImages()>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #168 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeStringList(parcel, 5, getSupportedNamespaces(), false);
	//   21   35:aload_1         
	//   22   36:iconst_5        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #170 <Method List getSupportedNamespaces()>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #173 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getSenderAppIdentifier(), false);
	//   27   45:aload_1         
	//   28   46:bipush          6
	//   29   48:aload_0         
	//   30   49:invokevirtual   #175 <Method String getSenderAppIdentifier()>
	//   31   52:iconst_0        
	//   32   53:invokestatic    #160 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 7, ((android.os.Parcelable) (zzac)), i, false);
	//   33   56:aload_1         
	//   34   57:bipush          7
	//   35   59:aload_0         
	//   36   60:getfield        #68  <Field Uri zzac>
	//   37   63:iload_2         
	//   38   64:iconst_0        
	//   39   65:invokestatic    #179 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   40   68:aload_1         
	//   41   69:iload_3         
	//   42   70:invokestatic    #182 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   43   73:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	private String name;
	private List zzaa;
	private String zzab;
	private Uri zzac;
	private String zzy;
	private List zzz;

	static 
	{
	//    0    0:new             #43  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void zzd()>
	//    3    7:putstatic       #48  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
