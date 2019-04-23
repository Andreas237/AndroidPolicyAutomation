// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.l;
import com.google.android.gms.internal.cast.aj;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			v, MediaMetadata, MediaTrack, TextTrackStyle, 
//			VastAdsRequest, AdBreakInfo, AdBreakClipInfo

public class MediaInfo extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	MediaInfo(String s)
	{
		this(s, -1, ((String) (null)), ((MediaMetadata) (null)), -1L, ((List) (null)), ((TextTrackStyle) (null)), ((String) (null)), ((List) (null)), ((List) (null)), ((String) (null)), ((VastAdsRequest) (null)), -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:ldc2w           #42  <Long -1L>
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:aconst_null     
	//   11   13:aconst_null     
	//   12   14:aconst_null     
	//   13   15:ldc2w           #42  <Long -1L>
	//   14   18:invokespecial   #46  <Method void MediaInfo(String, int, String, MediaMetadata, long, List, TextTrackStyle, String, List, List, String, VastAdsRequest, long)>
		if(s != null)
	//*  15   21:aload_1         
	//*  16   22:ifnull          26
			return;
	//   17   25:return          
		else
			throw new IllegalArgumentException("contentID cannot be null");
	//   18   26:new             #48  <Class IllegalArgumentException>
	//   19   29:dup             
	//   20   30:ldc1            #50  <String "contentID cannot be null">
	//   21   32:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   22   35:athrow          
	}

	MediaInfo(String s, int i1, String s1, MediaMetadata mediametadata, long l1, List list, 
			TextTrackStyle texttrackstyle, String s2, List list1, List list2, String s3, VastAdsRequest vastadsrequest, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #57  <Field String a>
		b = i1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #59  <Field int b>
		c = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #61  <Field String c>
		d = mediametadata;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #63  <Field MediaMetadata d>
		e = l1;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #65  <Field long e>
		f = list;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #67  <Field List f>
		g = texttrackstyle;
	//   20   37:aload_0         
	//   21   38:aload           8
	//   22   40:putfield        #69  <Field TextTrackStyle g>
		h = s2;
	//   23   43:aload_0         
	//   24   44:aload           9
	//   25   46:putfield        #71  <Field String h>
		s = h;
	//   26   49:aload_0         
	//   27   50:getfield        #71  <Field String h>
	//   28   53:astore_1        
		if(s != null)
	//*  29   54:aload_1         
	//*  30   55:ifnull          86
			try
			{
				n = new JSONObject(s);
	//   31   58:aload_0         
	//   32   59:new             #73  <Class JSONObject>
	//   33   62:dup             
	//   34   63:aload_1         
	//   35   64:invokespecial   #74  <Method void JSONObject(String)>
	//   36   67:putfield        #76  <Field JSONObject n>
			}
	//*  37   70:goto            91
	//*  38   73:aload_0         
	//*  39   74:aconst_null     
	//*  40   75:putfield        #76  <Field JSONObject n>
	//*  41   78:aload_0         
	//*  42   79:aconst_null     
	//*  43   80:putfield        #71  <Field String h>
	//*  44   83:goto            91
	//*  45   86:aload_0         
	//*  46   87:aconst_null     
	//*  47   88:putfield        #76  <Field JSONObject n>
	//*  48   91:aload_0         
	//*  49   92:aload           10
	//*  50   94:putfield        #78  <Field List i>
	//*  51   97:aload_0         
	//*  52   98:aload           11
	//*  53  100:putfield        #80  <Field List j>
	//*  54  103:aload_0         
	//*  55  104:aload           12
	//*  56  106:putfield        #82  <Field String k>
	//*  57  109:aload_0         
	//*  58  110:aload           13
	//*  59  112:putfield        #84  <Field VastAdsRequest l>
	//*  60  115:aload_0         
	//*  61  116:lload           14
	//*  62  118:putfield        #86  <Field long m>
	//*  63  121:return          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				n = null;
				h = null;
			}
		else
			n = null;
		i = list1;
		j = list2;
		k = s3;
		l = vastadsrequest;
		m = l2;
	//*  64  122:astore_1        
	//*  65  123:goto            73
	}

	MediaInfo(JSONObject jsonobject)
	{
		this(jsonobject.getString("contentId"), -1, ((String) (null)), ((MediaMetadata) (null)), -1L, ((List) (null)), ((TextTrackStyle) (null)), ((String) (null)), ((List) (null)), ((List) (null)), ((String) (null)), ((VastAdsRequest) (null)), -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #89  <String "contentId">
	//    3    4:invokevirtual   #93  <Method String JSONObject.getString(String)>
	//    4    7:iconst_m1       
	//    5    8:aconst_null     
	//    6    9:aconst_null     
	//    7   10:ldc2w           #42  <Long -1L>
	//    8   13:aconst_null     
	//    9   14:aconst_null     
	//   10   15:aconst_null     
	//   11   16:aconst_null     
	//   12   17:aconst_null     
	//   13   18:aconst_null     
	//   14   19:aconst_null     
	//   15   20:ldc2w           #42  <Long -1L>
	//   16   23:invokespecial   #46  <Method void MediaInfo(String, int, String, MediaMetadata, long, List, TextTrackStyle, String, List, List, String, VastAdsRequest, long)>
		String s = jsonobject.getString("streamType");
	//   17   26:aload_1         
	//   18   27:ldc1            #95  <String "streamType">
	//   19   29:invokevirtual   #93  <Method String JSONObject.getString(String)>
	//   20   32:astore          7
		boolean flag = "NONE".equals(((Object) (s)));
	//   21   34:ldc1            #97  <String "NONE">
	//   22   36:aload           7
	//   23   38:invokevirtual   #103 <Method boolean String.equals(Object)>
	//   24   41:istore          5
		int i1 = 0;
	//   25   43:iconst_0        
	//   26   44:istore          4
		if(flag)
	//*  27   46:iload           5
	//*  28   48:ifeq            59
		{
			b = 0;
	//   29   51:aload_0         
	//   30   52:iconst_0        
	//   31   53:putfield        #59  <Field int b>
		} else
	//*  32   56:goto            106
		{
			MediaInfo mediainfo = this;
	//   33   59:aload_0         
	//   34   60:astore          6
			if("BUFFERED".equals(((Object) (s))))
	//*  35   62:ldc1            #105 <String "BUFFERED">
	//*  36   64:aload           7
	//*  37   66:invokevirtual   #103 <Method boolean String.equals(Object)>
	//*  38   69:ifeq            81
				mediainfo.b = 1;
	//   39   72:aload           6
	//   40   74:iconst_1        
	//   41   75:putfield        #59  <Field int b>
			else
	//*  42   78:goto            106
			if("LIVE".equals(((Object) (s))))
	//*  43   81:ldc1            #107 <String "LIVE">
	//*  44   83:aload           7
	//*  45   85:invokevirtual   #103 <Method boolean String.equals(Object)>
	//*  46   88:ifeq            100
				mediainfo.b = 2;
	//   47   91:aload           6
	//   48   93:iconst_2        
	//   49   94:putfield        #59  <Field int b>
			else
	//*  50   97:goto            106
				mediainfo.b = -1;
	//   51  100:aload           6
	//   52  102:iconst_m1       
	//   53  103:putfield        #59  <Field int b>
		}
		MediaInfo mediainfo1 = this;
	//   54  106:aload_0         
	//   55  107:astore          6
		mediainfo1.c = jsonobject.optString("contentType", ((String) (null)));
	//   56  109:aload           6
	//   57  111:aload_1         
	//   58  112:ldc1            #109 <String "contentType">
	//   59  114:aconst_null     
	//   60  115:invokevirtual   #113 <Method String JSONObject.optString(String, String)>
	//   61  118:putfield        #61  <Field String c>
		if(jsonobject.has("metadata"))
	//*  62  121:aload_1         
	//*  63  122:ldc1            #115 <String "metadata">
	//*  64  124:invokevirtual   #119 <Method boolean JSONObject.has(String)>
	//*  65  127:ifeq            167
		{
			JSONObject jsonobject1 = jsonobject.getJSONObject("metadata");
	//   66  130:aload_1         
	//   67  131:ldc1            #115 <String "metadata">
	//   68  133:invokevirtual   #123 <Method JSONObject JSONObject.getJSONObject(String)>
	//   69  136:astore          7
			mediainfo1.d = new MediaMetadata(jsonobject1.getInt("metadataType"));
	//   70  138:aload           6
	//   71  140:new             #125 <Class MediaMetadata>
	//   72  143:dup             
	//   73  144:aload           7
	//   74  146:ldc1            #127 <String "metadataType">
	//   75  148:invokevirtual   #131 <Method int JSONObject.getInt(String)>
	//   76  151:invokespecial   #134 <Method void MediaMetadata(int)>
	//   77  154:putfield        #63  <Field MediaMetadata d>
			mediainfo1.d.a(jsonobject1);
	//   78  157:aload           6
	//   79  159:getfield        #63  <Field MediaMetadata d>
	//   80  162:aload           7
	//   81  164:invokevirtual   #136 <Method void MediaMetadata.a(JSONObject)>
		}
		mediainfo1.e = -1L;
	//   82  167:aload           6
	//   83  169:ldc2w           #42  <Long -1L>
	//   84  172:putfield        #65  <Field long e>
		if(jsonobject.has("duration") && !jsonobject.isNull("duration"))
	//*  85  175:aload_1         
	//*  86  176:ldc1            #138 <String "duration">
	//*  87  178:invokevirtual   #119 <Method boolean JSONObject.has(String)>
	//*  88  181:ifeq            226
	//*  89  184:aload_1         
	//*  90  185:ldc1            #138 <String "duration">
	//*  91  187:invokevirtual   #141 <Method boolean JSONObject.isNull(String)>
	//*  92  190:ifne            226
		{
			double d1 = jsonobject.optDouble("duration", 0.0D);
	//   93  193:aload_1         
	//   94  194:ldc1            #138 <String "duration">
	//   95  196:dconst_0        
	//   96  197:invokevirtual   #145 <Method double JSONObject.optDouble(String, double)>
	//   97  200:dstore_2        
			if(!Double.isNaN(d1) && !Double.isInfinite(d1))
	//*  98  201:dload_2         
	//*  99  202:invokestatic    #151 <Method boolean Double.isNaN(double)>
	//* 100  205:ifne            226
	//* 101  208:dload_2         
	//* 102  209:invokestatic    #154 <Method boolean Double.isInfinite(double)>
	//* 103  212:ifne            226
				mediainfo1.e = (long)(d1 * 1000D);
	//  104  215:aload           6
	//  105  217:dload_2         
	//  106  218:ldc2w           #155 <Double 1000D>
	//  107  221:dmul            
	//  108  222:d2l             
	//  109  223:putfield        #65  <Field long e>
		}
		if(jsonobject.has("tracks"))
	//* 110  226:aload_1         
	//* 111  227:ldc1            #158 <String "tracks">
	//* 112  229:invokevirtual   #119 <Method boolean JSONObject.has(String)>
	//* 113  232:ifeq            303
		{
			mediainfo1.f = ((List) (new ArrayList()));
	//  114  235:aload           6
	//  115  237:new             #160 <Class ArrayList>
	//  116  240:dup             
	//  117  241:invokespecial   #161 <Method void ArrayList()>
	//  118  244:putfield        #67  <Field List f>
			for(JSONArray jsonarray = jsonobject.getJSONArray("tracks"); i1 < jsonarray.length(); i1++)
	//* 119  247:aload_1         
	//* 120  248:ldc1            #158 <String "tracks">
	//* 121  250:invokevirtual   #165 <Method JSONArray JSONObject.getJSONArray(String)>
	//* 122  253:astore          7
	//* 123  255:iload           4
	//* 124  257:aload           7
	//* 125  259:invokevirtual   #171 <Method int JSONArray.length()>
	//* 126  262:icmpge          309
			{
				MediaTrack mediatrack = new MediaTrack(jsonarray.getJSONObject(i1));
	//  127  265:new             #173 <Class MediaTrack>
	//  128  268:dup             
	//  129  269:aload           7
	//  130  271:iload           4
	//  131  273:invokevirtual   #176 <Method JSONObject JSONArray.getJSONObject(int)>
	//  132  276:invokespecial   #178 <Method void MediaTrack(JSONObject)>
	//  133  279:astore          8
				mediainfo1.f.add(((Object) (mediatrack)));
	//  134  281:aload           6
	//  135  283:getfield        #67  <Field List f>
	//  136  286:aload           8
	//  137  288:invokeinterface #183 <Method boolean List.add(Object)>
	//  138  293:pop             
			}

	//  139  294:iload           4
	//  140  296:iconst_1        
	//  141  297:iadd            
	//  142  298:istore          4
		} else
	//* 143  300:goto            255
		{
			mediainfo1.f = null;
	//  144  303:aload           6
	//  145  305:aconst_null     
	//  146  306:putfield        #67  <Field List f>
		}
		if(jsonobject.has("textTrackStyle"))
	//* 147  309:aload_1         
	//* 148  310:ldc1            #185 <String "textTrackStyle">
	//* 149  312:invokevirtual   #119 <Method boolean JSONObject.has(String)>
	//* 150  315:ifeq            352
		{
			JSONObject jsonobject2 = jsonobject.getJSONObject("textTrackStyle");
	//  151  318:aload_1         
	//  152  319:ldc1            #185 <String "textTrackStyle">
	//  153  321:invokevirtual   #123 <Method JSONObject JSONObject.getJSONObject(String)>
	//  154  324:astore          7
			TextTrackStyle texttrackstyle = new TextTrackStyle();
	//  155  326:new             #187 <Class TextTrackStyle>
	//  156  329:dup             
	//  157  330:invokespecial   #188 <Method void TextTrackStyle()>
	//  158  333:astore          8
			texttrackstyle.a(jsonobject2);
	//  159  335:aload           8
	//  160  337:aload           7
	//  161  339:invokevirtual   #189 <Method void TextTrackStyle.a(JSONObject)>
			mediainfo1.g = texttrackstyle;
	//  162  342:aload           6
	//  163  344:aload           8
	//  164  346:putfield        #69  <Field TextTrackStyle g>
		} else
	//* 165  349:goto            358
		{
			mediainfo1.g = null;
	//  166  352:aload           6
	//  167  354:aconst_null     
	//  168  355:putfield        #69  <Field TextTrackStyle g>
		}
		a(jsonobject);
	//  169  358:aload_0         
	//  170  359:aload_1         
	//  171  360:invokevirtual   #190 <Method void a(JSONObject)>
		mediainfo1.n = jsonobject.optJSONObject("customData");
	//  172  363:aload           6
	//  173  365:aload_1         
	//  174  366:ldc1            #192 <String "customData">
	//  175  368:invokevirtual   #195 <Method JSONObject JSONObject.optJSONObject(String)>
	//  176  371:putfield        #76  <Field JSONObject n>
		if(jsonobject.has("entity"))
	//* 177  374:aload_1         
	//* 178  375:ldc1            #197 <String "entity">
	//* 179  377:invokevirtual   #119 <Method boolean JSONObject.has(String)>
	//* 180  380:ifeq            394
			mediainfo1.k = jsonobject.getString("entity");
	//  181  383:aload           6
	//  182  385:aload_1         
	//  183  386:ldc1            #197 <String "entity">
	//  184  388:invokevirtual   #93  <Method String JSONObject.getString(String)>
	//  185  391:putfield        #82  <Field String k>
		mediainfo1.l = VastAdsRequest.a(jsonobject.optJSONObject("vmapAdsRequest"));
	//  186  394:aload           6
	//  187  396:aload_1         
	//  188  397:ldc1            #199 <String "vmapAdsRequest">
	//  189  399:invokevirtual   #195 <Method JSONObject JSONObject.optJSONObject(String)>
	//  190  402:invokestatic    #204 <Method VastAdsRequest VastAdsRequest.a(JSONObject)>
	//  191  405:putfield        #84  <Field VastAdsRequest l>
	//  192  408:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String a>
	//    2    4:areturn         
	}

	final void a(int i1)
	{
		if(i1 >= -1 && i1 <= 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmplt          16
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:icmpgt          16
		{
			b = i1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #59  <Field int b>
			return;
	//    9   15:return          
		} else
		{
			throw new IllegalArgumentException("invalid stream type");
	//   10   16:new             #48  <Class IllegalArgumentException>
	//   11   19:dup             
	//   12   20:ldc1            #207 <String "invalid stream type">
	//   13   22:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   14   25:athrow          
		}
	}

	final void a(long l1)
	{
		if(l1 < 0L && l1 != -1L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            27
	//*   4    6:lload_1         
	//*   5    7:ldc2w           #42  <Long -1L>
	//*   6   10:lcmp            
	//*   7   11:ifne            17
	//*   8   14:goto            27
		{
			throw new IllegalArgumentException("Invalid stream duration");
	//    9   17:new             #48  <Class IllegalArgumentException>
	//   10   20:dup             
	//   11   21:ldc1            #210 <String "Invalid stream duration">
	//   12   23:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   13   26:athrow          
		} else
		{
			e = l1;
	//   14   27:aload_0         
	//   15   28:lload_1         
	//   16   29:putfield        #65  <Field long e>
			return;
	//   17   32:return          
		}
	}

	final void a(MediaMetadata mediametadata)
	{
		d = mediametadata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field MediaMetadata d>
	//    3    5:return          
	}

	final void a(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field String c>
	//    3    5:return          
	}

	public final void a(List list)
	{
		i = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field List i>
	//    3    5:return          
	}

	final void a(JSONObject jsonobject)
	{
		boolean flag;
label0:
		{
			boolean flag1 = jsonobject.has("breaks");
	//    0    0:aload_1         
	//    1    1:ldc1            #214 <String "breaks">
	//    2    3:invokevirtual   #119 <Method boolean JSONObject.has(String)>
	//    3    6:istore          4
			flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_3        
			if(!flag1)
				break label0;
	//    6   10:iload           4
	//    7   12:ifeq            94
			JSONArray jsonarray = jsonobject.getJSONArray("breaks");
	//    8   15:aload_1         
	//    9   16:ldc1            #214 <String "breaks">
	//   10   18:invokevirtual   #165 <Method JSONArray JSONObject.getJSONArray(String)>
	//   11   21:astore          5
			i = ((List) (new ArrayList(jsonarray.length())));
	//   12   23:aload_0         
	//   13   24:new             #160 <Class ArrayList>
	//   14   27:dup             
	//   15   28:aload           5
	//   16   30:invokevirtual   #171 <Method int JSONArray.length()>
	//   17   33:invokespecial   #215 <Method void ArrayList(int)>
	//   18   36:putfield        #78  <Field List i>
			int i1 = 0;
	//   19   39:iconst_0        
	//   20   40:istore_2        
			do
			{
				if(i1 >= jsonarray.length())
					break label0;
	//   21   41:iload_2         
	//   22   42:aload           5
	//   23   44:invokevirtual   #171 <Method int JSONArray.length()>
	//   24   47:icmpge          94
				AdBreakInfo adbreakinfo = AdBreakInfo.a(jsonarray.getJSONObject(i1));
	//   25   50:aload           5
	//   26   52:iload_2         
	//   27   53:invokevirtual   #176 <Method JSONObject JSONArray.getJSONObject(int)>
	//   28   56:invokestatic    #220 <Method AdBreakInfo AdBreakInfo.a(JSONObject)>
	//   29   59:astore          6
				if(adbreakinfo == null)
					break;
	//   30   61:aload           6
	//   31   63:ifnull          85
				i.add(((Object) (adbreakinfo)));
	//   32   66:aload_0         
	//   33   67:getfield        #78  <Field List i>
	//   34   70:aload           6
	//   35   72:invokeinterface #183 <Method boolean List.add(Object)>
	//   36   77:pop             
				i1++;
	//   37   78:iload_2         
	//   38   79:iconst_1        
	//   39   80:iadd            
	//   40   81:istore_2        
			} while(true);
	//   41   82:goto            41
			i.clear();
	//   42   85:aload_0         
	//   43   86:getfield        #78  <Field List i>
	//   44   89:invokeinterface #223 <Method void List.clear()>
		}
		if(jsonobject.has("breakClips"))
	//*  45   94:aload_1         
	//*  46   95:ldc1            #225 <String "breakClips">
	//*  47   97:invokevirtual   #119 <Method boolean JSONObject.has(String)>
	//*  48  100:ifeq            179
		{
			jsonobject = ((JSONObject) (jsonobject.getJSONArray("breakClips")));
	//   49  103:aload_1         
	//   50  104:ldc1            #225 <String "breakClips">
	//   51  106:invokevirtual   #165 <Method JSONArray JSONObject.getJSONArray(String)>
	//   52  109:astore_1        
			j = ((List) (new ArrayList(((JSONArray) (jsonobject)).length())));
	//   53  110:aload_0         
	//   54  111:new             #160 <Class ArrayList>
	//   55  114:dup             
	//   56  115:aload_1         
	//   57  116:invokevirtual   #171 <Method int JSONArray.length()>
	//   58  119:invokespecial   #215 <Method void ArrayList(int)>
	//   59  122:putfield        #80  <Field List j>
			for(int j1 = ((int) (flag)); j1 < ((JSONArray) (jsonobject)).length();)
	//*  60  125:iload_3         
	//*  61  126:istore_2        
	//*  62  127:iload_2         
	//*  63  128:aload_1         
	//*  64  129:invokevirtual   #171 <Method int JSONArray.length()>
	//*  65  132:icmpge          179
			{
				AdBreakClipInfo adbreakclipinfo = AdBreakClipInfo.a(((JSONArray) (jsonobject)).getJSONObject(j1));
	//   66  135:aload_1         
	//   67  136:iload_2         
	//   68  137:invokevirtual   #176 <Method JSONObject JSONArray.getJSONObject(int)>
	//   69  140:invokestatic    #230 <Method AdBreakClipInfo AdBreakClipInfo.a(JSONObject)>
	//   70  143:astore          5
				if(adbreakclipinfo != null)
	//*  71  145:aload           5
	//*  72  147:ifnull          169
				{
					j.add(((Object) (adbreakclipinfo)));
	//   73  150:aload_0         
	//   74  151:getfield        #80  <Field List j>
	//   75  154:aload           5
	//   76  156:invokeinterface #183 <Method boolean List.add(Object)>
	//   77  161:pop             
					j1++;
	//   78  162:iload_2         
	//   79  163:iconst_1        
	//   80  164:iadd            
	//   81  165:istore_2        
				} else
	//*  82  166:goto            127
				{
					j.clear();
	//   83  169:aload_0         
	//   84  170:getfield        #80  <Field List j>
	//   85  173:invokeinterface #223 <Method void List.clear()>
					return;
	//   86  178:return          
				}
			}

		}
	//   87  179:return          
	}

	public int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int b>
	//    2    4:ireturn         
	}

	public String c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String c>
	//    2    4:areturn         
	}

	public MediaMetadata d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field MediaMetadata d>
	//    2    4:areturn         
	}

	public long e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field long e>
	//    2    4:lreturn         
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
		if(n == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #76  <Field JSONObject n>
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
		if(((MediaInfo) (obj)).n == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #76  <Field JSONObject n>
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
		JSONObject jsonobject = n;
	//   34   56:aload_0         
	//   35   57:getfield        #76  <Field JSONObject n>
	//   36   60:astore          4
		if(jsonobject != null)
	//*  37   62:aload           4
	//*  38   64:ifnull          90
		{
			JSONObject jsonobject1 = ((MediaInfo) (obj)).n;
	//   39   67:aload_1         
	//   40   68:getfield        #76  <Field JSONObject n>
	//   41   71:astore          5
			if(jsonobject1 != null && !com.google.android.gms.common.util.l.a(((Object) (jsonobject)), ((Object) (jsonobject1))))
	//*  42   73:aload           5
	//*  43   75:ifnull          90
	//*  44   78:aload           4
	//*  45   80:aload           5
	//*  46   82:invokestatic    #237 <Method boolean l.a(Object, Object)>
	//*  47   85:ifne            90
				return false;
	//   48   88:iconst_0        
	//   49   89:ireturn         
		}
		return aj.a(((Object) (a)), ((Object) (((MediaInfo) (obj)).a))) && b == ((MediaInfo) (obj)).b && aj.a(((Object) (c)), ((Object) (((MediaInfo) (obj)).c))) && aj.a(((Object) (d)), ((Object) (((MediaInfo) (obj)).d))) && e == ((MediaInfo) (obj)).e && aj.a(((Object) (f)), ((Object) (((MediaInfo) (obj)).f))) && aj.a(((Object) (g)), ((Object) (((MediaInfo) (obj)).g))) && aj.a(((Object) (i)), ((Object) (((MediaInfo) (obj)).i))) && aj.a(((Object) (j)), ((Object) (((MediaInfo) (obj)).j))) && aj.a(((Object) (k)), ((Object) (((MediaInfo) (obj)).k))) && aj.a(((Object) (l)), ((Object) (((MediaInfo) (obj)).l))) && m == ((MediaInfo) (obj)).m;
	//   50   90:aload_0         
	//   51   91:getfield        #57  <Field String a>
	//   52   94:aload_1         
	//   53   95:getfield        #57  <Field String a>
	//   54   98:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//   55  101:ifeq            253
	//   56  104:aload_0         
	//   57  105:getfield        #59  <Field int b>
	//   58  108:aload_1         
	//   59  109:getfield        #59  <Field int b>
	//   60  112:icmpne          253
	//   61  115:aload_0         
	//   62  116:getfield        #61  <Field String c>
	//   63  119:aload_1         
	//   64  120:getfield        #61  <Field String c>
	//   65  123:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//   66  126:ifeq            253
	//   67  129:aload_0         
	//   68  130:getfield        #63  <Field MediaMetadata d>
	//   69  133:aload_1         
	//   70  134:getfield        #63  <Field MediaMetadata d>
	//   71  137:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//   72  140:ifeq            253
	//   73  143:aload_0         
	//   74  144:getfield        #65  <Field long e>
	//   75  147:aload_1         
	//   76  148:getfield        #65  <Field long e>
	//   77  151:lcmp            
	//   78  152:ifne            253
	//   79  155:aload_0         
	//   80  156:getfield        #67  <Field List f>
	//   81  159:aload_1         
	//   82  160:getfield        #67  <Field List f>
	//   83  163:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//   84  166:ifeq            253
	//   85  169:aload_0         
	//   86  170:getfield        #69  <Field TextTrackStyle g>
	//   87  173:aload_1         
	//   88  174:getfield        #69  <Field TextTrackStyle g>
	//   89  177:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//   90  180:ifeq            253
	//   91  183:aload_0         
	//   92  184:getfield        #78  <Field List i>
	//   93  187:aload_1         
	//   94  188:getfield        #78  <Field List i>
	//   95  191:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//   96  194:ifeq            253
	//   97  197:aload_0         
	//   98  198:getfield        #80  <Field List j>
	//   99  201:aload_1         
	//  100  202:getfield        #80  <Field List j>
	//  101  205:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//  102  208:ifeq            253
	//  103  211:aload_0         
	//  104  212:getfield        #82  <Field String k>
	//  105  215:aload_1         
	//  106  216:getfield        #82  <Field String k>
	//  107  219:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//  108  222:ifeq            253
	//  109  225:aload_0         
	//  110  226:getfield        #84  <Field VastAdsRequest l>
	//  111  229:aload_1         
	//  112  230:getfield        #84  <Field VastAdsRequest l>
	//  113  233:invokestatic    #240 <Method boolean aj.a(Object, Object)>
	//  114  236:ifeq            253
	//  115  239:aload_0         
	//  116  240:getfield        #86  <Field long m>
	//  117  243:aload_1         
	//  118  244:getfield        #86  <Field long m>
	//  119  247:lcmp            
	//  120  248:ifne            253
	//  121  251:iconst_1        
	//  122  252:ireturn         
	//  123  253:iconst_0        
	//  124  254:ireturn         
	}

	public List f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List f>
	//    2    4:areturn         
	}

	public TextTrackStyle g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field TextTrackStyle g>
	//    2    4:areturn         
	}

	public List h()
	{
		List list = i;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field List i>
	//    2    4:astore_1        
		if(list == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return Collections.unmodifiableList(list);
	//    7   11:aload_1         
	//    8   12:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//    9   15:areturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			a, Integer.valueOf(b), c, d, Long.valueOf(e), String.valueOf(((Object) (n))), f, g, i, j, 
			k, l, Long.valueOf(m)
		});
	//    0    0:bipush          13
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #57  <Field String a>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #59  <Field int b>
	//   11   18:invokestatic    #257 <Method Integer Integer.valueOf(int)>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:aload_0         
	//   16   25:getfield        #61  <Field String c>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #63  <Field MediaMetadata d>
	//   22   35:aastore         
	//   23   36:dup             
	//   24   37:iconst_4        
	//   25   38:aload_0         
	//   26   39:getfield        #65  <Field long e>
	//   27   42:invokestatic    #262 <Method Long Long.valueOf(long)>
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_5        
	//   31   48:aload_0         
	//   32   49:getfield        #76  <Field JSONObject n>
	//   33   52:invokestatic    #265 <Method String String.valueOf(Object)>
	//   34   55:aastore         
	//   35   56:dup             
	//   36   57:bipush          6
	//   37   59:aload_0         
	//   38   60:getfield        #67  <Field List f>
	//   39   63:aastore         
	//   40   64:dup             
	//   41   65:bipush          7
	//   42   67:aload_0         
	//   43   68:getfield        #69  <Field TextTrackStyle g>
	//   44   71:aastore         
	//   45   72:dup             
	//   46   73:bipush          8
	//   47   75:aload_0         
	//   48   76:getfield        #78  <Field List i>
	//   49   79:aastore         
	//   50   80:dup             
	//   51   81:bipush          9
	//   52   83:aload_0         
	//   53   84:getfield        #80  <Field List j>
	//   54   87:aastore         
	//   55   88:dup             
	//   56   89:bipush          10
	//   57   91:aload_0         
	//   58   92:getfield        #82  <Field String k>
	//   59   95:aastore         
	//   60   96:dup             
	//   61   97:bipush          11
	//   62   99:aload_0         
	//   63  100:getfield        #84  <Field VastAdsRequest l>
	//   64  103:aastore         
	//   65  104:dup             
	//   66  105:bipush          12
	//   67  107:aload_0         
	//   68  108:getfield        #86  <Field long m>
	//   69  111:invokestatic    #262 <Method Long Long.valueOf(long)>
	//   70  114:aastore         
	//   71  115:invokestatic    #270 <Method int ak.a(Object[])>
	//   72  118:ireturn         
	}

	public List i()
	{
		List list = j;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field List j>
	//    2    4:astore_1        
		if(list == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return Collections.unmodifiableList(list);
	//    7   11:aload_1         
	//    8   12:invokestatic    #248 <Method List Collections.unmodifiableList(List)>
	//    9   15:areturn         
	}

	public String j()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String k>
	//    2    4:areturn         
	}

	public VastAdsRequest k()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field VastAdsRequest l>
	//    2    4:areturn         
	}

	public final JSONObject l()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #73  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #273 <Method void JSONObject()>
	//    3    7:astore          6
		jsonobject.put("contentId", ((Object) (a)));
	//    4    9:aload           6
	//    5   11:ldc1            #89  <String "contentId">
	//    6   13:aload_0         
	//    7   14:getfield        #57  <Field String a>
	//    8   17:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//    9   20:pop             
		b;
	//   10   21:aload_0         
	//   11   22:getfield        #59  <Field int b>
		JVM INSTR tableswitch 1 2: default 489
	//	               1 503
	//	               2 496;
	//   12   25:tableswitch     1 2: default 489
	//	               1 503
	//	               2 496
		   goto _L1 _L2 _L3
