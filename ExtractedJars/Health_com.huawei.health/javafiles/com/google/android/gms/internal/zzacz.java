// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzc;
import com.google.android.gms.common.util.zzq;
import com.google.android.gms.common.util.zzr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//			zzact, zzada, zzacw

public class zzacz extends zzact
{

	zzacz(int i, Parcel parcel, zzacw zzacw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzact()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int zzaiI>
		zzaHm = (Parcel)zzac.zzw(((Object) (parcel)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #38  <Method Object zzac.zzw(Object)>
	//    8   14:checkcast       #40  <Class Parcel>
	//    9   17:putfield        #42  <Field Parcel zzaHm>
	//   10   20:aload_0         
	//   11   21:iconst_2        
	//   12   22:putfield        #44  <Field int zzaHn>
		zzaHf = zzacw1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #46  <Field zzacw zzaHf>
		if(zzaHf == null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #46  <Field zzacw zzaHf>
	//*  18   34:ifnonnull       45
			mClassName = null;
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:putfield        #48  <Field String mClassName>
		else
	//*  22   42:goto            56
			mClassName = zzaHf.zzyF();
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #46  <Field zzacw zzaHf>
	//   26   50:invokevirtual   #54  <Method String zzacw.zzyF()>
	//   27   53:putfield        #48  <Field String mClassName>
		zzaHo = 2;
	//   28   56:aload_0         
	//   29   57:iconst_2        
	//   30   58:putfield        #56  <Field int zzaHo>
	//   31   61:return          
	}

	private static SparseArray zzY(Map map)
	{
		SparseArray sparsearray = new SparseArray();
	//    0    0:new             #60  <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void SparseArray()>
	//    3    7:astore_1        
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); sparsearray.put(((zzacs.zza)entry.getValue()).zzyx(), ((Object) (entry))))
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #67  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #73  <Method Iterator Set.iterator()>
	//*   7   19:astore_0        
	//*   8   20:aload_0         
	//*   9   21:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            59
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   29:aload_0         
	//   12   30:invokeinterface #83  <Method Object Iterator.next()>
	//   13   35:checkcast       #85  <Class java.util.Map$Entry>
	//   14   38:astore_2        

	//   15   39:aload_1         
	//   16   40:aload_2         
	//   17   41:invokeinterface #88  <Method Object java.util.Map$Entry.getValue()>
	//   18   46:checkcast       #90  <Class zzacs$zza>
	//   19   49:invokevirtual   #94  <Method int zzacs$zza.zzyx()>
	//   20   52:aload_2         
	//   21   53:invokevirtual   #98  <Method void SparseArray.put(int, Object)>
	//*  22   56:goto            20
		return sparsearray;
	//   23   59:aload_1         
	//   24   60:areturn         
	}

	private void zza(StringBuilder stringbuilder, int i, Object obj)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 11: default 64
	//	               0 67
	//	               1 67
	//	               2 67
	//	               3 67
	//	               4 67
	//	               5 67
	//	               6 67
	//	               7 74
	//	               8 97
	//	               9 120
	//	               10 145
	//	               11 154
	//*   2   64:goto            164
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			stringbuilder.append(obj);
	//    3   67:aload_1         
	//    4   68:aload_3         
	//    5   69:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//    6   72:pop             
			return;
	//    7   73:return          

		case 7: // '\007'
			stringbuilder.append("\"").append(zzq.zzdy(obj.toString())).append("\"");
	//    8   74:aload_1         
	//    9   75:ldc1            #110 <String "\"">
	//   10   77:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   11   80:aload_3         
	//   12   81:invokevirtual   #118 <Method String Object.toString()>
	//   13   84:invokestatic    #124 <Method String zzq.zzdy(String)>
	//   14   87:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   15   90:ldc1            #110 <String "\"">
	//   16   92:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   17   95:pop             
			return;
	//   18   96:return          

		case 8: // '\b'
			stringbuilder.append("\"").append(zzc.zzq((byte[])obj)).append("\"");
	//   19   97:aload_1         
	//   20   98:ldc1            #110 <String "\"">
	//   21  100:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   22  103:aload_3         
	//   23  104:checkcast       #126 <Class byte[]>
	//   24  107:invokestatic    #132 <Method String zzc.zzq(byte[])>
	//   25  110:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   26  113:ldc1            #110 <String "\"">
	//   27  115:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   28  118:pop             
			return;
	//   29  119:return          

		case 9: // '\t'
			stringbuilder.append("\"").append(zzc.zzr((byte[])obj));
	//   30  120:aload_1         
	//   31  121:ldc1            #110 <String "\"">
	//   32  123:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   33  126:aload_3         
	//   34  127:checkcast       #126 <Class byte[]>
	//   35  130:invokestatic    #135 <Method String zzc.zzr(byte[])>
	//   36  133:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   37  136:pop             
			stringbuilder.append("\"");
	//   38  137:aload_1         
	//   39  138:ldc1            #110 <String "\"">
	//   40  140:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   41  143:pop             
			return;
	//   42  144:return          

		case 10: // '\n'
			com.google.android.gms.common.util.zzr.zza(stringbuilder, (HashMap)obj);
	//   43  145:aload_1         
	//   44  146:aload_3         
	//   45  147:checkcast       #137 <Class HashMap>
	//   46  150:invokestatic    #142 <Method void zzr.zza(StringBuilder, HashMap)>
			return;
	//   47  153:return          

		case 11: // '\013'
			throw new IllegalArgumentException("Method does not accept concrete type.");
	//   48  154:new             #144 <Class IllegalArgumentException>
	//   49  157:dup             
	//   50  158:ldc1            #146 <String "Method does not accept concrete type.">
	//   51  160:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//   52  163:athrow          
		}
		throw new IllegalArgumentException((new StringBuilder(26)).append("Unknown type = ").append(i).toString());
	//   53  164:new             #144 <Class IllegalArgumentException>
	//   54  167:dup             
	//   55  168:new             #104 <Class StringBuilder>
	//   56  171:dup             
	//   57  172:bipush          26
	//   58  174:invokespecial   #152 <Method void StringBuilder(int)>
	//   59  177:ldc1            #154 <String "Unknown type = ">
	//   60  179:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   61  182:iload_2         
	//   62  183:invokevirtual   #157 <Method StringBuilder StringBuilder.append(int)>
	//   63  186:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   64  189:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//   65  192:athrow          
	}

	private void zza(StringBuilder stringbuilder, zzacs.zza zza1, Parcel parcel, int i)
	{
		switch(zza1.zzyu())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #162 <Method int zzacs$zza.zzyu()>
		{
	//*   2    4:tableswitch     0 11: default 68
	//	               0 71
	//	               1 92
	//	               2 110
	//	               3 131
	//	               4 152
	//	               5 173
	//	               6 191
	//	               7 212
	//	               8 230
	//	               9 230
	//	               10 248
	//	               11 269
	//*   3   68:goto            279
		case 0: // '\0'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Integer.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, i))))));
	//    4   71:aload_0         
	//    5   72:aload_1         
	//    6   73:aload_2         
	//    7   74:aload_0         
	//    8   75:aload_2         
	//    9   76:aload_3         
	//   10   77:iload           4
	//   11   79:invokestatic    #168 <Method int zzb.zzg(Parcel, int)>
	//   12   82:invokestatic    #174 <Method Integer Integer.valueOf(int)>
	//   13   85:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//   14   88:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//   15   91:return          

		case 1: // '\001'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzk(parcel, i)))));
	//   16   92:aload_0         
	//   17   93:aload_1         
	//   18   94:aload_2         
	//   19   95:aload_0         
	//   20   96:aload_2         
	//   21   97:aload_3         
	//   22   98:iload           4
	//   23  100:invokestatic    #185 <Method java.math.BigInteger zzb.zzk(Parcel, int)>
	//   24  103:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//   25  106:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//   26  109:return          

		case 2: // '\002'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Long.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzi(parcel, i))))));
	//   27  110:aload_0         
	//   28  111:aload_1         
	//   29  112:aload_2         
	//   30  113:aload_0         
	//   31  114:aload_2         
	//   32  115:aload_3         
	//   33  116:iload           4
	//   34  118:invokestatic    #189 <Method long zzb.zzi(Parcel, int)>
	//   35  121:invokestatic    #194 <Method Long Long.valueOf(long)>
	//   36  124:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//   37  127:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//   38  130:return          

		case 3: // '\003'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Float.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzl(parcel, i))))));
	//   39  131:aload_0         
	//   40  132:aload_1         
	//   41  133:aload_2         
	//   42  134:aload_0         
	//   43  135:aload_2         
	//   44  136:aload_3         
	//   45  137:iload           4
	//   46  139:invokestatic    #198 <Method float zzb.zzl(Parcel, int)>
	//   47  142:invokestatic    #203 <Method Float Float.valueOf(float)>
	//   48  145:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//   49  148:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//   50  151:return          

		case 4: // '\004'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Double.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzn(parcel, i))))));
	//   51  152:aload_0         
	//   52  153:aload_1         
	//   53  154:aload_2         
	//   54  155:aload_0         
	//   55  156:aload_2         
	//   56  157:aload_3         
	//   57  158:iload           4
	//   58  160:invokestatic    #207 <Method double zzb.zzn(Parcel, int)>
	//   59  163:invokestatic    #212 <Method Double Double.valueOf(double)>
	//   60  166:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//   61  169:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//   62  172:return          

		case 5: // '\005'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzp(parcel, i)))));
	//   63  173:aload_0         
	//   64  174:aload_1         
	//   65  175:aload_2         
	//   66  176:aload_0         
	//   67  177:aload_2         
	//   68  178:aload_3         
	//   69  179:iload           4
	//   70  181:invokestatic    #216 <Method java.math.BigDecimal zzb.zzp(Parcel, int)>
	//   71  184:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//   72  187:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//   73  190:return          

		case 6: // '\006'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, i))))));
	//   74  191:aload_0         
	//   75  192:aload_1         
	//   76  193:aload_2         
	//   77  194:aload_0         
	//   78  195:aload_2         
	//   79  196:aload_3         
	//   80  197:iload           4
	//   81  199:invokestatic    #220 <Method boolean zzb.zzc(Parcel, int)>
	//   82  202:invokestatic    #225 <Method Boolean Boolean.valueOf(boolean)>
	//   83  205:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//   84  208:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//   85  211:return          

		case 7: // '\007'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, i)))));
	//   86  212:aload_0         
	//   87  213:aload_1         
	//   88  214:aload_2         
	//   89  215:aload_0         
	//   90  216:aload_2         
	//   91  217:aload_3         
	//   92  218:iload           4
	//   93  220:invokestatic    #228 <Method String zzb.zzq(Parcel, int)>
	//   94  223:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//   95  226:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//   96  229:return          

		case 8: // '\b'
		case 9: // '\t'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzt(parcel, i)))));
	//   97  230:aload_0         
	//   98  231:aload_1         
	//   99  232:aload_2         
	//  100  233:aload_0         
	//  101  234:aload_2         
	//  102  235:aload_3         
	//  103  236:iload           4
	//  104  238:invokestatic    #232 <Method byte[] zzb.zzt(Parcel, int)>
	//  105  241:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//  106  244:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//  107  247:return          

		case 10: // '\n'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (zzr(com.google.android.gms.common.internal.safeparcel.zzb.zzs(parcel, i))))));
	//  108  248:aload_0         
	//  109  249:aload_1         
	//  110  250:aload_2         
	//  111  251:aload_0         
	//  112  252:aload_2         
	//  113  253:aload_3         
	//  114  254:iload           4
	//  115  256:invokestatic    #236 <Method Bundle zzb.zzs(Parcel, int)>
	//  116  259:invokestatic    #239 <Method HashMap zzr(Bundle)>
	//  117  262:invokevirtual   #177 <Method Object zza(zzacs$zza, Object)>
	//  118  265:invokespecial   #181 <Method void zzb(StringBuilder, zzacs$zza, Object)>
			return;
	//  119  268:return          

		case 11: // '\013'
			throw new IllegalArgumentException("Method does not accept concrete type.");
	//  120  269:new             #144 <Class IllegalArgumentException>
	//  121  272:dup             
	//  122  273:ldc1            #146 <String "Method does not accept concrete type.">
	//  123  275:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//  124  278:athrow          
		}
		i = zza1.zzyu();
	//  125  279:aload_2         
	//  126  280:invokevirtual   #162 <Method int zzacs$zza.zzyu()>
	//  127  283:istore          4
		throw new IllegalArgumentException((new StringBuilder(36)).append("Unknown field out type = ").append(i).toString());
	//  128  285:new             #144 <Class IllegalArgumentException>
	//  129  288:dup             
	//  130  289:new             #104 <Class StringBuilder>
	//  131  292:dup             
	//  132  293:bipush          36
	//  133  295:invokespecial   #152 <Method void StringBuilder(int)>
	//  134  298:ldc1            #241 <String "Unknown field out type = ">
	//  135  300:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  136  303:iload           4
	//  137  305:invokevirtual   #157 <Method StringBuilder StringBuilder.append(int)>
	//  138  308:invokevirtual   #158 <Method String StringBuilder.toString()>
	//  139  311:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//  140  314:athrow          
	}

	private void zza(StringBuilder stringbuilder, String s, zzacs.zza zza1, Parcel parcel, int i)
	{
		stringbuilder.append("\"").append(s).append("\":");
	//    0    0:aload_1         
	//    1    1:ldc1            #110 <String "\"">
	//    2    3:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:aload_2         
	//    4    7:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    5   10:ldc1            #245 <String "\":">
	//    6   12:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		if(zza1.zzyA())
	//*   8   16:aload_3         
	//*   9   17:invokevirtual   #248 <Method boolean zzacs$zza.zzyA()>
	//*  10   20:ifeq            34
		{
			zza(stringbuilder, zza1, parcel, i);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:iload           5
	//   16   30:invokespecial   #250 <Method void zza(StringBuilder, zzacs$zza, Parcel, int)>
			return;
	//   17   33:return          
		} else
		{
			zzb(stringbuilder, zza1, parcel, i);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_3         
	//   21   37:aload           4
	//   22   39:iload           5
	//   23   41:invokespecial   #252 <Method void zzb(StringBuilder, zzacs$zza, Parcel, int)>
			return;
	//   24   44:return          
		}
	}

	private void zza(StringBuilder stringbuilder, Map map, Parcel parcel)
	{
		map = ((Map) (zzY(map)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #256 <Method SparseArray zzY(Map)>
	//    2    4:astore_2        
		stringbuilder.append('{');
	//    3    5:aload_1         
	//    4    6:bipush          123
	//    5    8:invokevirtual   #259 <Method StringBuilder StringBuilder.append(char)>
	//    6   11:pop             
		int i = com.google.android.gms.common.internal.safeparcel.zzb.zzaY(parcel);
	//    7   12:aload_3         
	//    8   13:invokestatic    #263 <Method int zzb.zzaY(Parcel)>
	//    9   16:istore          5
		boolean flag = false;
	//   10   18:iconst_0        
	//   11   19:istore          4
		do
		{
			if(parcel.dataPosition() >= i)
				break;
	//   12   21:aload_3         
	//   13   22:invokevirtual   #266 <Method int Parcel.dataPosition()>
	//   14   25:iload           5
	//   15   27:icmpge          105
			int j = com.google.android.gms.common.internal.safeparcel.zzb.zzaX(parcel);
	//   16   30:aload_3         
	//   17   31:invokestatic    #269 <Method int zzb.zzaX(Parcel)>
	//   18   34:istore          6
			java.util.Map.Entry entry = (java.util.Map.Entry)((SparseArray) (map)).get(com.google.android.gms.common.internal.safeparcel.zzb.zzdc(j));
	//   19   36:aload_2         
	//   20   37:iload           6
	//   21   39:invokestatic    #273 <Method int zzb.zzdc(int)>
	//   22   42:invokevirtual   #277 <Method Object SparseArray.get(int)>
	//   23   45:checkcast       #85  <Class java.util.Map$Entry>
	//   24   48:astore          7
			if(entry != null)
	//*  25   50:aload           7
	//*  26   52:ifnonnull       58
	//*  27   55:goto            21
			{
				if(flag)
	//*  28   58:iload           4
	//*  29   60:ifeq            71
					stringbuilder.append(",");
	//   30   63:aload_1         
	//   31   64:ldc2            #279 <String ",">
	//   32   67:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
				zza(stringbuilder, (String)entry.getKey(), (zzacs.zza)entry.getValue(), parcel, j);
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:aload           7
	//   37   75:invokeinterface #282 <Method Object java.util.Map$Entry.getKey()>
	//   38   80:checkcast       #284 <Class String>
	//   39   83:aload           7
	//   40   85:invokeinterface #88  <Method Object java.util.Map$Entry.getValue()>
	//   41   90:checkcast       #90  <Class zzacs$zza>
	//   42   93:aload_3         
	//   43   94:iload           6
	//   44   96:invokespecial   #286 <Method void zza(StringBuilder, String, zzacs$zza, Parcel, int)>
				flag = true;
	//   45   99:iconst_1        
	//   46  100:istore          4
			}
		} while(true);
	//   47  102:goto            21
		if(parcel.dataPosition() != i)
	//*  48  105:aload_3         
	//*  49  106:invokevirtual   #266 <Method int Parcel.dataPosition()>
	//*  50  109:iload           5
	//*  51  111:icmpeq          146
		{
			throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i).toString(), parcel);
	//   52  114:new             #288 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   53  117:dup             
	//   54  118:new             #104 <Class StringBuilder>
	//   55  121:dup             
	//   56  122:bipush          37
	//   57  124:invokespecial   #152 <Method void StringBuilder(int)>
	//   58  127:ldc2            #290 <String "Overread allowed size end=">
	//   59  130:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   60  133:iload           5
	//   61  135:invokevirtual   #157 <Method StringBuilder StringBuilder.append(int)>
	//   62  138:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   63  141:aload_3         
	//   64  142:invokespecial   #293 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   65  145:athrow          
		} else
		{
			stringbuilder.append('}');
	//   66  146:aload_1         
	//   67  147:bipush          125
	//   68  149:invokevirtual   #259 <Method StringBuilder StringBuilder.append(char)>
	//   69  152:pop             
			return;
	//   70  153:return          
		}
	}

	private void zzb(StringBuilder stringbuilder, zzacs.zza zza1, Parcel parcel, int i)
	{
		if(zza1.zzyv())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #297 <Method boolean zzacs$zza.zzyv()>
	//*   2    4:ifeq            285
		{
			stringbuilder.append("[");
	//    3    7:aload_1         
	//    4    8:ldc2            #299 <String "[">
	//    5   11:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:pop             
label0:
			switch(zza1.zzyu())
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #162 <Method int zzacs$zza.zzyu()>
			{
	//*   9   19:tableswitch     0 11: default 80
	//	               0 83
	//	               1 96
	//	               2 109
	//	               3 122
	//	               4 135
	//	               5 148
	//	               6 161
	//	               7 174
	//	               8 187
	//	               9 187
	//	               10 187
	//	               11 198
	//*  10   80:goto            265
			case 0: // '\0'
				com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzw(parcel, i));
	//   11   83:aload_1         
	//   12   84:aload_3         
	//   13   85:iload           4
	//   14   87:invokestatic    #302 <Method int[] zzb.zzw(Parcel, int)>
	//   15   90:invokestatic    #307 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, int[])>
				break;
	//   16   93:goto            276

			case 1: // '\001'
				com.google.android.gms.common.util.zzb.zza(stringbuilder, ((Object []) (com.google.android.gms.common.internal.safeparcel.zzb.zzy(parcel, i))));
	//   17   96:aload_1         
	//   18   97:aload_3         
	//   19   98:iload           4
	//   20  100:invokestatic    #311 <Method java.math.BigInteger[] zzb.zzy(Parcel, int)>
	//   21  103:invokestatic    #314 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, Object[])>
				break;
	//   22  106:goto            276

			case 2: // '\002'
				com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzx(parcel, i));
	//   23  109:aload_1         
	//   24  110:aload_3         
	//   25  111:iload           4
	//   26  113:invokestatic    #318 <Method long[] zzb.zzx(Parcel, int)>
	//   27  116:invokestatic    #321 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, long[])>
				break;
	//   28  119:goto            276

			case 3: // '\003'
				com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzz(parcel, i));
	//   29  122:aload_1         
	//   30  123:aload_3         
	//   31  124:iload           4
	//   32  126:invokestatic    #325 <Method float[] zzb.zzz(Parcel, int)>
	//   33  129:invokestatic    #328 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, float[])>
				break;
	//   34  132:goto            276

			case 4: // '\004'
				com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzA(parcel, i));
	//   35  135:aload_1         
	//   36  136:aload_3         
	//   37  137:iload           4
	//   38  139:invokestatic    #332 <Method double[] zzb.zzA(Parcel, int)>
	//   39  142:invokestatic    #335 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, double[])>
				break;
	//   40  145:goto            276

			case 5: // '\005'
				com.google.android.gms.common.util.zzb.zza(stringbuilder, ((Object []) (com.google.android.gms.common.internal.safeparcel.zzb.zzB(parcel, i))));
	//   41  148:aload_1         
	//   42  149:aload_3         
	//   43  150:iload           4
	//   44  152:invokestatic    #339 <Method java.math.BigDecimal[] zzb.zzB(Parcel, int)>
	//   45  155:invokestatic    #314 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, Object[])>
				break;
	//   46  158:goto            276

			case 6: // '\006'
				com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzv(parcel, i));
	//   47  161:aload_1         
	//   48  162:aload_3         
	//   49  163:iload           4
	//   50  165:invokestatic    #343 <Method boolean[] zzb.zzv(Parcel, int)>
	//   51  168:invokestatic    #346 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, boolean[])>
				break;
	//   52  171:goto            276

			case 7: // '\007'
				com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzC(parcel, i));
	//   53  174:aload_1         
	//   54  175:aload_3         
	//   55  176:iload           4
	//   56  178:invokestatic    #350 <Method String[] zzb.zzC(Parcel, int)>
	//   57  181:invokestatic    #353 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, String[])>
				break;
	//   58  184:goto            276

			case 8: // '\b'
			case 9: // '\t'
			case 10: // '\n'
				throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
	//   59  187:new             #355 <Class UnsupportedOperationException>
	//   60  190:dup             
	//   61  191:ldc2            #357 <String "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported">
	//   62  194:invokespecial   #358 <Method void UnsupportedOperationException(String)>
	//   63  197:athrow          

			case 11: // '\013'
				parcel = ((Parcel) (com.google.android.gms.common.internal.safeparcel.zzb.zzG(parcel, i)));
	//   64  198:aload_3         
	//   65  199:iload           4
	//   66  201:invokestatic    #362 <Method Parcel[] zzb.zzG(Parcel, int)>
	//   67  204:astore_3        
				int j = parcel.length;
	//   68  205:aload_3         
	//   69  206:arraylength     
	//   70  207:istore          5
				i = 0;
	//   71  209:iconst_0        
	//   72  210:istore          4
				do
				{
					if(i >= j)
						break label0;
	//   73  212:iload           4
	//   74  214:iload           5
	//   75  216:icmpge          262
					if(i > 0)
	//*  76  219:iload           4
	//*  77  221:ifle            232
						stringbuilder.append(",");
	//   78  224:aload_1         
	//   79  225:ldc2            #279 <String ",">
	//   80  228:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   81  231:pop             
					((Parcel) (parcel[i])).setDataPosition(0);
	//   82  232:aload_3         
	//   83  233:iload           4
	//   84  235:aaload          
	//   85  236:iconst_0        
	//   86  237:invokevirtual   #365 <Method void Parcel.setDataPosition(int)>
					zza(stringbuilder, zza1.zzyC(), ((Parcel) (parcel[i])));
	//   87  240:aload_0         
	//   88  241:aload_1         
	//   89  242:aload_2         
	//   90  243:invokevirtual   #369 <Method Map zzacs$zza.zzyC()>
	//   91  246:aload_3         
	//   92  247:iload           4
	//   93  249:aaload          
	//   94  250:invokespecial   #371 <Method void zza(StringBuilder, Map, Parcel)>
					i++;
	//   95  253:iload           4
	//   96  255:iconst_1        
	//   97  256:iadd            
	//   98  257:istore          4
				} while(true);
	//   99  259:goto            212

	//* 100  262:goto            276
			default:
				throw new IllegalStateException("Unknown field type out.");
	//  101  265:new             #373 <Class IllegalStateException>
	//  102  268:dup             
	//  103  269:ldc2            #375 <String "Unknown field type out.">
	//  104  272:invokespecial   #376 <Method void IllegalStateException(String)>
	//  105  275:athrow          
			}
			stringbuilder.append("]");
	//  106  276:aload_1         
	//  107  277:ldc2            #378 <String "]">
	//  108  280:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  109  283:pop             
			return;
	//  110  284:return          
		}
		switch(zza1.zzyu())
	//* 111  285:aload_2         
	//* 112  286:invokevirtual   #162 <Method int zzacs$zza.zzyu()>
		{
	//* 113  289:tableswitch     0 11: default 352
	//	               0 355
	//	               1 367
	//	               2 379
	//	               3 391
	//	               4 403
	//	               5 415
	//	               6 427
	//	               7 439
	//	               8 466
	//	               9 493
	//	               10 522
	//	               11 656
	//* 114  352:goto            679
		case 0: // '\0'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, i));
	//  115  355:aload_1         
	//  116  356:aload_3         
	//  117  357:iload           4
	//  118  359:invokestatic    #168 <Method int zzb.zzg(Parcel, int)>
	//  119  362:invokevirtual   #157 <Method StringBuilder StringBuilder.append(int)>
	//  120  365:pop             
			return;
	//  121  366:return          

		case 1: // '\001'
			stringbuilder.append(((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzk(parcel, i))));
	//  122  367:aload_1         
	//  123  368:aload_3         
	//  124  369:iload           4
	//  125  371:invokestatic    #185 <Method java.math.BigInteger zzb.zzk(Parcel, int)>
	//  126  374:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//  127  377:pop             
			return;
	//  128  378:return          

		case 2: // '\002'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzi(parcel, i));
	//  129  379:aload_1         
	//  130  380:aload_3         
	//  131  381:iload           4
	//  132  383:invokestatic    #189 <Method long zzb.zzi(Parcel, int)>
	//  133  386:invokevirtual   #381 <Method StringBuilder StringBuilder.append(long)>
	//  134  389:pop             
			return;
	//  135  390:return          

		case 3: // '\003'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzl(parcel, i));
	//  136  391:aload_1         
	//  137  392:aload_3         
	//  138  393:iload           4
	//  139  395:invokestatic    #198 <Method float zzb.zzl(Parcel, int)>
	//  140  398:invokevirtual   #384 <Method StringBuilder StringBuilder.append(float)>
	//  141  401:pop             
			return;
	//  142  402:return          

		case 4: // '\004'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzn(parcel, i));
	//  143  403:aload_1         
	//  144  404:aload_3         
	//  145  405:iload           4
	//  146  407:invokestatic    #207 <Method double zzb.zzn(Parcel, int)>
	//  147  410:invokevirtual   #387 <Method StringBuilder StringBuilder.append(double)>
	//  148  413:pop             
			return;
	//  149  414:return          

		case 5: // '\005'
			stringbuilder.append(((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzp(parcel, i))));
	//  150  415:aload_1         
	//  151  416:aload_3         
	//  152  417:iload           4
	//  153  419:invokestatic    #216 <Method java.math.BigDecimal zzb.zzp(Parcel, int)>
	//  154  422:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//  155  425:pop             
			return;
	//  156  426:return          

		case 6: // '\006'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, i));
	//  157  427:aload_1         
	//  158  428:aload_3         
	//  159  429:iload           4
	//  160  431:invokestatic    #220 <Method boolean zzb.zzc(Parcel, int)>
	//  161  434:invokevirtual   #390 <Method StringBuilder StringBuilder.append(boolean)>
	//  162  437:pop             
			return;
	//  163  438:return          

		case 7: // '\007'
			zza1 = ((zzacs.zza) (com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, i)));
	//  164  439:aload_3         
	//  165  440:iload           4
	//  166  442:invokestatic    #228 <Method String zzb.zzq(Parcel, int)>
	//  167  445:astore_2        
			stringbuilder.append("\"").append(zzq.zzdy(((String) (zza1)))).append("\"");
	//  168  446:aload_1         
	//  169  447:ldc1            #110 <String "\"">
	//  170  449:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  171  452:aload_2         
	//  172  453:invokestatic    #124 <Method String zzq.zzdy(String)>
	//  173  456:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  174  459:ldc1            #110 <String "\"">
	//  175  461:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  176  464:pop             
			return;
	//  177  465:return          

		case 8: // '\b'
			zza1 = ((zzacs.zza) (com.google.android.gms.common.internal.safeparcel.zzb.zzt(parcel, i)));
	//  178  466:aload_3         
	//  179  467:iload           4
	//  180  469:invokestatic    #232 <Method byte[] zzb.zzt(Parcel, int)>
	//  181  472:astore_2        
			stringbuilder.append("\"").append(zzc.zzq(((byte []) (zza1)))).append("\"");
	//  182  473:aload_1         
	//  183  474:ldc1            #110 <String "\"">
	//  184  476:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  185  479:aload_2         
	//  186  480:invokestatic    #132 <Method String zzc.zzq(byte[])>
	//  187  483:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  188  486:ldc1            #110 <String "\"">
	//  189  488:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  190  491:pop             
			return;
	//  191  492:return          

		case 9: // '\t'
			zza1 = ((zzacs.zza) (com.google.android.gms.common.internal.safeparcel.zzb.zzt(parcel, i)));
	//  192  493:aload_3         
	//  193  494:iload           4
	//  194  496:invokestatic    #232 <Method byte[] zzb.zzt(Parcel, int)>
	//  195  499:astore_2        
			stringbuilder.append("\"").append(zzc.zzr(((byte []) (zza1))));
	//  196  500:aload_1         
	//  197  501:ldc1            #110 <String "\"">
	//  198  503:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  199  506:aload_2         
	//  200  507:invokestatic    #135 <Method String zzc.zzr(byte[])>
	//  201  510:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  202  513:pop             
			stringbuilder.append("\"");
	//  203  514:aload_1         
	//  204  515:ldc1            #110 <String "\"">
	//  205  517:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  206  520:pop             
			return;
	//  207  521:return          

		case 10: // '\n'
			zza1 = ((zzacs.zza) (com.google.android.gms.common.internal.safeparcel.zzb.zzs(parcel, i)));
	//  208  522:aload_3         
	//  209  523:iload           4
	//  210  525:invokestatic    #236 <Method Bundle zzb.zzs(Parcel, int)>
	//  211  528:astore_2        
			parcel = ((Parcel) (((Bundle) (zza1)).keySet()));
	//  212  529:aload_2         
	//  213  530:invokevirtual   #395 <Method Set Bundle.keySet()>
	//  214  533:astore_3        
			((Set) (parcel)).size();
	//  215  534:aload_3         
	//  216  535:invokeinterface #398 <Method int Set.size()>
	//  217  540:pop             
			stringbuilder.append("{");
	//  218  541:aload_1         
	//  219  542:ldc2            #400 <String "{">
	//  220  545:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  221  548:pop             
			i = 1;
	//  222  549:iconst_1        
	//  223  550:istore          4
			String s;
			for(parcel = ((Parcel) (((Set) (parcel)).iterator())); ((Iterator) (parcel)).hasNext(); stringbuilder.append("\"").append(zzq.zzdy(((Bundle) (zza1)).getString(s))).append("\""))
	//* 224  552:aload_3         
	//* 225  553:invokeinterface #73  <Method Iterator Set.iterator()>
	//* 226  558:astore_3        
	//* 227  559:aload_3         
	//* 228  560:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//* 229  565:ifeq            647
			{
				s = (String)((Iterator) (parcel)).next();
	//  230  568:aload_3         
	//  231  569:invokeinterface #83  <Method Object Iterator.next()>
	//  232  574:checkcast       #284 <Class String>
	//  233  577:astore          6
				if(i == 0)
	//* 234  579:iload           4
	//* 235  581:ifne            592
					stringbuilder.append(",");
	//  236  584:aload_1         
	//  237  585:ldc2            #279 <String ",">
	//  238  588:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  239  591:pop             
				i = 0;
	//  240  592:iconst_0        
	//  241  593:istore          4
				stringbuilder.append("\"").append(s).append("\"");
	//  242  595:aload_1         
	//  243  596:ldc1            #110 <String "\"">
	//  244  598:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  245  601:aload           6
	//  246  603:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  247  606:ldc1            #110 <String "\"">
	//  248  608:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  249  611:pop             
				stringbuilder.append(":");
	//  250  612:aload_1         
	//  251  613:ldc2            #402 <String ":">
	//  252  616:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  253  619:pop             
			}

	//  254  620:aload_1         
	//  255  621:ldc1            #110 <String "\"">
	//  256  623:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  257  626:aload_2         
	//  258  627:aload           6
	//  259  629:invokevirtual   #405 <Method String Bundle.getString(String)>
	//  260  632:invokestatic    #124 <Method String zzq.zzdy(String)>
	//  261  635:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  262  638:ldc1            #110 <String "\"">
	//  263  640:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  264  643:pop             
	//* 265  644:goto            559
			stringbuilder.append("}");
	//  266  647:aload_1         
	//  267  648:ldc2            #407 <String "}">
	//  268  651:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  269  654:pop             
			return;
	//  270  655:return          

		case 11: // '\013'
			parcel = com.google.android.gms.common.internal.safeparcel.zzb.zzF(parcel, i);
	//  271  656:aload_3         
	//  272  657:iload           4
	//  273  659:invokestatic    #411 <Method Parcel zzb.zzF(Parcel, int)>
	//  274  662:astore_3        
			parcel.setDataPosition(0);
	//  275  663:aload_3         
	//  276  664:iconst_0        
	//  277  665:invokevirtual   #365 <Method void Parcel.setDataPosition(int)>
			zza(stringbuilder, zza1.zzyC(), parcel);
	//  278  668:aload_0         
	//  279  669:aload_1         
	//  280  670:aload_2         
	//  281  671:invokevirtual   #369 <Method Map zzacs$zza.zzyC()>
	//  282  674:aload_3         
	//  283  675:invokespecial   #371 <Method void zza(StringBuilder, Map, Parcel)>
			return;
	//  284  678:return          
		}
		throw new IllegalStateException("Unknown field type out");
	//  285  679:new             #373 <Class IllegalStateException>
	//  286  682:dup             
	//  287  683:ldc2            #413 <String "Unknown field type out">
	//  288  686:invokespecial   #376 <Method void IllegalStateException(String)>
	//  289  689:athrow          
	}

	private void zzb(StringBuilder stringbuilder, zzacs.zza zza1, Object obj)
	{
		if(zza1.zzyt())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #416 <Method boolean zzacs$zza.zzyt()>
	//*   2    4:ifeq            18
		{
			zzb(stringbuilder, zza1, (ArrayList)obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:checkcast       #418 <Class ArrayList>
	//    8   14:invokespecial   #421 <Method void zzb(StringBuilder, zzacs$zza, ArrayList)>
			return;
	//    9   17:return          
		} else
		{
			zza(stringbuilder, zza1.zzys(), obj);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #424 <Method int zzacs$zza.zzys()>
	//   14   24:aload_3         
	//   15   25:invokespecial   #426 <Method void zza(StringBuilder, int, Object)>
			return;
	//   16   28:return          
		}
	}

	private void zzb(StringBuilder stringbuilder, zzacs.zza zza1, ArrayList arraylist)
	{
		stringbuilder.append("[");
	//    0    0:aload_1         
	//    1    1:ldc2            #299 <String "[">
	//    2    4:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
		int j = arraylist.size();
	//    4    8:aload_3         
	//    5    9:invokevirtual   #428 <Method int ArrayList.size()>
	//    6   12:istore          5
		for(int i = 0; i < j; i++)
	//*   7   14:iconst_0        
	//*   8   15:istore          4
	//*   9   17:iload           4
	//*  10   19:iload           5
	//*  11   21:icmpge          61
		{
			if(i != 0)
	//*  12   24:iload           4
	//*  13   26:ifeq            37
				stringbuilder.append(",");
	//   14   29:aload_1         
	//   15   30:ldc2            #279 <String ",">
	//   16   33:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			zza(stringbuilder, zza1.zzys(), arraylist.get(i));
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:invokevirtual   #424 <Method int zzacs$zza.zzys()>
	//   22   43:aload_3         
	//   23   44:iload           4
	//   24   46:invokevirtual   #429 <Method Object ArrayList.get(int)>
	//   25   49:invokespecial   #426 <Method void zza(StringBuilder, int, Object)>
		}

	//   26   52:iload           4
	//   27   54:iconst_1        
	//   28   55:iadd            
	//   29   56:istore          4
	//*  30   58:goto            17
		stringbuilder.append("]");
	//   31   61:aload_1         
	//   32   62:ldc2            #378 <String "]">
	//   33   65:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
	//   35   69:return          
	}

	public static HashMap zzr(Bundle bundle)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #137 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #431 <Method void HashMap()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s)), ((Object) (bundle.getString(s)))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #395 <Method Set Bundle.keySet()>
	//*   6   12:invokeinterface #73  <Method Iterator Set.iterator()>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            51
			s = (String)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #83  <Method Object Iterator.next()>
	//   13   33:checkcast       #284 <Class String>
	//   14   36:astore_3        

	//   15   37:aload_1         
	//   16   38:aload_3         
	//   17   39:aload_0         
	//   18   40:aload_3         
	//   19   41:invokevirtual   #405 <Method String Bundle.getString(String)>
	//   20   44:invokevirtual   #434 <Method Object HashMap.put(Object, Object)>
	//   21   47:pop             
	//*  22   48:goto            18
		return hashmap;
	//   23   51:aload_1         
	//   24   52:areturn         
	}

	public int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public String toString()
	{
		zzac.zzb(((Object) (zzaHf)), "Cannot convert to JSON on client side.");
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field zzacw zzaHf>
	//    2    4:ldc2            #438 <String "Cannot convert to JSON on client side.">
	//    3    7:invokestatic    #440 <Method Object zzac.zzb(Object, Object)>
	//    4   10:pop             
		Parcel parcel = zzyH();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #444 <Method Parcel zzyH()>
	//    7   15:astore_1        
		parcel.setDataPosition(0);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #365 <Method void Parcel.setDataPosition(int)>
		StringBuilder stringbuilder = new StringBuilder(100);
	//   11   21:new             #104 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:bipush          100
	//   14   27:invokespecial   #152 <Method void StringBuilder(int)>
	//   15   30:astore_2        
		zza(stringbuilder, zzaHf.zzdw(mClassName), parcel);
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #46  <Field zzacw zzaHf>
	//   20   37:aload_0         
	//   21   38:getfield        #48  <Field String mClassName>
	//   22   41:invokevirtual   #448 <Method Map zzacw.zzdw(String)>
	//   23   44:aload_1         
	//   24   45:invokespecial   #371 <Method void zza(StringBuilder, Map, Parcel)>
		return stringbuilder.toString();
	//   25   48:aload_2         
	//   26   49:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   27   52:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		zzada.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #453 <Method void zzada.zza(zzacz, Parcel, int)>
	//    4    6:return          
	}

	public Object zzds(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #355 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #457 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #358 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public boolean zzdt(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #355 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #457 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #358 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public Parcel zzyH()
	{
		switch(zzaHo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int zzaHo>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 31
	//	               1 61
	//*   3   28:goto            77
		case 0: // '\0'
			zzaHp = com.google.android.gms.common.internal.safeparcel.zzc.zzaZ(zzaHm);
	//    4   31:aload_0         
	//    5   32:aload_0         
	//    6   33:getfield        #42  <Field Parcel zzaHm>
	//    7   36:invokestatic    #464 <Method int com.google.android.gms.common.internal.safeparcel.zzc.zzaZ(Parcel)>
	//    8   39:putfield        #466 <Field int zzaHp>
			com.google.android.gms.common.internal.safeparcel.zzc.zzJ(zzaHm, zzaHp);
	//    9   42:aload_0         
	//   10   43:getfield        #42  <Field Parcel zzaHm>
	//   11   46:aload_0         
	//   12   47:getfield        #466 <Field int zzaHp>
	//   13   50:invokestatic    #469 <Method void com.google.android.gms.common.internal.safeparcel.zzc.zzJ(Parcel, int)>
			zzaHo = 2;
	//   14   53:aload_0         
	//   15   54:iconst_2        
	//   16   55:putfield        #56  <Field int zzaHo>
			break;

	//*  17   58:goto            77
		case 1: // '\001'
			com.google.android.gms.common.internal.safeparcel.zzc.zzJ(zzaHm, zzaHp);
	//   18   61:aload_0         
	//   19   62:getfield        #42  <Field Parcel zzaHm>
	//   20   65:aload_0         
	//   21   66:getfield        #466 <Field int zzaHp>
	//   22   69:invokestatic    #469 <Method void com.google.android.gms.common.internal.safeparcel.zzc.zzJ(Parcel, int)>
			zzaHo = 2;
	//   23   72:aload_0         
	//   24   73:iconst_2        
	//   25   74:putfield        #56  <Field int zzaHo>
			break;
		}
		return zzaHm;
	//   26   77:aload_0         
	//   27   78:getfield        #42  <Field Parcel zzaHm>
	//   28   81:areturn         
	}

	zzacw zzyI()
	{
		switch(zzaHn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int zzaHn>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 35
	//	               1 37
	//	               2 42
	//*   3   32:goto            47
		case 0: // '\0'
			return null;
	//    4   35:aconst_null     
	//    5   36:areturn         

		case 1: // '\001'
			return zzaHf;
	//    6   37:aload_0         
	//    7   38:getfield        #46  <Field zzacw zzaHf>
	//    8   41:areturn         

		case 2: // '\002'
			return zzaHf;
	//    9   42:aload_0         
	//   10   43:getfield        #46  <Field zzacw zzaHf>
	//   11   46:areturn         
		}
		int i = zzaHn;
	//   12   47:aload_0         
	//   13   48:getfield        #44  <Field int zzaHn>
	//   14   51:istore_1        
		throw new IllegalStateException((new StringBuilder(34)).append("Invalid creation type: ").append(i).toString());
	//   15   52:new             #373 <Class IllegalStateException>
	//   16   55:dup             
	//   17   56:new             #104 <Class StringBuilder>
	//   18   59:dup             
	//   19   60:bipush          34
	//   20   62:invokespecial   #152 <Method void StringBuilder(int)>
	//   21   65:ldc2            #473 <String "Invalid creation type: ">
	//   22   68:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   23   71:iload_1         
	//   24   72:invokevirtual   #157 <Method StringBuilder StringBuilder.append(int)>
	//   25   75:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   26   78:invokespecial   #376 <Method void IllegalStateException(String)>
	//   27   81:athrow          
	}

	public Map zzyr()
	{
		if(zzaHf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field zzacw zzaHf>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaHf.zzdw(mClassName);
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field zzacw zzaHf>
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field String mClassName>
	//    9   17:invokevirtual   #448 <Method Map zzacw.zzdw(String)>
	//   10   20:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzada();
	private final String mClassName;
	private final zzacw zzaHf;
	private final Parcel zzaHm;
	private final int zzaHn = 2;
	private int zzaHo;
	private int zzaHp;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #22  <Class zzada>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzada()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
