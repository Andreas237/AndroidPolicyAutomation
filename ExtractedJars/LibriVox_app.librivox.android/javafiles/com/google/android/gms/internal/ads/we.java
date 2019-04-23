// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzasi, zzwb, zn, bse, 
//			zzasm, jw, zzwf, bsm

public final class we
{

	public we(zzasi zzasi1, zzasm zzasm, jw jw, zzwf zzwf, int k, long l, 
			long l1, JSONObject jsonobject, bse bse1, Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a = zzasi1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field zzasi a>
		b = zzasm;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field zzasm b>
		c = jw;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field jw c>
		d = zzwf;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #37  <Field zzwf d>
		e = k;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #39  <Field int e>
		f = l;
	//   17   31:aload_0         
	//   18   32:lload           6
	//   19   34:putfield        #41  <Field long f>
		g = l1;
	//   20   37:aload_0         
	//   21   38:lload           8
	//   22   40:putfield        #43  <Field long g>
		h = jsonobject;
	//   23   43:aload_0         
	//   24   44:aload           10
	//   25   46:putfield        #45  <Field JSONObject h>
		i = bse1;
	//   26   49:aload_0         
	//   27   50:aload           11
	//   28   52:putfield        #47  <Field bse i>
		if(boolean1 != null)
	//*  29   55:aload           12
	//*  30   57:ifnull          70
		{
			j = boolean1.booleanValue();
	//   31   60:aload_0         
	//   32   61:aload           12
	//   33   63:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//   34   66:putfield        #55  <Field boolean j>
			return;
	//   35   69:return          
		} else
		{
			j = zn.a(zzasi1.c.m);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:getfield        #60  <Field zzwb zzasi.c>
	//   39   75:getfield        #66  <Field android.os.Bundle zzwb.m>
	//   40   78:invokestatic    #71  <Method boolean zn.a(android.os.Bundle)>
	//   41   81:putfield        #55  <Field boolean j>
			return;
	//   42   84:return          
		}
	}

	public we(zzasi zzasi1, zzasm zzasm, jw jw, zzwf zzwf, int k, long l, 
			long l1, JSONObject jsonobject, bsm bsm)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a = zzasi1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field zzasi a>
		b = zzasm;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field zzasm b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #35  <Field jw c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #37  <Field zzwf d>
		e = k;
	//   14   24:aload_0         
	//   15   25:iload           5
	//   16   27:putfield        #39  <Field int e>
		f = l;
	//   17   30:aload_0         
	//   18   31:lload           6
	//   19   33:putfield        #41  <Field long f>
		g = l1;
	//   20   36:aload_0         
	//   21   37:lload           8
	//   22   39:putfield        #43  <Field long g>
		h = null;
	//   23   42:aload_0         
	//   24   43:aconst_null     
	//   25   44:putfield        #45  <Field JSONObject h>
		i = new bse(bsm);
	//   26   47:aload_0         
	//   27   48:new             #75  <Class bse>
	//   28   51:dup             
	//   29   52:aload           11
	//   30   54:invokespecial   #78  <Method void bse(bsm)>
	//   31   57:putfield        #47  <Field bse i>
		j = false;
	//   32   60:aload_0         
	//   33   61:iconst_0        
	//   34   62:putfield        #55  <Field boolean j>
	//   35   65:return          
	}

	public final zzasi a;
	public final zzasm b;
	public final jw c;
	public final zzwf d;
	public final int e;
	public final long f;
	public final long g;
	public final JSONObject h;
	public final bse i;
	public final boolean j;
}
