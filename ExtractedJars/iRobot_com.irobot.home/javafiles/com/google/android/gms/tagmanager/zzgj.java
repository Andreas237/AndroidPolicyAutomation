// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzp;
import com.google.android.gms.internal.measurement.zzyi;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzgi, zzdi

public final class zzgj
{

	private static double getDouble(Object obj)
	{
		if(obj instanceof Number)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #90  <Class Number>
	//*   2    4:ifeq            15
		{
			return ((Number)obj).doubleValue();
	//    3    7:aload_0         
	//    4    8:checkcast       #90  <Class Number>
	//    5   11:invokevirtual   #94  <Method double Number.doubleValue()>
	//    6   14:dreturn         
		} else
		{
			zzdi.e("getDouble received non-Number");
	//    7   15:ldc1            #96  <String "getDouble received non-Number">
	//    8   17:invokestatic    #101 <Method void zzdi.e(String)>
			return 0.0D;
	//    9   20:dconst_0        
	//   10   21:dreturn         
		}
	}

	public static String zzc(zzp zzp1)
	{
		return zzi(zzh(zzp1));
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method Object zzh(zzp)>
	//    2    4:invokestatic    #111 <Method String zzi(Object)>
	//    3    7:areturn         
	}

	public static zzgi zzd(zzp zzp1)
	{
		zzp1 = ((zzp) (zzh(zzp1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method Object zzh(zzp)>
	//    2    4:astore_0        
		if(zzp1 instanceof zzgi)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #44  <Class zzgi>
	//*   5    9:ifeq            17
			return (zzgi)zzp1;
	//    6   12:aload_0         
	//    7   13:checkcast       #44  <Class zzgi>
	//    8   16:areturn         
		if(zzl(((Object) (zzp1))))
	//*   9   17:aload_0         
	//*  10   18:invokestatic    #117 <Method boolean zzl(Object)>
	//*  11   21:ifeq            32
			return zzgi.zzaq(zzm(((Object) (zzp1))));
	//   12   24:aload_0         
	//   13   25:invokestatic    #121 <Method long zzm(Object)>
	//   14   28:invokestatic    #48  <Method zzgi zzgi.zzaq(long)>
	//   15   31:areturn         
		if(zzk(((Object) (zzp1))))
	//*  16   32:aload_0         
	//*  17   33:invokestatic    #124 <Method boolean zzk(Object)>
	//*  18   36:ifeq            50
			return zzgi.zza(Double.valueOf(getDouble(((Object) (zzp1)))));
	//   19   39:aload_0         
	//   20   40:invokestatic    #126 <Method double getDouble(Object)>
	//   21   43:invokestatic    #130 <Method Double Double.valueOf(double)>
	//   22   46:invokestatic    #134 <Method zzgi zzgi.zza(Double)>
	//   23   49:areturn         
		else
			return zzeg(zzi(((Object) (zzp1))));
	//   24   50:aload_0         
	//   25   51:invokestatic    #111 <Method String zzi(Object)>
	//   26   54:invokestatic    #138 <Method zzgi zzeg(String)>
	//   27   57:areturn         
	}

	public static Long zze(zzp zzp1)
	{
		zzp1 = ((zzp) (zzh(zzp1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method Object zzh(zzp)>
	//    2    4:astore_0        
		long l;
		if(zzl(((Object) (zzp1))))
	//*   3    5:aload_0         
	//*   4    6:invokestatic    #117 <Method boolean zzl(Object)>
	//*   5    9:ifeq            22
		{
			l = zzm(((Object) (zzp1)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #121 <Method long zzm(Object)>
	//    8   16:lstore_1        
		} else
	//*   9   17:lload_1         
	//*  10   18:invokestatic    #143 <Method Long Long.valueOf(long)>
	//*  11   21:areturn         
		{
			zzp1 = ((zzp) (zzeg(zzi(((Object) (zzp1))))));
	//   12   22:aload_0         
	//   13   23:invokestatic    #111 <Method String zzi(Object)>
	//   14   26:invokestatic    #138 <Method zzgi zzeg(String)>
	//   15   29:astore_0        
			if(zzp1 == zzbhd)
	//*  16   30:aload_0         
	//*  17   31:getstatic       #50  <Field zzgi zzbhd>
	//*  18   34:if_acmpne       41
				return zzbhb;
	//   19   37:getstatic       #35  <Field Long zzbhb>
	//   20   40:areturn         
			l = ((zzgi) (zzp1)).longValue();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #147 <Method long zzgi.longValue()>
	//   23   45:lstore_1        
		}
		return Long.valueOf(l);
	//*  24   46:goto            17
	}

	public static zzp zzef(String s)
	{
		zzp zzp1 = new zzp();
	//    0    0:new             #151 <Class zzp>
	//    1    3:dup             
	//    2    4:invokespecial   #152 <Method void zzp()>
	//    3    7:astore_1        
		zzp1.type = 5;
	//    4    8:aload_1         
	//    5    9:iconst_5        
	//    6   10:putfield        #156 <Field int zzp.type>
		zzp1.zzqn = s;
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:putfield        #159 <Field String zzp.zzqn>
		return zzp1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	private static zzgi zzeg(String s)
	{
		NumberFormatException numberformatexception;
		Object obj;
		try
		{
			obj = ((Object) (zzgi.zzee(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #164 <Method zzgi zzgi.zzee(String)>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
	//*   5    7:new             #166 <Class StringBuilder>
	//*   6   10:dup             
	//*   7   11:aload_0         
	//*   8   12:invokestatic    #168 <Method String String.valueOf(Object)>
	//*   9   15:invokevirtual   #172 <Method int String.length()>
	//*  10   18:bipush          33
	//*  11   20:iadd            
	//*  12   21:invokespecial   #173 <Method void StringBuilder(int)>
	//*  13   24:astore_1        
	//*  14   25:aload_1         
	//*  15   26:ldc1            #175 <String "Failed to convert '">
	//*  16   28:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//*  17   31:pop             
	//*  18   32:aload_1         
	//*  19   33:aload_0         
	//*  20   34:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//*  21   37:pop             
	//*  22   38:aload_1         
	//*  23   39:ldc1            #181 <String "' to a number.">
	//*  24   41:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//*  25   44:pop             
	//*  26   45:aload_1         
	//*  27   46:invokevirtual   #185 <Method String StringBuilder.toString()>
	//*  28   49:invokestatic    #101 <Method void zzdi.e(String)>
	//*  29   52:getstatic       #50  <Field zzgi zzbhd>
	//*  30   55:areturn         
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 33)));
			((StringBuilder) (obj)).append("Failed to convert '");
			((StringBuilder) (obj)).append(s);
			((StringBuilder) (obj)).append("' to a number.");
			zzdi.e(((StringBuilder) (obj)).toString());
			return zzbhd;
		}
		return ((zzgi) (obj));
	//*  31   56:astore_1        
	//*  32   57:goto            7
	}

	public static Double zzf(zzp zzp1)
	{
		zzp1 = ((zzp) (zzh(zzp1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method Object zzh(zzp)>
	//    2    4:astore_0        
		double d;
		if(zzk(((Object) (zzp1))))
	//*   3    5:aload_0         
	//*   4    6:invokestatic    #124 <Method boolean zzk(Object)>
	//*   5    9:ifeq            22
		{
			d = getDouble(((Object) (zzp1)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #126 <Method double getDouble(Object)>
	//    8   16:dstore_1        
		} else
	//*   9   17:dload_1         
	//*  10   18:invokestatic    #130 <Method Double Double.valueOf(double)>
	//*  11   21:areturn         
		{
			zzp1 = ((zzp) (zzeg(zzi(((Object) (zzp1))))));
	//   12   22:aload_0         
	//   13   23:invokestatic    #111 <Method String zzi(Object)>
	//   14   26:invokestatic    #138 <Method zzgi zzeg(String)>
	//   15   29:astore_0        
			if(zzp1 == zzbhd)
	//*  16   30:aload_0         
	//*  17   31:getstatic       #50  <Field zzgi zzbhd>
	//*  18   34:if_acmpne       41
				return zzbhc;
	//   19   37:getstatic       #42  <Field Double zzbhc>
	//   20   40:areturn         
			d = ((zzgi) (zzp1)).doubleValue();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #188 <Method double zzgi.doubleValue()>
	//   23   45:dstore_1        
		}
		return Double.valueOf(d);
	//*  24   46:goto            17
	}

	public static Boolean zzg(zzp zzp1)
	{
		zzp1 = ((zzp) (zzh(zzp1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method Object zzh(zzp)>
	//    2    4:astore_0        
		if(zzp1 instanceof Boolean)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #61  <Class Boolean>
	//*   5    9:ifeq            17
			return (Boolean)zzp1;
	//    6   12:aload_0         
	//    7   13:checkcast       #61  <Class Boolean>
	//    8   16:areturn         
		zzp1 = ((zzp) (zzi(((Object) (zzp1)))));
	//    9   17:aload_0         
	//   10   18:invokestatic    #111 <Method String zzi(Object)>
	//   11   21:astore_0        
		if("true".equalsIgnoreCase(((String) (zzp1))))
	//*  12   22:ldc1            #192 <String "true">
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #196 <Method boolean String.equalsIgnoreCase(String)>
	//*  15   28:ifeq            35
			return Boolean.TRUE;
	//   16   31:getstatic       #199 <Field Boolean Boolean.TRUE>
	//   17   34:areturn         
		if("false".equalsIgnoreCase(((String) (zzp1))))
	//*  18   35:ldc1            #201 <String "false">
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #196 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   41:ifeq            48
			return Boolean.FALSE;
	//   22   44:getstatic       #204 <Field Boolean Boolean.FALSE>
	//   23   47:areturn         
		else
			return zzbhf;
	//   24   48:getstatic       #66  <Field Boolean zzbhf>
	//   25   51:areturn         
	}

	public static Object zzh(zzp zzp1)
	{
		int i;
		int l;
		boolean flag;
		int j1;
		if(zzp1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		j1 = zzp1.type;
	//    4    6:aload_0         
	//    5    7:getfield        #156 <Field int zzp.type>
	//    6   10:istore          4
		flag = false;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		l = 0;
	//    9   14:iconst_0        
	//   10   15:istore_2        
		i = 0;
	//   11   16:iconst_0        
	//   12   17:istore_1        
		j1;
	//   13   18:iload           4
		JVM INSTR tableswitch 1 8: default 68
	//	               1 398
	//	               2 336
	//	               3 199
	//	               4 193
	//	               5 187
	//	               6 179
	//	               7 115
	//	               8 107;
	//   14   20:tableswitch     1 8: default 68
	//	               1 398
	//	               2 336
	//	               3 199
	//	               4 193
	//	               5 187
	//	               6 179
	//	               7 115
	//	               8 107
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
		break MISSING_BLOCK_LABEL_336;
_L2:
		break MISSING_BLOCK_LABEL_398;
_L1:
		i = zzp1.type;
	//   15   68:aload_0         
	//   16   69:getfield        #156 <Field int zzp.type>
	//   17   72:istore_1        
		zzp1 = ((zzp) (new StringBuilder(46)));
	//   18   73:new             #166 <Class StringBuilder>
	//   19   76:dup             
	//   20   77:bipush          46
	//   21   79:invokespecial   #173 <Method void StringBuilder(int)>
	//   22   82:astore_0        
		((StringBuilder) (zzp1)).append("Failed to convert a value of type: ");
	//   23   83:aload_0         
	//   24   84:ldc1            #206 <String "Failed to convert a value of type: ">
	//   25   86:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   26   89:pop             
		((StringBuilder) (zzp1)).append(i);
	//   27   90:aload_0         
	//   28   91:iload_1         
	//   29   92:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
	//   30   95:pop             
		zzp1 = ((zzp) (((StringBuilder) (zzp1)).toString()));
	//   31   96:aload_0         
	//   32   97:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   33  100:astore_0        
_L10:
		zzdi.e(((String) (zzp1)));
	//   34  101:aload_0         
	//   35  102:invokestatic    #101 <Method void zzdi.e(String)>
		return ((Object) (null));
	//   36  105:aconst_null     
	//   37  106:areturn         
_L9:
		return ((Object) (Boolean.valueOf(zzp1.zzqp)));
	//   38  107:aload_0         
	//   39  108:getfield        #213 <Field boolean zzp.zzqp>
	//   40  111:invokestatic    #216 <Method Boolean Boolean.valueOf(boolean)>
	//   41  114:areturn         
_L8:
		StringBuilder stringbuilder = new StringBuilder();
	//   42  115:new             #166 <Class StringBuilder>
	//   43  118:dup             
	//   44  119:invokespecial   #217 <Method void StringBuilder()>
	//   45  122:astore          5
		zzp1 = ((zzp) (zzp1.zzqq));
	//   46  124:aload_0         
	//   47  125:getfield        #221 <Field zzp[] zzp.zzqq>
	//   48  128:astore_0        
		for(l = zzp1.length; i < l; i++)
	//*  49  129:aload_0         
	//*  50  130:arraylength     
	//*  51  131:istore_2        
	//*  52  132:iload_1         
	//*  53  133:iload_2         
	//*  54  134:icmpge          173
		{
			String s = zzi(zzh(((zzp) (zzp1[i]))));
	//   55  137:aload_0         
	//   56  138:iload_1         
	//   57  139:aaload          
	//   58  140:invokestatic    #107 <Method Object zzh(zzp)>
	//   59  143:invokestatic    #111 <Method String zzi(Object)>
	//   60  146:astore          6
			if(s == zzbhe)
	//*  61  148:aload           6
	//*  62  150:getstatic       #59  <Field String zzbhe>
	//*  63  153:if_acmpne       158
				return ((Object) (null));
	//   64  156:aconst_null     
	//   65  157:areturn         
			stringbuilder.append(s);
	//   66  158:aload           5
	//   67  160:aload           6
	//   68  162:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   69  165:pop             
		}

	//   70  166:iload_1         
	//   71  167:iconst_1        
	//   72  168:iadd            
	//   73  169:istore_1        
	//*  74  170:goto            132
		return ((Object) (stringbuilder.toString()));
	//   75  173:aload           5
	//   76  175:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   77  178:areturn         
_L7:
		return ((Object) (Long.valueOf(zzp1.zzqo)));
	//   78  179:aload_0         
	//   79  180:getfield        #225 <Field long zzp.zzqo>
	//   80  183:invokestatic    #143 <Method Long Long.valueOf(long)>
	//   81  186:areturn         
_L6:
		zzp1 = "Trying to convert a function id to object";
	//   82  187:ldc1            #227 <String "Trying to convert a function id to object">
	//   83  189:astore_0        
		continue; /* Loop/switch isn't completed */
	//   84  190:goto            101
_L5:
		zzp1 = "Trying to convert a macro reference to object";
	//   85  193:ldc1            #229 <String "Trying to convert a macro reference to object">
	//   86  195:astore_0        
		if(true) goto _L10; else goto _L4
	//   87  196:goto            101
_L4:
		if(zzp1.zzqk.length != zzp1.zzql.length)
	//*  88  199:aload_0         
	//*  89  200:getfield        #232 <Field zzp[] zzp.zzqk>
	//*  90  203:arraylength     
	//*  91  204:aload_0         
	//*  92  205:getfield        #235 <Field zzp[] zzp.zzql>
	//*  93  208:arraylength     
	//*  94  209:icmpeq          253
		{
			zzp1 = ((zzp) (String.valueOf(((Object) (((zzyi) (zzp1)).toString())))));
	//   95  212:aload_0         
	//   96  213:invokevirtual   #238 <Method String zzyi.toString()>
	//   97  216:invokestatic    #168 <Method String String.valueOf(Object)>
	//   98  219:astore_0        
			if(((String) (zzp1)).length() != 0)
	//*  99  220:aload_0         
	//* 100  221:invokevirtual   #172 <Method int String.length()>
	//* 101  224:ifeq            237
				zzp1 = ((zzp) ("Converting an invalid value to object: ".concat(((String) (zzp1)))));
	//  102  227:ldc1            #240 <String "Converting an invalid value to object: ">
	//  103  229:aload_0         
	//  104  230:invokevirtual   #244 <Method String String.concat(String)>
	//  105  233:astore_0        
			else
	//* 106  234:goto            247
				zzp1 = ((zzp) (new String("Converting an invalid value to object: ")));
	//  107  237:new             #52  <Class String>
	//  108  240:dup             
	//  109  241:ldc1            #240 <String "Converting an invalid value to object: ">
	//  110  243:invokespecial   #57  <Method void String(String)>
	//  111  246:astore_0        
			zzdi.e(((String) (zzp1)));
	//  112  247:aload_0         
	//  113  248:invokestatic    #101 <Method void zzdi.e(String)>
			return ((Object) (null));
	//  114  251:aconst_null     
	//  115  252:areturn         
		}
		HashMap hashmap = new HashMap(zzp1.zzql.length);
	//  116  253:new             #75  <Class HashMap>
	//  117  256:dup             
	//  118  257:aload_0         
	//  119  258:getfield        #235 <Field zzp[] zzp.zzql>
	//  120  261:arraylength     
	//  121  262:invokespecial   #245 <Method void HashMap(int)>
	//  122  265:astore          5
		for(int j = ((int) (flag)); j < zzp1.zzqk.length;)
	//* 123  267:iload_3         
	//* 124  268:istore_1        
	//* 125  269:iload_1         
	//* 126  270:aload_0         
	//* 127  271:getfield        #232 <Field zzp[] zzp.zzqk>
	//* 128  274:arraylength     
	//* 129  275:icmpge          333
		{
			Object obj = zzh(zzp1.zzqk[j]);
	//  130  278:aload_0         
	//  131  279:getfield        #232 <Field zzp[] zzp.zzqk>
	//  132  282:iload_1         
	//  133  283:aaload          
	//  134  284:invokestatic    #107 <Method Object zzh(zzp)>
	//  135  287:astore          6
			Object obj2 = zzh(zzp1.zzql[j]);
	//  136  289:aload_0         
	//  137  290:getfield        #235 <Field zzp[] zzp.zzql>
	//  138  293:iload_1         
	//  139  294:aaload          
	//  140  295:invokestatic    #107 <Method Object zzh(zzp)>
	//  141  298:astore          7
			if(obj != null)
	//* 142  300:aload           6
	//* 143  302:ifnull          331
			{
				if(obj2 == null)
	//* 144  305:aload           7
	//* 145  307:ifnonnull       312
					return ((Object) (null));
	//  146  310:aconst_null     
	//  147  311:areturn         
				((Map) (hashmap)).put(obj, obj2);
	//  148  312:aload           5
	//  149  314:aload           6
	//  150  316:aload           7
	//  151  318:invokeinterface #251 <Method Object Map.put(Object, Object)>
	//  152  323:pop             
				j++;
	//  153  324:iload_1         
	//  154  325:iconst_1        
	//  155  326:iadd            
	//  156  327:istore_1        
			} else
	//* 157  328:goto            269
			{
				return ((Object) (null));
	//  158  331:aconst_null     
	//  159  332:areturn         
			}
		}

		return ((Object) (hashmap));
	//  160  333:aload           5
	//  161  335:areturn         
		ArrayList arraylist = new ArrayList(zzp1.zzqj.length);
	//  162  336:new             #68  <Class ArrayList>
	//  163  339:dup             
	//  164  340:aload_0         
	//  165  341:getfield        #254 <Field zzp[] zzp.zzqj>
	//  166  344:arraylength     
	//  167  345:invokespecial   #71  <Method void ArrayList(int)>
	//  168  348:astore          5
		zzp1 = ((zzp) (zzp1.zzqj));
	//  169  350:aload_0         
	//  170  351:getfield        #254 <Field zzp[] zzp.zzqj>
	//  171  354:astore_0        
		int i1 = zzp1.length;
	//  172  355:aload_0         
	//  173  356:arraylength     
	//  174  357:istore_3        
		for(int k = l; k < i1; k++)
	//* 175  358:iload_2         
	//* 176  359:istore_1        
	//* 177  360:iload_1         
	//* 178  361:iload_3         
	//* 179  362:icmpge          395
		{
			Object obj1 = zzh(((zzp) (zzp1[k])));
	//  180  365:aload_0         
	//  181  366:iload_1         
	//  182  367:aaload          
	//  183  368:invokestatic    #107 <Method Object zzh(zzp)>
	//  184  371:astore          6
			if(obj1 == null)
	//* 185  373:aload           6
	//* 186  375:ifnonnull       380
				return ((Object) (null));
	//  187  378:aconst_null     
	//  188  379:areturn         
			arraylist.add(obj1);
	//  189  380:aload           5
	//  190  382:aload           6
	//  191  384:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//  192  387:pop             
		}

	//  193  388:iload_1         
	//  194  389:iconst_1        
	//  195  390:iadd            
	//  196  391:istore_1        
	//* 197  392:goto            360
		return ((Object) (arraylist));
	//  198  395:aload           5
	//  199  397:areturn         
		return ((Object) (zzp1.string));
	//  200  398:aload_0         
	//  201  399:getfield        #260 <Field String zzp.string>
	//  202  402:areturn         
	}

	private static String zzi(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return zzbhe;
	//    2    4:getstatic       #59  <Field String zzbhe>
	//    3    7:areturn         
		else
			return obj.toString();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #261 <Method String Object.toString()>
	//    6   12:areturn         
	}

	public static zzp zzj(Object obj)
	{
		boolean flag;
		boolean flag1;
		zzp zzp1;
		zzp1 = new zzp();
	//    0    0:new             #151 <Class zzp>
	//    1    3:dup             
	//    2    4:invokespecial   #152 <Method void zzp()>
	//    3    7:astore_3        
		if(obj instanceof zzp)
	//*   4    8:aload_0         
	//*   5    9:instanceof      #151 <Class zzp>
	//*   6   12:ifeq            20
			return (zzp)obj;
	//    7   15:aload_0         
	//    8   16:checkcast       #151 <Class zzp>
	//    9   19:areturn         
		flag1 = obj instanceof String;
	//   10   20:aload_0         
	//   11   21:instanceof      #52  <Class String>
	//   12   24:istore_2        
		flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_1        
		if(!flag1) goto _L2; else goto _L1
	//   15   27:iload_2         
	//   16   28:ifeq            49
_L1:
		zzp1.type = 1;
	//   17   31:aload_3         
	//   18   32:iconst_1        
	//   19   33:putfield        #156 <Field int zzp.type>
		obj = ((Object) ((String)obj));
	//   20   36:aload_0         
	//   21   37:checkcast       #52  <Class String>
	//   22   40:astore_0        
_L4:
		zzp1.string = ((String) (obj));
	//   23   41:aload_3         
	//   24   42:aload_0         
	//   25   43:putfield        #260 <Field String zzp.string>
		break MISSING_BLOCK_LABEL_473;
	//   26   46:goto            473
_L2:
		if(obj instanceof List)
	//*  27   49:aload_0         
	//*  28   50:instanceof      #263 <Class List>
	//*  29   53:ifeq            181
		{
			zzp1.type = 2;
	//   30   56:aload_3         
	//   31   57:iconst_2        
	//   32   58:putfield        #156 <Field int zzp.type>
			Object obj1 = ((Object) ((List)obj));
	//   33   61:aload_0         
	//   34   62:checkcast       #263 <Class List>
	//   35   65:astore          4
			obj = ((Object) (new ArrayList(((List) (obj1)).size())));
	//   36   67:new             #68  <Class ArrayList>
	//   37   70:dup             
	//   38   71:aload           4
	//   39   73:invokeinterface #266 <Method int List.size()>
	//   40   78:invokespecial   #71  <Method void ArrayList(int)>
	//   41   81:astore_0        
			obj1 = ((Object) (((List) (obj1)).iterator()));
	//   42   82:aload           4
	//   43   84:invokeinterface #270 <Method Iterator List.iterator()>
	//   44   89:astore          4
			flag = false;
	//   45   91:iconst_0        
	//   46   92:istore_1        
			zzp zzp2;
			for(; ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((Object) (zzp2))))
	//*  47   93:aload           4
	//*  48   95:invokeinterface #276 <Method boolean Iterator.hasNext()>
	//*  49  100:ifeq            161
			{
				zzp2 = zzj(((Iterator) (obj1)).next());
	//   50  103:aload           4
	//   51  105:invokeinterface #280 <Method Object Iterator.next()>
	//   52  110:invokestatic    #83  <Method zzp zzj(Object)>
	//   53  113:astore          5
				if(zzp2 == zzbhi)
	//*  54  115:aload           5
	//*  55  117:getstatic       #85  <Field zzp zzbhi>
	//*  56  120:if_acmpne       127
					return zzbhi;
	//   57  123:getstatic       #85  <Field zzp zzbhi>
	//   58  126:areturn         
				if(!flag && !zzp2.zzqs)
	//*  59  127:iload_1         
	//*  60  128:ifne            147
	//*  61  131:aload           5
	//*  62  133:getfield        #283 <Field boolean zzp.zzqs>
	//*  63  136:ifeq            142
	//*  64  139:goto            147
					flag = false;
	//   65  142:iconst_0        
	//   66  143:istore_1        
				else
	//*  67  144:goto            149
					flag = true;
	//   68  147:iconst_1        
	//   69  148:istore_1        
			}

	//   70  149:aload_0         
	//   71  150:aload           5
	//   72  152:invokeinterface #284 <Method boolean List.add(Object)>
	//   73  157:pop             
	//*  74  158:goto            93
			zzp1.zzqj = (zzp[])((List) (obj)).toArray(((Object []) (new zzp[0])));
	//   75  161:aload_3         
	//   76  162:aload_0         
	//   77  163:iconst_0        
	//   78  164:anewarray       zzp[]
	//   79  167:invokeinterface #288 <Method Object[] List.toArray(Object[])>
	//   80  172:checkcast       #289 <Class zzp[]>
	//   81  175:putfield        #254 <Field zzp[] zzp.zzqj>
			break MISSING_BLOCK_LABEL_473;
	//   82  178:goto            473
		}
		if(obj instanceof Map)
	//*  83  181:aload_0         
	//*  84  182:instanceof      #247 <Class Map>
	//*  85  185:ifeq            405
		{
			zzp1.type = 3;
	//   86  188:aload_3         
	//   87  189:iconst_3        
	//   88  190:putfield        #156 <Field int zzp.type>
			Object obj2 = ((Object) (((Map)obj).entrySet()));
	//   89  193:aload_0         
	//   90  194:checkcast       #247 <Class Map>
	//   91  197:invokeinterface #293 <Method Set Map.entrySet()>
	//   92  202:astore          5
			obj = ((Object) (new ArrayList(((Set) (obj2)).size())));
	//   93  204:new             #68  <Class ArrayList>
	//   94  207:dup             
	//   95  208:aload           5
	//   96  210:invokeinterface #296 <Method int Set.size()>
	//   97  215:invokespecial   #71  <Method void ArrayList(int)>
	//   98  218:astore_0        
			ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
	//   99  219:new             #68  <Class ArrayList>
	//  100  222:dup             
	//  101  223:aload           5
	//  102  225:invokeinterface #296 <Method int Set.size()>
	//  103  230:invokespecial   #71  <Method void ArrayList(int)>
	//  104  233:astore          4
			obj2 = ((Object) (((Set) (obj2)).iterator()));
	//  105  235:aload           5
	//  106  237:invokeinterface #297 <Method Iterator Set.iterator()>
	//  107  242:astore          5
			flag = false;
	//  108  244:iconst_0        
	//  109  245:istore_1        
			while(((Iterator) (obj2)).hasNext()) 
	//* 110  246:aload           5
	//* 111  248:invokeinterface #276 <Method boolean Iterator.hasNext()>
	//* 112  253:ifeq            367
			{
				Object obj3 = ((Object) ((java.util.Map.Entry)((Iterator) (obj2)).next()));
	//  113  256:aload           5
	//  114  258:invokeinterface #280 <Method Object Iterator.next()>
	//  115  263:checkcast       #299 <Class java.util.Map$Entry>
	//  116  266:astore          7
				zzp zzp3 = zzj(((java.util.Map.Entry) (obj3)).getKey());
	//  117  268:aload           7
	//  118  270:invokeinterface #302 <Method Object java.util.Map$Entry.getKey()>
	//  119  275:invokestatic    #83  <Method zzp zzj(Object)>
	//  120  278:astore          6
				obj3 = ((Object) (zzj(((java.util.Map.Entry) (obj3)).getValue())));
	//  121  280:aload           7
	//  122  282:invokeinterface #305 <Method Object java.util.Map$Entry.getValue()>
	//  123  287:invokestatic    #83  <Method zzp zzj(Object)>
	//  124  290:astore          7
				if(zzp3 != zzbhi && obj3 != zzbhi)
	//* 125  292:aload           6
	//* 126  294:getstatic       #85  <Field zzp zzbhi>
	//* 127  297:if_acmpeq       363
	//* 128  300:aload           7
	//* 129  302:getstatic       #85  <Field zzp zzbhi>
	//* 130  305:if_acmpne       311
	//* 131  308:goto            363
				{
					if(!flag && !zzp3.zzqs && !((zzp) (obj3)).zzqs)
	//* 132  311:iload_1         
	//* 133  312:ifne            339
	//* 134  315:aload           6
	//* 135  317:getfield        #283 <Field boolean zzp.zzqs>
	//* 136  320:ifne            339
	//* 137  323:aload           7
	//* 138  325:getfield        #283 <Field boolean zzp.zzqs>
	//* 139  328:ifeq            334
	//* 140  331:goto            339
						flag = false;
	//  141  334:iconst_0        
	//  142  335:istore_1        
					else
	//* 143  336:goto            341
						flag = true;
	//  144  339:iconst_1        
	//  145  340:istore_1        
					((List) (obj)).add(((Object) (zzp3)));
	//  146  341:aload_0         
	//  147  342:aload           6
	//  148  344:invokeinterface #284 <Method boolean List.add(Object)>
	//  149  349:pop             
					((List) (arraylist)).add(obj3);
	//  150  350:aload           4
	//  151  352:aload           7
	//  152  354:invokeinterface #284 <Method boolean List.add(Object)>
	//  153  359:pop             
				} else
	//* 154  360:goto            246
				{
					return zzbhi;
	//  155  363:getstatic       #85  <Field zzp zzbhi>
	//  156  366:areturn         
				}
			}
			zzp1.zzqk = (zzp[])((List) (obj)).toArray(((Object []) (new zzp[0])));
	//  157  367:aload_3         
	//  158  368:aload_0         
	//  159  369:iconst_0        
	//  160  370:anewarray       zzp[]
	//  161  373:invokeinterface #288 <Method Object[] List.toArray(Object[])>
	//  162  378:checkcast       #289 <Class zzp[]>
	//  163  381:putfield        #232 <Field zzp[] zzp.zzqk>
			zzp1.zzql = (zzp[])((List) (arraylist)).toArray(((Object []) (new zzp[0])));
	//  164  384:aload_3         
	//  165  385:aload           4
	//  166  387:iconst_0        
	//  167  388:anewarray       zzp[]
	//  168  391:invokeinterface #288 <Method Object[] List.toArray(Object[])>
	//  169  396:checkcast       #289 <Class zzp[]>
	//  170  399:putfield        #235 <Field zzp[] zzp.zzql>
			break MISSING_BLOCK_LABEL_473;
	//  171  402:goto            473
		}
		if(!zzk(obj))
			break; /* Loop/switch isn't completed */
	//  172  405:aload_0         
	//  173  406:invokestatic    #124 <Method boolean zzk(Object)>
	//  174  409:ifeq            425
		zzp1.type = 1;
	//  175  412:aload_3         
	//  176  413:iconst_1        
	//  177  414:putfield        #156 <Field int zzp.type>
		obj = ((Object) (obj.toString()));
	//  178  417:aload_0         
	//  179  418:invokevirtual   #261 <Method String Object.toString()>
	//  180  421:astore_0        
		if(true) goto _L4; else goto _L3
	//  181  422:goto            41
_L3:
		if(zzl(obj))
	//* 182  425:aload_0         
	//* 183  426:invokestatic    #117 <Method boolean zzl(Object)>
	//* 184  429:ifeq            449
		{
			zzp1.type = 6;
	//  185  432:aload_3         
	//  186  433:bipush          6
	//  187  435:putfield        #156 <Field int zzp.type>
			zzp1.zzqo = zzm(obj);
	//  188  438:aload_3         
	//  189  439:aload_0         
	//  190  440:invokestatic    #121 <Method long zzm(Object)>
	//  191  443:putfield        #225 <Field long zzp.zzqo>
		} else
	//* 192  446:goto            473
		{
			if(!(obj instanceof Boolean))
				break MISSING_BLOCK_LABEL_480;
	//  193  449:aload_0         
	//  194  450:instanceof      #61  <Class Boolean>
	//  195  453:ifeq            480
			zzp1.type = 8;
	//  196  456:aload_3         
	//  197  457:bipush          8
	//  198  459:putfield        #156 <Field int zzp.type>
			zzp1.zzqp = ((Boolean)obj).booleanValue();
	//  199  462:aload_3         
	//  200  463:aload_0         
	//  201  464:checkcast       #61  <Class Boolean>
	//  202  467:invokevirtual   #308 <Method boolean Boolean.booleanValue()>
	//  203  470:putfield        #213 <Field boolean zzp.zzqp>
		}
		zzp1.zzqs = flag;
	//  204  473:aload_3         
	//  205  474:iload_1         
	//  206  475:putfield        #283 <Field boolean zzp.zzqs>
		return zzp1;
	//  207  478:aload_3         
	//  208  479:areturn         
		if(obj == null)
	//* 209  480:aload_0         
	//* 210  481:ifnonnull       491
			obj = "null";
	//  211  484:ldc2            #310 <String "null">
	//  212  487:astore_0        
		else
	//* 213  488:goto            499
			obj = ((Object) (obj.getClass().toString()));
	//  214  491:aload_0         
	//  215  492:invokevirtual   #314 <Method Class Object.getClass()>
	//  216  495:invokevirtual   #317 <Method String Class.toString()>
	//  217  498:astore_0        
		obj = ((Object) (String.valueOf(obj)));
	//  218  499:aload_0         
	//  219  500:invokestatic    #168 <Method String String.valueOf(Object)>
	//  220  503:astore_0        
		if(((String) (obj)).length() != 0)
	//* 221  504:aload_0         
	//* 222  505:invokevirtual   #172 <Method int String.length()>
	//* 223  508:ifeq            522
			obj = ((Object) ("Converting to Value from unknown object type: ".concat(((String) (obj)))));
	//  224  511:ldc2            #319 <String "Converting to Value from unknown object type: ">
	//  225  514:aload_0         
	//  226  515:invokevirtual   #244 <Method String String.concat(String)>
	//  227  518:astore_0        
		else
	//* 228  519:goto            533
			obj = ((Object) (new String("Converting to Value from unknown object type: ")));
	//  229  522:new             #52  <Class String>
	//  230  525:dup             
	//  231  526:ldc2            #319 <String "Converting to Value from unknown object type: ">
	//  232  529:invokespecial   #57  <Method void String(String)>
	//  233  532:astore_0        
		zzdi.e(((String) (obj)));
	//  234  533:aload_0         
	//  235  534:invokestatic    #101 <Method void zzdi.e(String)>
		return zzbhi;
	//  236  537:getstatic       #85  <Field zzp zzbhi>
	//  237  540:areturn         
	}

	private static boolean zzk(Object obj)
	{
		return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof zzgi) && ((zzgi)obj).zzqi();
	//    0    0:aload_0         
	//    1    1:instanceof      #37  <Class Double>
	//    2    4:ifne            36
	//    3    7:aload_0         
	//    4    8:instanceof      #321 <Class Float>
	//    5   11:ifne            36
	//    6   14:aload_0         
	//    7   15:instanceof      #44  <Class zzgi>
	//    8   18:ifeq            34
	//    9   21:aload_0         
	//   10   22:checkcast       #44  <Class zzgi>
	//   11   25:invokevirtual   #324 <Method boolean zzgi.zzqi()>
	//   12   28:ifeq            34
	//   13   31:goto            36
	//   14   34:iconst_0        
	//   15   35:ireturn         
	//   16   36:iconst_1        
	//   17   37:ireturn         
	}

	private static boolean zzl(Object obj)
	{
		return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof zzgi) && ((zzgi)obj).zzqj();
	//    0    0:aload_0         
	//    1    1:instanceof      #326 <Class Byte>
	//    2    4:ifne            50
	//    3    7:aload_0         
	//    4    8:instanceof      #328 <Class Short>
	//    5   11:ifne            50
	//    6   14:aload_0         
	//    7   15:instanceof      #330 <Class Integer>
	//    8   18:ifne            50
	//    9   21:aload_0         
	//   10   22:instanceof      #29  <Class Long>
	//   11   25:ifne            50
	//   12   28:aload_0         
	//   13   29:instanceof      #44  <Class zzgi>
	//   14   32:ifeq            48
	//   15   35:aload_0         
	//   16   36:checkcast       #44  <Class zzgi>
	//   17   39:invokevirtual   #332 <Method boolean zzgi.zzqj()>
	//   18   42:ifeq            48
	//   19   45:goto            50
	//   20   48:iconst_0        
	//   21   49:ireturn         
	//   22   50:iconst_1        
	//   23   51:ireturn         
	}

	private static long zzm(Object obj)
	{
		if(obj instanceof Number)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #90  <Class Number>
	//*   2    4:ifeq            15
		{
			return ((Number)obj).longValue();
	//    3    7:aload_0         
	//    4    8:checkcast       #90  <Class Number>
	//    5   11:invokevirtual   #333 <Method long Number.longValue()>
	//    6   14:lreturn         
		} else
		{
			zzdi.e("getInt64 received non-Number");
	//    7   15:ldc2            #335 <String "getInt64 received non-Number">
	//    8   18:invokestatic    #101 <Method void zzdi.e(String)>
			return 0L;
	//    9   21:lconst_0        
	//   10   22:lreturn         
		}
	}

	public static Object zzqk()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public static Long zzql()
	{
		return zzbhb;
	//    0    0:getstatic       #35  <Field Long zzbhb>
	//    1    3:areturn         
	}

	public static Double zzqm()
	{
		return zzbhc;
	//    0    0:getstatic       #42  <Field Double zzbhc>
	//    1    3:areturn         
	}

	public static Boolean zzqn()
	{
		return zzbhf;
	//    0    0:getstatic       #66  <Field Boolean zzbhf>
	//    1    3:areturn         
	}

	public static zzgi zzqo()
	{
		return zzbhd;
	//    0    0:getstatic       #50  <Field zzgi zzbhd>
	//    1    3:areturn         
	}

	public static String zzqp()
	{
		return zzbhe;
	//    0    0:getstatic       #59  <Field String zzbhe>
	//    1    3:areturn         
	}

	public static zzp zzqq()
	{
		return zzbhi;
	//    0    0:getstatic       #85  <Field zzp zzbhi>
	//    1    3:areturn         
	}

	private static final Object zzbha;
	private static Long zzbhb = new Long(0L);
	private static Double zzbhc = new Double(0.0D);
	private static zzgi zzbhd = zzgi.zzaq(0L);
	private static String zzbhe;
	private static Boolean zzbhf = new Boolean(false);
	private static List zzbhg = new ArrayList(0);
	private static Map zzbhh = new HashMap();
	private static zzp zzbhi;

	static 
	{
	//    0    0:new             #29  <Class Long>
	//    1    3:dup             
	//    2    4:lconst_0        
	//    3    5:invokespecial   #33  <Method void Long(long)>
	//    4    8:putstatic       #35  <Field Long zzbhb>
	//    5   11:new             #37  <Class Double>
	//    6   14:dup             
	//    7   15:dconst_0        
	//    8   16:invokespecial   #40  <Method void Double(double)>
	//    9   19:putstatic       #42  <Field Double zzbhc>
	//   10   22:lconst_0        
	//   11   23:invokestatic    #48  <Method zzgi zzgi.zzaq(long)>
	//   12   26:putstatic       #50  <Field zzgi zzbhd>
		zzbhe = new String("");
	//   13   29:new             #52  <Class String>
	//   14   32:dup             
	//   15   33:ldc1            #54  <String "">
	//   16   35:invokespecial   #57  <Method void String(String)>
	//   17   38:putstatic       #59  <Field String zzbhe>
	//   18   41:new             #61  <Class Boolean>
	//   19   44:dup             
	//   20   45:iconst_0        
	//   21   46:invokespecial   #64  <Method void Boolean(boolean)>
	//   22   49:putstatic       #66  <Field Boolean zzbhf>
	//   23   52:new             #68  <Class ArrayList>
	//   24   55:dup             
	//   25   56:iconst_0        
	//   26   57:invokespecial   #71  <Method void ArrayList(int)>
	//   27   60:putstatic       #73  <Field List zzbhg>
	//   28   63:new             #75  <Class HashMap>
	//   29   66:dup             
	//   30   67:invokespecial   #77  <Method void HashMap()>
	//   31   70:putstatic       #79  <Field Map zzbhh>
		zzbhi = zzj(((Object) (zzbhe)));
	//   32   73:getstatic       #59  <Field String zzbhe>
	//   33   76:invokestatic    #83  <Method zzp zzj(Object)>
	//   34   79:putstatic       #85  <Field zzp zzbhi>
	//*  35   82:return          
	}
}
