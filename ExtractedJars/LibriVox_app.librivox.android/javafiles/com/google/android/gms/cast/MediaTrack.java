// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.l;
import com.google.android.gms.internal.cast.aj;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			af

public final class MediaTrack extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	MediaTrack(long l1, int j, String s, String s1, String s2, String s3, 
			int k, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		a = l1;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #37  <Field long a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #39  <Field int b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #41  <Field String c>
		d = s1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #43  <Field String d>
		e = s2;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #45  <Field String e>
		f = s3;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #47  <Field String f>
		g = k;
	//   20   38:aload_0         
	//   21   39:iload           8
	//   22   41:putfield        #49  <Field int g>
		h = s4;
	//   23   44:aload_0         
	//   24   45:aload           9
	//   25   47:putfield        #51  <Field String h>
		s = h;
	//   26   50:aload_0         
	//   27   51:getfield        #51  <Field String h>
	//   28   54:astore          4
		if(s != null)
	//*  29   56:aload           4
	//*  30   58:ifnull          86
		{
			try
			{
				i = new JSONObject(s);
	//   31   61:aload_0         
	//   32   62:new             #53  <Class JSONObject>
	//   33   65:dup             
	//   34   66:aload           4
	//   35   68:invokespecial   #56  <Method void JSONObject(String)>
	//   36   71:putfield        #58  <Field JSONObject i>
				return;
	//   37   74:return          
			}
	//*  38   75:aload_0         
	//*  39   76:aconst_null     
	//*  40   77:putfield        #58  <Field JSONObject i>
	//*  41   80:aload_0         
	//*  42   81:aconst_null     
	//*  43   82:putfield        #51  <Field String h>
	//*  44   85:return          
	//*  45   86:aload_0         
	//*  46   87:aconst_null     
	//*  47   88:putfield        #58  <Field JSONObject i>
	//*  48   91:return          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				i = null;
			}
			h = null;
			return;
		} else
		{
			i = null;
			return;
		}
	//*  49   92:astore          4
	//*  50   94:goto            75
	}

	MediaTrack(JSONObject jsonobject)
	{
		String s;
label0:
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
	//    9    9:invokespecial   #61  <Method void MediaTrack(long, int, String, String, String, String, int, String)>
			a = jsonobject.getLong("trackId");
	//   10   12:aload_0         
	//   11   13:aload_1         
	//   12   14:ldc1            #63  <String "trackId">
	//   13   16:invokevirtual   #67  <Method long JSONObject.getLong(String)>
	//   14   19:putfield        #37  <Field long a>
			s = jsonobject.getString("type");
	//   15   22:aload_1         
	//   16   23:ldc1            #69  <String "type">
	//   17   25:invokevirtual   #73  <Method String JSONObject.getString(String)>
	//   18   28:astore_2        
			if("TEXT".equals(((Object) (s))))
	//*  19   29:ldc1            #75  <String "TEXT">
	//*  20   31:aload_2         
	//*  21   32:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  22   35:ifeq            46
				b = 1;
	//   23   38:aload_0         
	//   24   39:iconst_1        
	//   25   40:putfield        #39  <Field int b>
			else
	//*  26   43:goto            77
			if("AUDIO".equals(((Object) (s))))
	//*  27   46:ldc1            #83  <String "AUDIO">
	//*  28   48:aload_2         
	//*  29   49:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  30   52:ifeq            63
			{
				b = 2;
	//   31   55:aload_0         
	//   32   56:iconst_2        
	//   33   57:putfield        #39  <Field int b>
			} else
	//*  34   60:goto            77
			{
				if(!"VIDEO".equals(((Object) (s))))
					break label0;
	//   35   63:ldc1            #85  <String "VIDEO">
	//   36   65:aload_2         
	//   37   66:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   38   69:ifeq            246
				b = 3;
	//   39   72:aload_0         
	//   40   73:iconst_3        
	//   41   74:putfield        #39  <Field int b>
			}
			c = jsonobject.optString("trackContentId", ((String) (null)));
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:ldc1            #87  <String "trackContentId">
	//   45   81:aconst_null     
	//   46   82:invokevirtual   #91  <Method String JSONObject.optString(String, String)>
	//   47   85:putfield        #41  <Field String c>
			d = jsonobject.optString("trackContentType", ((String) (null)));
	//   48   88:aload_0         
	//   49   89:aload_1         
	//   50   90:ldc1            #93  <String "trackContentType">
	//   51   92:aconst_null     
	//   52   93:invokevirtual   #91  <Method String JSONObject.optString(String, String)>
	//   53   96:putfield        #43  <Field String d>
			e = jsonobject.optString("name", ((String) (null)));
	//   54   99:aload_0         
	//   55  100:aload_1         
	//   56  101:ldc1            #95  <String "name">
	//   57  103:aconst_null     
	//   58  104:invokevirtual   #91  <Method String JSONObject.optString(String, String)>
	//   59  107:putfield        #45  <Field String e>
			f = jsonobject.optString("language", ((String) (null)));
	//   60  110:aload_0         
	//   61  111:aload_1         
	//   62  112:ldc1            #97  <String "language">
	//   63  114:aconst_null     
	//   64  115:invokevirtual   #91  <Method String JSONObject.optString(String, String)>
	//   65  118:putfield        #47  <Field String f>
			if(jsonobject.has("subtype"))
	//*  66  121:aload_1         
	//*  67  122:ldc1            #99  <String "subtype">
	//*  68  124:invokevirtual   #103 <Method boolean JSONObject.has(String)>
	//*  69  127:ifeq            230
			{
				s = jsonobject.getString("subtype");
	//   70  130:aload_1         
	//   71  131:ldc1            #99  <String "subtype">
	//   72  133:invokevirtual   #73  <Method String JSONObject.getString(String)>
	//   73  136:astore_2        
				if("SUBTITLES".equals(((Object) (s))))
	//*  74  137:ldc1            #105 <String "SUBTITLES">
	//*  75  139:aload_2         
	//*  76  140:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  77  143:ifeq            154
					g = 1;
	//   78  146:aload_0         
	//   79  147:iconst_1        
	//   80  148:putfield        #49  <Field int g>
				else
	//*  81  151:goto            235
				if("CAPTIONS".equals(((Object) (s))))
	//*  82  154:ldc1            #107 <String "CAPTIONS">
	//*  83  156:aload_2         
	//*  84  157:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  85  160:ifeq            171
					g = 2;
	//   86  163:aload_0         
	//   87  164:iconst_2        
	//   88  165:putfield        #49  <Field int g>
				else
	//*  89  168:goto            235
				if("DESCRIPTIONS".equals(((Object) (s))))
	//*  90  171:ldc1            #109 <String "DESCRIPTIONS">
	//*  91  173:aload_2         
	//*  92  174:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  93  177:ifeq            188
					g = 3;
	//   94  180:aload_0         
	//   95  181:iconst_3        
	//   96  182:putfield        #49  <Field int g>
				else
	//*  97  185:goto            235
				if("CHAPTERS".equals(((Object) (s))))
	//*  98  188:ldc1            #111 <String "CHAPTERS">
	//*  99  190:aload_2         
	//* 100  191:invokevirtual   #81  <Method boolean String.equals(Object)>
	//* 101  194:ifeq            205
					g = 4;
	//  102  197:aload_0         
	//  103  198:iconst_4        
	//  104  199:putfield        #49  <Field int g>
				else
	//* 105  202:goto            235
				if("METADATA".equals(((Object) (s))))
	//* 106  205:ldc1            #113 <String "METADATA">
	//* 107  207:aload_2         
	//* 108  208:invokevirtual   #81  <Method boolean String.equals(Object)>
	//* 109  211:ifeq            222
					g = 5;
	//  110  214:aload_0         
	//  111  215:iconst_5        
	//  112  216:putfield        #49  <Field int g>
				else
	//* 113  219:goto            235
					g = -1;
	//  114  222:aload_0         
	//  115  223:iconst_m1       
	//  116  224:putfield        #49  <Field int g>
			} else
	//* 117  227:goto            235
			{
				g = 0;
	//  118  230:aload_0         
	//  119  231:iconst_0        
	//  120  232:putfield        #49  <Field int g>
			}
			i = jsonobject.optJSONObject("customData");
	//  121  235:aload_0         
	//  122  236:aload_1         
	//  123  237:ldc1            #115 <String "customData">
	//  124  239:invokevirtual   #119 <Method JSONObject JSONObject.optJSONObject(String)>
	//  125  242:putfield        #58  <Field JSONObject i>
			return;
	//  126  245:return          
		}
		jsonobject = ((JSONObject) (String.valueOf(((Object) (s)))));
	//  127  246:aload_2         
	//  128  247:invokestatic    #123 <Method String String.valueOf(Object)>
	//  129  250:astore_1        
		if(((String) (jsonobject)).length() != 0)
	//* 130  251:aload_1         
	//* 131  252:invokevirtual   #127 <Method int String.length()>
	//* 132  255:ifeq            268
			jsonobject = ((JSONObject) ("invalid type: ".concat(((String) (jsonobject)))));
	//  133  258:ldc1            #129 <String "invalid type: ">
	//  134  260:aload_1         
	//  135  261:invokevirtual   #132 <Method String String.concat(String)>
	//  136  264:astore_1        
		else
	//* 137  265:goto            278
			jsonobject = ((JSONObject) (new String("invalid type: ")));
	//  138  268:new             #77  <Class String>
	//  139  271:dup             
	//  140  272:ldc1            #129 <String "invalid type: ">
	//  141  274:invokespecial   #133 <Method void String(String)>
	//  142  277:astore_1        
		throw new JSONException(((String) (jsonobject)));
	//  143  278:new             #34  <Class JSONException>
	//  144  281:dup             
	//  145  282:aload_1         
	//  146  283:invokespecial   #134 <Method void JSONException(String)>
	//  147  286:athrow          
	}

	public final long a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long a>
	//    2    4:lreturn         
	}

	public final int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int b>
	//    2    4:ireturn         
	}

	public final String c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String c>
	//    2    4:areturn         
	}

	public final String d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String d>
	//    2    4:areturn         
	}

	public final String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String e>
	//    2    4:areturn         
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
		if(i == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #58  <Field JSONObject i>
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
		if(((MediaTrack) (obj)).i == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #58  <Field JSONObject i>
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
		JSONObject jsonobject = i;
	//   34   56:aload_0         
	//   35   57:getfield        #58  <Field JSONObject i>
	//   36   60:astore          4
		if(jsonobject != null)
	//*  37   62:aload           4
	//*  38   64:ifnull          90
		{
			JSONObject jsonobject1 = ((MediaTrack) (obj)).i;
	//   39   67:aload_1         
	//   40   68:getfield        #58  <Field JSONObject i>
	//   41   71:astore          5
			if(jsonobject1 != null && !l.a(((Object) (jsonobject)), ((Object) (jsonobject1))))
	//*  42   73:aload           5
	//*  43   75:ifnull          90
	//*  44   78:aload           4
	//*  45   80:aload           5
	//*  46   82:invokestatic    #141 <Method boolean l.a(Object, Object)>
	//*  47   85:ifne            90
				return false;
	//   48   88:iconst_0        
	//   49   89:ireturn         
		}
		return a == ((MediaTrack) (obj)).a && b == ((MediaTrack) (obj)).b && aj.a(((Object) (c)), ((Object) (((MediaTrack) (obj)).c))) && aj.a(((Object) (d)), ((Object) (((MediaTrack) (obj)).d))) && aj.a(((Object) (e)), ((Object) (((MediaTrack) (obj)).e))) && aj.a(((Object) (f)), ((Object) (((MediaTrack) (obj)).f))) && g == ((MediaTrack) (obj)).g;
	//   50   90:aload_0         
	//   51   91:getfield        #37  <Field long a>
	//   52   94:aload_1         
	//   53   95:getfield        #37  <Field long a>
	//   54   98:lcmp            
	//   55   99:ifne            182
	//   56  102:aload_0         
	//   57  103:getfield        #39  <Field int b>
	//   58  106:aload_1         
	//   59  107:getfield        #39  <Field int b>
	//   60  110:icmpne          182
	//   61  113:aload_0         
	//   62  114:getfield        #41  <Field String c>
	//   63  117:aload_1         
	//   64  118:getfield        #41  <Field String c>
	//   65  121:invokestatic    #144 <Method boolean aj.a(Object, Object)>
	//   66  124:ifeq            182
	//   67  127:aload_0         
	//   68  128:getfield        #43  <Field String d>
	//   69  131:aload_1         
	//   70  132:getfield        #43  <Field String d>
	//   71  135:invokestatic    #144 <Method boolean aj.a(Object, Object)>
	//   72  138:ifeq            182
	//   73  141:aload_0         
	//   74  142:getfield        #45  <Field String e>
	//   75  145:aload_1         
	//   76  146:getfield        #45  <Field String e>
	//   77  149:invokestatic    #144 <Method boolean aj.a(Object, Object)>
	//   78  152:ifeq            182
	//   79  155:aload_0         
	//   80  156:getfield        #47  <Field String f>
	//   81  159:aload_1         
	//   82  160:getfield        #47  <Field String f>
	//   83  163:invokestatic    #144 <Method boolean aj.a(Object, Object)>
	//   84  166:ifeq            182
	//   85  169:aload_0         
	//   86  170:getfield        #49  <Field int g>
	//   87  173:aload_1         
	//   88  174:getfield        #49  <Field int g>
	//   89  177:icmpne          182
	//   90  180:iconst_1        
	//   91  181:ireturn         
	//   92  182:iconst_0        
	//   93  183:ireturn         
	}

	public final String f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String f>
	//    2    4:areturn         
	}

	public final int g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int g>
	//    2    4:ireturn         
	}

	public final JSONObject h()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #53  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("trackId", a);
	//    4    8:aload_1         
	//    5    9:ldc1            #63  <String "trackId">
	//    6   11:aload_0         
	//    7   12:getfield        #37  <Field long a>
	//    8   15:invokevirtual   #150 <Method JSONObject JSONObject.put(String, long)>
	//    9   18:pop             
		b;
	//   10   19:aload_0         
	//   11   20:getfield        #39  <Field int b>
		JVM INSTR tableswitch 1 3: default 276
	//	               1 72
	//	               2 60
	//	               3 48;
	//   12   23:tableswitch     1 3: default 276
	//	               1 72
	//	               2 60
	//	               3 48
		   goto _L1 _L2 _L3 _L4
