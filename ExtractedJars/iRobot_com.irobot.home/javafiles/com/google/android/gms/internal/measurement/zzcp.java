// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzck, zzat, zzbx, 
//			zzav, zzaw, zzct, zzcv

public class zzcp extends zzau
{

	public zzcp(zzaw zzaw1)
	{
		super(zzaw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void zzau(zzaw)>
	//    3    5:return          
	}

	private static String zzd(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj1 = obj;
	//    4    6:aload_0         
	//    5    7:astore_1        
		if(obj instanceof Integer)
	//*   6    8:aload_0         
	//*   7    9:instanceof      #16  <Class Integer>
	//*   8   12:ifeq            27
			obj1 = ((Object) (Long.valueOf(((Integer)obj).intValue())));
	//    9   15:aload_0         
	//   10   16:checkcast       #16  <Class Integer>
	//   11   19:invokevirtual   #20  <Method int Integer.intValue()>
	//   12   22:i2l             
	//   13   23:invokestatic    #26  <Method Long Long.valueOf(long)>
	//   14   26:astore_1        
		if(obj1 instanceof Long)
	//*  15   27:aload_1         
	//*  16   28:instanceof      #22  <Class Long>
	//*  17   31:ifeq            165
		{
			Object obj2 = ((Object) ((Long)obj1));
	//   18   34:aload_1         
	//   19   35:checkcast       #22  <Class Long>
	//   20   38:astore_2        
			if(Math.abs(((Long) (obj2)).longValue()) < 100L)
	//*  21   39:aload_2         
	//*  22   40:invokevirtual   #30  <Method long Long.longValue()>
	//*  23   43:invokestatic    #36  <Method long Math.abs(long)>
	//*  24   46:ldc2w           #37  <Long 100L>
	//*  25   49:lcmp            
	//*  26   50:ifge            58
				return String.valueOf(obj1);
	//   27   53:aload_1         
	//   28   54:invokestatic    #42  <Method String String.valueOf(Object)>
	//   29   57:areturn         
			if(String.valueOf(obj1).charAt(0) == '-')
	//*  30   58:aload_1         
	//*  31   59:invokestatic    #42  <Method String String.valueOf(Object)>
	//*  32   62:iconst_0        
	//*  33   63:invokevirtual   #46  <Method char String.charAt(int)>
	//*  34   66:bipush          45
	//*  35   68:icmpne          77
				obj = "-";
	//   36   71:ldc1            #48  <String "-">
	//   37   73:astore_0        
			else
	//*  38   74:goto            80
				obj = "";
	//   39   77:ldc1            #50  <String "">
	//   40   79:astore_0        
			obj1 = ((Object) (String.valueOf(Math.abs(((Long) (obj2)).longValue()))));
	//   41   80:aload_2         
	//   42   81:invokevirtual   #30  <Method long Long.longValue()>
	//   43   84:invokestatic    #36  <Method long Math.abs(long)>
	//   44   87:invokestatic    #53  <Method String String.valueOf(long)>
	//   45   90:astore_1        
			obj2 = ((Object) (new StringBuilder()));
	//   46   91:new             #55  <Class StringBuilder>
	//   47   94:dup             
	//   48   95:invokespecial   #58  <Method void StringBuilder()>
	//   49   98:astore_2        
			((StringBuilder) (obj2)).append(((String) (obj)));
	//   50   99:aload_2         
	//   51  100:aload_0         
	//   52  101:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
			((StringBuilder) (obj2)).append(Math.round(Math.pow(10D, ((String) (obj1)).length() - 1)));
	//   54  105:aload_2         
	//   55  106:ldc2w           #63  <Double 10D>
	//   56  109:aload_1         
	//   57  110:invokevirtual   #67  <Method int String.length()>
	//   58  113:iconst_1        
	//   59  114:isub            
	//   60  115:i2d             
	//   61  116:invokestatic    #71  <Method double Math.pow(double, double)>
	//   62  119:invokestatic    #75  <Method long Math.round(double)>
	//   63  122:invokevirtual   #78  <Method StringBuilder StringBuilder.append(long)>
	//   64  125:pop             
			((StringBuilder) (obj2)).append("...");
	//   65  126:aload_2         
	//   66  127:ldc1            #80  <String "...">
	//   67  129:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   68  132:pop             
			((StringBuilder) (obj2)).append(((String) (obj)));
	//   69  133:aload_2         
	//   70  134:aload_0         
	//   71  135:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   72  138:pop             
			((StringBuilder) (obj2)).append(Math.round(Math.pow(10D, ((String) (obj1)).length()) - 1.0D));
	//   73  139:aload_2         
	//   74  140:ldc2w           #63  <Double 10D>
	//   75  143:aload_1         
	//   76  144:invokevirtual   #67  <Method int String.length()>
	//   77  147:i2d             
	//   78  148:invokestatic    #71  <Method double Math.pow(double, double)>
	//   79  151:dconst_1        
	//   80  152:dsub            
	//   81  153:invokestatic    #75  <Method long Math.round(double)>
	//   82  156:invokevirtual   #78  <Method StringBuilder StringBuilder.append(long)>
	//   83  159:pop             
			return ((StringBuilder) (obj2)).toString();
	//   84  160:aload_2         
	//   85  161:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   86  164:areturn         
		}
		if(obj1 instanceof Boolean)
	//*  87  165:aload_1         
	//*  88  166:instanceof      #86  <Class Boolean>
	//*  89  169:ifeq            177
			return String.valueOf(obj1);
	//   90  172:aload_1         
	//   91  173:invokestatic    #42  <Method String String.valueOf(Object)>
	//   92  176:areturn         
		if(obj1 instanceof Throwable)
	//*  93  177:aload_1         
	//*  94  178:instanceof      #88  <Class Throwable>
	//*  95  181:ifeq            192
			return obj1.getClass().getCanonicalName();
	//   96  184:aload_1         
	//   97  185:invokevirtual   #94  <Method Class Object.getClass()>
	//   98  188:invokevirtual   #99  <Method String Class.getCanonicalName()>
	//   99  191:areturn         
		else
			return "-";
	//  100  192:ldc1            #48  <String "-">
	//  101  194:areturn         
	}

	public static zzcp zzex()
	{
		return zzabh;
	//    0    0:getstatic       #104 <Field zzcp zzabh>
	//    1    3:areturn         
	}

	public final void zza(zzck zzck1, String s)
	{
		if(zzck1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			zzck1 = ((zzck) (zzck1.toString()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method String zzck.toString()>
	//    4    8:astore_1        
		else
	//*   5    9:goto            15
			zzck1 = "no hit data";
	//    6   12:ldc1            #111 <String "no hit data">
	//    7   14:astore_1        
		s = String.valueOf(((Object) (s)));
	//    8   15:aload_2         
	//    9   16:invokestatic    #42  <Method String String.valueOf(Object)>
	//   10   19:astore_2        
		if(s.length() != 0)
	//*  11   20:aload_2         
	//*  12   21:invokevirtual   #67  <Method int String.length()>
	//*  13   24:ifeq            37
			s = "Discarding hit. ".concat(s);
	//   14   27:ldc1            #113 <String "Discarding hit. ">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #117 <Method String String.concat(String)>
	//   17   33:astore_2        
		else
	//*  18   34:goto            47
			s = new String("Discarding hit. ");
	//   19   37:new             #40  <Class String>
	//   20   40:dup             
	//   21   41:ldc1            #113 <String "Discarding hit. ">
	//   22   43:invokespecial   #120 <Method void String(String)>
	//   23   46:astore_2        
		((zzat)this).zzd(s, ((Object) (zzck1)));
	//   24   47:aload_0         
	//   25   48:aload_2         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #125 <Method void zzat.zzd(String, Object)>
	//   28   53:return          
	}

	public final void zza(Map map, String s)
	{
		if(map != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          106
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #55  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #58  <Method void StringBuilder()>
	//    5   11:astore_3        
			java.util.Map.Entry entry;
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); stringbuilder.append((String)entry.getValue()))
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #132 <Method Set Map.entrySet()>
	//*   8   18:invokeinterface #138 <Method Iterator Set.iterator()>
	//*   9   23:astore_1        
	//*  10   24:aload_1         
	//*  11   25:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//*  12   30:ifeq            98
			{
				entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   33:aload_1         
	//   14   34:invokeinterface #148 <Method Object Iterator.next()>
	//   15   39:checkcast       #150 <Class java.util.Map$Entry>
	//   16   42:astore          4
				if(stringbuilder.length() > 0)
	//*  17   44:aload_3         
	//*  18   45:invokevirtual   #151 <Method int StringBuilder.length()>
	//*  19   48:ifle            58
					stringbuilder.append(',');
	//   20   51:aload_3         
	//   21   52:bipush          44
	//   22   54:invokevirtual   #154 <Method StringBuilder StringBuilder.append(char)>
	//   23   57:pop             
				stringbuilder.append((String)entry.getKey());
	//   24   58:aload_3         
	//   25   59:aload           4
	//   26   61:invokeinterface #157 <Method Object java.util.Map$Entry.getKey()>
	//   27   66:checkcast       #40  <Class String>
	//   28   69:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   29   72:pop             
				stringbuilder.append('=');
	//   30   73:aload_3         
	//   31   74:bipush          61
	//   32   76:invokevirtual   #154 <Method StringBuilder StringBuilder.append(char)>
	//   33   79:pop             
			}

	//   34   80:aload_3         
	//   35   81:aload           4
	//   36   83:invokeinterface #160 <Method Object java.util.Map$Entry.getValue()>
	//   37   88:checkcast       #40  <Class String>
	//   38   91:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   39   94:pop             
	//*  40   95:goto            24
			map = ((Map) (stringbuilder.toString()));
	//   41   98:aload_3         
	//   42   99:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   43  102:astore_1        
		} else
	//*  44  103:goto            109
		{
			map = "no hit data";
	//   45  106:ldc1            #111 <String "no hit data">
	//   46  108:astore_1        
		}
		s = String.valueOf(((Object) (s)));
	//   47  109:aload_2         
	//   48  110:invokestatic    #42  <Method String String.valueOf(Object)>
	//   49  113:astore_2        
		if(s.length() != 0)
	//*  50  114:aload_2         
	//*  51  115:invokevirtual   #67  <Method int String.length()>
	//*  52  118:ifeq            131
			s = "Discarding hit. ".concat(s);
	//   53  121:ldc1            #113 <String "Discarding hit. ">
	//   54  123:aload_2         
	//   55  124:invokevirtual   #117 <Method String String.concat(String)>
	//   56  127:astore_2        
		else
	//*  57  128:goto            141
			s = new String("Discarding hit. ");
	//   58  131:new             #40  <Class String>
	//   59  134:dup             
	//   60  135:ldc1            #113 <String "Discarding hit. ">
	//   61  137:invokespecial   #120 <Method void String(String)>
	//   62  140:astore_2        
		((zzat)this).zzd(s, ((Object) (map)));
	//   63  141:aload_0         
	//   64  142:aload_2         
	//   65  143:aload_1         
	//   66  144:invokevirtual   #125 <Method void zzat.zzd(String, Object)>
	//   67  147:return          
	}

	protected final void zzag()
	{
		com/google/android/gms/internal/measurement/zzcp;
	//    0    0:ldc1            #2   <Class zzcp>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzabh = this;
	//    2    3:aload_0         
	//    3    4:putstatic       #104 <Field zzcp zzabh>
		com/google/android/gms/internal/measurement/zzcp;
	//    4    7:ldc1            #2   <Class zzcp>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		Exception exception;
		exception;
	//    7   11:astore_1        
		com/google/android/gms/internal/measurement/zzcp;
	//    8   12:ldc1            #2   <Class zzcp>
		JVM INSTR monitorexit ;
	//    9   14:monitorexit     
		throw exception;
	//   10   15:aload_1         
	//   11   16:athrow          
	}

	public final void zzb(int i, String s, Object obj, Object obj1, Object obj2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Preconditions.checkNotNull(((Object) (s)));
	//    2    2:aload_2         
	//    3    3:invokestatic    #171 <Method Object Preconditions.checkNotNull(Object)>
	//    4    6:pop             
		int j;
		j = i;
	//    5    7:iload_1         
	//    6    8:istore          8
		if(i < 0)
	//*   7   10:iload_1         
	//*   8   11:ifge            190
			j = 0;
	//    9   14:iconst_0        
	//   10   15:istore          8
		break MISSING_BLOCK_LABEL_190;
	//   11   17:goto            190
_L1:
		char c;
		char c1;
		String s1;
		if(((zzat)this).zzbz().zzdw())
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #175 <Method zzbx zzat.zzbz()>
	//*  14   24:invokevirtual   #180 <Method boolean zzbx.zzdw()>
	//*  15   27:ifeq            206
			c = 'C';
	//   16   30:bipush          67
	//   17   32:istore          6
		else
	//*  18   34:goto            37
	//*  19   37:ldc1            #182 <String "01VDIWEA?">
	//*  20   39:iload_1         
	//*  21   40:invokevirtual   #46  <Method char String.charAt(int)>
	//*  22   43:istore          7
	//*  23   45:getstatic       #188 <Field String zzav.VERSION>
	//*  24   48:astore          9
	//*  25   50:aload_2         
	//*  26   51:aload_3         
	//*  27   52:invokestatic    #190 <Method String zzd(Object)>
	//*  28   55:aload           4
	//*  29   57:invokestatic    #190 <Method String zzd(Object)>
	//*  30   60:aload           5
	//*  31   62:invokestatic    #190 <Method String zzd(Object)>
	//*  32   65:invokestatic    #194 <Method String zzc(String, Object, Object, Object)>
	//*  33   68:astore_2        
	//*  34   69:new             #55  <Class StringBuilder>
	//*  35   72:dup             
	//*  36   73:aload           9
	//*  37   75:invokestatic    #42  <Method String String.valueOf(Object)>
	//*  38   78:invokevirtual   #67  <Method int String.length()>
	//*  39   81:iconst_4        
	//*  40   82:iadd            
	//*  41   83:aload_2         
	//*  42   84:invokestatic    #42  <Method String String.valueOf(Object)>
	//*  43   87:invokevirtual   #67  <Method int String.length()>
	//*  44   90:iadd            
	//*  45   91:invokespecial   #197 <Method void StringBuilder(int)>
	//*  46   94:astore_3        
	//*  47   95:aload_3         
	//*  48   96:ldc1            #199 <String "3">
	//*  49   98:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  50  101:pop             
	//*  51  102:aload_3         
	//*  52  103:iload           7
	//*  53  105:invokevirtual   #154 <Method StringBuilder StringBuilder.append(char)>
	//*  54  108:pop             
	//*  55  109:aload_3         
	//*  56  110:iload           6
	//*  57  112:invokevirtual   #154 <Method StringBuilder StringBuilder.append(char)>
	//*  58  115:pop             
	//*  59  116:aload_3         
	//*  60  117:aload           9
	//*  61  119:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  62  122:pop             
	//*  63  123:aload_3         
	//*  64  124:ldc1            #201 <String ":">
	//*  65  126:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  66  129:pop             
	//*  67  130:aload_3         
	//*  68  131:aload_2         
	//*  69  132:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  70  135:pop             
	//*  71  136:aload_3         
	//*  72  137:invokevirtual   #84  <Method String StringBuilder.toString()>
	//*  73  140:astore_3        
	//*  74  141:aload_3         
	//*  75  142:astore_2        
	//*  76  143:aload_3         
	//*  77  144:invokevirtual   #67  <Method int String.length()>
	//*  78  147:sipush          1024
	//*  79  150:icmple          162
	//*  80  153:aload_3         
	//*  81  154:iconst_0        
	//*  82  155:sipush          1024
	//*  83  158:invokevirtual   #205 <Method String String.substring(int, int)>
	//*  84  161:astore_2        
	//*  85  162:aload_0         
	//*  86  163:invokevirtual   #209 <Method zzaw zzat.zzbw()>
	//*  87  166:invokevirtual   #215 <Method zzct zzaw.zzcp()>
	//*  88  169:astore_3        
	//*  89  170:aload_3         
	//*  90  171:ifnull          182
	//*  91  174:aload_3         
	//*  92  175:invokevirtual   #221 <Method zzcv zzct.zzfk()>
	//*  93  178:aload_2         
	//*  94  179:invokevirtual   #226 <Method void zzcv.zzad(String)>
	//*  95  182:aload_0         
	//*  96  183:monitorexit     
	//*  97  184:return          
	//*  98  185:astore_2        
	//*  99  186:aload_0         
	//* 100  187:monitorexit     
	//* 101  188:aload_2         
	//* 102  189:athrow          
	//* 103  190:iload           8
	//* 104  192:istore_1        
	//* 105  193:iload           8
	//* 106  195:bipush          9
	//* 107  197:icmplt          20
	//* 108  200:bipush          8
	//* 109  202:istore_1        
	//* 110  203:goto            20
			c = 'c';
	//  111  206:bipush          99
	//  112  208:istore          6
		c1 = "01VDIWEA?".charAt(i);
		s1 = zzav.VERSION;
		s = zzc(s, ((Object) (zzd(obj))), ((Object) (zzd(obj1))), ((Object) (zzd(obj2))));
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 4 + String.valueOf(((Object) (s))).length())));
		((StringBuilder) (obj)).append("3");
		((StringBuilder) (obj)).append(c1);
		((StringBuilder) (obj)).append(c);
		((StringBuilder) (obj)).append(s1);
		((StringBuilder) (obj)).append(":");
		((StringBuilder) (obj)).append(s);
		obj = ((Object) (((StringBuilder) (obj)).toString()));
		s = ((String) (obj));
		if(((String) (obj)).length() > 1024)
			s = ((String) (obj)).substring(0, 1024);
		obj = ((Object) (((zzat)this).zzbw().zzcp()));
		if(obj == null)
			break MISSING_BLOCK_LABEL_182;
		((zzct) (obj)).zzfk().zzad(s);
		this;
		JVM INSTR monitorexit ;
		return;
		s;
		throw s;
		i = j;
		if(j >= 9)
			i = 8;
		  goto _L1
	//* 113  210:goto            37
	}

	private static zzcp zzabh;
}
