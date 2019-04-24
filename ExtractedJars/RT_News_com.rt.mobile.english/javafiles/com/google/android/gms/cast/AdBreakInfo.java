// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.cast.zzcu;
import java.util.Arrays;
import java.util.Locale;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			zzb

public class AdBreakInfo extends AbstractSafeParcelable
{
	public static class Builder
	{

		public AdBreakInfo build()
		{
			return new AdBreakInfo(zzq, zze, zzg, zzr, zzs, zzt);
		//    0    0:new             #6   <Class AdBreakInfo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field long zzq>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field String zze>
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field long zzg>
		//    8   16:aload_0         
		//    9   17:getfield        #30  <Field boolean zzr>
		//   10   20:aload_0         
		//   11   21:getfield        #34  <Field String[] zzs>
		//   12   24:aload_0         
		//   13   25:getfield        #32  <Field boolean zzt>
		//   14   28:invokespecial   #40  <Method void AdBreakInfo(long, String, long, boolean, String[], boolean)>
		//   15   31:areturn         
		}

		public Builder setBreakClipIds(String as[])
		{
			zzs = as;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field String[] zzs>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDurationInMs(long l)
		{
			zzg = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #28  <Field long zzg>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setId(String s)
		{
			zze = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field String zze>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setIsEmbedded(boolean flag)
		{
			zzt = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #32  <Field boolean zzt>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setIsWatched(boolean flag)
		{
			zzr = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #30  <Field boolean zzr>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String zze;
		private long zzg;
		private long zzq;
		private boolean zzr;
		private String zzs[];
		private boolean zzt;

		public Builder(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			zzq = 0L;
		//    2    4:aload_0         
		//    3    5:lconst_0        
		//    4    6:putfield        #24  <Field long zzq>
			zze = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #26  <Field String zze>
			zzg = 0L;
		//    8   14:aload_0         
		//    9   15:lconst_0        
		//   10   16:putfield        #28  <Field long zzg>
			zzr = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #30  <Field boolean zzr>
			zzt = false;
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:putfield        #32  <Field boolean zzt>
			zzs = null;
		//   17   29:aload_0         
		//   18   30:aconst_null     
		//   19   31:putfield        #34  <Field String[] zzs>
			zzq = l;
		//   20   34:aload_0         
		//   21   35:lload_1         
		//   22   36:putfield        #24  <Field long zzq>
		//   23   39:return          
		}
	}


	public AdBreakInfo(long l, String s, long l1, boolean flag, String as[], 
			boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void AbstractSafeParcelable()>
		zzq = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #57  <Field long zzq>
		zze = s;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #59  <Field String zze>
		zzg = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #61  <Field long zzg>
		zzr = flag;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #63  <Field boolean zzr>
		zzs = as;
	//   14   26:aload_0         
	//   15   27:aload           7
	//   16   29:putfield        #65  <Field String[] zzs>
		zzt = flag1;
	//   17   32:aload_0         
	//   18   33:iload           8
	//   19   35:putfield        #67  <Field boolean zzt>
	//   20   38:return          
	}

	static AdBreakInfo zzb(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(!jsonobject.has("id")) goto _L2; else goto _L1
	//    4    6:aload_0         
	//    5    7:ldc1            #74  <String "id">
	//    6    9:invokevirtual   #80  <Method boolean JSONObject.has(String)>
	//    7   12:ifeq            171
_L1:
		if(!jsonobject.has("position"))
	//*   8   15:aload_0         
	//*   9   16:ldc1            #82  <String "position">
	//*  10   18:invokevirtual   #80  <Method boolean JSONObject.has(String)>
	//*  11   21:ifne            26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		long l;
		long l1;
		boolean flag;
		String s;
		JSONArray jsonarray;
		s = jsonobject.getString("id");
	//   14   26:aload_0         
	//   15   27:ldc1            #74  <String "id">
	//   16   29:invokevirtual   #86  <Method String JSONObject.getString(String)>
	//   17   32:astore          8
		l = (long)((double)jsonobject.getLong("position") * 1000D);
	//   18   34:aload_0         
	//   19   35:ldc1            #82  <String "position">
	//   20   37:invokevirtual   #90  <Method long JSONObject.getLong(String)>
	//   21   40:l2d             
	//   22   41:ldc2w           #91  <Double 1000D>
	//   23   44:dmul            
	//   24   45:d2l             
	//   25   46:lstore_2        
		flag = jsonobject.optBoolean("isWatched");
	//   26   47:aload_0         
	//   27   48:ldc1            #93  <String "isWatched">
	//   28   50:invokevirtual   #96  <Method boolean JSONObject.optBoolean(String)>
	//   29   53:istore          6
		l1 = (long)((double)jsonobject.optLong("duration") * 1000D);
	//   30   55:aload_0         
	//   31   56:ldc1            #98  <String "duration">
	//   32   58:invokevirtual   #101 <Method long JSONObject.optLong(String)>
	//   33   61:l2d             
	//   34   62:ldc2w           #91  <Double 1000D>
	//   35   65:dmul            
	//   36   66:d2l             
	//   37   67:lstore          4
		jsonarray = jsonobject.optJSONArray("breakClipIds");
	//   38   69:aload_0         
	//   39   70:ldc1            #103 <String "breakClipIds">
	//   40   72:invokevirtual   #107 <Method JSONArray JSONObject.optJSONArray(String)>
	//   41   75:astore          9
		if(jsonarray == null) goto _L4; else goto _L3
	//   42   77:aload           9
	//   43   79:ifnull          176
_L3:
		String as[] = new String[jsonarray.length()];
	//   44   82:aload           9
	//   45   84:invokevirtual   #113 <Method int JSONArray.length()>
	//   46   87:anewarray       String[]
	//   47   90:astore          7
		int i = 0;
	//   48   92:iconst_0        
	//   49   93:istore_1        
_L6:
		if(i >= jsonarray.length())
			break; /* Loop/switch isn't completed */
	//   50   94:iload_1         
	//   51   95:aload           9
	//   52   97:invokevirtual   #113 <Method int JSONArray.length()>
	//   53  100:icmpge          173
		as[i] = jsonarray.getString(i);
	//   54  103:aload           7
	//   55  105:iload_1         
	//   56  106:aload           9
	//   57  108:iload_1         
	//   58  109:invokevirtual   #118 <Method String JSONArray.getString(int)>
	//   59  112:aastore         
		i++;
	//   60  113:iload_1         
	//   61  114:iconst_1        
	//   62  115:iadd            
	//   63  116:istore_1        
		if(true) goto _L6; else goto _L5
	//   64  117:goto            94
_L5:
		jsonobject = ((JSONObject) (new AdBreakInfo(l, s, l1, flag, as, jsonobject.optBoolean("isEmbedded"))));
	//   65  120:new             #2   <Class AdBreakInfo>
	//   66  123:dup             
	//   67  124:lload_2         
	//   68  125:aload           8
	//   69  127:lload           4
	//   70  129:iload           6
	//   71  131:aload           7
	//   72  133:aload_0         
	//   73  134:ldc1            #119 <String "isEmbedded">
	//   74  136:invokevirtual   #96  <Method boolean JSONObject.optBoolean(String)>
	//   75  139:invokespecial   #121 <Method void AdBreakInfo(long, String, long, boolean, String[], boolean)>
	//   76  142:astore_0        
		return ((AdBreakInfo) (jsonobject));
	//   77  143:aload_0         
	//   78  144:areturn         
		jsonobject;
	//   79  145:astore_0        
		Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", new Object[] {
			((JSONException) (jsonobject)).getMessage()
		}));
	//   80  146:ldc1            #123 <String "AdBreakInfo">
	//   81  148:getstatic       #129 <Field Locale Locale.ROOT>
	//   82  151:ldc1            #131 <String "Error while creating an AdBreakInfo from JSON: %s">
	//   83  153:iconst_1        
	//   84  154:anewarray       Object[]
	//   85  157:dup             
	//   86  158:iconst_0        
	//   87  159:aload_0         
	//   88  160:invokevirtual   #137 <Method String JSONException.getMessage()>
	//   89  163:aastore         
	//   90  164:invokestatic    #141 <Method String String.format(Locale, String, Object[])>
	//   91  167:invokestatic    #147 <Method int Log.d(String, String)>
	//   92  170:pop             
_L2:
		return null;
	//   93  171:aconst_null     
	//   94  172:areturn         
	//*  95  173:goto            120
_L4:
		as = null;
	//   96  176:aconst_null     
	//   97  177:astore          7
		if(true) goto _L5; else goto _L7
	//   98  179:goto            120
_L7:
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
		if(!(obj instanceof AdBreakInfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AdBreakInfo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((AdBreakInfo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class AdBreakInfo>
	//   12   20:astore_1        
		return zzcu.zza(((Object) (zze)), ((Object) (((AdBreakInfo) (obj)).zze))) && zzq == ((AdBreakInfo) (obj)).zzq && zzg == ((AdBreakInfo) (obj)).zzg && zzr == ((AdBreakInfo) (obj)).zzr && Arrays.equals(((Object []) (zzs)), ((Object []) (((AdBreakInfo) (obj)).zzs))) && zzt == ((AdBreakInfo) (obj)).zzt;
	//   13   21:aload_0         
	//   14   22:getfield        #59  <Field String zze>
	//   15   25:aload_1         
	//   16   26:getfield        #59  <Field String zze>
	//   17   29:invokestatic    #155 <Method boolean zzcu.zza(Object, Object)>
	//   18   32:ifeq            97
	//   19   35:aload_0         
	//   20   36:getfield        #57  <Field long zzq>
	//   21   39:aload_1         
	//   22   40:getfield        #57  <Field long zzq>
	//   23   43:lcmp            
	//   24   44:ifne            97
	//   25   47:aload_0         
	//   26   48:getfield        #61  <Field long zzg>
	//   27   51:aload_1         
	//   28   52:getfield        #61  <Field long zzg>
	//   29   55:lcmp            
	//   30   56:ifne            97
	//   31   59:aload_0         
	//   32   60:getfield        #63  <Field boolean zzr>
	//   33   63:aload_1         
	//   34   64:getfield        #63  <Field boolean zzr>
	//   35   67:icmpne          97
	//   36   70:aload_0         
	//   37   71:getfield        #65  <Field String[] zzs>
	//   38   74:aload_1         
	//   39   75:getfield        #65  <Field String[] zzs>
	//   40   78:invokestatic    #160 <Method boolean Arrays.equals(Object[], Object[])>
	//   41   81:ifeq            97
	//   42   84:aload_0         
	//   43   85:getfield        #67  <Field boolean zzt>
	//   44   88:aload_1         
	//   45   89:getfield        #67  <Field boolean zzt>
	//   46   92:icmpne          97
	//   47   95:iconst_1        
	//   48   96:ireturn         
	//   49   97:iconst_0        
	//   50   98:ireturn         
	}

	public String[] getBreakClipIds()
	{
		return zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String[] zzs>
	//    2    4:areturn         
	}

	public long getDurationInMs()
	{
		return zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field long zzg>
	//    2    4:lreturn         
	}

	public String getId()
	{
		return zze;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String zze>
	//    2    4:areturn         
	}

	public long getPlaybackPositionInMs()
	{
		return zzq;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field long zzq>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		return zze.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String zze>
	//    2    4:invokevirtual   #165 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public boolean isEmbedded()
	{
		return zzt;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean zzt>
	//    2    4:ireturn         
	}

	public boolean isWatched()
	{
		return zzr;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean zzr>
	//    2    4:ireturn         
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #76  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #169 <Method void JSONObject()>
	//    3    7:astore_3        
		int j;
		JSONArray jsonarray;
		String as[];
		jsonobject.put("id", ((Object) (zze)));
	//    4    8:aload_3         
	//    5    9:ldc1            #74  <String "id">
	//    6   11:aload_0         
	//    7   12:getfield        #59  <Field String zze>
	//    8   15:invokevirtual   #173 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		jsonobject.put("position", (double)zzq / 1000D);
	//   10   19:aload_3         
	//   11   20:ldc1            #82  <String "position">
	//   12   22:aload_0         
	//   13   23:getfield        #57  <Field long zzq>
	//   14   26:l2d             
	//   15   27:ldc2w           #91  <Double 1000D>
	//   16   30:ddiv            
	//   17   31:invokevirtual   #176 <Method JSONObject JSONObject.put(String, double)>
	//   18   34:pop             
		jsonobject.put("isWatched", zzr);
	//   19   35:aload_3         
	//   20   36:ldc1            #93  <String "isWatched">
	//   21   38:aload_0         
	//   22   39:getfield        #63  <Field boolean zzr>
	//   23   42:invokevirtual   #179 <Method JSONObject JSONObject.put(String, boolean)>
	//   24   45:pop             
		jsonobject.put("isEmbedded", zzt);
	//   25   46:aload_3         
	//   26   47:ldc1            #119 <String "isEmbedded">
	//   27   49:aload_0         
	//   28   50:getfield        #67  <Field boolean zzt>
	//   29   53:invokevirtual   #179 <Method JSONObject JSONObject.put(String, boolean)>
	//   30   56:pop             
		jsonobject.put("duration", (double)zzg / 1000D);
	//   31   57:aload_3         
	//   32   58:ldc1            #98  <String "duration">
	//   33   60:aload_0         
	//   34   61:getfield        #61  <Field long zzg>
	//   35   64:l2d             
	//   36   65:ldc2w           #91  <Double 1000D>
	//   37   68:ddiv            
	//   38   69:invokevirtual   #176 <Method JSONObject JSONObject.put(String, double)>
	//   39   72:pop             
		if(zzs == null)
			break MISSING_BLOCK_LABEL_132;
	//   40   73:aload_0         
	//   41   74:getfield        #65  <Field String[] zzs>
	//   42   77:ifnull          132
		jsonarray = new JSONArray();
	//   43   80:new             #109 <Class JSONArray>
	//   44   83:dup             
	//   45   84:invokespecial   #180 <Method void JSONArray()>
	//   46   87:astore          4
		as = zzs;
	//   47   89:aload_0         
	//   48   90:getfield        #65  <Field String[] zzs>
	//   49   93:astore          5
		j = as.length;
	//   50   95:aload           5
	//   51   97:arraylength     
	//   52   98:istore_2        
		int i = 0;
	//   53   99:iconst_0        
	//   54  100:istore_1        
		while(i < j) 
	//*  55  101:iload_1         
	//*  56  102:iload_2         
	//*  57  103:icmpge          123
		{
			try
			{
				jsonarray.put(((Object) (as[i])));
	//   58  106:aload           4
	//   59  108:aload           5
	//   60  110:iload_1         
	//   61  111:aaload          
	//   62  112:invokevirtual   #183 <Method JSONArray JSONArray.put(Object)>
	//   63  115:pop             
			}
	//*  64  116:iload_1         
	//*  65  117:iconst_1        
	//*  66  118:iadd            
	//*  67  119:istore_1        
	//*  68  120:goto            101
	//*  69  123:aload_3         
	//*  70  124:ldc1            #103 <String "breakClipIds">
	//*  71  126:aload           4
	//*  72  128:invokevirtual   #173 <Method JSONObject JSONObject.put(String, Object)>
	//*  73  131:pop             
	//*  74  132:aload_3         
	//*  75  133:areturn         
			catch(JSONException jsonexception)
	//*  76  134:astore          4
			{
				return jsonobject;
	//   77  136:aload_3         
	//   78  137:areturn         
			}
			i++;
		}
		jsonobject.put("breakClipIds", ((Object) (jsonarray)));
		return jsonobject;
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #191 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeLong(parcel, 2, getPlaybackPositionInMs());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #193 <Method long getPlaybackPositionInMs()>
	//    7   11:invokestatic    #197 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 3, getId(), false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #199 <Method String getId()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #203 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 4, getDurationInMs());
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #205 <Method long getDurationInMs()>
	//   18   30:invokestatic    #197 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeBoolean(parcel, 5, isWatched());
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #207 <Method boolean isWatched()>
	//   23   39:invokestatic    #211 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringArray(parcel, 6, getBreakClipIds(), false);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:invokevirtual   #213 <Method String[] getBreakClipIds()>
	//   28   49:iconst_0        
	//   29   50:invokestatic    #217 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeBoolean(parcel, 7, isEmbedded());
	//   30   53:aload_1         
	//   31   54:bipush          7
	//   32   56:aload_0         
	//   33   57:invokevirtual   #219 <Method boolean isEmbedded()>
	//   34   60:invokestatic    #211 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   35   63:aload_1         
	//   36   64:iload_2         
	//   37   65:invokestatic    #222 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   38   68:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	private final String zze;
	private final long zzg;
	private final long zzq;
	private final boolean zzr;
	private String zzs[];
	private final boolean zzt;

	static 
	{
	//    0    0:new             #45  <Class zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void zzb()>
	//    3    7:putstatic       #50  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
