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
import com.google.android.gms.common.util.zzp;
import com.google.android.gms.common.util.zzq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//			zzacl, zzacs, zzaco

public class zzacr extends zzacl
{

	zzacr(int i, Parcel parcel, zzaco zzaco1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzacl()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int mVersionCode>
		zzaFP = (Parcel)zzac.zzw(((Object) (parcel)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #38  <Method Object zzac.zzw(Object)>
	//    8   14:checkcast       #40  <Class Parcel>
	//    9   17:putfield        #42  <Field Parcel zzaFP>
	//   10   20:aload_0         
	//   11   21:iconst_2        
	//   12   22:putfield        #44  <Field int zzaFQ>
		zzaFI = zzaco1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #46  <Field zzaco zzaFI>
		if(zzaFI == null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #46  <Field zzaco zzaFI>
	//*  18   34:ifnonnull       48
			mClassName = null;
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:putfield        #48  <Field String mClassName>
		else
	//*  22   42:aload_0         
	//*  23   43:iconst_2        
	//*  24   44:putfield        #50  <Field int zzaFR>
	//*  25   47:return          
			mClassName = zzaFI.zzxY();
	//   26   48:aload_0         
	//   27   49:aload_0         
	//   28   50:getfield        #46  <Field zzaco zzaFI>
	//   29   53:invokevirtual   #56  <Method String zzaco.zzxY()>
	//   30   56:putfield        #48  <Field String mClassName>
		zzaFR = 2;
	//*  31   59:goto            42
	}

	private static SparseArray zzX(Map map)
	{
		SparseArray sparsearray = new SparseArray();
	//    0    0:new             #60  <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void SparseArray()>
	//    3    7:astore_1        
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); sparsearray.put(((zzack.zza)entry.getValue()).zzxQ(), ((Object) (entry))))
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
	//   18   46:checkcast       #90  <Class zzack$zza>
	//   19   49:invokevirtual   #94  <Method int zzack$zza.zzxQ()>
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
	//	               0 93
	//	               1 93
	//	               2 93
	//	               3 93
	//	               4 93
	//	               5 93
	//	               6 93
	//	               7 100
	//	               8 123
	//	               9 146
	//	               10 171
	//	               11 180
		default:
			throw new IllegalArgumentException((new StringBuilder(26)).append("Unknown type = ").append(i).toString());
	//    2   64:new             #104 <Class IllegalArgumentException>
	//    3   67:dup             
	//    4   68:new             #106 <Class StringBuilder>
	//    5   71:dup             
	//    6   72:bipush          26
	//    7   74:invokespecial   #109 <Method void StringBuilder(int)>
	//    8   77:ldc1            #111 <String "Unknown type = ">
	//    9   79:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   10   82:iload_2         
	//   11   83:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   12   86:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   13   89:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   14   92:athrow          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			stringbuilder.append(obj);
	//   15   93:aload_1         
	//   16   94:aload_3         
	//   17   95:invokevirtual   #127 <Method StringBuilder StringBuilder.append(Object)>
	//   18   98:pop             
			return;
	//   19   99:return          

		case 7: // '\007'
			stringbuilder.append("\"").append(zzp.zzdC(obj.toString())).append("\"");
	//   20  100:aload_1         
	//   21  101:ldc1            #129 <String "\"">
	//   22  103:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   23  106:aload_3         
	//   24  107:invokevirtual   #132 <Method String Object.toString()>
	//   25  110:invokestatic    #138 <Method String zzp.zzdC(String)>
	//   26  113:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   27  116:ldc1            #129 <String "\"">
	//   28  118:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   29  121:pop             
			return;
	//   30  122:return          

		case 8: // '\b'
			stringbuilder.append("\"").append(zzc.zzq((byte[])obj)).append("\"");
	//   31  123:aload_1         
	//   32  124:ldc1            #129 <String "\"">
	//   33  126:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   34  129:aload_3         
	//   35  130:checkcast       #140 <Class byte[]>
	//   36  133:invokestatic    #146 <Method String zzc.zzq(byte[])>
	//   37  136:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   38  139:ldc1            #129 <String "\"">
	//   39  141:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   40  144:pop             
			return;
	//   41  145:return          

		case 9: // '\t'
			stringbuilder.append("\"").append(zzc.zzr((byte[])obj));
	//   42  146:aload_1         
	//   43  147:ldc1            #129 <String "\"">
	//   44  149:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   45  152:aload_3         
	//   46  153:checkcast       #140 <Class byte[]>
	//   47  156:invokestatic    #149 <Method String zzc.zzr(byte[])>
	//   48  159:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   49  162:pop             
			stringbuilder.append("\"");
	//   50  163:aload_1         
	//   51  164:ldc1            #129 <String "\"">
	//   52  166:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   53  169:pop             
			return;
	//   54  170:return          

		case 10: // '\n'
			zzq.zza(stringbuilder, (HashMap)obj);
	//   55  171:aload_1         
	//   56  172:aload_3         
	//   57  173:checkcast       #151 <Class HashMap>
	//   58  176:invokestatic    #156 <Method void zzq.zza(StringBuilder, HashMap)>
			return;
	//   59  179:return          

		case 11: // '\013'
			throw new IllegalArgumentException("Method does not accept concrete type.");
	//   60  180:new             #104 <Class IllegalArgumentException>
	//   61  183:dup             
	//   62  184:ldc1            #158 <String "Method does not accept concrete type.">
	//   63  186:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   64  189:athrow          
		}
	}

