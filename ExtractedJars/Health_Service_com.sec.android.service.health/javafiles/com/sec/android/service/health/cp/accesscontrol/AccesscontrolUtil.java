// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.cp.accesscontrol;

import android.content.Context;
import android.content.pm.*;
import android.os.Binder;
import android.os.Build;
import com.sec.android.service.health.util.LOG;

public class AccesscontrolUtil
{

	public AccesscontrolUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void Object()>
	//    2    4:return          
	}

	public static boolean checkSignature(Context context, String s)
	{
		LOG.d(TAG, (new StringBuilder()).append("checkSignature: packagename ").append(s).toString());
	//    0    0:getstatic       #59  <Field Class TAG>
	//    1    3:new             #94  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #95  <Method void StringBuilder()>
	//    4   10:ldc1            #97  <String "checkSignature: packagename ">
	//    5   12:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #105 <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #111 <Method void LOG.d(Class, String)>
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(s, 64)));
	//   10   25:aload_0         
	//   11   26:invokevirtual   #117 <Method PackageManager Context.getPackageManager()>
	//   12   29:aload_1         
	//   13   30:bipush          64
	//   14   32:invokevirtual   #123 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   15   35:astore_0        
		}
	//*  16   36:aload_0         
	//*  17   37:ifnull          47
	//*  18   40:aload_0         
	//*  19   41:getfield        #128 <Field Signature[] PackageInfo.signatures>
	//*  20   44:ifnonnull       92
	//*  21   47:getstatic       #59  <Field Class TAG>
	//*  22   50:ldc1            #130 <String "pkgInfo is null">
	//*  23   52:invokestatic    #111 <Method void LOG.d(Class, String)>
	//*  24   55:iconst_0        
	//*  25   56:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  26   57:astore_0        
		{
			LOG.d(TAG, (new StringBuilder()).append("exception occured while getting packageinfo :").append(((android.content.pm.PackageManager.NameNotFoundException) (context)).getMessage()).toString());
	//   27   58:getstatic       #59  <Field Class TAG>
	//   28   61:new             #94  <Class StringBuilder>
	//   29   64:dup             
	//   30   65:invokespecial   #95  <Method void StringBuilder()>
	//   31   68:ldc1            #132 <String "exception occured while getting packageinfo :">
	//   32   70:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:aload_0         
	//   34   74:invokevirtual   #135 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//   35   77:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   36   80:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   37   83:invokestatic    #111 <Method void LOG.d(Class, String)>
			((android.content.pm.PackageManager.NameNotFoundException) (context)).printStackTrace();
	//   38   86:aload_0         
	//   39   87:invokevirtual   #138 <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
			return false;
	//   40   90:iconst_0        
	//   41   91:ireturn         
		}
		if(context == null || ((PackageInfo) (context)).signatures == null)
		{
			LOG.d(TAG, "pkgInfo is null");
		} else
		{
			s = ((String) (((PackageInfo) (context)).signatures));
	//   42   92:aload_0         
	//   43   93:getfield        #128 <Field Signature[] PackageInfo.signatures>
	//   44   96:astore_1        
			int i1;
			if(Build.TYPE.equalsIgnoreCase("eng") || Build.TYPE.equalsIgnoreCase("userdebug"))
	//*  45   97:getstatic       #143 <Field String Build.TYPE>
	//*  46  100:ldc1            #145 <String "eng">
	//*  47  102:invokevirtual   #151 <Method boolean String.equalsIgnoreCase(String)>
	//*  48  105:ifne            119
	//*  49  108:getstatic       #143 <Field String Build.TYPE>
	//*  50  111:ldc1            #153 <String "userdebug">
	//*  51  113:invokevirtual   #151 <Method boolean String.equalsIgnoreCase(String)>
	//*  52  116:ifeq            181
			{
				LOG.d(TAG, " SIGNATURES_ENG ");
	//   53  119:getstatic       #59  <Field Class TAG>
	//   54  122:ldc1            #155 <String " SIGNATURES_ENG ">
	//   55  124:invokestatic    #111 <Method void LOG.d(Class, String)>
				context = ((Context) (SIGNATURES_ENG));
	//   56  127:getstatic       #83  <Field Signature[] SIGNATURES_ENG>
	//   57  130:astore_0        
			} else
	//*  58  131:aload_1         
	//*  59  132:arraylength     
	//*  60  133:istore          4
	//*  61  135:iconst_0        
	//*  62  136:istore_2        
	//*  63  137:iload_2         
	//*  64  138:iload           4
	//*  65  140:icmpge          202
	//*  66  143:aload_1         
	//*  67  144:iload_2         
	//*  68  145:aaload          
	//*  69  146:astore          6
	//*  70  148:aload_0         
	//*  71  149:arraylength     
	//*  72  150:istore          5
	//*  73  152:iconst_0        
	//*  74  153:istore_3        
	//*  75  154:iload_3         
	//*  76  155:iload           5
	//*  77  157:icmpge          195
	//*  78  160:aload_0         
	//*  79  161:iload_3         
	//*  80  162:aaload          
	//*  81  163:aload           6
	//*  82  165:invokevirtual   #159 <Method boolean Signature.equals(Object)>
	//*  83  168:ifeq            188
	//*  84  171:getstatic       #59  <Field Class TAG>
	//*  85  174:ldc1            #161 <String " signature matched ">
	//*  86  176:invokestatic    #111 <Method void LOG.d(Class, String)>
	//*  87  179:iconst_1        
	//*  88  180:ireturn         
			{
				context = ((Context) (SIGNATURES));
	//   89  181:getstatic       #85  <Field Signature[] SIGNATURES>
	//   90  184:astore_0        
			}
			i1 = s.length;
			for(int i = 0; i < i1; i++)
			{
				Object obj = s[i];
				int j1 = context.length;
				for(int k = 0; k < j1; k++)
					if(((Signature) (context[k])).equals(((Object) (obj))))
					{
						LOG.d(TAG, " signature matched ");
						return true;
					}

	//   91  185:goto            131
	//   92  188:iload_3         
	//   93  189:iconst_1        
	//   94  190:iadd            
	//   95  191:istore_3        
			}

	//   96  192:goto            154
	//   97  195:iload_2         
	//   98  196:iconst_1        
	//   99  197:iadd            
	//  100  198:istore_2        
	//* 101  199:goto            137
			if(s.length > 0)
	//* 102  202:aload_1         
	//* 103  203:arraylength     
	//* 104  204:ifle            256
			{
				int l = s.length;
	//  105  207:aload_1         
	//  106  208:arraylength     
	//  107  209:istore_3        
				int j = 0;
	//  108  210:iconst_0        
	//  109  211:istore_2        
				while(j < l) 
	//* 110  212:iload_2         
	//* 111  213:iload_3         
	//* 112  214:icmpge          55
				{
					context = ((Context) (s[j]));
	//  113  217:aload_1         
	//  114  218:iload_2         
	//  115  219:aaload          
	//  116  220:astore_0        
					LOG.d(TAG, (new StringBuilder()).append(" signature : ").append(((Signature) (context)).toCharsString()).toString());
	//  117  221:getstatic       #59  <Field Class TAG>
	//  118  224:new             #94  <Class StringBuilder>
	//  119  227:dup             
	//  120  228:invokespecial   #95  <Method void StringBuilder()>
	//  121  231:ldc1            #163 <String " signature : ">
	//  122  233:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  123  236:aload_0         
	//  124  237:invokevirtual   #166 <Method String Signature.toCharsString()>
	//  125  240:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  126  243:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  127  246:invokestatic    #111 <Method void LOG.d(Class, String)>
					j++;
	//  128  249:iload_2         
	//  129  250:iconst_1        
	//  130  251:iadd            
	//  131  252:istore_2        
				}
			} else
	//* 132  253:goto            212
			{
				LOG.d(TAG, " no signatures");
	//  133  256:getstatic       #59  <Field Class TAG>
	//  134  259:ldc1            #168 <String " no signatures">
	//  135  261:invokestatic    #111 <Method void LOG.d(Class, String)>
				return false;
	//  136  264:iconst_0        
	//  137  265:ireturn         
			}
		}
		return false;
	}

	public static String getCallerPackage(Context context)
	{
		int i = Binder.getCallingUid();
	//    0    0:invokestatic    #176 <Method int Binder.getCallingUid()>
	//    1    3:istore_1        
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return context.getPackageManager().getPackagesForUid(i)[0];
	//    6   10:aload_0         
	//    7   11:invokevirtual   #117 <Method PackageManager Context.getPackageManager()>
	//    8   14:iload_1         
	//    9   15:invokevirtual   #180 <Method String[] PackageManager.getPackagesForUid(int)>
	//   10   18:iconst_0        
	//   11   19:aaload          
	//   12   20:areturn         
	}

	private static final String APPLICATION_TABLE = "application";
	public static final String APP_ID = "application__id";
	private static final String APP_NAME = "app_name";
	private static final String DEVMODE = "devmode_yn";
	public static final String IS_PLUGIN = "is_plugin";
	public static final int NO_PERMISSION = 0;
	public static final String PACKAGE_NAME = "package_name";
	public static final String PERMISSION = "permission";
	private static final String PERMISSION_TABLE = "application_permissions";
	public static final int READ_PERMISSION = 1;
	public static final int READ_WRITE_PERMISSION = 3;
	private static final Signature SIGNATURES[];
	private static final Signature SIGNATURES_ENG[];
	private static final Signature SIGNATURE_DEBUGKEYSTORE;
	private static final Signature SIGNATURE_DOWNLOADABLE;
	private static final Signature SIGNATURE_ENG_RELEASKEY;
	private static final Signature SIGNATURE_USER_RELEASEKEY;
	private static final Class TAG = com/sec/android/service/health/cp/accesscontrol/AccesscontrolUtil;
	public static final String URI = "uri";
	public static final int WRITE_PERMISSION = 2;
	public static final String _ID = "_id";

	static 
	{
	//    0    0:ldc1            #2   <Class AccesscontrolUtil>
	//    1    2:putstatic       #59  <Field Class TAG>
		SIGNATURE_USER_RELEASEKEY = new Signature("308204d4308203bca003020102020900e5eff0a8f66d92b3300d06092a864886f70d01010505003081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d301e170d3131303632323132323531335a170d3338313130373132323531335a3081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100e9f1edb42423201dce62e68f2159ed8ea766b43a43d348754841b72e9678ce6b03d06d31532d88f2ef2d5ba39a028de0857983cd321f5b7786c2d3699df4c0b40c8d856f147c5dc54b9d1d671d1a51b5c5364da36fc5b0fe825afb513ec7a2db862c48a6046c43c3b71a1e275155f6c30aed2a68326ac327f60160d427cf55b617230907a84edbff21cc256c628a16f15d55d49138cdf2606504e1591196ed0bdc25b7cc4f67b33fb29ec4dbb13dbe6f3467a0871a49e620067755e6f095c3bd84f8b7d1e66a8c6d1e5150f7fa9d95475dc7061a321aaf9c686b09be23ccc59b35011c6823ffd5874d8fa2a1e5d276ee5aa381187e26112c7d5562703b36210b020103a382010b30820107301d0603551d0e041604145b115b23db35655f9f77f78756961006eebe3a9e3081d70603551d230481cf3081cc80145b115b23db35655f9f77f78756961006eebe3a9ea181a8a481a53081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d820900e5eff0a8f66d92b3300c0603551d13040530030101ff300d06092a864886f70d0101050500038201010039c91877eb09c2c84445443673c77a1219c5c02e6552fa2fbad0d736bc5ab6ebaf0375e520fe9799403ecb71659b23afda1475a34ef4b2e1ffcba8d7ff385c21cb6482540bce3837e6234fd4f7dd576d7fcfe9cfa925509f772c494e1569fe44e6fcd4122e483c2caa2c639566dbcfe85ed7818d5431e73154ad453289fb56b607643919cf534fbeefbdc2009c7fcb5f9b1fa97490462363fa4bedc5e0b9d157e448e6d0e7cfa31f1a2faa9378d03c8d1163d3803bc69bf24ec77ce7d559abcaf8d345494abf0e3276f0ebd2aa08e4f4f6f5aaea4bc523d8cc8e2c9200ba551dd3d4e15d5921303ca9333f42f992ddb70c2958e776c12d7e3b7bd74222eb5c7a");
	//    2    5:new             #61  <Class Signature>
	//    3    8:dup             
	//    4    9:ldc1            #63  <String "308204d4308203bca003020102020900e5eff0a8f66d92b3300d06092a864886f70d01010505003081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d301e170d3131303632323132323531335a170d3338313130373132323531335a3081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100e9f1edb42423201dce62e68f2159ed8ea766b43a43d348754841b72e9678ce6b03d06d31532d88f2ef2d5ba39a028de0857983cd321f5b7786c2d3699df4c0b40c8d856f147c5dc54b9d1d671d1a51b5c5364da36fc5b0fe825afb513ec7a2db862c48a6046c43c3b71a1e275155f6c30aed2a68326ac327f60160d427cf55b617230907a84edbff21cc256c628a16f15d55d49138cdf2606504e1591196ed0bdc25b7cc4f67b33fb29ec4dbb13dbe6f3467a0871a49e620067755e6f095c3bd84f8b7d1e66a8c6d1e5150f7fa9d95475dc7061a321aaf9c686b09be23ccc59b35011c6823ffd5874d8fa2a1e5d276ee5aa381187e26112c7d5562703b36210b020103a382010b30820107301d0603551d0e041604145b115b23db35655f9f77f78756961006eebe3a9e3081d70603551d230481cf3081cc80145b115b23db35655f9f77f78756961006eebe3a9ea181a8a481a53081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d820900e5eff0a8f66d92b3300c0603551d13040530030101ff300d06092a864886f70d0101050500038201010039c91877eb09c2c84445443673c77a1219c5c02e6552fa2fbad0d736bc5ab6ebaf0375e520fe9799403ecb71659b23afda1475a34ef4b2e1ffcba8d7ff385c21cb6482540bce3837e6234fd4f7dd576d7fcfe9cfa925509f772c494e1569fe44e6fcd4122e483c2caa2c639566dbcfe85ed7818d5431e73154ad453289fb56b607643919cf534fbeefbdc2009c7fcb5f9b1fa97490462363fa4bedc5e0b9d157e448e6d0e7cfa31f1a2faa9378d03c8d1163d3803bc69bf24ec77ce7d559abcaf8d345494abf0e3276f0ebd2aa08e4f4f6f5aaea4bc523d8cc8e2c9200ba551dd3d4e15d5921303ca9333f42f992ddb70c2958e776c12d7e3b7bd74222eb5c7a">
	//    5   11:invokespecial   #67  <Method void Signature(String)>
	//    6   14:putstatic       #69  <Field Signature SIGNATURE_USER_RELEASEKEY>
		SIGNATURE_DEBUGKEYSTORE = new Signature("308201e53082014ea00302010202044f54468b300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3132303330353034353232375a170d3432303232363034353232375a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d00308189028181008a53be36d02befe1d152724281630bd1c42eff0edf5fdca8eb944f536ab3f54dca9b22cfb421b37706a4ad259101815723202b359250cf6c59905032798273462bfa3f9f1881f7475ee5b25849edefac81085815f42383a44cb2be1bfd5c1f049ef42f5818f35fe0b1131c769cee347d558395a5fa87c3d425b2b9c819cf91870203010001300d06092a864886f70d0101050500038181000512992268a01e0941481931f3f9b6647fbe25ee0bc9648f35d56c55f8cfa6c935fb3d435125fd60ef566769ac7e64fe2823409461ca7a04570c43baaab3fb877bf3a6a8dd9ef7e69944f65b0e5e36f2ac2bf085fdeda063898855ea2ce84c60655d824844fe1659a77c12604c3fb84d41df6f1a7705a1b9962ac2fdc9933122");
	//    7   17:new             #61  <Class Signature>
	//    8   20:dup             
	//    9   21:ldc1            #71  <String "308201e53082014ea00302010202044f54468b300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3132303330353034353232375a170d3432303232363034353232375a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d00308189028181008a53be36d02befe1d152724281630bd1c42eff0edf5fdca8eb944f536ab3f54dca9b22cfb421b37706a4ad259101815723202b359250cf6c59905032798273462bfa3f9f1881f7475ee5b25849edefac81085815f42383a44cb2be1bfd5c1f049ef42f5818f35fe0b1131c769cee347d558395a5fa87c3d425b2b9c819cf91870203010001300d06092a864886f70d0101050500038181000512992268a01e0941481931f3f9b6647fbe25ee0bc9648f35d56c55f8cfa6c935fb3d435125fd60ef566769ac7e64fe2823409461ca7a04570c43baaab3fb877bf3a6a8dd9ef7e69944f65b0e5e36f2ac2bf085fdeda063898855ea2ce84c60655d824844fe1659a77c12604c3fb84d41df6f1a7705a1b9962ac2fdc9933122">
	//   10   23:invokespecial   #67  <Method void Signature(String)>
	//   11   26:putstatic       #73  <Field Signature SIGNATURE_DEBUGKEYSTORE>
		SIGNATURE_ENG_RELEASKEY = new Signature("308204a830820390a003020102020900936eacbe07f201df300d06092a864886f70d0101050500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303232393031333334365a170d3335303731373031333334365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6931904dec60b24b1edc762e0d9d8253e3ecd6ceb1de2ff068ca8e8bca8cd6bd3786ea70aa76ce60ebb0f993559ffd93e77a943e7e83d4b64b8e4fea2d3e656f1e267a81bbfb230b578c20443be4c7218b846f5211586f038a14e89c2be387f8ebecf8fcac3da1ee330c9ea93d0a7c3dc4af350220d50080732e0809717ee6a053359e6a694ec2cb3f284a0a466c87a94d83b31093a67372e2f6412c06e6d42f15818dffe0381cc0cd444da6cddc3b82458194801b32564134fbfde98c9287748dbf5676a540d8154c8bbca07b9e247553311c46b9af76fdeeccc8e69e7c8a2d08e782620943f99727d3c04fe72991d99df9bae38a0b2177fa31d5b6afee91f020103a381fc3081f9301d0603551d0e04160414485900563d272c46ae118605a47419ac09ca8c113081c90603551d230481c13081be8014485900563d272c46ae118605a47419ac09ca8c11a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900936eacbe07f201df300c0603551d13040530030101ff300d06092a864886f70d010105050003820101007aaf968ceb50c441055118d0daabaf015b8a765a27a715a2c2b44f221415ffdace03095abfa42df70708726c2069e5c36eddae0400be29452c084bc27eb6a17eac9dbe182c204eb15311f455d824b656dbe4dc2240912d7586fe88951d01a8feb5ae5a4260535df83431052422468c36e22c2a5ef994d61dd7306ae4c9f6951ba3c12f1d1914ddc61f1a62da2df827f603fea5603b2c540dbd7c019c36bab29a4271c117df523cdbc5f3817a49e0efa60cbd7f74177e7a4f193d43f4220772666e4c4d83e1bd5a86087cf34f2dec21e245ca6c2bb016e683638050d2c430eea7c26a1c49d3760a58ab7f1a82cc938b4831384324bd0401fa12163a50570e684d");
	//   12   29:new             #61  <Class Signature>
	//   13   32:dup             
	//   14   33:ldc1            #75  <String "308204a830820390a003020102020900936eacbe07f201df300d06092a864886f70d0101050500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303232393031333334365a170d3335303731373031333334365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6931904dec60b24b1edc762e0d9d8253e3ecd6ceb1de2ff068ca8e8bca8cd6bd3786ea70aa76ce60ebb0f993559ffd93e77a943e7e83d4b64b8e4fea2d3e656f1e267a81bbfb230b578c20443be4c7218b846f5211586f038a14e89c2be387f8ebecf8fcac3da1ee330c9ea93d0a7c3dc4af350220d50080732e0809717ee6a053359e6a694ec2cb3f284a0a466c87a94d83b31093a67372e2f6412c06e6d42f15818dffe0381cc0cd444da6cddc3b82458194801b32564134fbfde98c9287748dbf5676a540d8154c8bbca07b9e247553311c46b9af76fdeeccc8e69e7c8a2d08e782620943f99727d3c04fe72991d99df9bae38a0b2177fa31d5b6afee91f020103a381fc3081f9301d0603551d0e04160414485900563d272c46ae118605a47419ac09ca8c113081c90603551d230481c13081be8014485900563d272c46ae118605a47419ac09ca8c11a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900936eacbe07f201df300c0603551d13040530030101ff300d06092a864886f70d010105050003820101007aaf968ceb50c441055118d0daabaf015b8a765a27a715a2c2b44f221415ffdace03095abfa42df70708726c2069e5c36eddae0400be29452c084bc27eb6a17eac9dbe182c204eb15311f455d824b656dbe4dc2240912d7586fe88951d01a8feb5ae5a4260535df83431052422468c36e22c2a5ef994d61dd7306ae4c9f6951ba3c12f1d1914ddc61f1a62da2df827f603fea5603b2c540dbd7c019c36bab29a4271c117df523cdbc5f3817a49e0efa60cbd7f74177e7a4f193d43f4220772666e4c4d83e1bd5a86087cf34f2dec21e245ca6c2bb016e683638050d2c430eea7c26a1c49d3760a58ab7f1a82cc938b4831384324bd0401fa12163a50570e684d">
	//   15   35:invokespecial   #67  <Method void Signature(String)>
	//   16   38:putstatic       #77  <Field Signature SIGNATURE_ENG_RELEASKEY>
		SIGNATURE_DOWNLOADABLE = new Signature("308204d4308203bca003020102020900d20995a79c0daad6300d06092a864886f70d01010505003081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d301e170d3131303632323132323531325a170d3338313130373132323531325a3081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100c986384a3e1f2fb206670e78ef232215c0d26f45a22728db99a44da11c35ac33a71fe071c4a2d6825a9b4c88b333ed96f3c5e6c666d60f3ee94c490885abcf8dc660f707aabc77ead3e2d0d8aee8108c15cd260f2e85042c28d2f292daa3c6da0c7bf2391db7841aade8fdf0c9d0defcf77124e6d2de0a9e0d2da746c3670e4ffcdc85b701bb4744861b96ff7311da3603c5a10336e55ffa34b4353eedc85f51015e1518c67e309e39f87639ff178107f109cd18411a6077f26964b6e63f8a70b9619db04306a323c1a1d23af867e19f14f570ffe573d0e3a0c2b30632aaec3173380994be1e341e3a90bd2e4b615481f46db39ea83816448ec35feb1735c1f3020103a382010b30820107301d0603551d0e04160414932c3af70b627a0c7610b5a0e7427d6cfaea3f1e3081d70603551d230481cf3081cc8014932c3af70b627a0c7610b5a0e7427d6cfaea3f1ea181a8a481a53081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d820900d20995a79c0daad6300c0603551d13040530030101ff300d06092a864886f70d01010505000382010100329601fe40e036a4a86cc5d49dd8c1b5415998e72637538b0d430369ac51530f63aace8c019a1a66616a2f1bb2c5fabd6f313261f380e3471623f053d9e3c53f5fd6d1965d7b000e4dc244c1b27e2fe9a323ff077f52c4675e86247aa801187137e30c9bbf01c567a4299db4bf0b25b7d7107a7b81ee102f72ff47950164e26752e114c42f8b9d2a42e7308897ec640ea1924ed13abbe9d120912b62f4926493a86db94c0b46f44c6161d58c2f648164890c512dfb28d42c855bf470dbee2dab6960cad04e81f71525ded46cdd0f359f99c460db9f007d96ce83b4b218ac2d82c48f12608d469733f05a3375594669ccbf8a495544d6c5701e9369c08c810158");
	//   17   41:new             #61  <Class Signature>
	//   18   44:dup             
	//   19   45:ldc1            #79  <String "308204d4308203bca003020102020900d20995a79c0daad6300d06092a864886f70d01010505003081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d301e170d3131303632323132323531325a170d3338313130373132323531325a3081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100c986384a3e1f2fb206670e78ef232215c0d26f45a22728db99a44da11c35ac33a71fe071c4a2d6825a9b4c88b333ed96f3c5e6c666d60f3ee94c490885abcf8dc660f707aabc77ead3e2d0d8aee8108c15cd260f2e85042c28d2f292daa3c6da0c7bf2391db7841aade8fdf0c9d0defcf77124e6d2de0a9e0d2da746c3670e4ffcdc85b701bb4744861b96ff7311da3603c5a10336e55ffa34b4353eedc85f51015e1518c67e309e39f87639ff178107f109cd18411a6077f26964b6e63f8a70b9619db04306a323c1a1d23af867e19f14f570ffe573d0e3a0c2b30632aaec3173380994be1e341e3a90bd2e4b615481f46db39ea83816448ec35feb1735c1f3020103a382010b30820107301d0603551d0e04160414932c3af70b627a0c7610b5a0e7427d6cfaea3f1e3081d70603551d230481cf3081cc8014932c3af70b627a0c7610b5a0e7427d6cfaea3f1ea181a8a481a53081a2310b3009060355040613024b52311430120603550408130b536f757468204b6f726561311330110603550407130a5375776f6e2043697479311c301a060355040a131353616d73756e6720436f72706f726174696f6e310c300a060355040b1303444d43311530130603550403130c53616d73756e6720436572743125302306092a864886f70d0109011616616e64726f69642e6f734073616d73756e672e636f6d820900d20995a79c0daad6300c0603551d13040530030101ff300d06092a864886f70d01010505000382010100329601fe40e036a4a86cc5d49dd8c1b5415998e72637538b0d430369ac51530f63aace8c019a1a66616a2f1bb2c5fabd6f313261f380e3471623f053d9e3c53f5fd6d1965d7b000e4dc244c1b27e2fe9a323ff077f52c4675e86247aa801187137e30c9bbf01c567a4299db4bf0b25b7d7107a7b81ee102f72ff47950164e26752e114c42f8b9d2a42e7308897ec640ea1924ed13abbe9d120912b62f4926493a86db94c0b46f44c6161d58c2f648164890c512dfb28d42c855bf470dbee2dab6960cad04e81f71525ded46cdd0f359f99c460db9f007d96ce83b4b218ac2d82c48f12608d469733f05a3375594669ccbf8a495544d6c5701e9369c08c810158">
	//   20   47:invokespecial   #67  <Method void Signature(String)>
	//   21   50:putstatic       #81  <Field Signature SIGNATURE_DOWNLOADABLE>
		SIGNATURES_ENG = (new Signature[] {
			SIGNATURE_USER_RELEASEKEY, SIGNATURE_DOWNLOADABLE, SIGNATURE_DEBUGKEYSTORE, SIGNATURE_ENG_RELEASKEY
		});
	//   22   53:iconst_4        
	//   23   54:anewarray       Signature[]
	//   24   57:dup             
	//   25   58:iconst_0        
	//   26   59:getstatic       #69  <Field Signature SIGNATURE_USER_RELEASEKEY>
	//   27   62:aastore         
	//   28   63:dup             
	//   29   64:iconst_1        
	//   30   65:getstatic       #81  <Field Signature SIGNATURE_DOWNLOADABLE>
	//   31   68:aastore         
	//   32   69:dup             
	//   33   70:iconst_2        
	//   34   71:getstatic       #73  <Field Signature SIGNATURE_DEBUGKEYSTORE>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_3        
	//   38   77:getstatic       #77  <Field Signature SIGNATURE_ENG_RELEASKEY>
	//   39   80:aastore         
	//   40   81:putstatic       #83  <Field Signature[] SIGNATURES_ENG>
		SIGNATURES = (new Signature[] {
			SIGNATURE_USER_RELEASEKEY, SIGNATURE_DOWNLOADABLE
		});
	//   41   84:iconst_2        
	//   42   85:anewarray       Signature[]
	//   43   88:dup             
	//   44   89:iconst_0        
	//   45   90:getstatic       #69  <Field Signature SIGNATURE_USER_RELEASEKEY>
	//   46   93:aastore         
	//   47   94:dup             
	//   48   95:iconst_1        
	//   49   96:getstatic       #81  <Field Signature SIGNATURE_DOWNLOADABLE>
	//   50   99:aastore         
	//   51  100:putstatic       #85  <Field Signature[] SIGNATURES>
	//*  52  103:return          
	}
}