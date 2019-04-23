// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places:
//			zza

public class PlaceReport extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	PlaceReport(int i, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #45  <Field int versionCode>
		zza = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #47  <Field String zza>
		tag = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #49  <Field String tag>
		zzb = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #51  <Field String zzb>
	//   14   25:return          
	}

	public static PlaceReport create(String s, String s1)
	{
		int i;
		boolean flag;
label0:
		{
			Preconditions.checkNotNull(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #62  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
			Preconditions.checkNotEmpty(s1);
	//    3    5:aload_1         
	//    4    6:invokestatic    #66  <Method String Preconditions.checkNotEmpty(String)>
	//    5    9:pop             
			Preconditions.checkNotEmpty("unknown");
	//    6   10:ldc1            #68  <String "unknown">
	//    7   12:invokestatic    #66  <Method String Preconditions.checkNotEmpty(String)>
	//    8   15:pop             
			i = "unknown".hashCode();
	//    9   16:ldc1            #68  <String "unknown">
	//   10   18:invokevirtual   #74  <Method int String.hashCode()>
	//   11   21:istore_2        
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_3        
			switch(i)
	//*  14   24:iload_2         
			{
			default:
				break;

	//*  15   25:lookupswitch    6: default 84
	//	               -1436706272: 162
	//	               -1194968642: 147
	//	               -284840886: 132
	//	               -262743844: 117
	//	               1164924125: 102
	//	               1287171955: 87
	//*  16   84:goto            177
			case 1287171955: 
				if("unknown".equals("inferredRadioSignals"))
	//*  17   87:ldc1            #68  <String "unknown">
	//*  18   89:ldc1            #76  <String "inferredRadioSignals">
	//*  19   91:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  20   94:ifeq            177
				{
					i = 3;
	//   21   97:iconst_3        
	//   22   98:istore_2        
					break label0;
	//   23   99:goto            179
				}
				break;

			case 1164924125: 
				if(!"unknown".equals("inferredSnappedToRoad"))
					break;
	//   24  102:ldc1            #68  <String "unknown">
	//   25  104:ldc1            #82  <String "inferredSnappedToRoad">
	//   26  106:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   27  109:ifeq            177
				i = 5;
	//   28  112:iconst_5        
	//   29  113:istore_2        
				break label0;
	//   30  114:goto            179

			case -262743844: 
				if(!"unknown".equals("inferredReverseGeocoding"))
					break;
	//   31  117:ldc1            #68  <String "unknown">
	//   32  119:ldc1            #84  <String "inferredReverseGeocoding">
	//   33  121:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   34  124:ifeq            177
				i = 4;
	//   35  127:iconst_4        
	//   36  128:istore_2        
				break label0;
	//   37  129:goto            179

			case -284840886: 
				if(!"unknown".equals("unknown"))
					break;
	//   38  132:ldc1            #68  <String "unknown">
	//   39  134:ldc1            #68  <String "unknown">
	//   40  136:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   41  139:ifeq            177
				i = 0;
	//   42  142:iconst_0        
	//   43  143:istore_2        
				break label0;
	//   44  144:goto            179

			case -1194968642: 
				if(!"unknown".equals("userReported"))
					break;
	//   45  147:ldc1            #68  <String "unknown">
	//   46  149:ldc1            #86  <String "userReported">
	//   47  151:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   48  154:ifeq            177
				i = 1;
	//   49  157:iconst_1        
	//   50  158:istore_2        
				break label0;
	//   51  159:goto            179

			case -1436706272: 
				if(!"unknown".equals("inferredGeofencing"))
					break;
	//   52  162:ldc1            #68  <String "unknown">
	//   53  164:ldc1            #88  <String "inferredGeofencing">
	//   54  166:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   55  169:ifeq            177
				i = 2;
	//   56  172:iconst_2        
	//   57  173:istore_2        
				break label0;
	//   58  174:goto            179
			}
			i = -1;
	//   59  177:iconst_m1       
	//   60  178:istore_2        
		}
		switch(i)
	//*  61  179:iload_2         
		{
	//*  62  180:tableswitch     0 5: default 220
	//	               0 223
	//	               1 223
	//	               2 223
	//	               3 223
	//	               4 223
	//	               5 223
	//*  63  220:goto            225
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			flag = true;
	//   64  223:iconst_1        
	//   65  224:istore_3        
			break;
		}
		Preconditions.checkArgument(flag, "Invalid source");
	//   66  225:iload_3         
	//   67  226:ldc1            #90  <String "Invalid source">
	//   68  228:invokestatic    #94  <Method void Preconditions.checkArgument(boolean, Object)>
		return new PlaceReport(1, s, s1, "unknown");
	//   69  231:new             #2   <Class PlaceReport>
	//   70  234:dup             
	//   71  235:iconst_1        
	//   72  236:aload_0         
	//   73  237:aload_1         
	//   74  238:ldc1            #68  <String "unknown">
	//   75  240:invokespecial   #96  <Method void PlaceReport(int, String, String, String)>
	//   76  243:areturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof PlaceReport))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class PlaceReport>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((PlaceReport)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class PlaceReport>
	//    7   13:astore_1        
		return Objects.equal(((Object) (zza)), ((Object) (((PlaceReport) (obj)).zza))) && Objects.equal(((Object) (tag)), ((Object) (((PlaceReport) (obj)).tag))) && Objects.equal(((Object) (zzb)), ((Object) (((PlaceReport) (obj)).zzb)));
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field String zza>
	//   10   18:aload_1         
	//   11   19:getfield        #47  <Field String zza>
	//   12   22:invokestatic    #102 <Method boolean Objects.equal(Object, Object)>
	//   13   25:ifeq            58
	//   14   28:aload_0         
	//   15   29:getfield        #49  <Field String tag>
	//   16   32:aload_1         
	//   17   33:getfield        #49  <Field String tag>
	//   18   36:invokestatic    #102 <Method boolean Objects.equal(Object, Object)>
	//   19   39:ifeq            58
	//   20   42:aload_0         
	//   21   43:getfield        #51  <Field String zzb>
	//   22   46:aload_1         
	//   23   47:getfield        #51  <Field String zzb>
	//   24   50:invokestatic    #102 <Method boolean Objects.equal(Object, Object)>
	//   25   53:ifeq            58
	//   26   56:iconst_1        
	//   27   57:ireturn         
	//   28   58:iconst_0        
	//   29   59:ireturn         
	}

	public String getPlaceId()
	{
		return zza;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String zza>
	//    2    4:areturn         
	}

	public String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String tag>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zza, tag, zzb
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field String zza>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #49  <Field String tag>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #51  <Field String zzb>
	//   16   24:aastore         
	//   17   25:invokestatic    #108 <Method int Objects.hashCode(Object[])>
	//   18   28:ireturn         
	}

	public String toString()
	{
		com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #113 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:astore_1        
		tostringhelper.add("placeId", ((Object) (zza)));
	//    3    5:aload_1         
	//    4    6:ldc1            #115 <String "placeId">
	//    5    8:aload_0         
	//    6    9:getfield        #47  <Field String zza>
	//    7   12:invokevirtual   #121 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    8   15:pop             
		tostringhelper.add("tag", ((Object) (tag)));
	//    9   16:aload_1         
	//   10   17:ldc1            #122 <String "tag">
	//   11   19:aload_0         
	//   12   20:getfield        #49  <Field String tag>
	//   13   23:invokevirtual   #121 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   14   26:pop             
		if(!"unknown".equals(((Object) (zzb))))
	//*  15   27:ldc1            #68  <String "unknown">
	//*  16   29:aload_0         
	//*  17   30:getfield        #51  <Field String zzb>
	//*  18   33:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  19   36:ifne            50
			tostringhelper.add("source", ((Object) (zzb)));
	//   20   39:aload_1         
	//   21   40:ldc1            #124 <String "source">
	//   22   42:aload_0         
	//   23   43:getfield        #51  <Field String zzb>
	//   24   46:invokevirtual   #121 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   25   49:pop             
		return tostringhelper.toString();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #126 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   28   54:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #134 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field int versionCode>
	//    7   11:invokestatic    #138 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, getPlaceId(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #140 <Method String getPlaceId()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #144 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getTag(), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #146 <Method String getTag()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #144 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 4, zzb, false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #51  <Field String zzb>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #144 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   26   44:aload_1         
	//   27   45:iload_2         
	//   28   46:invokestatic    #149 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   29   49:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	private final String tag;
	private final int versionCode;
	private final String zza;
	private final String zzb;

	static 
	{
	//    0    0:new             #33  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void zza()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
