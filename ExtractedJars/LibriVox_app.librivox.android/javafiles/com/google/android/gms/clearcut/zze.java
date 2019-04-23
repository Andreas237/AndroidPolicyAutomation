// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.clearcut.js;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.clearcut:
//			i, d

public final class zze extends AbstractSafeParcelable
{

	public zze(zzr zzr, js js, d d1, d d2, int ai[], String as[], int ai1[], 
			byte abyte0[][], ExperimentTokens aexperimenttokens[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		a = zzr;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field zzr a>
		c = js;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field js c>
		d = d1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #44  <Field d d>
		e = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #46  <Field d e>
		f = ai;
	//   14   24:aload_0         
	//   15   25:aload           5
	//   16   27:putfield        #48  <Field int[] f>
		g = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #50  <Field String[] g>
		h = ai1;
	//   20   35:aload_0         
	//   21   36:aload           7
	//   22   38:putfield        #52  <Field int[] h>
		i = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #54  <Field byte[][] i>
		j = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #56  <Field ExperimentTokens[] j>
		k = flag;
	//   29   51:aload_0         
	//   30   52:iload           10
	//   31   54:putfield        #58  <Field boolean k>
	//   32   57:return          
	}

	zze(zzr zzr, byte abyte0[], int ai[], String as[], int ai1[], byte abyte1[][], boolean flag, 
			ExperimentTokens aexperimenttokens[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		a = zzr;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field zzr a>
		b = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #61  <Field byte[] b>
		f = ai;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #48  <Field int[] f>
		g = as;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #50  <Field String[] g>
		c = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #42  <Field js c>
		d = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #44  <Field d d>
		e = null;
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:putfield        #46  <Field d e>
		h = ai1;
	//   23   40:aload_0         
	//   24   41:aload           5
	//   25   43:putfield        #52  <Field int[] h>
		i = abyte1;
	//   26   46:aload_0         
	//   27   47:aload           6
	//   28   49:putfield        #54  <Field byte[][] i>
		j = aexperimenttokens;
	//   29   52:aload_0         
	//   30   53:aload           8
	//   31   55:putfield        #56  <Field ExperimentTokens[] j>
		k = flag;
	//   32   58:aload_0         
	//   33   59:iload           7
	//   34   61:putfield        #58  <Field boolean k>
	//   35   64:return          
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
		if(obj instanceof zze)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zze>
	//*   7   11:ifeq            172
		{
			obj = ((Object) ((zze)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #2   <Class zze>
	//   10   18:astore_1        
			if(ak.a(((Object) (a)), ((Object) (((zze) (obj)).a))) && Arrays.equals(b, ((zze) (obj)).b) && Arrays.equals(f, ((zze) (obj)).f) && Arrays.equals(((Object []) (g)), ((Object []) (((zze) (obj)).g))) && ak.a(((Object) (c)), ((Object) (((zze) (obj)).c))) && ak.a(((Object) (d)), ((Object) (((zze) (obj)).d))) && ak.a(((Object) (e)), ((Object) (((zze) (obj)).e))) && Arrays.equals(h, ((zze) (obj)).h) && Arrays.deepEquals(((Object []) (i)), ((Object []) (((zze) (obj)).i))) && Arrays.equals(((Object []) (j)), ((Object []) (((zze) (obj)).j))) && k == ((zze) (obj)).k)
	//*  11   19:aload_0         
	//*  12   20:getfield        #40  <Field zzr a>
	//*  13   23:aload_1         
	//*  14   24:getfield        #40  <Field zzr a>
	//*  15   27:invokestatic    #68  <Method boolean ak.a(Object, Object)>
	//*  16   30:ifeq            172
	//*  17   33:aload_0         
	//*  18   34:getfield        #61  <Field byte[] b>
	//*  19   37:aload_1         
	//*  20   38:getfield        #61  <Field byte[] b>
	//*  21   41:invokestatic    #73  <Method boolean Arrays.equals(byte[], byte[])>
	//*  22   44:ifeq            172
	//*  23   47:aload_0         
	//*  24   48:getfield        #48  <Field int[] f>
	//*  25   51:aload_1         
	//*  26   52:getfield        #48  <Field int[] f>
	//*  27   55:invokestatic    #76  <Method boolean Arrays.equals(int[], int[])>
	//*  28   58:ifeq            172
	//*  29   61:aload_0         
	//*  30   62:getfield        #50  <Field String[] g>
	//*  31   65:aload_1         
	//*  32   66:getfield        #50  <Field String[] g>
	//*  33   69:invokestatic    #79  <Method boolean Arrays.equals(Object[], Object[])>
	//*  34   72:ifeq            172
	//*  35   75:aload_0         
	//*  36   76:getfield        #42  <Field js c>
	//*  37   79:aload_1         
	//*  38   80:getfield        #42  <Field js c>
	//*  39   83:invokestatic    #68  <Method boolean ak.a(Object, Object)>
	//*  40   86:ifeq            172
	//*  41   89:aload_0         
	//*  42   90:getfield        #44  <Field d d>
	//*  43   93:aload_1         
	//*  44   94:getfield        #44  <Field d d>
	//*  45   97:invokestatic    #68  <Method boolean ak.a(Object, Object)>
	//*  46  100:ifeq            172
	//*  47  103:aload_0         
	//*  48  104:getfield        #46  <Field d e>
	//*  49  107:aload_1         
	//*  50  108:getfield        #46  <Field d e>
	//*  51  111:invokestatic    #68  <Method boolean ak.a(Object, Object)>
	//*  52  114:ifeq            172
	//*  53  117:aload_0         
	//*  54  118:getfield        #52  <Field int[] h>
	//*  55  121:aload_1         
	//*  56  122:getfield        #52  <Field int[] h>
	//*  57  125:invokestatic    #76  <Method boolean Arrays.equals(int[], int[])>
	//*  58  128:ifeq            172
	//*  59  131:aload_0         
	//*  60  132:getfield        #54  <Field byte[][] i>
	//*  61  135:aload_1         
	//*  62  136:getfield        #54  <Field byte[][] i>
	//*  63  139:invokestatic    #82  <Method boolean Arrays.deepEquals(Object[], Object[])>
	//*  64  142:ifeq            172
	//*  65  145:aload_0         
	//*  66  146:getfield        #56  <Field ExperimentTokens[] j>
	//*  67  149:aload_1         
	//*  68  150:getfield        #56  <Field ExperimentTokens[] j>
	//*  69  153:invokestatic    #79  <Method boolean Arrays.equals(Object[], Object[])>
	//*  70  156:ifeq            172
	//*  71  159:aload_0         
	//*  72  160:getfield        #58  <Field boolean k>
	//*  73  163:aload_1         
	//*  74  164:getfield        #58  <Field boolean k>
	//*  75  167:icmpne          172
				return true;
	//   76  170:iconst_1        
	//   77  171:ireturn         
		}
		return false;
	//   78  172:iconst_0        
	//   79  173:ireturn         
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			a, b, f, g, c, d, e, h, i, j, 
			Boolean.valueOf(k)
		});
	//    0    0:bipush          11
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #40  <Field zzr a>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #61  <Field byte[] b>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #48  <Field int[] f>
	//   16   25:aastore         
	//   17   26:dup             
	//   18   27:iconst_3        
	//   19   28:aload_0         
	//   20   29:getfield        #50  <Field String[] g>
	//   21   32:aastore         
	//   22   33:dup             
	//   23   34:iconst_4        
	//   24   35:aload_0         
	//   25   36:getfield        #42  <Field js c>
	//   26   39:aastore         
	//   27   40:dup             
	//   28   41:iconst_5        
	//   29   42:aload_0         
	//   30   43:getfield        #44  <Field d d>
	//   31   46:aastore         
	//   32   47:dup             
	//   33   48:bipush          6
	//   34   50:aload_0         
	//   35   51:getfield        #46  <Field d e>
	//   36   54:aastore         
	//   37   55:dup             
	//   38   56:bipush          7
	//   39   58:aload_0         
	//   40   59:getfield        #52  <Field int[] h>
	//   41   62:aastore         
	//   42   63:dup             
	//   43   64:bipush          8
	//   44   66:aload_0         
	//   45   67:getfield        #54  <Field byte[][] i>
	//   46   70:aastore         
	//   47   71:dup             
	//   48   72:bipush          9
	//   49   74:aload_0         
	//   50   75:getfield        #56  <Field ExperimentTokens[] j>
	//   51   78:aastore         
	//   52   79:dup             
	//   53   80:bipush          10
	//   54   82:aload_0         
	//   55   83:getfield        #58  <Field boolean k>
	//   56   86:invokestatic    #92  <Method Boolean Boolean.valueOf(boolean)>
	//   57   89:aastore         
	//   58   90:invokestatic    #95  <Method int ak.a(Object[])>
	//   59   93:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("LogEventParcelable[");
	//    0    0:new             #99  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #101 <String "LogEventParcelable[">
	//    3    6:invokespecial   #104 <Method void StringBuilder(String)>
	//    4    9:astore_2        
		stringbuilder.append(((Object) (a)));
	//    5   10:aload_2         
	//    6   11:aload_0         
	//    7   12:getfield        #40  <Field zzr a>
	//    8   15:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//    9   18:pop             
		stringbuilder.append(", LogEventBytes: ");
	//   10   19:aload_2         
	//   11   20:ldc1            #110 <String ", LogEventBytes: ">
	//   12   22:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		Object obj = ((Object) (b));
	//   14   26:aload_0         
	//   15   27:getfield        #61  <Field byte[] b>
	//   16   30:astore_1        
		if(obj == null)
	//*  17   31:aload_1         
	//*  18   32:ifnonnull       40
			obj = null;
	//   19   35:aconst_null     
	//   20   36:astore_1        
		else
	//*  21   37:goto            49
			obj = ((Object) (new String(((byte []) (obj)))));
	//   22   40:new             #115 <Class String>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokespecial   #118 <Method void String(byte[])>
	//   26   48:astore_1        
		stringbuilder.append(((String) (obj)));
	//   27   49:aload_2         
	//   28   50:aload_1         
	//   29   51:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
		stringbuilder.append(", TestCodes: ");
	//   31   55:aload_2         
	//   32   56:ldc1            #120 <String ", TestCodes: ">
	//   33   58:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
		stringbuilder.append(Arrays.toString(f));
	//   35   62:aload_2         
	//   36   63:aload_0         
	//   37   64:getfield        #48  <Field int[] f>
	//   38   67:invokestatic    #123 <Method String Arrays.toString(int[])>
	//   39   70:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   40   73:pop             
		stringbuilder.append(", MendelPackages: ");
	//   41   74:aload_2         
	//   42   75:ldc1            #125 <String ", MendelPackages: ">
	//   43   77:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   44   80:pop             
		stringbuilder.append(Arrays.toString(((Object []) (g))));
	//   45   81:aload_2         
	//   46   82:aload_0         
	//   47   83:getfield        #50  <Field String[] g>
	//   48   86:invokestatic    #128 <Method String Arrays.toString(Object[])>
	//   49   89:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
		stringbuilder.append(", LogEvent: ");
	//   51   93:aload_2         
	//   52   94:ldc1            #130 <String ", LogEvent: ">
	//   53   96:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   54   99:pop             
		stringbuilder.append(((Object) (c)));
	//   55  100:aload_2         
	//   56  101:aload_0         
	//   57  102:getfield        #42  <Field js c>
	//   58  105:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   59  108:pop             
		stringbuilder.append(", ExtensionProducer: ");
	//   60  109:aload_2         
	//   61  110:ldc1            #132 <String ", ExtensionProducer: ">
	//   62  112:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   63  115:pop             
		stringbuilder.append(((Object) (d)));
	//   64  116:aload_2         
	//   65  117:aload_0         
	//   66  118:getfield        #44  <Field d d>
	//   67  121:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   68  124:pop             
		stringbuilder.append(", VeProducer: ");
	//   69  125:aload_2         
	//   70  126:ldc1            #134 <String ", VeProducer: ">
	//   71  128:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   72  131:pop             
		stringbuilder.append(((Object) (e)));
	//   73  132:aload_2         
	//   74  133:aload_0         
	//   75  134:getfield        #46  <Field d e>
	//   76  137:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   77  140:pop             
		stringbuilder.append(", ExperimentIDs: ");
	//   78  141:aload_2         
	//   79  142:ldc1            #136 <String ", ExperimentIDs: ">
	//   80  144:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   81  147:pop             
		stringbuilder.append(Arrays.toString(h));
	//   82  148:aload_2         
	//   83  149:aload_0         
	//   84  150:getfield        #52  <Field int[] h>
	//   85  153:invokestatic    #123 <Method String Arrays.toString(int[])>
	//   86  156:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   87  159:pop             
		stringbuilder.append(", ExperimentTokens: ");
	//   88  160:aload_2         
	//   89  161:ldc1            #138 <String ", ExperimentTokens: ">
	//   90  163:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   91  166:pop             
		stringbuilder.append(Arrays.toString(((Object []) (i))));
	//   92  167:aload_2         
	//   93  168:aload_0         
	//   94  169:getfield        #54  <Field byte[][] i>
	//   95  172:invokestatic    #128 <Method String Arrays.toString(Object[])>
	//   96  175:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   97  178:pop             
		stringbuilder.append(", ExperimentTokensParcelables: ");
	//   98  179:aload_2         
	//   99  180:ldc1            #140 <String ", ExperimentTokensParcelables: ">
	//  100  182:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  101  185:pop             
		stringbuilder.append(Arrays.toString(((Object []) (j))));
	//  102  186:aload_2         
	//  103  187:aload_0         
	//  104  188:getfield        #56  <Field ExperimentTokens[] j>
	//  105  191:invokestatic    #128 <Method String Arrays.toString(Object[])>
	//  106  194:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  107  197:pop             
		stringbuilder.append(", AddPhenotypeExperimentTokens: ");
	//  108  198:aload_2         
	//  109  199:ldc1            #142 <String ", AddPhenotypeExperimentTokens: ">
	//  110  201:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  111  204:pop             
		stringbuilder.append(k);
	//  112  205:aload_2         
	//  113  206:aload_0         
	//  114  207:getfield        #58  <Field boolean k>
	//  115  210:invokevirtual   #145 <Method StringBuilder StringBuilder.append(boolean)>
	//  116  213:pop             
		stringbuilder.append("]");
	//  117  214:aload_2         
	//  118  215:ldc1            #147 <String "]">
	//  119  217:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  120  220:pop             
		return stringbuilder.toString();
	//  121  221:aload_2         
	//  122  222:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  123  225:areturn         
	}

	public final void writeToParcel(Parcel parcel, int l)
	{
		int i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (a)), l, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field zzr a>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #159 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b, false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #61  <Field byte[] b>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #162 <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, f, false);
	//   16   26:aload_1         
	//   17   27:iconst_4        
	//   18   28:aload_0         
	//   19   29:getfield        #48  <Field int[] f>
	//   20   32:iconst_0        
	//   21   33:invokestatic    #165 <Method void c.a(Parcel, int, int[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, g, false);
	//   22   36:aload_1         
	//   23   37:iconst_5        
	//   24   38:aload_0         
	//   25   39:getfield        #50  <Field String[] g>
	//   26   42:iconst_0        
	//   27   43:invokestatic    #168 <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, h, false);
	//   28   46:aload_1         
	//   29   47:bipush          6
	//   30   49:aload_0         
	//   31   50:getfield        #52  <Field int[] h>
	//   32   53:iconst_0        
	//   33   54:invokestatic    #165 <Method void c.a(Parcel, int, int[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, i, false);
	//   34   57:aload_1         
	//   35   58:bipush          7
	//   36   60:aload_0         
	//   37   61:getfield        #54  <Field byte[][] i>
	//   38   64:iconst_0        
	//   39   65:invokestatic    #171 <Method void c.a(Parcel, int, byte[][], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, k);
	//   40   68:aload_1         
	//   41   69:bipush          8
	//   42   71:aload_0         
	//   43   72:getfield        #58  <Field boolean k>
	//   44   75:invokestatic    #174 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, ((android.os.Parcelable []) (j)), l, false);
	//   45   78:aload_1         
	//   46   79:bipush          9
	//   47   81:aload_0         
	//   48   82:getfield        #56  <Field ExperimentTokens[] j>
	//   49   85:iload_2         
	//   50   86:iconst_0        
	//   51   87:invokestatic    #177 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   52   90:aload_1         
	//   53   91:iload_3         
	//   54   92:invokestatic    #179 <Method void c.a(Parcel, int)>
	//   55   95:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new i();
	public zzr a;
	public byte b[];
	public final js c;
	public final d d;
	public final d e;
	private int f[];
	private String g[];
	private int h[];
	private byte i[][];
	private ExperimentTokens j[];
	private boolean k;

	static 
	{
	//    0    0:new             #30  <Class i>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void i()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
