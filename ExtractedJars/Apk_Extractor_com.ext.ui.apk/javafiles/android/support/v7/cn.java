// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.*;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import com.ext.ui.ExtractorApplication;
import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

// Referenced classes of package android.support.v7:
//			ck, ci, cj, cm

public class cn
{

	private cn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static cn a()
	{
		if(a == null)
	//*   0    0:getstatic       #26  <Field cn a>
	//*   1    3:ifnonnull       16
			a = new cn();
	//    2    6:new             #2   <Class cn>
	//    3    9:dup             
	//    4   10:invokespecial   #27  <Method void cn()>
	//    5   13:putstatic       #26  <Field cn a>
		return a;
	//    6   16:getstatic       #26  <Field cn a>
	//    7   19:areturn         
	}

	public String a(int i)
	{
		return ExtractorApplication.a.getResources().getString(i);
	//    0    0:getstatic       #33  <Field Context ExtractorApplication.a>
	//    1    3:invokevirtual   #39  <Method Resources Context.getResources()>
	//    2    6:iload_1         
	//    3    7:invokevirtual   #44  <Method String Resources.getString(int)>
	//    4   10:areturn         
	}

	public String a(Object obj)
	{
		Object obj1;
		String s;
		String s1;
		String s2;
		String s3;
		Object obj3;
		obj3 = ((Object) ((ck)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #51  <Class ck>
	//    2    4:astore          7
		if(obj3 == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       30
		{
			ci.a("Utils : ", "letsExtract , Item is null : Abort ");
	//    5   11:ldc1            #53  <String "Utils : ">
	//    6   13:ldc1            #55  <String "letsExtract , Item is null : Abort ">
	//    7   15:invokestatic    #60  <Method void ci.a(String, String)>
			return ExtractorApplication.a.getResources().getString(0x7f0d003f);
	//    8   18:getstatic       #33  <Field Context ExtractorApplication.a>
	//    9   21:invokevirtual   #39  <Method Resources Context.getResources()>
	//   10   24:ldc1            #61  <Int 0x7f0d003f>
	//   11   26:invokevirtual   #44  <Method String Resources.getString(int)>
	//   12   29:areturn         
		}
		if(((ck) (obj3)).b())
	//*  13   30:aload           7
	//*  14   32:invokevirtual   #65  <Method boolean ck.b()>
	//*  15   35:ifeq            48
		{
			ci.a("Utils : ", " Ad cannot be extracted");
	//   16   38:ldc1            #53  <String "Utils : ">
	//   17   40:ldc1            #67  <String " Ad cannot be extracted">
	//   18   42:invokestatic    #60  <Method void ci.a(String, String)>
			return "";
	//   19   45:ldc1            #69  <String "">
	//   20   47:areturn         
		}
		s2 = ((ck) (obj3)).d();
	//   21   48:aload           7
	//   22   50:invokevirtual   #73  <Method String ck.d()>
	//   23   53:astore          5
		s3 = ((ck) (obj3)).e();
	//   24   55:aload           7
	//   25   57:invokevirtual   #76  <Method String ck.e()>
	//   26   60:astore          6
		s = "";
	//   27   62:ldc1            #69  <String "">
	//   28   64:astore_3        
		s1 = "";
	//   29   65:ldc1            #69  <String "">
	//   30   67:astore          4
		obj1 = ((Object) (s1));
	//   31   69:aload           4
	//   32   71:astore_2        
		obj = ((Object) (s));
	//   33   72:aload_3         
	//   34   73:astore_1        
		PackageInfo packageinfo = ExtractorApplication.a.getPackageManager().getPackageInfo(s3, 0);
	//   35   74:getstatic       #33  <Field Context ExtractorApplication.a>
	//   36   77:invokevirtual   #80  <Method PackageManager Context.getPackageManager()>
	//   37   80:aload           6
	//   38   82:iconst_0        
	//   39   83:invokevirtual   #86  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   40   86:astore          8
		obj1 = ((Object) (s1));
	//   41   88:aload           4
	//   42   90:astore_2        
		obj = ((Object) (s));
	//   43   91:aload_3         
	//   44   92:astore_1        
		s = packageinfo.versionName;
	//   45   93:aload           8
	//   46   95:getfield        #92  <Field String PackageInfo.versionName>
	//   47   98:astore_3        
		obj1 = ((Object) (s1));
	//   48   99:aload           4
	//   49  101:astore_2        
		obj = ((Object) (s));
	//   50  102:aload_3         
	//   51  103:astore_1        
		s1 = (new StringBuilder()).append("").append(packageinfo.versionCode).toString();
	//   52  104:new             #94  <Class StringBuilder>
	//   53  107:dup             
	//   54  108:invokespecial   #95  <Method void StringBuilder()>
	//   55  111:ldc1            #69  <String "">
	//   56  113:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   57  116:aload           8
	//   58  118:getfield        #103 <Field int PackageInfo.versionCode>
	//   59  121:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   60  124:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   61  127:astore          4
		obj1 = ((Object) (s1));
	//   62  129:aload           4
	//   63  131:astore_2        
		obj = ((Object) (s));
	//   64  132:aload_3         
	//   65  133:astore_1        
		Log.i("123456", (new StringBuilder()).append("path : ").append(((ck) (obj3)).f()).toString());
	//   66  134:ldc1            #111 <String "123456">
	//   67  136:new             #94  <Class StringBuilder>
	//   68  139:dup             
	//   69  140:invokespecial   #95  <Method void StringBuilder()>
	//   70  143:ldc1            #113 <String "path : ">
	//   71  145:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   72  148:aload           7
	//   73  150:invokevirtual   #116 <Method String ck.f()>
	//   74  153:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   75  156:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   76  159:invokestatic    #122 <Method int Log.i(String, String)>
	//   77  162:pop             
		obj = ((Object) (s));
	//   78  163:aload_3         
	//   79  164:astore_1        
		obj1 = ((Object) (s1));
	//   80  165:aload           4
	//   81  167:astore_2        
_L2:
		ci.a("Utils : ", (new StringBuilder()).append("Extracting : ").append(s2).append(" ").append(s3).toString());
	//   82  168:ldc1            #53  <String "Utils : ">
	//   83  170:new             #94  <Class StringBuilder>
	//   84  173:dup             
	//   85  174:invokespecial   #95  <Method void StringBuilder()>
	//   86  177:ldc1            #124 <String "Extracting : ">
	//   87  179:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   88  182:aload           5
	//   89  184:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   90  187:ldc1            #126 <String " ">
	//   91  189:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   92  192:aload           6
	//   93  194:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   94  197:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   95  200:invokestatic    #60  <Method void ci.a(String, String)>
		File file = new File(((ck) (obj3)).f());
	//   96  203:new             #128 <Class File>
	//   97  206:dup             
	//   98  207:aload           7
	//   99  209:invokevirtual   #116 <Method String ck.f()>
	//  100  212:invokespecial   #131 <Method void File(String)>
	//  101  215:astore          4
		String s4 = cj.a().c(cj.f, "0:1:");
	//  102  217:invokestatic    #136 <Method cj cj.a()>
	//  103  220:getstatic       #138 <Field String cj.f>
	//  104  223:ldc1            #140 <String "0:1:">
	//  105  225:invokevirtual   #144 <Method String cj.c(String, String)>
	//  106  228:astore          8
		obj3 = ((Object) (new StringBuffer()));
	//  107  230:new             #146 <Class StringBuffer>
	//  108  233:dup             
	//  109  234:invokespecial   #147 <Method void StringBuffer()>
	//  110  237:astore          7
		Object obj2;
		if(s4.contains("0"))
	//* 111  239:aload           8
	//* 112  241:ldc1            #149 <String "0">
	//* 113  243:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//* 114  246:ifeq            555
			obj2 = ((Object) (s2));
	//  115  249:aload           5
	//  116  251:astore_3        
		else
	//* 117  252:aload           7
	//* 118  254:aload_3         
	//* 119  255:invokevirtual   #158 <Method StringBuffer StringBuffer.append(String)>
	//* 120  258:pop             
	//* 121  259:aload           8
	//* 122  261:ldc1            #160 <String "1">
	//* 123  263:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//* 124  266:ifeq            567
	//* 125  269:new             #94  <Class StringBuilder>
	//* 126  272:dup             
	//* 127  273:invokespecial   #95  <Method void StringBuilder()>
	//* 128  276:astore          5
	//* 129  278:aload           8
	//* 130  280:ldc1            #149 <String "0">
	//* 131  282:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//* 132  285:ifeq            561
	//* 133  288:ldc1            #162 <String "_">
	//* 134  290:astore_3        
	//* 135  291:aload           5
	//* 136  293:aload_3         
	//* 137  294:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 138  297:aload           6
	//* 139  299:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 140  302:invokevirtual   #109 <Method String StringBuilder.toString()>
	//* 141  305:astore_3        
	//* 142  306:aload           7
	//* 143  308:aload_3         
	//* 144  309:invokevirtual   #158 <Method StringBuffer StringBuffer.append(String)>
	//* 145  312:pop             
	//* 146  313:aload           8
	//* 147  315:ldc1            #164 <String "2">
	//* 148  317:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//* 149  320:ifeq            573
	//* 150  323:new             #94  <Class StringBuilder>
	//* 151  326:dup             
	//* 152  327:invokespecial   #95  <Method void StringBuilder()>
	//* 153  330:ldc1            #162 <String "_">
	//* 154  332:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 155  335:aload_1         
	//* 156  336:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 157  339:invokevirtual   #109 <Method String StringBuilder.toString()>
	//* 158  342:astore_1        
	//* 159  343:aload           7
	//* 160  345:aload_1         
	//* 161  346:invokevirtual   #158 <Method StringBuffer StringBuffer.append(String)>
	//* 162  349:pop             
	//* 163  350:aload           8
	//* 164  352:ldc1            #166 <String "3">
	//* 165  354:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//* 166  357:ifeq            579
	//* 167  360:new             #94  <Class StringBuilder>
	//* 168  363:dup             
	//* 169  364:invokespecial   #95  <Method void StringBuilder()>
	//* 170  367:ldc1            #168 <String "_V">
	//* 171  369:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 172  372:aload_2         
	//* 173  373:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 174  376:invokevirtual   #109 <Method String StringBuilder.toString()>
	//* 175  379:astore_1        
	//* 176  380:aload           7
	//* 177  382:aload_1         
	//* 178  383:invokevirtual   #158 <Method StringBuffer StringBuffer.append(String)>
	//* 179  386:pop             
	//* 180  387:new             #128 <Class File>
	//* 181  390:dup             
	//* 182  391:new             #94  <Class StringBuilder>
	//* 183  394:dup             
	//* 184  395:invokespecial   #95  <Method void StringBuilder()>
	//* 185  398:invokestatic    #171 <Method String cm.d()>
	//* 186  401:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 187  404:aload           7
	//* 188  406:invokevirtual   #172 <Method String StringBuffer.toString()>
	//* 189  409:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 190  412:ldc1            #174 <String ".apk">
	//* 191  414:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 192  417:invokevirtual   #109 <Method String StringBuilder.toString()>
	//* 193  420:invokespecial   #131 <Method void File(String)>
	//* 194  423:astore_1        
	//* 195  424:ldc1            #53  <String "Utils : ">
	//* 196  426:new             #94  <Class StringBuilder>
	//* 197  429:dup             
	//* 198  430:invokespecial   #95  <Method void StringBuilder()>
	//* 199  433:ldc1            #176 <String "check :">
	//* 200  435:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 201  438:aload_1         
	//* 202  439:invokevirtual   #179 <Method String File.getAbsolutePath()>
	//* 203  442:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 204  445:invokevirtual   #109 <Method String StringBuilder.toString()>
	//* 205  448:invokestatic    #60  <Method void ci.a(String, String)>
	//* 206  451:new             #128 <Class File>
	//* 207  454:dup             
	//* 208  455:invokestatic    #171 <Method String cm.d()>
	//* 209  458:invokespecial   #131 <Method void File(String)>
	//* 210  461:astore_2        
	//* 211  462:aload_2         
	//* 212  463:invokevirtual   #182 <Method boolean File.exists()>
	//* 213  466:ifne            474
	//* 214  469:aload_2         
	//* 215  470:invokevirtual   #185 <Method boolean File.mkdirs()>
	//* 216  473:pop             
	//* 217  474:new             #187 <Class FileInputStream>
	//* 218  477:dup             
	//* 219  478:aload           4
	//* 220  480:invokespecial   #190 <Method void FileInputStream(File)>
	//* 221  483:invokevirtual   #194 <Method FileChannel FileInputStream.getChannel()>
	//* 222  486:astore_2        
	//* 223  487:new             #196 <Class FileOutputStream>
	//* 224  490:dup             
	//* 225  491:aload_1         
	//* 226  492:invokespecial   #197 <Method void FileOutputStream(File)>
	//* 227  495:invokevirtual   #198 <Method FileChannel FileOutputStream.getChannel()>
	//* 228  498:astore_3        
	//* 229  499:aload_3         
	//* 230  500:aload_2         
	//* 231  501:lconst_0        
	//* 232  502:aload_2         
	//* 233  503:invokevirtual   #204 <Method long FileChannel.size()>
	//* 234  506:invokevirtual   #208 <Method long FileChannel.transferFrom(java.nio.channels.ReadableByteChannel, long, long)>
	//* 235  509:pop2            
	//* 236  510:aload_2         
	//* 237  511:invokevirtual   #211 <Method void FileChannel.close()>
	//* 238  514:aload_3         
	//* 239  515:invokevirtual   #211 <Method void FileChannel.close()>
	//* 240  518:ldc1            #213 <String "extract">
	//* 241  520:new             #94  <Class StringBuilder>
	//* 242  523:dup             
	//* 243  524:invokespecial   #95  <Method void StringBuilder()>
	//* 244  527:ldc1            #69  <String "">
	//* 245  529:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 246  532:aload           6
	//* 247  534:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 248  537:ldc1            #215 <String " extracted">
	//* 249  539:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 250  542:invokevirtual   #109 <Method String StringBuilder.toString()>
	//* 251  545:invokestatic    #60  <Method void ci.a(String, String)>
	//* 252  548:aload_1         
	//* 253  549:invokevirtual   #179 <Method String File.getAbsolutePath()>
	//* 254  552:astore_1        
	//* 255  553:aload_1         
	//* 256  554:areturn         
			obj2 = "";
	//  257  555:ldc1            #69  <String "">
	//  258  557:astore_3        
		((StringBuffer) (obj3)).append(((String) (obj2)));
		if(s4.contains("1"))
		{
			StringBuilder stringbuilder = new StringBuilder();
			if(s4.contains("0"))
				obj2 = "_";
			else
	//* 259  558:goto            252
				obj2 = "";
	//  260  561:ldc1            #69  <String "">
	//  261  563:astore_3        
			obj2 = ((Object) (stringbuilder.append(((String) (obj2))).append(s3).toString()));
		} else
	//* 262  564:goto            291
		{
			obj2 = "";
	//  263  567:ldc1            #69  <String "">
	//  264  569:astore_3        
		}
		((StringBuffer) (obj3)).append(((String) (obj2)));
		if(s4.contains("2"))
			obj = ((Object) ((new StringBuilder()).append("_").append(((String) (obj))).toString()));
		else
	//* 265  570:goto            306
			obj = "";
	//  266  573:ldc1            #69  <String "">
	//  267  575:astore_1        
		((StringBuffer) (obj3)).append(((String) (obj)));
		if(s4.contains("3"))
			obj = ((Object) ((new StringBuilder()).append("_V").append(((String) (obj1))).toString()));
		else
	//* 268  576:goto            343
			obj = "";
	//  269  579:ldc1            #69  <String "">
	//  270  581:astore_1        
		((StringBuffer) (obj3)).append(((String) (obj)));
		obj = ((Object) (new File((new StringBuilder()).append(cm.d()).append(((StringBuffer) (obj3)).toString()).append(".apk").toString())));
		ci.a("Utils : ", (new StringBuilder()).append("check :").append(((File) (obj)).getAbsolutePath()).toString());
		obj1 = ((Object) (new File(cm.d())));
		if(!((File) (obj1)).exists())
			((File) (obj1)).mkdirs();
		try
		{
			obj1 = ((Object) ((new FileInputStream(file)).getChannel()));
			obj2 = ((Object) ((new FileOutputStream(((File) (obj)))).getChannel()));
			((FileChannel) (obj2)).transferFrom(((java.nio.channels.ReadableByteChannel) (obj1)), 0L, ((FileChannel) (obj1)).size());
			((FileChannel) (obj1)).close();
			((FileChannel) (obj2)).close();
			ci.a("extract", (new StringBuilder()).append("").append(s3).append(" extracted").toString());
			obj = ((Object) (((File) (obj)).getAbsolutePath()));
		}
	//* 271  582:goto            380
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 272  585:astore_1        
		{
			((Exception) (obj)).printStackTrace();
	//  273  586:aload_1         
	//  274  587:invokevirtual   #218 <Method void Exception.printStackTrace()>
			ci.a("Utils : ", (new StringBuilder()).append("Error occured while extracting: ").append(((Exception) (obj)).getLocalizedMessage()).toString());
	//  275  590:ldc1            #53  <String "Utils : ">
	//  276  592:new             #94  <Class StringBuilder>
	//  277  595:dup             
	//  278  596:invokespecial   #95  <Method void StringBuilder()>
	//  279  599:ldc1            #220 <String "Error occured while extracting: ">
	//  280  601:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  281  604:aload_1         
	//  282  605:invokevirtual   #223 <Method String Exception.getLocalizedMessage()>
	//  283  608:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  284  611:invokevirtual   #109 <Method String StringBuilder.toString()>
	//  285  614:invokestatic    #60  <Method void ci.a(String, String)>
			return ExtractorApplication.a.getResources().getString(0x7f0d003f);
	//  286  617:getstatic       #33  <Field Context ExtractorApplication.a>
	//  287  620:invokevirtual   #39  <Method Resources Context.getResources()>
	//  288  623:ldc1            #61  <Int 0x7f0d003f>
	//  289  625:invokevirtual   #44  <Method String Resources.getString(int)>
	//  290  628:areturn         
		}
		return ((String) (obj));
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
	//  291  629:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//* 292  630:goto            168
	}

	public void a(Context context)
	{
		String s = cj.a().c(cj.f, "0:1:");
	//    0    0:invokestatic    #136 <Method cj cj.a()>
	//    1    3:getstatic       #138 <Field String cj.f>
	//    2    6:ldc1            #140 <String "0:1:">
	//    3    8:invokevirtual   #144 <Method String cj.c(String, String)>
	//    4   11:astore_2        
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
	//    5   12:new             #226 <Class android.app.AlertDialog$Builder>
	//    6   15:dup             
	//    7   16:aload_1         
	//    8   17:invokespecial   #228 <Method void android.app.AlertDialog$Builder(Context)>
	//    9   20:astore_3        
		Object obj = ((Object) (((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0b002d, ((android.view.ViewGroup) (null)))));
	//   10   21:aload_1         
	//   11   22:ldc1            #230 <String "layout_inflater">
	//   12   24:invokevirtual   #234 <Method Object Context.getSystemService(String)>
	//   13   27:checkcast       #236 <Class LayoutInflater>
	//   14   30:ldc1            #237 <Int 0x7f0b002d>
	//   15   32:aconst_null     
	//   16   33:invokevirtual   #241 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   17   36:astore          6
		builder.setView(((View) (obj)));
	//   18   38:aload_3         
	//   19   39:aload           6
	//   20   41:invokevirtual   #245 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
	//   21   44:pop             
		context = ((Context) ((CheckBox)((View) (obj)).findViewById(0x7f090032)));
	//   22   45:aload           6
	//   23   47:ldc1            #246 <Int 0x7f090032>
	//   24   49:invokevirtual   #252 <Method View View.findViewById(int)>
	//   25   52:checkcast       #254 <Class CheckBox>
	//   26   55:astore_1        
		CheckBox checkbox = (CheckBox)((View) (obj)).findViewById(0x7f090033);
	//   27   56:aload           6
	//   28   58:ldc1            #255 <Int 0x7f090033>
	//   29   60:invokevirtual   #252 <Method View View.findViewById(int)>
	//   30   63:checkcast       #254 <Class CheckBox>
	//   31   66:astore          4
		CheckBox checkbox1 = (CheckBox)((View) (obj)).findViewById(0x7f090034);
	//   32   68:aload           6
	//   33   70:ldc2            #256 <Int 0x7f090034>
	//   34   73:invokevirtual   #252 <Method View View.findViewById(int)>
	//   35   76:checkcast       #254 <Class CheckBox>
	//   36   79:astore          5
		obj = ((Object) ((CheckBox)((View) (obj)).findViewById(0x7f090035)));
	//   37   81:aload           6
	//   38   83:ldc2            #257 <Int 0x7f090035>
	//   39   86:invokevirtual   #252 <Method View View.findViewById(int)>
	//   40   89:checkcast       #254 <Class CheckBox>
	//   41   92:astore          6
		((CheckBox) (context)).setChecked(s.contains("0"));
	//   42   94:aload_1         
	//   43   95:aload_2         
	//   44   96:ldc1            #149 <String "0">
	//   45   98:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//   46  101:invokevirtual   #261 <Method void CheckBox.setChecked(boolean)>
		checkbox.setChecked(s.contains("1"));
	//   47  104:aload           4
	//   48  106:aload_2         
	//   49  107:ldc1            #160 <String "1">
	//   50  109:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//   51  112:invokevirtual   #261 <Method void CheckBox.setChecked(boolean)>
		checkbox1.setChecked(s.contains("2"));
	//   52  115:aload           5
	//   53  117:aload_2         
	//   54  118:ldc1            #164 <String "2">
	//   55  120:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//   56  123:invokevirtual   #261 <Method void CheckBox.setChecked(boolean)>
		((CheckBox) (obj)).setChecked(s.contains("3"));
	//   57  126:aload           6
	//   58  128:aload_2         
	//   59  129:ldc1            #166 <String "3">
	//   60  131:invokevirtual   #155 <Method boolean String.contains(CharSequence)>
	//   61  134:invokevirtual   #261 <Method void CheckBox.setChecked(boolean)>
		((CheckBox) (context)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(((CheckBox) (context)), checkbox) {

			public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
			{
				String s1 = cj.a().c(cj.f, "0:1:");
			//    0    0:invokestatic    #34  <Method cj cj.a()>
			//    1    3:getstatic       #38  <Field String cj.f>
			//    2    6:ldc1            #40  <String "0:1:">
			//    3    8:invokevirtual   #43  <Method String cj.c(String, String)>
			//    4   11:astore_3        
				if(!flag) goto _L2; else goto _L1
			//    5   12:iload_2         
			//    6   13:ifeq            68
_L1:
				compoundbutton = ((CompoundButton) (s1.concat(a.getTag().toString())));
			//    7   16:aload_3         
			//    8   17:aload_0         
			//    9   18:getfield        #21  <Field CheckBox a>
			//   10   21:invokevirtual   #49  <Method Object CheckBox.getTag()>
			//   11   24:invokevirtual   #53  <Method String Object.toString()>
			//   12   27:invokevirtual   #59  <Method String String.concat(String)>
			//   13   30:astore_1        
_L4:
				if(((String) (compoundbutton)).contains(((CharSequence) (a.getTag().toString()))))
			//*  14   31:aload_1         
			//*  15   32:aload_0         
			//*  16   33:getfield        #21  <Field CheckBox a>
			//*  17   36:invokevirtual   #49  <Method Object CheckBox.getTag()>
			//*  18   39:invokevirtual   #53  <Method String Object.toString()>
			//*  19   42:invokevirtual   #63  <Method boolean String.contains(CharSequence)>
			//*  20   45:ifeq            56
					a.setChecked(true);
			//   21   48:aload_0         
			//   22   49:getfield        #21  <Field CheckBox a>
			//   23   52:iconst_1        
			//   24   53:invokevirtual   #67  <Method void CheckBox.setChecked(boolean)>
				cj.a().a(cj.f, ((String) (compoundbutton)));
			//   25   56:invokestatic    #34  <Method cj cj.a()>
			//   26   59:getstatic       #38  <Field String cj.f>
			//   27   62:aload_1         
			//   28   63:invokevirtual   #70  <Method boolean cj.a(String, String)>
			//   29   66:pop             
				return;
			//   30   67:return          
_L2:
				compoundbutton = ((CompoundButton) (s1));
			//   31   68:aload_3         
			//   32   69:astore_1        
				if(s1.contains(((CharSequence) (b.getTag().toString()))))
			//*  33   70:aload_3         
			//*  34   71:aload_0         
			//*  35   72:getfield        #23  <Field CheckBox b>
			//*  36   75:invokevirtual   #49  <Method Object CheckBox.getTag()>
			//*  37   78:invokevirtual   #53  <Method String Object.toString()>
			//*  38   81:invokevirtual   #63  <Method boolean String.contains(CharSequence)>
			//*  39   84:ifeq            31
					compoundbutton = ((CompoundButton) (s1.replace(((CharSequence) (a.getTag().toString())), "")));
			//   40   87:aload_3         
			//   41   88:aload_0         
			//   42   89:getfield        #21  <Field CheckBox a>
			//   43   92:invokevirtual   #49  <Method Object CheckBox.getTag()>
			//   44   95:invokevirtual   #53  <Method String Object.toString()>
			//   45   98:ldc1            #72  <String "">
			//   46  100:invokevirtual   #76  <Method String String.replace(CharSequence, CharSequence)>
			//   47  103:astore_1        
				if(true) goto _L4; else goto _L3
			//   48  104:goto            31
_L3:
			}

			final CheckBox a;
			final CheckBox b;
			final cn c;

			
			{
				c = cn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field cn c>
				a = checkbox;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CheckBox a>
				b = checkbox1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field CheckBox b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   62  137:aload_1         
	//   63  138:new             #6   <Class cn$1>
	//   64  141:dup             
	//   65  142:aload_0         
	//   66  143:aload_1         
	//   67  144:aload           4
	//   68  146:invokespecial   #264 <Method void cn$1(cn, CheckBox, CheckBox)>
	//   69  149:invokevirtual   #268 <Method void CheckBox.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		checkbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(checkbox, ((CheckBox) (context))) {

			public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
			{
				String s1 = cj.a().c(cj.f, "0:1:");
			//    0    0:invokestatic    #34  <Method cj cj.a()>
			//    1    3:getstatic       #38  <Field String cj.f>
			//    2    6:ldc1            #40  <String "0:1:">
			//    3    8:invokevirtual   #43  <Method String cj.c(String, String)>
			//    4   11:astore_3        
				if(!flag) goto _L2; else goto _L1
			//    5   12:iload_2         
			//    6   13:ifeq            68
_L1:
				compoundbutton = ((CompoundButton) (s1.concat(a.getTag().toString())));
			//    7   16:aload_3         
			//    8   17:aload_0         
			//    9   18:getfield        #21  <Field CheckBox a>
			//   10   21:invokevirtual   #49  <Method Object CheckBox.getTag()>
			//   11   24:invokevirtual   #53  <Method String Object.toString()>
			//   12   27:invokevirtual   #59  <Method String String.concat(String)>
			//   13   30:astore_1        
_L4:
				if(((String) (compoundbutton)).contains(((CharSequence) (a.getTag().toString()))))
			//*  14   31:aload_1         
			//*  15   32:aload_0         
			//*  16   33:getfield        #21  <Field CheckBox a>
			//*  17   36:invokevirtual   #49  <Method Object CheckBox.getTag()>
			//*  18   39:invokevirtual   #53  <Method String Object.toString()>
			//*  19   42:invokevirtual   #63  <Method boolean String.contains(CharSequence)>
			//*  20   45:ifeq            56
					a.setChecked(true);
			//   21   48:aload_0         
			//   22   49:getfield        #21  <Field CheckBox a>
			//   23   52:iconst_1        
			//   24   53:invokevirtual   #67  <Method void CheckBox.setChecked(boolean)>
				cj.a().a(cj.f, ((String) (compoundbutton)));
			//   25   56:invokestatic    #34  <Method cj cj.a()>
			//   26   59:getstatic       #38  <Field String cj.f>
			//   27   62:aload_1         
			//   28   63:invokevirtual   #70  <Method boolean cj.a(String, String)>
			//   29   66:pop             
				return;
			//   30   67:return          
_L2:
				compoundbutton = ((CompoundButton) (s1));
			//   31   68:aload_3         
			//   32   69:astore_1        
				if(s1.contains(((CharSequence) (b.getTag().toString()))))
			//*  33   70:aload_3         
			//*  34   71:aload_0         
			//*  35   72:getfield        #23  <Field CheckBox b>
			//*  36   75:invokevirtual   #49  <Method Object CheckBox.getTag()>
			//*  37   78:invokevirtual   #53  <Method String Object.toString()>
			//*  38   81:invokevirtual   #63  <Method boolean String.contains(CharSequence)>
			//*  39   84:ifeq            31
					compoundbutton = ((CompoundButton) (s1.replace(((CharSequence) (a.getTag().toString())), "")));
			//   40   87:aload_3         
			//   41   88:aload_0         
			//   42   89:getfield        #21  <Field CheckBox a>
			//   43   92:invokevirtual   #49  <Method Object CheckBox.getTag()>
			//   44   95:invokevirtual   #53  <Method String Object.toString()>
			//   45   98:ldc1            #72  <String "">
			//   46  100:invokevirtual   #76  <Method String String.replace(CharSequence, CharSequence)>
			//   47  103:astore_1        
				if(true) goto _L4; else goto _L3
			//   48  104:goto            31
_L3:
			}

			final CheckBox a;
			final CheckBox b;
			final cn c;

			
			{
				c = cn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field cn c>
				a = checkbox;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CheckBox a>
				b = checkbox1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field CheckBox b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   70  152:aload           4
	//   71  154:new             #8   <Class cn$2>
	//   72  157:dup             
	//   73  158:aload_0         
	//   74  159:aload           4
	//   75  161:aload_1         
	//   76  162:invokespecial   #269 <Method void cn$2(cn, CheckBox, CheckBox)>
	//   77  165:invokevirtual   #268 <Method void CheckBox.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		checkbox1.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(checkbox1) {

			public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
			{
				compoundbutton = ((CompoundButton) (cj.a().c(cj.f, "0:1:")));
			//    0    0:invokestatic    #31  <Method cj cj.a()>
			//    1    3:getstatic       #35  <Field String cj.f>
			//    2    6:ldc1            #37  <String "0:1:">
			//    3    8:invokevirtual   #41  <Method String cj.c(String, String)>
			//    4   11:astore_1        
				if(flag)
			//*   5   12:iload_2         
			//*   6   13:ifeq            43
					compoundbutton = ((CompoundButton) (((String) (compoundbutton)).concat(a.getTag().toString())));
			//    7   16:aload_1         
			//    8   17:aload_0         
			//    9   18:getfield        #20  <Field CheckBox a>
			//   10   21:invokevirtual   #47  <Method Object CheckBox.getTag()>
			//   11   24:invokevirtual   #51  <Method String Object.toString()>
			//   12   27:invokevirtual   #57  <Method String String.concat(String)>
			//   13   30:astore_1        
				else
			//*  14   31:invokestatic    #31  <Method cj cj.a()>
			//*  15   34:getstatic       #35  <Field String cj.f>
			//*  16   37:aload_1         
			//*  17   38:invokevirtual   #60  <Method boolean cj.a(String, String)>
			//*  18   41:pop             
			//*  19   42:return          
					compoundbutton = ((CompoundButton) (((String) (compoundbutton)).replace(((CharSequence) (a.getTag().toString())), "")));
			//   20   43:aload_1         
			//   21   44:aload_0         
			//   22   45:getfield        #20  <Field CheckBox a>
			//   23   48:invokevirtual   #47  <Method Object CheckBox.getTag()>
			//   24   51:invokevirtual   #51  <Method String Object.toString()>
			//   25   54:ldc1            #62  <String "">
			//   26   56:invokevirtual   #66  <Method String String.replace(CharSequence, CharSequence)>
			//   27   59:astore_1        
				cj.a().a(cj.f, ((String) (compoundbutton)));
			//*  28   60:goto            31
			}

			final CheckBox a;
			final cn b;

			
			{
				b = cn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cn b>
				a = checkbox;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field CheckBox a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   78  168:aload           5
	//   79  170:new             #10  <Class cn$3>
	//   80  173:dup             
	//   81  174:aload_0         
	//   82  175:aload           5
	//   83  177:invokespecial   #272 <Method void cn$3(cn, CheckBox)>
	//   84  180:invokevirtual   #268 <Method void CheckBox.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		((CheckBox) (obj)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(((CheckBox) (obj))) {

			public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
			{
				compoundbutton = ((CompoundButton) (cj.a().c(cj.f, "0:1:")));
			//    0    0:invokestatic    #31  <Method cj cj.a()>
			//    1    3:getstatic       #35  <Field String cj.f>
			//    2    6:ldc1            #37  <String "0:1:">
			//    3    8:invokevirtual   #41  <Method String cj.c(String, String)>
			//    4   11:astore_1        
				if(flag)
			//*   5   12:iload_2         
			//*   6   13:ifeq            43
					compoundbutton = ((CompoundButton) (((String) (compoundbutton)).concat(a.getTag().toString())));
			//    7   16:aload_1         
			//    8   17:aload_0         
			//    9   18:getfield        #20  <Field CheckBox a>
			//   10   21:invokevirtual   #47  <Method Object CheckBox.getTag()>
			//   11   24:invokevirtual   #51  <Method String Object.toString()>
			//   12   27:invokevirtual   #57  <Method String String.concat(String)>
			//   13   30:astore_1        
				else
			//*  14   31:invokestatic    #31  <Method cj cj.a()>
			//*  15   34:getstatic       #35  <Field String cj.f>
			//*  16   37:aload_1         
			//*  17   38:invokevirtual   #60  <Method boolean cj.a(String, String)>
			//*  18   41:pop             
			//*  19   42:return          
					compoundbutton = ((CompoundButton) (((String) (compoundbutton)).replace(((CharSequence) (a.getTag().toString())), "")));
			//   20   43:aload_1         
			//   21   44:aload_0         
			//   22   45:getfield        #20  <Field CheckBox a>
			//   23   48:invokevirtual   #47  <Method Object CheckBox.getTag()>
			//   24   51:invokevirtual   #51  <Method String Object.toString()>
			//   25   54:ldc1            #62  <String "">
			//   26   56:invokevirtual   #66  <Method String String.replace(CharSequence, CharSequence)>
			//   27   59:astore_1        
				cj.a().a(cj.f, ((String) (compoundbutton)));
			//*  28   60:goto            31
			}

			final CheckBox a;
			final cn b;

			
			{
				b = cn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cn b>
				a = checkbox;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field CheckBox a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   85  183:aload           6
	//   86  185:new             #12  <Class cn$4>
	//   87  188:dup             
	//   88  189:aload_0         
	//   89  190:aload           6
	//   90  192:invokespecial   #273 <Method void cn$4(cn, CheckBox)>
	//   91  195:invokevirtual   #268 <Method void CheckBox.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		builder.setTitle(0x7f0d0044);
	//   92  198:aload_3         
	//   93  199:ldc2            #274 <Int 0x7f0d0044>
	//   94  202:invokevirtual   #278 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   95  205:pop             
		builder.setNegativeButton("Ok", new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
			//    0    0:return          
			}

			final cn a;

			
			{
				a = cn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field cn a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   96  206:aload_3         
	//   97  207:ldc2            #280 <String "Ok">
	//   98  210:new             #14  <Class cn$5>
	//   99  213:dup             
	//  100  214:aload_0         
	//  101  215:invokespecial   #283 <Method void cn$5(cn)>
	//  102  218:invokevirtual   #287 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  103  221:pop             
		builder.create().show();
	//  104  222:aload_3         
	//  105  223:invokevirtual   #291 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//  106  226:invokevirtual   #296 <Method void AlertDialog.show()>
	//  107  229:return          
	}

	public void a(Context context, String s)
	{
		String s1 = "pkg";
	//    0    0:ldc2            #299 <String "pkg">
	//    1    3:astore          4
		Intent intent = new Intent();
	//    2    5:new             #301 <Class Intent>
	//    3    8:dup             
	//    4    9:invokespecial   #302 <Method void Intent()>
	//    5   12:astore          5
		int i = android.os.Build.VERSION.SDK_INT;
	//    6   14:getstatic       #307 <Field int android.os.Build$VERSION.SDK_INT>
	//    7   17:istore_3        
		if(i >= 9)
	//*   8   18:iload_3         
	//*   9   19:bipush          9
	//*  10   21:icmplt          54
		{
			intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
	//   11   24:aload           5
	//   12   26:ldc2            #309 <String "android.settings.APPLICATION_DETAILS_SETTINGS">
	//   13   29:invokevirtual   #313 <Method Intent Intent.setAction(String)>
	//   14   32:pop             
			intent.setData(Uri.fromParts("package", s, ((String) (null))));
	//   15   33:aload           5
	//   16   35:ldc2            #315 <String "package">
	//   17   38:aload_2         
	//   18   39:aconst_null     
	//   19   40:invokestatic    #321 <Method Uri Uri.fromParts(String, String, String)>
	//   20   43:invokevirtual   #325 <Method Intent Intent.setData(Uri)>
	//   21   46:pop             
		} else
	//*  22   47:aload_1         
	//*  23   48:aload           5
	//*  24   50:invokevirtual   #329 <Method void Context.startActivity(Intent)>
	//*  25   53:return          
		{
			if(i != 8)
	//*  26   54:iload_3         
	//*  27   55:bipush          8
	//*  28   57:icmpne          93
	//*  29   60:aload           5
	//*  30   62:ldc2            #331 <String "android.intent.action.VIEW">
	//*  31   65:invokevirtual   #313 <Method Intent Intent.setAction(String)>
	//*  32   68:pop             
	//*  33   69:aload           5
	//*  34   71:ldc2            #333 <String "com.android.settings">
	//*  35   74:ldc2            #335 <String "com.android.settings.InstalledAppDetails">
	//*  36   77:invokevirtual   #339 <Method Intent Intent.setClassName(String, String)>
	//*  37   80:pop             
	//*  38   81:aload           5
	//*  39   83:aload           4
	//*  40   85:aload_2         
	//*  41   86:invokevirtual   #342 <Method Intent Intent.putExtra(String, String)>
	//*  42   89:pop             
	//*  43   90:goto            47
				s1 = "com.android.settings.ApplicationPkgName";
	//   44   93:ldc2            #344 <String "com.android.settings.ApplicationPkgName">
	//   45   96:astore          4
			intent.setAction("android.intent.action.VIEW");
			intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
			intent.putExtra(s1, s);
		}
		context.startActivity(intent);
	//*  46   98:goto            60
	}

	public void a(ck ck1, Context context)
	{
		ck1 = ((ck) (ck1.e()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #76  <Method String ck.e()>
	//    2    4:astore_1        
		try
		{
			context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(((String) (ck1))).toString())));
	//    3    5:aload_2         
	//    4    6:new             #301 <Class Intent>
	//    5    9:dup             
	//    6   10:ldc2            #331 <String "android.intent.action.VIEW">
	//    7   13:new             #94  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #95  <Method void StringBuilder()>
	//   10   20:ldc2            #349 <String "market://details?id=">
	//   11   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   15   33:invokestatic    #353 <Method Uri Uri.parse(String)>
	//   16   36:invokespecial   #356 <Method void Intent(String, Uri)>
	//   17   39:invokevirtual   #329 <Method void Context.startActivity(Intent)>
			return;
	//   18   42:return          
		}
		catch(ActivityNotFoundException activitynotfoundexception)
	//*  19   43:astore_3        
		{
			context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("https://play.google.com/store/apps/details?id=").append(((String) (ck1))).toString())));
	//   20   44:aload_2         
	//   21   45:new             #301 <Class Intent>
	//   22   48:dup             
	//   23   49:ldc2            #331 <String "android.intent.action.VIEW">
	//   24   52:new             #94  <Class StringBuilder>
	//   25   55:dup             
	//   26   56:invokespecial   #95  <Method void StringBuilder()>
	//   27   59:ldc2            #358 <String "https://play.google.com/store/apps/details?id=">
	//   28   62:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   29   65:aload_1         
	//   30   66:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   31   69:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   32   72:invokestatic    #353 <Method Uri Uri.parse(String)>
	//   33   75:invokespecial   #356 <Method void Intent(String, Uri)>
	//   34   78:invokevirtual   #329 <Method void Context.startActivity(Intent)>
		}
	//   35   81:return          
	}

	public Intent b()
	{
		Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
	//    0    0:new             #301 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #361 <String "android.intent.action.SEND_MULTIPLE">
	//    3    7:invokespecial   #362 <Method void Intent(String)>
	//    4   10:astore_1        
		intent.setType("image/*");
	//    5   11:aload_1         
	//    6   12:ldc2            #364 <String "image/*">
	//    7   15:invokevirtual   #367 <Method Intent Intent.setType(String)>
	//    8   18:pop             
		intent.addFlags(0x80000);
	//    9   19:aload_1         
	//   10   20:ldc2            #368 <Int 0x80000>
	//   11   23:invokevirtual   #372 <Method Intent Intent.addFlags(int)>
	//   12   26:pop             
		return intent;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	public void b(Context context)
	{
		Dialog dialog = new Dialog(context);
	//    0    0:new             #374 <Class Dialog>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #375 <Method void Dialog(Context)>
	//    4    8:astore_2        
		dialog.requestWindowFeature(1);
	//    5    9:aload_2         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #379 <Method boolean Dialog.requestWindowFeature(int)>
	//    8   14:pop             
		dialog.setContentView(0x7f0b001b);
	//    9   15:aload_2         
	//   10   16:ldc2            #380 <Int 0x7f0b001b>
	//   11   19:invokevirtual   #384 <Method void Dialog.setContentView(int)>
		((TextView)dialog.findViewById(0x7f0900d6)).setText("4.2.9");
	//   12   22:aload_2         
	//   13   23:ldc2            #385 <Int 0x7f0900d6>
	//   14   26:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   15   29:checkcast       #388 <Class TextView>
	//   16   32:ldc2            #390 <String "4.2.9">
	//   17   35:invokevirtual   #394 <Method void TextView.setText(CharSequence)>
		((TextView)dialog.findViewById(0x7f090048)).setMovementMethod(LinkMovementMethod.getInstance());
	//   18   38:aload_2         
	//   19   39:ldc2            #395 <Int 0x7f090048>
	//   20   42:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   21   45:checkcast       #388 <Class TextView>
	//   22   48:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   23   51:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f090063)).setMovementMethod(LinkMovementMethod.getInstance());
	//   24   54:aload_2         
	//   25   55:ldc2            #406 <Int 0x7f090063>
	//   26   58:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   27   61:checkcast       #388 <Class TextView>
	//   28   64:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   29   67:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f090068)).setMovementMethod(LinkMovementMethod.getInstance());
	//   30   70:aload_2         
	//   31   71:ldc2            #407 <Int 0x7f090068>
	//   32   74:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   33   77:checkcast       #388 <Class TextView>
	//   34   80:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   35   83:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f09008a)).setMovementMethod(LinkMovementMethod.getInstance());
	//   36   86:aload_2         
	//   37   87:ldc2            #408 <Int 0x7f09008a>
	//   38   90:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   39   93:checkcast       #388 <Class TextView>
	//   40   96:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   41   99:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f0900d1)).setMovementMethod(LinkMovementMethod.getInstance());
	//   42  102:aload_2         
	//   43  103:ldc2            #409 <Int 0x7f0900d1>
	//   44  106:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   45  109:checkcast       #388 <Class TextView>
	//   46  112:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   47  115:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f090089)).setMovementMethod(LinkMovementMethod.getInstance());
	//   48  118:aload_2         
	//   49  119:ldc2            #410 <Int 0x7f090089>
	//   50  122:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   51  125:checkcast       #388 <Class TextView>
	//   52  128:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   53  131:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f0900b1)).setMovementMethod(LinkMovementMethod.getInstance());
	//   54  134:aload_2         
	//   55  135:ldc2            #411 <Int 0x7f0900b1>
	//   56  138:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   57  141:checkcast       #388 <Class TextView>
	//   58  144:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   59  147:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f090066)).setMovementMethod(LinkMovementMethod.getInstance());
	//   60  150:aload_2         
	//   61  151:ldc2            #412 <Int 0x7f090066>
	//   62  154:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   63  157:checkcast       #388 <Class TextView>
	//   64  160:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   65  163:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f0900bc)).setMovementMethod(LinkMovementMethod.getInstance());
	//   66  166:aload_2         
	//   67  167:ldc2            #413 <Int 0x7f0900bc>
	//   68  170:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   69  173:checkcast       #388 <Class TextView>
	//   70  176:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   71  179:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f09005d)).setMovementMethod(LinkMovementMethod.getInstance());
	//   72  182:aload_2         
	//   73  183:ldc2            #414 <Int 0x7f09005d>
	//   74  186:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   75  189:checkcast       #388 <Class TextView>
	//   76  192:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   77  195:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f09006b)).setMovementMethod(LinkMovementMethod.getInstance());
	//   78  198:aload_2         
	//   79  199:ldc2            #415 <Int 0x7f09006b>
	//   80  202:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   81  205:checkcast       #388 <Class TextView>
	//   82  208:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   83  211:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f09005c)).setMovementMethod(LinkMovementMethod.getInstance());
	//   84  214:aload_2         
	//   85  215:ldc2            #416 <Int 0x7f09005c>
	//   86  218:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   87  221:checkcast       #388 <Class TextView>
	//   88  224:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   89  227:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f090092)).setMovementMethod(LinkMovementMethod.getInstance());
	//   90  230:aload_2         
	//   91  231:ldc2            #417 <Int 0x7f090092>
	//   92  234:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   93  237:checkcast       #388 <Class TextView>
	//   94  240:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   95  243:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f09007c)).setMovementMethod(LinkMovementMethod.getInstance());
	//   96  246:aload_2         
	//   97  247:ldc2            #418 <Int 0x7f09007c>
	//   98  250:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//   99  253:checkcast       #388 <Class TextView>
	//  100  256:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//  101  259:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f090028)).setMovementMethod(LinkMovementMethod.getInstance());
	//  102  262:aload_2         
	//  103  263:ldc2            #419 <Int 0x7f090028>
	//  104  266:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//  105  269:checkcast       #388 <Class TextView>
	//  106  272:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//  107  275:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView)dialog.findViewById(0x7f090031)).setMovementMethod(LinkMovementMethod.getInstance());
	//  108  278:aload_2         
	//  109  279:ldc2            #420 <Int 0x7f090031>
	//  110  282:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//  111  285:checkcast       #388 <Class TextView>
	//  112  288:invokestatic    #401 <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//  113  291:invokevirtual   #405 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((Button)dialog.findViewById(0x7f09003b)).setOnClickListener(new android.view.View.OnClickListener(context) {

			public void onClick(View view)
			{
				view = ((View) (new Intent("android.intent.action.SENDTO")));
			//    0    0:new             #28  <Class Intent>
			//    1    3:dup             
			//    2    4:ldc1            #30  <String "android.intent.action.SENDTO">
			//    3    6:invokespecial   #33  <Method void Intent(String)>
			//    4    9:astore_1        
				((Intent) (view)).setType("message/rfc822");
			//    5   10:aload_1         
			//    6   11:ldc1            #35  <String "message/rfc822">
			//    7   13:invokevirtual   #39  <Method Intent Intent.setType(String)>
			//    8   16:pop             
				((Intent) (view)).setData(Uri.parse((new StringBuilder()).append("mailto:").append("cholkerprasad@gmail.com").toString()));
			//    9   17:aload_1         
			//   10   18:new             #41  <Class StringBuilder>
			//   11   21:dup             
			//   12   22:invokespecial   #42  <Method void StringBuilder()>
			//   13   25:ldc1            #44  <String "mailto:">
			//   14   27:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   15   30:ldc1            #50  <String "cholkerprasad@gmail.com">
			//   16   32:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   17   35:invokevirtual   #54  <Method String StringBuilder.toString()>
			//   18   38:invokestatic    #60  <Method Uri Uri.parse(String)>
			//   19   41:invokevirtual   #64  <Method Intent Intent.setData(Uri)>
			//   20   44:pop             
				a.startActivity(Intent.createChooser(((Intent) (view)), "Send mail..."));
			//   21   45:aload_0         
			//   22   46:getfield        #20  <Field Context a>
			//   23   49:aload_1         
			//   24   50:ldc1            #66  <String "Send mail...">
			//   25   52:invokestatic    #70  <Method Intent Intent.createChooser(Intent, CharSequence)>
			//   26   55:invokevirtual   #76  <Method void Context.startActivity(Intent)>
			//   27   58:return          
			}

			final Context a;
			final cn b;

			
			{
				b = cn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cn b>
				a = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Context a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  114  294:aload_2         
	//  115  295:ldc2            #421 <Int 0x7f09003b>
	//  116  298:invokevirtual   #386 <Method View Dialog.findViewById(int)>
	//  117  301:checkcast       #423 <Class Button>
	//  118  304:new             #16  <Class cn$6>
	//  119  307:dup             
	//  120  308:aload_0         
	//  121  309:aload_1         
	//  122  310:invokespecial   #426 <Method void cn$6(cn, Context)>
	//  123  313:invokevirtual   #430 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		dialog.show();
	//  124  316:aload_2         
	//  125  317:invokevirtual   #431 <Method void Dialog.show()>
	//  126  320:return          
	}

	public void b(Context context, String s)
	{
		Intent intent = b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #433 <Method Intent b()>
	//    2    4:astore_3        
		s = ((String) (FileProvider.getUriForFile(context, (new StringBuilder()).append(context.getApplicationContext().getPackageName()).append(".provider").toString(), new File(s))));
	//    3    5:aload_1         
	//    4    6:new             #94  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #95  <Method void StringBuilder()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #437 <Method Context Context.getApplicationContext()>
	//    9   17:invokevirtual   #440 <Method String Context.getPackageName()>
	//   10   20:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:ldc2            #442 <String ".provider">
	//   12   26:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   14   32:new             #128 <Class File>
	//   15   35:dup             
	//   16   36:aload_2         
	//   17   37:invokespecial   #131 <Method void File(String)>
	//   18   40:invokestatic    #448 <Method Uri FileProvider.getUriForFile(Context, String, File)>
	//   19   43:astore_2        
		ArrayList arraylist = new ArrayList();
	//   20   44:new             #450 <Class ArrayList>
	//   21   47:dup             
	//   22   48:invokespecial   #451 <Method void ArrayList()>
	//   23   51:astore          4
		arraylist.add(((Object) (s)));
	//   24   53:aload           4
	//   25   55:aload_2         
	//   26   56:invokevirtual   #455 <Method boolean ArrayList.add(Object)>
	//   27   59:pop             
		intent.putExtra("android.intent.extra.STREAM", ((java.io.Serializable) (arraylist)));
	//   28   60:aload_3         
	//   29   61:ldc2            #457 <String "android.intent.extra.STREAM">
	//   30   64:aload           4
	//   31   66:invokevirtual   #460 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   32   69:pop             
		context.startActivity(Intent.createChooser(intent, ((CharSequence) (context.getResources().getString(0x7f0d006b)))));
	//   33   70:aload_1         
	//   34   71:aload_3         
	//   35   72:aload_1         
	//   36   73:invokevirtual   #39  <Method Resources Context.getResources()>
	//   37   76:ldc2            #461 <Int 0x7f0d006b>
	//   38   79:invokevirtual   #44  <Method String Resources.getString(int)>
	//   39   82:invokestatic    #465 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   40   85:invokevirtual   #329 <Method void Context.startActivity(Intent)>
	//   41   88:return          
	}

	public void b(ck ck1, Context context)
	{
		ck1 = ((ck) (ck1.e()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #76  <Method String ck.e()>
	//    2    4:astore_1        
		ck1 = ((ck) (context.getPackageManager().getLaunchIntentForPackage(((String) (ck1)))));
	//    3    5:aload_2         
	//    4    6:invokevirtual   #80  <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #468 <Method Intent PackageManager.getLaunchIntentForPackage(String)>
	//    7   13:astore_1        
		if(ck1 != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          31
		{
			((Intent) (ck1)).addFlags(0x10000000);
	//   10   18:aload_1         
	//   11   19:ldc2            #469 <Int 0x10000000>
	//   12   22:invokevirtual   #372 <Method Intent Intent.addFlags(int)>
	//   13   25:pop             
			context.startActivity(((Intent) (ck1)));
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #329 <Method void Context.startActivity(Intent)>
		}
	//   17   31:return          
	}

	public boolean c()
	{
		return cj.a().b(cj.g, false);
	//    0    0:invokestatic    #136 <Method cj cj.a()>
	//    1    3:getstatic       #472 <Field String cj.g>
	//    2    6:iconst_0        
	//    3    7:invokevirtual   #475 <Method boolean cj.b(String, boolean)>
	//    4   10:ireturn         
	}

	private static cn a;
}
