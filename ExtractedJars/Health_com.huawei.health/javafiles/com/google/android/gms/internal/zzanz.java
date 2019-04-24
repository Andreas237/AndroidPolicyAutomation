// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//			zzanv, zzanw, zzaoa

public class zzanz
{

	public static String zza(Object obj, zzanv zzanv1)
	{
		zzanw zzanw1 = zzanv1.zzBY();
	//    0    0:aload_1         
	//    1    1:invokeinterface #12  <Method zzanw zzanv.zzBY()>
	//    2    6:astore          7
		if(!zzanw1.zzdW(zzanv1.zzC(obj)))
	//*   3    8:aload           7
	//*   4   10:aload_1         
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #16  <Method String zzanv.zzC(Object)>
	//*   7   17:invokeinterface #22  <Method boolean zzanw.zzdW(String)>
	//*   8   22:ifne            27
			return null;
	//    9   25:aconst_null     
	//   10   26:areturn         
		Object obj1 = zzanv1.zzB(obj);
	//   11   27:aload_1         
	//   12   28:aload_0         
	//   13   29:invokeinterface #26  <Method Object zzanv.zzB(Object)>
	//   14   34:astore          8
		for(int i = 0; i < zzanw1.zzD(obj1); i++)
	//*  15   36:iconst_0        
	//*  16   37:istore          4
	//*  17   39:iload           4
	//*  18   41:aload           7
	//*  19   43:aload           8
	//*  20   45:invokeinterface #30  <Method int zzanw.zzD(Object)>
	//*  21   50:icmpge          280
		{
			Object obj2 = ((Object) (zzanw1.zzg(obj1, i)));
	//   22   53:aload           7
	//   23   55:aload           8
	//   24   57:iload           4
	//   25   59:invokeinterface #34  <Method String zzanw.zzg(Object, int)>
	//   26   64:astore          9
			if(!zzanv1.zzd(obj, i))
	//*  27   66:aload_1         
	//*  28   67:aload_0         
	//*  29   68:iload           4
	//*  30   70:invokeinterface #38  <Method boolean zzanv.zzd(Object, int)>
	//*  31   75:ifne            119
			{
				if(!zzanw1.zzf(obj1, i) && !zzaoa.zzaUw.contains(obj2))
	//*  32   78:aload           7
	//*  33   80:aload           8
	//*  34   82:iload           4
	//*  35   84:invokeinterface #41  <Method boolean zzanw.zzf(Object, int)>
	//*  36   89:ifne            271
	//*  37   92:getstatic       #47  <Field Set zzaoa.zzaUw>
	//*  38   95:aload           9
	//*  39   97:invokeinterface #53  <Method boolean Set.contains(Object)>
	//*  40  102:ifeq            108
	//*  41  105:goto            271
					return String.valueOf(obj2).concat(" not set");
	//   42  108:aload           9
	//   43  110:invokestatic    #58  <Method String String.valueOf(Object)>
	//   44  113:ldc1            #60  <String " not set">
	//   45  115:invokevirtual   #64  <Method String String.concat(String)>
	//   46  118:areturn         
				continue;
			}
			double d = zzanw1.zze(obj1, i);
	//   47  119:aload           7
	//   48  121:aload           8
	//   49  123:iload           4
	//   50  125:invokeinterface #68  <Method int zzanw.zze(Object, int)>
	//   51  130:i2d             
	//   52  131:dstore_2        
			if(d == 1.0D)
	//*  53  132:dload_2         
	//*  54  133:dconst_1        
	//*  55  134:dcmpl           
	//*  56  135:ifne            152
			{
				d = zzanv1.zzc(obj, i);
	//   57  138:aload_1         
	//   58  139:aload_0         
	//   59  140:iload           4
	//   60  142:invokeinterface #71  <Method int zzanv.zzc(Object, int)>
	//   61  147:i2d             
	//   62  148:dstore_2        
			} else
	//*  63  149:goto            170
			{
				if(d != 2D)
					continue;
	//   64  152:dload_2         
	//   65  153:ldc2w           #72  <Double 2D>
	//   66  156:dcmpl           
	//   67  157:ifne            271
				d = zzanv1.zzb(obj, i);
	//   68  160:aload_1         
	//   69  161:aload_0         
	//   70  162:iload           4
	//   71  164:invokeinterface #77  <Method double zzanv.zzb(Object, int)>
	//   72  169:dstore_2        
			}
			Object obj3 = ((Object) (zzaoa.zzCI().zzej(((String) (obj2)))));
	//   73  170:invokestatic    #81  <Method zzaoa zzaoa.zzCI()>
	//   74  173:aload           9
	//   75  175:invokevirtual   #85  <Method zzaoa$zza zzaoa.zzej(String)>
	//   76  178:astore          10
			if(obj3 != null && !((zzaoa.zza) (obj3)).zzg(d))
	//*  77  180:aload           10
	//*  78  182:ifnull          197
	//*  79  185:aload           10
	//*  80  187:dload_2         
	//*  81  188:invokevirtual   #90  <Method boolean zzaoa$zza.zzg(double)>
	//*  82  191:ifne            197
				return "Field out of range";
	//   83  194:ldc1            #92  <String "Field out of range">
	//   84  196:areturn         
			obj3 = ((Object) (zzanw1.zzE(obj1)));
	//   85  197:aload           7
	//   86  199:aload           8
	//   87  201:invokeinterface #95  <Method String zzanw.zzE(Object)>
	//   88  206:astore          10
			obj2 = ((Object) (zzaoa.zzCI().zzK(((String) (obj3)), ((String) (obj2)))));
	//   89  208:invokestatic    #81  <Method zzaoa zzaoa.zzCI()>
	//   90  211:aload           10
	//   91  213:aload           9
	//   92  215:invokevirtual   #99  <Method zzaoa$zza zzaoa.zzK(String, String)>
	//   93  218:astore          9
			if(obj2 == null)
				continue;
	//   94  220:aload           9
	//   95  222:ifnull          271
			long l = zzanv1.zza(obj, TimeUnit.NANOSECONDS);
	//   96  225:aload_1         
	//   97  226:aload_0         
	//   98  227:getstatic       #105 <Field TimeUnit TimeUnit.NANOSECONDS>
	//   99  230:invokeinterface #108 <Method long zzanv.zza(Object, TimeUnit)>
	//  100  235:lstore          5
			if(l == 0L)
	//* 101  237:lload           5
	//* 102  239:lconst_0        
	//* 103  240:lcmp            
	//* 104  241:ifne            255
				if(d == 0.0D)
	//* 105  244:dload_2         
	//* 106  245:dconst_0        
	//* 107  246:dcmpl           
	//* 108  247:ifne            252
					return null;
	//  109  250:aconst_null     
	//  110  251:areturn         
				else
					return "DataPoint out of range";
	//  111  252:ldc1            #110 <String "DataPoint out of range">
	//  112  254:areturn         
			if(!((zzaoa.zza) (obj2)).zzg(d / (double)l))
	//* 113  255:aload           9
	//* 114  257:dload_2         
	//* 115  258:lload           5
	//* 116  260:l2d             
	//* 117  261:ddiv            
	//* 118  262:invokevirtual   #90  <Method boolean zzaoa$zza.zzg(double)>
	//* 119  265:ifne            271
				return "DataPoint out of range";
	//  120  268:ldc1            #110 <String "DataPoint out of range">
	//  121  270:areturn         
		}

	//  122  271:iload           4
	//  123  273:iconst_1        
	//  124  274:iadd            
	//  125  275:istore          4
	//* 126  277:goto            39
		return null;
	//  127  280:aconst_null     
	//  128  281:areturn         
	}
}
