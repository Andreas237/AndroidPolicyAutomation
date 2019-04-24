// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzcu;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			zzai, MediaMetadata, MediaTrack, TextTrackStyle, 
//			AdBreakInfo, AdBreakClipInfo

public class MediaInfo extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static class Builder
	{

		public MediaInfo build()
		{
			return zzdi;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:areturn         
		}

		public Builder setAdBreakClips(List list)
		{
			zzdi.zzc(list);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #34  <Method void MediaInfo.zzc(List)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setAdBreaks(List list)
		{
			zzdi.zzb(list);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method void MediaInfo.zzb(List)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setContentType(String s)
		{
			zzdi.setContentType(s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #45  <Method void MediaInfo.setContentType(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setCustomData(JSONObject jsonobject)
		{
			zzdi.setCustomData(jsonobject);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #50  <Method void MediaInfo.setCustomData(JSONObject)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setEntity(String s)
		{
			zzdi.zzd(s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #54  <Method void MediaInfo.zzd(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setMediaTracks(List list)
		{
			zzdi.zza(list);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #58  <Method void MediaInfo.zza(List)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setMetadata(MediaMetadata mediametadata)
		{
			zzdi.zza(mediametadata);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #64  <Method void MediaInfo.zza(MediaMetadata)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setStreamDuration(long l)
			throws IllegalArgumentException
		{
			zzdi.zza(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #69  <Method void MediaInfo.zza(long)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setStreamType(int i)
			throws IllegalArgumentException
		{
			zzdi.setStreamType(i);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #74  <Method void MediaInfo.setStreamType(int)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setTextTrackStyle(TextTrackStyle texttrackstyle)
		{
			zzdi.setTextTrackStyle(texttrackstyle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaInfo zzdi>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #79  <Method void MediaInfo.setTextTrackStyle(TextTrackStyle)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private final MediaInfo zzdi;

		public Builder(String s)
			throws IllegalArgumentException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzdi = new MediaInfo(s);
		//    2    4:aload_0         
		//    3    5:new             #6   <Class MediaInfo>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #19  <Method void MediaInfo(String)>
		//    7   13:putfield        #21  <Field MediaInfo zzdi>
		//    8   16:return          
		}

		public Builder(String s, String s1)
			throws IllegalArgumentException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzdi = new MediaInfo(s, s1);
		//    2    4:aload_0         
		//    3    5:new             #6   <Class MediaInfo>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokespecial   #26  <Method void MediaInfo(String, String)>
		//    8   14:putfield        #21  <Field MediaInfo zzdi>
		//    9   17:return          
		}
	}


	MediaInfo(String s)
		throws IllegalArgumentException
	{
		this(s, -1, ((String) (null)), ((MediaMetadata) (null)), -1L, ((List) (null)), ((TextTrackStyle) (null)), ((String) (null)), ((List) (null)), ((List) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:ldc2w           #29  <Long -1L>
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:aconst_null     
	//   11   13:aconst_null     
	//   12   14:invokespecial   #89  <Method void MediaInfo(String, int, String, MediaMetadata, long, List, TextTrackStyle, String, List, List, String)>
		if(s == null)
	//*  13   17:aload_1         
	//*  14   18:ifnonnull       31
			throw new IllegalArgumentException("contentID cannot be null");
	//   15   21:new             #86  <Class IllegalArgumentException>
	//   16   24:dup             
	//   17   25:ldc1            #91  <String "contentID cannot be null">
	//   18   27:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   19   30:athrow          
		else
			return;
	//   20   31:return          
	}

	MediaInfo(String s, int i, String s1, MediaMetadata mediametadata, long l, List list, 
			TextTrackStyle texttrackstyle, String s2, List list1, List list2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void AbstractSafeParcelable()>
		zzk = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #102 <Field String zzk>
		streamType = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #104 <Field int streamType>
		zzda = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #106 <Field String zzda>
		zzdb = mediametadata;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #108 <Field MediaMetadata zzdb>
		zzdc = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #110 <Field long zzdc>
		zzdd = list;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #112 <Field List zzdd>
		zzde = texttrackstyle;
	//   20   37:aload_0         
	//   21   38:aload           8
	//   22   40:putfield        #114 <Field TextTrackStyle zzde>
		zzj = s2;
	//   23   43:aload_0         
	//   24   44:aload           9
	//   25   46:putfield        #116 <Field String zzj>
		if(zzj != null)
	//*  26   49:aload_0         
	//*  27   50:getfield        #116 <Field String zzj>
	//*  28   53:ifnull          87
			try
			{
				zzp = new JSONObject(zzj);
	//   29   56:aload_0         
	//   30   57:new             #118 <Class JSONObject>
	//   31   60:dup             
	//   32   61:aload_0         
	//   33   62:getfield        #116 <Field String zzj>
	//   34   65:invokespecial   #119 <Method void JSONObject(String)>
	//   35   68:putfield        #121 <Field JSONObject zzp>
			}
	//*  36   71:goto            92
	//*  37   74:aload_0         
	//*  38   75:aconst_null     
	//*  39   76:putfield        #121 <Field JSONObject zzp>
	//*  40   79:aload_0         
	//*  41   80:aconst_null     
	//*  42   81:putfield        #116 <Field String zzj>
	//*  43   84:goto            92
	//*  44   87:aload_0         
	//*  45   88:aconst_null     
	//*  46   89:putfield        #121 <Field JSONObject zzp>
	//*  47   92:aload_0         
	//*  48   93:aload           10
	//*  49   95:putfield        #123 <Field List zzdf>
	//*  50   98:aload_0         
	//*  51   99:aload           11
	//*  52  101:putfield        #125 <Field List zzdg>
	//*  53  104:aload_0         
	//*  54  105:aload           12
	//*  55  107:putfield        #127 <Field String zzdh>
	//*  56  110:return          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				zzp = null;
				zzj = null;
			}
		else
			zzp = null;
		zzdf = list1;
		zzdg = list2;
		zzdh = s3;
	//*  57  111:astore_1        
	//*  58  112:goto            74
	}

	MediaInfo(String s, String s1)
		throws IllegalArgumentException
	{
		this(s, -1, ((String) (null)), ((MediaMetadata) (null)), -1L, ((List) (null)), ((TextTrackStyle) (null)), ((String) (null)), ((List) (null)), ((List) (null)), s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:ldc2w           #29  <Long -1L>
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:aconst_null     
	//   11   13:aload_2         
	//   12   14:invokespecial   #89  <Method void MediaInfo(String, int, String, MediaMetadata, long, List, TextTrackStyle, String, List, List, String)>
		if(s == null)
	//*  13   17:aload_1         
	//*  14   18:ifnonnull       31
			throw new IllegalArgumentException("contentID cannot be null");
	//   15   21:new             #86  <Class IllegalArgumentException>
	//   16   24:dup             
	//   17   25:ldc1            #91  <String "contentID cannot be null">
	//   18   27:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   19   30:athrow          
		else
			return;
	//   20   31:return          
	}

	MediaInfo(JSONObject jsonobject)
		throws JSONException
	{
		this(jsonobject.getString("contentId"), -1, ((String) (null)), ((MediaMetadata) (null)), -1L, ((List) (null)), ((TextTrackStyle) (null)), ((String) (null)), ((List) (null)), ((List) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #135 <String "contentId">
	//    3    4:invokevirtual   #139 <Method String JSONObject.getString(String)>
	//    4    7:iconst_m1       
	//    5    8:aconst_null     
	//    6    9:aconst_null     
	//    7   10:ldc2w           #29  <Long -1L>
	//    8   13:aconst_null     
	//    9   14:aconst_null     
	//   10   15:aconst_null     
	//   11   16:aconst_null     
	//   12   17:aconst_null     
	//   13   18:aconst_null     
	//   14   19:invokespecial   #89  <Method void MediaInfo(String, int, String, MediaMetadata, long, List, TextTrackStyle, String, List, List, String)>
		Object obj = ((Object) (jsonobject.getString("streamType")));
	//   15   22:aload_1         
	//   16   23:ldc1            #140 <String "streamType">
	//   17   25:invokevirtual   #139 <Method String JSONObject.getString(String)>
	//   18   28:astore          7
		boolean flag1 = "NONE".equals(obj);
	//   19   30:ldc1            #142 <String "NONE">
	//   20   32:aload           7
	//   21   34:invokevirtual   #148 <Method boolean String.equals(Object)>
	//   22   37:istore          6
		boolean flag = false;
	//   23   39:iconst_0        
	//   24   40:istore          5
		if(flag1)
	//*  25   42:iload           6
	//*  26   44:ifeq            55
		{
			streamType = 0;
	//   27   47:aload_0         
	//   28   48:iconst_0        
	//   29   49:putfield        #104 <Field int streamType>
		} else
	//*  30   52:goto            99
		{
			int i;
			if("BUFFERED".equals(obj))
	//*  31   55:ldc1            #150 <String "BUFFERED">
	//*  32   57:aload           7
	//*  33   59:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  34   62:ifeq            77
				i = 1;
	//   35   65:iconst_1        
	//   36   66:istore          4
			else
	//*  37   68:aload_0         
	//*  38   69:iload           4
	//*  39   71:putfield        #104 <Field int streamType>
	//*  40   74:goto            99
			if("LIVE".equals(obj))
	//*  41   77:ldc1            #152 <String "LIVE">
	//*  42   79:aload           7
	//*  43   81:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  44   84:ifeq            93
				i = 2;
	//   45   87:iconst_2        
	//   46   88:istore          4
			else
	//*  47   90:goto            68
				i = -1;
	//   48   93:iconst_m1       
	//   49   94:istore          4
			streamType = i;
		}
	//*  50   96:goto            68
		obj = null;
	//   51   99:aconst_null     
	//   52  100:astore          7
		zzda = jsonobject.optString("contentType", ((String) (null)));
	//   53  102:aload_0         
	//   54  103:aload_1         
	//   55  104:ldc1            #154 <String "contentType">
	//   56  106:aconst_null     
	//   57  107:invokevirtual   #158 <Method String JSONObject.optString(String, String)>
	//   58  110:putfield        #106 <Field String zzda>
		if(jsonobject.has("metadata"))
	//*  59  113:aload_1         
	//*  60  114:ldc1            #160 <String "metadata">
	//*  61  116:invokevirtual   #164 <Method boolean JSONObject.has(String)>
	//*  62  119:ifeq            157
		{
			JSONObject jsonobject1 = jsonobject.getJSONObject("metadata");
	//   63  122:aload_1         
	//   64  123:ldc1            #160 <String "metadata">
	//   65  125:invokevirtual   #168 <Method JSONObject JSONObject.getJSONObject(String)>
	//   66  128:astore          8
			zzdb = new MediaMetadata(jsonobject1.getInt("metadataType"));
	//   67  130:aload_0         
	//   68  131:new             #170 <Class MediaMetadata>
	//   69  134:dup             
	//   70  135:aload           8
	//   71  137:ldc1            #172 <String "metadataType">
	//   72  139:invokevirtual   #176 <Method int JSONObject.getInt(String)>
	//   73  142:invokespecial   #179 <Method void MediaMetadata(int)>
	//   74  145:putfield        #108 <Field MediaMetadata zzdb>
			zzdb.zze(jsonobject1);
	//   75  148:aload_0         
	//   76  149:getfield        #108 <Field MediaMetadata zzdb>
	//   77  152:aload           8
	//   78  154:invokevirtual   #182 <Method void MediaMetadata.zze(JSONObject)>
		}
		zzdc = -1L;
	//   79  157:aload_0         
	//   80  158:ldc2w           #29  <Long -1L>
	//   81  161:putfield        #110 <Field long zzdc>
		if(jsonobject.has("duration") && !jsonobject.isNull("duration"))
	//*  82  164:aload_1         
	//*  83  165:ldc1            #184 <String "duration">
	//*  84  167:invokevirtual   #164 <Method boolean JSONObject.has(String)>
	//*  85  170:ifeq            214
	//*  86  173:aload_1         
	//*  87  174:ldc1            #184 <String "duration">
	//*  88  176:invokevirtual   #187 <Method boolean JSONObject.isNull(String)>
	//*  89  179:ifne            214
		{
			double d = jsonobject.optDouble("duration", 0.0D);
	//   90  182:aload_1         
	//   91  183:ldc1            #184 <String "duration">
	//   92  185:dconst_0        
	//   93  186:invokevirtual   #191 <Method double JSONObject.optDouble(String, double)>
	//   94  189:dstore_2        
			if(!Double.isNaN(d) && !Double.isInfinite(d))
	//*  95  190:dload_2         
	//*  96  191:invokestatic    #197 <Method boolean Double.isNaN(double)>
	//*  97  194:ifne            214
	//*  98  197:dload_2         
	//*  99  198:invokestatic    #200 <Method boolean Double.isInfinite(double)>
	//* 100  201:ifne            214
				zzdc = (long)(d * 1000D);
	//  101  204:aload_0         
	//  102  205:dload_2         
	//  103  206:ldc2w           #201 <Double 1000D>
	//  104  209:dmul            
	//  105  210:d2l             
	//  106  211:putfield        #110 <Field long zzdc>
		}
		if(jsonobject.has("tracks"))
	//* 107  214:aload_1         
	//* 108  215:ldc1            #204 <String "tracks">
	//* 109  217:invokevirtual   #164 <Method boolean JSONObject.has(String)>
	//* 110  220:ifeq            293
		{
			zzdd = ((List) (new ArrayList()));
	//  111  223:aload_0         
	//  112  224:new             #206 <Class ArrayList>
	//  113  227:dup             
	//  114  228:invokespecial   #207 <Method void ArrayList()>
	//  115  231:putfield        #112 <Field List zzdd>
			JSONArray jsonarray = jsonobject.getJSONArray("tracks");
	//  116  234:aload_1         
	//  117  235:ldc1            #204 <String "tracks">
	//  118  237:invokevirtual   #211 <Method JSONArray JSONObject.getJSONArray(String)>
	//  119  240:astore          8
			for(int j = ((int) (flag)); j < jsonarray.length(); j++)
	//* 120  242:iload           5
	//* 121  244:istore          4
	//* 122  246:iload           4
	//* 123  248:aload           8
	//* 124  250:invokevirtual   #217 <Method int JSONArray.length()>
	//* 125  253:icmpge          298
			{
				MediaTrack mediatrack = new MediaTrack(jsonarray.getJSONObject(j));
	//  126  256:new             #219 <Class MediaTrack>
	//  127  259:dup             
	//  128  260:aload           8
	//  129  262:iload           4
	//  130  264:invokevirtual   #222 <Method JSONObject JSONArray.getJSONObject(int)>
	//  131  267:invokespecial   #224 <Method void MediaTrack(JSONObject)>
	//  132  270:astore          9
				zzdd.add(((Object) (mediatrack)));
	//  133  272:aload_0         
	//  134  273:getfield        #112 <Field List zzdd>
	//  135  276:aload           9
	//  136  278:invokeinterface #229 <Method boolean List.add(Object)>
	//  137  283:pop             
			}

	//  138  284:iload           4
	//  139  286:iconst_1        
	//  140  287:iadd            
	//  141  288:istore          4
		} else
	//* 142  290:goto            246
		{
			zzdd = null;
	//  143  293:aload_0         
	//  144  294:aconst_null     
	//  145  295:putfield        #112 <Field List zzdd>
		}
		if(jsonobject.has("textTrackStyle"))
	//* 146  298:aload_1         
	//* 147  299:ldc1            #231 <String "textTrackStyle">
	//* 148  301:invokevirtual   #164 <Method boolean JSONObject.has(String)>
	//* 149  304:ifeq            331
		{
			JSONObject jsonobject2 = jsonobject.getJSONObject("textTrackStyle");
	//  150  307:aload_1         
	//  151  308:ldc1            #231 <String "textTrackStyle">
	//  152  310:invokevirtual   #168 <Method JSONObject JSONObject.getJSONObject(String)>
	//  153  313:astore          8
			obj = ((Object) (new TextTrackStyle()));
	//  154  315:new             #233 <Class TextTrackStyle>
	//  155  318:dup             
	//  156  319:invokespecial   #234 <Method void TextTrackStyle()>
	//  157  322:astore          7
			((TextTrackStyle) (obj)).zze(jsonobject2);
	//  158  324:aload           7
	//  159  326:aload           8
	//  160  328:invokevirtual   #235 <Method void TextTrackStyle.zze(JSONObject)>
		}
		zzde = ((TextTrackStyle) (obj));
	//  161  331:aload_0         
	//  162  332:aload           7
	//  163  334:putfield        #114 <Field TextTrackStyle zzde>
		zzd(jsonobject);
	//  164  337:aload_0         
	//  165  338:aload_1         
	//  166  339:invokevirtual   #238 <Method void zzd(JSONObject)>
		zzp = jsonobject.optJSONObject("customData");
	//  167  342:aload_0         
	//  168  343:aload_1         
	//  169  344:ldc1            #240 <String "customData">
	//  170  346:invokevirtual   #243 <Method JSONObject JSONObject.optJSONObject(String)>
	//  171  349:putfield        #121 <Field JSONObject zzp>
		if(jsonobject.has("entity"))
	//* 172  352:aload_1         
	//* 173  353:ldc1            #245 <String "entity">
	//* 174  355:invokevirtual   #164 <Method boolean JSONObject.has(String)>
	//* 175  358:ifeq            371
			zzdh = jsonobject.getString("entity");
	//  176  361:aload_0         
	//  177  362:aload_1         
	//  178  363:ldc1            #245 <String "entity">
	//  179  365:invokevirtual   #139 <Method String JSONObject.getString(String)>
	//  180  368:putfield        #127 <Field String zzdh>
	//  181  371:return          
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
		if(!(obj instanceof MediaInfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaInfo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaInfo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaInfo>
	//   12   20:astore_1        
		boolean flag;
		if(zzp == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #121 <Field JSONObject zzp>
	//*  15   25:ifnonnull       33
			flag = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
		else
	//*  18   30:goto            35
			flag = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
		boolean flag1;
		if(((MediaInfo) (obj)).zzp == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #121 <Field JSONObject zzp>
	//*  23   39:ifnonnull       47
			flag1 = true;
	//   24   42:iconst_1        
	//   25   43:istore_3        
		else
	//*  26   44:goto            49
			flag1 = false;
	//   27   47:iconst_0        
	//   28   48:istore_3        
		if(flag != flag1)
	//*  29   49:iload_2         
	//*  30   50:iload_3         
	//*  31   51:icmpeq          56
			return false;
	//   32   54:iconst_0        
	//   33   55:ireturn         
		if(zzp != null && ((MediaInfo) (obj)).zzp != null && !JsonUtils.areJsonValuesEquivalent(((Object) (zzp)), ((Object) (((MediaInfo) (obj)).zzp))))
	//*  34   56:aload_0         
	//*  35   57:getfield        #121 <Field JSONObject zzp>
	//*  36   60:ifnull          86
	//*  37   63:aload_1         
	//*  38   64:getfield        #121 <Field JSONObject zzp>
	//*  39   67:ifnull          86
	//*  40   70:aload_0         
	//*  41   71:getfield        #121 <Field JSONObject zzp>
	//*  42   74:aload_1         
	//*  43   75:getfield        #121 <Field JSONObject zzp>
	//*  44   78:invokestatic    #251 <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//*  45   81:ifne            86
			return false;
	//   46   84:iconst_0        
	//   47   85:ireturn         
		return zzcu.zza(((Object) (zzk)), ((Object) (((MediaInfo) (obj)).zzk))) && streamType == ((MediaInfo) (obj)).streamType && zzcu.zza(((Object) (zzda)), ((Object) (((MediaInfo) (obj)).zzda))) && zzcu.zza(((Object) (zzdb)), ((Object) (((MediaInfo) (obj)).zzdb))) && zzdc == ((MediaInfo) (obj)).zzdc && zzcu.zza(((Object) (zzdd)), ((Object) (((MediaInfo) (obj)).zzdd))) && zzcu.zza(((Object) (zzde)), ((Object) (((MediaInfo) (obj)).zzde))) && zzcu.zza(((Object) (zzdf)), ((Object) (((MediaInfo) (obj)).zzdf))) && zzcu.zza(((Object) (zzdg)), ((Object) (((MediaInfo) (obj)).zzdg))) && zzcu.zza(((Object) (zzdh)), ((Object) (((MediaInfo) (obj)).zzdh)));
	//   48   86:aload_0         
	//   49   87:getfield        #102 <Field String zzk>
	//   50   90:aload_1         
	//   51   91:getfield        #102 <Field String zzk>
	//   52   94:invokestatic    #256 <Method boolean zzcu.zza(Object, Object)>
	//   53   97:ifeq            223
	//   54  100:aload_0         
	//   55  101:getfield        #104 <Field int streamType>
	//   56  104:aload_1         
	//   57  105:getfield        #104 <Field int streamType>
	//   58  108:icmpne          223
	//   59  111:aload_0         
	//   60  112:getfield        #106 <Field String zzda>
	//   61  115:aload_1         
	//   62  116:getfield        #106 <Field String zzda>
	//   63  119:invokestatic    #256 <Method boolean zzcu.zza(Object, Object)>
	//   64  122:ifeq            223
	//   65  125:aload_0         
	//   66  126:getfield        #108 <Field MediaMetadata zzdb>
	//   67  129:aload_1         
	//   68  130:getfield        #108 <Field MediaMetadata zzdb>
	//   69  133:invokestatic    #256 <Method boolean zzcu.zza(Object, Object)>
	//   70  136:ifeq            223
	//   71  139:aload_0         
	//   72  140:getfield        #110 <Field long zzdc>
	//   73  143:aload_1         
	//   74  144:getfield        #110 <Field long zzdc>
	//   75  147:lcmp            
	//   76  148:ifne            223
	//   77  151:aload_0         
	//   78  152:getfield        #112 <Field List zzdd>
	//   79  155:aload_1         
	//   80  156:getfield        #112 <Field List zzdd>
	//   81  159:invokestatic    #256 <Method boolean zzcu.zza(Object, Object)>
	//   82  162:ifeq            223
	//   83  165:aload_0         
	//   84  166:getfield        #114 <Field TextTrackStyle zzde>
	//   85  169:aload_1         
	//   86  170:getfield        #114 <Field TextTrackStyle zzde>
	//   87  173:invokestatic    #256 <Method boolean zzcu.zza(Object, Object)>
	//   88  176:ifeq            223
	//   89  179:aload_0         
	//   90  180:getfield        #123 <Field List zzdf>
	//   91  183:aload_1         
	//   92  184:getfield        #123 <Field List zzdf>
	//   93  187:invokestatic    #256 <Method boolean zzcu.zza(Object, Object)>
	//   94  190:ifeq            223
	//   95  193:aload_0         
	//   96  194:getfield        #125 <Field List zzdg>
	//   97  197:aload_1         
	//   98  198:getfield        #125 <Field List zzdg>
	//   99  201:invokestatic    #256 <Method boolean zzcu.zza(Object, Object)>
	//  100  204:ifeq            223
	//  101  207:aload_0         
	//  102  208:getfield        #127 <Field String zzdh>
	//  103  211:aload_1         
	//  104  212:getfield        #127 <Field String zzdh>
	//  105  215:invokestatic    #256 <Method boolean zzcu.zza(Object, Object)>
	//  106  218:ifeq            223
	//  107  221:iconst_1        
	//  108  222:ireturn         
	//  109  223:iconst_0        
	//  110  224:ireturn         
	}

	public List getAdBreakClips()
	{
		if(zzdg == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field List zzdg>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return Collections.unmodifiableList(zzdg);
	//    5    9:aload_0         
	//    6   10:getfield        #125 <Field List zzdg>
	//    7   13:invokestatic    #263 <Method List Collections.unmodifiableList(List)>
	//    8   16:areturn         
	}

	public List getAdBreaks()
	{
		if(zzdf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field List zzdf>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return Collections.unmodifiableList(zzdf);
	//    5    9:aload_0         
	//    6   10:getfield        #123 <Field List zzdf>
	//    7   13:invokestatic    #263 <Method List Collections.unmodifiableList(List)>
	//    8   16:areturn         
	}

	public String getContentId()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String zzk>
	//    2    4:areturn         
	}

	public String getContentType()
	{
		return zzda;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field String zzda>
	//    2    4:areturn         
	}

	public JSONObject getCustomData()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field JSONObject zzp>
	//    2    4:areturn         
	}

	public String getEntity()
	{
		return zzdh;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field String zzdh>
	//    2    4:areturn         
	}

	public List getMediaTracks()
	{
		return zzdd;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field List zzdd>
	//    2    4:areturn         
	}

	public MediaMetadata getMetadata()
	{
		return zzdb;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MediaMetadata zzdb>
	//    2    4:areturn         
	}

	public long getStreamDuration()
	{
		return zzdc;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field long zzdc>
	//    2    4:lreturn         
	}

	public int getStreamType()
	{
		return streamType;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int streamType>
	//    2    4:ireturn         
	}

	public TextTrackStyle getTextTrackStyle()
	{
		return zzde;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field TextTrackStyle zzde>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzk, Integer.valueOf(streamType), zzda, zzdb, Long.valueOf(zzdc), String.valueOf(((Object) (zzp))), zzdd, zzde, zzdf, zzdg, 
			zzdh
		});
	//    0    0:bipush          11
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #102 <Field String zzk>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #104 <Field int streamType>
	//   11   18:invokestatic    #281 <Method Integer Integer.valueOf(int)>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:aload_0         
	//   16   25:getfield        #106 <Field String zzda>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #108 <Field MediaMetadata zzdb>
	//   22   35:aastore         
	//   23   36:dup             
	//   24   37:iconst_4        
	//   25   38:aload_0         
	//   26   39:getfield        #110 <Field long zzdc>
	//   27   42:invokestatic    #286 <Method Long Long.valueOf(long)>
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_5        
	//   31   48:aload_0         
	//   32   49:getfield        #121 <Field JSONObject zzp>
	//   33   52:invokestatic    #289 <Method String String.valueOf(Object)>
	//   34   55:aastore         
	//   35   56:dup             
	//   36   57:bipush          6
	//   37   59:aload_0         
	//   38   60:getfield        #112 <Field List zzdd>
	//   39   63:aastore         
	//   40   64:dup             
	//   41   65:bipush          7
	//   42   67:aload_0         
	//   43   68:getfield        #114 <Field TextTrackStyle zzde>
	//   44   71:aastore         
	//   45   72:dup             
	//   46   73:bipush          8
	//   47   75:aload_0         
	//   48   76:getfield        #123 <Field List zzdf>
	//   49   79:aastore         
	//   50   80:dup             
	//   51   81:bipush          9
	//   52   83:aload_0         
	//   53   84:getfield        #125 <Field List zzdg>
	//   54   87:aastore         
	//   55   88:dup             
	//   56   89:bipush          10
	//   57   91:aload_0         
	//   58   92:getfield        #127 <Field String zzdh>
	//   59   95:aastore         
	//   60   96:invokestatic    #294 <Method int Objects.hashCode(Object[])>
	//   61   99:ireturn         
	}

	final void setContentType(String s)
	{
		zzda = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field String zzda>
	//    3    5:return          
	}

	final void setCustomData(JSONObject jsonobject)
	{
		zzp = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field JSONObject zzp>
	//    3    5:return          
	}

	final void setStreamType(int i)
		throws IllegalArgumentException
	{
		if(i >= -1 && i <= 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmplt          19
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:icmple          13
	//*   6   10:goto            19
		{
			streamType = i;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #104 <Field int streamType>
			return;
	//   10   18:return          
		} else
		{
			throw new IllegalArgumentException("invalid stream type");
	//   11   19:new             #86  <Class IllegalArgumentException>
	//   12   22:dup             
	//   13   23:ldc2            #299 <String "invalid stream type">
	//   14   26:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   15   29:athrow          
		}
	}

	public void setTextTrackStyle(TextTrackStyle texttrackstyle)
	{
		zzde = texttrackstyle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #114 <Field TextTrackStyle zzde>
	//    3    5:return          
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #118 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #303 <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("contentId", ((Object) (zzk)));
	//    4    8:aload_2         
	//    5    9:ldc1            #135 <String "contentId">
	//    6   11:aload_0         
	//    7   12:getfield        #102 <Field String zzk>
	//    8   15:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		streamType;
	//   10   19:aload_0         
	//   11   20:getfield        #104 <Field int streamType>
		JVM INSTR tableswitch 1 2: default 381
	//	               1 393
	//	               2 387;
	//   12   23:tableswitch     1 2: default 381
	//	               1 393
	//	               2 387
		   goto _L1 _L2 _L3
_L2:
		break MISSING_BLOCK_LABEL_393;
_L13:
		Object obj;
		jsonobject.put("streamType", obj);
	//   13   44:aload_2         
	//   14   45:ldc1            #140 <String "streamType">
	//   15   47:aload_1         
	//   16   48:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//   17   51:pop             
		if(zzda != null)
	//*  18   52:aload_0         
	//*  19   53:getfield        #106 <Field String zzda>
	//*  20   56:ifnull          70
			jsonobject.put("contentType", ((Object) (zzda)));
	//   21   59:aload_2         
	//   22   60:ldc1            #154 <String "contentType">
	//   23   62:aload_0         
	//   24   63:getfield        #106 <Field String zzda>
	//   25   66:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//   26   69:pop             
		if(zzdb != null)
	//*  27   70:aload_0         
	//*  28   71:getfield        #108 <Field MediaMetadata zzdb>
	//*  29   74:ifnull          91
			jsonobject.put("metadata", ((Object) (zzdb.toJson())));
	//   30   77:aload_2         
	//   31   78:ldc1            #160 <String "metadata">
	//   32   80:aload_0         
	//   33   81:getfield        #108 <Field MediaMetadata zzdb>
	//   34   84:invokevirtual   #309 <Method JSONObject MediaMetadata.toJson()>
	//   35   87:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//   36   90:pop             
		if(zzdc > -1L) goto _L5; else goto _L4
	//   37   91:aload_0         
	//   38   92:getfield        #110 <Field long zzdc>
	//   39   95:ldc2w           #29  <Long -1L>
	//   40   98:lcmp            
	//   41   99:ifgt            115
_L4:
		jsonobject.put("duration", JSONObject.NULL);
	//   42  102:aload_2         
	//   43  103:ldc1            #184 <String "duration">
	//   44  105:getstatic       #313 <Field Object JSONObject.NULL>
	//   45  108:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//   46  111:pop             
		  goto _L6
	//*  47  112:goto            131
_L5:
		jsonobject.put("duration", (double)zzdc / 1000D);
	//   48  115:aload_2         
	//   49  116:ldc1            #184 <String "duration">
	//   50  118:aload_0         
	//   51  119:getfield        #110 <Field long zzdc>
	//   52  122:l2d             
	//   53  123:ldc2w           #201 <Double 1000D>
	//   54  126:ddiv            
	//   55  127:invokevirtual   #316 <Method JSONObject JSONObject.put(String, double)>
	//   56  130:pop             
_L6:
		if(zzdd == null) goto _L8; else goto _L7
	//   57  131:aload_0         
	//   58  132:getfield        #112 <Field List zzdd>
	//   59  135:ifnull          193
_L7:
		obj = ((Object) (new JSONArray()));
	//   60  138:new             #213 <Class JSONArray>
	//   61  141:dup             
	//   62  142:invokespecial   #317 <Method void JSONArray()>
	//   63  145:astore_1        
		for(Iterator iterator = zzdd.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((Object) (((MediaTrack)iterator.next()).toJson()))));
	//   64  146:aload_0         
	//   65  147:getfield        #112 <Field List zzdd>
	//   66  150:invokeinterface #321 <Method Iterator List.iterator()>
	//   67  155:astore_3        
	//   68  156:aload_3         
	//   69  157:invokeinterface #327 <Method boolean Iterator.hasNext()>
	//   70  162:ifeq            185
	//   71  165:aload_1         
	//   72  166:aload_3         
	//   73  167:invokeinterface #331 <Method Object Iterator.next()>
	//   74  172:checkcast       #219 <Class MediaTrack>
	//   75  175:invokevirtual   #332 <Method JSONObject MediaTrack.toJson()>
	//   76  178:invokevirtual   #335 <Method JSONArray JSONArray.put(Object)>
	//   77  181:pop             
	//*  78  182:goto            156
		jsonobject.put("tracks", obj);
	//   79  185:aload_2         
	//   80  186:ldc1            #204 <String "tracks">
	//   81  188:aload_1         
	//   82  189:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//   83  192:pop             
_L8:
		if(zzde != null)
	//*  84  193:aload_0         
	//*  85  194:getfield        #114 <Field TextTrackStyle zzde>
	//*  86  197:ifnull          214
			jsonobject.put("textTrackStyle", ((Object) (zzde.toJson())));
	//   87  200:aload_2         
	//   88  201:ldc1            #231 <String "textTrackStyle">
	//   89  203:aload_0         
	//   90  204:getfield        #114 <Field TextTrackStyle zzde>
	//   91  207:invokevirtual   #336 <Method JSONObject TextTrackStyle.toJson()>
	//   92  210:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//   93  213:pop             
		if(zzp != null)
	//*  94  214:aload_0         
	//*  95  215:getfield        #121 <Field JSONObject zzp>
	//*  96  218:ifnull          232
			jsonobject.put("customData", ((Object) (zzp)));
	//   97  221:aload_2         
	//   98  222:ldc1            #240 <String "customData">
	//   99  224:aload_0         
	//  100  225:getfield        #121 <Field JSONObject zzp>
	//  101  228:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//  102  231:pop             
		if(zzdh != null)
	//* 103  232:aload_0         
	//* 104  233:getfield        #127 <Field String zzdh>
	//* 105  236:ifnull          250
			jsonobject.put("entity", ((Object) (zzdh)));
	//  106  239:aload_2         
	//  107  240:ldc1            #245 <String "entity">
	//  108  242:aload_0         
	//  109  243:getfield        #127 <Field String zzdh>
	//  110  246:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//  111  249:pop             
		if(zzdf == null) goto _L10; else goto _L9
	//  112  250:aload_0         
	//  113  251:getfield        #123 <Field List zzdf>
	//  114  254:ifnull          313
_L9:
		obj = ((Object) (new JSONArray()));
	//  115  257:new             #213 <Class JSONArray>
	//  116  260:dup             
	//  117  261:invokespecial   #317 <Method void JSONArray()>
	//  118  264:astore_1        
		for(Iterator iterator1 = zzdf.iterator(); iterator1.hasNext(); ((JSONArray) (obj)).put(((Object) (((AdBreakInfo)iterator1.next()).toJson()))));
	//  119  265:aload_0         
	//  120  266:getfield        #123 <Field List zzdf>
	//  121  269:invokeinterface #321 <Method Iterator List.iterator()>
	//  122  274:astore_3        
	//  123  275:aload_3         
	//  124  276:invokeinterface #327 <Method boolean Iterator.hasNext()>
	//  125  281:ifeq            304
	//  126  284:aload_1         
	//  127  285:aload_3         
	//  128  286:invokeinterface #331 <Method Object Iterator.next()>
	//  129  291:checkcast       #338 <Class AdBreakInfo>
	//  130  294:invokevirtual   #339 <Method JSONObject AdBreakInfo.toJson()>
	//  131  297:invokevirtual   #335 <Method JSONArray JSONArray.put(Object)>
	//  132  300:pop             
	//* 133  301:goto            275
		jsonobject.put("breaks", obj);
	//  134  304:aload_2         
	//  135  305:ldc2            #341 <String "breaks">
	//  136  308:aload_1         
	//  137  309:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//  138  312:pop             
_L10:
		if(zzdg == null) goto _L12; else goto _L11
	//  139  313:aload_0         
	//  140  314:getfield        #125 <Field List zzdg>
	//  141  317:ifnull          376
_L11:
		obj = ((Object) (new JSONArray()));
	//  142  320:new             #213 <Class JSONArray>
	//  143  323:dup             
	//  144  324:invokespecial   #317 <Method void JSONArray()>
	//  145  327:astore_1        
		for(Iterator iterator2 = zzdg.iterator(); iterator2.hasNext(); ((JSONArray) (obj)).put(((Object) (((AdBreakClipInfo)iterator2.next()).toJson()))));
	//  146  328:aload_0         
	//  147  329:getfield        #125 <Field List zzdg>
	//  148  332:invokeinterface #321 <Method Iterator List.iterator()>
	//  149  337:astore_3        
	//  150  338:aload_3         
	//  151  339:invokeinterface #327 <Method boolean Iterator.hasNext()>
	//  152  344:ifeq            367
	//  153  347:aload_1         
	//  154  348:aload_3         
	//  155  349:invokeinterface #331 <Method Object Iterator.next()>
	//  156  354:checkcast       #343 <Class AdBreakClipInfo>
	//  157  357:invokevirtual   #344 <Method JSONObject AdBreakClipInfo.toJson()>
	//  158  360:invokevirtual   #335 <Method JSONArray JSONArray.put(Object)>
	//  159  363:pop             
	//* 160  364:goto            338
		try
		{
			jsonobject.put("breakClips", obj);
	//  161  367:aload_2         
	//  162  368:ldc2            #346 <String "breakClips">
	//  163  371:aload_1         
	//  164  372:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//  165  375:pop             
		}
	//* 166  376:aload_2         
	//* 167  377:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 168  378:astore_1        
		{
			return jsonobject;
	//  169  379:aload_2         
	//  170  380:areturn         
		}
_L12:
		return jsonobject;
_L1:
		obj = "NONE";
	//  171  381:ldc1            #142 <String "NONE">
	//  172  383:astore_1        
		  goto _L13
	//* 173  384:goto            44
_L3:
		obj = "LIVE";
	//  174  387:ldc1            #152 <String "LIVE">
	//  175  389:astore_1        
		  goto _L13
	//* 176  390:goto            44
		obj = "BUFFERED";
	//  177  393:ldc1            #150 <String "BUFFERED">
	//  178  395:astore_1        
		  goto _L13
	//* 179  396:goto            44
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		String s;
		if(zzp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field JSONObject zzp>
	//*   2    4:ifnonnull       13
			s = null;
	//    3    7:aconst_null     
	//    4    8:astore          4
		else
	//*   5   10:goto            22
			s = zzp.toString();
	//    6   13:aload_0         
	//    7   14:getfield        #121 <Field JSONObject zzp>
	//    8   17:invokevirtual   #351 <Method String JSONObject.toString()>
	//    9   20:astore          4
		zzj = s;
	//   10   22:aload_0         
	//   11   23:aload           4
	//   12   25:putfield        #116 <Field String zzj>
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//   13   28:aload_1         
	//   14   29:invokestatic    #357 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   15   32:istore_3        
		SafeParcelWriter.writeString(parcel, 2, getContentId(), false);
	//   16   33:aload_1         
	//   17   34:iconst_2        
	//   18   35:aload_0         
	//   19   36:invokevirtual   #359 <Method String getContentId()>
	//   20   39:iconst_0        
	//   21   40:invokestatic    #363 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, getStreamType());
	//   22   43:aload_1         
	//   23   44:iconst_3        
	//   24   45:aload_0         
	//   25   46:invokevirtual   #365 <Method int getStreamType()>
	//   26   49:invokestatic    #369 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 4, getContentType(), false);
	//   27   52:aload_1         
	//   28   53:iconst_4        
	//   29   54:aload_0         
	//   30   55:invokevirtual   #371 <Method String getContentType()>
	//   31   58:iconst_0        
	//   32   59:invokestatic    #363 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 5, ((android.os.Parcelable) (getMetadata())), i, false);
	//   33   62:aload_1         
	//   34   63:iconst_5        
	//   35   64:aload_0         
	//   36   65:invokevirtual   #373 <Method MediaMetadata getMetadata()>
	//   37   68:iload_2         
	//   38   69:iconst_0        
	//   39   70:invokestatic    #377 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeLong(parcel, 6, getStreamDuration());
	//   40   73:aload_1         
	//   41   74:bipush          6
	//   42   76:aload_0         
	//   43   77:invokevirtual   #379 <Method long getStreamDuration()>
	//   44   80:invokestatic    #383 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeTypedList(parcel, 7, getMediaTracks(), false);
	//   45   83:aload_1         
	//   46   84:bipush          7
	//   47   86:aload_0         
	//   48   87:invokevirtual   #385 <Method List getMediaTracks()>
	//   49   90:iconst_0        
	//   50   91:invokestatic    #389 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 8, ((android.os.Parcelable) (getTextTrackStyle())), i, false);
	//   51   94:aload_1         
	//   52   95:bipush          8
	//   53   97:aload_0         
	//   54   98:invokevirtual   #391 <Method TextTrackStyle getTextTrackStyle()>
	//   55  101:iload_2         
	//   56  102:iconst_0        
	//   57  103:invokestatic    #377 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 9, zzj, false);
	//   58  106:aload_1         
	//   59  107:bipush          9
	//   60  109:aload_0         
	//   61  110:getfield        #116 <Field String zzj>
	//   62  113:iconst_0        
	//   63  114:invokestatic    #363 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 10, getAdBreaks(), false);
	//   64  117:aload_1         
	//   65  118:bipush          10
	//   66  120:aload_0         
	//   67  121:invokevirtual   #393 <Method List getAdBreaks()>
	//   68  124:iconst_0        
	//   69  125:invokestatic    #389 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 11, getAdBreakClips(), false);
	//   70  128:aload_1         
	//   71  129:bipush          11
	//   72  131:aload_0         
	//   73  132:invokevirtual   #395 <Method List getAdBreakClips()>
	//   74  135:iconst_0        
	//   75  136:invokestatic    #389 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 12, getEntity(), false);
	//   76  139:aload_1         
	//   77  140:bipush          12
	//   78  142:aload_0         
	//   79  143:invokevirtual   #397 <Method String getEntity()>
	//   80  146:iconst_0        
	//   81  147:invokestatic    #363 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   82  150:aload_1         
	//   83  151:iload_3         
	//   84  152:invokestatic    #400 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   85  155:return          
	}

	final void zza(long l)
		throws IllegalArgumentException
	{
		if(l < 0L && l != -1L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            25
	//*   4    6:lload_1         
	//*   5    7:ldc2w           #29  <Long -1L>
	//*   6   10:lcmp            
	//*   7   11:ifeq            25
		{
			throw new IllegalArgumentException("Invalid stream duration");
	//    8   14:new             #86  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc2            #403 <String "Invalid stream duration">
	//   11   21:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   12   24:athrow          
		} else
		{
			zzdc = l;
	//   13   25:aload_0         
	//   14   26:lload_1         
	//   15   27:putfield        #110 <Field long zzdc>
			return;
	//   16   30:return          
		}
	}

	final void zza(MediaMetadata mediametadata)
	{
		zzdb = mediametadata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field MediaMetadata zzdb>
	//    3    5:return          
	}

	final void zza(List list)
	{
		zzdd = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field List zzdd>
	//    3    5:return          
	}

	public final void zzb(List list)
	{
		zzdf = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field List zzdf>
	//    3    5:return          
	}

	final void zzc(List list)
	{
		zzdg = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field List zzdg>
	//    3    5:return          
	}

	public final void zzd(String s)
	{
		zzdh = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #127 <Field String zzdh>
	//    3    5:return          
	}

	final void zzd(JSONObject jsonobject)
		throws JSONException
	{
		boolean flag;
label0:
		{
			boolean flag1 = jsonobject.has("breaks");
	//    0    0:aload_1         
	//    1    1:ldc2            #341 <String "breaks">
	//    2    4:invokevirtual   #164 <Method boolean JSONObject.has(String)>
	//    3    7:istore          4
			flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
			if(!flag1)
				break label0;
	//    6   11:iload           4
	//    7   13:ifeq            96
			JSONArray jsonarray = jsonobject.getJSONArray("breaks");
	//    8   16:aload_1         
	//    9   17:ldc2            #341 <String "breaks">
	//   10   20:invokevirtual   #211 <Method JSONArray JSONObject.getJSONArray(String)>
	//   11   23:astore          5
			zzdf = ((List) (new ArrayList(jsonarray.length())));
	//   12   25:aload_0         
	//   13   26:new             #206 <Class ArrayList>
	//   14   29:dup             
	//   15   30:aload           5
	//   16   32:invokevirtual   #217 <Method int JSONArray.length()>
	//   17   35:invokespecial   #412 <Method void ArrayList(int)>
	//   18   38:putfield        #123 <Field List zzdf>
			int i = 0;
	//   19   41:iconst_0        
	//   20   42:istore_2        
			do
			{
				if(i >= jsonarray.length())
					break label0;
	//   21   43:iload_2         
	//   22   44:aload           5
	//   23   46:invokevirtual   #217 <Method int JSONArray.length()>
	//   24   49:icmpge          96
				AdBreakInfo adbreakinfo = AdBreakInfo.zzb(jsonarray.getJSONObject(i));
	//   25   52:aload           5
	//   26   54:iload_2         
	//   27   55:invokevirtual   #222 <Method JSONObject JSONArray.getJSONObject(int)>
	//   28   58:invokestatic    #415 <Method AdBreakInfo AdBreakInfo.zzb(JSONObject)>
	//   29   61:astore          6
				if(adbreakinfo == null)
					break;
	//   30   63:aload           6
	//   31   65:ifnull          87
				zzdf.add(((Object) (adbreakinfo)));
	//   32   68:aload_0         
	//   33   69:getfield        #123 <Field List zzdf>
	//   34   72:aload           6
	//   35   74:invokeinterface #229 <Method boolean List.add(Object)>
	//   36   79:pop             
				i++;
	//   37   80:iload_2         
	//   38   81:iconst_1        
	//   39   82:iadd            
	//   40   83:istore_2        
			} while(true);
	//   41   84:goto            43
			zzdf.clear();
	//   42   87:aload_0         
	//   43   88:getfield        #123 <Field List zzdf>
	//   44   91:invokeinterface #418 <Method void List.clear()>
		}
label1:
		{
			if(!jsonobject.has("breakClips"))
				break label1;
	//   45   96:aload_1         
	//   46   97:ldc2            #346 <String "breakClips">
	//   47  100:invokevirtual   #164 <Method boolean JSONObject.has(String)>
	//   48  103:ifeq            182
			jsonobject = ((JSONObject) (jsonobject.getJSONArray("breakClips")));
	//   49  106:aload_1         
	//   50  107:ldc2            #346 <String "breakClips">
	//   51  110:invokevirtual   #211 <Method JSONArray JSONObject.getJSONArray(String)>
	//   52  113:astore_1        
			zzdg = ((List) (new ArrayList(((JSONArray) (jsonobject)).length())));
	//   53  114:aload_0         
	//   54  115:new             #206 <Class ArrayList>
	//   55  118:dup             
	//   56  119:aload_1         
	//   57  120:invokevirtual   #217 <Method int JSONArray.length()>
	//   58  123:invokespecial   #412 <Method void ArrayList(int)>
	//   59  126:putfield        #125 <Field List zzdg>
			int j = ((int) (flag));
	//   60  129:iload_3         
	//   61  130:istore_2        
			do
			{
				if(j >= ((JSONArray) (jsonobject)).length())
					break label1;
	//   62  131:iload_2         
	//   63  132:aload_1         
	//   64  133:invokevirtual   #217 <Method int JSONArray.length()>
	//   65  136:icmpge          182
				AdBreakClipInfo adbreakclipinfo = AdBreakClipInfo.zza(((JSONArray) (jsonobject)).getJSONObject(j));
	//   66  139:aload_1         
	//   67  140:iload_2         
	//   68  141:invokevirtual   #222 <Method JSONObject JSONArray.getJSONObject(int)>
	//   69  144:invokestatic    #421 <Method AdBreakClipInfo AdBreakClipInfo.zza(JSONObject)>
	//   70  147:astore          5
				if(adbreakclipinfo == null)
					break;
	//   71  149:aload           5
	//   72  151:ifnull          173
				zzdg.add(((Object) (adbreakclipinfo)));
	//   73  154:aload_0         
	//   74  155:getfield        #125 <Field List zzdg>
	//   75  158:aload           5
	//   76  160:invokeinterface #229 <Method boolean List.add(Object)>
	//   77  165:pop             
				j++;
	//   78  166:iload_2         
	//   79  167:iconst_1        
	//   80  168:iadd            
	//   81  169:istore_2        
			} while(true);
	//   82  170:goto            131
			zzdg.clear();
	//   83  173:aload_0         
	//   84  174:getfield        #125 <Field List zzdg>
	//   85  177:invokeinterface #418 <Method void List.clear()>
		}
	//   86  182:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzai();
	public static final int STREAM_TYPE_BUFFERED = 1;
	public static final int STREAM_TYPE_INVALID = -1;
	public static final int STREAM_TYPE_LIVE = 2;
	public static final int STREAM_TYPE_NONE = 0;
	public static final long UNKNOWN_DURATION = -1L;
	private int streamType;
	private String zzda;
	private MediaMetadata zzdb;
	private long zzdc;
	private List zzdd;
	private TextTrackStyle zzde;
	private List zzdf;
	private List zzdg;
	private String zzdh;
	private String zzj;
	private final String zzk;
	private JSONObject zzp;

	static 
	{
	//    0    0:new             #77  <Class zzai>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void zzai()>
	//    3    7:putstatic       #82  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
