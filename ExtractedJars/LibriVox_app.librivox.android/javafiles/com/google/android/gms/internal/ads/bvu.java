// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwb, zzzs, zzvv

public final class bvu
{

	public bvu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		a = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #40  <Long -1L>
	//    4    8:putfield        #43  <Field long a>
		b = new Bundle();
	//    5   11:aload_0         
	//    6   12:new             #45  <Class Bundle>
	//    7   15:dup             
	//    8   16:invokespecial   #46  <Method void Bundle()>
	//    9   19:putfield        #48  <Field Bundle b>
		c = -1;
	//   10   22:aload_0         
	//   11   23:iconst_m1       
	//   12   24:putfield        #50  <Field int c>
		d = ((List) (new ArrayList()));
	//   13   27:aload_0         
	//   14   28:new             #52  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #53  <Method void ArrayList()>
	//   17   35:putfield        #55  <Field List d>
		e = false;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #57  <Field boolean e>
		f = -1;
	//   21   43:aload_0         
	//   22   44:iconst_m1       
	//   23   45:putfield        #59  <Field int f>
		g = false;
	//   24   48:aload_0         
	//   25   49:iconst_0        
	//   26   50:putfield        #61  <Field boolean g>
		h = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #63  <Field String h>
		i = null;
	//   30   58:aload_0         
	//   31   59:aconst_null     
	//   32   60:putfield        #65  <Field zzzs i>
		j = null;
	//   33   63:aload_0         
	//   34   64:aconst_null     
	//   35   65:putfield        #67  <Field Location j>
		k = null;
	//   36   68:aload_0         
	//   37   69:aconst_null     
	//   38   70:putfield        #69  <Field String k>
		l = new Bundle();
	//   39   73:aload_0         
	//   40   74:new             #45  <Class Bundle>
	//   41   77:dup             
	//   42   78:invokespecial   #46  <Method void Bundle()>
	//   43   81:putfield        #71  <Field Bundle l>
		m = new Bundle();
	//   44   84:aload_0         
	//   45   85:new             #45  <Class Bundle>
	//   46   88:dup             
	//   47   89:invokespecial   #46  <Method void Bundle()>
	//   48   92:putfield        #73  <Field Bundle m>
		n = ((List) (new ArrayList()));
	//   49   95:aload_0         
	//   50   96:new             #52  <Class ArrayList>
	//   51   99:dup             
	//   52  100:invokespecial   #53  <Method void ArrayList()>
	//   53  103:putfield        #75  <Field List n>
		o = null;
	//   54  106:aload_0         
	//   55  107:aconst_null     
	//   56  108:putfield        #77  <Field String o>
		p = null;
	//   57  111:aload_0         
	//   58  112:aconst_null     
	//   59  113:putfield        #79  <Field String p>
		q = false;
	//   60  116:aload_0         
	//   61  117:iconst_0        
	//   62  118:putfield        #81  <Field boolean q>
		s = -1;
	//   63  121:aload_0         
	//   64  122:iconst_m1       
	//   65  123:putfield        #83  <Field int s>
		t = null;
	//   66  126:aload_0         
	//   67  127:aconst_null     
	//   68  128:putfield        #85  <Field String t>
	//   69  131:return          
	}

	public bvu(zzwb zzwb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		a = zzwb1.b;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #91  <Field long zzwb.b>
	//    5    9:putfield        #43  <Field long a>
		b = zzwb1.c;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #93  <Field Bundle zzwb.c>
	//    9   17:putfield        #48  <Field Bundle b>
		c = zzwb1.d;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #95  <Field int zzwb.d>
	//   13   25:putfield        #50  <Field int c>
		d = zzwb1.e;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #97  <Field List zzwb.e>
	//   17   33:putfield        #55  <Field List d>
		e = zzwb1.f;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #99  <Field boolean zzwb.f>
	//   21   41:putfield        #57  <Field boolean e>
		f = zzwb1.g;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #101 <Field int zzwb.g>
	//   25   49:putfield        #59  <Field int f>
		g = zzwb1.h;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #103 <Field boolean zzwb.h>
	//   29   57:putfield        #61  <Field boolean g>
		h = zzwb1.i;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #105 <Field String zzwb.i>
	//   33   65:putfield        #63  <Field String h>
		i = zzwb1.j;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #107 <Field zzzs zzwb.j>
	//   37   73:putfield        #65  <Field zzzs i>
		j = zzwb1.k;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #109 <Field Location zzwb.k>
	//   41   81:putfield        #67  <Field Location j>
		k = zzwb1.l;
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:getfield        #111 <Field String zzwb.l>
	//   45   89:putfield        #69  <Field String k>
		l = zzwb1.m;
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:getfield        #112 <Field Bundle zzwb.m>
	//   49   97:putfield        #71  <Field Bundle l>
		m = zzwb1.n;
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:getfield        #114 <Field Bundle zzwb.n>
	//   53  105:putfield        #73  <Field Bundle m>
		n = zzwb1.o;
	//   54  108:aload_0         
	//   55  109:aload_1         
	//   56  110:getfield        #116 <Field List zzwb.o>
	//   57  113:putfield        #75  <Field List n>
		o = zzwb1.p;
	//   58  116:aload_0         
	//   59  117:aload_1         
	//   60  118:getfield        #117 <Field String zzwb.p>
	//   61  121:putfield        #77  <Field String o>
		p = zzwb1.q;
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:getfield        #119 <Field String zzwb.q>
	//   65  129:putfield        #79  <Field String p>
		q = zzwb1.r;
	//   66  132:aload_0         
	//   67  133:aload_1         
	//   68  134:getfield        #121 <Field boolean zzwb.r>
	//   69  137:putfield        #81  <Field boolean q>
		r = zzwb1.s;
	//   70  140:aload_0         
	//   71  141:aload_1         
	//   72  142:getfield        #123 <Field zzvv zzwb.s>
	//   73  145:putfield        #125 <Field zzvv r>
		s = zzwb1.t;
	//   74  148:aload_0         
	//   75  149:aload_1         
	//   76  150:getfield        #127 <Field int zzwb.t>
	//   77  153:putfield        #83  <Field int s>
		t = zzwb1.u;
	//   78  156:aload_0         
	//   79  157:aload_1         
	//   80  158:getfield        #130 <Field String zzwb.u>
	//   81  161:putfield        #85  <Field String t>
	//   82  164:return          
	}

	public final bvu a(Location location)
	{
		j = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #67  <Field Location j>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzwb a()
	{
		return new zzwb(8, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
	//    0    0:new             #89  <Class zzwb>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:aload_0         
	//    4    7:getfield        #43  <Field long a>
	//    5   10:aload_0         
	//    6   11:getfield        #48  <Field Bundle b>
	//    7   14:aload_0         
	//    8   15:getfield        #50  <Field int c>
	//    9   18:aload_0         
	//   10   19:getfield        #55  <Field List d>
	//   11   22:aload_0         
	//   12   23:getfield        #57  <Field boolean e>
	//   13   26:aload_0         
	//   14   27:getfield        #59  <Field int f>
	//   15   30:aload_0         
	//   16   31:getfield        #61  <Field boolean g>
	//   17   34:aload_0         
	//   18   35:getfield        #63  <Field String h>
	//   19   38:aload_0         
	//   20   39:getfield        #65  <Field zzzs i>
	//   21   42:aload_0         
	//   22   43:getfield        #67  <Field Location j>
	//   23   46:aload_0         
	//   24   47:getfield        #69  <Field String k>
	//   25   50:aload_0         
	//   26   51:getfield        #71  <Field Bundle l>
	//   27   54:aload_0         
	//   28   55:getfield        #73  <Field Bundle m>
	//   29   58:aload_0         
	//   30   59:getfield        #75  <Field List n>
	//   31   62:aload_0         
	//   32   63:getfield        #77  <Field String o>
	//   33   66:aload_0         
	//   34   67:getfield        #79  <Field String p>
	//   35   70:aload_0         
	//   36   71:getfield        #81  <Field boolean q>
	//   37   74:aload_0         
	//   38   75:getfield        #125 <Field zzvv r>
	//   39   78:aload_0         
	//   40   79:getfield        #83  <Field int s>
	//   41   82:aload_0         
	//   42   83:getfield        #85  <Field String t>
	//   43   86:invokespecial   #135 <Method void zzwb(int, long, Bundle, int, List, boolean, int, boolean, String, zzzs, Location, String, Bundle, Bundle, List, String, String, boolean, zzvv, int, String)>
	//   44   89:areturn         
	}

	private long a;
	private Bundle b;
	private int c;
	private List d;
	private boolean e;
	private int f;
	private boolean g;
	private String h;
	private zzzs i;
	private Location j;
	private String k;
	private Bundle l;
	private Bundle m;
	private List n;
	private String o;
	private String p;
	private boolean q;
	private zzvv r;
	private int s;
	private String t;
}