_L2:
		break MISSING_BLOCK_LABEL_503;
_L15:
		Object obj;
		jsonobject.put("streamType", obj);
	//   13   48:aload           6
	//   14   50:ldc1            #95  <String "streamType">
	//   15   52:aload           5
	//   16   54:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//   17   57:pop             
		if(c != null)
	//*  18   58:aload_0         
	//*  19   59:getfield        #61  <Field String c>
	//*  20   62:ifnull          77
			jsonobject.put("contentType", ((Object) (c)));
	//   21   65:aload           6
	//   22   67:ldc1            #109 <String "contentType">
	//   23   69:aload_0         
	//   24   70:getfield        #61  <Field String c>
	//   25   73:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//   26   76:pop             
		if(d != null)
	//*  27   77:aload_0         
	//*  28   78:getfield        #63  <Field MediaMetadata d>
	//*  29   81:ifnull          99
			jsonobject.put("metadata", ((Object) (d.c())));
	//   30   84:aload           6
	//   31   86:ldc1            #115 <String "metadata">
	//   32   88:aload_0         
	//   33   89:getfield        #63  <Field MediaMetadata d>
	//   34   92:invokevirtual   #279 <Method JSONObject com.google.android.gms.cast.MediaMetadata.c()>
	//   35   95:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//   36   98:pop             
		if(e > -1L) goto _L5; else goto _L4
	//   37   99:aload_0         
	//   38  100:getfield        #65  <Field long e>
	//   39  103:ldc2w           #42  <Long -1L>
	//   40  106:lcmp            
	//   41  107:ifgt            124
