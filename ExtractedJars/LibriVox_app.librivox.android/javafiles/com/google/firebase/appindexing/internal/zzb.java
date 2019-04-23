// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.firebase.appindexing.internal:
//			f

public final class zzb extends AbstractSafeParcelable
{

	zzb(int i, boolean flag, String s, String s1, byte abyte0[], boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AbstractSafeParcelable()>
		a = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field int a>
		a = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #30  <Field int a>
		b = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #32  <Field boolean b>
		c = s;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #34  <Field String c>
		d = s1;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #36  <Field String d>
		e = abyte0;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #38  <Field byte[] e>
		f = flag1;
	//   20   36:aload_0         
	//   21   37:iload           6
	//   22   39:putfield        #40  <Field boolean f>
	//   23   42:return          
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("MetadataImpl { ");
	//    4    9:aload           4
	//    5   11:ldc1            #47  <String "MetadataImpl { ">
	//    6   13:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append("{ eventStatus: '");
	//    8   17:aload           4
	//    9   19:ldc1            #53  <String "{ eventStatus: '">
	//   10   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(a);
	//   12   25:aload           4
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field int a>
	//   15   31:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   16   34:pop             
		stringbuilder.append("' } ");
	//   17   35:aload           4
	//   18   37:ldc1            #58  <String "' } ">
	//   19   39:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
		stringbuilder.append("{ uploadable: '");
	//   21   43:aload           4
	//   22   45:ldc1            #60  <String "{ uploadable: '">
	//   23   47:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		stringbuilder.append(b);
	//   25   51:aload           4
	//   26   53:aload_0         
	//   27   54:getfield        #32  <Field boolean b>
	//   28   57:invokevirtual   #63  <Method StringBuilder StringBuilder.append(boolean)>
	//   29   60:pop             
		stringbuilder.append("' } ");
	//   30   61:aload           4
	//   31   63:ldc1            #58  <String "' } ">
	//   32   65:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
		if(c != null)
	//*  34   69:aload_0         
	//*  35   70:getfield        #34  <Field String c>
	//*  36   73:ifnull          102
		{
			stringbuilder.append("{ completionToken: '");
	//   37   76:aload           4
	//   38   78:ldc1            #65  <String "{ completionToken: '">
	//   39   80:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
			stringbuilder.append(c);
	//   41   84:aload           4
	//   42   86:aload_0         
	//   43   87:getfield        #34  <Field String c>
	//   44   90:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   45   93:pop             
			stringbuilder.append("' } ");
	//   46   94:aload           4
	//   47   96:ldc1            #58  <String "' } ">
	//   48   98:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   49  101:pop             
		}
		if(d != null)
	//*  50  102:aload_0         
	//*  51  103:getfield        #36  <Field String d>
	//*  52  106:ifnull          135
		{
			stringbuilder.append("{ accountName: '");
	//   53  109:aload           4
	//   54  111:ldc1            #67  <String "{ accountName: '">
	//   55  113:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   56  116:pop             
			stringbuilder.append(d);
	//   57  117:aload           4
	//   58  119:aload_0         
	//   59  120:getfield        #36  <Field String d>
	//   60  123:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   61  126:pop             
			stringbuilder.append("' } ");
	//   62  127:aload           4
	//   63  129:ldc1            #58  <String "' } ">
	//   64  131:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   65  134:pop             
		}
		if(e != null)
	//*  66  135:aload_0         
	//*  67  136:getfield        #38  <Field byte[] e>
	//*  68  139:ifnull          213
		{
			stringbuilder.append("{ ssbContext: [ ");
	//   69  142:aload           4
	//   70  144:ldc1            #69  <String "{ ssbContext: [ ">
	//   71  146:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   72  149:pop             
			byte abyte0[] = e;
	//   73  150:aload_0         
	//   74  151:getfield        #38  <Field byte[] e>
	//   75  154:astore          5
			int j = abyte0.length;
	//   76  156:aload           5
	//   77  158:arraylength     
	//   78  159:istore_2        
			for(int i = 0; i < j; i++)
	//*  79  160:iconst_0        
	//*  80  161:istore_1        
	//*  81  162:iload_1         
	//*  82  163:iload_2         
	//*  83  164:icmpge          205
			{
				byte byte0 = abyte0[i];
	//   84  167:aload           5
	//   85  169:iload_1         
	//   86  170:baload          
	//   87  171:istore_3        
				stringbuilder.append("0x");
	//   88  172:aload           4
	//   89  174:ldc1            #71  <String "0x">
	//   90  176:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   91  179:pop             
				stringbuilder.append(Integer.toHexString(((int) (byte0))));
	//   92  180:aload           4
	//   93  182:iload_3         
	//   94  183:invokestatic    #77  <Method String Integer.toHexString(int)>
	//   95  186:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   96  189:pop             
				stringbuilder.append(" ");
	//   97  190:aload           4
	//   98  192:ldc1            #79  <String " ">
	//   99  194:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  100  197:pop             
			}

	//  101  198:iload_1         
	//  102  199:iconst_1        
	//  103  200:iadd            
	//  104  201:istore_1        
	//* 105  202:goto            162
			stringbuilder.append("] } ");
	//  106  205:aload           4
	//  107  207:ldc1            #81  <String "] } ">
	//  108  209:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  109  212:pop             
		}
		stringbuilder.append("{ contextOnly: '");
	//  110  213:aload           4
	//  111  215:ldc1            #83  <String "{ contextOnly: '">
	//  112  217:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  113  220:pop             
		stringbuilder.append(f);
	//  114  221:aload           4
	//  115  223:aload_0         
	//  116  224:getfield        #40  <Field boolean f>
	//  117  227:invokevirtual   #63  <Method StringBuilder StringBuilder.append(boolean)>
	//  118  230:pop             
		stringbuilder.append("' } ");
	//  119  231:aload           4
	//  120  233:ldc1            #58  <String "' } ">
	//  121  235:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  122  238:pop             
		stringbuilder.append("}");
	//  123  239:aload           4
	//  124  241:ldc1            #85  <String "}">
	//  125  243:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  126  246:pop             
		return stringbuilder.toString();
	//  127  247:aload           4
	//  128  249:invokevirtual   #87  <Method String StringBuilder.toString()>
	//  129  252:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #94  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field int a>
	//    7   11:invokestatic    #97  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #32  <Field boolean b>
	//   12   20:invokestatic    #100 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #34  <Field String c>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #103 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #36  <Field String d>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #103 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e, false);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #38  <Field byte[] e>
	//   29   49:iconst_0        
	//   30   50:invokestatic    #106 <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f);
	//   31   53:aload_1         
	//   32   54:bipush          6
	//   33   56:aload_0         
	//   34   57:getfield        #40  <Field boolean f>
	//   35   60:invokestatic    #100 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   36   63:aload_1         
	//   37   64:iload_2         
	//   38   65:invokestatic    #108 <Method void c.a(Parcel, int)>
	//   39   68:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new f();
	private int a;
	private final boolean b;
	private final String c;
	private final String d;
	private final byte e[];
	private final boolean f;

	static 
	{
	//    0    0:new             #20  <Class f>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void f()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
