// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjj, zzmq

public final class zzjk
{

	public zzjk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		zzaqm = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #37  <Long -1L>
	//    4    8:putfield        #40  <Field long zzaqm>
		mExtras = new Bundle();
	//    5   11:aload_0         
	//    6   12:new             #42  <Class Bundle>
	//    7   15:dup             
	//    8   16:invokespecial   #43  <Method void Bundle()>
	//    9   19:putfield        #45  <Field Bundle mExtras>
		zzaqn = -1;
	//   10   22:aload_0         
	//   11   23:iconst_m1       
	//   12   24:putfield        #47  <Field int zzaqn>
		zzaqo = ((List) (new ArrayList()));
	//   13   27:aload_0         
	//   14   28:new             #49  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #50  <Method void ArrayList()>
	//   17   35:putfield        #52  <Field List zzaqo>
		zzaqp = false;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #54  <Field boolean zzaqp>
		zzaqq = -1;
	//   21   43:aload_0         
	//   22   44:iconst_m1       
	//   23   45:putfield        #56  <Field int zzaqq>
		zzvm = false;
	//   24   48:aload_0         
	//   25   49:iconst_0        
	//   26   50:putfield        #58  <Field boolean zzvm>
		zzaqr = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #60  <Field String zzaqr>
		zzaqs = null;
	//   30   58:aload_0         
	//   31   59:aconst_null     
	//   32   60:putfield        #62  <Field zzmq zzaqs>
		zzhp = null;
	//   33   63:aload_0         
	//   34   64:aconst_null     
	//   35   65:putfield        #64  <Field Location zzhp>
		zzaqt = null;
	//   36   68:aload_0         
	//   37   69:aconst_null     
	//   38   70:putfield        #66  <Field String zzaqt>
		zzaqu = new Bundle();
	//   39   73:aload_0         
	//   40   74:new             #42  <Class Bundle>
	//   41   77:dup             
	//   42   78:invokespecial   #43  <Method void Bundle()>
	//   43   81:putfield        #68  <Field Bundle zzaqu>
		zzaqv = new Bundle();
	//   44   84:aload_0         
	//   45   85:new             #42  <Class Bundle>
	//   46   88:dup             
	//   47   89:invokespecial   #43  <Method void Bundle()>
	//   48   92:putfield        #70  <Field Bundle zzaqv>
		zzaqw = ((List) (new ArrayList()));
	//   49   95:aload_0         
	//   50   96:new             #49  <Class ArrayList>
	//   51   99:dup             
	//   52  100:invokespecial   #50  <Method void ArrayList()>
	//   53  103:putfield        #72  <Field List zzaqw>
		zzaqx = null;
	//   54  106:aload_0         
	//   55  107:aconst_null     
	//   56  108:putfield        #74  <Field String zzaqx>
		zzaqy = null;
	//   57  111:aload_0         
	//   58  112:aconst_null     
	//   59  113:putfield        #76  <Field String zzaqy>
		zzaqz = false;
	//   60  116:aload_0         
	//   61  117:iconst_0        
	//   62  118:putfield        #78  <Field boolean zzaqz>
	//   63  121:return          
	}

	public zzjk(zzjj zzjj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		zzaqm = zzjj1.zzapw;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #85  <Field long zzjj.zzapw>
	//    5    9:putfield        #40  <Field long zzaqm>
		mExtras = zzjj1.extras;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #88  <Field Bundle zzjj.extras>
	//    9   17:putfield        #45  <Field Bundle mExtras>
		zzaqn = zzjj1.zzapx;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #91  <Field int zzjj.zzapx>
	//   13   25:putfield        #47  <Field int zzaqn>
		zzaqo = zzjj1.zzapy;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #94  <Field List zzjj.zzapy>
	//   17   33:putfield        #52  <Field List zzaqo>
		zzaqp = zzjj1.zzapz;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #97  <Field boolean zzjj.zzapz>
	//   21   41:putfield        #54  <Field boolean zzaqp>
		zzaqq = zzjj1.zzaqa;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #100 <Field int zzjj.zzaqa>
	//   25   49:putfield        #56  <Field int zzaqq>
		zzvm = zzjj1.zzaqb;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #103 <Field boolean zzjj.zzaqb>
	//   29   57:putfield        #58  <Field boolean zzvm>
		zzaqr = zzjj1.zzaqc;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #106 <Field String zzjj.zzaqc>
	//   33   65:putfield        #60  <Field String zzaqr>
		zzaqs = zzjj1.zzaqd;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #109 <Field zzmq zzjj.zzaqd>
	//   37   73:putfield        #62  <Field zzmq zzaqs>
		zzhp = zzjj1.zzaqe;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #112 <Field Location zzjj.zzaqe>
	//   41   81:putfield        #64  <Field Location zzhp>
		zzaqt = zzjj1.zzaqf;
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:getfield        #115 <Field String zzjj.zzaqf>
	//   45   89:putfield        #66  <Field String zzaqt>
		zzaqu = zzjj1.zzaqg;
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:getfield        #118 <Field Bundle zzjj.zzaqg>
	//   49   97:putfield        #68  <Field Bundle zzaqu>
		zzaqv = zzjj1.zzaqh;
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:getfield        #121 <Field Bundle zzjj.zzaqh>
	//   53  105:putfield        #70  <Field Bundle zzaqv>
		zzaqw = zzjj1.zzaqi;
	//   54  108:aload_0         
	//   55  109:aload_1         
	//   56  110:getfield        #124 <Field List zzjj.zzaqi>
	//   57  113:putfield        #72  <Field List zzaqw>
		zzaqx = zzjj1.zzaqj;
	//   58  116:aload_0         
	//   59  117:aload_1         
	//   60  118:getfield        #127 <Field String zzjj.zzaqj>
	//   61  121:putfield        #74  <Field String zzaqx>
		zzaqy = zzjj1.zzaqk;
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:getfield        #130 <Field String zzjj.zzaqk>
	//   65  129:putfield        #76  <Field String zzaqy>
	//   66  132:return          
	}

	public final zzjk zza(Location location)
	{
		zzhp = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #64  <Field Location zzhp>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzjj zzhw()
	{
		return new zzjj(7, zzaqm, mExtras, zzaqn, zzaqo, zzaqp, zzaqq, zzvm, zzaqr, zzaqs, zzhp, zzaqt, zzaqu, zzaqv, zzaqw, zzaqx, zzaqy, false);
	//    0    0:new             #82  <Class zzjj>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:aload_0         
	//    4    7:getfield        #40  <Field long zzaqm>
	//    5   10:aload_0         
	//    6   11:getfield        #45  <Field Bundle mExtras>
	//    7   14:aload_0         
	//    8   15:getfield        #47  <Field int zzaqn>
	//    9   18:aload_0         
	//   10   19:getfield        #52  <Field List zzaqo>
	//   11   22:aload_0         
	//   12   23:getfield        #54  <Field boolean zzaqp>
	//   13   26:aload_0         
	//   14   27:getfield        #56  <Field int zzaqq>
	//   15   30:aload_0         
	//   16   31:getfield        #58  <Field boolean zzvm>
	//   17   34:aload_0         
	//   18   35:getfield        #60  <Field String zzaqr>
	//   19   38:aload_0         
	//   20   39:getfield        #62  <Field zzmq zzaqs>
	//   21   42:aload_0         
	//   22   43:getfield        #64  <Field Location zzhp>
	//   23   46:aload_0         
	//   24   47:getfield        #66  <Field String zzaqt>
	//   25   50:aload_0         
	//   26   51:getfield        #68  <Field Bundle zzaqu>
	//   27   54:aload_0         
	//   28   55:getfield        #70  <Field Bundle zzaqv>
	//   29   58:aload_0         
	//   30   59:getfield        #72  <Field List zzaqw>
	//   31   62:aload_0         
	//   32   63:getfield        #74  <Field String zzaqx>
	//   33   66:aload_0         
	//   34   67:getfield        #76  <Field String zzaqy>
	//   35   70:iconst_0        
	//   36   71:invokespecial   #139 <Method void zzjj(int, long, Bundle, int, List, boolean, int, boolean, String, zzmq, Location, String, Bundle, Bundle, List, String, String, boolean)>
	//   37   74:areturn         
	}

	private Bundle mExtras;
	private long zzaqm;
	private int zzaqn;
	private List zzaqo;
	private boolean zzaqp;
	private int zzaqq;
	private String zzaqr;
	private zzmq zzaqs;
	private String zzaqt;
	private Bundle zzaqu;
	private Bundle zzaqv;
	private List zzaqw;
	private String zzaqx;
	private String zzaqy;
	private boolean zzaqz;
	private Location zzhp;
	private boolean zzvm;
}
