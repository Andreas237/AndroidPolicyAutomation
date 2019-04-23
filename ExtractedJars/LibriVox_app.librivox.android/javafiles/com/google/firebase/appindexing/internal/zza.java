// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.firebase.appindexing.internal:
//			c, zzb

public final class zza extends AbstractSafeParcelable
{

	public zza(String s, String s1, String s2, String s3, zzb zzb1, String s4, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field String b>
		c = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field String c>
		d = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field String d>
		e = zzb1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #38  <Field zzb e>
		f = s4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #40  <Field String f>
		if(bundle != null)
	//*  20   37:aload           7
	//*  21   39:ifnull          51
			g = bundle;
	//   22   42:aload_0         
	//   23   43:aload           7
	//   24   45:putfield        #42  <Field Bundle g>
		else
	//*  25   48:goto            58
			g = Bundle.EMPTY;
	//   26   51:aload_0         
	//   27   52:getstatic       #47  <Field Bundle Bundle.EMPTY>
	//   28   55:putfield        #42  <Field Bundle g>
		g.setClassLoader(((Object)this).getClass().getClassLoader());
	//   29   58:aload_0         
	//   30   59:getfield        #42  <Field Bundle g>
	//   31   62:aload_0         
	//   32   63:invokevirtual   #53  <Method Class Object.getClass()>
	//   33   66:invokevirtual   #59  <Method ClassLoader Class.getClassLoader()>
	//   34   69:invokevirtual   #63  <Method void Bundle.setClassLoader(ClassLoader)>
	//   35   72:return          
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ActionImpl { ");
	//    4    8:aload_1         
	//    5    9:ldc1            #70  <String "ActionImpl { ">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("{ actionType: '");
	//    8   15:aload_1         
	//    9   16:ldc1            #76  <String "{ actionType: '">
	//   10   18:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(a);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #30  <Field String a>
	//   15   27:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append("' } ");
	//   17   31:aload_1         
	//   18   32:ldc1            #78  <String "' } ">
	//   19   34:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append("{ objectName: '");
	//   21   38:aload_1         
	//   22   39:ldc1            #80  <String "{ objectName: '">
	//   23   41:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
		stringbuilder.append(b);
	//   25   45:aload_1         
	//   26   46:aload_0         
	//   27   47:getfield        #32  <Field String b>
	//   28   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append("' } ");
	//   30   54:aload_1         
	//   31   55:ldc1            #78  <String "' } ">
	//   32   57:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
		stringbuilder.append("{ objectUrl: '");
	//   34   61:aload_1         
	//   35   62:ldc1            #82  <String "{ objectUrl: '">
	//   36   64:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
		stringbuilder.append(c);
	//   38   68:aload_1         
	//   39   69:aload_0         
	//   40   70:getfield        #34  <Field String c>
	//   41   73:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   42   76:pop             
		stringbuilder.append("' } ");
	//   43   77:aload_1         
	//   44   78:ldc1            #78  <String "' } ">
	//   45   80:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
		if(d != null)
	//*  47   84:aload_0         
	//*  48   85:getfield        #36  <Field String d>
	//*  49   88:ifnull          114
		{
			stringbuilder.append("{ objectSameAs: '");
	//   50   91:aload_1         
	//   51   92:ldc1            #84  <String "{ objectSameAs: '">
	//   52   94:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   53   97:pop             
			stringbuilder.append(d);
	//   54   98:aload_1         
	//   55   99:aload_0         
	//   56  100:getfield        #36  <Field String d>
	//   57  103:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
			stringbuilder.append("' } ");
	//   59  107:aload_1         
	//   60  108:ldc1            #78  <String "' } ">
	//   61  110:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   62  113:pop             
		}
		if(e != null)
	//*  63  114:aload_0         
	//*  64  115:getfield        #38  <Field zzb e>
	//*  65  118:ifnull          147
		{
			stringbuilder.append("{ metadata: '");
	//   66  121:aload_1         
	//   67  122:ldc1            #86  <String "{ metadata: '">
	//   68  124:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   69  127:pop             
			stringbuilder.append(e.toString());
	//   70  128:aload_1         
	//   71  129:aload_0         
	//   72  130:getfield        #38  <Field zzb e>
	//   73  133:invokevirtual   #90  <Method String zzb.toString()>
	//   74  136:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   75  139:pop             
			stringbuilder.append("' } ");
	//   76  140:aload_1         
	//   77  141:ldc1            #78  <String "' } ">
	//   78  143:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   79  146:pop             
		}
		if(f != null)
	//*  80  147:aload_0         
	//*  81  148:getfield        #40  <Field String f>
	//*  82  151:ifnull          177
		{
			stringbuilder.append("{ actionStatus: '");
	//   83  154:aload_1         
	//   84  155:ldc1            #92  <String "{ actionStatus: '">
	//   85  157:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   86  160:pop             
			stringbuilder.append(f);
	//   87  161:aload_1         
	//   88  162:aload_0         
	//   89  163:getfield        #40  <Field String f>
	//   90  166:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   91  169:pop             
			stringbuilder.append("' } ");
	//   92  170:aload_1         
	//   93  171:ldc1            #78  <String "' } ">
	//   94  173:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   95  176:pop             
		}
		if(!g.isEmpty())
	//*  96  177:aload_0         
	//*  97  178:getfield        #42  <Field Bundle g>
	//*  98  181:invokevirtual   #96  <Method boolean Bundle.isEmpty()>
	//*  99  184:ifne            210
		{
			stringbuilder.append("{ ");
	//  100  187:aload_1         
	//  101  188:ldc1            #98  <String "{ ">
	//  102  190:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  103  193:pop             
			stringbuilder.append(((Object) (g)));
	//  104  194:aload_1         
	//  105  195:aload_0         
	//  106  196:getfield        #42  <Field Bundle g>
	//  107  199:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//  108  202:pop             
			stringbuilder.append(" } ");
	//  109  203:aload_1         
	//  110  204:ldc1            #103 <String " } ">
	//  111  206:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  112  209:pop             
		}
		stringbuilder.append("}");
	//  113  210:aload_1         
	//  114  211:ldc1            #105 <String "}">
	//  115  213:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  116  216:pop             
		return stringbuilder.toString();
	//  117  217:aload_1         
	//  118  218:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  119  221:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #113 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #116 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #32  <Field String b>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #116 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #34  <Field String c>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #116 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:getfield        #36  <Field String d>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #116 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ((android.os.Parcelable) (e)), i, false);
	//   27   45:aload_1         
	//   28   46:iconst_5        
	//   29   47:aload_0         
	//   30   48:getfield        #38  <Field zzb e>
	//   31   51:iload_2         
	//   32   52:iconst_0        
	//   33   53:invokestatic    #119 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f, false);
	//   34   56:aload_1         
	//   35   57:bipush          6
	//   36   59:aload_0         
	//   37   60:getfield        #40  <Field String f>
	//   38   63:iconst_0        
	//   39   64:invokestatic    #116 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g, false);
	//   40   67:aload_1         
	//   41   68:bipush          7
	//   42   70:aload_0         
	//   43   71:getfield        #42  <Field Bundle g>
	//   44   74:iconst_0        
	//   45   75:invokestatic    #122 <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   46   78:aload_1         
	//   47   79:iload_3         
	//   48   80:invokestatic    #124 <Method void c.a(Parcel, int)>
	//   49   83:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.firebase.appindexing.internal.c();
	private final String a;
	private final String b;
	private final String c;
	private final String d;
	private final zzb e;
	private final String f;
	private final Bundle g;

	static 
	{
	//    0    0:new             #20  <Class com.google.firebase.appindexing.internal.c>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void com.google.firebase.appindexing.internal.c()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
