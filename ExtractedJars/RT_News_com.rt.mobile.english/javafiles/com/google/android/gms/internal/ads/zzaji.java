// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaef, zzamm, zzhs, zzjn, 
//			zzwy, zzaej, zzhx

public final class zzaji
{

	public zzaji(zzaef zzaef1, zzaej zzaej, zzwy zzwy, zzjn zzjn, int i, long l, 
			long l1, JSONObject jsonobject, zzhs zzhs1, Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzcgs = zzaef1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field zzaef zzcgs>
		zzcos = zzaej;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field zzaej zzcos>
		zzcod = zzwy;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field zzwy zzcod>
		zzacv = zzjn;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #38  <Field zzjn zzacv>
		errorCode = i;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #40  <Field int errorCode>
		zzcoh = l;
	//   17   31:aload_0         
	//   18   32:lload           6
	//   19   34:putfield        #42  <Field long zzcoh>
		zzcoi = l1;
	//   20   37:aload_0         
	//   21   38:lload           8
	//   22   40:putfield        #44  <Field long zzcoi>
		zzcob = jsonobject;
	//   23   43:aload_0         
	//   24   44:aload           10
	//   25   46:putfield        #46  <Field JSONObject zzcob>
		zzcoq = zzhs1;
	//   26   49:aload_0         
	//   27   50:aload           11
	//   28   52:putfield        #48  <Field zzhs zzcoq>
		boolean flag;
		if(boolean1 != null)
	//*  29   55:aload           12
	//*  30   57:ifnull          74
			flag = boolean1.booleanValue();
	//   31   60:aload           12
	//   32   62:invokevirtual   #54  <Method boolean Boolean.booleanValue()>
	//   33   65:istore          13
		else
	//*  34   67:aload_0         
	//*  35   68:iload           13
	//*  36   70:putfield        #56  <Field boolean zzcor>
	//*  37   73:return          
		if(zzamm.zzo(zzaef1.zzccv))
	//*  38   74:aload_1         
	//*  39   75:getfield        #62  <Field zzjj zzaef.zzccv>
	//*  40   78:invokestatic    #68  <Method boolean zzamm.zzo(zzjj)>
	//*  41   81:ifeq            90
			flag = true;
	//   42   84:iconst_1        
	//   43   85:istore          13
		else
	//*  44   87:goto            67
			flag = false;
	//   45   90:iconst_0        
	//   46   91:istore          13
		zzcor = flag;
	//*  47   93:goto            67
	}

	public zzaji(zzaef zzaef1, zzaej zzaej, zzwy zzwy, zzjn zzjn, int i, long l, 
			long l1, JSONObject jsonobject, zzhx zzhx)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzcgs = zzaef1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field zzaef zzcgs>
		zzcos = zzaej;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field zzaej zzcos>
		zzcod = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #36  <Field zzwy zzcod>
		zzacv = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #38  <Field zzjn zzacv>
		errorCode = i;
	//   14   24:aload_0         
	//   15   25:iload           5
	//   16   27:putfield        #40  <Field int errorCode>
		zzcoh = l;
	//   17   30:aload_0         
	//   18   31:lload           6
	//   19   33:putfield        #42  <Field long zzcoh>
		zzcoi = l1;
	//   20   36:aload_0         
	//   21   37:lload           8
	//   22   39:putfield        #44  <Field long zzcoi>
		zzcob = null;
	//   23   42:aload_0         
	//   24   43:aconst_null     
	//   25   44:putfield        #46  <Field JSONObject zzcob>
		zzcoq = new zzhs(zzhx);
	//   26   47:aload_0         
	//   27   48:new             #73  <Class zzhs>
	//   28   51:dup             
	//   29   52:aload           11
	//   30   54:invokespecial   #76  <Method void zzhs(zzhx)>
	//   31   57:putfield        #48  <Field zzhs zzcoq>
		zzcor = false;
	//   32   60:aload_0         
	//   33   61:iconst_0        
	//   34   62:putfield        #56  <Field boolean zzcor>
	//   35   65:return          
	}

	public final int errorCode;
	public final zzjn zzacv;
	public final zzaef zzcgs;
	public final JSONObject zzcob;
	public final zzwy zzcod;
	public final long zzcoh;
	public final long zzcoi;
	public final zzhs zzcoq;
	public final boolean zzcor;
	public final zzaej zzcos;
}
