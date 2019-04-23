// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.q;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzacp

public final class lo
	implements j
{

	public lo(Date date, int i1, Set set, Location location, boolean flag, int j1, zzacp zzacp1, 
			List list, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = date;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field Date a>
		b = i1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int b>
		c = set;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field Set c>
		e = location;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #38  <Field Location e>
		d = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #40  <Field boolean d>
		f = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #42  <Field int f>
		g = zzacp1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #44  <Field zzacp g>
		i = flag1;
	//   23   43:aload_0         
	//   24   44:iload           9
	//   25   46:putfield        #46  <Field boolean i>
	//   26   49:aload_0         
	//   27   50:new             #48  <Class ArrayList>
	//   28   53:dup             
	//   29   54:invokespecial   #49  <Method void ArrayList()>
	//   30   57:putfield        #51  <Field List h>
	//   31   60:aload_0         
	//   32   61:new             #53  <Class HashMap>
	//   33   64:dup             
	//   34   65:invokespecial   #54  <Method void HashMap()>
	//   35   68:putfield        #56  <Field Map j>
		if(list != null)
	//*  36   71:aload           8
	//*  37   73:ifnull          202
		{
			date = ((Date) (list.iterator()));
	//   38   76:aload           8
	//   39   78:invokeinterface #62  <Method Iterator List.iterator()>
	//   40   83:astore_1        
			do
			{
				if(!((Iterator) (date)).hasNext())
					break;
	//   41   84:aload_1         
	//   42   85:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   43   90:ifeq            202
				set = ((Set) ((String)((Iterator) (date)).next()));
	//   44   93:aload_1         
	//   45   94:invokeinterface #72  <Method Object Iterator.next()>
	//   46   99:checkcast       #74  <Class String>
	//   47  102:astore_3        
				if(((String) (set)).startsWith("custom:"))
	//*  48  103:aload_3         
	//*  49  104:ldc1            #76  <String "custom:">
	//*  50  106:invokevirtual   #80  <Method boolean String.startsWith(String)>
	//*  51  109:ifeq            188
				{
					set = ((Set) (((String) (set)).split(":", 3)));
	//   52  112:aload_3         
	//   53  113:ldc1            #82  <String ":">
	//   54  115:iconst_3        
	//   55  116:invokevirtual   #86  <Method String[] String.split(String, int)>
	//   56  119:astore_3        
					if(set.length == 3)
	//*  57  120:aload_3         
	//*  58  121:arraylength     
	//*  59  122:iconst_3        
	//*  60  123:icmpne          84
						if("true".equals(((Object) (set[2]))))
	//*  61  126:ldc1            #88  <String "true">
	//*  62  128:aload_3         
	//*  63  129:iconst_2        
	//*  64  130:aaload          
	//*  65  131:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  66  134:ifeq            157
							j.put(((Object) (set[1])), ((Object) (Boolean.valueOf(true))));
	//   67  137:aload_0         
	//   68  138:getfield        #56  <Field Map j>
	//   69  141:aload_3         
	//   70  142:iconst_1        
	//   71  143:aaload          
	//   72  144:iconst_1        
	//   73  145:invokestatic    #98  <Method Boolean Boolean.valueOf(boolean)>
	//   74  148:invokeinterface #104 <Method Object Map.put(Object, Object)>
	//   75  153:pop             
						else
	//*  76  154:goto            84
						if("false".equals(((Object) (set[2]))))
	//*  77  157:ldc1            #106 <String "false">
	//*  78  159:aload_3         
	//*  79  160:iconst_2        
	//*  80  161:aaload          
	//*  81  162:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  82  165:ifeq            84
							j.put(((Object) (set[1])), ((Object) (Boolean.valueOf(false))));
	//   83  168:aload_0         
	//   84  169:getfield        #56  <Field Map j>
	//   85  172:aload_3         
	//   86  173:iconst_1        
	//   87  174:aaload          
	//   88  175:iconst_0        
	//   89  176:invokestatic    #98  <Method Boolean Boolean.valueOf(boolean)>
	//   90  179:invokeinterface #104 <Method Object Map.put(Object, Object)>
	//   91  184:pop             
				} else
	//*  92  185:goto            84
				{
					h.add(((Object) (set)));
	//   93  188:aload_0         
	//   94  189:getfield        #51  <Field List h>
	//   95  192:aload_3         
	//   96  193:invokeinterface #109 <Method boolean List.add(Object)>
	//   97  198:pop             
				}
			} while(true);
	//   98  199:goto            84
		}
	//   99  202:return          
	}

	public final Date a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Date a>
	//    2    4:areturn         
	}

	public final int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int b>
	//    2    4:ireturn         
	}

	public final Set c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Set c>
	//    2    4:areturn         
	}

	public final Location d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Location e>
	//    2    4:areturn         
	}

	public final int e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int f>
	//    2    4:ireturn         
	}

	public final boolean f()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean d>
	//    2    4:ireturn         
	}

	public final boolean g()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean i>
	//    2    4:ireturn         
	}

	public final e h()
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field zzacp g>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		f f1 = (new f()).a(g.b).a(g.c).b(g.d);
	//    5    9:new             #119 <Class f>
	//    6   12:dup             
	//    7   13:invokespecial   #120 <Method void f()>
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field zzacp g>
	//   10   20:getfield        #124 <Field boolean zzacp.b>
	//   11   23:invokevirtual   #127 <Method f f.a(boolean)>
	//   12   26:aload_0         
	//   13   27:getfield        #44  <Field zzacp g>
	//   14   30:getfield        #129 <Field int zzacp.c>
	//   15   33:invokevirtual   #132 <Method f f.a(int)>
	//   16   36:aload_0         
	//   17   37:getfield        #44  <Field zzacp g>
	//   18   40:getfield        #133 <Field boolean zzacp.d>
	//   19   43:invokevirtual   #135 <Method f f.b(boolean)>
	//   20   46:astore_1        
		if(g.a >= 2)
	//*  21   47:aload_0         
	//*  22   48:getfield        #44  <Field zzacp g>
	//*  23   51:getfield        #137 <Field int zzacp.a>
	//*  24   54:iconst_2        
	//*  25   55:icmplt          70
			f1.b(g.e);
	//   26   58:aload_1         
	//   27   59:aload_0         
	//   28   60:getfield        #44  <Field zzacp g>
	//   29   63:getfield        #139 <Field int com.google.android.gms.internal.ads.zzacp.e>
	//   30   66:invokevirtual   #141 <Method f f.b(int)>
	//   31   69:pop             
		if(g.a >= 3 && g.f != null)
	//*  32   70:aload_0         
	//*  33   71:getfield        #44  <Field zzacp g>
	//*  34   74:getfield        #137 <Field int zzacp.a>
	//*  35   77:iconst_3        
	//*  36   78:icmplt          110
	//*  37   81:aload_0         
	//*  38   82:getfield        #44  <Field zzacp g>
	//*  39   85:getfield        #144 <Field zzzw com.google.android.gms.internal.ads.zzacp.f>
	//*  40   88:ifnull          110
			f1.a(new q(g.f));
	//   41   91:aload_1         
	//   42   92:new             #146 <Class q>
	//   43   95:dup             
	//   44   96:aload_0         
	//   45   97:getfield        #44  <Field zzacp g>
	//   46  100:getfield        #144 <Field zzzw com.google.android.gms.internal.ads.zzacp.f>
	//   47  103:invokespecial   #149 <Method void q(zzzw)>
	//   48  106:invokevirtual   #152 <Method f f.a(q)>
	//   49  109:pop             
		return f1.a();
	//   50  110:aload_1         
	//   51  111:invokevirtual   #154 <Method e f.a()>
	//   52  114:areturn         
	}

	public final boolean i()
	{
		List list = h;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List h>
	//    2    4:astore_1        
		return list != null && (list.contains("2") || h.contains("6"));
	//    3    5:aload_1         
	//    4    6:ifnull          36
	//    5    9:aload_1         
	//    6   10:ldc1            #156 <String "2">
	//    7   12:invokeinterface #159 <Method boolean List.contains(Object)>
	//    8   17:ifne            34
	//    9   20:aload_0         
	//   10   21:getfield        #51  <Field List h>
	//   11   24:ldc1            #161 <String "6">
	//   12   26:invokeinterface #159 <Method boolean List.contains(Object)>
	//   13   31:ifeq            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	public final boolean j()
	{
		List list = h;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List h>
	//    2    4:astore_1        
		return list != null && list.contains("6");
	//    3    5:aload_1         
	//    4    6:ifnull          22
	//    5    9:aload_1         
	//    6   10:ldc1            #161 <String "6">
	//    7   12:invokeinterface #159 <Method boolean List.contains(Object)>
	//    8   17:ifeq            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	public final boolean k()
	{
		List list = h;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List h>
	//    2    4:astore_1        
		return list != null && (list.contains("1") || h.contains("6"));
	//    3    5:aload_1         
	//    4    6:ifnull          36
	//    5    9:aload_1         
	//    6   10:ldc1            #164 <String "1">
	//    7   12:invokeinterface #159 <Method boolean List.contains(Object)>
	//    8   17:ifne            34
	//    9   20:aload_0         
	//   10   21:getfield        #51  <Field List h>
	//   11   24:ldc1            #161 <String "6">
	//   12   26:invokeinterface #159 <Method boolean List.contains(Object)>
	//   13   31:ifeq            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	public final boolean l()
	{
		List list = h;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List h>
	//    2    4:astore_1        
		return list != null && list.contains("3");
	//    3    5:aload_1         
	//    4    6:ifnull          22
	//    5    9:aload_1         
	//    6   10:ldc1            #167 <String "3">
	//    7   12:invokeinterface #159 <Method boolean List.contains(Object)>
	//    8   17:ifeq            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	public final Map m()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Map j>
	//    2    4:areturn         
	}

	private final Date a;
	private final int b;
	private final Set c;
	private final boolean d;
	private final Location e;
	private final int f;
	private final zzacp g;
	private final List h = new ArrayList();
	private final boolean i;
	private final Map j = new HashMap();
}
