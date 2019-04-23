// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ble, bln, bld, zzfs, 
//			blo, bks

public final class blh extends ble
{

	public blh(String s, long l, zzfs zzfs1, String s1, bln bln1, List list, 
			String s2, long l1)
	{
		super(s, -1L, zzfs1, s1, ((bli) (bln1)), list, ((blf) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #17  <Long -1L>
	//    3    5:aload           4
	//    4    7:aload           5
	//    5    9:aload           6
	//    6   11:aload           7
	//    7   13:aconst_null     
	//    8   14:invokespecial   #21  <Method void ble(String, long, zzfs, String, bli, List, blf)>
		e = Uri.parse(s1);
	//    9   17:aload_0         
	//   10   18:aload           5
	//   11   20:invokestatic    #27  <Method Uri Uri.parse(String)>
	//   12   23:putfield        #29  <Field Uri e>
		l = bln1.e;
	//   13   26:aload           6
	//   14   28:getfield        #33  <Field long bln.e>
	//   15   31:lstore_2        
		list = null;
	//   16   32:aconst_null     
	//   17   33:astore          7
		if(l <= 0L)
	//*  18   35:lload_2         
	//*  19   36:lconst_0        
	//*  20   37:lcmp            
	//*  21   38:ifgt            47
			s1 = null;
	//   22   41:aconst_null     
	//   23   42:astore          5
		else
	//*  24   44:goto            67
			s1 = ((String) (new bld(((String) (null)), bln1.d, bln1.e)));
	//   25   47:new             #35  <Class bld>
	//   26   50:dup             
	//   27   51:aconst_null     
	//   28   52:aload           6
	//   29   54:getfield        #38  <Field long bln.d>
	//   30   57:aload           6
	//   31   59:getfield        #33  <Field long bln.e>
	//   32   62:invokespecial   #41  <Method void bld(String, long, long)>
	//   33   65:astore          5
		h = ((bld) (s1));
	//   34   67:aload_0         
	//   35   68:aload           5
	//   36   70:putfield        #43  <Field bld h>
		if(s != null)
	//*  37   73:aload_1         
	//*  38   74:ifnull          152
		{
			zzfs1 = ((zzfs) (zzfs1.a));
	//   39   77:aload           4
	//   40   79:getfield        #48  <Field String zzfs.a>
	//   41   82:astore          4
			s1 = ((String) (new StringBuilder(String.valueOf(((Object) (s))).length() + 22 + String.valueOf(((Object) (zzfs1))).length())));
	//   42   84:new             #50  <Class StringBuilder>
	//   43   87:dup             
	//   44   88:aload_1         
	//   45   89:invokestatic    #56  <Method String String.valueOf(Object)>
	//   46   92:invokevirtual   #60  <Method int String.length()>
	//   47   95:bipush          22
	//   48   97:iadd            
	//   49   98:aload           4
	//   50  100:invokestatic    #56  <Method String String.valueOf(Object)>
	//   51  103:invokevirtual   #60  <Method int String.length()>
	//   52  106:iadd            
	//   53  107:invokespecial   #63  <Method void StringBuilder(int)>
	//   54  110:astore          5
			((StringBuilder) (s1)).append(s);
	//   55  112:aload           5
	//   56  114:aload_1         
	//   57  115:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   58  118:pop             
			((StringBuilder) (s1)).append(".");
	//   59  119:aload           5
	//   60  121:ldc1            #69  <String ".">
	//   61  123:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   62  126:pop             
			((StringBuilder) (s1)).append(((String) (zzfs1)));
	//   63  127:aload           5
	//   64  129:aload           4
	//   65  131:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   66  134:pop             
			((StringBuilder) (s1)).append(".-1");
	//   67  135:aload           5
	//   68  137:ldc1            #71  <String ".-1">
	//   69  139:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   70  142:pop             
			s = ((StringBuilder) (s1)).toString();
	//   71  143:aload           5
	//   72  145:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   73  148:astore_1        
		} else
	//*  74  149:goto            154
		{
			s = null;
	//   75  152:aconst_null     
	//   76  153:astore_1        
		}
		g = s;
	//   77  154:aload_0         
	//   78  155:aload_1         
	//   79  156:putfield        #77  <Field String g>
	//   80  159:aload_0         
	//   81  160:ldc2w           #17  <Long -1L>
	//   82  163:putfield        #79  <Field long f>
		if(h != null)
	//*  83  166:aload_0         
	//*  84  167:getfield        #43  <Field bld h>
	//*  85  170:ifnull          179
			s = ((String) (list));
	//   86  173:aload           7
	//   87  175:astore_1        
		else
	//*  88  176:goto            199
			s = ((String) (new blo(new bld(((String) (null)), 0L, -1L))));
	//   89  179:new             #81  <Class blo>
	//   90  182:dup             
	//   91  183:new             #35  <Class bld>
	//   92  186:dup             
	//   93  187:aconst_null     
	//   94  188:lconst_0        
	//   95  189:ldc2w           #17  <Long -1L>
	//   96  192:invokespecial   #41  <Method void bld(String, long, long)>
	//   97  195:invokespecial   #84  <Method void blo(bld)>
	//   98  198:astore_1        
		i = ((blo) (s));
	//   99  199:aload_0         
	//  100  200:aload_1         
	//  101  201:putfield        #86  <Field blo i>
	//  102  204:return          
	}

	public final bld d()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field bld h>
	//    2    4:areturn         
	}

	public final bks e()
	{
		return ((bks) (i));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field blo i>
	//    2    4:areturn         
	}

	public final String f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String g>
	//    2    4:areturn         
	}

	private final Uri e;
	private final long f = -1L;
	private final String g;
	private final bld h;
	private final blo i;
}
