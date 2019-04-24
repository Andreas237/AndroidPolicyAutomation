// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//			zzabm, zzaaw

class zzabm$1
	implements Runnable
{

	public void run()
	{
		if(zzabm.zza(zzaBL) >= 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field zzabm zzaBL>
	//*   2    4:invokestatic    #34  <Method int zzabm.zza(zzabm)>
	//*   3    7:iconst_1        
	//*   4    8:icmplt          46
		{
			zzaaw zzaaw1 = zzaBw;
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field zzaaw zzaBw>
	//    7   15:astore_2        
			Bundle bundle;
			if(zzabm.zzb(zzaBL) != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #21  <Field zzabm zzaBL>
	//*  10   20:invokestatic    #37  <Method Bundle zzabm.zzb(zzabm)>
	//*  11   23:ifnull          101
				bundle = zzabm.zzb(zzaBL).getBundle(zzO);
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field zzabm zzaBL>
	//   14   30:invokestatic    #37  <Method Bundle zzabm.zzb(zzabm)>
	//   15   33:aload_0         
	//   16   34:getfield        #25  <Field String zzO>
	//   17   37:invokevirtual   #43  <Method Bundle Bundle.getBundle(String)>
	//   18   40:astore_1        
			else
	//*  19   41:aload_2         
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #49  <Method void zzaaw.onCreate(Bundle)>
	//*  22   46:aload_0         
	//*  23   47:getfield        #21  <Field zzabm zzaBL>
	//*  24   50:invokestatic    #34  <Method int zzabm.zza(zzabm)>
	//*  25   53:iconst_2        
	//*  26   54:icmplt          64
	//*  27   57:aload_0         
	//*  28   58:getfield        #23  <Field zzaaw zzaBw>
	//*  29   61:invokevirtual   #52  <Method void zzaaw.onStart()>
	//*  30   64:aload_0         
	//*  31   65:getfield        #21  <Field zzabm zzaBL>
	//*  32   68:invokestatic    #34  <Method int zzabm.zza(zzabm)>
	//*  33   71:iconst_3        
	//*  34   72:icmplt          82
	//*  35   75:aload_0         
	//*  36   76:getfield        #23  <Field zzaaw zzaBw>
	//*  37   79:invokevirtual   #55  <Method void zzaaw.onStop()>
	//*  38   82:aload_0         
	//*  39   83:getfield        #21  <Field zzabm zzaBL>
	//*  40   86:invokestatic    #34  <Method int zzabm.zza(zzabm)>
	//*  41   89:iconst_4        
	//*  42   90:icmplt          100
	//*  43   93:aload_0         
	//*  44   94:getfield        #23  <Field zzaaw zzaBw>
	//*  45   97:invokevirtual   #58  <Method void zzaaw.onDestroy()>
	//*  46  100:return          
				bundle = null;
	//   47  101:aconst_null     
	//   48  102:astore_1        
			zzaaw1.onCreate(bundle);
		}
		if(zzabm.zza(zzaBL) >= 2)
			zzaBw.onStart();
		if(zzabm.zza(zzaBL) >= 3)
			zzaBw.onStop();
		if(zzabm.zza(zzaBL) >= 4)
			zzaBw.onDestroy();
	//*  49  103:goto            41
	}

	final String zzO;
	final zzabm zzaBL;
	final zzaaw zzaBw;

	zzabm$1(zzabm zzabm1, zzaaw zzaaw1, String s)
	{
		zzaBL = zzabm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzabm zzaBL>
		zzaBw = zzaaw1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field zzaaw zzaBw>
		zzO = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String zzO>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
