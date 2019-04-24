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
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int mVersionCode>
		zzblg = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field String zzblg>
		mTag = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field String mTag>
		zzabN = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field String zzabN>
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

	private static boolean zzeY(String s)
	{
		byte byte0;
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		byte0 = -1;
	//    2    2:iconst_m1       
	//    3    3:istore_1        
		s.hashCode();
	//    4    4:aload_0         
	//    5    5:invokevirtual   #51  <Method int String.hashCode()>
		JVM INSTR lookupswitch 6: default 68
	//	               -1436706272: 140
	//	               -1194968642: 126
	//	               -284840886: 112
	//	               -262743844: 168
	//	               1164924125: 182
	//	               1287171955: 154;
	//    6    8:lookupswitch    6: default 68
	//	               -1436706272: 140
	//	               -1194968642: 126
	//	               -284840886: 112
	//	               -262743844: 168
	//	               1164924125: 182
	//	               1287171955: 154
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		switch(byte0)
	//*   7   68:iload_1         
		{
	//*   8   69:tableswitch     0 5: default 108
	//	               0 110
	//	               1 110
	//	               2 110
	//	               3 110
	//	               4 110
	//	               5 110
		default:
			flag = false;
	//    9  108:iconst_0        
	//   10  109:istore_2        
			// fall through

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return flag;
	//   11  110:iload_2         
	//   12  111:ireturn         
		}
_L4:
		if(s.equals("unknown"))
	//*  13  112:aload_0         
	//*  14  113:ldc1            #39  <String "unknown">
	//*  15  115:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  16  118:ifeq            68
			byte0 = 0;
	//   17  121:iconst_0        
	//   18  122:istore_1        
		continue; /* Loop/switch isn't completed */
	//   19  123:goto            68
_L3:
		if(s.equals("userReported"))
	//*  20  126:aload_0         
	//*  21  127:ldc1            #57  <String "userReported">
	//*  22  129:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  23  132:ifeq            68
			byte0 = 1;
	//   24  135:iconst_1        
	//   25  136:istore_1        
		continue; /* Loop/switch isn't completed */
	//   26  137:goto            68
_L2:
		if(s.equals("inferredGeofencing"))
	//*  27  140:aload_0         
	//*  28  141:ldc1            #59  <String "inferredGeofencing">
	//*  29  143:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  30  146:ifeq            68
			byte0 = 2;
	//   31  149:iconst_2        
	//   32  150:istore_1        
		continue; /* Loop/switch isn't completed */
	//   33  151:goto            68
_L7:
		if(s.equals("inferredRadioSignals"))
	//*  34  154:aload_0         
	//*  35  155:ldc1            #61  <String "inferredRadioSignals">
	//*  36  157:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  37  160:ifeq            68
			byte0 = 3;
	//   38  163:iconst_3        
	//   39  164:istore_1        
		continue; /* Loop/switch isn't completed */
	//   40  165:goto            68
_L5:
		if(s.equals("inferredReverseGeocoding"))
	//*  41  168:aload_0         
	//*  42  169:ldc1            #63  <String "inferredReverseGeocoding">
	//*  43  171:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  44  174:ifeq            68
			byte0 = 4;
	//   45  177:iconst_4        
	//   46  178:istore_1        
		continue; /* Loop/switch isn't completed */
	//   47  179:goto            68
_L6:
		if(s.equals("inferredSnappedToRoad"))
	//*  48  182:aload_0         
	//*  49  183:ldc1            #65  <String "inferredSnappedToRoad">
	//*  50  185:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  51  188:ifeq            68
			byte0 = 5;
	//   52  191:iconst_5        
	//   53  192:istore_1        
		if(true) goto _L1; else goto _L8
	//   54  193:goto            68
_L8:
	}

	public static PlaceReport zzj(String s, String s1, String s2)
	{
		zzac.zzw(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #71  <Method Object zzac.zzw(Object)>
	//    2    4:pop             
		zzac.zzdv(s1);
	//    3    5:aload_1         
	//    4    6:invokestatic    #75  <Method String zzac.zzdv(String)>
	//    5    9:pop             
		zzac.zzdv(s2);
	//    6   10:aload_2         
	//    7   11:invokestatic    #75  <Method String zzac.zzdv(String)>
	//    8   14:pop             
		zzac.zzb(zzeY(s2), "Invalid source");
	//    9   15:aload_2         
	//   10   16:invokestatic    #77  <Method boolean zzeY(String)>
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
		if(obj instanceof PlaceReport)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class PlaceReport>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:checkcast       #2   <Class PlaceReport>
	//*   7   13:astore_1        
			if(zzaa.equal(((Object) (zzblg)), ((Object) (((PlaceReport) (obj = ((Object) ((PlaceReport)obj)))).zzblg))) && zzaa.equal(((Object) (mTag)), ((Object) (((PlaceReport) (obj)).mTag))) && zzaa.equal(((Object) (zzabN)), ((Object) (((PlaceReport) (obj)).zzabN))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #31  <Field String zzblg>
	//*  10   18:aload_1         
	//*  11   19:getfield        #31  <Field String zzblg>
	//*  12   22:invokestatic    #91  <Method boolean zzaa.equal(Object, Object)>
	//*  13   25:ifeq            7
	//*  14   28:aload_0         
	//*  15   29:getfield        #33  <Field String mTag>
	//*  16   32:aload_1         
	//*  17   33:getfield        #33  <Field String mTag>
	//*  18   36:invokestatic    #91  <Method boolean zzaa.equal(Object, Object)>
	//*  19   39:ifeq            7
	//*  20   42:aload_0         
	//*  21   43:getfield        #35  <Field String zzabN>
	//*  22   46:aload_1         
	//*  23   47:getfield        #35  <Field String zzabN>
	//*  24   50:invokestatic    #91  <Method boolean zzaa.equal(Object, Object)>
	//*  25   53:ifeq            7
				return true;
	//   26   56:iconst_1        
	//   27   57:ireturn         
		return false;
	}

	public String getPlaceId()
	{
		return zzblg;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String zzblg>
	//    2    4:areturn         
	}

	public String getSource()
	{
		return zzabN;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzabN>
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
			zzblg, mTag, zzabN
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field String zzblg>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #33  <Field String mTag>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #35  <Field String zzabN>
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
		zza1.zzg("placeId", ((Object) (zzblg)));
	//    3    5:aload_1         
	//    4    6:ldc1            #107 <String "placeId">
	//    5    8:aload_0         
	//    6    9:getfield        #31  <Field String zzblg>
	//    7   12:invokevirtual   #113 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    8   15:pop             
		zza1.zzg("tag", ((Object) (mTag)));
	//    9   16:aload_1         
	//   10   17:ldc1            #115 <String "tag">
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field String mTag>
	//   13   23:invokevirtual   #113 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   26:pop             
		if(!"unknown".equals(((Object) (zzabN))))
	//*  15   27:ldc1            #39  <String "unknown">
	//*  16   29:aload_0         
	//*  17   30:getfield        #35  <Field String zzabN>
	//*  18   33:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  19   36:ifne            50
			zza1.zzg("source", ((Object) (zzabN)));
	//   20   39:aload_1         
	//   21   40:ldc1            #117 <String "source">
	//   22   42:aload_0         
	//   23   43:getfield        #35  <Field String zzabN>
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
	final int mVersionCode;
	private final String zzabN;
	private final String zzblg;

	static 
	{
	//    0    0:new             #19  <Class zzl>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzl()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
