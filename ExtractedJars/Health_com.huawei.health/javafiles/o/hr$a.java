// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.pm.Signature;
import android.text.TextUtils;

// Referenced classes of package o:
//			hr, ft

public static final class hr$a
{

	public final boolean b()
	{
		if(e == null || e.length <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Signature[] e>
	//*   2    4:ifnull          15
	//*   3    7:aload_0         
	//*   4    8:getfield        #20  <Field Signature[] e>
	//*   5   11:arraylength     
	//*   6   12:ifgt            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		for(int i = 0; i < e.length; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:aload_0         
	//*  13   21:getfield        #20  <Field Signature[] e>
	//*  14   24:arraylength     
	//*  15   25:icmpge          71
		{
			String s = hr.e(e[i].toByteArray());
	//   16   28:aload_0         
	//   17   29:getfield        #20  <Field Signature[] e>
	//   18   32:iload_1         
	//   19   33:aaload          
	//   20   34:invokevirtual   #26  <Method byte[] Signature.toByteArray()>
	//   21   37:invokestatic    #29  <Method String hr.e(byte[])>
	//   22   40:astore_2        
			if(s != null && !TextUtils.equals(((CharSequence) (s)), "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649"))
	//*  23   41:aload_2         
	//*  24   42:ifnull          64
	//*  25   45:aload_2         
	//*  26   46:ldc1            #31  <String "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649">
	//*  27   48:invokestatic    #37  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  28   51:ifne            64
			{
				ft.b("biz", "PublicKeyUnmatch", s);
	//   29   54:ldc1            #39  <String "biz">
	//   30   56:ldc1            #41  <String "PublicKeyUnmatch">
	//   31   58:aload_2         
	//   32   59:invokestatic    #46  <Method void ft.b(String, String, String)>
				return true;
	//   33   62:iconst_1        
	//   34   63:ireturn         
			}
		}

	//   35   64:iload_1         
	//   36   65:iconst_1        
	//   37   66:iadd            
	//   38   67:istore_1        
	//*  39   68:goto            19
		return false;
	//   40   71:iconst_0        
	//   41   72:ireturn         
	}

	public int d;
	public Signature e[];

	public hr$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
