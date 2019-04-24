// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.jni;

import android.content.Context;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.i.b;
import com.baidu.android.pushservice.i.e;

public class BaiduAppSSOJni
{

	public BaiduAppSSOJni()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static native byte[] decryptAES(byte abyte0[], int i, int j);

	private static native byte[] encrypt(String s, String s1);

	public static native byte[] encryptAES(String s, int i);

	public static String getDecrypted(Context context, String s, String s1)
	{
		String s2;
		s2 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       12
			s2 = "";
	//    4    6:ldc1            #44  <String "">
	//    5    8:astore_3        
	//*   6    9:goto            12
		byte abyte0[] = getKey(s2);
	//    7   12:aload_3         
	//    8   13:invokestatic    #48  <Method byte[] getKey(String)>
	//    9   16:astore_3        
		if(abyte0 != null)
			break MISSING_BLOCK_LABEL_30;
	//   10   17:aload_3         
	//   11   18:ifnonnull       30
		a.a("BaiduAppSSOJni", "keyInfo null");
	//   12   21:ldc1            #8   <String "BaiduAppSSOJni">
	//   13   23:ldc1            #50  <String "keyInfo null">
	//   14   25:invokestatic    #53  <Method void a.a(String, String)>
		return null;
	//   15   28:aconst_null     
	//   16   29:areturn         
		s = ((String) (b.a(s1.getBytes())));
	//   17   30:aload_2         
	//   18   31:invokevirtual   #59  <Method byte[] String.getBytes()>
	//   19   34:invokestatic    #64  <Method byte[] b.a(byte[])>
	//   20   37:astore_1        
		abyte0 = ((byte []) (new String(abyte0, "utf-8")));
	//   21   38:new             #55  <Class String>
	//   22   41:dup             
	//   23   42:aload_3         
	//   24   43:ldc1            #66  <String "utf-8">
	//   25   45:invokespecial   #69  <Method void String(byte[], String)>
	//   26   48:astore_3        
		if(abyte0 == null) goto _L2; else goto _L1
	//   27   49:aload_3         
	//   28   50:ifnull          184
_L1:
		if(((String) (abyte0)).length() <= 0) goto _L2; else goto _L3
	//   29   53:aload_3         
	//   30   54:invokevirtual   #73  <Method int String.length()>
	//   31   57:ifle            184
_L3:
		String s3 = ((String) (abyte0)).substring(0, 16);
	//   32   60:aload_3         
	//   33   61:iconst_0        
	//   34   62:bipush          16
	//   35   64:invokevirtual   #77  <Method String String.substring(int, int)>
	//   36   67:astore          4
		s = new String(com.baidu.android.pushservice.i.a.b(((String) (abyte0)).substring(16), s3, ((byte []) (s))), "utf-8");
	//   37   69:new             #55  <Class String>
	//   38   72:dup             
	//   39   73:aload_3         
	//   40   74:bipush          16
	//   41   76:invokevirtual   #80  <Method String String.substring(int)>
	//   42   79:aload           4
	//   43   81:aload_1         
	//   44   82:invokestatic    #86  <Method byte[] com.baidu.android.pushservice.i.a.b(String, String, byte[])>
	//   45   85:ldc1            #66  <String "utf-8">
	//   46   87:invokespecial   #69  <Method void String(byte[], String)>
	//   47   90:astore_1        
		return s;
	//   48   91:aload_1         
	//   49   92:areturn         
_L4:
		s = ((String) (new StringBuilder()));
	//   50   93:new             #88  <Class StringBuilder>
	//   51   96:dup             
	//   52   97:invokespecial   #89  <Method void StringBuilder()>
	//   53  100:astore_1        
		((StringBuilder) (s)).append("UnsatisfiedLinkError getDecrypted ");
	//   54  101:aload_1         
	//   55  102:ldc1            #91  <String "UnsatisfiedLinkError getDecrypted ">
	//   56  104:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   57  107:pop             
		((StringBuilder) (s)).append(s1);
	//   58  108:aload_1         
	//   59  109:aload_2         
	//   60  110:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   61  113:pop             
		a.e("BaiduAppSSOJni", ((StringBuilder) (s)).toString());
	//   62  114:ldc1            #8   <String "BaiduAppSSOJni">
	//   63  116:aload_1         
	//   64  117:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   65  120:invokestatic    #28  <Method void a.e(String, String)>
		s = ((String) (new StringBuilder()));
	//   66  123:new             #88  <Class StringBuilder>
	//   67  126:dup             
	//   68  127:invokespecial   #89  <Method void StringBuilder()>
	//   69  130:astore_1        
		((StringBuilder) (s)).append("UnsatisfiedLinkError getDecrypted ");
	//   70  131:aload_1         
	//   71  132:ldc1            #91  <String "UnsatisfiedLinkError getDecrypted ">
	//   72  134:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   73  137:pop             
		((StringBuilder) (s)).append(s1);
	//   74  138:aload_1         
	//   75  139:aload_2         
	//   76  140:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   77  143:pop             
		u.b(((StringBuilder) (s)).toString(), context);
	//   78  144:aload_1         
	//   79  145:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   80  148:aload_0         
	//   81  149:invokestatic    #104 <Method void u.b(String, Context)>
		return null;
	//   82  152:aconst_null     
	//   83  153:areturn         
_L5:
		context = ((Context) (new StringBuilder()));
	//   84  154:new             #88  <Class StringBuilder>
	//   85  157:dup             
	//   86  158:invokespecial   #89  <Method void StringBuilder()>
	//   87  161:astore_0        
		((StringBuilder) (context)).append("getDecrypted: ");
	//   88  162:aload_0         
	//   89  163:ldc1            #106 <String "getDecrypted: ">
	//   90  165:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   91  168:pop             
		((StringBuilder) (context)).append(((Object) (s)));
	//   92  169:aload_0         
	//   93  170:aload_1         
	//   94  171:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   95  174:pop             
		a.a("BaiduAppSSOJni", ((StringBuilder) (context)).toString());
	//   96  175:ldc1            #8   <String "BaiduAppSSOJni">
	//   97  177:aload_0         
	//   98  178:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   99  181:invokestatic    #53  <Method void a.a(String, String)>
_L2:
		return null;
	//  100  184:aconst_null     
	//  101  185:areturn         
		s;
	//  102  186:astore_1        
		  goto _L4
	//* 103  187:goto            93
		s;
	//  104  190:astore_1        
		  goto _L5
	//* 105  191:goto            154
	}

