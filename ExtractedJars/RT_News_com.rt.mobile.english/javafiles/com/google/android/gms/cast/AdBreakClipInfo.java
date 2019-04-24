// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.cast.zzcu;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			zza, VastAdsRequest

public class AdBreakClipInfo extends AbstractSafeParcelable
{
	public static class Builder
	{

		public AdBreakClipInfo build()
		{
			return new AdBreakClipInfo(zze, zzf, zzg, zzh, mimeType, zzi, zzj, zzk, zzl, zzm, zzn, zzo);
		//    0    0:new             #6   <Class AdBreakClipInfo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field String zze>
		//    4    8:aload_0         
		//    5    9:getfield        #32  <Field String zzf>
		//    6   12:aload_0         
		//    7   13:getfield        #34  <Field long zzg>
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field String zzh>
		//   10   20:aload_0         
		//   11   21:getfield        #38  <Field String mimeType>
		//   12   24:aload_0         
		//   13   25:getfield        #40  <Field String zzi>
		//   14   28:aload_0         
		//   15   29:getfield        #42  <Field String zzj>
		//   16   32:aload_0         
		//   17   33:getfield        #44  <Field String zzk>
		//   18   36:aload_0         
		//   19   37:getfield        #46  <Field String zzl>
		//   20   40:aload_0         
		//   21   41:getfield        #50  <Field long zzm>
		//   22   44:aload_0         
		//   23   45:getfield        #57  <Field String zzn>
		//   24   48:aload_0         
		//   25   49:getfield        #52  <Field VastAdsRequest zzo>
		//   26   52:invokespecial   #60  <Method void AdBreakClipInfo(String, String, long, String, String, String, String, String, String, long, String, VastAdsRequest)>
		//   27   55:areturn         
		}

