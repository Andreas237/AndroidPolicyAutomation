// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzcu;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			zzao

public final class MediaTrack extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static class Builder
	{

		public MediaTrack build()
		{
			return zzet;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaTrack zzet>
		//    2    4:areturn         
		}

		public Builder setContentId(String s)
		{
			zzet.setContentId(s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaTrack zzet>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #30  <Method void MediaTrack.setContentId(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setContentType(String s)
		{
			zzet.setContentType(s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaTrack zzet>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #33  <Method void MediaTrack.setContentType(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setCustomData(JSONObject jsonobject)
		{
			zzet.setCustomData(jsonobject);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaTrack zzet>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #38  <Method void MediaTrack.setCustomData(JSONObject)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setLanguage(String s)
		{
			zzet.setLanguage(s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaTrack zzet>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #41  <Method void MediaTrack.setLanguage(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setLanguage(Locale locale)
		{
			zzet.setLanguage(zzcu.zza(locale));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaTrack zzet>
		//    2    4:aload_1         
		//    3    5:invokestatic    #48  <Method String zzcu.zza(Locale)>
		//    4    8:invokevirtual   #41  <Method void MediaTrack.setLanguage(String)>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public Builder setName(String s)
		{
			zzet.setName(s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaTrack zzet>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #51  <Method void MediaTrack.setName(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setSubtype(int i)
			throws IllegalArgumentException
		{
			zzet.zzb(i);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaTrack zzet>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #57  <Method void MediaTrack.zzb(int)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private final MediaTrack zzet;

		public Builder(long l, int i)
			throws IllegalArgumentException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzet = new MediaTrack(l, i);
		//    2    4:aload_0         
		//    3    5:new             #6   <Class MediaTrack>
		//    4    8:dup             
		//    5    9:lload_1         
		//    6   10:iload_3         
		//    7   11:invokespecial   #19  <Method void MediaTrack(long, int)>
		//    8   14:putfield        #21  <Field MediaTrack zzet>
		//    9   17:return          
		}
	}


	MediaTrack(long l, int i)
		throws IllegalArgumentException
	{
		this(0L, 0, ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)), -1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:iconst_m1       
	//    8    8:aconst_null     
	//    9    9:invokespecial   #77  <Method void MediaTrack(long, int, String, String, String, String, int, String)>
		id = l;
	//   10   12:aload_0         
	//   11   13:lload_1         
	//   12   14:putfield        #79  <Field long id>
		if(i > 0 && i <= 3)
	//*  13   17:iload_3         
	//*  14   18:ifle            35
	//*  15   21:iload_3         
	//*  16   22:iconst_3        
	//*  17   23:icmple          29
	//*  18   26:goto            35
		{
			type = i;
	//   19   29:aload_0         
	//   20   30:iload_3         
	//   21   31:putfield        #81  <Field int type>
			return;
	//   22   34:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(24);
	//   23   35:new             #83  <Class StringBuilder>
	//   24   38:dup             
	//   25   39:bipush          24
	//   26   41:invokespecial   #86  <Method void StringBuilder(int)>
	//   27   44:astore          4
			stringbuilder.append("invalid type ");
	//   28   46:aload           4
	//   29   48:ldc1            #88  <String "invalid type ">
	//   30   50:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   31   53:pop             
			stringbuilder.append(i);
	//   32   54:aload           4
	//   33   56:iload_3         
	//   34   57:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   35   60:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   36   61:new             #74  <Class IllegalArgumentException>
	//   37   64:dup             
	//   38   65:aload           4
	//   39   67:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   40   70:invokespecial   #102 <Method void IllegalArgumentException(String)>
	//   41   73:athrow          
		}
	}

	MediaTrack(long l, int i, String s, String s1, String s2, String s3, 
			int j, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void AbstractSafeParcelable()>
		id = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #79  <Field long id>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #81  <Field int type>
		zzk = s;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #110 <Field String zzk>
		zzda = s1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #112 <Field String zzda>
		name = s2;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #114 <Field String name>
		zzcy = s3;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #116 <Field String zzcy>
		zzes = j;
	//   20   38:aload_0         
	//   21   39:iload           8
	//   22   41:putfield        #118 <Field int zzes>
		zzj = s4;
	//   23   44:aload_0         
	//   24   45:aload           9
	//   25   47:putfield        #120 <Field String zzj>
		if(zzj != null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #120 <Field String zzj>
	//*  28   54:ifnull          84
		{
			try
			{
				zzp = new JSONObject(zzj);
	//   29   57:aload_0         
	//   30   58:new             #122 <Class JSONObject>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:getfield        #120 <Field String zzj>
	//   34   66:invokespecial   #123 <Method void JSONObject(String)>
	//   35   69:putfield        #125 <Field JSONObject zzp>
				return;
	//   36   72:return          
			}
	//*  37   73:aload_0         
	//*  38   74:aconst_null     
	//*  39   75:putfield        #125 <Field JSONObject zzp>
	//*  40   78:aload_0         
	//*  41   79:aconst_null     
	//*  42   80:putfield        #120 <Field String zzj>
	//*  43   83:return          
	//*  44   84:aload_0         
	//*  45   85:aconst_null     
	//*  46   86:putfield        #125 <Field JSONObject zzp>
	//*  47   89:return          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				zzp = null;
			}
			zzj = null;
			return;
		} else
		{
			zzp = null;
			return;
		}
	//*  48   90:astore          4
	//*  49   92:goto            73
	}

	MediaTrack(JSONObject jsonobject)
		throws JSONException
	{
		String s;
label0:
		{
label1:
			{
				this(0L, 0, ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)), -1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:iconst_m1       
	//    8    8:aconst_null     
	//    9    9:invokespecial   #77  <Method void MediaTrack(long, int, String, String, String, String, int, String)>
				id = jsonobject.getLong("trackId");
	//   10   12:aload_0         
	//   11   13:aload_1         
	//   12   14:ldc1            #130 <String "trackId">
	//   13   16:invokevirtual   #134 <Method long JSONObject.getLong(String)>
	//   14   19:putfield        #79  <Field long id>
				s = jsonobject.getString("type");
	//   15   22:aload_1         
	//   16   23:ldc1            #135 <String "type">
	//   17   25:invokevirtual   #139 <Method String JSONObject.getString(String)>
	//   18   28:astore_3        
				if("TEXT".equals(((Object) (s))))
	//*  19   29:ldc1            #141 <String "TEXT">
	//*  20   31:aload_3         
	//*  21   32:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  22   35:ifeq            46
					type = 1;
	//   23   38:aload_0         
	//   24   39:iconst_1        
	//   25   40:putfield        #81  <Field int type>
				else
	//*  26   43:goto            77
				if("AUDIO".equals(((Object) (s))))
	//*  27   46:ldc1            #149 <String "AUDIO">
	//*  28   48:aload_3         
	//*  29   49:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  30   52:ifeq            63
				{
					type = 2;
	//   31   55:aload_0         
	//   32   56:iconst_2        
	//   33   57:putfield        #81  <Field int type>
				} else
	//*  34   60:goto            77
				{
					if(!"VIDEO".equals(((Object) (s))))
						break label0;
	//   35   63:ldc1            #151 <String "VIDEO">
	//   36   65:aload_3         
	//   37   66:invokevirtual   #147 <Method boolean String.equals(Object)>
	//   38   69:ifeq            275
					type = 3;
	//   39   72:aload_0         
	//   40   73:iconst_3        
	//   41   74:putfield        #81  <Field int type>
				}
				zzk = jsonobject.optString("trackContentId", ((String) (null)));
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:ldc1            #153 <String "trackContentId">
	//   45   81:aconst_null     
	//   46   82:invokevirtual   #157 <Method String JSONObject.optString(String, String)>
	//   47   85:putfield        #110 <Field String zzk>
				zzda = jsonobject.optString("trackContentType", ((String) (null)));
	//   48   88:aload_0         
	//   49   89:aload_1         
	//   50   90:ldc1            #159 <String "trackContentType">
	//   51   92:aconst_null     
	//   52   93:invokevirtual   #157 <Method String JSONObject.optString(String, String)>
	//   53   96:putfield        #112 <Field String zzda>
				name = jsonobject.optString("name", ((String) (null)));
	//   54   99:aload_0         
	//   55  100:aload_1         
	//   56  101:ldc1            #160 <String "name">
	//   57  103:aconst_null     
	//   58  104:invokevirtual   #157 <Method String JSONObject.optString(String, String)>
	//   59  107:putfield        #114 <Field String name>
				zzcy = jsonobject.optString("language", ((String) (null)));
	//   60  110:aload_0         
	//   61  111:aload_1         
	//   62  112:ldc1            #162 <String "language">
	//   63  114:aconst_null     
	//   64  115:invokevirtual   #157 <Method String JSONObject.optString(String, String)>
	//   65  118:putfield        #116 <Field String zzcy>
				int i;
				if(jsonobject.has("subtype"))
	//*  66  121:aload_1         
	//*  67  122:ldc1            #164 <String "subtype">
	//*  68  124:invokevirtual   #168 <Method boolean JSONObject.has(String)>
	//*  69  127:ifeq            257
				{
					s = jsonobject.getString("subtype");
	//   70  130:aload_1         
	//   71  131:ldc1            #164 <String "subtype">
	//   72  133:invokevirtual   #139 <Method String JSONObject.getString(String)>
	//   73  136:astore_3        
					if("SUBTITLES".equals(((Object) (s))))
	//*  74  137:ldc1            #170 <String "SUBTITLES">
	//*  75  139:aload_3         
	//*  76  140:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  77  143:ifeq            154
					{
						zzes = 1;
	//   78  146:aload_0         
	//   79  147:iconst_1        
	//   80  148:putfield        #118 <Field int zzes>
						break label1;
	//   81  151:goto            264
					}
					if("CAPTIONS".equals(((Object) (s))))
	//*  82  154:ldc1            #172 <String "CAPTIONS">
	//*  83  156:aload_3         
	//*  84  157:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  85  160:ifeq            171
					{
						zzes = 2;
	//   86  163:aload_0         
	//   87  164:iconst_2        
	//   88  165:putfield        #118 <Field int zzes>
						break label1;
	//   89  168:goto            264
					}
					if("DESCRIPTIONS".equals(((Object) (s))))
	//*  90  171:ldc1            #174 <String "DESCRIPTIONS">
	//*  91  173:aload_3         
	//*  92  174:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  93  177:ifeq            188
					{
						zzes = 3;
	//   94  180:aload_0         
	//   95  181:iconst_3        
	//   96  182:putfield        #118 <Field int zzes>
						break label1;
	//   97  185:goto            264
					}
					if("CHAPTERS".equals(((Object) (s))))
	//*  98  188:ldc1            #176 <String "CHAPTERS">
	//*  99  190:aload_3         
	//* 100  191:invokevirtual   #147 <Method boolean String.equals(Object)>
	//* 101  194:ifeq            202
						i = 4;
	//  102  197:iconst_4        
	//  103  198:istore_2        
					else
	//* 104  199:goto            259
					if("METADATA".equals(((Object) (s))))
	//* 105  202:ldc1            #178 <String "METADATA">
	//* 106  204:aload_3         
	//* 107  205:invokevirtual   #147 <Method boolean String.equals(Object)>
	//* 108  208:ifeq            216
					{
						i = 5;
	//  109  211:iconst_5        
	//  110  212:istore_2        
					} else
	//* 111  213:goto            259
					{
						jsonobject = ((JSONObject) (String.valueOf(((Object) (s)))));
	//  112  216:aload_3         
	//  113  217:invokestatic    #182 <Method String String.valueOf(Object)>
	//  114  220:astore_1        
						if(((String) (jsonobject)).length() != 0)
	//* 115  221:aload_1         
	//* 116  222:invokevirtual   #186 <Method int String.length()>
	//* 117  225:ifeq            238
							jsonobject = ((JSONObject) ("invalid subtype: ".concat(((String) (jsonobject)))));
	//  118  228:ldc1            #188 <String "invalid subtype: ">
	//  119  230:aload_1         
	//  120  231:invokevirtual   #191 <Method String String.concat(String)>
	//  121  234:astore_1        
						else
	//* 122  235:goto            248
							jsonobject = ((JSONObject) (new String("invalid subtype: ")));
	//  123  238:new             #143 <Class String>
	//  124  241:dup             
	//  125  242:ldc1            #188 <String "invalid subtype: ">
	//  126  244:invokespecial   #192 <Method void String(String)>
	//  127  247:astore_1        
						throw new JSONException(((String) (jsonobject)));
	//  128  248:new             #107 <Class JSONException>
	//  129  251:dup             
	//  130  252:aload_1         
	//  131  253:invokespecial   #193 <Method void JSONException(String)>
	//  132  256:athrow          
					}
				} else
				{
					i = 0;
	//  133  257:iconst_0        
	//  134  258:istore_2        
				}
				zzes = i;
	//  135  259:aload_0         
	//  136  260:iload_2         
	//  137  261:putfield        #118 <Field int zzes>
			}
			zzp = jsonobject.optJSONObject("customData");
	//  138  264:aload_0         
	//  139  265:aload_1         
	//  140  266:ldc1            #195 <String "customData">
	//  141  268:invokevirtual   #199 <Method JSONObject JSONObject.optJSONObject(String)>
	//  142  271:putfield        #125 <Field JSONObject zzp>
			return;
	//  143  274:return          
		}
		jsonobject = ((JSONObject) (String.valueOf(((Object) (s)))));
	//  144  275:aload_3         
	//  145  276:invokestatic    #182 <Method String String.valueOf(Object)>
	//  146  279:astore_1        
		if(((String) (jsonobject)).length() != 0)
	//* 147  280:aload_1         
	//* 148  281:invokevirtual   #186 <Method int String.length()>
	//* 149  284:ifeq            297
			jsonobject = ((JSONObject) ("invalid type: ".concat(((String) (jsonobject)))));
	//  150  287:ldc1            #201 <String "invalid type: ">
	//  151  289:aload_1         
	//  152  290:invokevirtual   #191 <Method String String.concat(String)>
	//  153  293:astore_1        
		else
	//* 154  294:goto            307
			jsonobject = ((JSONObject) (new String("invalid type: ")));
	//  155  297:new             #143 <Class String>
	//  156  300:dup             
	//  157  301:ldc1            #201 <String "invalid type: ">
	//  158  303:invokespecial   #192 <Method void String(String)>
	//  159  306:astore_1        
		throw new JSONException(((String) (jsonobject)));
	//  160  307:new             #107 <Class JSONException>
	//  161  310:dup             
	//  162  311:aload_1         
	//  163  312:invokespecial   #193 <Method void JSONException(String)>
	//  164  315:athrow          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof MediaTrack))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaTrack>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaTrack)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaTrack>
	//   12   20:astore_1        
		boolean flag;
		if(zzp == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #125 <Field JSONObject zzp>
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
		if(((MediaTrack) (obj)).zzp == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #125 <Field JSONObject zzp>
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
		if(zzp != null && ((MediaTrack) (obj)).zzp != null && !JsonUtils.areJsonValuesEquivalent(((Object) (zzp)), ((Object) (((MediaTrack) (obj)).zzp))))
	//*  34   56:aload_0         
	//*  35   57:getfield        #125 <Field JSONObject zzp>
	//*  36   60:ifnull          86
	//*  37   63:aload_1         
	//*  38   64:getfield        #125 <Field JSONObject zzp>
	//*  39   67:ifnull          86
	//*  40   70:aload_0         
	//*  41   71:getfield        #125 <Field JSONObject zzp>
	//*  42   74:aload_1         
	//*  43   75:getfield        #125 <Field JSONObject zzp>
	//*  44   78:invokestatic    #207 <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//*  45   81:ifne            86
			return false;
	//   46   84:iconst_0        
	//   47   85:ireturn         
		return id == ((MediaTrack) (obj)).id && type == ((MediaTrack) (obj)).type && zzcu.zza(((Object) (zzk)), ((Object) (((MediaTrack) (obj)).zzk))) && zzcu.zza(((Object) (zzda)), ((Object) (((MediaTrack) (obj)).zzda))) && zzcu.zza(((Object) (name)), ((Object) (((MediaTrack) (obj)).name))) && zzcu.zza(((Object) (zzcy)), ((Object) (((MediaTrack) (obj)).zzcy))) && zzes == ((MediaTrack) (obj)).zzes;
	//   48   86:aload_0         
	//   49   87:getfield        #79  <Field long id>
	//   50   90:aload_1         
	//   51   91:getfield        #79  <Field long id>
	//   52   94:lcmp            
	//   53   95:ifne            178
	//   54   98:aload_0         
	//   55   99:getfield        #81  <Field int type>
	//   56  102:aload_1         
	//   57  103:getfield        #81  <Field int type>
	//   58  106:icmpne          178
	//   59  109:aload_0         
	//   60  110:getfield        #110 <Field String zzk>
	//   61  113:aload_1         
	//   62  114:getfield        #110 <Field String zzk>
	//   63  117:invokestatic    #212 <Method boolean zzcu.zza(Object, Object)>
	//   64  120:ifeq            178
	//   65  123:aload_0         
	//   66  124:getfield        #112 <Field String zzda>
	//   67  127:aload_1         
	//   68  128:getfield        #112 <Field String zzda>
	//   69  131:invokestatic    #212 <Method boolean zzcu.zza(Object, Object)>
	//   70  134:ifeq            178
	//   71  137:aload_0         
	//   72  138:getfield        #114 <Field String name>
	//   73  141:aload_1         
	//   74  142:getfield        #114 <Field String name>
	//   75  145:invokestatic    #212 <Method boolean zzcu.zza(Object, Object)>
	//   76  148:ifeq            178
	//   77  151:aload_0         
	//   78  152:getfield        #116 <Field String zzcy>
	//   79  155:aload_1         
	//   80  156:getfield        #116 <Field String zzcy>
	//   81  159:invokestatic    #212 <Method boolean zzcu.zza(Object, Object)>
	//   82  162:ifeq            178
	//   83  165:aload_0         
	//   84  166:getfield        #118 <Field int zzes>
	//   85  169:aload_1         
	//   86  170:getfield        #118 <Field int zzes>
	//   87  173:icmpne          178
	//   88  176:iconst_1        
	//   89  177:ireturn         
	//   90  178:iconst_0        
	//   91  179:ireturn         
	}

	public final String getContentId()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field String zzk>
	//    2    4:areturn         
	}

	public final String getContentType()
	{
		return zzda;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field String zzda>
	//    2    4:areturn         
	}

	public final JSONObject getCustomData()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field JSONObject zzp>
	//    2    4:areturn         
	}

	public final long getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field long id>
	//    2    4:lreturn         
	}

	public final String getLanguage()
	{
		return zzcy;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field String zzcy>
	//    2    4:areturn         
	}

	public final String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field String name>
	//    2    4:areturn         
	}

	public final int getSubtype()
	{
		return zzes;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int zzes>
	//    2    4:ireturn         
	}

	public final int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int type>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Long.valueOf(id), Integer.valueOf(type), zzk, zzda, name, zzcy, Integer.valueOf(zzes), String.valueOf(((Object) (zzp)))
		});
	//    0    0:bipush          8
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #79  <Field long id>
	//    6   11:invokestatic    #223 <Method Long Long.valueOf(long)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #81  <Field int type>
	//   12   21:invokestatic    #228 <Method Integer Integer.valueOf(int)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #110 <Field String zzk>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #112 <Field String zzda>
	//   23   38:aastore         
	//   24   39:dup             
	//   25   40:iconst_4        
	//   26   41:aload_0         
	//   27   42:getfield        #114 <Field String name>
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_5        
	//   31   48:aload_0         
	//   32   49:getfield        #116 <Field String zzcy>
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:bipush          6
	//   36   56:aload_0         
	//   37   57:getfield        #118 <Field int zzes>
	//   38   60:invokestatic    #228 <Method Integer Integer.valueOf(int)>
	//   39   63:aastore         
	//   40   64:dup             
	//   41   65:bipush          7
	//   42   67:aload_0         
	//   43   68:getfield        #125 <Field JSONObject zzp>
	//   44   71:invokestatic    #182 <Method String String.valueOf(Object)>
	//   45   74:aastore         
	//   46   75:invokestatic    #233 <Method int Objects.hashCode(Object[])>
	//   47   78:ireturn         
	}

	public final void setContentId(String s)
	{
		zzk = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field String zzk>
	//    3    5:return          
	}

	public final void setContentType(String s)
	{
		zzda = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field String zzda>
	//    3    5:return          
	}

	final void setCustomData(JSONObject jsonobject)
	{
		zzp = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field JSONObject zzp>
	//    3    5:return          
	}

	final void setLanguage(String s)
	{
		zzcy = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field String zzcy>
	//    3    5:return          
	}

	final void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #114 <Field String name>
	//    3    5:return          
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #122 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #240 <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("trackId", id);
	//    4    8:aload_2         
	//    5    9:ldc1            #130 <String "trackId">
	//    6   11:aload_0         
	//    7   12:getfield        #79  <Field long id>
	//    8   15:invokevirtual   #244 <Method JSONObject JSONObject.put(String, long)>
	//    9   18:pop             
		type;
	//   10   19:aload_0         
	//   11   20:getfield        #81  <Field int type>
		JVM INSTR tableswitch 1 3: default 206
	//	               1 221
	//	               2 215
	//	               3 209;
	//   12   23:tableswitch     1 3: default 206
	//	               1 221
	//	               2 215
	//	               3 209
		   goto _L1 _L2 _L3 _L4
_L11:
		Object obj;
		jsonobject.put("type", obj);
	//   13   48:aload_2         
	//   14   49:ldc1            #135 <String "type">
	//   15   51:aload_1         
	//   16   52:invokevirtual   #247 <Method JSONObject JSONObject.put(String, Object)>
	//   17   55:pop             
	//*  18   56:goto            59
_L1:
		if(zzk != null)
	//*  19   59:aload_0         
	//*  20   60:getfield        #110 <Field String zzk>
	//*  21   63:ifnull          77
			jsonobject.put("trackContentId", ((Object) (zzk)));
	//   22   66:aload_2         
	//   23   67:ldc1            #153 <String "trackContentId">
	//   24   69:aload_0         
	//   25   70:getfield        #110 <Field String zzk>
	//   26   73:invokevirtual   #247 <Method JSONObject JSONObject.put(String, Object)>
	//   27   76:pop             
		if(zzda != null)
	//*  28   77:aload_0         
	//*  29   78:getfield        #112 <Field String zzda>
	//*  30   81:ifnull          95
			jsonobject.put("trackContentType", ((Object) (zzda)));
	//   31   84:aload_2         
	//   32   85:ldc1            #159 <String "trackContentType">
	//   33   87:aload_0         
	//   34   88:getfield        #112 <Field String zzda>
	//   35   91:invokevirtual   #247 <Method JSONObject JSONObject.put(String, Object)>
	//   36   94:pop             
		if(name != null)
	//*  37   95:aload_0         
	//*  38   96:getfield        #114 <Field String name>
	//*  39   99:ifnull          113
			jsonobject.put("name", ((Object) (name)));
	//   40  102:aload_2         
	//   41  103:ldc1            #160 <String "name">
	//   42  105:aload_0         
	//   43  106:getfield        #114 <Field String name>
	//   44  109:invokevirtual   #247 <Method JSONObject JSONObject.put(String, Object)>
	//   45  112:pop             
		if(!TextUtils.isEmpty(((CharSequence) (zzcy))))
	//*  46  113:aload_0         
	//*  47  114:getfield        #116 <Field String zzcy>
	//*  48  117:invokestatic    #253 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  49  120:ifne            134
			jsonobject.put("language", ((Object) (zzcy)));
	//   50  123:aload_2         
	//   51  124:ldc1            #162 <String "language">
	//   52  126:aload_0         
	//   53  127:getfield        #116 <Field String zzcy>
	//   54  130:invokevirtual   #247 <Method JSONObject JSONObject.put(String, Object)>
	//   55  133:pop             
		zzes;
	//   56  134:aload_0         
	//   57  135:getfield        #118 <Field int zzes>
		JVM INSTR tableswitch 1 5: default 227
	//	               1 254
	//	               2 248
	//	               3 242
	//	               4 236
	//	               5 230;
	//   58  138:tableswitch     1 5: default 227
	//	               1 254
	//	               2 248
	//	               3 242
	//	               4 236
	//	               5 230
		   goto _L5 _L6 _L7 _L8 _L9 _L10
_L6:
		break MISSING_BLOCK_LABEL_254;
_L12:
		jsonobject.put("subtype", obj);
	//   59  172:aload_2         
	//   60  173:ldc1            #164 <String "subtype">
	//   61  175:aload_1         
	//   62  176:invokevirtual   #247 <Method JSONObject JSONObject.put(String, Object)>
	//   63  179:pop             
	//*  64  180:goto            183
_L5:
		try
		{
			if(zzp != null)
	//*  65  183:aload_0         
	//*  66  184:getfield        #125 <Field JSONObject zzp>
	//*  67  187:ifnull          201
				jsonobject.put("customData", ((Object) (zzp)));
	//   68  190:aload_2         
	//   69  191:ldc1            #195 <String "customData">
	//   70  193:aload_0         
	//   71  194:getfield        #125 <Field JSONObject zzp>
	//   72  197:invokevirtual   #247 <Method JSONObject JSONObject.put(String, Object)>
	//   73  200:pop             
		}
	//*  74  201:aload_2         
	//*  75  202:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  76  203:astore_1        
		{
			return jsonobject;
	//   77  204:aload_2         
	//   78  205:areturn         
		}
		return jsonobject;
	//*  79  206:goto            59
_L4:
		obj = "VIDEO";
	//   80  209:ldc1            #151 <String "VIDEO">
	//   81  211:astore_1        
		  goto _L11
	//*  82  212:goto            48
_L3:
		obj = "AUDIO";
	//   83  215:ldc1            #149 <String "AUDIO">
	//   84  217:astore_1        
		  goto _L11
	//*  85  218:goto            48
_L2:
		obj = "TEXT";
	//   86  221:ldc1            #141 <String "TEXT">
	//   87  223:astore_1        
		  goto _L11
	//*  88  224:goto            48
	//*  89  227:goto            183
_L10:
		obj = "METADATA";
	//   90  230:ldc1            #178 <String "METADATA">
	//   91  232:astore_1        
		  goto _L12
	//*  92  233:goto            172
_L9:
		obj = "CHAPTERS";
	//   93  236:ldc1            #176 <String "CHAPTERS">
	//   94  238:astore_1        
		  goto _L12
	//*  95  239:goto            172
_L8:
		obj = "DESCRIPTIONS";
	//   96  242:ldc1            #174 <String "DESCRIPTIONS">
	//   97  244:astore_1        
		  goto _L12
	//*  98  245:goto            172
_L7:
		obj = "CAPTIONS";
	//   99  248:ldc1            #172 <String "CAPTIONS">
	//  100  250:astore_1        
		  goto _L12
	//* 101  251:goto            172
		obj = "SUBTITLES";
	//  102  254:ldc1            #170 <String "SUBTITLES">
	//  103  256:astore_1        
		  goto _L12
	//* 104  257:goto            172
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		String s;
		if(zzp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field JSONObject zzp>
	//*   2    4:ifnonnull       12
			s = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
		else
	//*   5    9:goto            20
			s = zzp.toString();
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field JSONObject zzp>
	//    8   16:invokevirtual   #256 <Method String JSONObject.toString()>
	//    9   19:astore_3        
		zzj = s;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #120 <Field String zzj>
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//   13   25:aload_1         
	//   14   26:invokestatic    #262 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   15   29:istore_2        
		SafeParcelWriter.writeLong(parcel, 2, getId());
	//   16   30:aload_1         
	//   17   31:iconst_2        
	//   18   32:aload_0         
	//   19   33:invokevirtual   #264 <Method long getId()>
	//   20   36:invokestatic    #268 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeInt(parcel, 3, getType());
	//   21   39:aload_1         
	//   22   40:iconst_3        
	//   23   41:aload_0         
	//   24   42:invokevirtual   #270 <Method int getType()>
	//   25   45:invokestatic    #274 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 4, getContentId(), false);
	//   26   48:aload_1         
	//   27   49:iconst_4        
	//   28   50:aload_0         
	//   29   51:invokevirtual   #276 <Method String getContentId()>
	//   30   54:iconst_0        
	//   31   55:invokestatic    #280 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getContentType(), false);
	//   32   58:aload_1         
	//   33   59:iconst_5        
	//   34   60:aload_0         
	//   35   61:invokevirtual   #282 <Method String getContentType()>
	//   36   64:iconst_0        
	//   37   65:invokestatic    #280 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getName(), false);
	//   38   68:aload_1         
	//   39   69:bipush          6
	//   40   71:aload_0         
	//   41   72:invokevirtual   #284 <Method String getName()>
	//   42   75:iconst_0        
	//   43   76:invokestatic    #280 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getLanguage(), false);
	//   44   79:aload_1         
	//   45   80:bipush          7
	//   46   82:aload_0         
	//   47   83:invokevirtual   #286 <Method String getLanguage()>
	//   48   86:iconst_0        
	//   49   87:invokestatic    #280 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 8, getSubtype());
	//   50   90:aload_1         
	//   51   91:bipush          8
	//   52   93:aload_0         
	//   53   94:invokevirtual   #288 <Method int getSubtype()>
	//   54   97:invokestatic    #274 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 9, zzj, false);
	//   55  100:aload_1         
	//   56  101:bipush          9
	//   57  103:aload_0         
	//   58  104:getfield        #120 <Field String zzj>
	//   59  107:iconst_0        
	//   60  108:invokestatic    #280 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   61  111:aload_1         
	//   62  112:iload_2         
	//   63  113:invokestatic    #291 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   64  116:return          
	}

	final void zzb(int i)
		throws IllegalArgumentException
	{
		if(i >= 0 && i <= 5)
	//*   0    0:iload_1         
	//*   1    1:iflt            41
	//*   2    4:iload_1         
	//*   3    5:iconst_5        
	//*   4    6:icmple          12
	//*   5    9:goto            41
		{
			if(i != 0 && type != 1)
	//*   6   12:iload_1         
	//*   7   13:ifeq            35
	//*   8   16:aload_0         
	//*   9   17:getfield        #81  <Field int type>
	//*  10   20:iconst_1        
	//*  11   21:icmpeq          35
			{
				throw new IllegalArgumentException("subtypes are only valid for text tracks");
	//   12   24:new             #74  <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:ldc2            #294 <String "subtypes are only valid for text tracks">
	//   15   31:invokespecial   #102 <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
			} else
			{
				zzes = i;
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:putfield        #118 <Field int zzes>
				return;
	//   20   40:return          
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(27);
	//   21   41:new             #83  <Class StringBuilder>
	//   22   44:dup             
	//   23   45:bipush          27
	//   24   47:invokespecial   #86  <Method void StringBuilder(int)>
	//   25   50:astore_2        
			stringbuilder.append("invalid subtype ");
	//   26   51:aload_2         
	//   27   52:ldc2            #296 <String "invalid subtype ">
	//   28   55:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			stringbuilder.append(i);
	//   30   59:aload_2         
	//   31   60:iload_1         
	//   32   61:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   33   64:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   34   65:new             #74  <Class IllegalArgumentException>
	//   35   68:dup             
	//   36   69:aload_2         
	//   37   70:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   38   73:invokespecial   #102 <Method void IllegalArgumentException(String)>
	//   39   76:athrow          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzao();
	public static final int SUBTYPE_CAPTIONS = 2;
	public static final int SUBTYPE_CHAPTERS = 4;
	public static final int SUBTYPE_DESCRIPTIONS = 3;
	public static final int SUBTYPE_METADATA = 5;
	public static final int SUBTYPE_NONE = 0;
	public static final int SUBTYPE_SUBTITLES = 1;
	public static final int SUBTYPE_UNKNOWN = -1;
	public static final int TYPE_AUDIO = 2;
	public static final int TYPE_TEXT = 1;
	public static final int TYPE_UNKNOWN = 0;
	public static final int TYPE_VIDEO = 3;
	private long id;
	private String name;
	private int type;
	private String zzcy;
	private String zzda;
	private int zzes;
	private String zzj;
	private String zzk;
	private JSONObject zzp;

	static 
	{
	//    0    0:new             #65  <Class zzao>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void zzao()>
	//    3    7:putstatic       #70  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