	public static String getEncrypted(Context context, String s, String s1)
	{
		String s2;
		s2 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       12
			s2 = "";
	//    4    6:ldc1            #44  <String "">
	//    5    8:astore_3        
	//*   6    9:goto            12
		byte abyte0[] = getKey(s2);
	//    7   12:aload_3         
	//    8   13:invokestatic    #48  <Method byte[] getKey(String)>
	//    9   16:astore_3        
		if(abyte0 != null)
			break MISSING_BLOCK_LABEL_30;
	//   10   17:aload_3         
	//   11   18:ifnonnull       30
		a.a("BaiduAppSSOJni", "keyInfo null");
	//   12   21:ldc1            #8   <String "BaiduAppSSOJni">
	//   13   23:ldc1            #50  <String "keyInfo null">
	//   14   25:invokestatic    #53  <Method void a.a(String, String)>
		return null;
	//   15   28:aconst_null     
	//   16   29:areturn         
		s = ((String) (s1.getBytes()));
	//   17   30:aload_2         
	//   18   31:invokevirtual   #59  <Method byte[] String.getBytes()>
	//   19   34:astore_1        
		abyte0 = ((byte []) (new String(abyte0, "utf-8")));
	//   20   35:new             #55  <Class String>
	//   21   38:dup             
	//   22   39:aload_3         
	//   23   40:ldc1            #66  <String "utf-8">
	//   24   42:invokespecial   #69  <Method void String(byte[], String)>
	//   25   45:astore_3        
		if(abyte0 == null) goto _L2; else goto _L1
	//   26   46:aload_3         
	//   27   47:ifnull          177
_L1:
		if(((String) (abyte0)).length() <= 0) goto _L2; else goto _L3
	//   28   50:aload_3         
	//   29   51:invokevirtual   #73  <Method int String.length()>
	//   30   54:ifle            177
_L3:
		String s3 = ((String) (abyte0)).substring(0, 16);
	//   31   57:aload_3         
	//   32   58:iconst_0        
	//   33   59:bipush          16
	//   34   61:invokevirtual   #77  <Method String String.substring(int, int)>
	//   35   64:astore          4
		s = b.a(com.baidu.android.pushservice.i.a.a(((String) (abyte0)).substring(16), s3, ((byte []) (s))), "utf-8");
	//   36   66:aload_3         
	//   37   67:bipush          16
	//   38   69:invokevirtual   #80  <Method String String.substring(int)>
	//   39   72:aload           4
	//   40   74:aload_1         
	//   41   75:invokestatic    #112 <Method byte[] com.baidu.android.pushservice.i.a.a(String, String, byte[])>
	//   42   78:ldc1            #66  <String "utf-8">
	//   43   80:invokestatic    #115 <Method String b.a(byte[], String)>
	//   44   83:astore_1        
		return s;
	//   45   84:aload_1         
	//   46   85:areturn         
_L4:
		s = ((String) (new StringBuilder()));
	//   47   86:new             #88  <Class StringBuilder>
	//   48   89:dup             
	//   49   90:invokespecial   #89  <Method void StringBuilder()>
	//   50   93:astore_1        
		((StringBuilder) (s)).append("UnsatisfiedLinkError getEncrypted ");
	//   51   94:aload_1         
	//   52   95:ldc1            #117 <String "UnsatisfiedLinkError getEncrypted ">
	//   53   97:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   54  100:pop             
		((StringBuilder) (s)).append(s1);
	//   55  101:aload_1         
	//   56  102:aload_2         
	//   57  103:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
		a.e("BaiduAppSSOJni", ((StringBuilder) (s)).toString());
	//   59  107:ldc1            #8   <String "BaiduAppSSOJni">
	//   60  109:aload_1         
	//   61  110:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   62  113:invokestatic    #28  <Method void a.e(String, String)>
		s = ((String) (new StringBuilder()));
	//   63  116:new             #88  <Class StringBuilder>
	//   64  119:dup             
	//   65  120:invokespecial   #89  <Method void StringBuilder()>
	//   66  123:astore_1        
		((StringBuilder) (s)).append("UnsatisfiedLinkError getEncrypted ");
	//   67  124:aload_1         
	//   68  125:ldc1            #117 <String "UnsatisfiedLinkError getEncrypted ">
	//   69  127:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   70  130:pop             
		((StringBuilder) (s)).append(s1);
	//   71  131:aload_1         
	//   72  132:aload_2         
	//   73  133:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   74  136:pop             
		u.b(((StringBuilder) (s)).toString(), context);
	//   75  137:aload_1         
	//   76  138:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   77  141:aload_0         
	//   78  142:invokestatic    #104 <Method void u.b(String, Context)>
		return null;
	//   79  145:aconst_null     
	//   80  146:areturn         
_L5:
		context = ((Context) (new StringBuilder()));
	//   81  147:new             #88  <Class StringBuilder>
	//   82  150:dup             
	//   83  151:invokespecial   #89  <Method void StringBuilder()>
	//   84  154:astore_0        
		((StringBuilder) (context)).append("getEncrypted: ");
	//   85  155:aload_0         
	//   86  156:ldc1            #119 <String "getEncrypted: ">
	//   87  158:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   88  161:pop             
		((StringBuilder) (context)).append(((Object) (s)));
	//   89  162:aload_0         
	//   90  163:aload_1         
	//   91  164:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   92  167:pop             
		a.a("BaiduAppSSOJni", ((StringBuilder) (context)).toString());
	//   93  168:ldc1            #8   <String "BaiduAppSSOJni">
	//   94  170:aload_0         
	//   95  171:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   96  174:invokestatic    #53  <Method void a.a(String, String)>
_L2:
		return null;
	//   97  177:aconst_null     
	//   98  178:areturn         
		s;
	//   99  179:astore_1        
		  goto _L4
	//* 100  180:goto            86
		s;
	//  101  183:astore_1        
		  goto _L5
	//* 102  184:goto            147
	}