	private void zza(StringBuilder stringbuilder, zzack.zza zza1, Parcel parcel, int i)
	{
		switch(zza1.zzxN())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #162 <Method int zzack$zza.zzxN()>
		{
	//*   2    4:tableswitch     0 11: default 68
	//	               0 104
	//	               1 125
	//	               2 143
	//	               3 164
	//	               4 185
	//	               5 206
	//	               6 224
	//	               7 245
	//	               8 263
	//	               9 263
	//	               10 281
	//	               11 302
		default:
			i = zza1.zzxN();
	//    3   68:aload_2         
	//    4   69:invokevirtual   #162 <Method int zzack$zza.zzxN()>
	//    5   72:istore          4
			throw new IllegalArgumentException((new StringBuilder(36)).append("Unknown field out type = ").append(i).toString());
	//    6   74:new             #104 <Class IllegalArgumentException>
	//    7   77:dup             
	//    8   78:new             #106 <Class StringBuilder>
	//    9   81:dup             
	//   10   82:bipush          36
	//   11   84:invokespecial   #109 <Method void StringBuilder(int)>
	//   12   87:ldc1            #164 <String "Unknown field out type = ">
	//   13   89:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   14   92:iload           4
	//   15   94:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   16   97:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   17  100:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   18  103:athrow          

		case 0: // '\0'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Integer.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, i))))));
	//   19  104:aload_0         
	//   20  105:aload_1         
	//   21  106:aload_2         
	//   22  107:aload_0         
	//   23  108:aload_2         
	//   24  109:aload_3         
	//   25  110:iload           4
	//   26  112:invokestatic    #170 <Method int zzb.zzg(Parcel, int)>
	//   27  115:invokestatic    #176 <Method Integer Integer.valueOf(int)>
	//   28  118:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//   29  121:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//   30  124:return          

		case 1: // '\001'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzk(parcel, i)))));
	//   31  125:aload_0         
	//   32  126:aload_1         
	//   33  127:aload_2         
	//   34  128:aload_0         
	//   35  129:aload_2         
	//   36  130:aload_3         
	//   37  131:iload           4
	//   38  133:invokestatic    #187 <Method java.math.BigInteger zzb.zzk(Parcel, int)>
	//   39  136:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//   40  139:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//   41  142:return          

		case 2: // '\002'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Long.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzi(parcel, i))))));
	//   42  143:aload_0         
	//   43  144:aload_1         
	//   44  145:aload_2         
	//   45  146:aload_0         
	//   46  147:aload_2         
	//   47  148:aload_3         
	//   48  149:iload           4
	//   49  151:invokestatic    #191 <Method long zzb.zzi(Parcel, int)>
	//   50  154:invokestatic    #196 <Method Long Long.valueOf(long)>
	//   51  157:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//   52  160:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//   53  163:return          

		case 3: // '\003'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Float.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzl(parcel, i))))));
	//   54  164:aload_0         
	//   55  165:aload_1         
	//   56  166:aload_2         
	//   57  167:aload_0         
	//   58  168:aload_2         
	//   59  169:aload_3         
	//   60  170:iload           4
	//   61  172:invokestatic    #200 <Method float zzb.zzl(Parcel, int)>
	//   62  175:invokestatic    #205 <Method Float Float.valueOf(float)>
	//   63  178:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//   64  181:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//   65  184:return          

		case 4: // '\004'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Double.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzn(parcel, i))))));
	//   66  185:aload_0         
	//   67  186:aload_1         
	//   68  187:aload_2         
	//   69  188:aload_0         
	//   70  189:aload_2         
	//   71  190:aload_3         
	//   72  191:iload           4
	//   73  193:invokestatic    #209 <Method double zzb.zzn(Parcel, int)>
	//   74  196:invokestatic    #214 <Method Double Double.valueOf(double)>
	//   75  199:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//   76  202:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//   77  205:return          

		case 5: // '\005'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzp(parcel, i)))));
	//   78  206:aload_0         
	//   79  207:aload_1         
	//   80  208:aload_2         
	//   81  209:aload_0         
	//   82  210:aload_2         
	//   83  211:aload_3         
	//   84  212:iload           4
	//   85  214:invokestatic    #218 <Method java.math.BigDecimal zzb.zzp(Parcel, int)>
	//   86  217:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//   87  220:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//   88  223:return          

		case 6: // '\006'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, i))))));
	//   89  224:aload_0         
	//   90  225:aload_1         
	//   91  226:aload_2         
	//   92  227:aload_0         
	//   93  228:aload_2         
	//   94  229:aload_3         
	//   95  230:iload           4
	//   96  232:invokestatic    #222 <Method boolean zzb.zzc(Parcel, int)>
	//   97  235:invokestatic    #227 <Method Boolean Boolean.valueOf(boolean)>
	//   98  238:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//   99  241:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//  100  244:return          

		case 7: // '\007'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, i)))));
	//  101  245:aload_0         
	//  102  246:aload_1         
	//  103  247:aload_2         
	//  104  248:aload_0         
	//  105  249:aload_2         
	//  106  250:aload_3         
	//  107  251:iload           4
	//  108  253:invokestatic    #230 <Method String zzb.zzq(Parcel, int)>
	//  109  256:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//  110  259:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//  111  262:return          

		case 8: // '\b'
		case 9: // '\t'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzt(parcel, i)))));
	//  112  263:aload_0         
	//  113  264:aload_1         
	//  114  265:aload_2         
	//  115  266:aload_0         
	//  116  267:aload_2         
	//  117  268:aload_3         
	//  118  269:iload           4
	//  119  271:invokestatic    #234 <Method byte[] zzb.zzt(Parcel, int)>
	//  120  274:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//  121  277:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//  122  280:return          

		case 10: // '\n'
			zzb(stringbuilder, zza1, zza(zza1, ((Object) (zzr(com.google.android.gms.common.internal.safeparcel.zzb.zzs(parcel, i))))));
	//  123  281:aload_0         
	//  124  282:aload_1         
	//  125  283:aload_2         
	//  126  284:aload_0         
	//  127  285:aload_2         
	//  128  286:aload_3         
	//  129  287:iload           4
	//  130  289:invokestatic    #238 <Method Bundle zzb.zzs(Parcel, int)>
	//  131  292:invokestatic    #241 <Method HashMap zzr(Bundle)>
	//  132  295:invokevirtual   #179 <Method Object zza(zzack$zza, Object)>
	//  133  298:invokespecial   #183 <Method void zzb(StringBuilder, zzack$zza, Object)>
			return;
	//  134  301:return          

		case 11: // '\013'
			throw new IllegalArgumentException("Method does not accept concrete type.");
	//  135  302:new             #104 <Class IllegalArgumentException>
	//  136  305:dup             
	//  137  306:ldc1            #158 <String "Method does not accept concrete type.">
	//  138  308:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//  139  311:athrow          
		}
	}

