// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ui, kp, wx, zzwb, 
//			uq

final class uk
	implements Runnable
{

	uk(ui ui1, kp kp1, zzwb zzwb, uq uq)
	{
		d = ui1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ui d>
		a = kp1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field kp a>
		b = zzwb;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field zzwb b>
		c = uq;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field uq c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #27  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		try
		{
			a.a(com.google.android.gms.c.d.a(((Object) (ui.a(d)))), b, ((String) (null)), ((ux) (c)), ui.b(d));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field kp a>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field ui d>
	//    4    8:invokestatic    #36  <Method android.content.Context ui.a(ui)>
	//    5   11:invokestatic    #41  <Method com.google.android.gms.c.a d.a(Object)>
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field zzwb b>
	//    8   18:aconst_null     
	//    9   19:aload_0         
	//   10   20:getfield        #24  <Field uq c>
	//   11   23:aload_0         
	//   12   24:getfield        #18  <Field ui d>
	//   13   27:invokestatic    #44  <Method String ui.b(ui)>
	//   14   30:invokeinterface #49  <Method void kp.a(com.google.android.gms.c.a, zzwb, String, ux, String)>
			return;
	//   15   35:return          
		}
		catch(RemoteException remoteexception)
	//*  16   36:astore_2        
		{
			Object obj = ((Object) (String.valueOf(((Object) (d.a)))));
	//   17   37:aload_0         
	//   18   38:getfield        #18  <Field ui d>
	//   19   41:getfield        #52  <Field String ui.a>
	//   20   44:invokestatic    #58  <Method String String.valueOf(Object)>
	//   21   47:astore_1        
			if(((String) (obj)).length() != 0)
	//*  22   48:aload_1         
	//*  23   49:invokevirtual   #62  <Method int String.length()>
	//*  24   52:ifeq            65
				obj = ((Object) ("Fail to initialize adapter ".concat(((String) (obj)))));
	//   25   55:ldc1            #64  <String "Fail to initialize adapter ">
	//   26   57:aload_1         
	//   27   58:invokevirtual   #68  <Method String String.concat(String)>
	//   28   61:astore_1        
			else
	//*  29   62:goto            75
				obj = ((Object) (new String("Fail to initialize adapter ")));
	//   30   65:new             #54  <Class String>
	//   31   68:dup             
	//   32   69:ldc1            #64  <String "Fail to initialize adapter ">
	//   33   71:invokespecial   #71  <Method void String(String)>
	//   34   74:astore_1        
			wx.c(((String) (obj)), ((Throwable) (remoteexception)));
	//   35   75:aload_1         
	//   36   76:aload_2         
	//   37   77:invokestatic    #76  <Method void wx.c(String, Throwable)>
			obj = ((Object) (d));
	//   38   80:aload_0         
	//   39   81:getfield        #18  <Field ui d>
	//   40   84:astore_1        
			((ui) (obj)).a(((ui) (obj)).a, 0);
	//   41   85:aload_1         
	//   42   86:aload_1         
	//   43   87:getfield        #52  <Field String ui.a>
	//   44   90:iconst_0        
	//   45   91:invokevirtual   #79  <Method void ui.a(String, int)>
			return;
	//   46   94:return          
		}
	}

	private final kp a;
	private final zzwb b;
	private final uq c;
	private final ui d;
}
