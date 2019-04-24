// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbdk, zzbbj, zzbdo

final class zzbdj
{

	zzbdj(Class class1, String s, Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		zzdxp = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #50  <Int 0x7fffffff>
	//    4    7:putfield        #52  <Field int zzdxp>
		zzdxq = 0x80000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #53  <Int 0x80000000>
	//    7   13:putfield        #55  <Field int zzdxq>
		zzdxr = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #57  <Field int zzdxr>
		zzdxs = 0;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #59  <Field int zzdxs>
		zzdxt = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #61  <Field int zzdxt>
		zzdxu = 0;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #63  <Field int zzdxu>
		zzdxv = 0;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #65  <Field int zzdxv>
		zzdxg = class1;
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:putfield        #67  <Field Class zzdxg>
		zzdxf = new zzbdk(s);
	//   26   46:aload_0         
	//   27   47:new             #69  <Class zzbdk>
	//   28   50:dup             
	//   29   51:aload_2         
	//   30   52:invokespecial   #72  <Method void zzbdk(String)>
	//   31   55:putfield        #74  <Field zzbdk zzdxf>
		zzdwh = aobj;
	//   32   58:aload_0         
	//   33   59:aload_3         
	//   34   60:putfield        #76  <Field Object[] zzdwh>
		flags = zzdxf.next();
	//   35   63:aload_0         
	//   36   64:aload_0         
	//   37   65:getfield        #74  <Field zzbdk zzdxf>
	//   38   68:invokevirtual   #80  <Method int zzbdk.next()>
	//   39   71:putfield        #82  <Field int flags>
		zzdxh = zzdxf.next();
	//   40   74:aload_0         
	//   41   75:aload_0         
	//   42   76:getfield        #74  <Field zzbdk zzdxf>
	//   43   79:invokevirtual   #80  <Method int zzbdk.next()>
	//   44   82:putfield        #84  <Field int zzdxh>
		int i = zzdxh;
	//   45   85:aload_0         
	//   46   86:getfield        #84  <Field int zzdxh>
	//   47   89:istore          4
		class1 = null;
	//   48   91:aconst_null     
	//   49   92:astore_1        
		if(i == 0)
	//*  50   93:iload           4
	//*  51   95:ifne            144
		{
			zzdxi = 0;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #86  <Field int zzdxi>
			zzdxj = 0;
	//   55  103:aload_0         
	//   56  104:iconst_0        
	//   57  105:putfield        #88  <Field int zzdxj>
			zzdwi = 0;
	//   58  108:aload_0         
	//   59  109:iconst_0        
	//   60  110:putfield        #90  <Field int zzdwi>
			zzdwj = 0;
	//   61  113:aload_0         
	//   62  114:iconst_0        
	//   63  115:putfield        #92  <Field int zzdwj>
			zzdxk = 0;
	//   64  118:aload_0         
	//   65  119:iconst_0        
	//   66  120:putfield        #94  <Field int zzdxk>
			zzdxl = 0;
	//   67  123:aload_0         
	//   68  124:iconst_0        
	//   69  125:putfield        #96  <Field int zzdxl>
			zzdwk = 0;
	//   70  128:aload_0         
	//   71  129:iconst_0        
	//   72  130:putfield        #98  <Field int zzdwk>
			zzdxm = 0;
	//   73  133:aload_0         
	//   74  134:iconst_0        
	//   75  135:putfield        #100 <Field int zzdxm>
			zzdwq = null;
	//   76  138:aload_0         
	//   77  139:aconst_null     
	//   78  140:putfield        #102 <Field int[] zzdwq>
			return;
	//   79  143:return          
		}
		zzdxi = zzdxf.next();
	//   80  144:aload_0         
	//   81  145:aload_0         
	//   82  146:getfield        #74  <Field zzbdk zzdxf>
	//   83  149:invokevirtual   #80  <Method int zzbdk.next()>
	//   84  152:putfield        #86  <Field int zzdxi>
		zzdxj = zzdxf.next();
	//   85  155:aload_0         
	//   86  156:aload_0         
	//   87  157:getfield        #74  <Field zzbdk zzdxf>
	//   88  160:invokevirtual   #80  <Method int zzbdk.next()>
	//   89  163:putfield        #88  <Field int zzdxj>
		zzdwi = zzdxf.next();
	//   90  166:aload_0         
	//   91  167:aload_0         
	//   92  168:getfield        #74  <Field zzbdk zzdxf>
	//   93  171:invokevirtual   #80  <Method int zzbdk.next()>
	//   94  174:putfield        #90  <Field int zzdwi>
		zzdwj = zzdxf.next();
	//   95  177:aload_0         
	//   96  178:aload_0         
	//   97  179:getfield        #74  <Field zzbdk zzdxf>
	//   98  182:invokevirtual   #80  <Method int zzbdk.next()>
	//   99  185:putfield        #92  <Field int zzdwj>
		zzdxl = zzdxf.next();
	//  100  188:aload_0         
	//  101  189:aload_0         
	//  102  190:getfield        #74  <Field zzbdk zzdxf>
	//  103  193:invokevirtual   #80  <Method int zzbdk.next()>
	//  104  196:putfield        #96  <Field int zzdxl>
		zzdwk = zzdxf.next();
	//  105  199:aload_0         
	//  106  200:aload_0         
	//  107  201:getfield        #74  <Field zzbdk zzdxf>
	//  108  204:invokevirtual   #80  <Method int zzbdk.next()>
	//  109  207:putfield        #98  <Field int zzdwk>
		zzdxk = zzdxf.next();
	//  110  210:aload_0         
	//  111  211:aload_0         
	//  112  212:getfield        #74  <Field zzbdk zzdxf>
	//  113  215:invokevirtual   #80  <Method int zzbdk.next()>
	//  114  218:putfield        #94  <Field int zzdxk>
		zzdxm = zzdxf.next();
	//  115  221:aload_0         
	//  116  222:aload_0         
	//  117  223:getfield        #74  <Field zzbdk zzdxf>
	//  118  226:invokevirtual   #80  <Method int zzbdk.next()>
	//  119  229:putfield        #100 <Field int zzdxm>
		i = zzdxf.next();
	//  120  232:aload_0         
	//  121  233:getfield        #74  <Field zzbdk zzdxf>
	//  122  236:invokevirtual   #80  <Method int zzbdk.next()>
	//  123  239:istore          4
		if(i != 0)
	//* 124  241:iload           4
	//* 125  243:ifne            249
	//* 126  246:goto            254
			class1 = ((Class) (new int[i]));
	//  127  249:iload           4
	//  128  251:newarray        int[]
	//  129  253:astore_1        
		zzdwq = ((int []) (class1));
	//  130  254:aload_0         
	//  131  255:aload_1         
	//  132  256:putfield        #102 <Field int[] zzdwq>
		zzdxn = (zzdxi << 1) + zzdxj;
	//  133  259:aload_0         
	//  134  260:aload_0         
	//  135  261:getfield        #86  <Field int zzdxi>
	//  136  264:iconst_1        
	//  137  265:ishl            
	//  138  266:aload_0         
	//  139  267:getfield        #88  <Field int zzdxj>
	//  140  270:iadd            
	//  141  271:putfield        #104 <Field int zzdxn>
	//  142  274:return          
	}

