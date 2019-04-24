// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.location.places:
//			zzl

public class PlaceReport extends zza
	implements ReflectedParcelable
{

	PlaceReport(int i, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int zzaiI>
		zzblE = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field String zzblE>
		mTag = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field String mTag>
		zzacO = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field String zzacO>
	//   14   25:return          
	}

	public static PlaceReport create(String s, String s1)
	{
		return zzj(s, s1, "unknown");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #39  <String "unknown">
	//    3    4:invokestatic    #43  <Method PlaceReport zzj(String, String, String)>
	//    4    7:areturn         
	}

	private static boolean zzeU(String s)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_1        
		switch(s.hashCode())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #51  <Method int String.hashCode()>
		{
	//*   4    6:lookupswitch    6: default 64
	//	               -1436706272: 95
	//	               -1194968642: 81
	//	               -284840886: 67
	//	               -262743844: 123
	//	               1164924125: 137
	//	               1287171955: 109
	//*   5   64:goto            148
		case -284840886: 
			if(s.equals("unknown"))
	//*   6   67:aload_0         
	//*   7   68:ldc1            #39  <String "unknown">
	//*   8   70:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*   9   73:ifeq            148
				byte0 = 0;
	//   10   76:iconst_0        
	//   11   77:istore_1        
			break;

	//*  12   78:goto            148
		case -1194968642: 
			if(s.equals("userReported"))
	//*  13   81:aload_0         
	//*  14   82:ldc1            #57  <String "userReported">
	//*  15   84:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  16   87:ifeq            148
				byte0 = 1;
	//   17   90:iconst_1        
	//   18   91:istore_1        
			break;

	//*  19   92:goto            148
		case -1436706272: 
			if(s.equals("inferredGeofencing"))
	//*  20   95:aload_0         
	//*  21   96:ldc1            #59  <String "inferredGeofencing">
	//*  22   98:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  23  101:ifeq            148
				byte0 = 2;
	//   24  104:iconst_2        
	//   25  105:istore_1        
			break;

	//*  26  106:goto            148
		case 1287171955: 
			if(s.equals("inferredRadioSignals"))
	//*  27  109:aload_0         
	//*  28  110:ldc1            #61  <String "inferredRadioSignals">
	//*  29  112:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  30  115:ifeq            148
				byte0 = 3;
	//   31  118:iconst_3        
	//   32  119:istore_1        
			break;

	//*  33  120:goto            148
		case -262743844: 
			if(s.equals("inferredReverseGeocoding"))
	//*  34  123:aload_0         
	//*  35  124:ldc1            #63  <String "inferredReverseGeocoding">
	//*  36  126:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  37  129:ifeq            148
				byte0 = 4;
	//   38  132:iconst_4        
	//   39  133:istore_1        
			break;

	//*  40  134:goto            148
		case 1164924125: 
			if(s.equals("inferredSnappedToRoad"))
	//*  41  137:aload_0         
	//*  42  138:ldc1            #65  <String "inferredSnappedToRoad">
	//*  43  140:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  44  143:ifeq            148
				byte0 = 5;
	//   45  146:iconst_5        
	//   46  147:istore_1        
			break;
		}
		switch(byte0)
	//*  47  148:iload_1         
		{
	//*  48  149:tableswitch     0 5: default 188
	//	               0 191
	//	               1 191
	//	               2 191
	//	               3 191
	//	               4 191
	//	               5 191
	//*  49  188:goto            193
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return true;
	//   50  191:iconst_1        
	//   51  192:ireturn         
		}
		return false;
	//   52  193:iconst_0        
	//   53  194:ireturn         
	}

	public static PlaceReport zzj(String s, String s1, String s2)
	{
		zzac.zzw(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #71  <Method Object zzac.zzw(Object)>
	//    2    4:pop             
		zzac.zzdr(s1);
	//    3    5:aload_1         
	//    4    6:invokestatic    #75  <Method String zzac.zzdr(String)>
	//    5    9:pop             
		zzac.zzdr(s2);
	//    6   10:aload_2         
	//    7   11:invokestatic    #75  <Method String zzac.zzdr(String)>
	//    8   14:pop             
		zzac.zzb(zzeU(s2), "Invalid source");
	//    9   15:aload_2         
	//   10   16:invokestatic    #77  <Method boolean zzeU(String)>
	//   11   19:ldc1            #79  <String "Invalid source">
	//   12   21:invokestatic    #83  <Method void zzac.zzb(boolean, Object)>
		return new PlaceReport(1, s, s1, s2);
	//   13   24:new             #2   <Class PlaceReport>
	//   14   27:dup             
	//   15   28:iconst_1        
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:aload_2         
	//   19   32:invokespecial   #85  <Method void PlaceReport(int, String, String, String)>
	//   20   35:areturn         
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
		return zzaa.equal(((Object) (zzblE)), ((Object) (((PlaceReport) (obj)).zzblE))) && zzaa.equal(((Object) (mTag)), ((Object) (((PlaceReport) (obj)).mTag))) && zzaa.equal(((Object) (zzacO)), ((Object) (((PlaceReport) (obj)).zzacO)));
	//    8   14:aload_0         
	//    9   15:getfield        #31  <Field String zzblE>
	//   10   18:aload_1         
	//   11   19:getfield        #31  <Field String zzblE>
	//   12   22:invokestatic    #91  <Method boolean zzaa.equal(Object, Object)>
	//   13   25:ifeq            58
	//   14   28:aload_0         
	//   15   29:getfield        #33  <Field String mTag>
	//   16   32:aload_1         
	//   17   33:getfield        #33  <Field String mTag>
	//   18   36:invokestatic    #91  <Method boolean zzaa.equal(Object, Object)>
	//   19   39:ifeq            58
	//   20   42:aload_0         
	//   21   43:getfield        #35  <Field String zzacO>
	//   22   46:aload_1         
	//   23   47:getfield        #35  <Field String zzacO>
	//   24   50:invokestatic    #91  <Method boolean zzaa.equal(Object, Object)>
	//   25   53:ifeq            58
	//   26   56:iconst_1        
	//   27   57:ireturn         
	//   28   58:iconst_0        
	//   29   59:ireturn         
	}

	public String getPlaceId()
	{
		return zzblE;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String zzblE>
	//    2    4:areturn         
	}

	public String getSource()
	{
		return zzacO;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzacO>
	//    2    4:areturn         
	}

	public String getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mTag>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzblE, mTag, zzacO
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field String zzblE>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #33  <Field String mTag>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #35  <Field String zzacO>
	//   16   24:aastore         
	//   17   25:invokestatic    #100 <Method int zzaa.hashCode(Object[])>
	//   18   28:ireturn         
	}

	public String toString()
	{
		com.google.android.gms.common.internal.zzaa.zza zza1 = zzaa.zzv(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #105 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:astore_1        
		zza1.zzg("placeId", ((Object) (zzblE)));
	//    3    5:aload_1         
	//    4    6:ldc1            #107 <String "placeId">
	//    5    8:aload_0         
	//    6    9:getfield        #31  <Field String zzblE>
	//    7   12:invokevirtual   #113 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    8   15:pop             
		zza1.zzg("tag", ((Object) (mTag)));
	//    9   16:aload_1         
	//   10   17:ldc1            #115 <String "tag">
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field String mTag>
	//   13   23:invokevirtual   #113 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   26:pop             
		if(!"unknown".equals(((Object) (zzacO))))
	//*  15   27:ldc1            #39  <String "unknown">
	//*  16   29:aload_0         
	//*  17   30:getfield        #35  <Field String zzacO>
	//*  18   33:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  19   36:ifne            50
			zza1.zzg("source", ((Object) (zzacO)));
	//   20   39:aload_1         
	//   21   40:ldc1            #117 <String "source">
	//   22   42:aload_0         
	//   23   43:getfield        #35  <Field String zzacO>
	//   24   46:invokevirtual   #113 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   25   49:pop             
		return zza1.toString();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #119 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   28   54:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.places.zzl.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #125 <Method void com.google.android.gms.location.places.zzl.zza(PlaceReport, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzl();
	private final String mTag;
	private final String zzacO;
	final int zzaiI;
	private final String zzblE;

	static 
	{
	//    0    0:new             #19  <Class zzl>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzl()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