	private void zza(StringBuilder stringbuilder, String s, zzack.zza zza1, Parcel parcel, int i)
	{
		stringbuilder.append("\"").append(s).append("\":");
	//    0    0:aload_1         
	//    1    1:ldc1            #129 <String "\"">
	//    2    3:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:aload_2         
	//    4    7:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    5   10:ldc1            #245 <String "\":">
	//    6   12:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		if(zza1.zzxT())
	//*   8   16:aload_3         
	//*   9   17:invokevirtual   #248 <Method boolean zzack$zza.zzxT()>
	//*  10   20:ifeq            34
		{
			zza(stringbuilder, zza1, parcel, i);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:iload           5
	//   16   30:invokespecial   #250 <Method void zza(StringBuilder, zzack$zza, Parcel, int)>
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
	//   23   41:invokespecial   #252 <Method void zzb(StringBuilder, zzack$zza, Parcel, int)>
			return;
	//   24   44:return          
		}
	}

	private void zza(StringBuilder stringbuilder, Map map, Parcel parcel)
	{
		map = ((Map) (zzX(map)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #256 <Method SparseArray zzX(Map)>
	//    2    4:astore_2        
		stringbuilder.append('{');
	//    3    5:aload_1         
	//    4    6:bipush          123
	//    5    8:invokevirtual   #259 <Method StringBuilder StringBuilder.append(char)>
	//    6   11:pop             
		int i = com.google.android.gms.common.internal.safeparcel.zzb.zzaU(parcel);
	//    7   12:aload_3         
	//    8   13:invokestatic    #263 <Method int zzb.zzaU(Parcel)>
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
	//   15   27:icmpge          102
			int j = com.google.android.gms.common.internal.safeparcel.zzb.zzaT(parcel);
	//   16   30:aload_3         
	//   17   31:invokestatic    #269 <Method int zzb.zzaT(Parcel)>
	//   18   34:istore          6
			java.util.Map.Entry entry = (java.util.Map.Entry)((SparseArray) (map)).get(com.google.android.gms.common.internal.safeparcel.zzb.zzcW(j));
	//   19   36:aload_2         
	//   20   37:iload           6
	//   21   39:invokestatic    #273 <Method int zzb.zzcW(int)>
	//   22   42:invokevirtual   #277 <Method Object SparseArray.get(int)>
	//   23   45:checkcast       #85  <Class java.util.Map$Entry>
	//   24   48:astore          7
			if(entry != null)
	//*  25   50:aload           7
	//*  26   52:ifnull          21
			{
				if(flag)
	//*  27   55:iload           4
	//*  28   57:ifeq            68
					stringbuilder.append(",");
	//   29   60:aload_1         
	//   30   61:ldc2            #279 <String ",">
	//   31   64:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:pop             
				zza(stringbuilder, (String)entry.getKey(), (zzack.zza)entry.getValue(), parcel, j);
	//   33   68:aload_0         
	//   34   69:aload_1         
	//   35   70:aload           7
	//   36   72:invokeinterface #282 <Method Object java.util.Map$Entry.getKey()>
	//   37   77:checkcast       #284 <Class String>
	//   38   80:aload           7
	//   39   82:invokeinterface #88  <Method Object java.util.Map$Entry.getValue()>
	//   40   87:checkcast       #90  <Class zzack$zza>
	//   41   90:aload_3         
	//   42   91:iload           6
	//   43   93:invokespecial   #286 <Method void zza(StringBuilder, String, zzack$zza, Parcel, int)>
				flag = true;
	//   44   96:iconst_1        
	//   45   97:istore          4
			}
		} while(true);
	//   46   99:goto            21
		if(parcel.dataPosition() != i)
	//*  47  102:aload_3         
	//*  48  103:invokevirtual   #266 <Method int Parcel.dataPosition()>
	//*  49  106:iload           5
	//*  50  108:icmpeq          143
		{
			throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i).toString(), parcel);
	//   51  111:new             #288 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   52  114:dup             
	//   53  115:new             #106 <Class StringBuilder>
	//   54  118:dup             
	//   55  119:bipush          37
	//   56  121:invokespecial   #109 <Method void StringBuilder(int)>
	//   57  124:ldc2            #290 <String "Overread allowed size end=">
	//   58  127:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   59  130:iload           5
	//   60  132:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   61  135:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   62  138:aload_3         
	//   63  139:invokespecial   #293 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   64  142:athrow          
		} else
		{
			stringbuilder.append('}');
	//   65  143:aload_1         
	//   66  144:bipush          125
	//   67  146:invokevirtual   #259 <Method StringBuilder StringBuilder.append(char)>
	//   68  149:pop             
			return;
	//   69  150:return          
		}
	}

	private void zzb(StringBuilder stringbuilder, zzack.zza zza1, Parcel parcel, int i)
	{
		if(!zza1.zzxO()) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:invokevirtual   #297 <Method boolean zzack$zza.zzxO()>
	//    2    4:ifeq            276
_L1:
		stringbuilder.append("[");
	//    3    7:aload_1         
	//    4    8:ldc2            #299 <String "[">
	//    5   11:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:pop             
		zza1.zzxN();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #162 <Method int zzack$zza.zzxN()>
		JVM INSTR tableswitch 0 11: default 80
	//	               0 91
	//	               1 110
	//	               2 123
	//	               3 136
	//	               4 149
	//	               5 162
	//	               6 175
	//	               7 188
	//	               8 201
	//	               9 201
	//	               10 201
	//	               11 212;
	//    9   19:tableswitch     0 11: default 80
	//	               0 91
	//	               1 110
	//	               2 123
	//	               3 136
	//	               4 149
	//	               5 162
	//	               6 175
	//	               7 188
	//	               8 201
	//	               9 201
	//	               10 201
	//	               11 212
		   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
		throw new IllegalStateException("Unknown field type out.");
	//   10   80:new             #301 <Class IllegalStateException>
	//   11   83:dup             
	//   12   84:ldc2            #303 <String "Unknown field type out.">
	//   13   87:invokespecial   #304 <Method void IllegalStateException(String)>
	//   14   90:athrow          
_L4:
		com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzw(parcel, i));
	//   15   91:aload_1         
	//   16   92:aload_3         
	//   17   93:iload           4
	//   18   95:invokestatic    #307 <Method int[] zzb.zzw(Parcel, int)>
	//   19   98:invokestatic    #312 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, int[])>
