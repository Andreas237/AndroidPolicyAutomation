// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//			zzawd

public class zzawc extends com.google.android.gms.common.internal.safeparcel.zza
	implements Comparable
{
	public static class zza
		implements Comparator
	{

		public int compare(Object obj, Object obj1)
		{
			return zza((zzawc)obj, (zzawc)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class zzawc>
		//    3    5:aload_2         
		//    4    6:checkcast       #9   <Class zzawc>
		//    5    9:invokevirtual   #20  <Method int zza(zzawc, zzawc)>
		//    6   12:ireturn         
		}

		public int zza(zzawc zzawc1, zzawc zzawc2)
		{
			if(zzawc1.zzbzw == zzawc2.zzbzw)
		//*   0    0:aload_1         
		//*   1    1:getfield        #24  <Field int zzawc.zzbzw>
		//*   2    4:aload_2         
		//*   3    5:getfield        #24  <Field int zzawc.zzbzw>
		//*   4    8:icmpne          23
				return zzawc1.name.compareTo(zzawc2.name);
		//    5   11:aload_1         
		//    6   12:getfield        #28  <Field String zzawc.name>
		//    7   15:aload_2         
		//    8   16:getfield        #28  <Field String zzawc.name>
		//    9   19:invokevirtual   #34  <Method int String.compareTo(String)>
		//   10   22:ireturn         
			else
				return zzawc1.zzbzw - zzawc2.zzbzw;
		//   11   23:aload_1         
		//   12   24:getfield        #24  <Field int zzawc.zzbzw>
		//   13   27:aload_2         
		//   14   28:getfield        #24  <Field int zzawc.zzbzw>
		//   15   31:isub            
		//   16   32:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	zzawc(int i, String s, long l, boolean flag, double d, 
			String s1, byte abyte0[], int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #59  <Field int mVersionCode>
		name = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #61  <Field String name>
		zzbzt = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #63  <Field long zzbzt>
		zzbgG = flag;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #65  <Field boolean zzbgG>
		zzbgI = d;
	//   14   25:aload_0         
	//   15   26:dload           6
	//   16   28:putfield        #67  <Field double zzbgI>
		zzaFy = s1;
	//   17   31:aload_0         
	//   18   32:aload           8
	//   19   34:putfield        #69  <Field String zzaFy>
		zzbzu = abyte0;
	//   20   37:aload_0         
	//   21   38:aload           9
	//   22   40:putfield        #71  <Field byte[] zzbzu>
		zzbzv = j;
	//   23   43:aload_0         
	//   24   44:iload           10
	//   25   46:putfield        #73  <Field int zzbzv>
		zzbzw = k;
	//   26   49:aload_0         
	//   27   50:iload           11
	//   28   52:putfield        #75  <Field int zzbzw>
	//   29   55:return          
	}

	private static int compare(byte byte0, byte byte1)
	{
		return byte0 - byte1;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:ireturn         
	}

	private static int compare(int i, int j)
	{
		if(i < j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          7
			return -1;
	//    3    5:iconst_m1       
	//    4    6:ireturn         
		return i != j ? 1 : 0;
	//    5    7:iload_0         
	//    6    8:iload_1         
	//    7    9:icmpne          14
	//    8   12:iconst_0        
	//    9   13:ireturn         
	//   10   14:iconst_1        
	//   11   15:ireturn         
	}

	private static int compare(long l, long l1)
	{
		if(l < l1)
	//*   0    0:lload_0         
	//*   1    1:lload_2         
	//*   2    2:lcmp            
	//*   3    3:ifge            8
			return -1;
	//    4    6:iconst_m1       
	//    5    7:ireturn         
		return l != l1 ? 1 : 0;
	//    6    8:lload_0         
	//    7    9:lload_2         
	//    8   10:lcmp            
	//    9   11:ifne            16
	//   10   14:iconst_0        
	//   11   15:ireturn         
	//   12   16:iconst_1        
	//   13   17:ireturn         
	}

	private static int compare(String s, String s1)
	{
		if(s == s1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		if(s == null)
	//*   5    7:aload_0         
	//*   6    8:ifnonnull       13
			return -1;
	//    7   11:iconst_m1       
	//    8   12:ireturn         
		if(s1 == null)
	//*   9   13:aload_1         
	//*  10   14:ifnonnull       19
			return 1;
	//   11   17:iconst_1        
	//   12   18:ireturn         
		else
			return s.compareTo(s1);
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:invokevirtual   #86  <Method int String.compareTo(String)>
	//   16   24:ireturn         
	}

	private static int compare(boolean flag, boolean flag1)
	{
		if(flag == flag1)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpne          7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		return !flag ? -1 : 1;
	//    5    7:iload_0         
	//    6    8:ifeq            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_m1       
	//   10   14:ireturn         
	}

	public int compareTo(Object obj)
	{
		return zza((zzawc)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class zzawc>
	//    3    5:invokevirtual   #91  <Method int zza(zzawc)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(obj == null || !(obj instanceof zzawc)) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnull          207
	//    4    6:aload_1         
	//    5    7:instanceof      #2   <Class zzawc>
	//    6   10:ifeq            207
_L1:
		obj = ((Object) ((zzawc)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class zzawc>
	//    9   17:astore_1        
		if(mVersionCode == ((zzawc) (obj)).mVersionCode && zzaa.equal(((Object) (name)), ((Object) (((zzawc) (obj)).name))) && zzbzv == ((zzawc) (obj)).zzbzv && zzbzw == ((zzawc) (obj)).zzbzw) goto _L4; else goto _L3
	//   10   18:aload_0         
	//   11   19:getfield        #59  <Field int mVersionCode>
	//   12   22:aload_1         
	//   13   23:getfield        #59  <Field int mVersionCode>
	//   14   26:icmpne          65
	//   15   29:aload_0         
	//   16   30:getfield        #61  <Field String name>
	//   17   33:aload_1         
	//   18   34:getfield        #61  <Field String name>
	//   19   37:invokestatic    #99  <Method boolean zzaa.equal(Object, Object)>
	//   20   40:ifeq            65
	//   21   43:aload_0         
	//   22   44:getfield        #73  <Field int zzbzv>
	//   23   47:aload_1         
	//   24   48:getfield        #73  <Field int zzbzv>
	//   25   51:icmpne          65
	//   26   54:aload_0         
	//   27   55:getfield        #75  <Field int zzbzw>
	//   28   58:aload_1         
	//   29   59:getfield        #75  <Field int zzbzw>
	//   30   62:icmpeq          69
_L3:
		flag = false;
	//   31   65:iconst_0        
	//   32   66:istore_3        
_L5:
		return flag;
	//   33   67:iload_3         
	//   34   68:ireturn         
_L4:
		switch(zzbzv)
	//*  35   69:aload_0         
	//*  36   70:getfield        #73  <Field int zzbzv>
		{
	//*  37   73:tableswitch     1 5: default 108
	//	               1 142
	//	               2 156
	//	               3 169
	//	               4 183
	//	               5 195
		default:
			int i = zzbzv;
	//   38  108:aload_0         
	//   39  109:getfield        #73  <Field int zzbzv>
	//   40  112:istore_2        
			throw new AssertionError(((Object) ((new StringBuilder(31)).append("Invalid enum value: ").append(i).toString())));
	//   41  113:new             #101 <Class AssertionError>
	//   42  116:dup             
	//   43  117:new             #103 <Class StringBuilder>
	//   44  120:dup             
	//   45  121:bipush          31
	//   46  123:invokespecial   #106 <Method void StringBuilder(int)>
	//   47  126:ldc1            #108 <String "Invalid enum value: ">
	//   48  128:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   49  131:iload_2         
	//   50  132:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   51  135:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   52  138:invokespecial   #122 <Method void AssertionError(Object)>
	//   53  141:athrow          

		case 1: // '\001'
			if(zzbzt != ((zzawc) (obj)).zzbzt)
	//*  54  142:aload_0         
	//*  55  143:getfield        #63  <Field long zzbzt>
	//*  56  146:aload_1         
	//*  57  147:getfield        #63  <Field long zzbzt>
	//*  58  150:lcmp            
	//*  59  151:ifeq            67
				return false;
	//   60  154:iconst_0        
	//   61  155:ireturn         
			break;

		case 2: // '\002'
			if(zzbgG != ((zzawc) (obj)).zzbgG)
	//*  62  156:aload_0         
	//*  63  157:getfield        #65  <Field boolean zzbgG>
	//*  64  160:aload_1         
	//*  65  161:getfield        #65  <Field boolean zzbgG>
	//*  66  164:icmpeq          67
				return false;
	//   67  167:iconst_0        
	//   68  168:ireturn         
			break;

		case 3: // '\003'
			if(zzbgI != ((zzawc) (obj)).zzbgI)
	//*  69  169:aload_0         
	//*  70  170:getfield        #67  <Field double zzbgI>
	//*  71  173:aload_1         
	//*  72  174:getfield        #67  <Field double zzbgI>
	//*  73  177:dcmpl           
	//*  74  178:ifeq            67
				return false;
	//   75  181:iconst_0        
	//   76  182:ireturn         
			break;

		case 4: // '\004'
			return zzaa.equal(((Object) (zzaFy)), ((Object) (((zzawc) (obj)).zzaFy)));
	//   77  183:aload_0         
	//   78  184:getfield        #69  <Field String zzaFy>
	//   79  187:aload_1         
	//   80  188:getfield        #69  <Field String zzaFy>
	//   81  191:invokestatic    #99  <Method boolean zzaa.equal(Object, Object)>
	//   82  194:ireturn         

		case 5: // '\005'
			return Arrays.equals(zzbzu, ((zzawc) (obj)).zzbzu);
	//   83  195:aload_0         
	//   84  196:getfield        #71  <Field byte[] zzbzu>
	//   85  199:aload_1         
	//   86  200:getfield        #71  <Field byte[] zzbzu>
	//   87  203:invokestatic    #127 <Method boolean Arrays.equals(byte[], byte[])>
	//   88  206:ireturn         
		}
		if(true) goto _L5; else goto _L2
_L2:
		return false;
	//   89  207:iconst_0        
	//   90  208:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #103 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #128 <Method void StringBuilder()>
	//    3    7:astore_1        
		zza(stringbuilder);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #131 <Method String zza(StringBuilder)>
	//    7   13:pop             
		return stringbuilder.toString();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   10   18:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzawd.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #136 <Method void com.google.android.gms.internal.zzawd.zza(zzawc, Parcel, int)>
	//    4    6:return          
	}

	public int zza(zzawc zzawc1)
	{
		int i;
		int j;
		int k;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		k = name.compareTo(zzawc1.name);
	//    4    4:aload_0         
	//    5    5:getfield        #61  <Field String name>
	//    6    8:aload_1         
	//    7    9:getfield        #61  <Field String name>
	//    8   12:invokevirtual   #86  <Method int String.compareTo(String)>
	//    9   15:istore          4
		if(k == 0) goto _L2; else goto _L1
	//   10   17:iload           4
	//   11   19:ifeq            27
_L1:
		i = k;
	//   12   22:iload           4
	//   13   24:istore_2        
_L4:
		return i;
	//   14   25:iload_2         
	//   15   26:ireturn         
_L2:
		int l = compare(zzbzv, zzawc1.zzbzv);
	//   16   27:aload_0         
	//   17   28:getfield        #73  <Field int zzbzv>
	//   18   31:aload_1         
	//   19   32:getfield        #73  <Field int zzbzv>
	//   20   35:invokestatic    #138 <Method int compare(int, int)>
	//   21   38:istore          4
		if(l != 0)
	//*  22   40:iload           4
	//*  23   42:ifeq            48
			return l;
	//   24   45:iload           4
	//   25   47:ireturn         
		switch(zzbzv)
	//*  26   48:aload_0         
	//*  27   49:getfield        #73  <Field int zzbzv>
		{
	//*  28   52:tableswitch     1 5: default 88
	//	               1 122
	//	               2 134
	//	               3 146
	//	               4 158
	//	               5 170
		default:
			i = zzbzv;
	//   29   88:aload_0         
	//   30   89:getfield        #73  <Field int zzbzv>
	//   31   92:istore_2        
			throw new AssertionError(((Object) ((new StringBuilder(31)).append("Invalid enum value: ").append(i).toString())));
	//   32   93:new             #101 <Class AssertionError>
	//   33   96:dup             
	//   34   97:new             #103 <Class StringBuilder>
	//   35  100:dup             
	//   36  101:bipush          31
	//   37  103:invokespecial   #106 <Method void StringBuilder(int)>
	//   38  106:ldc1            #108 <String "Invalid enum value: ">
	//   39  108:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   40  111:iload_2         
	//   41  112:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   42  115:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   43  118:invokespecial   #122 <Method void AssertionError(Object)>
	//   44  121:athrow          

		case 1: // '\001'
			return compare(zzbzt, zzawc1.zzbzt);
	//   45  122:aload_0         
	//   46  123:getfield        #63  <Field long zzbzt>
	//   47  126:aload_1         
	//   48  127:getfield        #63  <Field long zzbzt>
	//   49  130:invokestatic    #140 <Method int compare(long, long)>
	//   50  133:ireturn         

		case 2: // '\002'
			return compare(zzbgG, zzawc1.zzbgG);
	//   51  134:aload_0         
	//   52  135:getfield        #65  <Field boolean zzbgG>
	//   53  138:aload_1         
	//   54  139:getfield        #65  <Field boolean zzbgG>
	//   55  142:invokestatic    #142 <Method int compare(boolean, boolean)>
	//   56  145:ireturn         

		case 3: // '\003'
			return Double.compare(zzbgI, zzawc1.zzbgI);
	//   57  146:aload_0         
	//   58  147:getfield        #67  <Field double zzbgI>
	//   59  150:aload_1         
	//   60  151:getfield        #67  <Field double zzbgI>
	//   61  154:invokestatic    #147 <Method int Double.compare(double, double)>
	//   62  157:ireturn         

		case 4: // '\004'
			return compare(zzaFy, zzawc1.zzaFy);
	//   63  158:aload_0         
	//   64  159:getfield        #69  <Field String zzaFy>
	//   65  162:aload_1         
	//   66  163:getfield        #69  <Field String zzaFy>
	//   67  166:invokestatic    #149 <Method int compare(String, String)>
	//   68  169:ireturn         

		case 5: // '\005'
			break;
		}
		if(zzbzu == zzawc1.zzbzu) goto _L4; else goto _L3
	//   69  170:aload_0         
	//   70  171:getfield        #71  <Field byte[] zzbzu>
	//   71  174:aload_1         
	//   72  175:getfield        #71  <Field byte[] zzbzu>
	//   73  178:if_acmpeq       25
_L3:
		if(zzbzu == null)
	//*  74  181:aload_0         
	//*  75  182:getfield        #71  <Field byte[] zzbzu>
	//*  76  185:ifnonnull       190
			return -1;
	//   77  188:iconst_m1       
	//   78  189:ireturn         
		i = j;
	//   79  190:iload_3         
	//   80  191:istore_2        
		if(zzawc1.zzbzu == null)
	//*  81  192:aload_1         
	//*  82  193:getfield        #71  <Field byte[] zzbzu>
	//*  83  196:ifnonnull       205
			return 1;
	//   84  199:iconst_1        
	//   85  200:ireturn         
	//*  86  201:iload_2         
	//*  87  202:iconst_1        
	//*  88  203:iadd            
	//*  89  204:istore_2        
_L8:
		if(i < Math.min(zzbzu.length, zzawc1.zzbzu.length))
	//*  90  205:iload_2         
	//*  91  206:aload_0         
	//*  92  207:getfield        #71  <Field byte[] zzbzu>
	//*  93  210:arraylength     
	//*  94  211:aload_1         
	//*  95  212:getfield        #71  <Field byte[] zzbzu>
	//*  96  215:arraylength     
	//*  97  216:invokestatic    #154 <Method int Math.min(int, int)>
	//*  98  219:icmpge          244
	//*  99  222:aload_0         
	//* 100  223:getfield        #71  <Field byte[] zzbzu>
	//* 101  226:iload_2         
	//* 102  227:baload          
	//* 103  228:aload_1         
	//* 104  229:getfield        #71  <Field byte[] zzbzu>
	//* 105  232:iload_2         
	//* 106  233:baload          
	//* 107  234:invokestatic    #156 <Method int compare(byte, byte)>
	//* 108  237:istore_3        
		{
			if((j = compare(zzbzu[i], zzawc1.zzbzu[i])) != 0)
	//* 109  238:iload_3         
	//* 110  239:ifeq            201
				return j;
	//  111  242:iload_3         
	//  112  243:ireturn         
		} else
		{
			return compare(zzbzu.length, zzawc1.zzbzu.length);
	//  113  244:aload_0         
	//  114  245:getfield        #71  <Field byte[] zzbzu>
	//  115  248:arraylength     
	//  116  249:aload_1         
	//  117  250:getfield        #71  <Field byte[] zzbzu>
	//  118  253:arraylength     
	//  119  254:invokestatic    #138 <Method int compare(int, int)>
	//  120  257:ireturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
		break; /* Loop/switch isn't completed */
_L6:
		i++;
		if(true) goto _L8; else goto _L7
_L7:
	}

	public String zza(StringBuilder stringbuilder)
	{
		stringbuilder.append("Flag(");
	//    0    0:aload_1         
	//    1    1:ldc1            #158 <String "Flag(">
	//    2    3:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		stringbuilder.append(mVersionCode);
	//    4    7:aload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #59  <Field int mVersionCode>
	//    7   12:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//    8   15:pop             
		stringbuilder.append(", ");
	//    9   16:aload_1         
	//   10   17:ldc1            #160 <String ", ">
	//   11   19:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		stringbuilder.append(name);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #61  <Field String name>
	//   16   28:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		stringbuilder.append(", ");
	//   18   32:aload_1         
	//   19   33:ldc1            #160 <String ", ">
	//   20   35:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
		zzbzv;
	//   22   39:aload_0         
	//   23   40:getfield        #73  <Field int zzbzv>
		JVM INSTR tableswitch 1 5: default 76
	//	               1 132
	//	               2 185
	//	               3 197
	//	               4 209
	//	               5 235;
	//   24   43:tableswitch     1 5: default 76
	//	               1 132
	//	               2 185
	//	               3 197
	//	               4 209
	//	               5 235
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		stringbuilder = ((StringBuilder) (name));
	//   25   76:aload_0         
	//   26   77:getfield        #61  <Field String name>
	//   27   80:astore_1        
		int i = zzbzv;
	//   28   81:aload_0         
	//   29   82:getfield        #73  <Field int zzbzv>
	//   30   85:istore_2        
		throw new AssertionError(((Object) ((new StringBuilder(String.valueOf(((Object) (stringbuilder))).length() + 27)).append("Invalid type: ").append(((String) (stringbuilder))).append(", ").append(i).toString())));
	//   31   86:new             #101 <Class AssertionError>
	//   32   89:dup             
	//   33   90:new             #103 <Class StringBuilder>
	//   34   93:dup             
	//   35   94:aload_1         
	//   36   95:invokestatic    #164 <Method String String.valueOf(Object)>
	//   37   98:invokevirtual   #168 <Method int String.length()>
	//   38  101:bipush          27
	//   39  103:iadd            
	//   40  104:invokespecial   #106 <Method void StringBuilder(int)>
	//   41  107:ldc1            #170 <String "Invalid type: ">
	//   42  109:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   43  112:aload_1         
	//   44  113:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   45  116:ldc1            #160 <String ", ">
	//   46  118:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   47  121:iload_2         
	//   48  122:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   49  125:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   50  128:invokespecial   #122 <Method void AssertionError(Object)>
	//   51  131:athrow          
_L2:
		stringbuilder.append(zzbzt);
	//   52  132:aload_1         
	//   53  133:aload_0         
	//   54  134:getfield        #63  <Field long zzbzt>
	//   55  137:invokevirtual   #173 <Method StringBuilder StringBuilder.append(long)>
	//   56  140:pop             
_L8:
		stringbuilder.append(", ");
	//   57  141:aload_1         
	//   58  142:ldc1            #160 <String ", ">
	//   59  144:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   60  147:pop             
		stringbuilder.append(zzbzv);
	//   61  148:aload_1         
	//   62  149:aload_0         
	//   63  150:getfield        #73  <Field int zzbzv>
	//   64  153:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   65  156:pop             
		stringbuilder.append(", ");
	//   66  157:aload_1         
	//   67  158:ldc1            #160 <String ", ">
	//   68  160:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   69  163:pop             
		stringbuilder.append(zzbzw);
	//   70  164:aload_1         
	//   71  165:aload_0         
	//   72  166:getfield        #75  <Field int zzbzw>
	//   73  169:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   74  172:pop             
		stringbuilder.append(")");
	//   75  173:aload_1         
	//   76  174:ldc1            #175 <String ")">
	//   77  176:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   78  179:pop             
		return stringbuilder.toString();
	//   79  180:aload_1         
	//   80  181:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   81  184:areturn         
_L3:
		stringbuilder.append(zzbgG);
	//   82  185:aload_1         
	//   83  186:aload_0         
	//   84  187:getfield        #65  <Field boolean zzbgG>
	//   85  190:invokevirtual   #178 <Method StringBuilder StringBuilder.append(boolean)>
	//   86  193:pop             
		continue; /* Loop/switch isn't completed */
	//   87  194:goto            141
_L4:
		stringbuilder.append(zzbgI);
	//   88  197:aload_1         
	//   89  198:aload_0         
	//   90  199:getfield        #67  <Field double zzbgI>
	//   91  202:invokevirtual   #181 <Method StringBuilder StringBuilder.append(double)>
	//   92  205:pop             
		continue; /* Loop/switch isn't completed */
	//   93  206:goto            141
_L5:
		stringbuilder.append("'");
	//   94  209:aload_1         
	//   95  210:ldc1            #183 <String "'">
	//   96  212:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   97  215:pop             
		stringbuilder.append(zzaFy);
	//   98  216:aload_1         
	//   99  217:aload_0         
	//  100  218:getfield        #69  <Field String zzaFy>
	//  101  221:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  102  224:pop             
		stringbuilder.append("'");
	//  103  225:aload_1         
	//  104  226:ldc1            #183 <String "'">
	//  105  228:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  106  231:pop             
		continue; /* Loop/switch isn't completed */
	//  107  232:goto            141
_L6:
		if(zzbzu == null)
	//* 108  235:aload_0         
	//* 109  236:getfield        #71  <Field byte[] zzbzu>
	//* 110  239:ifnonnull       252
		{
			stringbuilder.append("null");
	//  111  242:aload_1         
	//  112  243:ldc1            #185 <String "null">
	//  113  245:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  114  248:pop             
		} else
	//* 115  249:goto            141
		{
			stringbuilder.append("'");
	//  116  252:aload_1         
	//  117  253:ldc1            #183 <String "'">
	//  118  255:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  119  258:pop             
			stringbuilder.append(new String(zzbzu, UTF_8));
	//  120  259:aload_1         
	//  121  260:new             #82  <Class String>
	//  122  263:dup             
	//  123  264:aload_0         
	//  124  265:getfield        #71  <Field byte[] zzbzu>
	//  125  268:getstatic       #51  <Field Charset UTF_8>
	//  126  271:invokespecial   #188 <Method void String(byte[], Charset)>
	//  127  274:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  128  277:pop             
			stringbuilder.append("'");
	//  129  278:aload_1         
	//  130  279:ldc1            #183 <String "'">
	//  131  281:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  132  284:pop             
		}
		if(true) goto _L8; else goto _L7
	//  133  285:goto            141
_L7:
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzawd();
	private static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final zza zzbzx = new zza();
	final int mVersionCode;
	public final String name;
	final String zzaFy;
	final boolean zzbgG;
	final double zzbgI;
	final long zzbzt;
	final byte zzbzu[];
	public final int zzbzv;
	public final int zzbzw;

	static 
	{
	//    0    0:new             #36  <Class zzawd>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zzawd()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:ldc1            #43  <String "UTF-8">
	//    5   12:invokestatic    #49  <Method Charset Charset.forName(String)>
	//    6   15:putstatic       #51  <Field Charset UTF_8>
	//    7   18:new             #9   <Class zzawc$zza>
	//    8   21:dup             
	//    9   22:invokespecial   #52  <Method void zzawc$zza()>
	//   10   25:putstatic       #54  <Field zzawc$zza zzbzx>
	//*  11   28:return          
	}
}
