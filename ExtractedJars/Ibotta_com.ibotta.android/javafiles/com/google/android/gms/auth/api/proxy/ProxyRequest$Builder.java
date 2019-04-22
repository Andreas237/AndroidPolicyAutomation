// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.util.Patterns;
import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//			ProxyRequest

public static class ProxyRequest$Builder
{

	public ProxyRequest build()
	{
		if(zzea == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field byte[] zzea>
	//*   2    4:ifnonnull       14
			zzea = new byte[0];
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:newarray        byte[]
	//    6   11:putfield        #34  <Field byte[] zzea>
		return new ProxyRequest(2, zzdx, zzdy, zzdz, zzea, zzeb);
	//    7   14:new             #6   <Class ProxyRequest>
	//    8   17:dup             
	//    9   18:iconst_2        
	//   10   19:aload_0         
	//   11   20:getfield        #65  <Field String zzdx>
	//   12   23:aload_0         
	//   13   24:getfield        #28  <Field int zzdy>
	//   14   27:aload_0         
	//   15   28:getfield        #32  <Field long zzdz>
	//   16   31:aload_0         
	//   17   32:getfield        #34  <Field byte[] zzea>
	//   18   35:aload_0         
	//   19   36:getfield        #39  <Field Bundle zzeb>
	//   20   39:invokespecial   #102 <Method void ProxyRequest(int, String, int, long, byte[], Bundle)>
	//   21   42:areturn         
	}

	public ProxyRequest$Builder putHeader(String s, String s1)
	{
		Preconditions.checkNotEmpty(s, "Header name cannot be null or empty!");
	//    0    0:aload_1         
	//    1    1:ldc1            #106 <String "Header name cannot be null or empty!">
	//    2    3:invokestatic    #109 <Method String Preconditions.checkNotEmpty(String, Object)>
	//    3    6:pop             
		Bundle bundle = zzeb;
	//    4    7:aload_0         
	//    5    8:getfield        #39  <Field Bundle zzeb>
	//    6   11:astore          4
		String s2 = s1;
	//    7   13:aload_2         
	//    8   14:astore_3        
		if(s1 == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       22
			s2 = "";
	//   11   19:ldc1            #111 <String "">
	//   12   21:astore_3        
		bundle.putString(s, s2);
	//   13   22:aload           4
	//   14   24:aload_1         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		return this;
	//   17   29:aload_0         
	//   18   30:areturn         
	}

	public ProxyRequest$Builder setBody(byte abyte0[])
	{
		zzea = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field byte[] zzea>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ProxyRequest$Builder setHttpMethod(int i)
	{
		boolean flag;
		if(i >= 0 && i <= ProxyRequest.LAST_CODE)
	//*   0    0:iload_1         
	//*   1    1:iflt            16
	//*   2    4:iload_1         
	//*   3    5:getstatic       #122 <Field int ProxyRequest.LAST_CODE>
	//*   4    8:icmpgt          16
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:goto            18
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		Preconditions.checkArgument(flag, "Unrecognized http method code.");
	//   10   18:iload_2         
	//   11   19:ldc1            #124 <String "Unrecognized http method code.">
	//   12   21:invokestatic    #128 <Method void Preconditions.checkArgument(boolean, Object)>
		zzdy = i;
	//   13   24:aload_0         
	//   14   25:iload_1         
	//   15   26:putfield        #28  <Field int zzdy>
		return this;
	//   16   29:aload_0         
	//   17   30:areturn         
	}

	public ProxyRequest$Builder setTimeoutMillis(long l)
	{
		boolean flag;
		if(l >= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:iflt            11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_3        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_3        
		Preconditions.checkArgument(flag, "The specified timeout must be non-negative.");
	//    9   13:iload_3         
	//   10   14:ldc1            #132 <String "The specified timeout must be non-negative.">
	//   11   16:invokestatic    #128 <Method void Preconditions.checkArgument(boolean, Object)>
		zzdz = l;
	//   12   19:aload_0         
	//   13   20:lload_1         
	//   14   21:putfield        #32  <Field long zzdz>
		return this;
	//   15   24:aload_0         
	//   16   25:areturn         
	}

	private String zzdx;
	private int zzdy;
	private long zzdz;
	private byte zzea[];
	private Bundle zzeb;

	public ProxyRequest$Builder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzdy = ProxyRequest.HTTP_METHOD_GET;
	//    2    4:aload_0         
	//    3    5:getstatic       #26  <Field int ProxyRequest.HTTP_METHOD_GET>
	//    4    8:putfield        #28  <Field int zzdy>
		zzdz = 3000L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #29  <Long 3000L>
	//    7   15:putfield        #32  <Field long zzdz>
		zzea = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #34  <Field byte[] zzea>
		zzeb = new Bundle();
	//   11   23:aload_0         
	//   12   24:new             #36  <Class Bundle>
	//   13   27:dup             
	//   14   28:invokespecial   #37  <Method void Bundle()>
	//   15   31:putfield        #39  <Field Bundle zzeb>
		Preconditions.checkNotEmpty(s);
	//   16   34:aload_1         
	//   17   35:invokestatic    #45  <Method String Preconditions.checkNotEmpty(String)>
	//   18   38:pop             
		if(Patterns.WEB_URL.matcher(((CharSequence) (s))).matches())
	//*  19   39:getstatic       #51  <Field Pattern Patterns.WEB_URL>
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #57  <Method Matcher Pattern.matcher(CharSequence)>
	//*  22   46:invokevirtual   #63  <Method boolean Matcher.matches()>
	//*  23   49:ifeq            58
		{
			zzdx = s;
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:putfield        #65  <Field String zzdx>
			return;
	//   27   57:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51);
	//   28   58:new             #67  <Class StringBuilder>
	//   29   61:dup             
	//   30   62:aload_1         
	//   31   63:invokestatic    #73  <Method String String.valueOf(Object)>
	//   32   66:invokevirtual   #77  <Method int String.length()>
	//   33   69:bipush          51
	//   34   71:iadd            
	//   35   72:invokespecial   #80  <Method void StringBuilder(int)>
	//   36   75:astore_2        
			stringbuilder.append("The supplied url [ ");
	//   37   76:aload_2         
	//   38   77:ldc1            #82  <String "The supplied url [ ">
	//   39   79:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
			stringbuilder.append(s);
	//   41   83:aload_2         
	//   42   84:aload_1         
	//   43   85:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
			stringbuilder.append("] is not match Patterns.WEB_URL!");
	//   45   89:aload_2         
	//   46   90:ldc1            #88  <String "] is not match Patterns.WEB_URL!">
	//   47   92:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   48   95:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   49   96:new             #90  <Class IllegalArgumentException>
	//   50   99:dup             
	//   51  100:aload_2         
	//   52  101:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   53  104:invokespecial   #96  <Method void IllegalArgumentException(String)>
	//   54  107:athrow          
		}
	}
}
