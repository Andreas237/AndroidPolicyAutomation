// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bdf, zzqi, zzhp, zzki, 
//			bnw

public final class zzfs
	implements Parcelable
{

	zzfs(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #62  <Method String Parcel.readString()>
	//    5    9:putfield        #64  <Field String a>
		d = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #62  <Method String Parcel.readString()>
	//    9   17:putfield        #66  <Field String d>
		e = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #62  <Method String Parcel.readString()>
	//   13   25:putfield        #68  <Field String e>
		c = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #62  <Method String Parcel.readString()>
	//   17   33:putfield        #70  <Field String c>
		b = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #74  <Method int Parcel.readInt()>
	//   21   41:putfield        #76  <Field int b>
		f = parcel.readInt();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #74  <Method int Parcel.readInt()>
	//   25   49:putfield        #78  <Field int f>
		i = parcel.readInt();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #74  <Method int Parcel.readInt()>
	//   29   57:putfield        #80  <Field int i>
		j = parcel.readInt();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #74  <Method int Parcel.readInt()>
	//   33   65:putfield        #82  <Field int j>
		k = parcel.readFloat();
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #86  <Method float Parcel.readFloat()>
	//   37   73:putfield        #88  <Field float k>
		l = parcel.readInt();
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokevirtual   #74  <Method int Parcel.readInt()>
	//   41   81:putfield        #90  <Field int l>
		m = parcel.readFloat();
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #86  <Method float Parcel.readFloat()>
	//   45   89:putfield        #92  <Field float m>
		int i1 = parcel.readInt();
	//   46   92:aload_1         
	//   47   93:invokevirtual   #74  <Method int Parcel.readInt()>
	//   48   96:istore_2        
		boolean flag1 = false;
	//   49   97:iconst_0        
	//   50   98:istore_3        
		boolean flag;
		if(i1 != 0)
	//*  51   99:iload_2         
	//*  52  100:ifeq            108
			flag = true;
	//   53  103:iconst_1        
	//   54  104:istore_2        
		else
	//*  55  105:goto            110
			flag = false;
	//   56  108:iconst_0        
	//   57  109:istore_2        
		byte abyte0[];
		if(flag)
	//*  58  110:iload_2         
	//*  59  111:ifeq            123
			abyte0 = parcel.createByteArray();
	//   60  114:aload_1         
	//   61  115:invokevirtual   #96  <Method byte[] Parcel.createByteArray()>
	//   62  118:astore          5
		else
	//*  63  120:goto            126
			abyte0 = null;
	//   64  123:aconst_null     
	//   65  124:astore          5
		v = abyte0;
	//   66  126:aload_0         
	//   67  127:aload           5
	//   68  129:putfield        #98  <Field byte[] v>
		u = parcel.readInt();
	//   69  132:aload_0         
	//   70  133:aload_1         
	//   71  134:invokevirtual   #74  <Method int Parcel.readInt()>
	//   72  137:putfield        #100 <Field int u>
		w = (zzqi)parcel.readParcelable(((Class) (com/google/android/gms/internal/ads/zzqi)).getClassLoader());
	//   73  140:aload_0         
	//   74  141:aload_1         
	//   75  142:ldc1            #102 <Class zzqi>
	//   76  144:invokevirtual   #108 <Method ClassLoader Class.getClassLoader()>
	//   77  147:invokevirtual   #112 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   78  150:checkcast       #102 <Class zzqi>
	//   79  153:putfield        #114 <Field zzqi w>
		n = parcel.readInt();
	//   80  156:aload_0         
	//   81  157:aload_1         
	//   82  158:invokevirtual   #74  <Method int Parcel.readInt()>
	//   83  161:putfield        #116 <Field int n>
		o = parcel.readInt();
	//   84  164:aload_0         
	//   85  165:aload_1         
	//   86  166:invokevirtual   #74  <Method int Parcel.readInt()>
	//   87  169:putfield        #118 <Field int o>
		p = parcel.readInt();
	//   88  172:aload_0         
	//   89  173:aload_1         
	//   90  174:invokevirtual   #74  <Method int Parcel.readInt()>
	//   91  177:putfield        #120 <Field int p>
		x = parcel.readInt();
	//   92  180:aload_0         
	//   93  181:aload_1         
	//   94  182:invokevirtual   #74  <Method int Parcel.readInt()>
	//   95  185:putfield        #122 <Field int x>
		y = parcel.readInt();
	//   96  188:aload_0         
	//   97  189:aload_1         
	//   98  190:invokevirtual   #74  <Method int Parcel.readInt()>
	//   99  193:putfield        #124 <Field int y>
		r = parcel.readInt();
	//  100  196:aload_0         
	//  101  197:aload_1         
	//  102  198:invokevirtual   #74  <Method int Parcel.readInt()>
	//  103  201:putfield        #126 <Field int r>
		s = parcel.readString();
	//  104  204:aload_0         
	//  105  205:aload_1         
	//  106  206:invokevirtual   #62  <Method String Parcel.readString()>
	//  107  209:putfield        #128 <Field String s>
		z = parcel.readInt();
	//  108  212:aload_0         
	//  109  213:aload_1         
	//  110  214:invokevirtual   #74  <Method int Parcel.readInt()>
	//  111  217:putfield        #130 <Field int z>
		q = parcel.readLong();
	//  112  220:aload_0         
	//  113  221:aload_1         
	//  114  222:invokevirtual   #134 <Method long Parcel.readLong()>
	//  115  225:putfield        #136 <Field long q>
		int k1 = parcel.readInt();
	//  116  228:aload_1         
	//  117  229:invokevirtual   #74  <Method int Parcel.readInt()>
	//  118  232:istore          4
		g = ((List) (new ArrayList(k1)));
	//  119  234:aload_0         
	//  120  235:new             #138 <Class ArrayList>
	//  121  238:dup             
	//  122  239:iload           4
	//  123  241:invokespecial   #141 <Method void ArrayList(int)>
	//  124  244:putfield        #143 <Field List g>
		for(int j1 = ((int) (flag1)); j1 < k1; j1++)
	//* 125  247:iload_3         
	//* 126  248:istore_2        
	//* 127  249:iload_2         
	//* 128  250:iload           4
	//* 129  252:icmpge          276
			g.add(((Object) (parcel.createByteArray())));
	//  130  255:aload_0         
	//  131  256:getfield        #143 <Field List g>
	//  132  259:aload_1         
	//  133  260:invokevirtual   #96  <Method byte[] Parcel.createByteArray()>
	//  134  263:invokeinterface #149 <Method boolean List.add(Object)>
	//  135  268:pop             

	//  136  269:iload_2         
	//  137  270:iconst_1        
	//  138  271:iadd            
	//  139  272:istore_2        
	//* 140  273:goto            249
		h = (zzhp)parcel.readParcelable(((Class) (com/google/android/gms/internal/ads/zzhp)).getClassLoader());
	//  141  276:aload_0         
	//  142  277:aload_1         
	//  143  278:ldc1            #151 <Class zzhp>
	//  144  280:invokevirtual   #108 <Method ClassLoader Class.getClassLoader()>
	//  145  283:invokevirtual   #112 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//  146  286:checkcast       #151 <Class zzhp>
	//  147  289:putfield        #153 <Field zzhp h>
		t = (zzki)parcel.readParcelable(((Class) (com/google/android/gms/internal/ads/zzki)).getClassLoader());
	//  148  292:aload_0         
	//  149  293:aload_1         
	//  150  294:ldc1            #155 <Class zzki>
	//  151  296:invokevirtual   #108 <Method ClassLoader Class.getClassLoader()>
	//  152  299:invokevirtual   #112 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//  153  302:checkcast       #155 <Class zzki>
	//  154  305:putfield        #157 <Field zzki t>
	//  155  308:return          
	}

	private zzfs(String s1, String s2, String s3, String s4, int i1, int j1, int k1, 
			int l1, float f1, int i2, float f2, byte abyte0[], int j2, zzqi zzqi1, 
			int k2, int l2, int i3, int j3, int k3, int l3, String s5, 
			int i4, long l4, List list, zzhp zzhp1, zzki zzki1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		a = s1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #64  <Field String a>
		d = s2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #66  <Field String d>
		e = s3;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #68  <Field String e>
		c = s4;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #70  <Field String c>
		b = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #76  <Field int b>
		f = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #78  <Field int f>
		i = k1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #80  <Field int i>
		j = l1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #82  <Field int j>
		k = f1;
	//   26   49:aload_0         
	//   27   50:fload           9
	//   28   52:putfield        #88  <Field float k>
		l = i2;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #90  <Field int l>
		m = f2;
	//   32   61:aload_0         
	//   33   62:fload           11
	//   34   64:putfield        #92  <Field float m>
		v = abyte0;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #98  <Field byte[] v>
		u = j2;
	//   38   73:aload_0         
	//   39   74:iload           13
	//   40   76:putfield        #100 <Field int u>
		w = zzqi1;
	//   41   79:aload_0         
	//   42   80:aload           14
	//   43   82:putfield        #114 <Field zzqi w>
		n = k2;
	//   44   85:aload_0         
	//   45   86:iload           15
	//   46   88:putfield        #116 <Field int n>
		o = l2;
	//   47   91:aload_0         
	//   48   92:iload           16
	//   49   94:putfield        #118 <Field int o>
		p = i3;
	//   50   97:aload_0         
	//   51   98:iload           17
	//   52  100:putfield        #120 <Field int p>
		x = j3;
	//   53  103:aload_0         
	//   54  104:iload           18
	//   55  106:putfield        #122 <Field int x>
		y = k3;
	//   56  109:aload_0         
	//   57  110:iload           19
	//   58  112:putfield        #124 <Field int y>
		r = l3;
	//   59  115:aload_0         
	//   60  116:iload           20
	//   61  118:putfield        #126 <Field int r>
		s = s5;
	//   62  121:aload_0         
	//   63  122:aload           21
	//   64  124:putfield        #128 <Field String s>
		z = i4;
	//   65  127:aload_0         
	//   66  128:iload           22
	//   67  130:putfield        #130 <Field int z>
		q = l4;
	//   68  133:aload_0         
	//   69  134:lload           23
	//   70  136:putfield        #136 <Field long q>
		if(list == null)
	//*  71  139:aload           25
	//*  72  141:ifnonnull       152
			list = Collections.emptyList();
	//   73  144:invokestatic    #164 <Method List Collections.emptyList()>
	//   74  147:astore          25
	//*  75  149:goto            152
		g = list;
	//   76  152:aload_0         
	//   77  153:aload           25
	//   78  155:putfield        #143 <Field List g>
		h = zzhp1;
	//   79  158:aload_0         
	//   80  159:aload           26
	//   81  161:putfield        #153 <Field zzhp h>
		t = zzki1;
	//   82  164:aload_0         
	//   83  165:aload           27
	//   84  167:putfield        #157 <Field zzki t>
	//   85  170:return          
	}

	public static zzfs a(String s1, String s2, long l1)
	{
		return new zzfs(((String) (null)), ((String) (null)), s2, ((String) (null)), -1, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), -1, -1, -1, -1, -1, 0, ((String) (null)), -1, 0xffffffffL, ((List) (null)), ((zzhp) (null)), ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_m1       
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #166 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:ldc1            #166 <Float -1F>
	//   13   17:aconst_null     
	//   14   18:iconst_m1       
	//   15   19:aconst_null     
	//   16   20:iconst_m1       
	//   17   21:iconst_m1       
	//   18   22:iconst_m1       
	//   19   23:iconst_m1       
	//   20   24:iconst_m1       
	//   21   25:iconst_0        
	//   22   26:aconst_null     
	//   23   27:iconst_m1       
	//   24   28:ldc2w           #167 <Long 0xffffffffL>
	//   25   31:aconst_null     
	//   26   32:aconst_null     
	//   27   33:aconst_null     
	//   28   34:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   37:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, int i1, int j1, int k1, int l1, float f1, 
			List list, int i2, float f2, byte abyte0[], int j2, zzqi zzqi1, zzhp zzhp1)
	{
		return new zzfs(s1, ((String) (null)), s2, ((String) (null)), -1, j1, k1, l1, -1F, i2, f2, abyte0, j2, zzqi1, -1, -1, -1, -1, -1, 0, ((String) (null)), -1, 0xffffffffL, list, zzhp1, ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_m1       
	//    7    9:iload           4
	//    8   11:iload           5
	//    9   13:iload           6
	//   10   15:ldc1            #166 <Float -1F>
	//   11   17:iload           9
	//   12   19:fload           10
	//   13   21:aload           11
	//   14   23:iload           12
	//   15   25:aload           13
	//   16   27:iconst_m1       
	//   17   28:iconst_m1       
	//   18   29:iconst_m1       
	//   19   30:iconst_m1       
	//   20   31:iconst_m1       
	//   21   32:iconst_0        
	//   22   33:aconst_null     
	//   23   34:iconst_m1       
	//   24   35:ldc2w           #167 <Long 0xffffffffL>
	//   25   38:aload           8
	//   26   40:aload           14
	//   27   42:aconst_null     
	//   28   43:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   46:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, int i1, int j1, int k1, int l1, int i2, 
			List list, zzhp zzhp1, int j2, String s4)
	{
		return new zzfs(s1, ((String) (null)), s2, ((String) (null)), -1, j1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), k1, l1, i2, -1, -1, j2, s4, -1, 0xffffffffL, list, zzhp1, ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_m1       
	//    7    9:iload           4
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #166 <Float -1F>
	//   11   15:iconst_m1       
	//   12   16:ldc1            #166 <Float -1F>
	//   13   18:aconst_null     
	//   14   19:iconst_m1       
	//   15   20:aconst_null     
	//   16   21:iload           5
	//   17   23:iload           6
	//   18   25:iload           7
	//   19   27:iconst_m1       
	//   20   28:iconst_m1       
	//   21   29:iload           10
	//   22   31:aload           11
	//   23   33:iconst_m1       
	//   24   34:ldc2w           #167 <Long 0xffffffffL>
	//   25   37:aload           8
	//   26   39:aload           9
	//   27   41:aconst_null     
	//   28   42:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   45:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, int i1, int j1, int k1, int l1, List list, 
			zzhp zzhp1, int i2, String s4)
	{
		return a(s1, s2, ((String) (null)), -1, -1, k1, l1, -1, ((List) (null)), zzhp1, 0, s4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_m1       
	//    4    4:iconst_m1       
	//    5    5:iload           5
	//    6    7:iload           6
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aload           8
	//   10   13:iconst_0        
	//   11   14:aload           10
	//   12   16:invokestatic    #175 <Method zzfs a(String, String, String, int, int, int, int, int, List, zzhp, int, String)>
	//   13   19:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, int i1, int j1, String s4, int k1, zzhp zzhp1, 
			long l1, List list)
	{
		return new zzfs(s1, ((String) (null)), s2, ((String) (null)), -1, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), -1, -1, -1, -1, -1, j1, s4, -1, l1, list, zzhp1, ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_m1       
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #166 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:ldc1            #166 <Float -1F>
	//   13   17:aconst_null     
	//   14   18:iconst_m1       
	//   15   19:aconst_null     
	//   16   20:iconst_m1       
	//   17   21:iconst_m1       
	//   18   22:iconst_m1       
	//   19   23:iconst_m1       
	//   20   24:iconst_m1       
	//   21   25:iload           4
	//   22   27:aload           5
	//   23   29:iconst_m1       
	//   24   30:lload           8
	//   25   32:aload           10
	//   26   34:aload           7
	//   27   36:aconst_null     
	//   28   37:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   40:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, int i1, int j1, String s4, zzhp zzhp1)
	{
		return a(s1, s2, ((String) (null)), -1, j1, s4, -1, zzhp1, 0xffffffffL, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_m1       
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iconst_m1       
	//    7    9:aload           6
	//    8   11:ldc2w           #167 <Long 0xffffffffL>
	//    9   14:invokestatic    #164 <Method List Collections.emptyList()>
	//   10   17:invokestatic    #179 <Method zzfs a(String, String, String, int, int, String, int, zzhp, long, List)>
	//   11   20:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, int i1, zzhp zzhp1)
	{
		return new zzfs(s1, ((String) (null)), s2, ((String) (null)), -1, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), -1, -1, -1, -1, -1, 0, ((String) (null)), -1, 0xffffffffL, ((List) (null)), zzhp1, ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_m1       
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #166 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:ldc1            #166 <Float -1F>
	//   13   17:aconst_null     
	//   14   18:iconst_m1       
	//   15   19:aconst_null     
	//   16   20:iconst_m1       
	//   17   21:iconst_m1       
	//   18   22:iconst_m1       
	//   19   23:iconst_m1       
	//   20   24:iconst_m1       
	//   21   25:iconst_0        
	//   22   26:aconst_null     
	//   23   27:iconst_m1       
	//   24   28:ldc2w           #167 <Long 0xffffffffL>
	//   25   31:aconst_null     
	//   26   32:aload           4
	//   27   34:aconst_null     
	//   28   35:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   38:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, int i1, List list, String s4, zzhp zzhp1)
	{
		return new zzfs(s1, ((String) (null)), s2, ((String) (null)), -1, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), -1, -1, -1, -1, -1, 0, s4, -1, 0xffffffffL, list, zzhp1, ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:iconst_m1       
	//    7    9:iconst_m1       
	//    8   10:iconst_m1       
	//    9   11:iconst_m1       
	//   10   12:ldc1            #166 <Float -1F>
	//   11   14:iconst_m1       
	//   12   15:ldc1            #166 <Float -1F>
	//   13   17:aconst_null     
	//   14   18:iconst_m1       
	//   15   19:aconst_null     
	//   16   20:iconst_m1       
	//   17   21:iconst_m1       
	//   18   22:iconst_m1       
	//   19   23:iconst_m1       
	//   20   24:iconst_m1       
	//   21   25:iconst_0        
	//   22   26:aload           5
	//   23   28:iconst_m1       
	//   24   29:ldc2w           #167 <Long 0xffffffffL>
	//   25   32:aload           4
	//   26   34:aload           6
	//   27   36:aconst_null     
	//   28   37:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   40:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, String s4, int i1, int j1, int k1, float f1, 
			List list, int l1)
	{
		return new zzfs(s1, s2, s3, s4, i1, -1, j1, k1, f1, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), -1, -1, -1, -1, -1, l1, ((String) (null)), -1, 0xffffffffL, ((List) (null)), ((zzhp) (null)), ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iconst_m1       
	//    8   11:iload           5
	//    9   13:iload           6
	//   10   15:fload           7
	//   11   17:iconst_m1       
	//   12   18:ldc1            #166 <Float -1F>
	//   13   20:aconst_null     
	//   14   21:iconst_m1       
	//   15   22:aconst_null     
	//   16   23:iconst_m1       
	//   17   24:iconst_m1       
	//   18   25:iconst_m1       
	//   19   26:iconst_m1       
	//   20   27:iconst_m1       
	//   21   28:iload           9
	//   22   30:aconst_null     
	//   23   31:iconst_m1       
	//   24   32:ldc2w           #167 <Long 0xffffffffL>
	//   25   35:aconst_null     
	//   26   36:aconst_null     
	//   27   37:aconst_null     
	//   28   38:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   41:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, String s4, int i1, int j1, int k1, List list, 
			int l1, String s5)
	{
		return new zzfs(s1, s2, s3, s4, i1, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), j1, k1, -1, -1, -1, l1, s5, -1, 0xffffffffL, ((List) (null)), ((zzhp) (null)), ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iconst_m1       
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #166 <Float -1F>
	//   11   15:iconst_m1       
	//   12   16:ldc1            #166 <Float -1F>
	//   13   18:aconst_null     
	//   14   19:iconst_m1       
	//   15   20:aconst_null     
	//   16   21:iload           5
	//   17   23:iload           6
	//   18   25:iconst_m1       
	//   19   26:iconst_m1       
	//   20   27:iconst_m1       
	//   21   28:iload           8
	//   22   30:aload           9
	//   23   32:iconst_m1       
	//   24   33:ldc2w           #167 <Long 0xffffffffL>
	//   25   36:aconst_null     
	//   26   37:aconst_null     
	//   27   38:aconst_null     
	//   28   39:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   42:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, String s4, int i1, int j1, String s5)
	{
		return new zzfs(s1, s2, s3, s4, i1, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), -1, -1, -1, -1, -1, j1, s5, -1, 0xffffffffL, ((List) (null)), ((zzhp) (null)), ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iconst_m1       
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #166 <Float -1F>
	//   11   15:iconst_m1       
	//   12   16:ldc1            #166 <Float -1F>
	//   13   18:aconst_null     
	//   14   19:iconst_m1       
	//   15   20:aconst_null     
	//   16   21:iconst_m1       
	//   17   22:iconst_m1       
	//   18   23:iconst_m1       
	//   19   24:iconst_m1       
	//   20   25:iconst_m1       
	//   21   26:iload           5
	//   22   28:aload           6
	//   23   30:iconst_m1       
	//   24   31:ldc2w           #167 <Long 0xffffffffL>
	//   25   34:aconst_null     
	//   26   35:aconst_null     
	//   27   36:aconst_null     
	//   28   37:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   40:areturn         
	}

	public static zzfs a(String s1, String s2, String s3, String s4, int i1, int j1, String s5, int k1)
	{
		return new zzfs(s1, s2, s3, s4, i1, -1, -1, -1, -1F, -1, -1F, ((byte []) (null)), -1, ((zzqi) (null)), -1, -1, -1, -1, -1, j1, s5, k1, 0xffffffffL, ((List) (null)), ((zzhp) (null)), ((zzki) (null)));
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iconst_m1       
	//    8   11:iconst_m1       
	//    9   12:iconst_m1       
	//   10   13:ldc1            #166 <Float -1F>
	//   11   15:iconst_m1       
	//   12   16:ldc1            #166 <Float -1F>
	//   13   18:aconst_null     
	//   14   19:iconst_m1       
	//   15   20:aconst_null     
	//   16   21:iconst_m1       
	//   17   22:iconst_m1       
	//   18   23:iconst_m1       
	//   19   24:iconst_m1       
	//   20   25:iconst_m1       
	//   21   26:iload           5
	//   22   28:aload           6
	//   23   30:iload           7
	//   24   32:ldc2w           #167 <Long 0xffffffffL>
	//   25   35:aconst_null     
	//   26   36:aconst_null     
	//   27   37:aconst_null     
	//   28   38:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   29   41:areturn         
	}

	private static void a(MediaFormat mediaformat, String s1, int i1)
	{
		if(i1 != -1)
	//*   0    0:iload_2         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          11
			mediaformat.setInteger(s1, i1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #195 <Method void MediaFormat.setInteger(String, int)>
	//    7   11:return          
	}

	public final int a()
	{
		int i1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int i>
	//    2    4:istore_1        
		if(i1 != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          26
		{
			int j1 = j;
	//    6   10:aload_0         
	//    7   11:getfield        #82  <Field int j>
	//    8   14:istore_2        
			if(j1 == -1)
	//*   9   15:iload_2         
	//*  10   16:iconst_m1       
	//*  11   17:icmpne          22
				return -1;
	//   12   20:iconst_m1       
	//   13   21:ireturn         
			else
				return i1 * j1;
	//   14   22:iload_1         
	//   15   23:iload_2         
	//   16   24:imul            
	//   17   25:ireturn         
		} else
		{
			return -1;
	//   18   26:iconst_m1       
	//   19   27:ireturn         
		}
	}

	public final zzfs a(int i1)
	{
		return new zzfs(a, d, e, c, b, i1, i, j, k, l, m, v, u, w, n, o, p, x, y, r, s, z, q, g, h, t);
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #66  <Field String d>
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field String e>
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field String c>
	//   10   20:aload_0         
	//   11   21:getfield        #76  <Field int b>
	//   12   24:iload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #80  <Field int i>
	//   15   29:aload_0         
	//   16   30:getfield        #82  <Field int j>
	//   17   33:aload_0         
	//   18   34:getfield        #88  <Field float k>
	//   19   37:aload_0         
	//   20   38:getfield        #90  <Field int l>
	//   21   41:aload_0         
	//   22   42:getfield        #92  <Field float m>
	//   23   45:aload_0         
	//   24   46:getfield        #98  <Field byte[] v>
	//   25   49:aload_0         
	//   26   50:getfield        #100 <Field int u>
	//   27   53:aload_0         
	//   28   54:getfield        #114 <Field zzqi w>
	//   29   57:aload_0         
	//   30   58:getfield        #116 <Field int n>
	//   31   61:aload_0         
	//   32   62:getfield        #118 <Field int o>
	//   33   65:aload_0         
	//   34   66:getfield        #120 <Field int p>
	//   35   69:aload_0         
	//   36   70:getfield        #122 <Field int x>
	//   37   73:aload_0         
	//   38   74:getfield        #124 <Field int y>
	//   39   77:aload_0         
	//   40   78:getfield        #126 <Field int r>
	//   41   81:aload_0         
	//   42   82:getfield        #128 <Field String s>
	//   43   85:aload_0         
	//   44   86:getfield        #130 <Field int z>
	//   45   89:aload_0         
	//   46   90:getfield        #136 <Field long q>
	//   47   93:aload_0         
	//   48   94:getfield        #143 <Field List g>
	//   49   97:aload_0         
	//   50   98:getfield        #153 <Field zzhp h>
	//   51  101:aload_0         
	//   52  102:getfield        #157 <Field zzki t>
	//   53  105:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   54  108:areturn         
	}

	public final zzfs a(int i1, int j1)
	{
		return new zzfs(a, d, e, c, b, f, i, j, k, l, m, v, u, w, n, o, p, i1, j1, r, s, z, q, g, h, t);
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #66  <Field String d>
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field String e>
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field String c>
	//   10   20:aload_0         
	//   11   21:getfield        #76  <Field int b>
	//   12   24:aload_0         
	//   13   25:getfield        #78  <Field int f>
	//   14   28:aload_0         
	//   15   29:getfield        #80  <Field int i>
	//   16   32:aload_0         
	//   17   33:getfield        #82  <Field int j>
	//   18   36:aload_0         
	//   19   37:getfield        #88  <Field float k>
	//   20   40:aload_0         
	//   21   41:getfield        #90  <Field int l>
	//   22   44:aload_0         
	//   23   45:getfield        #92  <Field float m>
	//   24   48:aload_0         
	//   25   49:getfield        #98  <Field byte[] v>
	//   26   52:aload_0         
	//   27   53:getfield        #100 <Field int u>
	//   28   56:aload_0         
	//   29   57:getfield        #114 <Field zzqi w>
	//   30   60:aload_0         
	//   31   61:getfield        #116 <Field int n>
	//   32   64:aload_0         
	//   33   65:getfield        #118 <Field int o>
	//   34   68:aload_0         
	//   35   69:getfield        #120 <Field int p>
	//   36   72:iload_1         
	//   37   73:iload_2         
	//   38   74:aload_0         
	//   39   75:getfield        #126 <Field int r>
	//   40   78:aload_0         
	//   41   79:getfield        #128 <Field String s>
	//   42   82:aload_0         
	//   43   83:getfield        #130 <Field int z>
	//   44   86:aload_0         
	//   45   87:getfield        #136 <Field long q>
	//   46   90:aload_0         
	//   47   91:getfield        #143 <Field List g>
	//   48   94:aload_0         
	//   49   95:getfield        #153 <Field zzhp h>
	//   50   98:aload_0         
	//   51   99:getfield        #157 <Field zzki t>
	//   52  102:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   53  105:areturn         
	}

	public final zzfs a(long l1)
	{
		return new zzfs(a, d, e, c, b, f, i, j, k, l, m, v, u, w, n, o, p, x, y, r, s, z, l1, g, h, t);
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #66  <Field String d>
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field String e>
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field String c>
	//   10   20:aload_0         
	//   11   21:getfield        #76  <Field int b>
	//   12   24:aload_0         
	//   13   25:getfield        #78  <Field int f>
	//   14   28:aload_0         
	//   15   29:getfield        #80  <Field int i>
	//   16   32:aload_0         
	//   17   33:getfield        #82  <Field int j>
	//   18   36:aload_0         
	//   19   37:getfield        #88  <Field float k>
	//   20   40:aload_0         
	//   21   41:getfield        #90  <Field int l>
	//   22   44:aload_0         
	//   23   45:getfield        #92  <Field float m>
	//   24   48:aload_0         
	//   25   49:getfield        #98  <Field byte[] v>
	//   26   52:aload_0         
	//   27   53:getfield        #100 <Field int u>
	//   28   56:aload_0         
	//   29   57:getfield        #114 <Field zzqi w>
	//   30   60:aload_0         
	//   31   61:getfield        #116 <Field int n>
	//   32   64:aload_0         
	//   33   65:getfield        #118 <Field int o>
	//   34   68:aload_0         
	//   35   69:getfield        #120 <Field int p>
	//   36   72:aload_0         
	//   37   73:getfield        #122 <Field int x>
	//   38   76:aload_0         
	//   39   77:getfield        #124 <Field int y>
	//   40   80:aload_0         
	//   41   81:getfield        #126 <Field int r>
	//   42   84:aload_0         
	//   43   85:getfield        #128 <Field String s>
	//   44   88:aload_0         
	//   45   89:getfield        #130 <Field int z>
	//   46   92:lload_1         
	//   47   93:aload_0         
	//   48   94:getfield        #143 <Field List g>
	//   49   97:aload_0         
	//   50   98:getfield        #153 <Field zzhp h>
	//   51  101:aload_0         
	//   52  102:getfield        #157 <Field zzki t>
	//   53  105:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   54  108:areturn         
	}

	public final zzfs a(zzfs zzfs1)
	{
		if(this == zzfs1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return this;
	//    3    5:aload_0         
	//    4    6:areturn         
		String s4 = zzfs1.a;
	//    5    7:aload_1         
	//    6    8:getfield        #64  <Field String a>
	//    7   11:astore          10
		String s2 = c;
	//    8   13:aload_0         
	//    9   14:getfield        #70  <Field String c>
	//   10   17:astore          8
		String s1 = s2;
	//   11   19:aload           8
	//   12   21:astore          7
		if(s2 == null)
	//*  13   23:aload           8
	//*  14   25:ifnonnull       34
			s1 = zzfs1.c;
	//   15   28:aload_1         
	//   16   29:getfield        #70  <Field String c>
	//   17   32:astore          7
		int j1 = b;
	//   18   34:aload_0         
	//   19   35:getfield        #76  <Field int b>
	//   20   38:istore          5
		int i1 = j1;
	//   21   40:iload           5
	//   22   42:istore          4
		if(j1 == -1)
	//*  23   44:iload           5
	//*  24   46:iconst_m1       
	//*  25   47:icmpne          56
			i1 = zzfs1.b;
	//   26   50:aload_1         
	//   27   51:getfield        #76  <Field int b>
	//   28   54:istore          4
		float f2 = k;
	//   29   56:aload_0         
	//   30   57:getfield        #88  <Field float k>
	//   31   60:fstore_3        
		float f1 = f2;
	//   32   61:fload_3         
	//   33   62:fstore_2        
		if(f2 == -1F)
	//*  34   63:fload_3         
	//*  35   64:ldc1            #166 <Float -1F>
	//*  36   66:fcmpl           
	//*  37   67:ifne            75
			f1 = zzfs1.k;
	//   38   70:aload_1         
	//   39   71:getfield        #88  <Field float k>
	//   40   74:fstore_2        
		j1 = r;
	//   41   75:aload_0         
	//   42   76:getfield        #126 <Field int r>
	//   43   79:istore          5
		int k1 = zzfs1.r;
	//   44   81:aload_1         
	//   45   82:getfield        #126 <Field int r>
	//   46   85:istore          6
		String s3 = s;
	//   47   87:aload_0         
	//   48   88:getfield        #128 <Field String s>
	//   49   91:astore          9
		s2 = s3;
	//   50   93:aload           9
	//   51   95:astore          8
		if(s3 == null)
	//*  52   97:aload           9
	//*  53   99:ifnonnull       108
			s2 = zzfs1.s;
	//   54  102:aload_1         
	//   55  103:getfield        #128 <Field String s>
	//   56  106:astore          8
		zzfs1 = ((zzfs) (zzfs1.h));
	//   57  108:aload_1         
	//   58  109:getfield        #153 <Field zzhp h>
	//   59  112:astore_1        
		if(zzfs1 == null)
	//*  60  113:aload_1         
	//*  61  114:ifnull          120
	//*  62  117:goto            125
			zzfs1 = ((zzfs) (h));
	//   63  120:aload_0         
	//   64  121:getfield        #153 <Field zzhp h>
	//   65  124:astore_1        
		return new zzfs(s4, d, e, s1, i1, f, i, j, f1, l, m, v, u, w, n, o, p, x, y, j1 | k1, s2, z, q, g, ((zzhp) (zzfs1)), t);
	//   66  125:new             #2   <Class zzfs>
	//   67  128:dup             
	//   68  129:aload           10
	//   69  131:aload_0         
	//   70  132:getfield        #66  <Field String d>
	//   71  135:aload_0         
	//   72  136:getfield        #68  <Field String e>
	//   73  139:aload           7
	//   74  141:iload           4
	//   75  143:aload_0         
	//   76  144:getfield        #78  <Field int f>
	//   77  147:aload_0         
	//   78  148:getfield        #80  <Field int i>
	//   79  151:aload_0         
	//   80  152:getfield        #82  <Field int j>
	//   81  155:fload_2         
	//   82  156:aload_0         
	//   83  157:getfield        #90  <Field int l>
	//   84  160:aload_0         
	//   85  161:getfield        #92  <Field float m>
	//   86  164:aload_0         
	//   87  165:getfield        #98  <Field byte[] v>
	//   88  168:aload_0         
	//   89  169:getfield        #100 <Field int u>
	//   90  172:aload_0         
	//   91  173:getfield        #114 <Field zzqi w>
	//   92  176:aload_0         
	//   93  177:getfield        #116 <Field int n>
	//   94  180:aload_0         
	//   95  181:getfield        #118 <Field int o>
	//   96  184:aload_0         
	//   97  185:getfield        #120 <Field int p>
	//   98  188:aload_0         
	//   99  189:getfield        #122 <Field int x>
	//  100  192:aload_0         
	//  101  193:getfield        #124 <Field int y>
	//  102  196:iload           5
	//  103  198:iload           6
	//  104  200:ior             
	//  105  201:aload           8
	//  106  203:aload_0         
	//  107  204:getfield        #130 <Field int z>
	//  108  207:aload_0         
	//  109  208:getfield        #136 <Field long q>
	//  110  211:aload_0         
	//  111  212:getfield        #143 <Field List g>
	//  112  215:aload_1         
	//  113  216:aload_0         
	//  114  217:getfield        #157 <Field zzki t>
	//  115  220:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//  116  223:areturn         
	}

	public final zzfs a(zzhp zzhp1)
	{
		return new zzfs(a, d, e, c, b, f, i, j, k, l, m, v, u, w, n, o, p, x, y, r, s, z, q, g, zzhp1, t);
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #66  <Field String d>
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field String e>
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field String c>
	//   10   20:aload_0         
	//   11   21:getfield        #76  <Field int b>
	//   12   24:aload_0         
	//   13   25:getfield        #78  <Field int f>
	//   14   28:aload_0         
	//   15   29:getfield        #80  <Field int i>
	//   16   32:aload_0         
	//   17   33:getfield        #82  <Field int j>
	//   18   36:aload_0         
	//   19   37:getfield        #88  <Field float k>
	//   20   40:aload_0         
	//   21   41:getfield        #90  <Field int l>
	//   22   44:aload_0         
	//   23   45:getfield        #92  <Field float m>
	//   24   48:aload_0         
	//   25   49:getfield        #98  <Field byte[] v>
	//   26   52:aload_0         
	//   27   53:getfield        #100 <Field int u>
	//   28   56:aload_0         
	//   29   57:getfield        #114 <Field zzqi w>
	//   30   60:aload_0         
	//   31   61:getfield        #116 <Field int n>
	//   32   64:aload_0         
	//   33   65:getfield        #118 <Field int o>
	//   34   68:aload_0         
	//   35   69:getfield        #120 <Field int p>
	//   36   72:aload_0         
	//   37   73:getfield        #122 <Field int x>
	//   38   76:aload_0         
	//   39   77:getfield        #124 <Field int y>
	//   40   80:aload_0         
	//   41   81:getfield        #126 <Field int r>
	//   42   84:aload_0         
	//   43   85:getfield        #128 <Field String s>
	//   44   88:aload_0         
	//   45   89:getfield        #130 <Field int z>
	//   46   92:aload_0         
	//   47   93:getfield        #136 <Field long q>
	//   48   96:aload_0         
	//   49   97:getfield        #143 <Field List g>
	//   50  100:aload_1         
	//   51  101:aload_0         
	//   52  102:getfield        #157 <Field zzki t>
	//   53  105:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   54  108:areturn         
	}

	public final zzfs a(zzki zzki1)
	{
		return new zzfs(a, d, e, c, b, f, i, j, k, l, m, v, u, w, n, o, p, x, y, r, s, z, q, g, h, zzki1);
	//    0    0:new             #2   <Class zzfs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #66  <Field String d>
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field String e>
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field String c>
	//   10   20:aload_0         
	//   11   21:getfield        #76  <Field int b>
	//   12   24:aload_0         
	//   13   25:getfield        #78  <Field int f>
	//   14   28:aload_0         
	//   15   29:getfield        #80  <Field int i>
	//   16   32:aload_0         
	//   17   33:getfield        #82  <Field int j>
	//   18   36:aload_0         
	//   19   37:getfield        #88  <Field float k>
	//   20   40:aload_0         
	//   21   41:getfield        #90  <Field int l>
	//   22   44:aload_0         
	//   23   45:getfield        #92  <Field float m>
	//   24   48:aload_0         
	//   25   49:getfield        #98  <Field byte[] v>
	//   26   52:aload_0         
	//   27   53:getfield        #100 <Field int u>
	//   28   56:aload_0         
	//   29   57:getfield        #114 <Field zzqi w>
	//   30   60:aload_0         
	//   31   61:getfield        #116 <Field int n>
	//   32   64:aload_0         
	//   33   65:getfield        #118 <Field int o>
	//   34   68:aload_0         
	//   35   69:getfield        #120 <Field int p>
	//   36   72:aload_0         
	//   37   73:getfield        #122 <Field int x>
	//   38   76:aload_0         
	//   39   77:getfield        #124 <Field int y>
	//   40   80:aload_0         
	//   41   81:getfield        #126 <Field int r>
	//   42   84:aload_0         
	//   43   85:getfield        #128 <Field String s>
	//   44   88:aload_0         
	//   45   89:getfield        #130 <Field int z>
	//   46   92:aload_0         
	//   47   93:getfield        #136 <Field long q>
	//   48   96:aload_0         
	//   49   97:getfield        #143 <Field List g>
	//   50  100:aload_0         
	//   51  101:getfield        #153 <Field zzhp h>
	//   52  104:aload_1         
	//   53  105:invokespecial   #170 <Method void zzfs(String, String, String, String, int, int, int, int, float, int, float, byte[], int, zzqi, int, int, int, int, int, int, String, int, long, List, zzhp, zzki)>
	//   54  108:areturn         
	}

	public final MediaFormat b()
	{
		MediaFormat mediaformat = new MediaFormat();
	//    0    0:new             #191 <Class MediaFormat>
	//    1    3:dup             
	//    2    4:invokespecial   #206 <Method void MediaFormat()>
	//    3    7:astore_3        
		mediaformat.setString("mime", e);
	//    4    8:aload_3         
	//    5    9:ldc1            #208 <String "mime">
	//    6   11:aload_0         
	//    7   12:getfield        #68  <Field String e>
	//    8   15:invokevirtual   #212 <Method void MediaFormat.setString(String, String)>
		Object obj = ((Object) (s));
	//    9   18:aload_0         
	//   10   19:getfield        #128 <Field String s>
	//   11   22:astore          4
		if(obj != null)
	//*  12   24:aload           4
	//*  13   26:ifnull          37
			mediaformat.setString("language", ((String) (obj)));
	//   14   29:aload_3         
	//   15   30:ldc1            #214 <String "language">
	//   16   32:aload           4
	//   17   34:invokevirtual   #212 <Method void MediaFormat.setString(String, String)>
		a(mediaformat, "max-input-size", f);
	//   18   37:aload_3         
	//   19   38:ldc1            #216 <String "max-input-size">
	//   20   40:aload_0         
	//   21   41:getfield        #78  <Field int f>
	//   22   44:invokestatic    #218 <Method void a(MediaFormat, String, int)>
		a(mediaformat, "width", i);
	//   23   47:aload_3         
	//   24   48:ldc1            #220 <String "width">
	//   25   50:aload_0         
	//   26   51:getfield        #80  <Field int i>
	//   27   54:invokestatic    #218 <Method void a(MediaFormat, String, int)>
		a(mediaformat, "height", j);
	//   28   57:aload_3         
	//   29   58:ldc1            #222 <String "height">
	//   30   60:aload_0         
	//   31   61:getfield        #82  <Field int j>
	//   32   64:invokestatic    #218 <Method void a(MediaFormat, String, int)>
		float f1 = k;
	//   33   67:aload_0         
	//   34   68:getfield        #88  <Field float k>
	//   35   71:fstore_1        
		if(f1 != -1F)
	//*  36   72:fload_1         
	//*  37   73:ldc1            #166 <Float -1F>
	//*  38   75:fcmpl           
	//*  39   76:ifeq            86
			mediaformat.setFloat("frame-rate", f1);
	//   40   79:aload_3         
	//   41   80:ldc1            #224 <String "frame-rate">
	//   42   82:fload_1         
	//   43   83:invokevirtual   #228 <Method void MediaFormat.setFloat(String, float)>
		a(mediaformat, "rotation-degrees", l);
	//   44   86:aload_3         
	//   45   87:ldc1            #230 <String "rotation-degrees">
	//   46   89:aload_0         
	//   47   90:getfield        #90  <Field int l>
	//   48   93:invokestatic    #218 <Method void a(MediaFormat, String, int)>
		a(mediaformat, "channel-count", n);
	//   49   96:aload_3         
	//   50   97:ldc1            #232 <String "channel-count">
	//   51   99:aload_0         
	//   52  100:getfield        #116 <Field int n>
	//   53  103:invokestatic    #218 <Method void a(MediaFormat, String, int)>
		a(mediaformat, "sample-rate", o);
	//   54  106:aload_3         
	//   55  107:ldc1            #234 <String "sample-rate">
	//   56  109:aload_0         
	//   57  110:getfield        #118 <Field int o>
	//   58  113:invokestatic    #218 <Method void a(MediaFormat, String, int)>
		a(mediaformat, "encoder-delay", x);
	//   59  116:aload_3         
	//   60  117:ldc1            #236 <String "encoder-delay">
	//   61  119:aload_0         
	//   62  120:getfield        #122 <Field int x>
	//   63  123:invokestatic    #218 <Method void a(MediaFormat, String, int)>
		a(mediaformat, "encoder-padding", y);
	//   64  126:aload_3         
	//   65  127:ldc1            #238 <String "encoder-padding">
	//   66  129:aload_0         
	//   67  130:getfield        #124 <Field int y>
	//   68  133:invokestatic    #218 <Method void a(MediaFormat, String, int)>
		for(int i1 = 0; i1 < g.size(); i1++)
	//*  69  136:iconst_0        
	//*  70  137:istore_2        
	//*  71  138:iload_2         
	//*  72  139:aload_0         
	//*  73  140:getfield        #143 <Field List g>
	//*  74  143:invokeinterface #241 <Method int List.size()>
	//*  75  148:icmpge          209
		{
			obj = ((Object) (new StringBuilder(15)));
	//   76  151:new             #243 <Class StringBuilder>
	//   77  154:dup             
	//   78  155:bipush          15
	//   79  157:invokespecial   #244 <Method void StringBuilder(int)>
	//   80  160:astore          4
			((StringBuilder) (obj)).append("csd-");
	//   81  162:aload           4
	//   82  164:ldc1            #246 <String "csd-">
	//   83  166:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   84  169:pop             
			((StringBuilder) (obj)).append(i1);
	//   85  170:aload           4
	//   86  172:iload_2         
	//   87  173:invokevirtual   #253 <Method StringBuilder StringBuilder.append(int)>
	//   88  176:pop             
			mediaformat.setByteBuffer(((StringBuilder) (obj)).toString(), ByteBuffer.wrap((byte[])g.get(i1)));
	//   89  177:aload_3         
	//   90  178:aload           4
	//   91  180:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   92  183:aload_0         
	//   93  184:getfield        #143 <Field List g>
	//   94  187:iload_2         
	//   95  188:invokeinterface #260 <Method Object List.get(int)>
	//   96  193:checkcast       #261 <Class byte[]>
	//   97  196:invokestatic    #267 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   98  199:invokevirtual   #271 <Method void MediaFormat.setByteBuffer(String, ByteBuffer)>
		}

	//   99  202:iload_2         
	//  100  203:iconst_1        
	//  101  204:iadd            
	//  102  205:istore_2        
	//* 103  206:goto            138
		obj = ((Object) (w));
	//  104  209:aload_0         
	//  105  210:getfield        #114 <Field zzqi w>
	//  106  213:astore          4
		if(obj != null)
	//* 107  215:aload           4
	//* 108  217:ifnull          280
		{
			a(mediaformat, "color-transfer", ((zzqi) (obj)).c);
	//  109  220:aload_3         
	//  110  221:ldc2            #273 <String "color-transfer">
	//  111  224:aload           4
	//  112  226:getfield        #275 <Field int zzqi.c>
	//  113  229:invokestatic    #218 <Method void a(MediaFormat, String, int)>
			a(mediaformat, "color-standard", ((zzqi) (obj)).a);
	//  114  232:aload_3         
	//  115  233:ldc2            #277 <String "color-standard">
	//  116  236:aload           4
	//  117  238:getfield        #279 <Field int zzqi.a>
	//  118  241:invokestatic    #218 <Method void a(MediaFormat, String, int)>
			a(mediaformat, "color-range", ((zzqi) (obj)).b);
	//  119  244:aload_3         
	//  120  245:ldc2            #281 <String "color-range">
	//  121  248:aload           4
	//  122  250:getfield        #282 <Field int zzqi.b>
	//  123  253:invokestatic    #218 <Method void a(MediaFormat, String, int)>
			byte abyte0[] = ((zzqi) (obj)).d;
	//  124  256:aload           4
	//  125  258:getfield        #284 <Field byte[] zzqi.d>
	//  126  261:astore          4
			if(abyte0 != null)
	//* 127  263:aload           4
	//* 128  265:ifnull          280
				mediaformat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(abyte0));
	//  129  268:aload_3         
	//  130  269:ldc2            #286 <String "hdr-static-info">
	//  131  272:aload           4
	//  132  274:invokestatic    #267 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//  133  277:invokevirtual   #271 <Method void MediaFormat.setByteBuffer(String, ByteBuffer)>
		}
		return mediaformat;
	//  134  280:aload_3         
	//  135  281:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          417
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #292 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #292 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((zzfs)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzfs>
	//   16   28:astore_1        
			if(b == ((zzfs) (obj)).b && f == ((zzfs) (obj)).f && i == ((zzfs) (obj)).i && j == ((zzfs) (obj)).j && k == ((zzfs) (obj)).k && l == ((zzfs) (obj)).l && m == ((zzfs) (obj)).m && u == ((zzfs) (obj)).u && n == ((zzfs) (obj)).n && o == ((zzfs) (obj)).o && p == ((zzfs) (obj)).p && x == ((zzfs) (obj)).x && y == ((zzfs) (obj)).y && q == ((zzfs) (obj)).q && r == ((zzfs) (obj)).r && bnw.a(((Object) (a)), ((Object) (((zzfs) (obj)).a))) && bnw.a(((Object) (s)), ((Object) (((zzfs) (obj)).s))) && z == ((zzfs) (obj)).z && bnw.a(((Object) (d)), ((Object) (((zzfs) (obj)).d))) && bnw.a(((Object) (e)), ((Object) (((zzfs) (obj)).e))) && bnw.a(((Object) (c)), ((Object) (((zzfs) (obj)).c))) && bnw.a(((Object) (h)), ((Object) (((zzfs) (obj)).h))) && bnw.a(((Object) (t)), ((Object) (((zzfs) (obj)).t))) && bnw.a(((Object) (w)), ((Object) (((zzfs) (obj)).w))) && Arrays.equals(v, ((zzfs) (obj)).v))
	//*  17   29:aload_0         
	//*  18   30:getfield        #76  <Field int b>
	//*  19   33:aload_1         
	//*  20   34:getfield        #76  <Field int b>
	//*  21   37:icmpne          415
	//*  22   40:aload_0         
	//*  23   41:getfield        #78  <Field int f>
	//*  24   44:aload_1         
	//*  25   45:getfield        #78  <Field int f>
	//*  26   48:icmpne          415
	//*  27   51:aload_0         
	//*  28   52:getfield        #80  <Field int i>
	//*  29   55:aload_1         
	//*  30   56:getfield        #80  <Field int i>
	//*  31   59:icmpne          415
	//*  32   62:aload_0         
	//*  33   63:getfield        #82  <Field int j>
	//*  34   66:aload_1         
	//*  35   67:getfield        #82  <Field int j>
	//*  36   70:icmpne          415
	//*  37   73:aload_0         
	//*  38   74:getfield        #88  <Field float k>
	//*  39   77:aload_1         
	//*  40   78:getfield        #88  <Field float k>
	//*  41   81:fcmpl           
	//*  42   82:ifne            415
	//*  43   85:aload_0         
	//*  44   86:getfield        #90  <Field int l>
	//*  45   89:aload_1         
	//*  46   90:getfield        #90  <Field int l>
	//*  47   93:icmpne          415
	//*  48   96:aload_0         
	//*  49   97:getfield        #92  <Field float m>
	//*  50  100:aload_1         
	//*  51  101:getfield        #92  <Field float m>
	//*  52  104:fcmpl           
	//*  53  105:ifne            415
	//*  54  108:aload_0         
	//*  55  109:getfield        #100 <Field int u>
	//*  56  112:aload_1         
	//*  57  113:getfield        #100 <Field int u>
	//*  58  116:icmpne          415
	//*  59  119:aload_0         
	//*  60  120:getfield        #116 <Field int n>
	//*  61  123:aload_1         
	//*  62  124:getfield        #116 <Field int n>
	//*  63  127:icmpne          415
	//*  64  130:aload_0         
	//*  65  131:getfield        #118 <Field int o>
	//*  66  134:aload_1         
	//*  67  135:getfield        #118 <Field int o>
	//*  68  138:icmpne          415
	//*  69  141:aload_0         
	//*  70  142:getfield        #120 <Field int p>
	//*  71  145:aload_1         
	//*  72  146:getfield        #120 <Field int p>
	//*  73  149:icmpne          415
	//*  74  152:aload_0         
	//*  75  153:getfield        #122 <Field int x>
	//*  76  156:aload_1         
	//*  77  157:getfield        #122 <Field int x>
	//*  78  160:icmpne          415
	//*  79  163:aload_0         
	//*  80  164:getfield        #124 <Field int y>
	//*  81  167:aload_1         
	//*  82  168:getfield        #124 <Field int y>
	//*  83  171:icmpne          415
	//*  84  174:aload_0         
	//*  85  175:getfield        #136 <Field long q>
	//*  86  178:aload_1         
	//*  87  179:getfield        #136 <Field long q>
	//*  88  182:lcmp            
	//*  89  183:ifne            415
	//*  90  186:aload_0         
	//*  91  187:getfield        #126 <Field int r>
	//*  92  190:aload_1         
	//*  93  191:getfield        #126 <Field int r>
	//*  94  194:icmpne          415
	//*  95  197:aload_0         
	//*  96  198:getfield        #64  <Field String a>
	//*  97  201:aload_1         
	//*  98  202:getfield        #64  <Field String a>
	//*  99  205:invokestatic    #297 <Method boolean bnw.a(Object, Object)>
	//* 100  208:ifeq            415
	//* 101  211:aload_0         
	//* 102  212:getfield        #128 <Field String s>
	//* 103  215:aload_1         
	//* 104  216:getfield        #128 <Field String s>
	//* 105  219:invokestatic    #297 <Method boolean bnw.a(Object, Object)>
	//* 106  222:ifeq            415
	//* 107  225:aload_0         
	//* 108  226:getfield        #130 <Field int z>
	//* 109  229:aload_1         
	//* 110  230:getfield        #130 <Field int z>
	//* 111  233:icmpne          415
	//* 112  236:aload_0         
	//* 113  237:getfield        #66  <Field String d>
	//* 114  240:aload_1         
	//* 115  241:getfield        #66  <Field String d>
	//* 116  244:invokestatic    #297 <Method boolean bnw.a(Object, Object)>
	//* 117  247:ifeq            415
	//* 118  250:aload_0         
	//* 119  251:getfield        #68  <Field String e>
	//* 120  254:aload_1         
	//* 121  255:getfield        #68  <Field String e>
	//* 122  258:invokestatic    #297 <Method boolean bnw.a(Object, Object)>
	//* 123  261:ifeq            415
	//* 124  264:aload_0         
	//* 125  265:getfield        #70  <Field String c>
	//* 126  268:aload_1         
	//* 127  269:getfield        #70  <Field String c>
	//* 128  272:invokestatic    #297 <Method boolean bnw.a(Object, Object)>
	//* 129  275:ifeq            415
	//* 130  278:aload_0         
	//* 131  279:getfield        #153 <Field zzhp h>
	//* 132  282:aload_1         
	//* 133  283:getfield        #153 <Field zzhp h>
	//* 134  286:invokestatic    #297 <Method boolean bnw.a(Object, Object)>
	//* 135  289:ifeq            415
	//* 136  292:aload_0         
	//* 137  293:getfield        #157 <Field zzki t>
	//* 138  296:aload_1         
	//* 139  297:getfield        #157 <Field zzki t>
	//* 140  300:invokestatic    #297 <Method boolean bnw.a(Object, Object)>
	//* 141  303:ifeq            415
	//* 142  306:aload_0         
	//* 143  307:getfield        #114 <Field zzqi w>
	//* 144  310:aload_1         
	//* 145  311:getfield        #114 <Field zzqi w>
	//* 146  314:invokestatic    #297 <Method boolean bnw.a(Object, Object)>
	//* 147  317:ifeq            415
	//* 148  320:aload_0         
	//* 149  321:getfield        #98  <Field byte[] v>
	//* 150  324:aload_1         
	//* 151  325:getfield        #98  <Field byte[] v>
	//* 152  328:invokestatic    #302 <Method boolean Arrays.equals(byte[], byte[])>
	//* 153  331:ifeq            415
			{
				if(g.size() != ((zzfs) (obj)).g.size())
	//* 154  334:aload_0         
	//* 155  335:getfield        #143 <Field List g>
	//* 156  338:invokeinterface #241 <Method int List.size()>
	//* 157  343:aload_1         
	//* 158  344:getfield        #143 <Field List g>
	//* 159  347:invokeinterface #241 <Method int List.size()>
	//* 160  352:icmpeq          357
					return false;
	//  161  355:iconst_0        
	//  162  356:ireturn         
				for(int i1 = 0; i1 < g.size(); i1++)
	//* 163  357:iconst_0        
	//* 164  358:istore_2        
	//* 165  359:iload_2         
	//* 166  360:aload_0         
	//* 167  361:getfield        #143 <Field List g>
	//* 168  364:invokeinterface #241 <Method int List.size()>
	//* 169  369:icmpge          413
					if(!Arrays.equals((byte[])g.get(i1), (byte[])((zzfs) (obj)).g.get(i1)))
	//* 170  372:aload_0         
	//* 171  373:getfield        #143 <Field List g>
	//* 172  376:iload_2         
	//* 173  377:invokeinterface #260 <Method Object List.get(int)>
	//* 174  382:checkcast       #261 <Class byte[]>
	//* 175  385:aload_1         
	//* 176  386:getfield        #143 <Field List g>
	//* 177  389:iload_2         
	//* 178  390:invokeinterface #260 <Method Object List.get(int)>
	//* 179  395:checkcast       #261 <Class byte[]>
	//* 180  398:invokestatic    #302 <Method boolean Arrays.equals(byte[], byte[])>
	//* 181  401:ifne            406
						return false;
	//  182  404:iconst_0        
	//  183  405:ireturn         

	//  184  406:iload_2         
	//  185  407:iconst_1        
	//  186  408:iadd            
	//  187  409:istore_2        
	//* 188  410:goto            359
				return true;
	//  189  413:iconst_1        
	//  190  414:ireturn         
			} else
			{
				return false;
	//  191  415:iconst_0        
	//  192  416:ireturn         
			}
		} else
		{
			return false;
	//  193  417:iconst_0        
	//  194  418:ireturn         
		}
	}

	public final int hashCode()
	{
		if(A == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #305 <Field int A>
	//*   2    4:ifne            284
		{
			Object obj = ((Object) (a));
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field String a>
	//    5   11:astore          14
			int k2 = 0;
	//    6   13:iconst_0        
	//    7   14:istore          7
			int i1;
			if(obj == null)
	//*   8   16:aload           14
	//*   9   18:ifnonnull       26
				i1 = 0;
	//   10   21:iconst_0        
	//   11   22:istore_1        
			else
	//*  12   23:goto            32
				i1 = ((String) (obj)).hashCode();
	//   13   26:aload           14
	//   14   28:invokevirtual   #309 <Method int String.hashCode()>
	//   15   31:istore_1        
			obj = ((Object) (d));
	//   16   32:aload_0         
	//   17   33:getfield        #66  <Field String d>
	//   18   36:astore          14
			int j1;
			if(obj == null)
	//*  19   38:aload           14
	//*  20   40:ifnonnull       48
				j1 = 0;
	//   21   43:iconst_0        
	//   22   44:istore_2        
			else
	//*  23   45:goto            54
				j1 = ((String) (obj)).hashCode();
	//   24   48:aload           14
	//   25   50:invokevirtual   #309 <Method int String.hashCode()>
	//   26   53:istore_2        
			obj = ((Object) (e));
	//   27   54:aload_0         
	//   28   55:getfield        #68  <Field String e>
	//   29   58:astore          14
			int k1;
			if(obj == null)
	//*  30   60:aload           14
	//*  31   62:ifnonnull       70
				k1 = 0;
	//   32   65:iconst_0        
	//   33   66:istore_3        
			else
	//*  34   67:goto            76
				k1 = ((String) (obj)).hashCode();
	//   35   70:aload           14
	//   36   72:invokevirtual   #309 <Method int String.hashCode()>
	//   37   75:istore_3        
			obj = ((Object) (c));
	//   38   76:aload_0         
	//   39   77:getfield        #70  <Field String c>
	//   40   80:astore          14
			int l1;
			if(obj == null)
	//*  41   82:aload           14
	//*  42   84:ifnonnull       93
				l1 = 0;
	//   43   87:iconst_0        
	//   44   88:istore          4
			else
	//*  45   90:goto            100
				l1 = ((String) (obj)).hashCode();
	//   46   93:aload           14
	//   47   95:invokevirtual   #309 <Method int String.hashCode()>
	//   48   98:istore          4
			int l2 = b;
	//   49  100:aload_0         
	//   50  101:getfield        #76  <Field int b>
	//   51  104:istore          8
			int i3 = i;
	//   52  106:aload_0         
	//   53  107:getfield        #80  <Field int i>
	//   54  110:istore          9
			int j3 = j;
	//   55  112:aload_0         
	//   56  113:getfield        #82  <Field int j>
	//   57  116:istore          10
			int k3 = n;
	//   58  118:aload_0         
	//   59  119:getfield        #116 <Field int n>
	//   60  122:istore          11
			int l3 = o;
	//   61  124:aload_0         
	//   62  125:getfield        #118 <Field int o>
	//   63  128:istore          12
			obj = ((Object) (s));
	//   64  130:aload_0         
	//   65  131:getfield        #128 <Field String s>
	//   66  134:astore          14
			int i2;
			if(obj == null)
	//*  67  136:aload           14
	//*  68  138:ifnonnull       147
				i2 = 0;
	//   69  141:iconst_0        
	//   70  142:istore          5
			else
	//*  71  144:goto            154
				i2 = ((String) (obj)).hashCode();
	//   72  147:aload           14
	//   73  149:invokevirtual   #309 <Method int String.hashCode()>
	//   74  152:istore          5
			int i4 = z;
	//   75  154:aload_0         
	//   76  155:getfield        #130 <Field int z>
	//   77  158:istore          13
			obj = ((Object) (h));
	//   78  160:aload_0         
	//   79  161:getfield        #153 <Field zzhp h>
	//   80  164:astore          14
			int j2;
			if(obj == null)
	//*  81  166:aload           14
	//*  82  168:ifnonnull       177
				j2 = 0;
	//   83  171:iconst_0        
	//   84  172:istore          6
			else
	//*  85  174:goto            184
				j2 = ((zzhp) (obj)).hashCode();
	//   86  177:aload           14
	//   87  179:invokevirtual   #310 <Method int zzhp.hashCode()>
	//   88  182:istore          6
			obj = ((Object) (t));
	//   89  184:aload_0         
	//   90  185:getfield        #157 <Field zzki t>
	//   91  188:astore          14
			if(obj != null)
	//*  92  190:aload           14
	//*  93  192:ifnonnull       198
	//*  94  195:goto            205
				k2 = ((zzki) (obj)).hashCode();
	//   95  198:aload           14
	//   96  200:invokevirtual   #311 <Method int zzki.hashCode()>
	//   97  203:istore          7
			A = ((((((((((((i1 + 527) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i2) * 31 + i4) * 31 + j2) * 31 + k2;
	//   98  205:aload_0         
	//   99  206:iload_1         
	//  100  207:sipush          527
	//  101  210:iadd            
	//  102  211:bipush          31
	//  103  213:imul            
	//  104  214:iload_2         
	//  105  215:iadd            
	//  106  216:bipush          31
	//  107  218:imul            
	//  108  219:iload_3         
	//  109  220:iadd            
	//  110  221:bipush          31
	//  111  223:imul            
	//  112  224:iload           4
	//  113  226:iadd            
	//  114  227:bipush          31
	//  115  229:imul            
	//  116  230:iload           8
	//  117  232:iadd            
	//  118  233:bipush          31
	//  119  235:imul            
	//  120  236:iload           9
	//  121  238:iadd            
	//  122  239:bipush          31
	//  123  241:imul            
	//  124  242:iload           10
	//  125  244:iadd            
	//  126  245:bipush          31
	//  127  247:imul            
	//  128  248:iload           11
	//  129  250:iadd            
	//  130  251:bipush          31
	//  131  253:imul            
	//  132  254:iload           12
	//  133  256:iadd            
	//  134  257:bipush          31
	//  135  259:imul            
	//  136  260:iload           5
	//  137  262:iadd            
	//  138  263:bipush          31
	//  139  265:imul            
	//  140  266:iload           13
	//  141  268:iadd            
	//  142  269:bipush          31
	//  143  271:imul            
	//  144  272:iload           6
	//  145  274:iadd            
	//  146  275:bipush          31
	//  147  277:imul            
	//  148  278:iload           7
	//  149  280:iadd            
	//  150  281:putfield        #305 <Field int A>
		}
		return A;
	//  151  284:aload_0         
	//  152  285:getfield        #305 <Field int A>
	//  153  288:ireturn         
	}

	public final String toString()
	{
		String s1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String a>
	//    2    4:astore          7
		String s2 = d;
	//    3    6:aload_0         
	//    4    7:getfield        #66  <Field String d>
	//    5   10:astore          8
		String s3 = e;
	//    6   12:aload_0         
	//    7   13:getfield        #68  <Field String e>
	//    8   16:astore          9
		int i1 = b;
	//    9   18:aload_0         
	//   10   19:getfield        #76  <Field int b>
	//   11   22:istore_2        
		String s4 = s;
	//   12   23:aload_0         
	//   13   24:getfield        #128 <Field String s>
	//   14   27:astore          10
		int j1 = i;
	//   15   29:aload_0         
	//   16   30:getfield        #80  <Field int i>
	//   17   33:istore_3        
		int k1 = j;
	//   18   34:aload_0         
	//   19   35:getfield        #82  <Field int j>
	//   20   38:istore          4
		float f1 = k;
	//   21   40:aload_0         
	//   22   41:getfield        #88  <Field float k>
	//   23   44:fstore_1        
		int l1 = n;
	//   24   45:aload_0         
	//   25   46:getfield        #116 <Field int n>
	//   26   49:istore          5
		int i2 = o;
	//   27   51:aload_0         
	//   28   52:getfield        #118 <Field int o>
	//   29   55:istore          6
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 100 + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length() + String.valueOf(((Object) (s4))).length());
	//   30   57:new             #243 <Class StringBuilder>
	//   31   60:dup             
	//   32   61:aload           7
	//   33   63:invokestatic    #315 <Method String String.valueOf(Object)>
	//   34   66:invokevirtual   #318 <Method int String.length()>
	//   35   69:bipush          100
	//   36   71:iadd            
	//   37   72:aload           8
	//   38   74:invokestatic    #315 <Method String String.valueOf(Object)>
	//   39   77:invokevirtual   #318 <Method int String.length()>
	//   40   80:iadd            
	//   41   81:aload           9
	//   42   83:invokestatic    #315 <Method String String.valueOf(Object)>
	//   43   86:invokevirtual   #318 <Method int String.length()>
	//   44   89:iadd            
	//   45   90:aload           10
	//   46   92:invokestatic    #315 <Method String String.valueOf(Object)>
	//   47   95:invokevirtual   #318 <Method int String.length()>
	//   48   98:iadd            
	//   49   99:invokespecial   #244 <Method void StringBuilder(int)>
	//   50  102:astore          11
		stringbuilder.append("Format(");
	//   51  104:aload           11
	//   52  106:ldc2            #320 <String "Format(">
	//   53  109:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   54  112:pop             
		stringbuilder.append(s1);
	//   55  113:aload           11
	//   56  115:aload           7
	//   57  117:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
		stringbuilder.append(", ");
	//   59  121:aload           11
	//   60  123:ldc2            #322 <String ", ">
	//   61  126:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   62  129:pop             
		stringbuilder.append(s2);
	//   63  130:aload           11
	//   64  132:aload           8
	//   65  134:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   66  137:pop             
		stringbuilder.append(", ");
	//   67  138:aload           11
	//   68  140:ldc2            #322 <String ", ">
	//   69  143:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   70  146:pop             
		stringbuilder.append(s3);
	//   71  147:aload           11
	//   72  149:aload           9
	//   73  151:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   74  154:pop             
		stringbuilder.append(", ");
	//   75  155:aload           11
	//   76  157:ldc2            #322 <String ", ">
	//   77  160:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   78  163:pop             
		stringbuilder.append(i1);
	//   79  164:aload           11
	//   80  166:iload_2         
	//   81  167:invokevirtual   #253 <Method StringBuilder StringBuilder.append(int)>
	//   82  170:pop             
		stringbuilder.append(", ");
	//   83  171:aload           11
	//   84  173:ldc2            #322 <String ", ">
	//   85  176:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   86  179:pop             
		stringbuilder.append(s4);
	//   87  180:aload           11
	//   88  182:aload           10
	//   89  184:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   90  187:pop             
		stringbuilder.append(", [");
	//   91  188:aload           11
	//   92  190:ldc2            #324 <String ", [">
	//   93  193:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   94  196:pop             
		stringbuilder.append(j1);
	//   95  197:aload           11
	//   96  199:iload_3         
	//   97  200:invokevirtual   #253 <Method StringBuilder StringBuilder.append(int)>
	//   98  203:pop             
		stringbuilder.append(", ");
	//   99  204:aload           11
	//  100  206:ldc2            #322 <String ", ">
	//  101  209:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//  102  212:pop             
		stringbuilder.append(k1);
	//  103  213:aload           11
	//  104  215:iload           4
	//  105  217:invokevirtual   #253 <Method StringBuilder StringBuilder.append(int)>
	//  106  220:pop             
		stringbuilder.append(", ");
	//  107  221:aload           11
	//  108  223:ldc2            #322 <String ", ">
	//  109  226:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//  110  229:pop             
		stringbuilder.append(f1);
	//  111  230:aload           11
	//  112  232:fload_1         
	//  113  233:invokevirtual   #327 <Method StringBuilder StringBuilder.append(float)>
	//  114  236:pop             
		stringbuilder.append("], [");
	//  115  237:aload           11
	//  116  239:ldc2            #329 <String "], [">
	//  117  242:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//  118  245:pop             
		stringbuilder.append(l1);
	//  119  246:aload           11
	//  120  248:iload           5
	//  121  250:invokevirtual   #253 <Method StringBuilder StringBuilder.append(int)>
	//  122  253:pop             
		stringbuilder.append(", ");
	//  123  254:aload           11
	//  124  256:ldc2            #322 <String ", ">
	//  125  259:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//  126  262:pop             
		stringbuilder.append(i2);
	//  127  263:aload           11
	//  128  265:iload           6
	//  129  267:invokevirtual   #253 <Method StringBuilder StringBuilder.append(int)>
	//  130  270:pop             
		stringbuilder.append("])");
	//  131  271:aload           11
	//  132  273:ldc2            #331 <String "])">
	//  133  276:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//  134  279:pop             
		return stringbuilder.toString();
	//  135  280:aload           11
	//  136  282:invokevirtual   #256 <Method String StringBuilder.toString()>
	//  137  285:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field String a>
	//    3    5:invokevirtual   #337 <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field String d>
	//    7   13:invokevirtual   #337 <Method void Parcel.writeString(String)>
		parcel.writeString(e);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #68  <Field String e>
	//   11   21:invokevirtual   #337 <Method void Parcel.writeString(String)>
		parcel.writeString(c);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #70  <Field String c>
	//   15   29:invokevirtual   #337 <Method void Parcel.writeString(String)>
		parcel.writeInt(b);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #76  <Field int b>
	//   19   37:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeInt(f);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #78  <Field int f>
	//   23   45:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #80  <Field int i>
	//   27   53:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #82  <Field int j>
	//   31   61:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(k);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #88  <Field float k>
	//   35   69:invokevirtual   #344 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(l);
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #90  <Field int l>
	//   39   77:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(m);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #92  <Field float m>
	//   43   85:invokevirtual   #344 <Method void Parcel.writeFloat(float)>
		int j1;
		if(v != null)
	//*  44   88:aload_0         
	//*  45   89:getfield        #98  <Field byte[] v>
	//*  46   92:ifnull          100
			j1 = 1;
	//   47   95:iconst_1        
	//   48   96:istore_3        
		else
	//*  49   97:goto            102
			j1 = 0;
	//   50  100:iconst_0        
	//   51  101:istore_3        
		parcel.writeInt(j1);
	//   52  102:aload_1         
	//   53  103:iload_3         
	//   54  104:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		byte abyte0[] = v;
	//   55  107:aload_0         
	//   56  108:getfield        #98  <Field byte[] v>
	//   57  111:astore          4
		if(abyte0 != null)
	//*  58  113:aload           4
	//*  59  115:ifnull          124
			parcel.writeByteArray(abyte0);
	//   60  118:aload_1         
	//   61  119:aload           4
	//   62  121:invokevirtual   #348 <Method void Parcel.writeByteArray(byte[])>
		parcel.writeInt(u);
	//   63  124:aload_1         
	//   64  125:aload_0         
	//   65  126:getfield        #100 <Field int u>
	//   66  129:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(((Parcelable) (w)), i1);
	//   67  132:aload_1         
	//   68  133:aload_0         
	//   69  134:getfield        #114 <Field zzqi w>
	//   70  137:iload_2         
	//   71  138:invokevirtual   #352 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeInt(n);
	//   72  141:aload_1         
	//   73  142:aload_0         
	//   74  143:getfield        #116 <Field int n>
	//   75  146:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeInt(o);
	//   76  149:aload_1         
	//   77  150:aload_0         
	//   78  151:getfield        #118 <Field int o>
	//   79  154:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeInt(p);
	//   80  157:aload_1         
	//   81  158:aload_0         
	//   82  159:getfield        #120 <Field int p>
	//   83  162:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeInt(x);
	//   84  165:aload_1         
	//   85  166:aload_0         
	//   86  167:getfield        #122 <Field int x>
	//   87  170:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeInt(y);
	//   88  173:aload_1         
	//   89  174:aload_0         
	//   90  175:getfield        #124 <Field int y>
	//   91  178:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeInt(r);
	//   92  181:aload_1         
	//   93  182:aload_0         
	//   94  183:getfield        #126 <Field int r>
	//   95  186:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   96  189:aload_1         
	//   97  190:aload_0         
	//   98  191:getfield        #128 <Field String s>
	//   99  194:invokevirtual   #337 <Method void Parcel.writeString(String)>
		parcel.writeInt(z);
	//  100  197:aload_1         
	//  101  198:aload_0         
	//  102  199:getfield        #130 <Field int z>
	//  103  202:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		parcel.writeLong(q);
	//  104  205:aload_1         
	//  105  206:aload_0         
	//  106  207:getfield        #136 <Field long q>
	//  107  210:invokevirtual   #356 <Method void Parcel.writeLong(long)>
		j1 = g.size();
	//  108  213:aload_0         
	//  109  214:getfield        #143 <Field List g>
	//  110  217:invokeinterface #241 <Method int List.size()>
	//  111  222:istore_3        
		parcel.writeInt(j1);
	//  112  223:aload_1         
	//  113  224:iload_3         
	//  114  225:invokevirtual   #340 <Method void Parcel.writeInt(int)>
		for(i1 = 0; i1 < j1; i1++)
	//* 115  228:iconst_0        
	//* 116  229:istore_2        
	//* 117  230:iload_2         
	//* 118  231:iload_3         
	//* 119  232:icmpge          259
			parcel.writeByteArray((byte[])g.get(i1));
	//  120  235:aload_1         
	//  121  236:aload_0         
	//  122  237:getfield        #143 <Field List g>
	//  123  240:iload_2         
	//  124  241:invokeinterface #260 <Method Object List.get(int)>
	//  125  246:checkcast       #261 <Class byte[]>
	//  126  249:invokevirtual   #348 <Method void Parcel.writeByteArray(byte[])>

	//  127  252:iload_2         
	//  128  253:iconst_1        
	//  129  254:iadd            
	//  130  255:istore_2        
	//* 131  256:goto            230
		parcel.writeParcelable(((Parcelable) (h)), 0);
	//  132  259:aload_1         
	//  133  260:aload_0         
	//  134  261:getfield        #153 <Field zzhp h>
	//  135  264:iconst_0        
	//  136  265:invokevirtual   #352 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (t)), 0);
	//  137  268:aload_1         
	//  138  269:aload_0         
	//  139  270:getfield        #157 <Field zzki t>
	//  140  273:iconst_0        
	//  141  274:invokevirtual   #352 <Method void Parcel.writeParcelable(Parcelable, int)>
	//  142  277:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bdf();
	private int A;
	public final String a;
	public final int b;
	public final String c;
	public final String d;
	public final String e;
	public final int f;
	public final List g;
	public final zzhp h;
	public final int i;
	public final int j;
	public final float k;
	public final int l;
	public final float m;
	public final int n;
	public final int o;
	public final int p;
	public final long q;
	public final int r;
	public final String s;
	private final zzki t;
	private final int u;
	private final byte v[];
	private final zzqi w;
	private final int x;
	private final int y;
	private final int z;

	static 
	{
	//    0    0:new             #48  <Class bdf>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void bdf()>
	//    3    7:putstatic       #53  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
