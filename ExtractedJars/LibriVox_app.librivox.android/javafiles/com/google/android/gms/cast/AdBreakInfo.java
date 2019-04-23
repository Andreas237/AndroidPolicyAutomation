// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.aj;
import java.util.Arrays;
import java.util.Locale;
import org.json.*;

// Referenced classes of package com.google.android.gms.cast:
//			ag

public class AdBreakInfo extends AbstractSafeParcelable
{

	public AdBreakInfo(long l, String s, long l1, boolean flag, String as[], 
			boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AbstractSafeParcelable()>
		a = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #30  <Field long a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #32  <Field String b>
		c = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #34  <Field long c>
		d = flag;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #36  <Field boolean d>
		e = as;
	//   14   26:aload_0         
	//   15   27:aload           7
	//   16   29:putfield        #38  <Field String[] e>
		f = flag1;
	//   17   32:aload_0         
	//   18   33:iload           8
	//   19   35:putfield        #40  <Field boolean f>
	//   20   38:return          
	}

	static AdBreakInfo a(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(!jsonobject.has("id")) goto _L2; else goto _L1
	//    4    6:aload_0         
	//    5    7:ldc1            #45  <String "id">
	//    6    9:invokevirtual   #51  <Method boolean JSONObject.has(String)>
	//    7   12:ifeq            197
_L1:
		String as[];
		if(!jsonobject.has("position"))
	//*   8   15:aload_0         
	//*   9   16:ldc1            #53  <String "position">
	//*  10   18:invokevirtual   #51  <Method boolean JSONObject.has(String)>
	//*  11   21:ifne            26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		double d1;
		int i;
		long l;
		long l1;
		boolean flag;
		String s;
		JSONArray jsonarray;
		try
		{
			s = jsonobject.getString("id");
	//   14   26:aload_0         
	//   15   27:ldc1            #45  <String "id">
	//   16   29:invokevirtual   #57  <Method String JSONObject.getString(String)>
	//   17   32:astore          10
			l = jsonobject.getLong("position");
	//   18   34:aload_0         
	//   19   35:ldc1            #53  <String "position">
	//   20   37:invokevirtual   #61  <Method long JSONObject.getLong(String)>
	//   21   40:lstore          4
		}
	//*  22   42:lload           4
	//*  23   44:l2d             
	//*  24   45:dstore_1        
	//*  25   46:dload_1         
	//*  26   47:invokestatic    #67  <Method boolean Double.isNaN(double)>
	//*  27   50:pop             
	//*  28   51:dload_1         
	//*  29   52:ldc2w           #68  <Double 1000D>
	//*  30   55:dmul            
	//*  31   56:d2l             
	//*  32   57:lstore          4
	//*  33   59:aload_0         
	//*  34   60:ldc1            #71  <String "isWatched">
	//*  35   62:invokevirtual   #74  <Method boolean JSONObject.optBoolean(String)>
	//*  36   65:istore          8
	//*  37   67:aload_0         
	//*  38   68:ldc1            #76  <String "duration">
	//*  39   70:invokevirtual   #79  <Method long JSONObject.optLong(String)>
	//*  40   73:lstore          6
	//*  41   75:lload           6
	//*  42   77:l2d             
	//*  43   78:dstore_1        
	//*  44   79:dload_1         
	//*  45   80:invokestatic    #67  <Method boolean Double.isNaN(double)>
	//*  46   83:pop             
	//*  47   84:dload_1         
	//*  48   85:ldc2w           #68  <Double 1000D>
	//*  49   88:dmul            
	//*  50   89:d2l             
	//*  51   90:lstore          6
	//*  52   92:aload_0         
	//*  53   93:ldc1            #81  <String "breakClipIds">
	//*  54   95:invokevirtual   #85  <Method JSONArray JSONObject.optJSONArray(String)>
	//*  55   98:astore          11
	//*  56  100:aload           11
	//*  57  102:ifnull          202
	//*  58  105:aload           11
	//*  59  107:invokevirtual   #91  <Method int JSONArray.length()>
	//*  60  110:anewarray       String[]
	//*  61  113:astore          9
	//*  62  115:iconst_0        
	//*  63  116:istore_3        
	//*  64  117:iload_3         
	//*  65  118:aload           11
	//*  66  120:invokevirtual   #91  <Method int JSONArray.length()>
	//*  67  123:icmpge          199
	//*  68  126:aload           9
	//*  69  128:iload_3         
	//*  70  129:aload           11
	//*  71  131:iload_3         
	//*  72  132:invokevirtual   #96  <Method String JSONArray.getString(int)>
	//*  73  135:aastore         
	//*  74  136:iload_3         
	//*  75  137:iconst_1        
	//*  76  138:iadd            
	//*  77  139:istore_3        
	//*  78  140:goto            117
	//*  79  143:new             #2   <Class AdBreakInfo>
	//*  80  146:dup             
	//*  81  147:lload           4
	//*  82  149:aload           10
	//*  83  151:lload           6
	//*  84  153:iload           8
	//*  85  155:aload           9
	//*  86  157:aload_0         
	//*  87  158:ldc1            #98  <String "isEmbedded">
	//*  88  160:invokevirtual   #74  <Method boolean JSONObject.optBoolean(String)>
	//*  89  163:invokespecial   #100 <Method void AdBreakInfo(long, String, long, boolean, String[], boolean)>
	//*  90  166:astore_0        
	//*  91  167:aload_0         
	//*  92  168:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  93  169:astore_0        
		{
			Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", new Object[] {
				((JSONException) (jsonobject)).getMessage()
			}));
	//   94  170:ldc1            #102 <String "AdBreakInfo">
	//   95  172:getstatic       #108 <Field Locale Locale.ROOT>
	//   96  175:ldc1            #110 <String "Error while creating an AdBreakInfo from JSON: %s">
	//   97  177:iconst_1        
	//   98  178:anewarray       Object[]
	//   99  181:dup             
	//  100  182:iconst_0        
	//  101  183:aload_0         
	//  102  184:invokevirtual   #116 <Method String JSONException.getMessage()>
	//  103  187:aastore         
	//  104  188:invokestatic    #120 <Method String String.format(Locale, String, Object[])>
	//  105  191:invokestatic    #125 <Method int Log.d(String, String)>
	//  106  194:pop             
			return null;
	//  107  195:aconst_null     
	//  108  196:areturn         
		}
		d1 = l;
		Double.isNaN(d1);
		l = (long)(d1 * 1000D);
		flag = jsonobject.optBoolean("isWatched");
		l1 = jsonobject.optLong("duration");
		d1 = l1;
		Double.isNaN(d1);
		l1 = (long)(d1 * 1000D);
		jsonarray = jsonobject.optJSONArray("breakClipIds");
		if(jsonarray == null) goto _L4; else goto _L3