_L4:
		jsonobject.put("duration", JSONObject.NULL);
	//   42  110:aload           6
	//   43  112:ldc1            #138 <String "duration">
	//   44  114:getstatic       #283 <Field Object JSONObject.NULL>
	//   45  117:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//   46  120:pop             
		  goto _L6
	//*  47  121:goto            152
_L5:
		double d1;
		long l1;
		Iterator iterator;
		try
		{
			l1 = e;
	//   48  124:aload_0         
	//   49  125:getfield        #65  <Field long e>
	//   50  128:lstore_3        
		}
	//*  51  129:lload_3         
	//*  52  130:l2d             
	//*  53  131:dstore_1        
	//*  54  132:dload_1         
	//*  55  133:invokestatic    #151 <Method boolean Double.isNaN(double)>
	//*  56  136:pop             
	//*  57  137:dload_1         
	//*  58  138:ldc2w           #155 <Double 1000D>
	//*  59  141:ddiv            
	//*  60  142:dstore_1        
	//*  61  143:aload           6
	//*  62  145:ldc1            #138 <String "duration">
	//*  63  147:dload_1         
	//*  64  148:invokevirtual   #286 <Method JSONObject JSONObject.put(String, double)>
	//*  65  151:pop             
	//*  66  152:aload_0         
	//*  67  153:getfield        #67  <Field List f>
	//*  68  156:ifnull          221
	//*  69  159:new             #167 <Class JSONArray>
	//*  70  162:dup             
	//*  71  163:invokespecial   #287 <Method void JSONArray()>
	//*  72  166:astore          5
	//*  73  168:aload_0         
	//*  74  169:getfield        #67  <Field List f>
	//*  75  172:invokeinterface #291 <Method Iterator List.iterator()>
	//*  76  177:astore          7
	//*  77  179:aload           7
	//*  78  181:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//*  79  186:ifeq            211
	//*  80  189:aload           5
	//*  81  191:aload           7
	//*  82  193:invokeinterface #301 <Method Object Iterator.next()>
	//*  83  198:checkcast       #173 <Class MediaTrack>
	//*  84  201:invokevirtual   #303 <Method JSONObject MediaTrack.h()>
	//*  85  204:invokevirtual   #306 <Method JSONArray JSONArray.put(Object)>
	//*  86  207:pop             
	//*  87  208:goto            179
	//*  88  211:aload           6
	//*  89  213:ldc1            #158 <String "tracks">
	//*  90  215:aload           5
	//*  91  217:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//*  92  220:pop             
	//*  93  221:aload_0         
	//*  94  222:getfield        #69  <Field TextTrackStyle g>
	//*  95  225:ifnull          243
	//*  96  228:aload           6
	//*  97  230:ldc1            #185 <String "textTrackStyle">
	//*  98  232:aload_0         
	//*  99  233:getfield        #69  <Field TextTrackStyle g>
	//* 100  236:invokevirtual   #308 <Method JSONObject com.google.android.gms.cast.TextTrackStyle.l()>
	//* 101  239:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 102  242:pop             
	//* 103  243:aload_0         
	//* 104  244:getfield        #76  <Field JSONObject n>
	//* 105  247:ifnull          262
	//* 106  250:aload           6
	//* 107  252:ldc1            #192 <String "customData">
	//* 108  254:aload_0         
	//* 109  255:getfield        #76  <Field JSONObject n>
	//* 110  258:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 111  261:pop             
	//* 112  262:aload_0         
	//* 113  263:getfield        #82  <Field String k>
	//* 114  266:ifnull          281
	//* 115  269:aload           6
	//* 116  271:ldc1            #197 <String "entity">
	//* 117  273:aload_0         
	//* 118  274:getfield        #82  <Field String k>
	//* 119  277:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 120  280:pop             
	//* 121  281:aload_0         
	//* 122  282:getfield        #78  <Field List i>
	//* 123  285:ifnull          350
	//* 124  288:new             #167 <Class JSONArray>
	//* 125  291:dup             
	//* 126  292:invokespecial   #287 <Method void JSONArray()>
	//* 127  295:astore          5
	//* 128  297:aload_0         
	//* 129  298:getfield        #78  <Field List i>
	//* 130  301:invokeinterface #291 <Method Iterator List.iterator()>
	//* 131  306:astore          7
	//* 132  308:aload           7
	//* 133  310:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//* 134  315:ifeq            340
	//* 135  318:aload           5
	//* 136  320:aload           7
	//* 137  322:invokeinterface #301 <Method Object Iterator.next()>
	//* 138  327:checkcast       #217 <Class AdBreakInfo>
	//* 139  330:invokevirtual   #310 <Method JSONObject AdBreakInfo.g()>
	//* 140  333:invokevirtual   #306 <Method JSONArray JSONArray.put(Object)>
	//* 141  336:pop             
	//* 142  337:goto            308
	//* 143  340:aload           6
	//* 144  342:ldc1            #214 <String "breaks">
	//* 145  344:aload           5
	//* 146  346:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 147  349:pop             
	//* 148  350:aload_0         
	//* 149  351:getfield        #80  <Field List j>
	//* 150  354:ifnull          419
	//* 151  357:new             #167 <Class JSONArray>
	//* 152  360:dup             
	//* 153  361:invokespecial   #287 <Method void JSONArray()>
	//* 154  364:astore          5
	//* 155  366:aload_0         
	//* 156  367:getfield        #80  <Field List j>
	//* 157  370:invokeinterface #291 <Method Iterator List.iterator()>
	//* 158  375:astore          7
	//* 159  377:aload           7
	//* 160  379:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//* 161  384:ifeq            409
	//* 162  387:aload           5
	//* 163  389:aload           7
	//* 164  391:invokeinterface #301 <Method Object Iterator.next()>
	//* 165  396:checkcast       #227 <Class AdBreakClipInfo>
	//* 166  399:invokevirtual   #311 <Method JSONObject com.google.android.gms.cast.AdBreakClipInfo.l()>
	//* 167  402:invokevirtual   #306 <Method JSONArray JSONArray.put(Object)>
	//* 168  405:pop             
	//* 169  406:goto            377
	//* 170  409:aload           6
	//* 171  411:ldc1            #225 <String "breakClips">
	//* 172  413:aload           5
	//* 173  415:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 174  418:pop             
	//* 175  419:aload_0         
	//* 176  420:getfield        #84  <Field VastAdsRequest l>
	//* 177  423:ifnull          441
	//* 178  426:aload           6
	//* 179  428:ldc1            #199 <String "vmapAdsRequest">
	//* 180  430:aload_0         
	//* 181  431:getfield        #84  <Field VastAdsRequest l>
	//* 182  434:invokevirtual   #312 <Method JSONObject com.google.android.gms.cast.VastAdsRequest.c()>
	//* 183  437:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 184  440:pop             
	//* 185  441:aload_0         
	//* 186  442:getfield        #86  <Field long m>
	//* 187  445:ldc2w           #42  <Long -1L>
	//* 188  448:lcmp            
	//* 189  449:ifeq            481
	//* 190  452:aload_0         
	//* 191  453:getfield        #86  <Field long m>
	//* 192  456:lstore_3        
	//* 193  457:lload_3         
	//* 194  458:l2d             
	//* 195  459:dstore_1        
	//* 196  460:dload_1         
	//* 197  461:invokestatic    #151 <Method boolean Double.isNaN(double)>
	//* 198  464:pop             
	//* 199  465:dload_1         
	//* 200  466:ldc2w           #155 <Double 1000D>
	//* 201  469:ddiv            
	//* 202  470:dstore_1        
	//* 203  471:aload           6
	//* 204  473:ldc2            #314 <String "startAbsoluteTime">
	//* 205  476:dload_1         
	//* 206  477:invokevirtual   #286 <Method JSONObject JSONObject.put(String, double)>
	//* 207  480:pop             
	//* 208  481:aload           6
	//* 209  483:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 210  484:astore          5
		{
			return jsonobject;
	//  211  486:aload           6
	//  212  488:areturn         
		}
		d1 = l1;
		Double.isNaN(d1);
		d1 /= 1000D;
		jsonobject.put("duration", d1);