_L14:
		stringbuilder.append("]");
	//   20  101:aload_1         
	//   21  102:ldc2            #314 <String "]">
	//   22  105:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   23  108:pop             
		return;
	//   24  109:return          
_L5:
		com.google.android.gms.common.util.zzb.zza(stringbuilder, ((Object []) (com.google.android.gms.common.internal.safeparcel.zzb.zzy(parcel, i))));
	//   25  110:aload_1         
	//   26  111:aload_3         
	//   27  112:iload           4
	//   28  114:invokestatic    #318 <Method java.math.BigInteger[] zzb.zzy(Parcel, int)>
	//   29  117:invokestatic    #321 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, Object[])>
		continue; /* Loop/switch isn't completed */
	//   30  120:goto            101
_L6:
		com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzx(parcel, i));
	//   31  123:aload_1         
	//   32  124:aload_3         
	//   33  125:iload           4
	//   34  127:invokestatic    #325 <Method long[] zzb.zzx(Parcel, int)>
	//   35  130:invokestatic    #328 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, long[])>
		continue; /* Loop/switch isn't completed */
	//   36  133:goto            101
_L7:
		com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzz(parcel, i));
	//   37  136:aload_1         
	//   38  137:aload_3         
	//   39  138:iload           4
	//   40  140:invokestatic    #332 <Method float[] zzb.zzz(Parcel, int)>
	//   41  143:invokestatic    #335 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, float[])>
		continue; /* Loop/switch isn't completed */
	//   42  146:goto            101
_L8:
		com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzA(parcel, i));
	//   43  149:aload_1         
	//   44  150:aload_3         
	//   45  151:iload           4
	//   46  153:invokestatic    #339 <Method double[] zzb.zzA(Parcel, int)>
	//   47  156:invokestatic    #342 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, double[])>
		continue; /* Loop/switch isn't completed */
	//   48  159:goto            101
_L9:
		com.google.android.gms.common.util.zzb.zza(stringbuilder, ((Object []) (com.google.android.gms.common.internal.safeparcel.zzb.zzB(parcel, i))));
	//   49  162:aload_1         
	//   50  163:aload_3         
	//   51  164:iload           4
	//   52  166:invokestatic    #346 <Method java.math.BigDecimal[] zzb.zzB(Parcel, int)>
	//   53  169:invokestatic    #321 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, Object[])>
		continue; /* Loop/switch isn't completed */
	//   54  172:goto            101
