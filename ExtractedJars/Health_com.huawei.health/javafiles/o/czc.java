// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;

// Referenced classes of package o:
//			ebh, dbf, cze, dho

public class czc
	implements ebh
{

	public czc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean d()
	{
		return dbf.f(BaseApplication.a());
	//    0    0:invokestatic    #19  <Method android.content.Context BaseApplication.a()>
	//    1    3:invokestatic    #25  <Method boolean dbf.f(android.content.Context)>
	//    2    6:ireturn         
	}

	public String e(String s, boolean flag)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    3:aload_1         
	//*   3    4:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    7:ifeq            25
			if(flag)
	//*   5   10:iload_2         
	//*   6   11:ifeq            21
				s1 = "getBatchPluginUrl";
	//    7   14:ldc1            #35  <String "getBatchPluginUrl">
	//    8   16:astore          4
			else
	//*   9   18:goto            25
				s1 = "getLatestVersion";
	//   10   21:ldc1            #37  <String "getLatestVersion">
	//   11   23:astore          4
		boolean flag1 = true;
	//   12   25:iconst_1        
	//   13   26:istore_3        
		s = ((String) (cze.c(BaseApplication.a())));
	//   14   27:invokestatic    #19  <Method android.content.Context BaseApplication.a()>
	//   15   30:invokestatic    #43  <Method cze cze.c(android.content.Context)>
	//   16   33:astore_1        
		String s3 = ((cze) (s)).e();
	//   17   34:aload_1         
	//   18   35:invokevirtual   #46  <Method String cze.e()>
	//   19   38:astore          6
		String s2 = ((cze) (s)).b(s1, s3);
	//   20   40:aload_1         
	//   21   41:aload           4
	//   22   43:aload           6
	//   23   45:invokevirtual   #50  <Method String cze.b(String, String)>
	//   24   48:astore          5
		s = s2;
	//   25   50:aload           5
	//   26   52:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s2))))
	//*  27   53:aload           5
	//*  28   55:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   58:ifeq            82
		{
			flag1 = false;
	//   30   61:iconst_0        
	//   31   62:istore_3        
			if("getBatchPluginUrl".equals(((Object) (s1))))
	//*  32   63:ldc1            #35  <String "getBatchPluginUrl">
	//*  33   65:aload           4
	//*  34   67:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  35   70:ifeq            79
				s = "https://configserver-dra.platform.hicloud.com/servicesupport/updateserver/data/";
	//   36   73:ldc1            #58  <String "https://configserver-dra.platform.hicloud.com/servicesupport/updateserver/data/">
	//   37   75:astore_1        
			else
	//*  38   76:goto            82
				s = "https://configserver-dra.platform.hicloud.com/servicesupport/updateserver/getLatestVersion";
	//   39   79:ldc1            #60  <String "https://configserver-dra.platform.hicloud.com/servicesupport/updateserver/getLatestVersion">
	//   40   81:astore_1        
		}
		dho.b("Login_GRSDownloadPluginUrl", new Object[] {
			"getDownloadPluginUrl=", s, ", key=", s1, ", countryCode=", s3, ", batch=", Boolean.valueOf(flag), ", grsResult=", Boolean.valueOf(flag1)
		});
	//   41   82:ldc1            #62  <String "Login_GRSDownloadPluginUrl">
	//   42   84:bipush          10
	//   43   86:anewarray       Object[]
	//   44   89:dup             
	//   45   90:iconst_0        
	//   46   91:ldc1            #64  <String "getDownloadPluginUrl=">
	//   47   93:aastore         
	//   48   94:dup             
	//   49   95:iconst_1        
	//   50   96:aload_1         
	//   51   97:aastore         
	//   52   98:dup             
	//   53   99:iconst_2        
	//   54  100:ldc1            #66  <String ", key=">
	//   55  102:aastore         
	//   56  103:dup             
	//   57  104:iconst_3        
	//   58  105:aload           4
	//   59  107:aastore         
	//   60  108:dup             
	//   61  109:iconst_4        
	//   62  110:ldc1            #68  <String ", countryCode=">
	//   63  112:aastore         
	//   64  113:dup             
	//   65  114:iconst_5        
	//   66  115:aload           6
	//   67  117:aastore         
	//   68  118:dup             
	//   69  119:bipush          6
	//   70  121:ldc1            #70  <String ", batch=">
	//   71  123:aastore         
	//   72  124:dup             
	//   73  125:bipush          7
	//   74  127:iload_2         
	//   75  128:invokestatic    #76  <Method Boolean Boolean.valueOf(boolean)>
	//   76  131:aastore         
	//   77  132:dup             
	//   78  133:bipush          8
	//   79  135:ldc1            #78  <String ", grsResult=">
	//   80  137:aastore         
	//   81  138:dup             
	//   82  139:bipush          9
	//   83  141:iload_3         
	//   84  142:invokestatic    #76  <Method Boolean Boolean.valueOf(boolean)>
	//   85  145:aastore         
	//   86  146:invokestatic    #83  <Method void dho.b(String, Object[])>
		return s;
	//   87  149:aload_1         
	//   88  150:areturn         
	}
}
