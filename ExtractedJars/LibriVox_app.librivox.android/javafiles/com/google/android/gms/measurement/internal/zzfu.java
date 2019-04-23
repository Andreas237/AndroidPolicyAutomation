// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			em, en

public final class zzfu extends AbstractSafeParcelable
{

	zzfu(int i, String s, long l, Long long1, Float float1, String s1, 
			String s2, Double double1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AbstractSafeParcelable()>
		g = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field int g>
		a = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field String a>
		b = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #38  <Field long b>
		c = long1;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #40  <Field Long c>
		s = null;
	//   14   25:aconst_null     
	//   15   26:astore_2        
		h = null;
	//   16   27:aload_0         
	//   17   28:aconst_null     
	//   18   29:putfield        #42  <Field Float h>
		if(i == 1)
	//*  19   32:iload_1         
	//*  20   33:iconst_1        
	//*  21   34:icmpne          59
		{
			if(float1 != null)
	//*  22   37:aload           6
	//*  23   39:ifnull          51
				s = ((String) (Double.valueOf(float1.doubleValue())));
	//   24   42:aload           6
	//   25   44:invokevirtual   #48  <Method double Float.doubleValue()>
	//   26   47:invokestatic    #54  <Method Double Double.valueOf(double)>
	//   27   50:astore_2        
			f = ((Double) (s));
	//   28   51:aload_0         
	//   29   52:aload_2         
	//   30   53:putfield        #56  <Field Double f>
		} else
	//*  31   56:goto            65
		{
			f = double1;
	//   32   59:aload_0         
	//   33   60:aload           9
	//   34   62:putfield        #56  <Field Double f>
		}
		d = s1;
	//   35   65:aload_0         
	//   36   66:aload           7
	//   37   68:putfield        #58  <Field String d>
		e = s2;
	//   38   71:aload_0         
	//   39   72:aload           8
	//   40   74:putfield        #60  <Field String e>
	//   41   77:return          
	}