_L10:
		com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzv(parcel, i));
	//   55  175:aload_1         
	//   56  176:aload_3         
	//   57  177:iload           4
	//   58  179:invokestatic    #350 <Method boolean[] zzb.zzv(Parcel, int)>
	//   59  182:invokestatic    #353 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, boolean[])>
		continue; /* Loop/switch isn't completed */
	//   60  185:goto            101
_L11:
		com.google.android.gms.common.util.zzb.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zzb.zzC(parcel, i));
	//   61  188:aload_1         
	//   62  189:aload_3         
	//   63  190:iload           4
	//   64  192:invokestatic    #357 <Method String[] zzb.zzC(Parcel, int)>
	//   65  195:invokestatic    #360 <Method void com.google.android.gms.common.util.zzb.zza(StringBuilder, String[])>
		if(true) goto _L14; else goto _L12
	//   66  198:goto            101
_L12:
		throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
	//   67  201:new             #362 <Class UnsupportedOperationException>
	//   68  204:dup             
	//   69  205:ldc2            #364 <String "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported">
	//   70  208:invokespecial   #365 <Method void UnsupportedOperationException(String)>
	//   71  211:athrow          
_L13:
		parcel = ((Parcel) (com.google.android.gms.common.internal.safeparcel.zzb.zzG(parcel, i)));
	//   72  212:aload_3         
	//   73  213:iload           4
	//   74  215:invokestatic    #369 <Method Parcel[] zzb.zzG(Parcel, int)>
	//   75  218:astore_3        
		int j = parcel.length;
	//   76  219:aload_3         
	//   77  220:arraylength     
	//   78  221:istore          5
		i = 0;
	//   79  223:iconst_0        
	//   80  224:istore          4
		while(i < j) 
	//*  81  226:iload           4
	//*  82  228:iload           5
	//*  83  230:icmpge          101
		{
			if(i > 0)
	//*  84  233:iload           4
	//*  85  235:ifle            246
				stringbuilder.append(",");
	//   86  238:aload_1         
	//   87  239:ldc2            #279 <String ",">
	//   88  242:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   89  245:pop             
			((Parcel) (parcel[i])).setDataPosition(0);
	//   90  246:aload_3         
	//   91  247:iload           4
	//   92  249:aaload          
	//   93  250:iconst_0        
	//   94  251:invokevirtual   #372 <Method void Parcel.setDataPosition(int)>
			zza(stringbuilder, zza1.zzxV(), ((Parcel) (parcel[i])));
	//   95  254:aload_0         
	//   96  255:aload_1         
	//   97  256:aload_2         
	//   98  257:invokevirtual   #376 <Method Map zzack$zza.zzxV()>
	//   99  260:aload_3         
	//  100  261:iload           4
	//  101  263:aaload          
	//  102  264:invokespecial   #378 <Method void zza(StringBuilder, Map, Parcel)>
			i++;
	//  103  267:iload           4
	//  104  269:iconst_1        
	//  105  270:iadd            
	//  106  271:istore          4
		}
		if(true) goto _L14; else goto _L2
	//  107  273:goto            226
