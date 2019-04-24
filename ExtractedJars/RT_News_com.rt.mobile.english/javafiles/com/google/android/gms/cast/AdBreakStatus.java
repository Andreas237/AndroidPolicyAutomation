// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.cast.zzcu;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			zzc

public class AdBreakStatus extends AbstractSafeParcelable
{

	AdBreakStatus(long l, long l1, String s, String s1, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void AbstractSafeParcelable()>
		zzu = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #52  <Field long zzu>
		zzv = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #54  <Field long zzv>
		zzw = s;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #56  <Field String zzw>
		zzx = s1;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #58  <Field String zzx>
		zzm = l2;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #60  <Field long zzm>
	//   17   32:return          
	}

	static AdBreakStatus zzc(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(!jsonobject.has("currentBreakTime"))
			break MISSING_BLOCK_LABEL_145;
	//    4    6:aload_0         
	//    5    7:ldc1            #68  <String "currentBreakTime">
	//    6    9:invokevirtual   #74  <Method boolean JSONObject.has(String)>
	//    7   12:ifeq            145
		if(!jsonobject.has("currentBreakClipTime"))
	//*   8   15:aload_0         
	//*   9   16:ldc1            #76  <String "currentBreakClipTime">
	//*  10   18:invokevirtual   #74  <Method boolean JSONObject.has(String)>
	//*  11   21:ifne            26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		long l1;
		long l2;
		long l3;
		String s;
		String s1;
		l2 = (long)((double)jsonobject.getLong("currentBreakTime") * 1000D);
	//   14   26:aload_0         
	//   15   27:ldc1            #68  <String "currentBreakTime">
	//   16   29:invokevirtual   #80  <Method long JSONObject.getLong(String)>
	//   17   32:l2d             
	//   18   33:ldc2w           #81  <Double 1000D>
	//   19   36:dmul            
	//   20   37:d2l             
	//   21   38:lstore          5
		l3 = (long)((double)jsonobject.getLong("currentBreakClipTime") * 1000D);
	//   22   40:aload_0         
	//   23   41:ldc1            #76  <String "currentBreakClipTime">
	//   24   43:invokevirtual   #80  <Method long JSONObject.getLong(String)>
	//   25   46:l2d             
	//   26   47:ldc2w           #81  <Double 1000D>
	//   27   50:dmul            
	//   28   51:d2l             
	//   29   52:lstore          7
		s = jsonobject.optString("breakId", ((String) (null)));
	//   30   54:aload_0         
	//   31   55:ldc1            #84  <String "breakId">
	//   32   57:aconst_null     
	//   33   58:invokevirtual   #88  <Method String JSONObject.optString(String, String)>
	//   34   61:astore          9
		s1 = jsonobject.optString("breakClipId", ((String) (null)));
	//   35   63:aload_0         
	//   36   64:ldc1            #90  <String "breakClipId">
	//   37   66:aconst_null     
	//   38   67:invokevirtual   #88  <Method String JSONObject.optString(String, String)>
	//   39   70:astore          10
		l1 = jsonobject.optLong("whenSkippable", -1L);
	//   40   72:aload_0         
	//   41   73:ldc1            #92  <String "whenSkippable">
	//   42   75:ldc2w           #93  <Long -1L>
	//   43   78:invokevirtual   #98  <Method long JSONObject.optLong(String, long)>
	//   44   81:lstore_3        
		long l;
		l = l1;
	//   45   82:lload_3         
	//   46   83:lstore_1        
		if(l1 != -1L)
	//*  47   84:lload_3         
	//*  48   85:ldc2w           #93  <Long -1L>
	//*  49   88:lcmp            
	//*  50   89:ifeq            100
			l = (long)((double)l1 * 1000D);
	//   51   92:lload_3         
	//   52   93:l2d             
	//   53   94:ldc2w           #81  <Double 1000D>
	//   54   97:dmul            
	//   55   98:d2l             
	//   56   99:lstore_1        
		jsonobject = ((JSONObject) (new AdBreakStatus(l2, l3, s, s1, l)));
	//   57  100:new             #2   <Class AdBreakStatus>
	//   58  103:dup             
	//   59  104:lload           5
	//   60  106:lload           7
	//   61  108:aload           9
	//   62  110:aload           10
	//   63  112:lload_1         
	//   64  113:invokespecial   #100 <Method void AdBreakStatus(long, long, String, String, long)>
	//   65  116:astore_0        
		return ((AdBreakStatus) (jsonobject));
	//   66  117:aload_0         
	//   67  118:areturn         
		jsonobject;
	//   68  119:astore_0        
		Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[] {
			((JSONException) (jsonobject)).getMessage()
		}));
	//   69  120:ldc1            #102 <String "AdBreakInfo">
	//   70  122:getstatic       #108 <Field Locale Locale.ROOT>
	//   71  125:ldc1            #110 <String "Error while creating an AdBreakClipInfo from JSON: %s">
	//   72  127:iconst_1        
	//   73  128:anewarray       Object[]
	//   74  131:dup             
	//   75  132:iconst_0        
	//   76  133:aload_0         
	//   77  134:invokevirtual   #116 <Method String JSONException.getMessage()>
	//   78  137:aastore         
	//   79  138:invokestatic    #122 <Method String String.format(Locale, String, Object[])>
	//   80  141:invokestatic    #128 <Method int Log.d(String, String)>
	//   81  144:pop             
		return null;
	//   82  145:aconst_null     
	//   83  146:areturn         
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
		if(!(obj instanceof AdBreakStatus))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AdBreakStatus>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((AdBreakStatus)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class AdBreakStatus>
	//   12   20:astore_1        
		return zzu == ((AdBreakStatus) (obj)).zzu && zzv == ((AdBreakStatus) (obj)).zzv && zzcu.zza(((Object) (zzw)), ((Object) (((AdBreakStatus) (obj)).zzw))) && zzcu.zza(((Object) (zzx)), ((Object) (((AdBreakStatus) (obj)).zzx))) && zzm == ((AdBreakStatus) (obj)).zzm;
	//   13   21:aload_0         
	//   14   22:getfield        #52  <Field long zzu>
	//   15   25:aload_1         
	//   16   26:getfield        #52  <Field long zzu>
	//   17   29:lcmp            
	//   18   30:ifne            87
	//   19   33:aload_0         
	//   20   34:getfield        #54  <Field long zzv>
	//   21   37:aload_1         
	//   22   38:getfield        #54  <Field long zzv>
	//   23   41:lcmp            
	//   24   42:ifne            87
	//   25   45:aload_0         
	//   26   46:getfield        #56  <Field String zzw>
	//   27   49:aload_1         
	//   28   50:getfield        #56  <Field String zzw>
	//   29   53:invokestatic    #136 <Method boolean zzcu.zza(Object, Object)>
	//   30   56:ifeq            87
	//   31   59:aload_0         
	//   32   60:getfield        #58  <Field String zzx>
	//   33   63:aload_1         
	//   34   64:getfield        #58  <Field String zzx>
	//   35   67:invokestatic    #136 <Method boolean zzcu.zza(Object, Object)>
	//   36   70:ifeq            87
	//   37   73:aload_0         
	//   38   74:getfield        #60  <Field long zzm>
	//   39   77:aload_1         
	//   40   78:getfield        #60  <Field long zzm>
	//   41   81:lcmp            
	//   42   82:ifne            87
	//   43   85:iconst_1        
	//   44   86:ireturn         
	//   45   87:iconst_0        
	//   46   88:ireturn         
	}

	public String getBreakClipId()
	{
		return zzx;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String zzx>
	//    2    4:areturn         
	}

	public String getBreakId()
	{
		return zzw;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String zzw>
	//    2    4:areturn         
	}

	public long getCurrentBreakClipTimeInMs()
	{
		return zzv;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field long zzv>
	//    2    4:lreturn         
	}

	public long getCurrentBreakTimeInMs()
	{
		return zzu;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long zzu>
	//    2    4:lreturn         
	}

	public long getWhenSkippableInMs()
	{
		return zzm;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field long zzm>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Long.valueOf(zzu), Long.valueOf(zzv), zzw, zzx, Long.valueOf(zzm)
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #52  <Field long zzu>
	//    6   10:invokestatic    #145 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #54  <Field long zzv>
	//   12   20:invokestatic    #145 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #56  <Field String zzw>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #58  <Field String zzx>
	//   23   37:aastore         
	//   24   38:dup             
	//   25   39:iconst_4        
	//   26   40:aload_0         
	//   27   41:getfield        #60  <Field long zzm>
	//   28   44:invokestatic    #145 <Method Long Long.valueOf(long)>
	//   29   47:aastore         
	//   30   48:invokestatic    #150 <Method int Objects.hashCode(Object[])>
	//   31   51:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #158 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeLong(parcel, 2, getCurrentBreakTimeInMs());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #160 <Method long getCurrentBreakTimeInMs()>
	//    7   11:invokestatic    #164 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeLong(parcel, 3, getCurrentBreakClipTimeInMs());
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #166 <Method long getCurrentBreakClipTimeInMs()>
	//   12   20:invokestatic    #164 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 4, getBreakId(), false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #168 <Method String getBreakId()>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #172 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getBreakClipId(), false);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #174 <Method String getBreakClipId()>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #172 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 6, getWhenSkippableInMs());
	//   25   43:aload_1         
	//   26   44:bipush          6
	//   27   46:aload_0         
	//   28   47:invokevirtual   #176 <Method long getWhenSkippableInMs()>
	//   29   50:invokestatic    #164 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   30   53:aload_1         
	//   31   54:iload_2         
	//   32   55:invokestatic    #179 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   33   58:return          
	}

	public static final int AD_BREAK_CLIP_NOT_SKIPPABLE = -1;
	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	private final long zzm;
	private final long zzu;
	private final long zzv;
	private final String zzw;
	private final String zzx;

	static 
	{
	//    0    0:new             #40  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void zzc()>
	//    3    7:putstatic       #45  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