	static int zza(zzbdj zzbdj1)
	{
		return zzbdj1.flags;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int flags>
	//    2    4:ireturn         
	}

	private static Field zza(Class class1, String s)
	{
		NoSuchFieldException nosuchfieldexception;
		int i;
		int j;
		Object obj;
		Field afield[];
		Object obj1;
		try
		{
			obj = ((Object) (class1.getDeclaredField(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method Field Class.getDeclaredField(String)>
	//    3    5:astore          4
		}
	//*   4    7:aload           4
	//*   5    9:areturn         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #122 <Method Field[] Class.getDeclaredFields()>
	//*   8   14:astore          4
	//*   9   16:aload           4
	//*  10   18:arraylength     
	//*  11   19:istore_3        
	//*  12   20:iconst_0        
	//*  13   21:istore_2        
	//*  14   22:iload_2         
	//*  15   23:iload_3         
	//*  16   24:icmpge          55
	//*  17   27:aload           4
	//*  18   29:iload_2         
	//*  19   30:aaload          
	//*  20   31:astore          5
	//*  21   33:aload_1         
	//*  22   34:aload           5
	//*  23   36:invokevirtual   #128 <Method String Field.getName()>
	//*  24   39:invokevirtual   #134 <Method boolean String.equals(Object)>
	//*  25   42:ifeq            48
	//*  26   45:aload           5
	//*  27   47:areturn         
	//*  28   48:iload_2         
	//*  29   49:iconst_1        
	//*  30   50:iadd            
	//*  31   51:istore_2        
	//*  32   52:goto            22
	//*  33   55:aload_0         
	//*  34   56:invokevirtual   #135 <Method String Class.getName()>
	//*  35   59:astore_0        
	//*  36   60:aload           4
	//*  37   62:invokestatic    #141 <Method String Arrays.toString(Object[])>
	//*  38   65:astore          4
	//*  39   67:new             #143 <Class StringBuilder>
	//*  40   70:dup             
	//*  41   71:bipush          40
	//*  42   73:aload_1         
	//*  43   74:invokestatic    #147 <Method String String.valueOf(Object)>
	//*  44   77:invokevirtual   #150 <Method int String.length()>
	//*  45   80:iadd            
	//*  46   81:aload_0         
	//*  47   82:invokestatic    #147 <Method String String.valueOf(Object)>
	//*  48   85:invokevirtual   #150 <Method int String.length()>
	//*  49   88:iadd            
	//*  50   89:aload           4
	//*  51   91:invokestatic    #147 <Method String String.valueOf(Object)>
	//*  52   94:invokevirtual   #150 <Method int String.length()>
	//*  53   97:iadd            
	//*  54   98:invokespecial   #153 <Method void StringBuilder(int)>
	//*  55  101:astore          5
	//*  56  103:aload           5
	//*  57  105:ldc1            #155 <String "Field ">
	//*  58  107:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//*  59  110:pop             
	//*  60  111:aload           5
	//*  61  113:aload_1         
	//*  62  114:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//*  63  117:pop             
	//*  64  118:aload           5
	//*  65  120:ldc1            #161 <String " for ">
	//*  66  122:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//*  67  125:pop             
	//*  68  126:aload           5
	//*  69  128:aload_0         
	//*  70  129:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//*  71  132:pop             
	//*  72  133:aload           5
	//*  73  135:ldc1            #163 <String " not found. Known fields are ">
	//*  74  137:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//*  75  140:pop             
	//*  76  141:aload           5
	//*  77  143:aload           4
	//*  78  145:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//*  79  148:pop             
	//*  80  149:new             #165 <Class RuntimeException>
	//*  81  152:dup             
	//*  82  153:aload           5
	//*  83  155:invokevirtual   #167 <Method String StringBuilder.toString()>
	//*  84  158:invokespecial   #168 <Method void RuntimeException(String)>
	//*  85  161:athrow          
		// Misplaced declaration of an exception variable
		catch(NoSuchFieldException nosuchfieldexception)
		{
			afield = class1.getDeclaredFields();
			j = afield.length;
			for(i = 0; i < j; i++)
			{
				obj1 = ((Object) (afield[i]));
				if(s.equals(((Object) (((Field) (obj1)).getName()))))
					return ((Field) (obj1));
			}

			class1 = ((Class) (class1.getName()));
			afield = ((Field []) (Arrays.toString(((Object []) (afield)))));
			obj1 = ((Object) (new StringBuilder(40 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (class1))).length() + String.valueOf(((Object) (afield))).length())));
			((StringBuilder) (obj1)).append("Field ");
			((StringBuilder) (obj1)).append(s);
			((StringBuilder) (obj1)).append(" for ");
			((StringBuilder) (obj1)).append(((String) (class1)));
			((StringBuilder) (obj1)).append(" not found. Known fields are ");
			((StringBuilder) (obj1)).append(((String) (afield)));
			throw new RuntimeException(((StringBuilder) (obj1)).toString());
		}
		return ((Field) (obj));
	//*  86  162:astore          4
	//*  87  164:goto            10
	}

	private final Object zzaey()
	{
		Object aobj[] = zzdwh;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Object[] zzdwh>
	//    2    4:astore_2        
		int i = zzdxn;
	//    3    5:aload_0         
	//    4    6:getfield        #104 <Field int zzdxn>
	//    5    9:istore_1        
		zzdxn = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #104 <Field int zzdxn>
		return aobj[i];
	//   11   17:aload_2         
	//   12   18:iload_1         
	//   13   19:aaload          
	//   14   20:areturn         
	}

	private final boolean zzafa()
	{
		return (flags & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int flags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	static int zzb(zzbdj zzbdj1)
	{
		return zzbdj1.zzdwi;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int zzdwi>
	//    2    4:ireturn         
	}

	static int zzc(zzbdj zzbdj1)
	{
		return zzbdj1.zzdwj;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int zzdwj>
	//    2    4:ireturn         
	}

	static int zzd(zzbdj zzbdj1)
	{
		return zzbdj1.zzdxh;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int zzdxh>
	//    2    4:ireturn         
	}

	static int zze(zzbdj zzbdj1)
	{
		return zzbdj1.zzdxk;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int zzdxk>
	//    2    4:ireturn         
	}

	static int zzf(zzbdj zzbdj1)
	{
		return zzbdj1.zzdxm;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int zzdxm>
	//    2    4:ireturn         
	}

	static int[] zzg(zzbdj zzbdj1)
	{
		return zzbdj1.zzdwq;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int[] zzdwq>
	//    2    4:areturn         
	}

	static int zzh(zzbdj zzbdj1)
	{
		return zzbdj1.zzdxl;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int zzdxl>
	//    2    4:ireturn         
	}

	static int zzi(zzbdj zzbdj1)
	{
		return zzbdj1.zzdwk;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field int zzdwk>
	//    2    4:ireturn         
	}

	final boolean next()
	{
		boolean flag2;
		boolean flag3 = zzdxf.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field zzbdk zzdxf>
	//    2    4:invokevirtual   #185 <Method boolean zzbdk.hasNext()>
	//    3    7:istore_3        
		flag2 = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(!flag3)
	//*   6   10:iload_3         
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		zzdxw = zzdxf.next();
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #74  <Field zzbdk zzdxf>
	//   13   21:invokevirtual   #80  <Method int zzbdk.next()>
	//   14   24:putfield        #187 <Field int zzdxw>
		zzdxx = zzdxf.next();
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #74  <Field zzbdk zzdxf>
	//   18   32:invokevirtual   #80  <Method int zzbdk.next()>
	//   19   35:putfield        #189 <Field int zzdxx>
		zzdxy = zzdxx & 0xff;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #189 <Field int zzdxx>
	//   23   43:sipush          255
	//   24   46:iand            
	//   25   47:putfield        #191 <Field int zzdxy>
		if(zzdxw < zzdxp)
	//*  26   50:aload_0         
	//*  27   51:getfield        #187 <Field int zzdxw>
	//*  28   54:aload_0         
	//*  29   55:getfield        #52  <Field int zzdxp>
	//*  30   58:icmpge          69
			zzdxp = zzdxw;
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:getfield        #187 <Field int zzdxw>
	//   34   66:putfield        #52  <Field int zzdxp>
		if(zzdxw > zzdxq)
	//*  35   69:aload_0         
	//*  36   70:getfield        #187 <Field int zzdxw>
	//*  37   73:aload_0         
	//*  38   74:getfield        #55  <Field int zzdxq>
	//*  39   77:icmple          88
			zzdxq = zzdxw;
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:getfield        #187 <Field int zzdxw>
	//   43   85:putfield        #55  <Field int zzdxq>
		if(zzdxy == zzbbj.zzdta.id())
	//*  44   88:aload_0         
	//*  45   89:getfield        #191 <Field int zzdxy>
	//*  46   92:getstatic       #197 <Field zzbbj zzbbj.zzdta>
	//*  47   95:invokevirtual   #200 <Method int zzbbj.id()>
	//*  48   98:icmpne          114
			zzdxr = zzdxr + 1;
	//   49  101:aload_0         
	//   50  102:aload_0         
	//   51  103:getfield        #57  <Field int zzdxr>
	//   52  106:iconst_1        
	//   53  107:iadd            
	//   54  108:putfield        #57  <Field int zzdxr>
		else
	//*  55  111:goto            150
		if(zzdxy >= zzbbj.zzdru.id() && zzdxy <= zzbbj.zzdsz.id())
	//*  56  114:aload_0         
	//*  57  115:getfield        #191 <Field int zzdxy>
	//*  58  118:getstatic       #203 <Field zzbbj zzbbj.zzdru>
	//*  59  121:invokevirtual   #200 <Method int zzbbj.id()>
	//*  60  124:icmplt          150
	//*  61  127:aload_0         
	//*  62  128:getfield        #191 <Field int zzdxy>
	//*  63  131:getstatic       #206 <Field zzbbj zzbbj.zzdsz>
	//*  64  134:invokevirtual   #200 <Method int zzbbj.id()>
	//*  65  137:icmpgt          150
			zzdxs = zzdxs + 1;
	//   66  140:aload_0         
	//   67  141:aload_0         
	//   68  142:getfield        #59  <Field int zzdxs>
	//   69  145:iconst_1        
	//   70  146:iadd            
	//   71  147:putfield        #59  <Field int zzdxs>
		zzdxv = zzdxv + 1;
	//   72  150:aload_0         
	//   73  151:aload_0         
	//   74  152:getfield        #65  <Field int zzdxv>
	//   75  155:iconst_1        
	//   76  156:iadd            
	//   77  157:putfield        #65  <Field int zzdxv>
		int i;
		if(zzbdo.zze(zzdxp, zzdxw, zzdxv))
	//*  78  160:aload_0         
	//*  79  161:getfield        #52  <Field int zzdxp>
	//*  80  164:aload_0         
	//*  81  165:getfield        #187 <Field int zzdxw>
	//*  82  168:aload_0         
	//*  83  169:getfield        #65  <Field int zzdxv>
	//*  84  172:invokestatic    #211 <Method boolean zzbdo.zze(int, int, int)>
	//*  85  175:ifeq            206
		{
			zzdxu = zzdxw + 1;
	//   86  178:aload_0         
	//   87  179:aload_0         
	//   88  180:getfield        #187 <Field int zzdxw>
	//   89  183:iconst_1        
	//   90  184:iadd            
	//   91  185:putfield        #63  <Field int zzdxu>
			i = zzdxu - zzdxp;
	//   92  188:aload_0         
	//   93  189:getfield        #63  <Field int zzdxu>
	//   94  192:aload_0         
	//   95  193:getfield        #52  <Field int zzdxp>
	//   96  196:isub            
	//   97  197:istore_1        
		} else
	//*  98  198:aload_0         
	//*  99  199:iload_1         
	//* 100  200:putfield        #61  <Field int zzdxt>
	//* 101  203:goto            216
		{
			i = zzdxt + 1;
	//  102  206:aload_0         
	//  103  207:getfield        #61  <Field int zzdxt>
	//  104  210:iconst_1        
	//  105  211:iadd            
	//  106  212:istore_1        
		}
		zzdxt = i;
	//* 107  213:goto            198
		boolean flag;
		if((zzdxx & 0x400) != 0)
	//* 108  216:aload_0         
	//* 109  217:getfield        #189 <Field int zzdxx>
	//* 110  220:sipush          1024
	//* 111  223:iand            
	//* 112  224:ifeq            232
			flag = true;
	//  113  227:iconst_1        
	//  114  228:istore_1        
		else
	//* 115  229:goto            234
			flag = false;
	//  116  232:iconst_0        
	//  117  233:istore_1        
		if(flag)
	//* 118  234:iload_1         
	//* 119  235:ifeq            264
		{
			int ai[] = zzdwq;
	//  120  238:aload_0         
	//  121  239:getfield        #102 <Field int[] zzdwq>
	//  122  242:astore          4
			int j = zzdxo;
	//  123  244:aload_0         
	//  124  245:getfield        #213 <Field int zzdxo>
	//  125  248:istore_1        
			zzdxo = j + 1;
	//  126  249:aload_0         
	//  127  250:iload_1         
	//  128  251:iconst_1        
	//  129  252:iadd            
	//  130  253:putfield        #213 <Field int zzdxo>
			ai[j] = zzdxw;
	//  131  256:aload           4
	//  132  258:iload_1         
	//  133  259:aload_0         
	//  134  260:getfield        #187 <Field int zzdxw>
	//  135  263:iastore         
		}
		zzdyc = null;
	//  136  264:aload_0         
	//  137  265:aconst_null     
	//  138  266:putfield        #215 <Field Object zzdyc>
		zzdyd = null;
	//  139  269:aload_0         
	//  140  270:aconst_null     
	//  141  271:putfield        #217 <Field Object zzdyd>
		zzdye = null;
	//  142  274:aload_0         
	//  143  275:aconst_null     
	//  144  276:putfield        #219 <Field Object zzdye>
		if(!zzafb()) goto _L2; else goto _L1
	//  145  279:aload_0         
	//  146  280:invokevirtual   #222 <Method boolean zzafb()>
	//  147  283:ifeq            379
_L1:
		zzdxz = zzdxf.next();
	//  148  286:aload_0         
	//  149  287:aload_0         
	//  150  288:getfield        #74  <Field zzbdk zzdxf>
	//  151  291:invokevirtual   #80  <Method int zzbdk.next()>
	//  152  294:putfield        #224 <Field int zzdxz>
		if(zzdxy != zzbbj.zzdrl.id() + 51 && zzdxy != zzbbj.zzdrt.id() + 51) goto _L4; else goto _L3
	//  153  297:aload_0         
	//  154  298:getfield        #191 <Field int zzdxy>
	//  155  301:getstatic       #227 <Field zzbbj zzbbj.zzdrl>
	//  156  304:invokevirtual   #200 <Method int zzbbj.id()>
	//  157  307:bipush          51
	//  158  309:iadd            
	//  159  310:icmpeq          365
	//  160  313:aload_0         
	//  161  314:getfield        #191 <Field int zzdxy>
	//  162  317:getstatic       #230 <Field zzbbj zzbbj.zzdrt>
	//  163  320:invokevirtual   #200 <Method int zzbbj.id()>
	//  164  323:bipush          51
	//  165  325:iadd            
	//  166  326:icmpne          332
	//* 167  329:goto            365
_L4:
		if(zzdxy != zzbbj.zzdro.id() + 51 || !zzafa()) goto _L6; else goto _L5
	//  168  332:aload_0         
	//  169  333:getfield        #191 <Field int zzdxy>
	//  170  336:getstatic       #233 <Field zzbbj zzbbj.zzdro>
	//  171  339:invokevirtual   #200 <Method int zzbbj.id()>
	//  172  342:bipush          51
	//  173  344:iadd            
	//  174  345:icmpne          580
	//  175  348:aload_0         
	//  176  349:invokespecial   #235 <Method boolean zzafa()>
	//  177  352:ifeq            580
_L5:
		zzdyd = zzaey();
	//  178  355:aload_0         
	//  179  356:aload_0         
	//  180  357:invokespecial   #237 <Method Object zzaey()>
	//  181  360:putfield        #217 <Field Object zzdyd>
		return true;
	//  182  363:iconst_1        
	//  183  364:ireturn         
_L3:
		Object obj = zzaey();
	//  184  365:aload_0         
	//  185  366:invokespecial   #237 <Method Object zzaey()>
	//  186  369:astore          4
_L11:
		zzdyc = obj;
	//  187  371:aload_0         
	//  188  372:aload           4
	//  189  374:putfield        #215 <Field Object zzdyc>
		return true;
	//  190  377:iconst_1        
	//  191  378:ireturn         
_L2:
		zzdyb = zza(zzdxg, (String)zzaey());
	//  192  379:aload_0         
	//  193  380:aload_0         
	//  194  381:getfield        #67  <Field Class zzdxg>
	//  195  384:aload_0         
	//  196  385:invokespecial   #237 <Method Object zzaey()>
	//  197  388:checkcast       #130 <Class String>
	//  198  391:invokestatic    #239 <Method Field zza(Class, String)>
	//  199  394:putfield        #241 <Field Field zzdyb>
		if(zzaff())
	//* 200  397:aload_0         
	//* 201  398:invokevirtual   #244 <Method boolean zzaff()>
	//* 202  401:ifeq            415
			zzdya = zzdxf.next();
	//  203  404:aload_0         
	//  204  405:aload_0         
	//  205  406:getfield        #74  <Field zzbdk zzdxf>
	//  206  409:invokevirtual   #80  <Method int zzbdk.next()>
	//  207  412:putfield        #246 <Field int zzdya>
		if(zzdxy != zzbbj.zzdrl.id() && zzdxy != zzbbj.zzdrt.id()) goto _L8; else goto _L7
	//  208  415:aload_0         
	//  209  416:getfield        #191 <Field int zzdxy>
	//  210  419:getstatic       #227 <Field zzbbj zzbbj.zzdrl>
	//  211  422:invokevirtual   #200 <Method int zzbbj.id()>
	//  212  425:icmpeq          568
	//  213  428:aload_0         
	//  214  429:getfield        #191 <Field int zzdxy>
	//  215  432:getstatic       #230 <Field zzbbj zzbbj.zzdrt>
	//  216  435:invokevirtual   #200 <Method int zzbbj.id()>
	//  217  438:icmpne          444
	//* 218  441:goto            568
_L8:
		if(zzdxy != zzbbj.zzdsd.id() && zzdxy != zzbbj.zzdsz.id()) goto _L9; else goto _L3
	//  219  444:aload_0         
	//  220  445:getfield        #191 <Field int zzdxy>
	//  221  448:getstatic       #249 <Field zzbbj zzbbj.zzdsd>
	//  222  451:invokevirtual   #200 <Method int zzbbj.id()>
	//  223  454:icmpeq          365
	//  224  457:aload_0         
	//  225  458:getfield        #191 <Field int zzdxy>
	//  226  461:getstatic       #206 <Field zzbbj zzbbj.zzdsz>
	//  227  464:invokevirtual   #200 <Method int zzbbj.id()>
	//  228  467:icmpne          473
	//* 229  470:goto            365
_L9:
		boolean flag1;
		if(zzdxy == zzbbj.zzdro.id() || zzdxy == zzbbj.zzdsg.id() || zzdxy == zzbbj.zzdsu.id())
	//* 230  473:aload_0         
	//* 231  474:getfield        #191 <Field int zzdxy>
	//* 232  477:getstatic       #233 <Field zzbbj zzbbj.zzdro>
	//* 233  480:invokevirtual   #200 <Method int zzbbj.id()>
	//* 234  483:icmpeq          558
	//* 235  486:aload_0         
	//* 236  487:getfield        #191 <Field int zzdxy>
	//* 237  490:getstatic       #252 <Field zzbbj zzbbj.zzdsg>
	//* 238  493:invokevirtual   #200 <Method int zzbbj.id()>
	//* 239  496:icmpeq          558
	//* 240  499:aload_0         
	//* 241  500:getfield        #191 <Field int zzdxy>
	//* 242  503:getstatic       #255 <Field zzbbj zzbbj.zzdsu>
	//* 243  506:invokevirtual   #200 <Method int zzbbj.id()>
	//* 244  509:icmpne          515
			continue; /* Loop/switch isn't completed */
	//  245  512:goto            558
		if(zzdxy != zzbbj.zzdta.id())
			break; /* Loop/switch isn't completed */
	//  246  515:aload_0         
	//  247  516:getfield        #191 <Field int zzdxy>
	//  248  519:getstatic       #197 <Field zzbbj zzbbj.zzdta>
	//  249  522:invokevirtual   #200 <Method int zzbbj.id()>
	//  250  525:icmpne          580
		zzdye = zzaey();
	//  251  528:aload_0         
	//  252  529:aload_0         
	//  253  530:invokespecial   #237 <Method Object zzaey()>
	//  254  533:putfield        #219 <Field Object zzdye>
		flag1 = flag2;
	//  255  536:iload_2         
	//  256  537:istore_1        
		if((zzdxx & 0x800) != 0)
	//* 257  538:aload_0         
	//* 258  539:getfield        #189 <Field int zzdxx>
	//* 259  542:sipush          2048
	//* 260  545:iand            
	//* 261  546:ifeq            551
			flag1 = true;
	//  262  549:iconst_1        
	//  263  550:istore_1        
		if(!flag1) goto _L10; else goto _L5
	//  264  551:iload_1         
	//  265  552:ifeq            580
_L10:
		break; /* Loop/switch isn't completed */
	//  266  555:goto            355
		if(!zzafa()) goto _L6; else goto _L5
	//  267  558:aload_0         
	//  268  559:invokespecial   #235 <Method boolean zzafa()>
	//  269  562:ifeq            580
	//* 270  565:goto            355
_L7:
		obj = ((Object) (zzdyb.getType()));
	//  271  568:aload_0         
	//  272  569:getfield        #241 <Field Field zzdyb>
	//  273  572:invokevirtual   #259 <Method Class Field.getType()>
	//  274  575:astore          4
		  goto _L11
	//* 275  577:goto            371
_L6:
		return true;
	//  276  580:iconst_1        
	//  277  581:ireturn         
	}

	final int zzaci()
	{
		return zzdxw;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field int zzdxw>
	//    2    4:ireturn         
	}

	final int zzaez()
	{
		return zzdxy;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field int zzdxy>
	//    2    4:ireturn         
	}

	final boolean zzafb()
	{
		return zzdxy > zzbbj.zzdta.id();
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field int zzdxy>
	//    2    4:getstatic       #197 <Field zzbbj zzbbj.zzdta>
	//    3    7:invokevirtual   #200 <Method int zzbbj.id()>
	//    4   10:icmple          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	final Field zzafc()
	{
		int i = zzdxz << 1;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field int zzdxz>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:istore_1        
		Object obj = zzdwh[i];
	//    5    7:aload_0         
	//    6    8:getfield        #76  <Field Object[] zzdwh>
	//    7   11:iload_1         
	//    8   12:aaload          
	//    9   13:astore_2        
		if(obj instanceof Field)
	//*  10   14:aload_2         
	//*  11   15:instanceof      #124 <Class Field>
	//*  12   18:ifeq            26
		{
			return (Field)obj;
	//   13   21:aload_2         
	//   14   22:checkcast       #124 <Class Field>
	//   15   25:areturn         
		} else
		{
			obj = ((Object) (zza(zzdxg, (String)obj)));
	//   16   26:aload_0         
	//   17   27:getfield        #67  <Field Class zzdxg>
	//   18   30:aload_2         
	//   19   31:checkcast       #130 <Class String>
	//   20   34:invokestatic    #239 <Method Field zza(Class, String)>
	//   21   37:astore_2        
			zzdwh[i] = obj;
	//   22   38:aload_0         
	//   23   39:getfield        #76  <Field Object[] zzdwh>
	//   24   42:iload_1         
	//   25   43:aload_2         
	//   26   44:aastore         
			return ((Field) (obj));
	//   27   45:aload_2         
	//   28   46:areturn         
		}
	}

	final Field zzafd()
	{
		int i = (zzdxz << 1) + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field int zzdxz>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:istore_1        
		Object obj = zzdwh[i];
	//    7    9:aload_0         
	//    8   10:getfield        #76  <Field Object[] zzdwh>
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore_2        
		if(obj instanceof Field)
	//*  12   16:aload_2         
	//*  13   17:instanceof      #124 <Class Field>
	//*  14   20:ifeq            28
		{
			return (Field)obj;
	//   15   23:aload_2         
	//   16   24:checkcast       #124 <Class Field>
	//   17   27:areturn         
		} else
		{
			obj = ((Object) (zza(zzdxg, (String)obj)));
	//   18   28:aload_0         
	//   19   29:getfield        #67  <Field Class zzdxg>
	//   20   32:aload_2         
	//   21   33:checkcast       #130 <Class String>
	//   22   36:invokestatic    #239 <Method Field zza(Class, String)>
	//   23   39:astore_2        
			zzdwh[i] = obj;
	//   24   40:aload_0         
	//   25   41:getfield        #76  <Field Object[] zzdwh>
	//   26   44:iload_1         
	//   27   45:aload_2         
	//   28   46:aastore         
			return ((Field) (obj));
	//   29   47:aload_2         
	//   30   48:areturn         
		}
	}

	final Field zzafe()
	{
		return zzdyb;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field Field zzdyb>
	//    2    4:areturn         
	}

	final boolean zzaff()
	{
		return zzafa() && zzdxy <= zzbbj.zzdrt.id();
	//    0    0:aload_0         
	//    1    1:invokespecial   #235 <Method boolean zzafa()>
	//    2    4:ifeq            22
	//    3    7:aload_0         
	//    4    8:getfield        #191 <Field int zzdxy>
	//    5   11:getstatic       #230 <Field zzbbj zzbbj.zzdrt>
	//    6   14:invokevirtual   #200 <Method int zzbbj.id()>
	//    7   17:icmpgt          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	final Field zzafg()
	{
		int i = (zzdxi << 1) + zzdya / 32;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int zzdxi>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:aload_0         
	//    5    7:getfield        #246 <Field int zzdya>
	//    6   10:bipush          32
	//    7   12:idiv            
	//    8   13:iadd            
	//    9   14:istore_1        
		Object obj = zzdwh[i];
	//   10   15:aload_0         
	//   11   16:getfield        #76  <Field Object[] zzdwh>
	//   12   19:iload_1         
	//   13   20:aaload          
	//   14   21:astore_2        
		if(obj instanceof Field)
	//*  15   22:aload_2         
	//*  16   23:instanceof      #124 <Class Field>
	//*  17   26:ifeq            34
		{
			return (Field)obj;
	//   18   29:aload_2         
	//   19   30:checkcast       #124 <Class Field>
	//   20   33:areturn         
		} else
		{
			obj = ((Object) (zza(zzdxg, (String)obj)));
	//   21   34:aload_0         
	//   22   35:getfield        #67  <Field Class zzdxg>
	//   23   38:aload_2         
	//   24   39:checkcast       #130 <Class String>
	//   25   42:invokestatic    #239 <Method Field zza(Class, String)>
	//   26   45:astore_2        
			zzdwh[i] = obj;
	//   27   46:aload_0         
	//   28   47:getfield        #76  <Field Object[] zzdwh>
	//   29   50:iload_1         
	//   30   51:aload_2         
	//   31   52:aastore         
			return ((Field) (obj));
	//   32   53:aload_2         
	//   33   54:areturn         
		}
	}

	final int zzafh()
	{
		return zzdya % 32;
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field int zzdya>
	//    2    4:bipush          32
	//    3    6:irem            
	//    4    7:ireturn         
	}

	final boolean zzafi()
	{
		return (zzdxx & 0x100) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int zzdxx>
	//    2    4:sipush          256
	//    3    7:iand            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	final boolean zzafj()
	{
		return (zzdxx & 0x200) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int zzdxx>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	final Object zzafk()
	{
		return zzdyc;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field Object zzdyc>
	//    2    4:areturn         
	}

	final Object zzafl()
	{
		return zzdyd;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field Object zzdyd>
	//    2    4:areturn         
	}

	final Object zzafm()
	{
		return zzdye;
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field Object zzdye>
	//    2    4:areturn         
	}

	private final int flags;
	private final Object zzdwh[];
	private final int zzdwi;
	private final int zzdwj;
	private final int zzdwk;
	private final int zzdwq[];
	private final zzbdk zzdxf;
	private Class zzdxg;
	private final int zzdxh;
	private final int zzdxi;
	private final int zzdxj;
	private final int zzdxk;
	private final int zzdxl;
	private final int zzdxm;
	private int zzdxn;
	private int zzdxo;
	private int zzdxp;
	private int zzdxq;
	private int zzdxr;
	private int zzdxs;
	private int zzdxt;
	private int zzdxu;
	private int zzdxv;
	private int zzdxw;
	private int zzdxx;
	private int zzdxy;
	private int zzdxz;
	private int zzdya;
	private Field zzdyb;
	private Object zzdyc;
	private Object zzdyd;
	private Object zzdye;
}