_L6:
		if(f == null) goto _L8; else goto _L7
_L7:
		obj = ((Object) (new JSONArray()));
		for(iterator = f.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((Object) (((MediaTrack)iterator.next()).h()))));
		jsonobject.put("tracks", obj);
_L8:
		if(g != null)
			jsonobject.put("textTrackStyle", ((Object) (g.l())));
		if(n != null)
			jsonobject.put("customData", ((Object) (n)));
		if(k != null)
			jsonobject.put("entity", ((Object) (k)));
		if(i == null) goto _L10; else goto _L9
_L9:
		obj = ((Object) (new JSONArray()));
		for(iterator = i.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((Object) (((AdBreakInfo)iterator.next()).g()))));
		jsonobject.put("breaks", obj);
_L10:
		if(j == null) goto _L12; else goto _L11
_L11:
		obj = ((Object) (new JSONArray()));
		for(iterator = j.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((Object) (((AdBreakClipInfo)iterator.next()).l()))));
		jsonobject.put("breakClips", obj);
_L12:
		if(l != null)
			jsonobject.put("vmapAdsRequest", ((Object) (l.c())));
		if(m == -1L) goto _L14; else goto _L13
_L13:
		l1 = m;
		d1 = l1;
		Double.isNaN(d1);
		d1 /= 1000D;
		jsonobject.put("startAbsoluteTime", d1);