_L2:
		switch(zza1.zzxN())
	//* 108  276:aload_2         
	//* 109  277:invokevirtual   #162 <Method int zzack$zza.zzxN()>
		{
	//* 110  280:tableswitch     0 11: default 344
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
		default:
			throw new IllegalStateException("Unknown field type out");
	//  111  344:new             #301 <Class IllegalStateException>
	//  112  347:dup             
	//  113  348:ldc2            #380 <String "Unknown field type out">
	//  114  351:invokespecial   #304 <Method void IllegalStateException(String)>
	//  115  354:athrow          

		case 0: // '\0'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzg(parcel, i));
	//  116  355:aload_1         
	//  117  356:aload_3         
	//  118  357:iload           4
	//  119  359:invokestatic    #170 <Method int zzb.zzg(Parcel, int)>
	//  120  362:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//  121  365:pop             
			return;
	//  122  366:return          

		case 1: // '\001'
			stringbuilder.append(((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzk(parcel, i))));
	//  123  367:aload_1         
	//  124  368:aload_3         
	//  125  369:iload           4
	//  126  371:invokestatic    #187 <Method java.math.BigInteger zzb.zzk(Parcel, int)>
	//  127  374:invokevirtual   #127 <Method StringBuilder StringBuilder.append(Object)>
	//  128  377:pop             
			return;
	//  129  378:return          

		case 2: // '\002'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzi(parcel, i));
	//  130  379:aload_1         
	//  131  380:aload_3         
	//  132  381:iload           4
	//  133  383:invokestatic    #191 <Method long zzb.zzi(Parcel, int)>
	//  134  386:invokevirtual   #383 <Method StringBuilder StringBuilder.append(long)>
	//  135  389:pop             
			return;
	//  136  390:return          

		case 3: // '\003'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzl(parcel, i));
	//  137  391:aload_1         
	//  138  392:aload_3         
	//  139  393:iload           4
	//  140  395:invokestatic    #200 <Method float zzb.zzl(Parcel, int)>
	//  141  398:invokevirtual   #386 <Method StringBuilder StringBuilder.append(float)>
	//  142  401:pop             
			return;
	//  143  402:return          

		case 4: // '\004'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzn(parcel, i));
	//  144  403:aload_1         
	//  145  404:aload_3         
	//  146  405:iload           4
	//  147  407:invokestatic    #209 <Method double zzb.zzn(Parcel, int)>
	//  148  410:invokevirtual   #389 <Method StringBuilder StringBuilder.append(double)>
	//  149  413:pop             
			return;
	//  150  414:return          

		case 5: // '\005'
			stringbuilder.append(((Object) (com.google.android.gms.common.internal.safeparcel.zzb.zzp(parcel, i))));
	//  151  415:aload_1         
	//  152  416:aload_3         
	//  153  417:iload           4
	//  154  419:invokestatic    #218 <Method java.math.BigDecimal zzb.zzp(Parcel, int)>
	//  155  422:invokevirtual   #127 <Method StringBuilder StringBuilder.append(Object)>
	//  156  425:pop             
			return;
	//  157  426:return          

		case 6: // '\006'
			stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, i));
	//  158  427:aload_1         
	//  159  428:aload_3         
	//  160  429:iload           4
	//  161  431:invokestatic    #222 <Method boolean zzb.zzc(Parcel, int)>
	//  162  434:invokevirtual   #392 <Method StringBuilder StringBuilder.append(boolean)>
	//  163  437:pop             
			return;
	//  164  438:return          

		case 7: // '\007'
			zza1 = ((zzack.zza) (com.google.android.gms.common.internal.safeparcel.zzb.zzq(parcel, i)));
	//  165  439:aload_3         
	//  166  440:iload           4
	//  167  442:invokestatic    #230 <Method String zzb.zzq(Parcel, int)>
	//  168  445:astore_2        
			stringbuilder.append("\"").append(zzp.zzdC(((String) (zza1)))).append("\"");
	//  169  446:aload_1         
	//  170  447:ldc1            #129 <String "\"">
	//  171  449:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  172  452:aload_2         
	//  173  453:invokestatic    #138 <Method String zzp.zzdC(String)>
	//  174  456:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  175  459:ldc1            #129 <String "\"">
	//  176  461:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  177  464:pop             
			return;
	//  178  465:return          

		case 8: // '\b'
			zza1 = ((zzack.zza) (com.google.android.gms.common.internal.safeparcel.zzb.zzt(parcel, i)));
	//  179  466:aload_3         
	//  180  467:iload           4
	//  181  469:invokestatic    #234 <Method byte[] zzb.zzt(Parcel, int)>
	//  182  472:astore_2        
			stringbuilder.append("\"").append(zzc.zzq(((byte []) (zza1)))).append("\"");
	//  183  473:aload_1         
	//  184  474:ldc1            #129 <String "\"">
	//  185  476:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  186  479:aload_2         
	//  187  480:invokestatic    #146 <Method String zzc.zzq(byte[])>
	//  188  483:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  189  486:ldc1            #129 <String "\"">
	//  190  488:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  191  491:pop             
			return;
	//  192  492:return          

		case 9: // '\t'
			zza1 = ((zzack.zza) (com.google.android.gms.common.internal.safeparcel.zzb.zzt(parcel, i)));
	//  193  493:aload_3         
	//  194  494:iload           4
	//  195  496:invokestatic    #234 <Method byte[] zzb.zzt(Parcel, int)>
	//  196  499:astore_2        
			stringbuilder.append("\"").append(zzc.zzr(((byte []) (zza1))));
	//  197  500:aload_1         
	//  198  501:ldc1            #129 <String "\"">
	//  199  503:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  200  506:aload_2         
	//  201  507:invokestatic    #149 <Method String zzc.zzr(byte[])>
	//  202  510:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  203  513:pop             
			stringbuilder.append("\"");
	//  204  514:aload_1         
	//  205  515:ldc1            #129 <String "\"">
	//  206  517:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  207  520:pop             
			return;
	//  208  521:return          

		case 10: // '\n'
			zza1 = ((zzack.zza) (com.google.android.gms.common.internal.safeparcel.zzb.zzs(parcel, i)));
	//  209  522:aload_3         
	//  210  523:iload           4
	//  211  525:invokestatic    #238 <Method Bundle zzb.zzs(Parcel, int)>
	//  212  528:astore_2        
			parcel = ((Parcel) (((Bundle) (zza1)).keySet()));
	//  213  529:aload_2         
	//  214  530:invokevirtual   #397 <Method Set Bundle.keySet()>
	//  215  533:astore_3        
			((Set) (parcel)).size();
	//  216  534:aload_3         
	//  217  535:invokeinterface #400 <Method int Set.size()>
	//  218  540:pop             
			stringbuilder.append("{");
	//  219  541:aload_1         
	//  220  542:ldc2            #402 <String "{">
	//  221  545:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  222  548:pop             
			parcel = ((Parcel) (((Set) (parcel)).iterator()));
	//  223  549:aload_3         
	//  224  550:invokeinterface #73  <Method Iterator Set.iterator()>
	//  225  555:astore_3        
			for(i = 1; ((Iterator) (parcel)).hasNext(); i = 0)
	//* 226  556:iconst_1        
	//* 227  557:istore          4
	//* 228  559:aload_3         
	//* 229  560:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//* 230  565:ifeq            647
			{
				String s = (String)((Iterator) (parcel)).next();
	//  231  568:aload_3         
	//  232  569:invokeinterface #83  <Method Object Iterator.next()>
	//  233  574:checkcast       #284 <Class String>
	//  234  577:astore          6
				if(i == 0)
	//* 235  579:iload           4
	//* 236  581:ifne            592
					stringbuilder.append(",");
	//  237  584:aload_1         
	//  238  585:ldc2            #279 <String ",">
	//  239  588:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  240  591:pop             
				stringbuilder.append("\"").append(s).append("\"");
	//  241  592:aload_1         
	//  242  593:ldc1            #129 <String "\"">
	//  243  595:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  244  598:aload           6
	//  245  600:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  246  603:ldc1            #129 <String "\"">
	//  247  605:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  248  608:pop             
				stringbuilder.append(":");
	//  249  609:aload_1         
	//  250  610:ldc2            #404 <String ":">
	//  251  613:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  252  616:pop             
				stringbuilder.append("\"").append(zzp.zzdC(((Bundle) (zza1)).getString(s))).append("\"");
	//  253  617:aload_1         
	//  254  618:ldc1            #129 <String "\"">
	//  255  620:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  256  623:aload_2         
	//  257  624:aload           6
	//  258  626:invokevirtual   #407 <Method String Bundle.getString(String)>
	//  259  629:invokestatic    #138 <Method String zzp.zzdC(String)>
	//  260  632:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  261  635:ldc1            #129 <String "\"">
	//  262  637:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  263  640:pop             
			}

	//  264  641:iconst_0        
	//  265  642:istore          4
	//* 266  644:goto            559
			stringbuilder.append("}");
	//  267  647:aload_1         
	//  268  648:ldc2            #409 <String "}">
	//  269  651:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  270  654:pop             
			return;
	//  271  655:return          

		case 11: // '\013'
			parcel = com.google.android.gms.common.internal.safeparcel.zzb.zzF(parcel, i);
	//  272  656:aload_3         
	//  273  657:iload           4
	//  274  659:invokestatic    #413 <Method Parcel zzb.zzF(Parcel, int)>
	//  275  662:astore_3        
			parcel.setDataPosition(0);
	//  276  663:aload_3         
	//  277  664:iconst_0        
	//  278  665:invokevirtual   #372 <Method void Parcel.setDataPosition(int)>
			zza(stringbuilder, zza1.zzxV(), parcel);
	//  279  668:aload_0         
	//  280  669:aload_1         
	//  281  670:aload_2         
	//  282  671:invokevirtual   #376 <Method Map zzack$zza.zzxV()>
	//  283  674:aload_3         
	//  284  675:invokespecial   #378 <Method void zza(StringBuilder, Map, Parcel)>
			return;
	//  285  678:return          
		}
	}

	private void zzb(StringBuilder stringbuilder, zzack.zza zza1, Object obj)
	{
		if(zza1.zzxM())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #416 <Method boolean zzack$zza.zzxM()>
	//*   2    4:ifeq            18
		{
			zzb(stringbuilder, zza1, (ArrayList)obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:checkcast       #418 <Class ArrayList>
	//    8   14:invokespecial   #421 <Method void zzb(StringBuilder, zzack$zza, ArrayList)>
			return;
	//    9   17:return          
		} else
		{
			zza(stringbuilder, zza1.zzxL(), obj);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #424 <Method int zzack$zza.zzxL()>
	//   14   24:aload_3         
	//   15   25:invokespecial   #426 <Method void zza(StringBuilder, int, Object)>
			return;
	//   16   28:return          
		}
	}

	private void zzb(StringBuilder stringbuilder, zzack.zza zza1, ArrayList arraylist)
	{
		stringbuilder.append("[");
	//    0    0:aload_1         
	//    1    1:ldc2            #299 <String "[">
	//    2    4:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
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
	//   16   33:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			zza(stringbuilder, zza1.zzxL(), arraylist.get(i));
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:invokevirtual   #424 <Method int zzack$zza.zzxL()>
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
	//   32   62:ldc2            #314 <String "]">
	//   33   65:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
	//   35   69:return          
	}

	public static HashMap zzr(Bundle bundle)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #151 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #431 <Method void HashMap()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s)), ((Object) (bundle.getString(s)))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #397 <Method Set Bundle.keySet()>
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
	//   19   41:invokevirtual   #407 <Method String Bundle.getString(String)>
	//   20   44:invokevirtual   #434 <Method Object HashMap.put(Object, Object)>
	//   21   47:pop             
	//*  22   48:goto            18
		return hashmap;
	//   23   51:aload_1         
	//   24   52:areturn         
	}

	public int getVersionCode()
	{
		return mVersionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int mVersionCode>
	//    2    4:ireturn         
	}

	public String toString()
	{
		zzac.zzb(((Object) (zzaFI)), "Cannot convert to JSON on client side.");
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field zzaco zzaFI>
	//    2    4:ldc2            #438 <String "Cannot convert to JSON on client side.">
	//    3    7:invokestatic    #440 <Method Object zzac.zzb(Object, Object)>
	//    4   10:pop             
		Parcel parcel = zzya();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #444 <Method Parcel zzya()>
	//    7   15:astore_1        
		parcel.setDataPosition(0);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #372 <Method void Parcel.setDataPosition(int)>
		StringBuilder stringbuilder = new StringBuilder(100);
	//   11   21:new             #106 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:bipush          100
	//   14   27:invokespecial   #109 <Method void StringBuilder(int)>
	//   15   30:astore_2        
		zza(stringbuilder, zzaFI.zzdA(mClassName), parcel);
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #46  <Field zzaco zzaFI>
	//   20   37:aload_0         
	//   21   38:getfield        #48  <Field String mClassName>
	//   22   41:invokevirtual   #448 <Method Map zzaco.zzdA(String)>
	//   23   44:aload_1         
	//   24   45:invokespecial   #378 <Method void zza(StringBuilder, Map, Parcel)>
		return stringbuilder.toString();
	//   25   48:aload_2         
	//   26   49:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   27   52:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		zzacs.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #453 <Method void zzacs.zza(zzacr, Parcel, int)>
	//    4    6:return          
	}

	public Object zzdw(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #362 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #457 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #365 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public boolean zzdx(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #362 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #457 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #365 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public Map zzxK()
	{
		if(zzaFI == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field zzaco zzaFI>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaFI.zzdA(mClassName);
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field zzaco zzaFI>
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field String mClassName>
	//    9   17:invokevirtual   #448 <Method Map zzaco.zzdA(String)>
	//   10   20:areturn         
	}

	public Parcel zzya()
	{
		zzaFR;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int zzaFR>
		JVM INSTR tableswitch 0 1: default 28
	//	               0 33
	//	               1 63;
	//    2    4:tableswitch     0 1: default 28
	//	               0 33
	//	               1 63
		   goto _L1 _L2 _L3
_L1:
		return zzaFP;
	//    3   28:aload_0         
	//    4   29:getfield        #42  <Field Parcel zzaFP>
	//    5   32:areturn         
_L2:
		zzaFS = com.google.android.gms.common.internal.safeparcel.zzc.zzaV(zzaFP);
	//    6   33:aload_0         
	//    7   34:aload_0         
	//    8   35:getfield        #42  <Field Parcel zzaFP>
	//    9   38:invokestatic    #466 <Method int com.google.android.gms.common.internal.safeparcel.zzc.zzaV(Parcel)>
	//   10   41:putfield        #468 <Field int zzaFS>
		com.google.android.gms.common.internal.safeparcel.zzc.zzJ(zzaFP, zzaFS);
	//   11   44:aload_0         
	//   12   45:getfield        #42  <Field Parcel zzaFP>
	//   13   48:aload_0         
	//   14   49:getfield        #468 <Field int zzaFS>
	//   15   52:invokestatic    #471 <Method void com.google.android.gms.common.internal.safeparcel.zzc.zzJ(Parcel, int)>
		zzaFR = 2;
	//   16   55:aload_0         
	//   17   56:iconst_2        
	//   18   57:putfield        #50  <Field int zzaFR>
		continue; /* Loop/switch isn't completed */
	//   19   60:goto            28
_L3:
		com.google.android.gms.common.internal.safeparcel.zzc.zzJ(zzaFP, zzaFS);
	//   20   63:aload_0         
	//   21   64:getfield        #42  <Field Parcel zzaFP>
	//   22   67:aload_0         
	//   23   68:getfield        #468 <Field int zzaFS>
	//   24   71:invokestatic    #471 <Method void com.google.android.gms.common.internal.safeparcel.zzc.zzJ(Parcel, int)>
		zzaFR = 2;
	//   25   74:aload_0         
	//   26   75:iconst_2        
	//   27   76:putfield        #50  <Field int zzaFR>
		if(true) goto _L1; else goto _L4
	//   28   79:goto            28
_L4:
	}

	zzaco zzyb()
	{
		switch(zzaFQ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int zzaFQ>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 67
	//	               1 69
	//	               2 74
		default:
			int i = zzaFQ;
	//    3   32:aload_0         
	//    4   33:getfield        #44  <Field int zzaFQ>
	//    5   36:istore_1        
			throw new IllegalStateException((new StringBuilder(34)).append("Invalid creation type: ").append(i).toString());
	//    6   37:new             #301 <Class IllegalStateException>
	//    7   40:dup             
	//    8   41:new             #106 <Class StringBuilder>
	//    9   44:dup             
	//   10   45:bipush          34
	//   11   47:invokespecial   #109 <Method void StringBuilder(int)>
	//   12   50:ldc2            #475 <String "Invalid creation type: ">
	//   13   53:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   14   56:iload_1         
	//   15   57:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   16   60:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   17   63:invokespecial   #304 <Method void IllegalStateException(String)>
	//   18   66:athrow          

		case 0: // '\0'
			return null;
	//   19   67:aconst_null     
	//   20   68:areturn         

		case 1: // '\001'
			return zzaFI;
	//   21   69:aload_0         
	//   22   70:getfield        #46  <Field zzaco zzaFI>
	//   23   73:areturn         

		case 2: // '\002'
			return zzaFI;
	//   24   74:aload_0         
	//   25   75:getfield        #46  <Field zzaco zzaFI>
	//   26   78:areturn         
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzacs();
	private final String mClassName;
	private final int mVersionCode;
	private final zzaco zzaFI;
	private final Parcel zzaFP;
	private final int zzaFQ = 2;
	private int zzaFR;
	private int zzaFS;

	static 
	{
	//    0    0:new             #22  <Class zzacs>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzacs()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