_L1:
		break; /* Loop/switch isn't completed */
_L4:
		jsonobject.put("type", "VIDEO");
	//   13   48:aload_1         
	//   14   49:ldc1            #69  <String "type">
	//   15   51:ldc1            #85  <String "VIDEO">
	//   16   53:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//   17   56:pop             
		break; /* Loop/switch isn't completed */
	//   18   57:goto            81
_L3:
		try
		{
			jsonobject.put("type", "AUDIO");
	//   19   60:aload_1         
	//   20   61:ldc1            #69  <String "type">
	//   21   63:ldc1            #83  <String "AUDIO">
	//   22   65:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//   23   68:pop             
		}
	//*  24   69:goto            81
	//*  25   72:aload_1         
	//*  26   73:ldc1            #69  <String "type">
	//*  27   75:ldc1            #75  <String "TEXT">
	//*  28   77:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  29   80:pop             
	//*  30   81:aload_0         
	//*  31   82:getfield        #41  <Field String c>
	//*  32   85:ifnull          99
	//*  33   88:aload_1         
	//*  34   89:ldc1            #87  <String "trackContentId">
	//*  35   91:aload_0         
	//*  36   92:getfield        #41  <Field String c>
	//*  37   95:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  38   98:pop             
	//*  39   99:aload_0         
	//*  40  100:getfield        #43  <Field String d>
	//*  41  103:ifnull          117
	//*  42  106:aload_1         
	//*  43  107:ldc1            #93  <String "trackContentType">
	//*  44  109:aload_0         
	//*  45  110:getfield        #43  <Field String d>
	//*  46  113:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  47  116:pop             
	//*  48  117:aload_0         
	//*  49  118:getfield        #45  <Field String e>
	//*  50  121:ifnull          135
	//*  51  124:aload_1         
	//*  52  125:ldc1            #95  <String "name">
	//*  53  127:aload_0         
	//*  54  128:getfield        #45  <Field String e>
	//*  55  131:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  56  134:pop             
	//*  57  135:aload_0         
	//*  58  136:getfield        #47  <Field String f>
	//*  59  139:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  60  142:ifne            156
	//*  61  145:aload_1         
	//*  62  146:ldc1            #97  <String "language">
	//*  63  148:aload_0         
	//*  64  149:getfield        #47  <Field String f>
	//*  65  152:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  66  155:pop             
	//*  67  156:aload_0         
	//*  68  157:getfield        #49  <Field int g>
	//*  69  160:tableswitch     1 5: default 279
	//	               1 244
	//	               2 232
	//	               3 220
	//	               4 208
	//	               5 196
	//*  70  196:aload_1         
	//*  71  197:ldc1            #99  <String "subtype">
	//*  72  199:ldc1            #113 <String "METADATA">
	//*  73  201:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  74  204:pop             
	//*  75  205:goto            253
	//*  76  208:aload_1         
	//*  77  209:ldc1            #99  <String "subtype">
	//*  78  211:ldc1            #111 <String "CHAPTERS">
	//*  79  213:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  80  216:pop             
	//*  81  217:goto            253
	//*  82  220:aload_1         
	//*  83  221:ldc1            #99  <String "subtype">
	//*  84  223:ldc1            #109 <String "DESCRIPTIONS">
	//*  85  225:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  86  228:pop             
	//*  87  229:goto            253
	//*  88  232:aload_1         
	//*  89  233:ldc1            #99  <String "subtype">
	//*  90  235:ldc1            #107 <String "CAPTIONS">
	//*  91  237:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  92  240:pop             
	//*  93  241:goto            253
	//*  94  244:aload_1         
	//*  95  245:ldc1            #99  <String "subtype">
	//*  96  247:ldc1            #105 <String "SUBTITLES">
	//*  97  249:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//*  98  252:pop             
	//*  99  253:aload_0         
	//* 100  254:getfield        #58  <Field JSONObject i>
	//* 101  257:ifnull          271
	//* 102  260:aload_1         
	//* 103  261:ldc1            #115 <String "customData">
	//* 104  263:aload_0         
	//* 105  264:getfield        #58  <Field JSONObject i>
	//* 106  267:invokevirtual   #153 <Method JSONObject JSONObject.put(String, Object)>
	//* 107  270:pop             
	//* 108  271:aload_1         
	//* 109  272:areturn         
		catch(JSONException jsonexception)
	//* 110  273:astore_2        
		{
			return jsonobject;
	//  111  274:aload_1         
	//  112  275:areturn         
		}
		break; /* Loop/switch isn't completed */
	//  113  276:goto            81