_L3:
		as = new String[jsonarray.length()];
		i = 0;
_L6:
		if(i >= jsonarray.length())
			break; /* Loop/switch isn't completed */
		as[i] = jsonarray.getString(i);
		i++;
		if(true) goto _L6; else goto _L5
_L5:
		jsonobject = ((JSONObject) (new AdBreakInfo(l, s, l1, flag, as, jsonobject.optBoolean("isEmbedded"))));
		return ((AdBreakInfo) (jsonobject));
_L2:
		return null;
	//  109  197:aconst_null     
	//  110  198:areturn         
	//* 111  199:goto            143
_L4:
		as = null;
	//  112  202:aconst_null     
	//  113  203:astore          9
		if(true) goto _L5; else goto _L7
	//  114  205:goto            143
_L7:
	}

	public long a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long a>
	//    2    4:lreturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String b>
	//    2    4:areturn         
	}

	public long c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long c>
	//    2    4:lreturn         
	}

	public boolean d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean d>
	//    2    4:ireturn         
	}

	public boolean e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean f>
	//    2    4:ireturn         
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
		return aj.a(((Object) (b)), ((Object) (((AdBreakInfo) (obj)).b))) && a == ((AdBreakInfo) (obj)).a && c == ((AdBreakInfo) (obj)).c && d == ((AdBreakInfo) (obj)).d && Arrays.equals(((Object []) (e)), ((Object []) (((AdBreakInfo) (obj)).e))) && f == ((AdBreakInfo) (obj)).f;
	//   13   21:aload_0         
	//   14   22:getfield        #32  <Field String b>
	//   15   25:aload_1         
	//   16   26:getfield        #32  <Field String b>
	//   17   29:invokestatic    #134 <Method boolean aj.a(Object, Object)>
	//   18   32:ifeq            97
	//   19   35:aload_0         
	//   20   36:getfield        #30  <Field long a>
	//   21   39:aload_1         
	//   22   40:getfield        #30  <Field long a>
	//   23   43:lcmp            
	//   24   44:ifne            97
	//   25   47:aload_0         
	//   26   48:getfield        #34  <Field long c>
	//   27   51:aload_1         
	//   28   52:getfield        #34  <Field long c>
	//   29   55:lcmp            
	//   30   56:ifne            97
	//   31   59:aload_0         
	//   32   60:getfield        #36  <Field boolean d>
	//   33   63:aload_1         
	//   34   64:getfield        #36  <Field boolean d>
	//   35   67:icmpne          97
	//   36   70:aload_0         
	//   37   71:getfield        #38  <Field String[] e>
	//   38   74:aload_1         
	//   39   75:getfield        #38  <Field String[] e>
	//   40   78:invokestatic    #139 <Method boolean Arrays.equals(Object[], Object[])>
	//   41   81:ifeq            97
	//   42   84:aload_0         
	//   43   85:getfield        #40  <Field boolean f>
	//   44   88:aload_1         
	//   45   89:getfield        #40  <Field boolean f>
	//   46   92:icmpne          97
	//   47   95:iconst_1        
	//   48   96:ireturn         
	//   49   97:iconst_0        
	//   50   98:ireturn         
	}

	public String[] f()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String[] e>
	//    2    4:areturn         
	}

	public final JSONObject g()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #47  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #143 <Method void JSONObject()>
	//    3    7:astore          7
		double d1;
		int i;
		int j;
		long l;
		JSONArray jsonarray;
		String as[];
		try
		{
			jsonobject.put("id", ((Object) (b)));
	//    4    9:aload           7
	//    5   11:ldc1            #45  <String "id">
	//    6   13:aload_0         
	//    7   14:getfield        #32  <Field String b>
	//    8   17:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//    9   20:pop             
			l = a;
	//   10   21:aload_0         
	//   11   22:getfield        #30  <Field long a>
	//   12   25:lstore          5
		}
	//*  13   27:lload           5
	//*  14   29:l2d             
	//*  15   30:dstore_1        
	//*  16   31:dload_1         
	//*  17   32:invokestatic    #67  <Method boolean Double.isNaN(double)>
	//*  18   35:pop             
	//*  19   36:dload_1         
	//*  20   37:ldc2w           #68  <Double 1000D>
	//*  21   40:ddiv            
	//*  22   41:dstore_1        
	//*  23   42:aload           7
	//*  24   44:ldc1            #53  <String "position">
	//*  25   46:dload_1         
	//*  26   47:invokevirtual   #150 <Method JSONObject JSONObject.put(String, double)>
	//*  27   50:pop             
	//*  28   51:aload           7
	//*  29   53:ldc1            #71  <String "isWatched">
	//*  30   55:aload_0         
	//*  31   56:getfield        #36  <Field boolean d>
	//*  32   59:invokevirtual   #153 <Method JSONObject JSONObject.put(String, boolean)>
	//*  33   62:pop             
	//*  34   63:aload           7
	//*  35   65:ldc1            #98  <String "isEmbedded">
	//*  36   67:aload_0         
	//*  37   68:getfield        #40  <Field boolean f>
	//*  38   71:invokevirtual   #153 <Method JSONObject JSONObject.put(String, boolean)>
	//*  39   74:pop             
	//*  40   75:aload_0         
	//*  41   76:getfield        #34  <Field long c>
	//*  42   79:lstore          5
	//*  43   81:lload           5
	//*  44   83:l2d             
	//*  45   84:dstore_1        
	//*  46   85:dload_1         
	//*  47   86:invokestatic    #67  <Method boolean Double.isNaN(double)>
	//*  48   89:pop             
	//*  49   90:dload_1         
	//*  50   91:ldc2w           #68  <Double 1000D>
	//*  51   94:ddiv            
	//*  52   95:dstore_1        
	//*  53   96:aload           7
	//*  54   98:ldc1            #76  <String "duration">
	//*  55  100:dload_1         
	//*  56  101:invokevirtual   #150 <Method JSONObject JSONObject.put(String, double)>
	//*  57  104:pop             
	//*  58  105:aload_0         
	//*  59  106:getfield        #38  <Field String[] e>
	//*  60  109:ifnull          167
	//*  61  112:new             #87  <Class JSONArray>
	//*  62  115:dup             
	//*  63  116:invokespecial   #154 <Method void JSONArray()>
	//*  64  119:astore          8
	//*  65  121:aload_0         
	//*  66  122:getfield        #38  <Field String[] e>
	//*  67  125:astore          9
	//*  68  127:aload           9
	//*  69  129:arraylength     
	//*  70  130:istore          4
	//*  71  132:iconst_0        
	//*  72  133:istore_3        
	//*  73  134:iload_3         
	//*  74  135:iload           4
	//*  75  137:icmpge          157
	//*  76  140:aload           8
	//*  77  142:aload           9
	//*  78  144:iload_3         
	//*  79  145:aaload          
	//*  80  146:invokevirtual   #157 <Method JSONArray JSONArray.put(Object)>
	//*  81  149:pop             
	//*  82  150:iload_3         
	//*  83  151:iconst_1        
	//*  84  152:iadd            
	//*  85  153:istore_3        
	//*  86  154:goto            134
	//*  87  157:aload           7
	//*  88  159:ldc1            #81  <String "breakClipIds">
	//*  89  161:aload           8
	//*  90  163:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  91  166:pop             
	//*  92  167:aload           7
	//*  93  169:areturn         
		catch(JSONException jsonexception)
	//*  94  170:astore          8
		{
			return jsonobject;
	//   95  172:aload           7
	//   96  174:areturn         
		}
		d1 = l;
		Double.isNaN(d1);
		d1 /= 1000D;
		jsonobject.put("position", d1);
		jsonobject.put("isWatched", d);
		jsonobject.put("isEmbedded", f);
		l = c;
		d1 = l;
		Double.isNaN(d1);
		d1 /= 1000D;
		jsonobject.put("duration", d1);
		if(e == null)
			break MISSING_BLOCK_LABEL_167;
		jsonarray = new JSONArray();
		as = e;
		j = as.length;
		i = 0;
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		jsonarray.put(((Object) (as[i])));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		jsonobject.put("breakClipIds", ((Object) (jsonarray)));
		return jsonobject;
	}

	public int hashCode()
	{
		return b.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String b>
	//    2    4:invokevirtual   #160 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #167 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #169 <Method long a()>
	//    7   11:invokestatic    #172 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b(), false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #174 <Method String b()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #177 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #179 <Method long c()>
	//   18   30:invokestatic    #172 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d());
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #181 <Method boolean d()>
	//   23   39:invokestatic    #184 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f(), false);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:invokevirtual   #186 <Method String[] f()>
	//   28   49:iconst_0        
	//   29   50:invokestatic    #189 <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, e());
	//   30   53:aload_1         
	//   31   54:bipush          7
	//   32   56:aload_0         
	//   33   57:invokevirtual   #191 <Method boolean e()>
	//   34   60:invokestatic    #184 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   35   63:aload_1         
	//   36   64:iload_2         
	//   37   65:invokestatic    #193 <Method void c.a(Parcel, int)>
	//   38   68:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ag();
	private final long a;
	private final String b;
	private final long c;
	private final boolean d;
	private String e[];
	private final boolean f;

	static 
	{
	//    0    0:new             #20  <Class ag>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ag()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