		public Builder setClickThroughUrl(String s)
		{
			zzi = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field String zzi>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setContentId(String s)
		{
			zzk = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field String zzk>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setContentUrl(String s)
		{
			zzh = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field String zzh>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setCustomDataJsonString(String s)
		{
			zzj = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #42  <Field String zzj>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDurationInMs(long l)
		{
			zzg = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #34  <Field long zzg>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setHlsSegmentFormat(String s)
		{
			zzn = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #57  <Field String zzn>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setImageUrl(String s)
		{
			zzl = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field String zzl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setMimeType(String s)
		{
			mimeType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field String mimeType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTitle(String s)
		{
			zzf = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #32  <Field String zzf>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setVastAdsRequest(VastAdsRequest vastadsrequest)
		{
			zzo = vastadsrequest;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field VastAdsRequest zzo>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWhenSkippableInMs(long l)
		{
			zzm = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #50  <Field long zzm>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String mimeType;
		private String zze;
		private String zzf;
		private long zzg;
		private String zzh;
		private String zzi;
		private String zzj;
		private String zzk;
		private String zzl;
		private long zzm;
		private String zzn;
		private VastAdsRequest zzo;

		public Builder(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			zze = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #30  <Field String zze>
			zzf = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #32  <Field String zzf>
			zzg = 0L;
		//    8   14:aload_0         
		//    9   15:lconst_0        
		//   10   16:putfield        #34  <Field long zzg>
			zzh = null;
		//   11   19:aload_0         
		//   12   20:aconst_null     
		//   13   21:putfield        #36  <Field String zzh>
			mimeType = null;
		//   14   24:aload_0         
		//   15   25:aconst_null     
		//   16   26:putfield        #38  <Field String mimeType>
			zzi = null;
		//   17   29:aload_0         
		//   18   30:aconst_null     
		//   19   31:putfield        #40  <Field String zzi>
			zzj = null;
		//   20   34:aload_0         
		//   21   35:aconst_null     
		//   22   36:putfield        #42  <Field String zzj>
			zzk = null;
		//   23   39:aload_0         
		//   24   40:aconst_null     
		//   25   41:putfield        #44  <Field String zzk>
			zzl = null;
		//   26   44:aload_0         
		//   27   45:aconst_null     
		//   28   46:putfield        #46  <Field String zzl>
			zzm = -1L;
		//   29   49:aload_0         
		//   30   50:ldc2w           #47  <Long -1L>
		//   31   53:putfield        #50  <Field long zzm>
			zzo = null;
		//   32   56:aload_0         
		//   33   57:aconst_null     
		//   34   58:putfield        #52  <Field VastAdsRequest zzo>
			zze = s;
		//   35   61:aload_0         
		//   36   62:aload_1         
		//   37   63:putfield        #30  <Field String zze>
		//   38   66:return          
		}
	}


	AdBreakClipInfo(String s, String s1, long l, String s2, String s3, String s4, 
			String s5, String s6, String s7, long l1, String s8, VastAdsRequest vastadsrequest)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void AbstractSafeParcelable()>
		zze = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #82  <Field String zze>
		zzf = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #84  <Field String zzf>
		zzg = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #86  <Field long zzg>
		zzh = s2;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #88  <Field String zzh>
		mimeType = s3;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #90  <Field String mimeType>
		zzi = s4;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #92  <Field String zzi>
		zzj = s5;
	//   20   37:aload_0         
	//   21   38:aload           8
	//   22   40:putfield        #94  <Field String zzj>
		zzk = s6;
	//   23   43:aload_0         
	//   24   44:aload           9
	//   25   46:putfield        #96  <Field String zzk>
		zzl = s7;
	//   26   49:aload_0         
	//   27   50:aload           10
	//   28   52:putfield        #98  <Field String zzl>
		zzm = l1;
	//   29   55:aload_0         
	//   30   56:lload           11
	//   31   58:putfield        #100 <Field long zzm>
		zzn = s8;
	//   32   61:aload_0         
	//   33   62:aload           13
	//   34   64:putfield        #102 <Field String zzn>
		zzo = vastadsrequest;
	//   35   67:aload_0         
	//   36   68:aload           14
	//   37   70:putfield        #104 <Field VastAdsRequest zzo>
		if(!TextUtils.isEmpty(((CharSequence) (zzj))))
	//*  38   73:aload_0         
	//*  39   74:getfield        #94  <Field String zzj>
	//*  40   77:invokestatic    #110 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   80:ifne            142
		{
			try
			{
				zzp = new JSONObject(s5);
	//   42   83:aload_0         
	//   43   84:new             #112 <Class JSONObject>
	//   44   87:dup             
	//   45   88:aload           8
	//   46   90:invokespecial   #115 <Method void JSONObject(String)>
	//   47   93:putfield        #117 <Field JSONObject zzp>
				return;
	//   48   96:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  49   97:astore_1        
			{
				Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[] {
					((JSONException) (s)).getMessage()
				}));
	//   50   98:ldc1            #119 <String "AdBreakClipInfo">
	//   51  100:getstatic       #125 <Field Locale Locale.ROOT>
	//   52  103:ldc1            #127 <String "Error creating AdBreakClipInfo: %s">
	//   53  105:iconst_1        
	//   54  106:anewarray       Object[]
	//   55  109:dup             
	//   56  110:iconst_0        
	//   57  111:aload_1         
	//   58  112:invokevirtual   #133 <Method String JSONException.getMessage()>
	//   59  115:aastore         
	//   60  116:invokestatic    #139 <Method String String.format(Locale, String, Object[])>
	//   61  119:invokestatic    #145 <Method int Log.w(String, String)>
	//   62  122:pop             
			}
			zzj = null;
	//   63  123:aload_0         
	//   64  124:aconst_null     
	//   65  125:putfield        #94  <Field String zzj>
			s = ((String) (new JSONObject()));
	//   66  128:new             #112 <Class JSONObject>
	//   67  131:dup             
	//   68  132:invokespecial   #146 <Method void JSONObject()>
	//   69  135:astore_1        
		} else
	//*  70  136:aload_0         
	//*  71  137:aload_1         
	//*  72  138:putfield        #117 <Field JSONObject zzp>
	//*  73  141:return          
		{
			s = ((String) (new JSONObject()));
	//   74  142:new             #112 <Class JSONObject>
	//   75  145:dup             
	//   76  146:invokespecial   #146 <Method void JSONObject()>
	//   77  149:astore_1        
		}
		zzp = ((JSONObject) (s));
	//*  78  150:goto            136
	}

	static AdBreakClipInfo zza(JSONObject jsonobject)
	{
		long l;
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(!jsonobject.has("id"))
	//*   4    6:aload_0         
	//*   5    7:ldc1            #151 <String "id">
	//*   6    9:invokevirtual   #155 <Method boolean JSONObject.has(String)>
	//*   7   12:ifne            17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		long l1;
		String s;
		String s1;
		String s2;
		String s3;
		String s4;
		String s5;
		String s6;
		String s7;
		VastAdsRequest vastadsrequest;
		JSONObject jsonobject1;
		try
		{
			s2 = jsonobject.getString("id");
	//   10   17:aload_0         
	//   11   18:ldc1            #151 <String "id">
	//   12   20:invokevirtual   #159 <Method String JSONObject.getString(String)>
	//   13   23:astore          7
			l1 = (long)((double)jsonobject.optLong("duration") * 1000D);
	//   14   25:aload_0         
	//   15   26:ldc1            #161 <String "duration">
	//   16   28:invokevirtual   #165 <Method long JSONObject.optLong(String)>
	//   17   31:l2d             
	//   18   32:ldc2w           #166 <Double 1000D>
	//   19   35:dmul            
	//   20   36:d2l             
	//   21   37:lstore_3        
			s3 = jsonobject.optString("clickThroughUrl", ((String) (null)));
	//   22   38:aload_0         
	//   23   39:ldc1            #169 <String "clickThroughUrl">
	//   24   41:aconst_null     
	//   25   42:invokevirtual   #173 <Method String JSONObject.optString(String, String)>
	//   26   45:astore          8
			s4 = jsonobject.optString("contentUrl", ((String) (null)));
	//   27   47:aload_0         
	//   28   48:ldc1            #175 <String "contentUrl">
	//   29   50:aconst_null     
	//   30   51:invokevirtual   #173 <Method String JSONObject.optString(String, String)>
	//   31   54:astore          9
			s1 = jsonobject.optString("mimeType", ((String) (null)));
	//   32   56:aload_0         
	//   33   57:ldc1            #176 <String "mimeType">
	//   34   59:aconst_null     
	//   35   60:invokevirtual   #173 <Method String JSONObject.optString(String, String)>
	//   36   63:astore          6
		}
	//*  37   65:aload           6
	//*  38   67:astore          5
	//*  39   69:aload           6
	//*  40   71:ifnonnull       83
	//*  41   74:aload_0         
	//*  42   75:ldc1            #178 <String "contentType">
	//*  43   77:aconst_null     
	//*  44   78:invokevirtual   #173 <Method String JSONObject.optString(String, String)>
	//*  45   81:astore          5
	//*  46   83:aload_0         
	//*  47   84:ldc1            #180 <String "title">
	//*  48   86:aconst_null     
	//*  49   87:invokevirtual   #173 <Method String JSONObject.optString(String, String)>
	//*  50   90:astore          6
	//*  51   92:aload_0         
	//*  52   93:ldc1            #182 <String "customData">
	//*  53   95:invokevirtual   #186 <Method JSONObject JSONObject.optJSONObject(String)>
	//*  54   98:astore          14
	//*  55  100:aload_0         
	//*  56  101:ldc1            #188 <String "contentId">
	//*  57  103:aconst_null     
	//*  58  104:invokevirtual   #173 <Method String JSONObject.optString(String, String)>
	//*  59  107:astore          10
	//*  60  109:aload_0         
	//*  61  110:ldc1            #190 <String "posterUrl">
	//*  62  112:aconst_null     
	//*  63  113:invokevirtual   #173 <Method String JSONObject.optString(String, String)>
	//*  64  116:astore          11
	//*  65  118:aload_0         
	//*  66  119:ldc1            #192 <String "whenSkippable">
	//*  67  121:invokevirtual   #155 <Method boolean JSONObject.has(String)>
	//*  68  124:ifeq            253
	//*  69  127:aload_0         
	//*  70  128:ldc1            #192 <String "whenSkippable">
	//*  71  130:invokevirtual   #196 <Method Object JSONObject.get(String)>
	//*  72  133:checkcast       #198 <Class Integer>
	//*  73  136:invokevirtual   #202 <Method int Integer.intValue()>
	//*  74  139:i2d             
	//*  75  140:ldc2w           #166 <Double 1000D>
	//*  76  143:dmul            
	//*  77  144:d2l             
	//*  78  145:lstore_1        
	//*  79  146:goto            149
	//*  80  149:aload_0         
	//*  81  150:ldc1            #204 <String "hlsSegmentFormat">
	//*  82  152:aconst_null     
	//*  83  153:invokevirtual   #173 <Method String JSONObject.optString(String, String)>
	//*  84  156:astore          12
	//*  85  158:aload_0         
	//*  86  159:ldc1            #206 <String "vastAdsRequest">
	//*  87  161:invokevirtual   #186 <Method JSONObject JSONObject.optJSONObject(String)>
	//*  88  164:invokestatic    #212 <Method VastAdsRequest VastAdsRequest.fromJson(JSONObject)>
	//*  89  167:astore          13
	//*  90  169:aload           14
	//*  91  171:ifnull          260
	//*  92  174:aload           14
	//*  93  176:invokevirtual   #215 <Method int JSONObject.length()>
	//*  94  179:ifne            185
	//*  95  182:goto            260
	//*  96  185:aload           14
	//*  97  187:invokevirtual   #218 <Method String JSONObject.toString()>
	//*  98  190:astore_0        
	//*  99  191:goto            194
	//* 100  194:new             #2   <Class AdBreakClipInfo>
	//* 101  197:dup             
	//* 102  198:aload           7
	//* 103  200:aload           6
	//* 104  202:lload_3         
	//* 105  203:aload           9
	//* 106  205:aload           5
	//* 107  207:aload           8
	//* 108  209:aload_0         
	//* 109  210:aload           10
	//* 110  212:aload           11
	//* 111  214:lload_1         
	//* 112  215:aload           12
	//* 113  217:aload           13
	//* 114  219:invokespecial   #220 <Method void AdBreakClipInfo(String, String, long, String, String, String, String, String, String, long, String, VastAdsRequest)>
	//* 115  222:astore_0        
	//* 116  223:aload_0         
	//* 117  224:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 118  225:astore_0        
		{
			Log.d("AdBreakClipInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[] {
				((JSONException) (jsonobject)).getMessage()
			}));
	//  119  226:ldc1            #119 <String "AdBreakClipInfo">
	//  120  228:getstatic       #125 <Field Locale Locale.ROOT>
	//  121  231:ldc1            #222 <String "Error while creating an AdBreakClipInfo from JSON: %s">
	//  122  233:iconst_1        
	//  123  234:anewarray       Object[]
	//  124  237:dup             
	//  125  238:iconst_0        
	//  126  239:aload_0         
	//  127  240:invokevirtual   #133 <Method String JSONException.getMessage()>
	//  128  243:aastore         
	//  129  244:invokestatic    #139 <Method String String.format(Locale, String, Object[])>
	//  130  247:invokestatic    #225 <Method int Log.d(String, String)>
	//  131  250:pop             
			return null;
	//  132  251:aconst_null     
	//  133  252:areturn         
		}
		s = s1;
		if(s1 != null)
			break MISSING_BLOCK_LABEL_83;
		s = jsonobject.optString("contentType", ((String) (null)));
		s1 = jsonobject.optString("title", ((String) (null)));
		jsonobject1 = jsonobject.optJSONObject("customData");
		s5 = jsonobject.optString("contentId", ((String) (null)));
		s6 = jsonobject.optString("posterUrl", ((String) (null)));
		if(!jsonobject.has("whenSkippable")) goto _L2; else goto _L1
_L1:
		l = (long)((double)((Integer)jsonobject.get("whenSkippable")).intValue() * 1000D);
_L3:
		s7 = jsonobject.optString("hlsSegmentFormat", ((String) (null)));
		vastadsrequest = VastAdsRequest.fromJson(jsonobject.optJSONObject("vastAdsRequest"));
		if(jsonobject1 == null)
			break MISSING_BLOCK_LABEL_260;
		if(jsonobject1.length() == 0)
			break MISSING_BLOCK_LABEL_260;
		jsonobject = ((JSONObject) (jsonobject1.toString()));
_L4:
		jsonobject = ((JSONObject) (new AdBreakClipInfo(s2, s1, l1, s4, s, s3, ((String) (jsonobject)), s5, s6, l, s7, vastadsrequest)));
		return ((AdBreakClipInfo) (jsonobject));
_L2:
		l = -1L;
	//  134  253:ldc2w           #16  <Long -1L>
	//  135  256:lstore_1        
		  goto _L3
	//* 136  257:goto            149
		jsonobject = null;
	//  137  260:aconst_null     
	//  138  261:astore_0        
		  goto _L4
	//* 139  262:goto            194
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
		if(!(obj instanceof AdBreakClipInfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AdBreakClipInfo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((AdBreakClipInfo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class AdBreakClipInfo>
	//   12   20:astore_1        
		return zzcu.zza(((Object) (zze)), ((Object) (((AdBreakClipInfo) (obj)).zze))) && zzcu.zza(((Object) (zzf)), ((Object) (((AdBreakClipInfo) (obj)).zzf))) && zzg == ((AdBreakClipInfo) (obj)).zzg && zzcu.zza(((Object) (zzh)), ((Object) (((AdBreakClipInfo) (obj)).zzh))) && zzcu.zza(((Object) (mimeType)), ((Object) (((AdBreakClipInfo) (obj)).mimeType))) && zzcu.zza(((Object) (zzi)), ((Object) (((AdBreakClipInfo) (obj)).zzi))) && zzcu.zza(((Object) (zzj)), ((Object) (((AdBreakClipInfo) (obj)).zzj))) && zzcu.zza(((Object) (zzk)), ((Object) (((AdBreakClipInfo) (obj)).zzk))) && zzcu.zza(((Object) (zzl)), ((Object) (((AdBreakClipInfo) (obj)).zzl))) && zzm == ((AdBreakClipInfo) (obj)).zzm && zzcu.zza(((Object) (zzn)), ((Object) (((AdBreakClipInfo) (obj)).zzn))) && zzcu.zza(((Object) (zzo)), ((Object) (((AdBreakClipInfo) (obj)).zzo)));
	//   13   21:aload_0         
	//   14   22:getfield        #82  <Field String zze>
	//   15   25:aload_1         
	//   16   26:getfield        #82  <Field String zze>
	//   17   29:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   18   32:ifeq            187
	//   19   35:aload_0         
	//   20   36:getfield        #84  <Field String zzf>
	//   21   39:aload_1         
	//   22   40:getfield        #84  <Field String zzf>
	//   23   43:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   24   46:ifeq            187
	//   25   49:aload_0         
	//   26   50:getfield        #86  <Field long zzg>
	//   27   53:aload_1         
	//   28   54:getfield        #86  <Field long zzg>
	//   29   57:lcmp            
	//   30   58:ifne            187
	//   31   61:aload_0         
	//   32   62:getfield        #88  <Field String zzh>
	//   33   65:aload_1         
	//   34   66:getfield        #88  <Field String zzh>
	//   35   69:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   36   72:ifeq            187
	//   37   75:aload_0         
	//   38   76:getfield        #90  <Field String mimeType>
	//   39   79:aload_1         
	//   40   80:getfield        #90  <Field String mimeType>
	//   41   83:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   42   86:ifeq            187
	//   43   89:aload_0         
	//   44   90:getfield        #92  <Field String zzi>
	//   45   93:aload_1         
	//   46   94:getfield        #92  <Field String zzi>
	//   47   97:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   48  100:ifeq            187
	//   49  103:aload_0         
	//   50  104:getfield        #94  <Field String zzj>
	//   51  107:aload_1         
	//   52  108:getfield        #94  <Field String zzj>
	//   53  111:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   54  114:ifeq            187
	//   55  117:aload_0         
	//   56  118:getfield        #96  <Field String zzk>
	//   57  121:aload_1         
	//   58  122:getfield        #96  <Field String zzk>
	//   59  125:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   60  128:ifeq            187
	//   61  131:aload_0         
	//   62  132:getfield        #98  <Field String zzl>
	//   63  135:aload_1         
	//   64  136:getfield        #98  <Field String zzl>
	//   65  139:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   66  142:ifeq            187
	//   67  145:aload_0         
	//   68  146:getfield        #100 <Field long zzm>
	//   69  149:aload_1         
	//   70  150:getfield        #100 <Field long zzm>
	//   71  153:lcmp            
	//   72  154:ifne            187
	//   73  157:aload_0         
	//   74  158:getfield        #102 <Field String zzn>
	//   75  161:aload_1         
	//   76  162:getfield        #102 <Field String zzn>
	//   77  165:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   78  168:ifeq            187
	//   79  171:aload_0         
	//   80  172:getfield        #104 <Field VastAdsRequest zzo>
	//   81  175:aload_1         
	//   82  176:getfield        #104 <Field VastAdsRequest zzo>
	//   83  179:invokestatic    #232 <Method boolean zzcu.zza(Object, Object)>
	//   84  182:ifeq            187
	//   85  185:iconst_1        
	//   86  186:ireturn         
	//   87  187:iconst_0        
	//   88  188:ireturn         
	}

	public String getClickThroughUrl()
	{
		return zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String zzi>
	//    2    4:areturn         
	}

	public String getContentId()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String zzk>
	//    2    4:areturn         
	}

	public String getContentUrl()
	{
		return zzh;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String zzh>
	//    2    4:areturn         
	}

	public JSONObject getCustomData()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field JSONObject zzp>
	//    2    4:areturn         
	}

	public long getDurationInMs()
	{
		return zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field long zzg>
	//    2    4:lreturn         
	}

	public String getHlsSegmentFormat()
	{
		return zzn;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String zzn>
	//    2    4:areturn         
	}

	public String getId()
	{
		return zze;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String zze>
	//    2    4:areturn         
	}

	public String getImageUrl()
	{
		return zzl;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String zzl>
	//    2    4:areturn         
	}

	public String getMimeType()
	{
		return mimeType;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String mimeType>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return zzf;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String zzf>
	//    2    4:areturn         
	}

	public VastAdsRequest getVastAdsRequest()
	{
		return zzo;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field VastAdsRequest zzo>
	//    2    4:areturn         
	}

	public long getWhenSkippableInMs()
	{
		return zzm;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field long zzm>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zze, zzf, Long.valueOf(zzg), zzh, mimeType, zzi, zzj, zzk, zzl, Long.valueOf(zzm), 
			zzn, zzo
		});
	//    0    0:bipush          12
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #82  <Field String zze>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #84  <Field String zzf>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #86  <Field long zzg>
	//   16   25:invokestatic    #243 <Method Long Long.valueOf(long)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #88  <Field String zzh>
	//   22   35:aastore         
	//   23   36:dup             
	//   24   37:iconst_4        
	//   25   38:aload_0         
	//   26   39:getfield        #90  <Field String mimeType>
	//   27   42:aastore         
	//   28   43:dup             
	//   29   44:iconst_5        
	//   30   45:aload_0         
	//   31   46:getfield        #92  <Field String zzi>
	//   32   49:aastore         
	//   33   50:dup             
	//   34   51:bipush          6
	//   35   53:aload_0         
	//   36   54:getfield        #94  <Field String zzj>
	//   37   57:aastore         
	//   38   58:dup             
	//   39   59:bipush          7
	//   40   61:aload_0         
	//   41   62:getfield        #96  <Field String zzk>
	//   42   65:aastore         
	//   43   66:dup             
	//   44   67:bipush          8
	//   45   69:aload_0         
	//   46   70:getfield        #98  <Field String zzl>
	//   47   73:aastore         
	//   48   74:dup             
	//   49   75:bipush          9
	//   50   77:aload_0         
	//   51   78:getfield        #100 <Field long zzm>
	//   52   81:invokestatic    #243 <Method Long Long.valueOf(long)>
	//   53   84:aastore         
	//   54   85:dup             
	//   55   86:bipush          10
	//   56   88:aload_0         
	//   57   89:getfield        #102 <Field String zzn>
	//   58   92:aastore         
	//   59   93:dup             
	//   60   94:bipush          11
	//   61   96:aload_0         
	//   62   97:getfield        #104 <Field VastAdsRequest zzo>
	//   63  100:aastore         
	//   64  101:invokestatic    #248 <Method int Objects.hashCode(Object[])>
	//   65  104:ireturn         
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #112 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("id", ((Object) (zze)));
	//    4    8:aload_1         
	//    5    9:ldc1            #151 <String "id">
	//    6   11:aload_0         
	//    7   12:getfield        #82  <Field String zze>
	//    8   15:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
			jsonobject.put("duration", (double)zzg / 1000D);
	//   10   19:aload_1         
	//   11   20:ldc1            #161 <String "duration">
	//   12   22:aload_0         
	//   13   23:getfield        #86  <Field long zzg>
	//   14   26:l2d             
	//   15   27:ldc2w           #166 <Double 1000D>
	//   16   30:ddiv            
	//   17   31:invokevirtual   #256 <Method JSONObject JSONObject.put(String, double)>
	//   18   34:pop             
			if(zzm != -1L)
	//*  19   35:aload_0         
	//*  20   36:getfield        #100 <Field long zzm>
	//*  21   39:ldc2w           #16  <Long -1L>
	//*  22   42:lcmp            
	//*  23   43:ifeq            62
				jsonobject.put("whenSkippable", (double)zzm / 1000D);
	//   24   46:aload_1         
	//   25   47:ldc1            #192 <String "whenSkippable">
	//   26   49:aload_0         
	//   27   50:getfield        #100 <Field long zzm>
	//   28   53:l2d             
	//   29   54:ldc2w           #166 <Double 1000D>
	//   30   57:ddiv            
	//   31   58:invokevirtual   #256 <Method JSONObject JSONObject.put(String, double)>
	//   32   61:pop             
			if(zzk != null)
	//*  33   62:aload_0         
	//*  34   63:getfield        #96  <Field String zzk>
	//*  35   66:ifnull          80
				jsonobject.put("contentId", ((Object) (zzk)));
	//   36   69:aload_1         
	//   37   70:ldc1            #188 <String "contentId">
	//   38   72:aload_0         
	//   39   73:getfield        #96  <Field String zzk>
	//   40   76:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//   41   79:pop             
			if(mimeType != null)
	//*  42   80:aload_0         
	//*  43   81:getfield        #90  <Field String mimeType>
	//*  44   84:ifnull          98
				jsonobject.put("contentType", ((Object) (mimeType)));
	//   45   87:aload_1         
	//   46   88:ldc1            #178 <String "contentType">
	//   47   90:aload_0         
	//   48   91:getfield        #90  <Field String mimeType>
	//   49   94:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//   50   97:pop             
			if(zzf != null)
	//*  51   98:aload_0         
	//*  52   99:getfield        #84  <Field String zzf>
	//*  53  102:ifnull          116
				jsonobject.put("title", ((Object) (zzf)));
	//   54  105:aload_1         
	//   55  106:ldc1            #180 <String "title">
	//   56  108:aload_0         
	//   57  109:getfield        #84  <Field String zzf>
	//   58  112:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//   59  115:pop             
			if(zzh != null)
	//*  60  116:aload_0         
	//*  61  117:getfield        #88  <Field String zzh>
	//*  62  120:ifnull          134
				jsonobject.put("contentUrl", ((Object) (zzh)));
	//   63  123:aload_1         
	//   64  124:ldc1            #175 <String "contentUrl">
	//   65  126:aload_0         
	//   66  127:getfield        #88  <Field String zzh>
	//   67  130:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//   68  133:pop             
			if(zzi != null)
	//*  69  134:aload_0         
	//*  70  135:getfield        #92  <Field String zzi>
	//*  71  138:ifnull          152
				jsonobject.put("clickThroughUrl", ((Object) (zzi)));
	//   72  141:aload_1         
	//   73  142:ldc1            #169 <String "clickThroughUrl">
	//   74  144:aload_0         
	//   75  145:getfield        #92  <Field String zzi>
	//   76  148:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//   77  151:pop             
			if(zzp != null)
	//*  78  152:aload_0         
	//*  79  153:getfield        #117 <Field JSONObject zzp>
	//*  80  156:ifnull          170
				jsonobject.put("customData", ((Object) (zzp)));
	//   81  159:aload_1         
	//   82  160:ldc1            #182 <String "customData">
	//   83  162:aload_0         
	//   84  163:getfield        #117 <Field JSONObject zzp>
	//   85  166:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//   86  169:pop             
			if(zzl != null)
	//*  87  170:aload_0         
	//*  88  171:getfield        #98  <Field String zzl>
	//*  89  174:ifnull          188
				jsonobject.put("posterUrl", ((Object) (zzl)));
	//   90  177:aload_1         
	//   91  178:ldc1            #190 <String "posterUrl">
	//   92  180:aload_0         
	//   93  181:getfield        #98  <Field String zzl>
	//   94  184:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//   95  187:pop             
			if(zzn != null)
	//*  96  188:aload_0         
	//*  97  189:getfield        #102 <Field String zzn>
	//*  98  192:ifnull          206
				jsonobject.put("hlsSegmentFormat", ((Object) (zzn)));
	//   99  195:aload_1         
	//  100  196:ldc1            #204 <String "hlsSegmentFormat">
	//  101  198:aload_0         
	//  102  199:getfield        #102 <Field String zzn>
	//  103  202:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//  104  205:pop             
			if(zzo != null)
	//* 105  206:aload_0         
	//* 106  207:getfield        #104 <Field VastAdsRequest zzo>
	//* 107  210:ifnull          227
				jsonobject.put("vastAdsRequest", ((Object) (zzo.toJson())));
	//  108  213:aload_1         
	//  109  214:ldc1            #206 <String "vastAdsRequest">
	//  110  216:aload_0         
	//  111  217:getfield        #104 <Field VastAdsRequest zzo>
	//  112  220:invokevirtual   #258 <Method JSONObject VastAdsRequest.toJson()>
	//  113  223:invokevirtual   #253 <Method JSONObject JSONObject.put(String, Object)>
	//  114  226:pop             
		}
	//* 115  227:aload_1         
	//* 116  228:areturn         
		catch(JSONException jsonexception)
	//* 117  229:astore_2        
		{
			return jsonobject;
	//  118  230:aload_1         
	//  119  231:areturn         
		}
		return jsonobject;
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #266 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeString(parcel, 2, getId(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #268 <Method String getId()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #274 <Method String getTitle()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 4, getDurationInMs());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #276 <Method long getDurationInMs()>
	//   19   31:invokestatic    #280 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 5, getContentUrl(), false);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #282 <Method String getContentUrl()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getMimeType(), false);
	//   26   44:aload_1         
	//   27   45:bipush          6
	//   28   47:aload_0         
	//   29   48:invokevirtual   #284 <Method String getMimeType()>
	//   30   51:iconst_0        
	//   31   52:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getClickThroughUrl(), false);
	//   32   55:aload_1         
	//   33   56:bipush          7
	//   34   58:aload_0         
	//   35   59:invokevirtual   #286 <Method String getClickThroughUrl()>
	//   36   62:iconst_0        
	//   37   63:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 8, zzj, false);
	//   38   66:aload_1         
	//   39   67:bipush          8
	//   40   69:aload_0         
	//   41   70:getfield        #94  <Field String zzj>
	//   42   73:iconst_0        
	//   43   74:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 9, getContentId(), false);
	//   44   77:aload_1         
	//   45   78:bipush          9
	//   46   80:aload_0         
	//   47   81:invokevirtual   #288 <Method String getContentId()>
	//   48   84:iconst_0        
	//   49   85:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 10, getImageUrl(), false);
	//   50   88:aload_1         
	//   51   89:bipush          10
	//   52   91:aload_0         
	//   53   92:invokevirtual   #290 <Method String getImageUrl()>
	//   54   95:iconst_0        
	//   55   96:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 11, getWhenSkippableInMs());
	//   56   99:aload_1         
	//   57  100:bipush          11
	//   58  102:aload_0         
	//   59  103:invokevirtual   #292 <Method long getWhenSkippableInMs()>
	//   60  106:invokestatic    #280 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 12, getHlsSegmentFormat(), false);
	//   61  109:aload_1         
	//   62  110:bipush          12
	//   63  112:aload_0         
	//   64  113:invokevirtual   #294 <Method String getHlsSegmentFormat()>
	//   65  116:iconst_0        
	//   66  117:invokestatic    #272 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 13, ((android.os.Parcelable) (getVastAdsRequest())), i, false);
	//   67  120:aload_1         
	//   68  121:bipush          13
	//   69  123:aload_0         
	//   70  124:invokevirtual   #296 <Method VastAdsRequest getVastAdsRequest()>
	//   71  127:iload_2         
	//   72  128:iconst_0        
	//   73  129:invokestatic    #300 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   74  132:aload_1         
	//   75  133:iload_3         
	//   76  134:invokestatic    #303 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   77  137:return          
	}

	public static final long AD_BREAK_CLIP_NOT_SKIPPABLE = -1L;
	public static final android.os.Parcelable.Creator CREATOR = new zza();
	private final String mimeType;
	private final String zze;
	private final String zzf;
	private final long zzg;
	private final String zzh;
	private final String zzi;
	private String zzj;
	private String zzk;
	private String zzl;
	private final long zzm;
	private final String zzn;
	private final VastAdsRequest zzo;
	private JSONObject zzp;

	static 
	{
	//    0    0:new             #68  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void zza()>
	//    3    7:putstatic       #73  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