_L2:
		jsonobject.put("type", "TEXT");
		if(c != null)
			jsonobject.put("trackContentId", ((Object) (c)));
		if(d != null)
			jsonobject.put("trackContentType", ((Object) (d)));
		if(e != null)
			jsonobject.put("name", ((Object) (e)));
		if(!TextUtils.isEmpty(((CharSequence) (f))))
			jsonobject.put("language", ((Object) (f)));
		g;
		JVM INSTR tableswitch 1 5: default 279
	//	               1 244
	//	               2 232
	//	               3 220
	//	               4 208
	//	               5 196;
		   goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
		break; /* Loop/switch isn't completed */
_L10:
		jsonobject.put("subtype", "METADATA");
		break; /* Loop/switch isn't completed */
_L9:
		jsonobject.put("subtype", "CHAPTERS");
		break; /* Loop/switch isn't completed */
_L8:
		jsonobject.put("subtype", "DESCRIPTIONS");
		break; /* Loop/switch isn't completed */
_L7:
		jsonobject.put("subtype", "CAPTIONS");
		break; /* Loop/switch isn't completed */
_L6:
		jsonobject.put("subtype", "SUBTITLES");
		if(i != null)
			jsonobject.put("customData", ((Object) (i)));
		return jsonobject;
	//* 114  279:goto            253
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			Long.valueOf(a), Integer.valueOf(b), c, d, e, f, Integer.valueOf(g), String.valueOf(((Object) (i)))
		});
	//    0    0:bipush          8
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #37  <Field long a>
	//    6   11:invokestatic    #167 <Method Long Long.valueOf(long)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #39  <Field int b>
	//   12   21:invokestatic    #172 <Method Integer Integer.valueOf(int)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #41  <Field String c>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #43  <Field String d>
	//   23   38:aastore         
	//   24   39:dup             
	//   25   40:iconst_4        
	//   26   41:aload_0         
	//   27   42:getfield        #45  <Field String e>
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_5        
	//   31   48:aload_0         
	//   32   49:getfield        #47  <Field String f>
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:bipush          6
	//   36   56:aload_0         
	//   37   57:getfield        #49  <Field int g>
	//   38   60:invokestatic    #172 <Method Integer Integer.valueOf(int)>
	//   39   63:aastore         
	//   40   64:dup             
	//   41   65:bipush          7
	//   42   67:aload_0         
	//   43   68:getfield        #58  <Field JSONObject i>
	//   44   71:invokestatic    #123 <Method String String.valueOf(Object)>
	//   45   74:aastore         
	//   46   75:invokestatic    #177 <Method int ak.a(Object[])>
	//   47   78:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int j)
	{
		Object obj = ((Object) (i));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field JSONObject i>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_3        
		else
	//*   7   11:goto            19
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #182 <Method String JSONObject.toString()>
	//   10   18:astore_3        
		h = ((String) (obj));
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #51  <Field String h>
		j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//   14   24:aload_1         
	//   15   25:invokestatic    #187 <Method int c.a(Parcel)>
	//   16   28:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a());
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:invokevirtual   #189 <Method long a()>
	//   21   35:invokestatic    #192 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   22   38:aload_1         
	//   23   39:iconst_3        
	//   24   40:aload_0         
	//   25   41:invokevirtual   #194 <Method int b()>
	//   26   44:invokestatic    #197 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c(), false);
	//   27   47:aload_1         
	//   28   48:iconst_4        
	//   29   49:aload_0         
	//   30   50:invokevirtual   #199 <Method String c()>
	//   31   53:iconst_0        
	//   32   54:invokestatic    #202 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d(), false);
	//   33   57:aload_1         
	//   34   58:iconst_5        
	//   35   59:aload_0         
	//   36   60:invokevirtual   #204 <Method String d()>
	//   37   63:iconst_0        
	//   38   64:invokestatic    #202 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e(), false);
	//   39   67:aload_1         
	//   40   68:bipush          6
	//   41   70:aload_0         
	//   42   71:invokevirtual   #206 <Method String e()>
	//   43   74:iconst_0        
	//   44   75:invokestatic    #202 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f(), false);
	//   45   78:aload_1         
	//   46   79:bipush          7
	//   47   81:aload_0         
	//   48   82:invokevirtual   #208 <Method String f()>
	//   49   85:iconst_0        
	//   50   86:invokestatic    #202 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, g());
	//   51   89:aload_1         
	//   52   90:bipush          8
	//   53   92:aload_0         
	//   54   93:invokevirtual   #210 <Method int g()>
	//   55   96:invokestatic    #197 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h, false);
	//   56   99:aload_1         
	//   57  100:bipush          9
	//   58  102:aload_0         
	//   59  103:getfield        #51  <Field String h>
	//   60  106:iconst_0        
	//   61  107:invokestatic    #202 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   62  110:aload_1         
	//   63  111:iload_2         
	//   64  112:invokestatic    #212 <Method void c.a(Parcel, int)>
	//   65  115:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new af();
	private long a;
	private int b;
	private String c;
	private String d;
	private String e;
	private String f;
	private int g;
	private String h;
	private JSONObject i;

	static 
	{
	//    0    0:new             #25  <Class af>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void af()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