	zzfu(en en1)
	{
		this(en1.c, en1.d, en1.e, en1.b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #65  <Field String com.google.android.gms.measurement.internal.en.c>
	//    3    5:aload_1         
	//    4    6:getfield        #67  <Field long en.d>
	//    5    9:aload_1         
	//    6   10:getfield        #70  <Field Object en.e>
	//    7   13:aload_1         
	//    8   14:getfield        #72  <Field String en.b>
	//    9   17:invokespecial   #75  <Method void zzfu(String, long, Object, String)>
	//   10   20:return          
	}

	zzfu(String s, long l, Object obj, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AbstractSafeParcelable()>
		am.a(s);
	//    2    4:aload_1         
	//    3    5:invokestatic    #80  <Method String am.a(String)>
	//    4    8:pop             
		g = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #34  <Field int g>
		a = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #36  <Field String a>
		b = l;
	//   11   19:aload_0         
	//   12   20:lload_2         
	//   13   21:putfield        #38  <Field long b>
		e = s1;
	//   14   24:aload_0         
	//   15   25:aload           5
	//   16   27:putfield        #60  <Field String e>
		if(obj == null)
	//*  17   30:aload           4
	//*  18   32:ifnonnull       56
		{
			c = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #40  <Field Long c>
			h = null;
	//   22   40:aload_0         
	//   23   41:aconst_null     
	//   24   42:putfield        #42  <Field Float h>
			f = null;
	//   25   45:aload_0         
	//   26   46:aconst_null     
	//   27   47:putfield        #56  <Field Double f>
			d = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #58  <Field String d>
			return;
	//   31   55:return          
		}
		if(obj instanceof Long)
	//*  32   56:aload           4
	//*  33   58:instanceof      #82  <Class Long>
	//*  34   61:ifeq            89
		{
			c = (Long)obj;
	//   35   64:aload_0         
	//   36   65:aload           4
	//   37   67:checkcast       #82  <Class Long>
	//   38   70:putfield        #40  <Field Long c>
			h = null;
	//   39   73:aload_0         
	//   40   74:aconst_null     
	//   41   75:putfield        #42  <Field Float h>
			f = null;
	//   42   78:aload_0         
	//   43   79:aconst_null     
	//   44   80:putfield        #56  <Field Double f>
			d = null;
	//   45   83:aload_0         
	//   46   84:aconst_null     
	//   47   85:putfield        #58  <Field String d>
			return;
	//   48   88:return          
		}
		if(obj instanceof String)
	//*  49   89:aload           4
	//*  50   91:instanceof      #84  <Class String>
	//*  51   94:ifeq            122
		{
			c = null;
	//   52   97:aload_0         
	//   53   98:aconst_null     
	//   54   99:putfield        #40  <Field Long c>
			h = null;
	//   55  102:aload_0         
	//   56  103:aconst_null     
	//   57  104:putfield        #42  <Field Float h>
			f = null;
	//   58  107:aload_0         
	//   59  108:aconst_null     
	//   60  109:putfield        #56  <Field Double f>
			d = (String)obj;
	//   61  112:aload_0         
	//   62  113:aload           4
	//   63  115:checkcast       #84  <Class String>
	//   64  118:putfield        #58  <Field String d>
			return;
	//   65  121:return          
		}
		if(obj instanceof Double)
	//*  66  122:aload           4
	//*  67  124:instanceof      #50  <Class Double>
	//*  68  127:ifeq            155
		{
			c = null;
	//   69  130:aload_0         
	//   70  131:aconst_null     
	//   71  132:putfield        #40  <Field Long c>
			h = null;
	//   72  135:aload_0         
	//   73  136:aconst_null     
	//   74  137:putfield        #42  <Field Float h>
			f = (Double)obj;
	//   75  140:aload_0         
	//   76  141:aload           4
	//   77  143:checkcast       #50  <Class Double>
	//   78  146:putfield        #56  <Field Double f>
			d = null;
	//   79  149:aload_0         
	//   80  150:aconst_null     
	//   81  151:putfield        #58  <Field String d>
			return;
	//   82  154:return          
		} else
		{
			throw new IllegalArgumentException("User attribute given of un-supported type");
	//   83  155:new             #86  <Class IllegalArgumentException>
	//   84  158:dup             
	//   85  159:ldc1            #88  <String "User attribute given of un-supported type">
	//   86  161:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   87  164:athrow          
		}
	}

	public final Object a()
	{
		Object obj = ((Object) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Long c>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return obj;
	//    5    9:aload_1         
	//    6   10:areturn         
		obj = ((Object) (f));
	//    7   11:aload_0         
	//    8   12:getfield        #56  <Field Double f>
	//    9   15:astore_1        
		if(obj != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          22
			return obj;
	//   12   20:aload_1         
	//   13   21:areturn         
		obj = ((Object) (d));
	//   14   22:aload_0         
	//   15   23:getfield        #58  <Field String d>
	//   16   26:astore_1        
		if(obj != null)
	//*  17   27:aload_1         
	//*  18   28:ifnull          33
			return obj;
	//   19   31:aload_1         
	//   20   32:areturn         
		else
			return ((Object) (null));
	//   21   33:aconst_null     
	//   22   34:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #99  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, g);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field int g>
	//    7   11:invokestatic    #102 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #36  <Field String a>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #105 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #38  <Field long b>
	//   18   30:invokestatic    #108 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #40  <Field Long c>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #111 <Method void c.a(Parcel, int, Long, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ((Float) (null)), false);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aconst_null     
	//   28   46:iconst_0        
	//   29   47:invokestatic    #114 <Method void c.a(Parcel, int, Float, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, d, false);
	//   30   50:aload_1         
	//   31   51:bipush          6
	//   32   53:aload_0         
	//   33   54:getfield        #58  <Field String d>
	//   34   57:iconst_0        
	//   35   58:invokestatic    #105 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, e, false);
	//   36   61:aload_1         
	//   37   62:bipush          7
	//   38   64:aload_0         
	//   39   65:getfield        #60  <Field String e>
	//   40   68:iconst_0        
	//   41   69:invokestatic    #105 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, f, false);
	//   42   72:aload_1         
	//   43   73:bipush          8
	//   44   75:aload_0         
	//   45   76:getfield        #56  <Field Double f>
	//   46   79:iconst_0        
	//   47   80:invokestatic    #117 <Method void c.a(Parcel, int, Double, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   48   83:aload_1         
	//   49   84:iload_2         
	//   50   85:invokestatic    #119 <Method void c.a(Parcel, int)>
	//   51   88:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new em();
	public final String a;
	public final long b;
	public final Long c;
	public final String d;
	public final String e;
	public final Double f;
	private final int g;
	private final Float h;

	static 
	{
	//    0    0:new             #24  <Class em>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void em()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