_L14:
		return jsonobject;
_L1:
		obj = "NONE";
	//  213  489:ldc1            #97  <String "NONE">
	//  214  491:astore          5
		  goto _L15
	//* 215  493:goto            48
_L3:
		obj = "LIVE";
	//  216  496:ldc1            #107 <String "LIVE">
	//  217  498:astore          5
		  goto _L15
	//* 218  500:goto            48
		obj = "BUFFERED";
	//  219  503:ldc1            #105 <String "BUFFERED">
	//  220  505:astore          5
		  goto _L15
	//* 221  507:goto            48
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		Object obj = ((Object) (n));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JSONObject n>
	//    2    4:astore          4
		if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       17
			obj = null;
	//    5   11:aconst_null     
	//    6   12:astore          4
		else
	//*   7   14:goto            24
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//    8   17:aload           4
	//    9   19:invokevirtual   #319 <Method String JSONObject.toString()>
	//   10   22:astore          4
		h = ((String) (obj));
	//   11   24:aload_0         
	//   12   25:aload           4
	//   13   27:putfield        #71  <Field String h>
		int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//   14   30:aload_1         
	//   15   31:invokestatic    #324 <Method int c.a(Parcel)>
	//   16   34:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//   17   35:aload_1         
	//   18   36:iconst_2        
	//   19   37:aload_0         
	//   20   38:invokevirtual   #326 <Method String a()>
	//   21   41:iconst_0        
	//   22   42:invokestatic    #329 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   23   45:aload_1         
	//   24   46:iconst_3        
	//   25   47:aload_0         
	//   26   48:invokevirtual   #331 <Method int b()>
	//   27   51:invokestatic    #334 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c(), false);
	//   28   54:aload_1         
	//   29   55:iconst_4        
	//   30   56:aload_0         
	//   31   57:invokevirtual   #336 <Method String c()>
	//   32   60:iconst_0        
	//   33   61:invokestatic    #329 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ((android.os.Parcelable) (d())), i1, false);
	//   34   64:aload_1         
	//   35   65:iconst_5        
	//   36   66:aload_0         
	//   37   67:invokevirtual   #338 <Method MediaMetadata d()>
	//   38   70:iload_2         
	//   39   71:iconst_0        
	//   40   72:invokestatic    #341 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e());
	//   41   75:aload_1         
	//   42   76:bipush          6
	//   43   78:aload_0         
	//   44   79:invokevirtual   #343 <Method long e()>
	//   45   82:invokestatic    #346 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 7, f(), false);
	//   46   85:aload_1         
	//   47   86:bipush          7
	//   48   88:aload_0         
	//   49   89:invokevirtual   #348 <Method List f()>
	//   50   92:iconst_0        
	//   51   93:invokestatic    #351 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, ((android.os.Parcelable) (g())), i1, false);
	//   52   96:aload_1         
	//   53   97:bipush          8
	//   54   99:aload_0         
	//   55  100:invokevirtual   #353 <Method TextTrackStyle g()>
	//   56  103:iload_2         
	//   57  104:iconst_0        
	//   58  105:invokestatic    #341 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h, false);
	//   59  108:aload_1         
	//   60  109:bipush          9
	//   61  111:aload_0         
	//   62  112:getfield        #71  <Field String h>
	//   63  115:iconst_0        
	//   64  116:invokestatic    #329 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 10, h(), false);
	//   65  119:aload_1         
	//   66  120:bipush          10
	//   67  122:aload_0         
	//   68  123:invokevirtual   #355 <Method List h()>
	//   69  126:iconst_0        
	//   70  127:invokestatic    #351 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 11, i(), false);
	//   71  130:aload_1         
	//   72  131:bipush          11
	//   73  133:aload_0         
	//   74  134:invokevirtual   #357 <Method List i()>
	//   75  137:iconst_0        
	//   76  138:invokestatic    #351 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, j(), false);
	//   77  141:aload_1         
	//   78  142:bipush          12
	//   79  144:aload_0         
	//   80  145:invokevirtual   #359 <Method String j()>
	//   81  148:iconst_0        
	//   82  149:invokestatic    #329 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, ((android.os.Parcelable) (k())), i1, false);
	//   83  152:aload_1         
	//   84  153:bipush          13
	//   85  155:aload_0         
	//   86  156:invokevirtual   #361 <Method VastAdsRequest k()>
	//   87  159:iload_2         
	//   88  160:iconst_0        
	//   89  161:invokestatic    #341 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, m);
	//   90  164:aload_1         
	//   91  165:bipush          14
	//   92  167:aload_0         
	//   93  168:getfield        #86  <Field long m>
	//   94  171:invokestatic    #346 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
	//   95  174:aload_1         
	//   96  175:iload_3         
	//   97  176:invokestatic    #363 <Method void c.a(Parcel, int)>
	//   98  179:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new v();
	private final String a;
	private int b;
	private String c;
	private MediaMetadata d;
	private long e;
	private List f;
	private TextTrackStyle g;
	private String h;
	private List i;
	private List j;
	private String k;
	private VastAdsRequest l;
	private long m;
	private JSONObject n;

	static 
	{
	//    0    0:new             #34  <Class v>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void v()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
