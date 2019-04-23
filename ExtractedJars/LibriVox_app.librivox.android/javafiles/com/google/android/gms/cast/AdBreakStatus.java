// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.aj;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			aj

public class AdBreakStatus extends AbstractSafeParcelable
{

	AdBreakStatus(long l, long l1, String s, String s1, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #27  <Field long a>
		b = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #29  <Field long b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #31  <Field String c>
		d = s1;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #33  <Field String d>
		e = l2;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #35  <Field long e>
	//   17   32:return          
	}

	static AdBreakStatus a(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(!jsonobject.has("currentBreakTime"))
			break MISSING_BLOCK_LABEL_173;
	//    4    6:aload_0         
	//    5    7:ldc1            #40  <String "currentBreakTime">
	//    6    9:invokevirtual   #46  <Method boolean JSONObject.has(String)>
	//    7   12:ifeq            173
		if(!jsonobject.has("currentBreakClipTime"))
	//*   8   15:aload_0         
	//*   9   16:ldc1            #48  <String "currentBreakClipTime">
	//*  10   18:invokevirtual   #46  <Method boolean JSONObject.has(String)>
	//*  11   21:ifne            26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		double d1;
		long l;
		long l1;
		long l2;
		String s;
		String s1;
		try
		{
			l = jsonobject.getLong("currentBreakTime");
	//   14   26:aload_0         
	//   15   27:ldc1            #40  <String "currentBreakTime">
	//   16   29:invokevirtual   #52  <Method long JSONObject.getLong(String)>
	//   17   32:lstore_3        
		}
	//*  18   33:lload_3         
	//*  19   34:l2d             
	//*  20   35:dstore_1        
	//*  21   36:dload_1         
	//*  22   37:invokestatic    #58  <Method boolean Double.isNaN(double)>
	//*  23   40:pop             
	//*  24   41:dload_1         
	//*  25   42:ldc2w           #59  <Double 1000D>
	//*  26   45:dmul            
	//*  27   46:d2l             
	//*  28   47:lstore          5
	//*  29   49:aload_0         
	//*  30   50:ldc1            #48  <String "currentBreakClipTime">
	//*  31   52:invokevirtual   #52  <Method long JSONObject.getLong(String)>
	//*  32   55:lstore_3        
	//*  33   56:lload_3         
	//*  34   57:l2d             
	//*  35   58:dstore_1        
	//*  36   59:dload_1         
	//*  37   60:invokestatic    #58  <Method boolean Double.isNaN(double)>
	//*  38   63:pop             
	//*  39   64:dload_1         
	//*  40   65:ldc2w           #59  <Double 1000D>
	//*  41   68:dmul            
	//*  42   69:d2l             
	//*  43   70:lstore          7
	//*  44   72:aload_0         
	//*  45   73:ldc1            #62  <String "breakId">
	//*  46   75:aconst_null     
	//*  47   76:invokevirtual   #66  <Method String JSONObject.optString(String, String)>
	//*  48   79:astore          9
	//*  49   81:aload_0         
	//*  50   82:ldc1            #68  <String "breakClipId">
	//*  51   84:aconst_null     
	//*  52   85:invokevirtual   #66  <Method String JSONObject.optString(String, String)>
	//*  53   88:astore          10
	//*  54   90:aload_0         
	//*  55   91:ldc1            #70  <String "whenSkippable">
	//*  56   93:ldc2w           #71  <Long -1L>
	//*  57   96:invokevirtual   #76  <Method long JSONObject.optLong(String, long)>
	//*  58   99:lstore_3        
	//*  59  100:lload_3         
	//*  60  101:ldc2w           #71  <Long -1L>
	//*  61  104:lcmp            
	//*  62  105:ifeq            126
	//*  63  108:lload_3         
	//*  64  109:l2d             
	//*  65  110:dstore_1        
	//*  66  111:dload_1         
	//*  67  112:invokestatic    #58  <Method boolean Double.isNaN(double)>
	//*  68  115:pop             
	//*  69  116:dload_1         
	//*  70  117:ldc2w           #59  <Double 1000D>
	//*  71  120:dmul            
	//*  72  121:d2l             
	//*  73  122:lstore_3        
	//*  74  123:goto            126
	//*  75  126:new             #2   <Class AdBreakStatus>
	//*  76  129:dup             
	//*  77  130:lload           5
	//*  78  132:lload           7
	//*  79  134:aload           9
	//*  80  136:aload           10
	//*  81  138:lload_3         
	//*  82  139:invokespecial   #78  <Method void AdBreakStatus(long, long, String, String, long)>
	//*  83  142:astore_0        
	//*  84  143:aload_0         
	//*  85  144:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  86  145:astore_0        
		{
			Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[] {
				((JSONException) (jsonobject)).getMessage()
			}));
	//   87  146:ldc1            #80  <String "AdBreakInfo">
	//   88  148:getstatic       #86  <Field Locale Locale.ROOT>
	//   89  151:ldc1            #88  <String "Error while creating an AdBreakClipInfo from JSON: %s">
	//   90  153:iconst_1        
	//   91  154:anewarray       Object[]
	//   92  157:dup             
	//   93  158:iconst_0        
	//   94  159:aload_0         
	//   95  160:invokevirtual   #94  <Method String JSONException.getMessage()>
	//   96  163:aastore         
	//   97  164:invokestatic    #100 <Method String String.format(Locale, String, Object[])>
	//   98  167:invokestatic    #105 <Method int Log.d(String, String)>
	//   99  170:pop             
			return null;
	//  100  171:aconst_null     
	//  101  172:areturn         
		}
		d1 = l;
		Double.isNaN(d1);
		l1 = (long)(d1 * 1000D);
		l = jsonobject.getLong("currentBreakClipTime");
		d1 = l;
		Double.isNaN(d1);
		l2 = (long)(d1 * 1000D);
		s = jsonobject.optString("breakId", ((String) (null)));
		s1 = jsonobject.optString("breakClipId", ((String) (null)));
		l = jsonobject.optLong("whenSkippable", -1L);
		if(l != -1L)
		{
			d1 = l;
			Double.isNaN(d1);
			l = (long)(d1 * 1000D);
		}
		jsonobject = ((JSONObject) (new AdBreakStatus(l1, l2, s, s1, l)));
		return ((AdBreakStatus) (jsonobject));
		return null;
	//  102  173:aconst_null     
	//  103  174:areturn         
	}

	public String a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String c>
	//    2    4:areturn         
	}

	public String b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String d>
	//    2    4:areturn         
	}

	public long c()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field long a>
	//    2    4:lreturn         
	}

	public long d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long b>
	//    2    4:lreturn         
	}

	public long e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long e>
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
		return a == ((AdBreakStatus) (obj)).a && b == ((AdBreakStatus) (obj)).b && aj.a(((Object) (c)), ((Object) (((AdBreakStatus) (obj)).c))) && aj.a(((Object) (d)), ((Object) (((AdBreakStatus) (obj)).d))) && e == ((AdBreakStatus) (obj)).e;
	//   13   21:aload_0         
	//   14   22:getfield        #27  <Field long a>
	//   15   25:aload_1         
	//   16   26:getfield        #27  <Field long a>
	//   17   29:lcmp            
	//   18   30:ifne            87
	//   19   33:aload_0         
	//   20   34:getfield        #29  <Field long b>
	//   21   37:aload_1         
	//   22   38:getfield        #29  <Field long b>
	//   23   41:lcmp            
	//   24   42:ifne            87
	//   25   45:aload_0         
	//   26   46:getfield        #31  <Field String c>
	//   27   49:aload_1         
	//   28   50:getfield        #31  <Field String c>
	//   29   53:invokestatic    #113 <Method boolean aj.a(Object, Object)>
	//   30   56:ifeq            87
	//   31   59:aload_0         
	//   32   60:getfield        #33  <Field String d>
	//   33   63:aload_1         
	//   34   64:getfield        #33  <Field String d>
	//   35   67:invokestatic    #113 <Method boolean aj.a(Object, Object)>
	//   36   70:ifeq            87
	//   37   73:aload_0         
	//   38   74:getfield        #35  <Field long e>
	//   39   77:aload_1         
	//   40   78:getfield        #35  <Field long e>
	//   41   81:lcmp            
	//   42   82:ifne            87
	//   43   85:iconst_1        
	//   44   86:ireturn         
	//   45   87:iconst_0        
	//   46   88:ireturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			Long.valueOf(a), Long.valueOf(b), c, d, Long.valueOf(e)
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field long a>
	//    6   10:invokestatic    #121 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #29  <Field long b>
	//   12   20:invokestatic    #121 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #31  <Field String c>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #33  <Field String d>
	//   23   37:aastore         
	//   24   38:dup             
	//   25   39:iconst_4        
	//   26   40:aload_0         
	//   27   41:getfield        #35  <Field long e>
	//   28   44:invokestatic    #121 <Method Long Long.valueOf(long)>
	//   29   47:aastore         
	//   30   48:invokestatic    #126 <Method int ak.a(Object[])>
	//   31   51:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #133 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, c());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #135 <Method long c()>
	//    7   11:invokestatic    #138 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d());
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #140 <Method long d()>
	//   12   20:invokestatic    #138 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, a(), false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #142 <Method String a()>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #145 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, b(), false);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #147 <Method String b()>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #145 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e());
	//   25   43:aload_1         
	//   26   44:bipush          6
	//   27   46:aload_0         
	//   28   47:invokevirtual   #149 <Method long e()>
	//   29   50:invokestatic    #138 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   30   53:aload_1         
	//   31   54:iload_2         
	//   32   55:invokestatic    #151 <Method void c.a(Parcel, int)>
	//   33   58:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.cast.aj();
	private final long a;
	private final long b;
	private final String c;
	private final String d;
	private final long e;

	static 
	{
	//    0    0:new             #17  <Class com.google.android.gms.cast.aj>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void com.google.android.gms.cast.aj()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
