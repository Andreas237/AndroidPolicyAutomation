// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.*;

// Referenced classes of package com.google.android.gms.cast.framework:
//			ae

public class CastOptions extends AbstractSafeParcelable
{

	CastOptions(String s, List list, boolean flag, LaunchOptions launchoptions, boolean flag1, CastMediaOptions castmediaoptions, boolean flag2, 
			double d1, boolean flag3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AbstractSafeParcelable()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          12
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   4    7:aload_1         
	//*   5    8:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   11:ifeq            18
			s1 = "";
	//    7   14:ldc1            #41  <String "">
	//    8   16:astore          12
		a = s1;
	//    9   18:aload_0         
	//   10   19:aload           12
	//   11   21:putfield        #43  <Field String a>
		int j;
		if(list == null)
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       34
			j = 0;
	//   14   28:iconst_0        
	//   15   29:istore          11
		else
	//*  16   31:goto            42
			j = list.size();
	//   17   34:aload_2         
	//   18   35:invokeinterface #49  <Method int List.size()>
	//   19   40:istore          11
		b = ((List) (new ArrayList(j)));
	//   20   42:aload_0         
	//   21   43:new             #51  <Class ArrayList>
	//   22   46:dup             
	//   23   47:iload           11
	//   24   49:invokespecial   #54  <Method void ArrayList(int)>
	//   25   52:putfield        #56  <Field List b>
		if(j > 0)
	//*  26   55:iload           11
	//*  27   57:ifle            71
			b.addAll(((java.util.Collection) (list)));
	//   28   60:aload_0         
	//   29   61:getfield        #56  <Field List b>
	//   30   64:aload_2         
	//   31   65:invokeinterface #60  <Method boolean List.addAll(java.util.Collection)>
	//   32   70:pop             
		c = flag;
	//   33   71:aload_0         
	//   34   72:iload_3         
	//   35   73:putfield        #62  <Field boolean c>
		s = ((String) (launchoptions));
	//   36   76:aload           4
	//   37   78:astore_1        
		if(launchoptions == null)
	//*  38   79:aload           4
	//*  39   81:ifnonnull       92
			s = ((String) (new LaunchOptions()));
	//   40   84:new             #64  <Class LaunchOptions>
	//   41   87:dup             
	//   42   88:invokespecial   #65  <Method void LaunchOptions()>
	//   43   91:astore_1        
		d = ((LaunchOptions) (s));
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:putfield        #67  <Field LaunchOptions d>
		e = flag1;
	//   47   97:aload_0         
	//   48   98:iload           5
	//   49  100:putfield        #69  <Field boolean e>
		f = castmediaoptions;
	//   50  103:aload_0         
	//   51  104:aload           6
	//   52  106:putfield        #71  <Field CastMediaOptions f>
		g = flag2;
	//   53  109:aload_0         
	//   54  110:iload           7
	//   55  112:putfield        #73  <Field boolean g>
		h = d1;
	//   56  115:aload_0         
	//   57  116:dload           8
	//   58  118:putfield        #75  <Field double h>
		i = flag3;
	//   59  121:aload_0         
	//   60  122:iload           10
	//   61  124:putfield        #77  <Field boolean i>
	//   62  127:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String a>
	//    2    4:areturn         
	}

	public List b()
	{
		return Collections.unmodifiableList(b);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List b>
	//    2    4:invokestatic    #85  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public boolean c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean c>
	//    2    4:ireturn         
	}

	public LaunchOptions d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field LaunchOptions d>
	//    2    4:areturn         
	}

	public boolean e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean e>
	//    2    4:ireturn         
	}

	public CastMediaOptions f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field CastMediaOptions f>
	//    2    4:areturn         
	}

	public boolean g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean g>
	//    2    4:ireturn         
	}

	public double h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field double h>
	//    2    4:dreturn         
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		int k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #96  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #98  <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #101 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 3, b(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #103 <Method List b()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #106 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #108 <Method boolean c()>
	//   19   31:invokestatic    #111 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ((android.os.Parcelable) (d())), j, false);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #113 <Method LaunchOptions d()>
	//   24   40:iload_2         
	//   25   41:iconst_0        
	//   26   42:invokestatic    #116 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e());
	//   27   45:aload_1         
	//   28   46:bipush          6
	//   29   48:aload_0         
	//   30   49:invokevirtual   #118 <Method boolean e()>
	//   31   52:invokestatic    #111 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, ((android.os.Parcelable) (f())), j, false);
	//   32   55:aload_1         
	//   33   56:bipush          7
	//   34   58:aload_0         
	//   35   59:invokevirtual   #120 <Method CastMediaOptions f()>
	//   36   62:iload_2         
	//   37   63:iconst_0        
	//   38   64:invokestatic    #116 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, g());
	//   39   67:aload_1         
	//   40   68:bipush          8
	//   41   70:aload_0         
	//   42   71:invokevirtual   #122 <Method boolean g()>
	//   43   74:invokestatic    #111 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h());
	//   44   77:aload_1         
	//   45   78:bipush          9
	//   46   80:aload_0         
	//   47   81:invokevirtual   #124 <Method double h()>
	//   48   84:invokestatic    #127 <Method void c.a(Parcel, int, double)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, i);
	//   49   87:aload_1         
	//   50   88:bipush          10
	//   51   90:aload_0         
	//   52   91:getfield        #77  <Field boolean i>
	//   53   94:invokestatic    #111 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
	//   54   97:aload_1         
	//   55   98:iload_3         
	//   56   99:invokestatic    #129 <Method void c.a(Parcel, int)>
	//   57  102:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ae();
	private String a;
	private final List b;
	private final boolean c;
	private final LaunchOptions d;
	private final boolean e;
	private final CastMediaOptions f;
	private final boolean g;
	private final double h;
	private final boolean i;

	static 
	{
	//    0    0:new             #25  <Class ae>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ae()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