	private static native byte[] getKey(String s);

	public static String getPushHash(Context context, String s, String s1, String s2)
	{
		if(context != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          134
	//*   2    4:aload_1         
	//*   3    5:ifnull          134
		{
			if(s1 == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       14
				return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
			String s3 = s2;
	//    8   14:aload_3         
	//    9   15:astore          6
			if(s2 == null)
	//*  10   17:aload_3         
	//*  11   18:ifnonnull       25
				s3 = "other";
	//   12   21:ldc1            #123 <String "other">
	//   13   23:astore          6
			s2 = u.q(context.getApplicationContext(), s);
	//   14   25:aload_0         
	//   15   26:invokevirtual   #129 <Method Context Context.getApplicationContext()>
	//   16   29:aload_1         
	//   17   30:invokestatic    #133 <Method String u.q(Context, String)>
	//   18   33:astore_3        
			if(s2 == null)
	//*  19   34:aload_3         
	//*  20   35:ifnonnull       70
			{
				context = ((Context) (new StringBuilder()));
	//   21   38:new             #88  <Class StringBuilder>
	//   22   41:dup             
	//   23   42:invokespecial   #89  <Method void StringBuilder()>
	//   24   45:astore_0        
				((StringBuilder) (context)).append("can not get singInfo for: ");
	//   25   46:aload_0         
	//   26   47:ldc1            #135 <String "can not get singInfo for: ">
	//   27   49:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
				((StringBuilder) (context)).append(s);
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
				a.c("BaiduAppSSOJni", ((StringBuilder) (context)).toString());
	//   33   59:ldc1            #8   <String "BaiduAppSSOJni">
	//   34   61:aload_0         
	//   35   62:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   36   65:invokestatic    #138 <Method void a.c(String, String)>
				return null;
	//   37   68:aconst_null     
	//   38   69:areturn         
			}
			long l = System.currentTimeMillis();
	//   39   70:invokestatic    #142 <Method long System.currentTimeMillis()>
	//   40   73:lstore          4
			context = ((Context) (getSsoHashNative(context, s, s1, s2, e.a(context), s3, l)));
	//   41   75:aload_0         
	//   42   76:aload_1         
	//   43   77:aload_2         
	//   44   78:aload_3         
	//   45   79:aload_0         
	//   46   80:invokestatic    #147 <Method String e.a(Context)>
	//   47   83:aload           6
	//   48   85:lload           4
	//   49   87:invokestatic    #151 <Method byte[] getSsoHashNative(Context, String, String, String, String, String, long)>
	//   50   90:astore_0        
			try
			{
				context = ((Context) (b.a(((byte []) (context)), "utf-8")));
	//   51   91:aload_0         
	//   52   92:ldc1            #66  <String "utf-8">
	//   53   94:invokestatic    #115 <Method String b.a(byte[], String)>
	//   54   97:astore_0        
			}
	//*  55   98:aload_0         
	//*  56   99:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  57  100:astore_0        
			{
				s = ((String) (new StringBuilder()));
	//   58  101:new             #88  <Class StringBuilder>
	//   59  104:dup             
	//   60  105:invokespecial   #89  <Method void StringBuilder()>
	//   61  108:astore_1        
				((StringBuilder) (s)).append("getPushHashException: ");
	//   62  109:aload_1         
	//   63  110:ldc1            #153 <String "getPushHashException: ">
	//   64  112:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   65  115:pop             
				((StringBuilder) (s)).append(((Object) (context)));
	//   66  116:aload_1         
	//   67  117:aload_0         
	//   68  118:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   69  121:pop             
				a.c("BaiduAppSSOJni", ((StringBuilder) (s)).toString());
	//   70  122:ldc1            #8   <String "BaiduAppSSOJni">
	//   71  124:aload_1         
	//   72  125:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   73  128:invokestatic    #138 <Method void a.c(String, String)>
				return "";
	//   74  131:ldc1            #44  <String "">
	//   75  133:areturn         
			}
			return ((String) (context));
		} else
		{
			return null;
	//   76  134:aconst_null     
	//   77  135:areturn         
		}
	}

	private static native byte[] getSsoHashNative(Context context, String s, String s1, String s2, String s3, String s4, long l);

	private static final String TAG = "BaiduAppSSOJni";

	static 
	{
		UnsatisfiedLinkError unsatisfiedlinkerror;
		try
		{
			System.loadLibrary("bdpush_V2_7");
	//    0    0:ldc1            #14  <String "bdpush_V2_7">
	//    1    2:invokestatic    #20  <Method void System.loadLibrary(String)>
			return;
	//    2    5:return          
		}
	//*   3    6:ldc1            #8   <String "BaiduAppSSOJni">
	//*   4    8:ldc1            #22  <String "Native library not found! Please copy libbdpush_V2_7.so into your project!">
	//*   5   10:invokestatic    #28  <Method void a.e(String, String)>
	//*   6   13:return          
		// Misplaced declaration of an exception variable
		catch(UnsatisfiedLinkError unsatisfiedlinkerror)
		{
			a.e("BaiduAppSSOJni", "Native library not found! Please copy libbdpush_V2_7.so into your project!");
		}
	//*   7   14:astore_0        
	//*   8   15:goto            6
	}
}
