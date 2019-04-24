// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//			zzabg, zzabe

class zzabg$1
	implements Runnable
{

	public void run()
	{
		if(zzabg.zza(zzaCW) >= 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field zzabg zzaCW>
	//*   2    4:invokestatic    #34  <Method int zzabg.zza(zzabg)>
	//*   3    7:iconst_1        
	//*   4    8:icmplt          51
		{
			zzabe zzabe1 = zzaCV;
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field zzabe zzaCV>
	//    7   15:astore_2        
			Bundle bundle;
			if(zzabg.zzb(zzaCW) != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #21  <Field zzabg zzaCW>
	//*  10   20:invokestatic    #37  <Method Bundle zzabg.zzb(zzabg)>
	//*  11   23:ifnull          44
				bundle = zzabg.zzb(zzaCW).getBundle(zzP);
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field zzabg zzaCW>
	//   14   30:invokestatic    #37  <Method Bundle zzabg.zzb(zzabg)>
	//   15   33:aload_0         
	//   16   34:getfield        #25  <Field String zzP>
	//   17   37:invokevirtual   #43  <Method Bundle Bundle.getBundle(String)>
	//   18   40:astore_1        
			else
	//*  19   41:goto            46
				bundle = null;
	//   20   44:aconst_null     
	//   21   45:astore_1        
			zzabe1.onCreate(bundle);
	//   22   46:aload_2         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #49  <Method void zzabe.onCreate(Bundle)>
		}
		if(zzabg.zza(zzaCW) >= 2)
	//*  25   51:aload_0         
	//*  26   52:getfield        #21  <Field zzabg zzaCW>
	//*  27   55:invokestatic    #34  <Method int zzabg.zza(zzabg)>
	//*  28   58:iconst_2        
	//*  29   59:icmplt          69
			zzaCV.onStart();
	//   30   62:aload_0         
	//   31   63:getfield        #23  <Field zzabe zzaCV>
	//   32   66:invokevirtual   #52  <Method void zzabe.onStart()>
		if(zzabg.zza(zzaCW) >= 3)
	//*  33   69:aload_0         
	//*  34   70:getfield        #21  <Field zzabg zzaCW>
	//*  35   73:invokestatic    #34  <Method int zzabg.zza(zzabg)>
	//*  36   76:iconst_3        
	//*  37   77:icmplt          87
			zzaCV.onStop();
	//   38   80:aload_0         
	//   39   81:getfield        #23  <Field zzabe zzaCV>
	//   40   84:invokevirtual   #55  <Method void zzabe.onStop()>
		if(zzabg.zza(zzaCW) >= 4)
	//*  41   87:aload_0         
	//*  42   88:getfield        #21  <Field zzabg zzaCW>
	//*  43   91:invokestatic    #34  <Method int zzabg.zza(zzabg)>
	//*  44   94:iconst_4        
	//*  45   95:icmplt          105
			zzaCV.onDestroy();
	//   46   98:aload_0         
	//   47   99:getfield        #23  <Field zzabe zzaCV>
	//   48  102:invokevirtual   #58  <Method void zzabe.onDestroy()>
	//   49  105:return          
	}

	final String zzP;
	final zzabe zzaCV;
	final zzabg zzaCW;

	zzabg$1(zzabg zzabg1, zzabe zzabe1, String s)
	{
		zzaCW = zzabg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzabg zzaCW>
		zzaCV = zzabe1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field zzabe zzaCV>
		zzP = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String zzP>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
