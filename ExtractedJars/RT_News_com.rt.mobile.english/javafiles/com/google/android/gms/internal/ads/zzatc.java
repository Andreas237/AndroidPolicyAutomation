// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni

final class zzatc
{

	zzatc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	private static void zzd(String s, String s1, String s2)
	{
		Object obj;
label0:
		{
			obj = ((Object) (zznk.zzazy));
	//    0    0:getstatic       #71  <Field zzna zznk.zzazy>
	//    1    3:astore_3        
			if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*   2    4:invokestatic    #77  <Method zzni zzkb.zzik()>
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #82  <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #84  <Class Boolean>
	//*   6   14:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            21
				return;
	//    8   20:return          
			obj = ((Object) (new Bundle()));
	//    9   21:new             #90  <Class Bundle>
	//   10   24:dup             
	//   11   25:invokespecial   #91  <Method void Bundle()>
	//   12   28:astore_3        
			((Bundle) (obj)).putString("err", s);
	//   13   29:aload_3         
	//   14   30:ldc1            #93  <String "err">
	//   15   32:aload_0         
	//   16   33:invokevirtual   #97  <Method void Bundle.putString(String, String)>
			((Bundle) (obj)).putString("code", s1);
	//   17   36:aload_3         
	//   18   37:ldc1            #99  <String "code">
	//   19   39:aload_1         
	//   20   40:invokevirtual   #97  <Method void Bundle.putString(String, String)>
			if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//*  21   43:aload_2         
	//*  22   44:invokestatic    #105 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   47:ifne            70
			{
				s = ((String) (Uri.parse(s2)));
	//   24   50:aload_2         
	//   25   51:invokestatic    #111 <Method Uri Uri.parse(String)>
	//   26   54:astore_0        
				if(((Uri) (s)).getHost() != null)
	//*  27   55:aload_0         
	//*  28   56:invokevirtual   #115 <Method String Uri.getHost()>
	//*  29   59:ifnull          70
				{
					s = ((Uri) (s)).getHost();
	//   30   62:aload_0         
	//   31   63:invokevirtual   #115 <Method String Uri.getHost()>
	//   32   66:astore_0        
					break label0;
	//   33   67:goto            73
				}
			}
			s = "";
	//   34   70:ldc1            #117 <String "">
	//   35   72:astore_0        
		}
		((Bundle) (obj)).putString("host", s);
	//   36   73:aload_3         
	//   37   74:ldc1            #119 <String "host">
	//   38   76:aload_0         
	//   39   77:invokevirtual   #97  <Method void Bundle.putString(String, String)>
	//   40   80:return          
	}

	final void zzb(SslError sslerror)
	{
		if(sslerror == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int i = sslerror.getPrimaryError();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #128 <Method int SslError.getPrimaryError()>
	//    5    9:istore_2        
		String s;
		if(i >= 0 && i < zzdbp.length)
	//*   6   10:iload_2         
	//*   7   11:iflt            31
	//*   8   14:iload_2         
	//*   9   15:getstatic       #59  <Field String[] zzdbp>
	//*  10   18:arraylength     
	//*  11   19:icmpge          31
			s = zzdbp[i];
	//   12   22:getstatic       #59  <Field String[] zzdbp>
	//   13   25:iload_2         
	//   14   26:aaload          
	//   15   27:astore_3        
		else
	//*  16   28:goto            36
			s = String.valueOf(i);
	//   17   31:iload_2         
	//   18   32:invokestatic    #132 <Method String String.valueOf(int)>
	//   19   35:astore_3        
		zzd("ssl_err", s, sslerror.getUrl());
	//   20   36:ldc1            #134 <String "ssl_err">
	//   21   38:aload_3         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #137 <Method String SslError.getUrl()>
	//   24   43:invokestatic    #139 <Method void zzd(String, String, String)>
	//   25   46:return          
	}

	final void zze(int i, String s)
	{
		String s1;
label0:
		{
			if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            27
			{
				int j = -i - 1;
	//    2    4:iload_1         
	//    3    5:ineg            
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:istore_3        
				if(j < zzdbo.length)
	//*   7    9:iload_3         
	//*   8   10:getstatic       #45  <Field String[] zzdbo>
	//*   9   13:arraylength     
	//*  10   14:icmpge          27
				{
					s1 = zzdbo[j];
	//   11   17:getstatic       #45  <Field String[] zzdbo>
	//   12   20:iload_3         
	//   13   21:aaload          
	//   14   22:astore          4
					break label0;
	//   15   24:goto            33
				}
			}
			s1 = String.valueOf(i);
	//   16   27:iload_1         
	//   17   28:invokestatic    #132 <Method String String.valueOf(int)>
	//   18   31:astore          4
		}
		zzd("http_err", s1, s);
	//   19   33:ldc1            #144 <String "http_err">
	//   20   35:aload           4
	//   21   37:aload_2         
	//   22   38:invokestatic    #139 <Method void zzd(String, String, String)>
	//   23   41:return          
	}

	private static final String zzdbo[] = {
		"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
		"FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
	};
	private static final String zzdbp[] = {
		"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
	};

	static 
	{
	//    0    0:bipush          15
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #15  <String "UNKNOWN">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #17  <String "HOST_LOOKUP">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #19  <String "UNSUPPORTED_AUTH_SCHEME">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #21  <String "AUTHENTICATION">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #23  <String "PROXY_AUTHENTICATION">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #25  <String "CONNECT">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #27  <String "IO">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #29  <String "TIMEOUT">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #31  <String "REDIRECT_LOOP">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #33  <String "UNSUPPORTED_SCHEME">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #35  <String "FAILED_SSL_HANDSHAKE">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #37  <String "BAD_URL">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #39  <String "FILE">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #41  <String "FILE_NOT_FOUND">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #43  <String "TOO_MANY_REQUESTS">
	//   61   88:aastore         
	//   62   89:putstatic       #45  <Field String[] zzdbo>
	//   63   92:bipush          6
	//   64   94:anewarray       String[]
	//   65   97:dup             
	//   66   98:iconst_0        
	//   67   99:ldc1            #47  <String "NOT_YET_VALID">
	//   68  101:aastore         
	//   69  102:dup             
	//   70  103:iconst_1        
	//   71  104:ldc1            #49  <String "EXPIRED">
	//   72  106:aastore         
	//   73  107:dup             
	//   74  108:iconst_2        
	//   75  109:ldc1            #51  <String "ID_MISMATCH">
	//   76  111:aastore         
	//   77  112:dup             
	//   78  113:iconst_3        
	//   79  114:ldc1            #53  <String "UNTRUSTED">
	//   80  116:aastore         
	//   81  117:dup             
	//   82  118:iconst_4        
	//   83  119:ldc1            #55  <String "DATE_INVALID">
	//   84  121:aastore         
	//   85  122:dup             
	//   86  123:iconst_5        
	//   87  124:ldc1            #57  <String "INVALID">
	//   88  126:aastore         
	//   89  127:putstatic       #59  <Field String[] zzdbp>
	//*  90  130:return          
	}
}
